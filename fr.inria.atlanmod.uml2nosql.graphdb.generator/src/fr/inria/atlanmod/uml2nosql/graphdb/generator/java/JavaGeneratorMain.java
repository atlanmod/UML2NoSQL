package fr.inria.atlanmod.uml2nosql.graphdb.generator.java;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class JavaGeneratorMain {

	private static Injector injector = Guice.createInjector(new EcoreGeneratorModule());
	
	public static void main(String[] args) {
		String input = "model/model.uml";
		String output = "../fr.inria.atlanmod.uml2nosql.graphdb.generated/src";
		
//		IProgressMonitor progressMonitor = new NullProgressMonitor();
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		IProject project = root.getProject("fr.inria.atlanmod.uml2nosql.graphdb.generated");
//		try {
//			project.create(progressMonitor);
//			project.open(progressMonitor);
//		} catch (CoreException e) {
//			System.out.println("Unable to create the project " + "fr.inria.atlanmod.uml2nosql.graphdb.generated");
//			e.printStackTrace();
//		}
		
		Generator generator = injector.getInstance(Generator.class);
		generator.runGenerator(input, output);
	}

}
