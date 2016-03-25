package fr.inria.atlanmod.uml2nosql.graphdb.infra;

import org.apache.tinkerpop.gremlin.structure.Vertex;

public abstract class BlueprintsBean {

	protected Vertex vertex;
	protected BlueprintsDatabase db;
	
	public BlueprintsBean(Vertex v, BlueprintsDatabase db) {
		this.db = db;
	}
	
}
