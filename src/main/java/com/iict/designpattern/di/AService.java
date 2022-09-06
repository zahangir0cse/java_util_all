package com.iict.designpattern.di;

public class AService {
    private final BService bService;

    public AService(BService bService) {
        this.bService = bService;
    }
}
