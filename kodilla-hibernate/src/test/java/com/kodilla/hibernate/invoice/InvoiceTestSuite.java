package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Paper");
        int product1Id = product1.getId();
        Product product2 = new Product("Scissors");
        int product2Id = product2.getId();
        Product product3 = new Product("Rock");
        int product3Id = product3.getId();

        Item item1 = new Item(product1, new BigDecimal(2), 3);
        Item item2 = new Item(product2, new BigDecimal(5), 7);
        Item item3 = new Item(product3, new BigDecimal(11), 13);

        Invoice invoice = new Invoice("17");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //Clean up
        try {
            invoiceDao.delete(invoiceId);
            productDao.delete(product1Id);
            productDao.delete(product2Id);
            productDao.delete(product3Id);
        } catch (Exception e) {
            //do nothing
        }

    }
}
