
package com.lostandfound.lostfound_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Request {
    @Id
    @GeneratedValue
    private Long id;

    private String message;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Item item;

    public enum Status {
        PENDING, APPROVED, REJECTED
    }
}
