package com.portfolio.profile.views.picture;

import javax.imageio.ImageIO;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;



public class Picture extends HorizontalLayout{
    public Picture(){
        Image picture = new Image("", "my-picture");
    }
}
