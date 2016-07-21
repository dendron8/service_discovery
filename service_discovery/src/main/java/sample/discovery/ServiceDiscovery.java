package sample.discovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //spring boot, auto config, and external variables (use @Value)
@EnableEurekaServer
public class ServiceDiscovery {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceDiscovery.class, args);
	}

}
