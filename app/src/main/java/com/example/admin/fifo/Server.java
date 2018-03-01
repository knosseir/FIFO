package com.example.admin.fifo;
import com.example.admin.fifo.Client;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by kenny on 2/24/2018.
 */

public class Server {
    String ServerName;              // the name of the the store
    Queue<Client> LINE;             // the queue of clients
    Client ProcessingClient;        // the client that is currently being serviced
    boolean isClient;               // there is a client in ProcessingClient / server is serving someone

    /* Constructor */
    Server(String name) {
        ServerName = name;
        LINE = new LinkedList<Client>();
        isClient = false;
    }

    /* FUNCTIONS */
     boolean getClient() {
        try {
            ProcessingClient = LINE.remove();
        }
        catch (NoSuchElementException e) {
            isClient = false;
            System.out.println("We are currently not servicing anyone.");
            return false;
        }
        isClient = true;
        return true;
    }

    boolean getEmpty() {
         return LINE.isEmpty();
    }

    boolean nextClient() {
         if(getClient()) {
             return true;
         }
         return false;
    }

    void kickToEnd() {
        //Put Client at end of queue
        LINE.add(ProcessingClient);
        nextClient();
    }

    boolean kickOut() {
         return nextClient();
    }

    boolean servicingClient() {
         return isClient;
    }


}
