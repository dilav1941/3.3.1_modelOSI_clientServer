package client;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args){

        String host = "127.0.01";
        int port = 8086;

        try (Socket clientSocket = new Socket (host, port);
             PrintWriter out = new PrintWriter (clientSocket.getOutputStream (), true);
             BufferedReader in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream ()))) {

            // Читаем строку и выводим ее на экран с номером порта подключаемого клиента
            out.println ("Царь царевич");
        } catch (IOException e){
            e.printStackTrace ();
        }
    }
}
