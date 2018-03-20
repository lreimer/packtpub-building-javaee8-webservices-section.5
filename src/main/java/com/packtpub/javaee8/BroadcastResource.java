package com.packtpub.javaee8;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.sse.OutboundSseEvent;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseBroadcaster;
import javax.ws.rs.sse.SseEventSink;

@ApplicationScoped
@Path("broadcast")
public class BroadcastResource {

    // TODO inject SSE context

    // TODO initialize new SSE broadcaster

    // TODO register event sink with broadcaster

    // TODO broadcast message as SSE event

}
