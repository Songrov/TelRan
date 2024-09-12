package telran.homework;


    // 1.Добавьте валидацию в класс Card что name должно быть не пустым и длиной не менее 5 символов
    @Entity
    @Table(name = "cards")
    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public class Card {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(min = 5)
        private String name;

        @ManyToMany(
                fetch = FetchType.LAZY,        cascade = {
                CascadeType.ALL            CascadeType.MERGE
        },
                mappedBy = "cards
        )
        @JsonIgnore
        @ToString.Exclude
        @EqualsAndHashCode.Exclude
        private Set<Product> products = new HashSet<>();
    }









//2.Добавьте валидацию email для UserDetail


    @Entity
    @Table(name = "details")
    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public class UserDetail {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long userDetailId;

        @NotBlank
        @Email
        private String email;

        @YearsBetween(years = 2, message = "Date should not be 2 years apart from now")
        private Date dob;
        private String tel;

        @OneToOne
        @JoinColumn(
                name = "user_id",
                referencedColumnName = "userId    )
                private User user;
    }


