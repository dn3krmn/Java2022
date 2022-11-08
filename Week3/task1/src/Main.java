public class Main {
    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        System.out.println("#########################################");

        Customer customer = new Customer();//örneğini oluşturmak,instance creation,heapde bir referans numarası oluşturmak
        customer.setId(1);
        customer.setCity("Konya");


        Company company = new Company();
        company.setCompanyName("10000");
        company.setCompanyName("Arçelik");
        company.setId(100);

        System.out.println("#########################################");

        Person person = new Person();
        person.setNationalityId("12345678901");
        person.setFirstName("Döne");
        person.setLastName("Karaman");

        System.out.println("#########################################");

        CustomerManager customerManager = new CustomerManager(new Person(),new MilitaryCreditManager());
        customerManager.save();
        customerManager.giveCredit();
    }
}