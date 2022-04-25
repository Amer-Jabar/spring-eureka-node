package Nodes.NodeBeta;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api")
    public Response getApi() {
        return new Response("Amer", new Random().nextInt(10));
    }
    
}
