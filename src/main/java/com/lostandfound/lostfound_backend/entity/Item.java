package com.lostandfound.lostfound_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private User user;

    public enum Status {
        LOST, FOUND, CLAIMED
    }
}
