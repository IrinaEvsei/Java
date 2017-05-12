package main.java.com.bsu.thirdlab.sort;

import main.java.com.bsu.thirdlab.Customer;

import java.util.Comparator;

/**
 * Created by irisha on 19.03.2017.
 */
public class CustomerAlphaComparator implements Comparator<Customer> {



    @Override
    public int compare(Customer cust1, Customer cust2) {
        return cust1.getName().compareToIgnoreCase(cust2.getName());
    }
}
