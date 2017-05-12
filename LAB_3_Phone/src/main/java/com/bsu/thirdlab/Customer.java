package main.java.com.bsu.thirdlab;

/**
 * Created by irisha on 19.03.2017.
 */
public class Customer {

    private static int totalCustomers = 0;
    private int  id = ++totalCustomers;

    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private double debit;
    private double credit;
    private long timeLocal;
    private long timeInternational;

    public Customer(String surname, String name, String patronymic, String address, long cardNumber, double debit, double credit, long timeLocal, long timeInternational) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
        this.timeLocal = timeLocal;
        this.timeInternational = timeInternational;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public long getTimeLocal() {
        return timeLocal;
    }

    public void setTimeLocal(long timeLocal) {
        this.timeLocal = timeLocal;
    }

    public long getTimeInternational() {
        return timeInternational;
    }

    public void setTimeInternational(long timeInternational) {
        this.timeInternational = timeInternational;
    }

    public String toString(){
        return String.format("ID: %d\t Имя: %s %s %s", id, name, patronymic, surname) + "\n" +
                String.format("\t\t\tНомер карты: %d\t Дебет: %10.2f\t  Кредит: %10.2f.", cardNumber, debit, credit) + "\n" +
                "\t\t\tВремя городских разговоров: " + timeLocal + "ms,\t Время междугородних разговоров: " + timeInternational + "ms.";
    }
}
