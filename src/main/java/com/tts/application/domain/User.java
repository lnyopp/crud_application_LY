package com.tts.application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    private String email;

    // constructors
    public User() {

    }

    public User(@NotBlank(message = "Name is mandatory") String name,
            @NotBlank(message = "Email is mandatory") String email) {
        this.name = name;
        this.email = email;
    }
    

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
	}

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", name=" + name + "]";
    }





  

 
 
}