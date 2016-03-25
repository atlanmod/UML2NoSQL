package fr.inria.atlanmod.uml2nosql.graphdb.infra;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.util.GraphFactory;

public class BlueprintsDatabaseService {

	protected BlueprintsDatabase db = null;
	protected BlueprintsBeanFactory factory = null;
	
	// TODO create an interface that define global db service methods
	public BlueprintsDatabase createDatabase(File file) {
		return getOrCreateDatabase(file);
	}
	
	// TODO create an interface that define global db service methods
	public BlueprintsDatabase openDatabase(File file) {
		return getOrCreateDatabase(file);
	}
	
	// TODO create an interface that define global db service methods
	public BlueprintsBeanFactory getFactory() {
		return factory;
	}
	
	protected BlueprintsDatabase getOrCreateDatabase(File file) {
		Map<String,String> config = new HashMap<String, String>();
		config.put("gremlin.graph", "org.apache.tinkerpop.gremlin.neo4j.structure.Neo4jGraph");
		config.put("gremlin.neo4j.directory", file.getAbsolutePath());
		try {
			Graph baseGraph = GraphFactory.open(config);
			db = new BlueprintsDatabase(baseGraph);
		} catch(Exception e) {
			e.printStackTrace();
		}
		// Should be generated to create the factory
		return db;
	}
	
}
