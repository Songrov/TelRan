package com.example.locker220124.entity;
/*
. Добавьте пользователя alex из группы ARTISTS
Создайте в контроллере новый метод music, принимающий строку и возвращающий эту строку в верхнем регистре
Разрешите выполение этого метода контроллера только членам группу ARTISTS
4. Сделайте так, чтобы вызов этого метода логировался в консоль приложения с уровнем INFO
 c помощью AOP в виде: "метод пользователь группа вход выход"


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
*/


