package objectsAndClass;
public class TV {

    // line4~6: data fields
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // TV is off

    // constructor
    public TV() {
    }

    // turn on TV
    public void turnOn() {
        on = true;
    }

    // turn off TV
    public void turnOff() {
        on = false;
    }

    // set a new channel
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    // set a new volume
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >=1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    // increase channel
    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    // decrease channel
    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    // increase volume
    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    // decrease volume
    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/TV.html

// The constructor and methods in the TV class are defined public so they can be accessed from other classes. Note the
// channel and volume level are not changed if the TV is not on. Before either of these is changed, its current value is
// checked to ensure it is within the correct range.




