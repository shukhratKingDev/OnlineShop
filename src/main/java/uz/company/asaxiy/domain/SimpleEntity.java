package uz.company.asaxiy.domain;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

/**
 * Powered by: Shuxratjon Rayimjonov
 * Date: 19.02.2023 18:35
 */
@MappedSuperclass
@Getter
@Setter
public class SimpleEntity implements Serializable {

    static final long serialVersionUID = 1L;
    @Id
    protected String id;

    public SimpleEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
