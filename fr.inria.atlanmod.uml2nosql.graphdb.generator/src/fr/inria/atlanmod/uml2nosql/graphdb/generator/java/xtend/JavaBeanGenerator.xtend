package fr.inria.atlanmod.uml2nosql.graphdb.generator.java.xtend

import org.eclipse.xtext.generator.IGenerator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.uml2.uml.Class

class JavaBeanGenerator implements IGenerator {
	
	/**
	 * Generate Java beans for UML entities (regardless the actual mapping
	 * to low-level representation of these entities)
	 */
	override doGenerate(Resource umlModel, IFileSystemAccess fsa) {
		println(fsa.toString)
		umlModel.allContents.filter[o | o instanceof Class].map[o | o as Class].
		forEach[
			cc | fsa.generateFile((cc as Class).name + ".java", '''
				class «cc.name» {
					// This is a comment
				}
			'''
		)]
	}
	
}
