package StratergyPattern;

public interface PaymentStrategy {
    void  pay(int amount);
}

class CreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println("paid "+amount+" Using credit card");
    }
}

class Upi implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println("paid "+amount+" Using UPI");
    }
}

class PaymentMethod{

    PaymentStrategy strategy;

    public PaymentMethod(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void getPaymentMethod(int amount){
        strategy.pay(amount);
    }
}

class  Main{
    public static void main(String[] args) {

        PaymentMethod method = new PaymentMethod(new CreditCard());
        method.getPaymentMethod(100);

        method = new PaymentMethod(new Upi());
        method
                .getPaymentMethod(100);

    }
}