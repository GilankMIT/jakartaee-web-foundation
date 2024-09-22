/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package web.foundation.base;

import id.gilangprambudi.web.foundation.service.core.model.WebUser;
import jakarta.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;
import service.UserService;

import java.io.File;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: TestBase.java, v 0.1 2024‐09‐20 07.19 gilang.prambudi Exp $$
 */

@RunWith(Arquillian.class)
public class TestBase {

    @Deployment
    public static WebArchive createDeployment() {

        File[] files = Maven.resolver().loadPomFromFile("pom.xml")
                .importRuntimeAndTestDependencies()
                .resolve()
                .withTransitivity()
                .asFile();

        WebArchive war = ShrinkWrap.create(WebArchive.class)
                .addPackages(true, "web.foundation")
                .addAsResource("META-INF/beans.xml", "META-INF/beans.xml")
                .addAsLibraries(files)
                .addAsResource("import.sql")
                .addAsResource("logback.xml")
                .addAsResource("META-INF/jboss-web.xml")
                .addAsResource("META-INF/jboss-deployment-structure.xml")
                .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml");
        System.out.println(war.toString(true));
        return war;

    }

    @Inject
    UserService userService;


    @Test
    public void testUserService(){
        WebUser user = userService.getUser();
        System.out.println(user.getUsername());
        System.out.println(userService.getAllUser());
    }

}