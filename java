public class TV {
    private boolean isOn;
    private int channel;
    private int volume;

    public TV() {
        isOn = false;
        channel = 1;
        volume = 10;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("TV is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is off");
    }

    public void changeChannel(int channel) {
        if (isOn && channel >= 1 && channel <= 100) {
            this.channel = channel;
            System.out.println("Channel changed to " + this.channel);
        }
    }

    public void increaseVolume() {
        if (isOn && volume < 20) {
            volume++;
            System.out.println("Volume increased to " + volume);
        }
    }

    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        }
    }
}
