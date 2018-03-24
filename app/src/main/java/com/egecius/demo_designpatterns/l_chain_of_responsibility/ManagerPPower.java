package com.egecius.demo_designpatterns.l_chain_of_responsibility;

class ManagerPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}
