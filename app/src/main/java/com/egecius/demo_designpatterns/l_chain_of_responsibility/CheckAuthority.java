package com.egecius.demo_designpatterns.l_chain_of_responsibility;


class CheckAuthority {

    public static void requestPurchase(double amount) {
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        manager.processRequest(new PurchaseRequest(amount, "General"));
    }
}