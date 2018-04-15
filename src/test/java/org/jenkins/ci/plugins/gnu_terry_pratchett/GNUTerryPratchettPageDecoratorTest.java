package org.jenkins.ci.plugins.gnu_terry_pratchett;

import com.gargoylesoftware.htmlunit.html.HtmlForm;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

public class GNUTerryPratchettPageDecoratorTest {

    @Rule
    public JenkinsRule r = new JenkinsRule();

    @LocalData
    @Test
    public void configuration() throws Exception {
        Assert.assertEquals("GNU Terry Pratchett", r.createWebClient().goTo("").getWebResponse().getResponseHeaderValue("X-Clacks-Overhead"));
    }
}
