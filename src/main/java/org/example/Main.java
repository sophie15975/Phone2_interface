package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
