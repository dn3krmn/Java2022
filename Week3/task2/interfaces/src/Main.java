public class Main {
    public static void main(String[] args) {
        //CustomerDao customerDao = new OracleCustomerDao();

        /*
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDao = new OracleCustomerDao();
        customerManager.add();
        */
        CustomerManager customerManager = new CustomerManager(new SqlServerCustomerManager());
        customerManager.add();
    }
}