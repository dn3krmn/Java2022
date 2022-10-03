public class Main {
    public static void main(String[] args) {

        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci4="Salih";
        String ogrenci3="Ahmet";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("##############################");

        //DİZİLER

        String[] ogrenciler = new String[3];
        // String[3] ile dizinin boyutunun 3 olduğu bilgisi veriliyor

        ogrenciler[0] ="Engin";
        ogrenciler[1] ="Derin";
        ogrenciler[2] ="Salih";

        for(int i=0; i<ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("##############################");

        /* öğrenciler dizisindeki her elemanı gez
         * her bir elemanı gezerken o anki elamana takma isim ver : ogrenci
         */
        for(String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}