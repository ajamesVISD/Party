package org.vashonsd;

public class Message {
    String text;
    Actions action;
    IntensityLevel intensity;

    public Message(String text, Actions action, IntensityLevel intensity) {
        this.text = text;
        this.action = action;
        this.intensity = intensity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Actions getAction() {
        return action;
    }

    public void setAction(Actions action) {
        this.action = action;
    }

    public IntensityLevel getIntensity() {
        return intensity;
    }

    public void setIntensity(IntensityLevel intensity) {
        this.intensity = intensity;
    }
}
