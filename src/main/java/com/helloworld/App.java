package com.helloworld;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
        while(true){
            ServerSocket listener = new ServerSocket(8080);
            while(true){
              Socket sock = listener.accept();
              new PrintWriter(sock.getOutputStream(), true).
                        println("Hello World!");
              sock.close();
              logger.trace("Sending telemetry");
            }
        }
    }
}
