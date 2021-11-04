package org.vashonsd;

public abstract class Partygoer {

    String name;

    /**
     * The handle method takes in a Message from another partygoer and returns a Message.
     * The Partygoer's response to the other Partygoer's method is entirely up the design of the programmer.
     * @param msg
     * @return returns a Message with an Action, a text, and an intensity level.
     */
    public abstract Message handle(Message msg);

    public Partygoer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
