package com.iict.designpattern.di;

public class BService {
    private AService aService;

    /*public BService(AService aService) {
        this.aService = aService;
    }*/

    public void setaService(AService aService) {
        this.aService = aService;
    }
}
