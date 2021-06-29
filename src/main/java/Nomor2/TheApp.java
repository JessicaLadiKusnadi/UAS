
package Nomor2;

public class TheApp {
     public static void main(String[] args) {
        MainQueue newQueue = new mainQueue(10);
        newQueue.enqueue(8);
        newQueue.show();
        newQueue.enqueue(8);
        newQueue.show();
        System.out.println("yang diambil dari antrian = "+newQueue.dequeue());
        System.out.println("Nama saya adalah jessica lady kusnadi ");
        newQueue.show();
        newQueue.enqueue(7);
        newQueue.show();
        newQueue.enqueue(6);
        newQueue.show();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
    }
}
    

