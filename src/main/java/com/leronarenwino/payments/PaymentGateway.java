package com.leronarenwino.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
