package com.birthae.fundingservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="funding")
public class Funding extends CommonEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name="user_id")
    private int userId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int raised;

    @Column(nullable = false)
    private int goal;

    @Column(nullable = false, name="is_private")
    private boolean isPrivate;

    @Column(nullable = false, updatable = false, name="is_success")
    private boolean is_success;

}
