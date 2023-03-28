package com.learning.dao;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Contactus")
@Data
public class SaveEntity
{
    @Id
    @GeneratedValue
    private int id;
    @Column(name="FirstName")
    private String FirstName;
    @Column(name = "Your Email")
    private String YourEmail;
    @Column(name="Your Phone")
    private String YourPhone;
    @Column(name="Subject")
    private String Subject;
    @Column(name="Message")
    private String Message;

}
