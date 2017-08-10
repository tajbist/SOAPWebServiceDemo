package com.dev.endpoint;


import com.dev.ws.HelloWorldImple;

import javax.xml.ws.Endpoint;

//End point Publisher
public class HelloWorldEndPoint {
    public static void main(String arg[]) {
        Endpoint.publish("http://localhost:9000/ws/hello", new HelloWorldImple());
    }
}
