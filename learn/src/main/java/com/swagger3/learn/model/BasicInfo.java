package com.swagger3.learn.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.UUID;

@JsonInclude
public class BasicInfo extends BasicEntity{

    String name;

    String address;

}
