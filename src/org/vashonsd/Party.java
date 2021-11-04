package org.vashonsd;

import java.util.ArrayList;
import java.util.List;

public class Party {
    List<Conversation> conversations;
    List<Partygoer> available;

    public Party() {
        this.conversations = new ArrayList<>();
        available = new ArrayList<>();
    }

    private void buildParty() {

    }
}
