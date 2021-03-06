package com.irgek.Treydit.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name ="country")
public class Country extends AbstractPersistable<Long> {
    private String name;
    private String iso2Code;
    @OneToMany
    List<City> cities = new ArrayList<>();
}
