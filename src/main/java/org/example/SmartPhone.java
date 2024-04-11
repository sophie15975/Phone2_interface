package org.example;

public class SmartPhone extends Phone implements MusicPlayer, Camera {
    static int count = 0;


    public int countActions() {
        count++;
        System.out.println("Actions count: " + count);
        return count;
    }

    @Override
    public int takePhoto(int myPhoto) {
        count++;
        return myPhoto;

    }

    @Override
    public void recordVideo() {
        count++;
        System.out.println("видео записано");
    }

    @Override
    public void play() {
        count++;
        System.out.println("видео запускается, подождите, пожалуйста");
    }

    @Override
    public void stop() {
        count++;
        System.out.println("программа остановлена. До свиданья!");
    }

    @Override
    public void pause() {
        count++;
        System.out.println("плеер на паузе");
    }
}
