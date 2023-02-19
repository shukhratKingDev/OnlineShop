package uz.company.asaxiy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import uz.company.asaxiy.dto.CommonDTO.CommonDTO;

import java.io.Serializable;

/**
 * Powered by: Shuxratjon Rayimjonov
 * Date: 19.02.2023 18:35
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {

    static final long serialVersionUID = 2L;

    @Column(name = "deleted", columnDefinition = "boolean default false")
    protected boolean deleted = false;

    public CommonDTO toCommonDTO() {
        return null;
    }

    public String getName() {
        return null;
    }
}
