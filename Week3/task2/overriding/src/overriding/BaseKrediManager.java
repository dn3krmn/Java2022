package overriding;

public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
    /* final keywordu eklenirse bu metod override edilemez
    * public double hesapla(double tutar) {
    *    return tutar * 1.18;
    *}
    */
}
