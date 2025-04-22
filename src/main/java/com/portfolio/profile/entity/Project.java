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

    @NotBlank
    private String gitHubLink;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title =title;
    }

    public String getImageUrl(){
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl){
        this.ImageUrl = ImageUrl;
    }

    public String getAboutProj(){
        return aboutProj;
    }

    public void setAboutProj(String about){
        this.aboutProj = about;
    }
}
