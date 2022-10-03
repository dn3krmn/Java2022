public class Main {
    public static void main(String[] args) {

        int number=12689;
        int remainder = number % 2;
        boolean isPrime = true;
        System.out.println(remainder + "\n" + "^^^^^^^^^^^^^^^^^^");

        if(number<1) {
            System.out.println("Geçersiz sayı.");
            return;
        }

        if(number==1) {
            System.out.println("Asal değildir.");
            return;
        }

        for(int i=2; i<number; i++) {
            if(number%i == 0) {
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır");
        }
        else {
            System.out.println("Asal değildir.");
        }

    }
}