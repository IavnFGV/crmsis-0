package dti.crmsis;

import dti.crmsis.dto.v1.PayloadV1;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1")
public class Version1 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.getClass().getSimpleName()+" says hello";
    }


    @POST
    @Path(("/{entity}"))
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processUpdate(@PathParam("entity") String entity, PayloadV1 payload){
        String responseMessage = "Received param: " + entity + ", Data: " + payload.toString();
        return Response.ok().build();
    }

    @POST
    @Path(("/{customerId}"))
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processUpdate(@PathParam("entity") String entity, PayloadV1 payload){
        String responseMessage = "Received param: " + entity + ", Data: " + payload.toString();
        return Response.ok().build();
    }


    @POST
    @Path("/{customerId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response processRawRequest(@PathParam("customerId") String customerId, String jsonBody) {


        // Логика обработки запроса
        System.out.println("URL Parameter: " + param);
        System.out.println("Request Body: " + jsonBody);

        // Пример формирования ответа
        String response = String.format("{\"receivedParam\": \"%s\", \"receivedBody\": %s}", param, jsonBody);

        return Response.ok(response, MediaType.APPLICATION_JSON).build();
    }


}
