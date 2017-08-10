package  com.dev.ws;


import javax.jws.WebService;

@WebService(endpointInterface = "com.dev.ws.HelloWorld")
public class HelloWorldImple implements HelloWorld {

    public String getHelloWorldString(String name) {
        return "Hello JAX-WS " + name;
    }
}
