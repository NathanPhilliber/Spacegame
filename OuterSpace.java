import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.WorldHandler;  
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.util.List;

public class OuterSpace extends Space
{

    //World worldOne = new WorldOne();
    //World shop = new Shop();
    //Contructor, spawn world
    public OuterSpace()
    {    
        super();
        prepareObjects();
    }

    private void prepareObjects()
    {
        super.prepare();
        addObject(getShip(), (int)getWidth()/2, (int)getHeight()/2);

        //addObject(new AlienShip(1000,1000), 1000,1000);

        /********  ADD YOUR SPACE OBJECT STUFF HERE  *******/
        addObject(new AlienShip(0,0), 0,0);

        Planet planetOne = new Planet(0,0, new WorldOne(), "images/Planet1.png");
        addObject(planetOne,0, 0);

        Planet planetOne2 = new Planet(2500,400, new WorldOne(), "images/Planet2.png");
        addObject(planetOne2,0, 0);

        Planet planetTwo = new Planet(500, 1000, new WorldOne(), "images/Planet3.png");
        addObject(planetTwo,0, 0);

        Planet shopPlanet = new Planet(0,2000, new Shop(), "images/PlanetShop.png");
        addObject(shopPlanet, 0, 0); 

    }

    public void act()
    {
        super.act();
    }

}

    