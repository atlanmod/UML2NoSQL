package fr.inria.atlanmod.uml2nosql.graphdb.infra;

import java.util.List;

import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

public class BlueprintsDatabase {

	private Graph graph;
	
	public BlueprintsDatabase(Graph baseGraph) {
		this.graph = baseGraph;
	}
	
	public Vertex createVertex(String label) {
		Vertex v = graph.addVertex(label);
		return v;
	}
	
	public List<Vertex> getVerticesWithLabel(String label) {
		return graph.traversal().V().hasLabel(label).toList();
	}
	
}
