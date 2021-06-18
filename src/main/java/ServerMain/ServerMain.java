package ServerMain;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {

        System.out.println ("Запуск сервера");
        // запуск сервера с определенным номера порта
        int port = 8086;
        while (true) {
            ServerSocket serverSocket = new ServerSocket (port);
            Socket clientSocket = serverSocket.accept ();
            PrintWriter out = new PrintWriter (clientSocket.getOutputStream (), true);
            BufferedReader in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream ()));
            System.out.println ("Новое подключение");

            final String message = in.readLine();
            System.out.println (String.format("Привет %s, твой порт подключения № %d", message, clientSocket.getPort()));
            serverSocket.close ();
        }
    }
}
