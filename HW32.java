package com.example.locker220124.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "alex")
public class Alex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(unique = true)
    private String username;

    @NonNull
    @JsonIgnore
    private String password;

    @ToString.Exclude
    @OneToMany(
            mappedBy = "alex",
            fetch = FetchType.EAGER
    )
    private Set<Authority> authorities = new HashSet<>();
}



