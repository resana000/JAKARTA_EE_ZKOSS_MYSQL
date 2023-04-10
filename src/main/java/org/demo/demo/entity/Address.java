package org.demo.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String index;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String hause;

    private String appartment;

}
