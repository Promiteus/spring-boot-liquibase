package com.romanm87.liquibase.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.HashCodeExclude;


@Entity
@Data
@NoArgsConstructor
@Table(name = "articles")
public class Article {
    @Id
    String id;

    @Column(nullable = false, length = 100)
    String title;

    @Lob
    @Column(nullable = false)
    String content;

    @ToString.Exclude
    @HashCodeExclude
    @ManyToOne
    Author author;
}
