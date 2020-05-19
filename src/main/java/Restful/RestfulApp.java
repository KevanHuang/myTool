package Restful;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;


import java.net.URI;

public class RestfulApp {
    public static void main(String[] args) {
        String str = "http://127.0.0.1:8888";
        JettyHttpContainerFactory.createServer(URI.create(str), new RestApplication());
    }
}
