package com.ysl.javawebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaWebsocketApplication {

    /**
     * 启动后访问：http://www.websocket-test.com/
     * <br/>
     * ws://your_ip:8080/hello
     */
    public static void main(String[] args) {
        SpringApplication.run(JavaWebsocketApplication.class, args);
    }

}
