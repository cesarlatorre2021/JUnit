package com.platzi.javatests.payment;

public class PaymentResponse {

    enum PaymentStatus {
        OK, ERROR, NA
    }

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
