package com.ab.core.lambdastreams;

import com.ab.core.lambdastreams.model.Category;
import com.ab.core.lambdastreams.model.Product;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 *
 * Method reference are useful if you want to omit the extra method call of lambda
 *
 * The methods methods reference points to must match with the method defined by functional interface which labda going to implement
 *
 * Method Reference can refer to:
 *      static methods
 *      intsnace method
 *      constructor
 *
 */
public class MethodReferences {

    interface ProductFactory {
        Product create(Category category, String name, BigDecimal price);
    }
    static boolean isExpensive(Product product){
        return product.getPrice().compareTo(new BigDecimal("5.00")) >= 0;
    }
    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        //here there are 2 layers - first labda which in turns calls a single instance method
        //products.forEach(product -> System.out.println(product));

        //we can avoid extra lambda layer by using method reference
        //only restriction is the for each accepts consumer whose accept method must match with println in signature

        //referring to static method
        //removeIf accepts predicate whose test method should match with isExpensive which we are going to use as method reference
        products.removeIf(MethodReferences::isExpensive);//throws UnsupportedOperationException as asList produces semi immutable list

        //referring to instance method
        products.forEach(System.out::println);
        //products.stream().map(Product::getName).forEach(System.out::println);

        //referring to constructor
        ProductFactory factory = Product::new;
        System.out.println(factory.create(Category.FOOD, "Blueberries", new BigDecimal("6.95")));

    }
}
