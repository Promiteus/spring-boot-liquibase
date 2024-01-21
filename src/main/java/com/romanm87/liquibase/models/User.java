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
@Table(name = "users")
public class User {
    @Id
    String id;

    @Column(nullable = false, length = 20)
    String login;

    @Column(nullable = false, length = 20)
    String password;

    @ToString.Exclude
    @HashCodeExclude
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    List<Author> authors = new ArrayList<>();
}
