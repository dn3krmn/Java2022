public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); //concat : birleştirme
        System.out.println(mesaj.startsWith("B")); //bloean değer döndürür
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ', '-'); //boşluğu '-' ile değiştirir
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4)); //bir metnin içinden parça almak için sunstring kullanılır

        // split metodu bir metni belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar.
        for(String kelimeler:mesaj.split(" ")) { //boşluğa göre ayırıyor.
            System.out.println(kelimeler);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}