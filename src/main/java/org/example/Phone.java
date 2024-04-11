package org.example;

public class Phone {






    //Дополнительно добавьте метод, возвращающий строку в формате "Actions count: ХХХ",
    // где ХХХ - количество совершенных действий (= вызовов методов, унаследованных от Phone,
    // Camera и MusicPlayer).


 public void call(String number ){
     System.out.println("Calling to: " + number);

 }
 public void sendSms(String message){
     System.out.println("Sending SMS: " + message);
 }
}
