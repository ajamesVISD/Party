package org.vashonsd;

public class ShyStevie extends Partygoer {

    public ShyStevie(String name) {
        super(name);
    }

    @Override
    public Message handle(Message msg) {
        if (msg.getAction() == Actions.INSULT) {
            return new Message("Augh! I can't stand conflict!", Actions.LEAVE, IntensityLevel.INTENSE);
        } else if (msg.getAction() == Actions.COMPLIMENT) {
            if (msg.getIntensity() == IntensityLevel.INTENSE) {
                return new Message("That's intrusive!", Actions.INSULT, IntensityLevel.MILD);
            } else {
                return new Message("Thanks. *blushes*", Actions.COMPLIMENT, IntensityLevel.MILD);
            }
        } else {
            return new Message("*whispers* Hello.", Actions.COMPLIMENT, IntensityLevel.MILD);
        }
    }
}
