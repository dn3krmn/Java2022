public class Main {
    public static void main(String[] args) {

        // for
        for(int i=0;i<=10;i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //for döngüsü ile 0'dan 10'a kadar olan çift sayıları yazdırdık.


        // while
        int i=1;
        while(i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("while Döngüsü Bitti");
        // while döngüsü ile 1-10 arası tek sayıları yazdırdık.


        // do while : while döngüsünden farkı şart sağlanmasa bile ekrana bir kere çıktı verir.
        int j=100;
        do {
            System.out.println(j);
            j+=2;
        }
        while(j<10);

        System.out.println("Do-While Döngüsü Bitti");
    }
}