# Spring Eureka Node - Client

### This is the Client/Node implementation of the Netflix's Eureka Server.

#### Notes On The Client:
#### 1.The application should be annotated with @EnableDiscoveryClient in order for it to register itself to the server.
#### 2.If the Node/Client is returning any data, it should be as a type that other Node/Client's can access it (the jackson library should be able to serialize it).

### Example of Steps:
#### 1.You create the server.
#### 2.Fire up instances that take up random ports but have the same name (say payment-service).
#### 3.Use a @LoadBalance'd RestTemplate to fetch data from the server.
#### 4.The server looks up the instances based on the given URL ('http://payment-service/api').
#### 5.Retrevies the data and casts it to what you decide (better be the same data type as the one in the publisher Node/Client).

