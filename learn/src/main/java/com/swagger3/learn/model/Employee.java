package com.swagger3.learn.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class Employee extends BasicInfo{

    @JsonProperty("id")
    private volatile UUID id;

    @JsonProperty("is_active")
    Boolean isActive;

    @JsonProperty("rating")
    Integer averageRating;

    @JsonProperty("latest_rating")
    Integer latestRating;

}
