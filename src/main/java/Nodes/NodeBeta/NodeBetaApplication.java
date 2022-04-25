package Nodes.NodeBeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// The following annotation @Enable... gives the nodes the ability to auto-register to the
// remote Eureka server found on the host.
@SpringBootApplication
@EnableDiscoveryClient
public class NodeBetaApplication {    
    public static void main(String[] args) {
        SpringApplication.run(NodeBetaApplication.class, args);
    }
}
