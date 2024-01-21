package com.romanm87.liquibase.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.HashCodeExclude;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "authors")
public class Author {
    @Id
    String id;

    @Column(nullable = false)
    String name;

    @ToString.Exclude
    @HashCodeExclude
    @ManyToOne
    User user;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "author_id")
    @ToString.Exclude
    @HashCodeExclude
    List<Article> articles = new ArrayList<>();
}
