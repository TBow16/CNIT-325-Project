/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;
import java.io.*;
import java.net.*;
/**
 *
 * 
 */
public class StorageClient {
    private static String serverName;
    public static void main(String [] args){
        //create server and port
        String sName = "localhost";
        int port = 4578;
        try{
            System.out.println("Connecting to " + sName + " on port " + port);
            Socket client = new Socket(sName, port);
            System.out.println("Connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Testing: " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Response: " + in.readUTF());
            client.close();
        } catch(IOException e){
        }
    }
}
