package com.packtpub.javaee8;

import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.sse.OutboundSseEvent;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;
import java.io.IOException;
import java.time.LocalDateTime;

@ApplicationScoped
@Path("events")
public class EventsResource {

    // TODO implement open event stream

    // TODO implement send events

    // TODO implement close event stream


    @JsonbPropertyOrder({"time", "message"})
    public static class JsonbSseEvent {
        String message;

        LocalDateTime today = LocalDateTime.now();

        public JsonbSseEvent(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public LocalDateTime getToday() {
            return today;
        }

        public void setToday(LocalDateTime today) {
            this.today = today;
        }
    }
}
