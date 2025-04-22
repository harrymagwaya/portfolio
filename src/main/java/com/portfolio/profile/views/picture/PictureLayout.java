package com.portfolio.profile.views.picture;

import javax.imageio.ImageIO;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;



public class PictureLayout extends HorizontalLayout{
    public PictureLayout(){
        Image picture = new Image("/3375.jpg.webp", "my-picture");
        add(picture);
    }
}

