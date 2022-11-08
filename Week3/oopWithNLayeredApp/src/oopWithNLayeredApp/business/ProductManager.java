package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;
    //private Logger[] loggers;
    public ProductManager(ProductDao productDao, List<Logger> loggers) {

        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları (business rules)
        //kötü kod tekniği
        if(product.getUnitPrice()<10){
            throw new Exception("ürün fiyatı 10'dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }

    }
}
