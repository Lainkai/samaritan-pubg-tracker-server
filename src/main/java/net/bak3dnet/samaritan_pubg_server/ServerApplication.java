package net.bak3dnet.samaritan_pubg_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        MatchLookupService.apiKey = args[0];
        SpringApplication.run(ServerApplication.class, args);
    }

}