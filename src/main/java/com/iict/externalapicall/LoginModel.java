package com.iict.externalapicall;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class LoginModel {
    @JsonProperty("head")
    private String head;
    @JsonProperty("officialid")
    private String officialid;
    @JsonProperty("systemid")
    private String systemid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("designation")
    private String designation;
    @JsonProperty("department")
    private String department;
    @JsonProperty("headdepartment")
    private String headdepartment;
    @JsonProperty("status")
    private String status;
}
