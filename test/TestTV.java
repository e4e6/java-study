class TV {
    int channel, volumeLevel;
    boolean on;

    void setChannel(int newChannel){
        this.channel = newChannel;
    }

}

public class TestTV {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setChannel(20);
    }
}
