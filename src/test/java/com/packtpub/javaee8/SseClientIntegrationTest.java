package com.packtpub.javaee8;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SseClientIntegrationTest {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    private Client client;
    private WebTarget webTarget;

    @Before
    public void setUp() {
        client = ClientBuilder.newBuilder()
                .connectTimeout(5, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS)
                .build();

        webTarget = client.target("http://localhost:8080").path("/sse-service/api");
    }

    @After
    public void tearDown() {
        client.close();
    }

    @Test
    public void receiveSse() throws Exception {
        // TODO implement me
    }
}
