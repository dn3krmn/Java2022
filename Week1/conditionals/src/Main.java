public class Main {

    public static void main(String[] args) {

        int sayi=17;

        // sayı 20'den küçükse bu kod bloğu çalışır.
        if(sayi<20) {
            System.out.println("Bu sayı 20'den küçüktür.");
        }
        // sayı 20ye eşitse bu kod bloğu çalışır.
        else if(sayi==20){
            System.out.println("Sayı 20'ye eşittir.");
        }
        // sayı 20'den büyükse bu kod bloğu çalışır.
        else {
            System.out.println("Sayı 20'den büyüktür.");
        }
    }
}