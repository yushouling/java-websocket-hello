# java-websocket-hello
**java 实现websocket的两种方式:**

* 一种使用tomcat的websocket实现：
  核心类：javax.websocket.server.ServerEndpoint;   
  核心注解：@ServerEndpoint("/hello")   
  重写核心方法：onOpen(), onMessage()  
  
* 另一种使用spring的websocket：  
  实现核心接口：org.springframework.web.socket.config.annotation.WebSocketConfigurer;   
  核心注解：@EnableWebSocket  
  继承核心类：org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor  
  重写核心方法：beforeHandshake()  



![效果预览](https://github.com/yushouling/java-websocket-hello/blob/master/preview.png)  

关键字：java websocket demo, java websocket 乱码
