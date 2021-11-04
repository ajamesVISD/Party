package org.vashonsd;

import java.util.ArrayList;
import java.util.List;

public class Conversation {
    boolean active;
    int locutor;
    Message currentMessage;

    Partygoer[] members = new Partygoer[2];

    public Conversation(Partygoer[] members) {
        this.active = true;
        this.locutor = 0;
        this.members = members;
        currentMessage = new Message("",Actions.BEGIN,IntensityLevel.MILD);
    }

    public String stepConversation() {
        currentMessage = members[locutor].handle(currentMessage);
        String response = members[locutor].getName() + " says: " + currentMessage.getText();
        if(currentMessage.getIntensity() == IntensityLevel.INTENSE) {
            response += "!!";
        }
        if(currentMessage.getAction() == Actions.LEAVE) {
            active = false;
        }
        locutor = Math.abs(locutor-1);
        return response;
    }
}
