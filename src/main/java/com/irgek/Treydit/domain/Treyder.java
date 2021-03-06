package com.irgek.Treydit.domain;


import com.irgek.Treydit.domain.Address;
import com.irgek.Treydit.domain.Name;
import com.irgek.Treydit.domain.Phonenumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "treyder")
public class Treyder extends AbstractPersistable<Long> {
    @Embedded
    private Name name;
    private Gender gender;
    private String username;
    private String email;
    private LocalDate birthDate;
    @Embedded
    private Address address;
    @Embedded
    private Phonenumber phonenumber;
    private String password;
    private Role role;
    @ManyToOne
    private City city;
    @OneToMany
    private List<Item> items = new ArrayList<>();


}
