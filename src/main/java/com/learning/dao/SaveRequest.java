package com.learning.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveRequest {
    private String FirstName;
    private String YourEmail;
    private String YourPhone;
    private String Subject;
    private String Message;
}
