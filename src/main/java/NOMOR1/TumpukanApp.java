
package NOMOR1;

public class TumpukanApp {
     public static void main (String [] args){
        tumpukan tumpukan=new tumpukan(6);
        tumpukan.push(8);
        tumpukan.peek();
        tumpukan.push(2);
        tumpukan.peek();
        tumpukan.push(3);
        tumpukan.peek();
        long nilai3=tumpukan.peek();
        System.out.println("nilai teratas ="+nilai3);
        System.out.println("nama saya adalah Jessica Lady Kusnadi");
        System.out.println("nilai yang dihapus ="+nilai3);
        long nilai1=tumpukan.pop();
        tumpukan.peek();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.peek();
    }
    
}