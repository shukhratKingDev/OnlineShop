package uz.company.asaxiy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 11.01.2023 10:47
 */
@Getter
@Setter
@Entity
@Table(name = "users")
@SQLDelete(sql = "update users set deleted='true' where  id=?")
public class User extends AbstractAuditingEntity implements Serializable {

    static final long serialVersionUID = 4L;

    @NotNull
    @Size(max = 50, min = 1)
    @Column(name = "login", nullable = false)
    String login;

    @NotNull
    @Size(max = 30, min = 1)
    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "patronymic")
    String patronymic;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        return id != null && id.equals(((User) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
