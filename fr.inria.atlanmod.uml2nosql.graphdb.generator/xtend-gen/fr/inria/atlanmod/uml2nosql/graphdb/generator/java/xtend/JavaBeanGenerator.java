package fr.inria.atlanmod.uml2nosql.graphdb.generator.java.xtend;

import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class JavaBeanGenerator implements IGenerator {
  /**
   * Generate Java beans for UML entities (regardless the actual mapping
   * to low-level representation of these entities)
   */
  @Override
  public void doGenerate(final Resource umlModel, final IFileSystemAccess fsa) {
    String _string = fsa.toString();
    InputOutput.<String>println(_string);
    TreeIterator<EObject> _allContents = umlModel.getAllContents();
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      @Override
      public Boolean apply(final EObject o) {
        return Boolean.valueOf((o instanceof org.eclipse.uml2.uml.Class));
      }
    };
    Iterator<EObject> _filter = IteratorExtensions.<EObject>filter(_allContents, _function);
    final Function1<EObject, org.eclipse.uml2.uml.Class> _function_1 = new Function1<EObject, org.eclipse.uml2.uml.Class>() {
      @Override
      public org.eclipse.uml2.uml.Class apply(final EObject o) {
        return ((org.eclipse.uml2.uml.Class) o);
      }
    };
    Iterator<org.eclipse.uml2.uml.Class> _map = IteratorExtensions.<EObject, org.eclipse.uml2.uml.Class>map(_filter, _function_1);
    final Procedure1<org.eclipse.uml2.uml.Class> _function_2 = new Procedure1<org.eclipse.uml2.uml.Class>() {
      @Override
      public void apply(final org.eclipse.uml2.uml.Class cc) {
        String _name = ((org.eclipse.uml2.uml.Class) cc).getName();
        String _plus = (_name + ".java");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("class ");
        String _name_1 = cc.getName();
        _builder.append(_name_1, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// This is a comment");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        fsa.generateFile(_plus, _builder);
      }
    };
    IteratorExtensions.<org.eclipse.uml2.uml.Class>forEach(_map, _function_2);
  }
}
