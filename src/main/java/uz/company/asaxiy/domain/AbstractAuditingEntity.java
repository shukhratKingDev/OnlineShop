package uz.company.asaxiy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Powered by: Shuxratjon Rayimjonov
 * Date: 19.02.2023 18:34
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditingEntity extends SimpleEntity implements Serializable {

    static final long serialVersionUID = 3L;

    @Column(name = "deleted ", columnDefinition = "boolean default false")
    protected boolean deleted;

    @CreatedBy
    @Column(name = "creator_id")
    protected String creatorId;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id", insertable = false, updatable = false)
    protected User creator;

    @LastModifiedBy
    @Column(name = "updater_id")
    protected String updaterId;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "updater_id", insertable = false, updatable = false)
    protected User updater;

    @CreatedDate
    @Column(name = "created_date")
    @JsonIgnore
    protected LocalDateTime createdDate = LocalDateTime.now();

    @LastModifiedBy
    @Column(name = "updated_date")
    @JsonIgnore
    protected LocalDateTime updatedDate = LocalDateTime.now();
}
