package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    //veritabanına erişim işlemleri gerçekleştiriliyor
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır...sql
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
