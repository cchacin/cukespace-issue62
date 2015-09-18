package com.cchacin.cukespace.issue62;

import cucumber.runtime.arquillian.ArquillianCucumber;
import cucumber.runtime.arquillian.api.Features;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;

@Features({"features/sample.feature"})
@RunWith(ArquillianCucumber.class)
public class RestfulSuccessTest {

    @Deployment(testable = false)
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test-app.war")
                .addPackage(App.class.getPackage());

    }
}
