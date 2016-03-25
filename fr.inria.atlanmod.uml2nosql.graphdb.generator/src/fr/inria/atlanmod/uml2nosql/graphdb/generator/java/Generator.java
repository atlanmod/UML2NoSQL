package fr.inria.atlanmod.uml2nosql.graphdb.generator.java;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Generator {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	@Inject
	private IGenerator generator;
	@Inject
	private JavaIoFileSystemAccess fileAccess;
	
	public void runGenerator(String inputURI, String outputURI) {
		UMLPackage.eINSTANCE.eClass();
		
		ResourceSet rSet = resourceSetProvider.get();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
		System.out.println("Getting UML Resource with URI " + URI.createURI(inputURI).toString());
		
		Resource resource = rSet.createResource(URI.createURI(inputURI));
		
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println(resource.getContents().get(0));
		
		runGenerator(resource, outputURI);
	}
	
	public void runGenerator(Resource resource, String outputURI) {
		fileAccess.setOutputPath(outputURI);
		generator.doGenerate(resource, fileAccess);
		
		System.out.println("Code Generation Finished");
	}
}
