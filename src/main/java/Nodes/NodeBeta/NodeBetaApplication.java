package Nodes.NodeBeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NodeBetaApplication {    
    public static void main(String[] args) {
        SpringApplication.run(NodeBetaApplication.class, args);
    }
}
