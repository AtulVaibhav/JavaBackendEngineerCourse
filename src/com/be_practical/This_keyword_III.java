package com.be_practical;


class PaymentService{
    String paymentMode;
    public PaymentService(String paymentMode){
        this.paymentMode = paymentMode;
    }
    public void getPaymentMode(){
        System.out.println(this.paymentMode);
    }
}
public class This_keyword_III {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService("CreditCard");
        paymentService.getPaymentMode();
    }
}
