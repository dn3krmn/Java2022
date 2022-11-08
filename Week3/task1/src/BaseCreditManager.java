public abstract class BaseCreditManager implements CreditService {
    public abstract void calculate();
    //javada metodlar default olarak virtual
    public void save(){
        System.out.println("Kaydedildi");
    }

}