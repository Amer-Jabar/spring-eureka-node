package Nodes.NodeBeta;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {

    @GetMapping("/api")
    public Response getApi() {
        return new Response("Amer", new Random().nextInt(10));
    }

    @GetMapping("/api2")
    public String getApi2() {
        return "Hello bro";
    }
    
}


class Response {
    String message;
    int id;
    public Response(String message, int id) {
        this.id = id;
        this.message = message;
    }
}