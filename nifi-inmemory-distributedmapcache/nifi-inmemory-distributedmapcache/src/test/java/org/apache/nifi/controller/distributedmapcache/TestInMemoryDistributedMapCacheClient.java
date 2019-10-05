package org.apache.nifi.controller.distributedmapcache;

import org.apache.nifi.reporting.InitializationException;
import org.apache.nifi.util.TestRunner;
import org.apache.nifi.util.TestRunners;
import org.junit.Before;
import org.junit.Test;

public class TestInMemoryDistributedMapCacheClient {

    @Before
    public void init() {

    }

    @Test
    public void testService() throws InitializationException {
        final TestRunner runner = TestRunners.newTestRunner(TestProcessor.class);
        final InMemoryDistributedMapCacheClient service = new InMemoryDistributedMapCacheClient();
        runner.addControllerService("test-good", service);

        runner.setProperty(service, InMemoryDistributedMapCacheClient.MY_PROPERTY, "test-value");
        runner.enableControllerService(service);

        runner.assertValid(service);
    }

}
