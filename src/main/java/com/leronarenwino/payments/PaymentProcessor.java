package com.leronarenwino.payments;

public class PaymentProcessor {

    private final PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        return paymentGateway.requestPayment(new PaymentRequest(amount)).getStatus() == PaymentResponse.PaymentStatus.OK;
    }

}
