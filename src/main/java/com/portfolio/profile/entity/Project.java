package com.portfolio.profile.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Project {
    
    @NotBlank
    private String title;

    @NotBlank
    private String ImageUrl;

    @NotBlank
    private String aboutProj;

    
}
