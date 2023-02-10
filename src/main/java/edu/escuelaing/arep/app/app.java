package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.services.*;

import java.io.IOException;

public class app {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.getInstance();
        server.addService("/web", new WebService());
        server.addService("/404", new Web404());
        server.addService("/style.css", new WebCss());
        server.addService("/app.js", new WebJs());
        server.addService("/imagen.jpg", new WebImg());
        server.run(args);
    }
}
