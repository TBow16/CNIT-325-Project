/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;
import java.net.*;
import java.io.*;
/**
 *
 * 
 */
public class StorageServer extends Thread {
    private static int port;
    private ServerSocket serverSocket;
    public StorageServer(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(20000);
    }
    public void run(){
        while(true){
            try{
                System.out.println("Waiting for connection on port " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Connected to " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Disconnecting from " + server.getLocalSocketAddress());
                server.close();
                }
            catch(SocketTimeoutException s){
                System.out.println("Time out.");
                break;
            }
            catch(IOException e){
                e.printStackTrace();
                break;
            }
        }
        port=4578;
        try{
            Thread t = new StorageServer(port);
            t.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
