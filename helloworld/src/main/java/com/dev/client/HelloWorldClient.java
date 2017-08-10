package com.dev.client;

import com.dev.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String arg[]) throws MalformedURLException {

        URL url = new URL("http://localhost:9000/ws/hello");
        QName qName = new QName("http://ws.dev.com/", "HelloWorldImpleService");
        Service service = Service.create(url, qName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        System.out.println(helloWorld.getHelloWorldString("Ta JBits"));
    }
}
