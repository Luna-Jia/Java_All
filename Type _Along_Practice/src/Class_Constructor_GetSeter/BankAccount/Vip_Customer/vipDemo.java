package Class_Constructor_GetSeter.BankAccount.Vip_Customer;

public class vipDemo {
    public static void main(String[] args){
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim",100.00,"tim@email.com");
        System.out.println(person3.getName());

    }


}
