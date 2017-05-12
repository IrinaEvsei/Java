package main.java.com.bsu.thirdlab;

import main.java.com.bsu.thirdlab.sort.CustomerAlphaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by irisha on 27.02.2017.
 * @author Irina Evsei
 */

public class Phone {
    public static void main(String[] args) {

        Operator velcome = new Operator("Тариф ОТЛИЧНЫЙ");

        velcome.getCustomerList().add(new Customer("Бегасова","Алина","Андреевна","Могилев, Беларусь.",
                74305720455314L,345.45,456736.60,0,3456));

        velcome.getCustomerList().add(new Customer("Черкасов","Даниил","Николаевич","Бердянск, Украина.",
                6275849503679L,23276.50,23.66,1345,664546));

        velcome.getCustomerList().add(new Customer("Евсей","Ирина","Сергеевна","Кореличи, Марс.",
                23571056402749L,113355.37,4346.34,42225,0));

        velcome.getCustomerList().add(new Customer("Жук","Дмитрий","Иванович","Минск, Столица.",
                56304829561048L,226794.35,234850.35,1154656,34535));

        velcome.getCustomerList().add(new Customer("Корень","Екатерина","Игоревна","Чашники, Витебск.",
                57205637402739L,336.98,2544645.75,8389,0));

        velcome.getCustomerList().add(new Customer("Лапунас","Паулюс","Роландас","Вильнюс, Литва.",
                56203657208632L,5.03,253666.43,0,855672));

        velcome.getCustomerList().add(new Customer("Шинкевич","Надежда","Андреевна","8 этаж, Малиновка.",
                72275930573902L,2432568.11,2546746.54,245267,0));


        System.out.println("Сведения об абонентах в алфавитном порядке:");
        Collections.sort(velcome.getCustomerList(), new CustomerAlphaComparator());
        printCustomers(velcome.getCustomerList());


        System.out.println("\n\nCведения об абонентах, у которых время внутригородских разговоров превышает заданное(10000ms) :\n");
        ArrayList<Customer> listLocal = getCustomerListWithLocal(velcome.getCustomerList(), 1);
        printCustomers(listLocal);

        System.out.println("\n\nCведения об абонентах, которые пользовались междугородной связью:");
        ArrayList<Customer> listInternational = getCustomerListWithInternational(velcome.getCustomerList(), 0);
        printCustomers(listInternational);

    }

    private static void printCustomers(List<Customer> customers){
        for (Customer cust : customers) {
            System.out.println(cust);
        }
    }


    public static ArrayList<Customer> getCustomerListWithInternational(List<Customer> customers, long timeInternational) {
        ArrayList<Customer> custlist = new ArrayList<>();
        for (Customer cust : customers) {
            if (cust.getTimeInternational() > timeInternational) {
                custlist.add(cust);
            }
        }
        return custlist;
    }

    public static ArrayList<Customer> getCustomerListWithLocal(List<Customer> customers, long timeLocal) {
        ArrayList<Customer> custlist = new ArrayList<>();
        for (Customer cust : customers) {
            if (cust.getTimeLocal() > timeLocal) {
                custlist.add(cust);
            }
        }
        return custlist;
    }
}


