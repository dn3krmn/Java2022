public class CustomerManager {
    private CustomerDao customerDao; //private ile dışardan erişim kapandı
    /*
    CustomerDao customerDao;
    public void add(){
        customerDao.add();
    }*/

    public CustomerManager(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public void add(){
        customerDao.add();
    }
}
