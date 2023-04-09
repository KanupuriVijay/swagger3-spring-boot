package com.swagger3.learn.model;

import java.util.UUID;

public class User {

    private volatile UUID id;

    Boolean isPremium;

    CustomerBehaviour customerType;
}
