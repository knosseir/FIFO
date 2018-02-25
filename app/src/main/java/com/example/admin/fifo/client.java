package com.example.admin.fifo;
import com.example.admin.fifo.server;

/**
 * Created by kenny on 2/24/2018.
 */


public class client{
    String ClientName;              // the name of the customers
    int position;                   // customer position in line (1 meaning the custmer is 1st in line)
    int SecondsWaited;              // how long the customer has waited
    int SecondsRemaining;            // an estimate of how long the customer has until checkout
    String StoreCode;               // the code customers enter to join a store

    /* Constructor */
    client(String name, String code) {         // CONSTRUCTOR
        ClientName = name;
        StoreCode = code;

    }

    client(String name) {
        ClientName = name;
    }

    /* FUNCTIONS */
    void leave() {
        // ask the server to remove the client from the queue
        StoreCode = "";                 // "" indicates is not currently waiting in a queue
    }



}
