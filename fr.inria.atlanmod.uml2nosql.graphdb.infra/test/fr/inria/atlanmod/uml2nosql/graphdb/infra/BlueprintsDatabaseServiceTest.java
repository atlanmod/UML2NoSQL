package fr.inria.atlanmod.uml2nosql.graphdb.infra;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class BlueprintsDatabaseServiceTest {

	private BlueprintsDatabaseService service;
	
	@Before
	public void setUp() {
		service = new BlueprintsDatabaseService();
	}
	
	@Test
	public void testCreateDatabase() {
		service.createDatabase(new File("/home/gdaniel/Documents/Research/UML2NoSQL/fr.inria.atlanmod.uml2nosql.graphdb.infra/db/dbTest"));
	}

}
