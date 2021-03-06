package com.irgek.Treydit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "item")
public class Item extends AbstractPersistable<Long> {

    private String name;
    private double cost;
    private String description;
    @Enumerated(EnumType.STRING)
    private Condition itemCondition;
    @Enumerated(EnumType.STRING)
    private Category category;
    @ManyToOne
    private Treyder treyder;
}
