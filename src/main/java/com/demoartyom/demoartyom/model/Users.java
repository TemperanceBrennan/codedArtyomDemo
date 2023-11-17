package com.demoartyom.demoartyom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Table(name="testusers")
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique = true)
    private  long id;

    @Column(name="firstname", nullable=false)
    private String firstname;

    @Column(name="lastname", nullable=false)
    private String surname;

    @Column(name="email", nullable=false, unique = true)
    private String email;


    @Column(name="imageurl", nullable=false)
    private String imageUrl;

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name="status", nullable=false)
    private String status;


    public Users(long id, String firstname, String surname, String email, String imageUrl, String status) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public long getId() {
        return this.id;
    }


    public String getStatus() {
        return this.status;
    }
}
