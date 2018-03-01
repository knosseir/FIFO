package com.example.admin.fifo;

/**
 * Created by kenny on 2/24/2018.
 */


public class client {
    public final static int SEC_PER_CUSTOMER = 60;

    String clientName;              // the name of the customers
    int position;                   // customer position in line (1 meaning the custmer is 1st in line)
    int secondsWaited;              // how long the customer has waited
    int secondsRemaining;           // an estimate of how long the customer has until checkout
    String storeCode;               // the code customers enter to join a store

    /* Constructor */
    client(String name, String code) {      // CONSTRUCTOR
        clientName = name;
        storeCode = code;

    }

    client(String name) {
        clientName = name;
    }

    /* FUNCTIONS */
    void leave() {
        // ask the server to remove the client from the queue
        storeCode = "";                 // "" indicates is not currently waiting in a queue

    }

    int getPosition() {
        return position;
    }

    void advancePosition() {
        position = position + 1;
    }

    void setPosition(int newPosition) {
        position = newPosition;
    }

    int getSecondsWaited() {
        // Clock since added to line???
        return secondsWaited;
    }

    int getSecondsRemaining() {
        secondsRemaining = position * SEC_PER_CUSTOMER;
        return secondsRemaining;
    }

    String getStoreCode() {
        return storeCode;
    }


}
