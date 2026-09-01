package org.spsolutions.news.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.spsolutions.news.domain.News;
import org.spsolutions.news.service.INewsService;

import java.util.List;

@Path("news")
public class NewsResource {

    private final INewsService newsService;

    @Inject
    public NewsResource(INewsService newsService) {
        this.newsService = newsService;
    }

    @GET
    @Path("/category/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getNewsByCategory(@PathParam("id") int categoryId) {
        List<News> newsByCategoryId =  this.newsService.getNewsByCategory(categoryId);
        return Response.ok().entity(newsByCategoryId).build();
    }

    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getNewsById(@PathParam("id") int id) {
        News news = this.newsService.getNewsById(id);
        return Response.ok().entity(news).build();
    }

}
