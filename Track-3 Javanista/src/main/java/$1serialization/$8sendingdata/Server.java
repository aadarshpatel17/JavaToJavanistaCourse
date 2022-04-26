package $1serialization.$8sendingdata;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    /* ServerSocket: System independent implementation of the server side of a client/server socket connection. */

    public static void main(String[] args) throws IOException {

        Socket socket = null;
        ObjectInputStream objIn = null;

        try (ServerSocket serverSocket = new ServerSocket(8020);) {
            System.out.println("Waiting for a connection...");
            /* This wil wait for a connection to be made to this socket. */
            socket = serverSocket.accept();

            objIn = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));

            while(true) {
                Account account = (Account) objIn.readObject();
                System.out.println("Received account information: " + account);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error during serialization");
            System.exit(1);
        } finally {
            socket.close();
            objIn.close();
        }

    }

}
