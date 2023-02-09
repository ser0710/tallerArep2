package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.services.Web404;
import edu.escuelaing.arep.app.services.WebCss;
import edu.escuelaing.arep.app.services.WebJs;
import edu.escuelaing.arep.app.services.WebService;

import java.io.IOException;

public class app {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.getInstance();
        server.addService("/web", new WebService());
        server.addService("/404", new Web404());
        server.addService("/css", new WebCss());
        server.addService("/js", new WebJs());
        server.run(args);
    }
}
