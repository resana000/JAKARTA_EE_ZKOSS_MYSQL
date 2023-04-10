package org.demo.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Company {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String form;

    @OneToOne
    @JoinColumn(name = "address_fk", nullable = false)
    private Address address;

    @OneToMany
    private List<Department> departments;
}
