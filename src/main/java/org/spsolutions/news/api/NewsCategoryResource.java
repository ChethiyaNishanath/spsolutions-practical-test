package org.spsolutions.news.api;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("news-category")
public class NewsCategoryResource {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getAllNewsCategories() {
        return Response.ok().build();
    }

}
