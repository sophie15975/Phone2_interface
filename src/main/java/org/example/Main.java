package org.example;


public class Main {
    public static void main(String[] args) {


        SmartPhone sp = new SmartPhone();
        int qualityOfPhotoes = sp.takePhoto(5);
        System.out.println("Количество фото: " + qualityOfPhotoes);

        sp.recordVideo();
        sp.play();
        sp.stop();
        sp.pause();

        System.out.println("количество действий: " + SmartPhone.count);

    }
}
