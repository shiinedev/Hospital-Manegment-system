package com.Hospitalsystem.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Patient")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column (nullable = false,length = 50)
    private String name;
    @Column (nullable = false)
    private int age;
    @Column (nullable = false)
    private String Gender;
    @Column (nullable = false,length = 50)
    private String address;



}
