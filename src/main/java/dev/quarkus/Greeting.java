package dev.quarkus;

import dev.quarkus.config.Logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Greeting {

    private final Logger log = LoggerFactory.getLogger(Greeting.class);

    @Logging
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.info("---- GREETING ----");
        return "hello world !";
    }
}
