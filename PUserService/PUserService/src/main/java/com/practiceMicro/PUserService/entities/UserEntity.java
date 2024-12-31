package com.practiceMicro.PUserService.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "micro_users")
public class UserEntity {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ABOUT")
    private String about;

    @Transient  //database will not be affected by this
    private List<RatingEntity> ratings;

    public UserEntity() {
    }

    public UserEntity(String id, String name, String email, String about) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.about = about;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    // Private constructor to enforce usage of the builder
    private UserEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.about = builder.about;
    }

    public void setUserId(String randomUserId) {
        this.id = randomUserId;
    }


    // Static inner class for the builder pattern
    public static class Builder {
        private String id;
        private String name;
        private String email;
        private String about;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAbout(String about) {
            this.about = about;
            return this;
        }

        public UserEntity build() {
            return new UserEntity(this);
        }
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAbout() {
        return about;
    }
}
