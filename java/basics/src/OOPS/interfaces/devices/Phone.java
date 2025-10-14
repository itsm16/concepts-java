package OOPS.interfaces.devices;

public class Phone implements Camera, MusicePlayer{
    @Override
    public void clickPic() {
        System.out.println("Phones can take pics");
    }

    @Override
    public void playMusic() {
        System.out.println("Phones can play music");
    }
}
