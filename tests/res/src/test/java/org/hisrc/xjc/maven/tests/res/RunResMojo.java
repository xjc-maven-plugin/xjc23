package org.hisrc.xjc.maven.tests.res;

import java.io.File;

import org.hisrc.xjc.maven.AbstractXJC2Mojo;
import org.hisrc.xjc.maven.DependencyResource;
import org.hisrc.xjc.maven.ResourceEntry;
import org.hisrc.xjc.maven.test.RunXJC2Mojo;

public class RunResMojo extends RunXJC2Mojo {

	@Override
	protected void configureMojo(AbstractXJC2Mojo mojo) {
		super.configureMojo(mojo);
		
		mojo.setCatalog(new File(getBaseDir(),"src/main/jaxb/catalog.cat"));
		mojo.setExtension(true);
		final ResourceEntry purchaseorder_xsd = new ResourceEntry();
		final DependencyResource purchaseorder_xsd_dependencyResource = new DependencyResource();
		purchaseorder_xsd.setDependencyResource(purchaseorder_xsd_dependencyResource);
		purchaseorder_xsd.getDependencyResource().setGroupId("org.hisrc.xjc");
		purchaseorder_xsd.getDependencyResource().setArtifactId("xjc23-maven-plugin-tests-po");
		purchaseorder_xsd.getDependencyResource().setResource("purchaseorder.xsd");
		mojo.setSchemas(new ResourceEntry[]{
				purchaseorder_xsd
				
		});
//		mojo.
//
//		final ResourceEntry a_xsd = new ResourceEntry();
//		a_xsd.setUrl("http://www.ab.org/a.xsd");
//		mojo.setStrict(false);
//		mojo.setSchemaIncludes(new String[] {});
//		mojo.setSchemas(new ResourceEntry[] { a_xsd });
//		mojo.setCatalog(new File(getBaseDir(), "src/main/resources/catalog.cat"));
		mojo.setForceRegenerate(true);
	}

}
