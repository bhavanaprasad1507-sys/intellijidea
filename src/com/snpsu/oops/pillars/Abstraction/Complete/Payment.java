package com.snpsu.oops.pillars.Abstraction.Complete;

public interface Payment {
    void pay();
    default void refund(){
         System.out.println("Refund");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Paying through UPI");
    }
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Paying through Credit card");
    }
}
class Cash implements Payment{
    public void pay(){
        System.out.println("Paying through Credit card");
    }
}
class DriverCode{
    public static void main(String[] args){
        UPI upi=new UPI();
        upi.pay();
    }
}
