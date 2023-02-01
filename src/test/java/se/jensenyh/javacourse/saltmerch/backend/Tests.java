package se.jensenyh.javacourse.saltmerch.backend;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import se.jensenyh.javacourse.saltmerch.backend.model.CartItem;
import se.jensenyh.javacourse.saltmerch.backend.model.Product;
import se.jensenyh.javacourse.saltmerch.backend.service.CartService;
import se.jensenyh.javacourse.saltmerch.backend.service.ProductService;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ContextConfiguration
public class Tests {
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;

    /*
    @Test
    public void testCartItems() {

        CartItem test  = new CartItem(1000, "title", "blue", "14", "none");
        cartService.removeFromCart(test);
        List<CartItem> allCartItems = cartService.getAllCartItems();
        assertEquals(allCartItems.size(), 0);
        cartService.addToCart(test, 1);
        allCartItems = cartService.getAllCartItems();
        assertEquals(allCartItems.size(), 1);
        assertEquals(allCartItems.get(0).productId, 1000);
        assertEquals(allCartItems.get(0).title, "title");
        assertEquals(allCartItems.get(0).color, "blue");
        assertEquals(allCartItems.get(0).size, "14");
        assertEquals(allCartItems.get(0).previewImage, "none");
        cartService.removeFromCart(test);
        allCartItems = cartService.getAllCartItems();
        assertEquals(allCartItems.size(), 0);

    }



    @Test
    public void testGetAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        assertEquals(allProducts.size(), 6);


    }

     */
}



