package com.portfolio.profile.views.nav;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MainLayout  extends AppLayout{
    public MainLayout(){

        addHeader();
        addFooter();
    }


    private void addHeader() {
       
        
    } 
    
    private void addFooter() {
        Icon facebook = VaadinIcon.BRIEFCASE.create();
        Icon homeIcon = VaadinIcon.HOME.create();
        Icon callIcon = VaadinIcon.PHONE_LANDLINE.create();
        Div socials = new Div();
        socials.add(facebook, homeIcon, callIcon);

        HorizontalLayout layout = new HorizontalLayout();
        layout.add(socials);
    }   
        
}


