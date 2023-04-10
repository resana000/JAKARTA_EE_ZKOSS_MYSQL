package org.demo.demo.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Department {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
}
