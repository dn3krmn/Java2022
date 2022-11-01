package oop1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Kahve makinesi");

        Product product2 = new Product();
        product2.setName("Tost makinesi");

        Product[] products = {product1,product2};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05646457896");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ad");
        individualCustomer.setLastName("soyad");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("05312425678");
        corporateCustomer.setTaxNumber("12345678901");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}