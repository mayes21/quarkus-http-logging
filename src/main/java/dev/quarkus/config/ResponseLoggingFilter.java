package dev.quarkus.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Logging
@Provider
public class ResponseLoggingFilter implements ContainerResponseFilter {

    private final Logger log = LoggerFactory.getLogger(ResponseLoggingFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) {
        if (log.isTraceEnabled()) {
            log.trace(String.format("MEDIA TYPE : %s",  responseContext.getMediaType()));
            log.trace(String.format("STATUS CODE : %s", responseContext.getStatus()));
            log.trace(String.format("STATUS TYPE : %s", responseContext.getStatusInfo().toString()));
            log.trace(String.format("RESPONSE ENTITY : %S", responseContext.getEntity()));
        }
    }
}
