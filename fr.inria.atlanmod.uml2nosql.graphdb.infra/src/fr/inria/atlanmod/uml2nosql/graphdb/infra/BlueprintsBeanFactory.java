package fr.inria.atlanmod.uml2nosql.graphdb.infra;

public class BlueprintsBeanFactory {

	protected BlueprintsDatabase db = null;
	
	public BlueprintsBeanFactory(BlueprintsDatabase db) {
		this.db = db;
	}
	
}
