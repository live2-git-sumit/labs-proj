package com.live;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.live.config.AppConfig;
import com.live.model.Product;
import com.live.repository.ProductRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "spring jdbc template" );
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        List<Product> products = productRepository.getProducts();
        products.forEach(System.out::println);
        
        //implement all the other operations.
        //read by Id
        Product prod = productRepository.getProductById(101);
        System.out.println(prod.getProductName());
        
        //create
       // productRepository.createProduct(104,"SpringJava",5.5f);
        
        //update
       //productRepository.updateProduct(101, "Mojo", 7.3f);
        
        //delete
       productRepository.deleteProduct(103);
        
    }
}
