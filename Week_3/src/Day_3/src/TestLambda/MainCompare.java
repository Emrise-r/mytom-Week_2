package TestLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCompare {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(10,"Nam"));
        customerList.add(new Customer(40,"Linh"));
        customerList.add(new Customer(40,"Hai"));
        customerList.add(new Customer(20,"Tung"));
        Collections.sort(customerList, Comparator.comparing(Customer::getAge).thenComparing(Customer::getName));
        customerList.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}

