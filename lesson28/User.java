package telran.homework.lesson28;


import de.telran.myshop.repository.CommentsRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "users")
@RestController
public class User {

    @Autowired
    private CommentsRepository commentsRepository;

    @GetMapping("/comments")
    public Iterable<Comment> getAllComments(){
        return commentsRepository.findAll();
    }


    // добавьте колонки Long userId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    // чтобы генерировалась как IDENTITY

    // @Transient - если не хочу чтобы колонка создавалась в таблице базы данных
    private String password;
    private String login;

    // не является необходимым
//    @OneToOne(mappedBy = "user")
//    private UserDetail userDetail;

}
