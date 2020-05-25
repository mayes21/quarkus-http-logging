package dev.quarkus;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Logging
@Provider
public class RequestLoggingFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) {
        System.out.println("URI : " + requestContext.getUriInfo().getAbsolutePath());
        System.out.println("METHOD : " + requestContext.getMethod());
    }
}
