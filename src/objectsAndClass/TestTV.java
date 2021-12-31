package objectsAndClass;
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV(); // The program creates two objects in lines 3 and 8 and invokes the methods on the objects to perform actions for setting channels and volume levels and for increasing channels and vol- umes.
        tv1.turnOn(); // The methods are invoked using syntax such as tv1.turnOn() (line 5).
        tv1.setChannel(30);
        tv1.setVolume(3);
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
// The program displays the state of the objects in lines 14–17.
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
// The data fields are accessed using syntax such as tv1.channel (line 14).
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);

    }
}
