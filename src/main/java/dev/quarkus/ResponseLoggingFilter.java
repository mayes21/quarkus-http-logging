package dev.quarkus;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Logging
@Provider
public class ResponseLoggingFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) {
        System.out.println("MEDIA TYPE : " + responseContext.getMediaType());
        System.out.println("STATUS CODE : " + responseContext.getStatus());
        System.out.println("STATUS TYPE : " + responseContext.getStatusInfo().toString());
        System.out.println("RESPONSE ENTITY : " + responseContext.getEntity());

    }
}
