package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.services.*;

import java.io.IOException;

public class app {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.getInstance();
        server.addService("/web", new WebService());
        server.addService("/404", new Web404());
        server.addService("/css", new WebCss());
        server.addService("/js", new WebJs());
        server.addService("/img", new WebImg());
        server.run(args);
    }
}
