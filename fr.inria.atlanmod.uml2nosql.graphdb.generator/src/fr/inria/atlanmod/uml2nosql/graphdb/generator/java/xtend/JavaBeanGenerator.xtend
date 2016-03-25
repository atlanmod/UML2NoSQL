package fr.inria.atlanmod.uml2nosql.graphdb.generator.java.xtend

import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Property
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.uml2.uml.Association

class JavaBeanGenerator implements IGenerator {
	
	private static String pName = "My"
	
	Map<String,String> primitiveTypeToJavaTypeMapping
	Map<String,String> javaTypeToImportMapping
	
	new() {
		primitiveTypeToJavaTypeMapping = new HashMap<String,String>()
		primitiveTypeToJavaTypeMapping.put("String", "String")
		primitiveTypeToJavaTypeMapping.put("Integer","Integer")
		primitiveTypeToJavaTypeMapping.put("Boolean","Boolean")
		primitiveTypeToJavaTypeMapping.put("Date","Date")
		
		javaTypeToImportMapping = new HashMap<String,String>()
		javaTypeToImportMapping.put("String","java.lang.String")
		javaTypeToImportMapping.put("Integer","java.lang.Integer")
		javaTypeToImportMapping.put("Boolean","java.lang.Boolean")
		javaTypeToImportMapping.put("Date","java.util.Date")
	}
	
	/**
	 * Generate Java beans for UML entities (regardless the actual mapping
	 * to low-level representation of these entities)
	 */
	override doGenerate(Resource umlModel, IFileSystemAccess fsa) {
		val List<Class> classList = umlModel.allContents.filter[o | o instanceof Class && !(o instanceof Association)].map[o | o as Class].toList
		classList.forEach[
			cc | fsa.generateFile((cc as Class).name + ".java", '''
			import fr.inria.atlanmod.uml2nosql.graphdb.infra.BlueprintsDatabase;
			import org.apache.tinkerpop.gremlin.structure.Vertex;
			«FOR imp : cc.getImports()»
				import «imp»;
			«ENDFOR»
			
			public «IF (cc.abstract)»abstract«ENDIF» class «cc.name» «IF (cc.superClasses.empty)»extends BlueprintsBean«ELSE»extends «cc.superClasses.get(0).name»«ENDIF» {
				
				«FOR att : cc.attributes»
					«IF cc.abstract»
					protected «att.type.name» «att.name»;
					«ELSE»
					private «att.type.name» «att.name»;
					«ENDIF»
				«ENDFOR»
				
				public «cc.name»(Vertex v, BlueprintsDatabase db) {
					super(v, db);
				}
				
				«FOR att : cc.attributes»
				public «att.javaTypeFromAttribute» get«att.name.toFirstUpper»() {
					return «att.name»;
				}
				
				public void set«att.name.toFirstUpper»(«att.javaTypeFromAttribute» new«att.name.toFirstUpper») {
					«att.name» = new«att.name.toFirstUpper»;
				}
				«ENDFOR»
			}
			'''
		)]
		fsa.generateFile(pName + "Factory.java", '''
		import fr.inria.atlanmod.uml2nosql.graphdb.infra.BlueprintsBeanFactory;
		import fr.inria.atlanmod.uml2nosql.graphdb.infra.BlueprintsDatabase;
		
		public class «pName»Factory extends BlueprintsBeanFactory {
			
			public «pName»Factory(BlueprintsDatabase db) {
				super(db);
			}
			
			«FOR cl : classList»
			public «cl.name» create«cl.name»() {
				return new «cl.name»(db.createVertex("«cl.name»"),db);
			}
			
			«ENDFOR»
		}
		''')
	}
	
	def String getJavaTypeFromAttribute(Property umlProp) {
		primitiveTypeToJavaTypeMapping.get(umlProp.type.name)
	}
	
	def Collection<String> getImports(Class umlClass) {
		val Set<String> imports = new HashSet<String>();
		// Find if the class needs to import BlueprintBean object
		if(umlClass.superClasses.empty) {
			imports.add("fr.inria.atlanmod.uml2nosql.graphdb.infra.BlueprintsBean");
		}
		umlClass.attributes.map[javaTypeFromAttribute].
		forEach[
			jType | 
			if(javaTypeToImportMapping.containsKey(jType)) {
				imports.add(javaTypeToImportMapping.get(jType))
			}
			else {
				println("Unknown Type : " + jType)
			}
		]
		return imports
	}
	
}
