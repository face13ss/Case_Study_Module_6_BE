package com.codegym.lastwhisper.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @JsonIgnore
    @CreatedBy
    private String createBy;

    @JsonIgnore
    @CreatedBy
    private ZonedDateTime createDate;

    @JsonIgnore
    @CreatedBy
    private String updateBy;

//    @JsonIgnore
//    private String version;
}
