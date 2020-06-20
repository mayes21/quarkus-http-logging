package dev.quarkus.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Logging
@Provider
public class RequestLoggingFilter implements ContainerRequestFilter {

    private final Logger log = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext) {
        if (log.isTraceEnabled()) {
            log.trace(String.format("URI : %s", requestContext.getUriInfo().getAbsolutePath()));
            log.trace(String.format("METHOD : %s", requestContext.getMethod()));
        }
    }
}
