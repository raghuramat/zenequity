package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by raghuramat on 03/01/17.
 */
@Path("/greetings/{name}")

public class HelloWorldController
{
    @GET
    public String getGreeting(@PathParam("name") String name)
    {
        return "Hello : " + name;
    }
}
