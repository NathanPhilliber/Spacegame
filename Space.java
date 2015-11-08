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
import java.util.ArrayList;
import java.util.Arrays;

public class Space extends World
{

    private Ship ship;
    boolean isDown = false;
    MouseInfo mouse;
    int mx,my;
    int prevx,prevy;
    int alpha = 255;
    int key = 9;
    double tempWep = 0; //static
    int mode = 0;
    boolean firstpass = true;
    ScrollingListener scroll = new ScrollingListener(); //static
    JPanel panel = WorldHandler.getInstance().getWorldCanvas();

    private boolean readPause = true;
    public boolean isPaused=false;
    public boolean setPause; //static 

    private boolean projectileEnabled = true; //DO NOT DIRECTLY EDIT THESE
    private boolean missileEnabled = true;
    private boolean beamEnabled = true;
    private boolean mineEnabled = true;
    private boolean fireballEnabled = true;
    private boolean plasmaballEnabled = true;
    
    public int sector;
    public int secx;
    public int secy;
    
    MapButton mapButton = new MapButton();
    MapBackButton mapBackButton = new MapBackButton();
    
    GotoShopButton gotoShopButton = new GotoShopButton();

    private double spawnX, spawnY;
    //Contructor, spawn world
    public Space()
    {    
        this(0,0);
    }

    public Space(double spawnX, double spawnY){
        super(OptionsMenu.getWorldWidth(), OptionsMenu.getWorldHeight(), 1, false);
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        prepare();
    }

    public void scrollListener()
    {
        panel.addMouseWheelListener(scroll);
    }

    protected void prepare()
    {
        isPaused=false;
        ship = new Ship(spawnX,spawnY);

        scrollListener();

        setPaintOrder(RespawnButton.class, RespawnMenu.class,
            MapBackButton.class, PlayerIcon.class, Map.class, MapButton.class, GotoShopButton.class, GoldText.class,
            Counter.class, TutorialObjectManager.class, DockMenu.class, OutsideMP.class, 
            PlayerShip.class, PlanetMP.class, EnemyShip.class, InsideMP.class, IconProjectile.class, 
            IconFire.class, MissleIcon.class, IconPlasma.class, IconLaser.class, IconMine.class, 
            WeaponBG.class, BoostBarInside.class, BoostBarSegment.class, BoostBarOutside.class,
            Beam.class,  BeamHUD.class, PlanetLevelText.class, Number.class, Digit.class,AlienShip.class, EnemyShip.class, DamageBar.class,
            Projectile.class, Missile.class, Cannon.class, Ship.class, PlasmaBall.class, Mine.class, 
            Fireball.class, Particle.class, Asteroid.class, Planet.class, BackgroundStar.class);

        PlayerShip playermp = new PlayerShip();
        addObject(playermp, 800, 405);

        InsideMP insidemp = new InsideMP();
        addObject(insidemp, 800, 405);

        OutsideMP outsidemp = new OutsideMP();
        addObject(outsidemp, 800, 405);

        addObject(new Cannon(),getWidth()/2,getHeight()/2);

        addObject(new BoostBarOutside(), 460, 508);
        addObject(new BoostBarInside(), 460, 508);
        
        addObject(mapButton, 660,18);
        addObject(gotoShopButton, 592, 18);
        
        secx = (int) Math.ceil(((int) ship.getSpaceX()/10 + 460)/getWidth());
        secy = (int) Math.ceil(((int) ship.getSpaceY()/10 + 270)/getWidth());
    }

    public void drawWeaponGUI(boolean proj, boolean beam, boolean missile, boolean mine, boolean fire, boolean plasma){
        projectileEnabled = proj;
        missileEnabled = missile;
        beamEnabled = beam;
        mineEnabled = mine;
        fireballEnabled = fire;
        plasmaballEnabled = plasma;

        if(mine){
            WeaponBG weaponbg4 = new WeaponBG();  
            addObject(weaponbg4, 48, 300);

            IconMine iconmine = new IconMine();
            addObject(iconmine, 48, 299);

        }

        if(beam){
            WeaponBG weaponbg2 = new WeaponBG();  
            addObject(weaponbg2, 48, 140);

            IconLaser iconlaser = new IconLaser();
            addObject(iconlaser, 47, 138);

        }
        if(plasma){
            WeaponBG weaponbg6 = new WeaponBG();
            addObject(weaponbg6, 48, 460);

            IconPlasma iconplasma = new IconPlasma();
            addObject(iconplasma, 48, 73);
            iconplasma.setLocation(47, 80);
            removeObject(iconplasma);

            IconPlasma iconplasma2 = new IconPlasma();
            addObject(iconplasma2, 47, 459);

        }

        if(missile){
            WeaponBG weaponbg3 = new WeaponBG();        
            addObject(weaponbg3, 48, 220);

            MissleIcon missleicon = new MissleIcon();
            addObject(missleicon, 46, 53);
            MissleIcon missleicon2 = new MissleIcon();
            addObject(missleicon2, 44, 63);
            missleicon.setLocation(49, 50);
            missleicon2.setLocation(41, 64);
            missleicon2.setLocation(40, 211);
            missleicon.setLocation(52, 224);
        }

        if(fire){
            WeaponBG weaponbg5 = new WeaponBG();
            addObject(weaponbg5, 48, 380);

            IconFire iconfire = new IconFire();
            addObject(iconfire, 49, 364);
            iconfire.setLocation(47, 377);
            iconfire.setLocation(49, 376);
            iconfire.setLocation(49, 299);

            iconfire.setLocation(110, 355);
            removeObject(iconfire);
            IconFire iconfire2 = new IconFire();
            addObject(iconfire2, 49, 375);
            iconfire2.setLocation(45, 372);
            iconfire2.setLocation(47, 377);
        }
        if(proj){
            WeaponBG weaponbg = new WeaponBG();
            addObject(weaponbg, 48, 60);

            IconProjectile anticon = new IconProjectile();
            addObject(anticon, 38, 60);
            IconProjectile anticon2 = new IconProjectile();
            addObject(anticon2, 56, 60);
        }

    }

    public void removeWeaponGUI(){
        List objects = getObjects(HUD.class);

        for(int i = 0; i < objects.size(); i++){
            if(!(objects.get(i) instanceof weaponGUI)){
                objects.remove(i);
                i -= 1;
            }
        }
        removeObjects(objects);
    }

    private boolean pauseOnce = true;
    private int totalEscape = 0;

    public void act()
    {
        boolean first = true;
        //System.out.println(totalEscape);
        if(Greenfoot.isKeyDown("escape") && totalEscape == 0 && !isPaused)
        {
            if(first)
            {
                setPause = true;
                addObject(new MenuBG(), getWidth()/2, getHeight()/2);
                
                
                first = false;
            }
        }
        else if (Greenfoot.isKeyDown("escape") && isPaused && totalEscape == 0)
        {
            setPause = false;
            first = true;
            List<DockMenu> dockMenu = getObjects(DockMenu.class);
            removeObjects(dockMenu);
        }
        if(Greenfoot.isKeyDown("escape") && pauseOnce)
        {
            pauseOnce = false;
            totalEscape += 1;
        }
        if(!Greenfoot.isKeyDown("escape") && !pauseOnce)
        {
            pauseOnce = true;
            totalEscape -= 1;
        }
        if(setPause == true)
        {
            isPaused = true;
        }
        if(setPause == false)
        {
            isPaused = false;
        }
        if(!isPaused)
        {
            getWeapon();
        }
        openMap(false);
    }

    public boolean getIsPaused()
    {
        return isPaused;
    }

    //Return ship object
    public Ship getShip(){
        return ship;
    }

    public double getWeapon()
    {
        tempWep += scroll.getScroll();

        int numType = weaponType();

        if (numType != -1){
            tempWep = numType;
        }
        if(tempWep < 0)
        {
            tempWep = 0;
        }
        if(tempWep > 5)
        {
            tempWep = 5;
        }
        if(tempWep == 0 && projectileEnabled == false){
            tempWep++;
        }
        if(tempWep == 1 && beamEnabled == false){
            tempWep++;
        }
        if(tempWep == 2 && missileEnabled == false){
            tempWep++;
        }
        if(tempWep == 3 && mineEnabled == false){
            tempWep++;
        }
        if(tempWep == 4 && fireballEnabled == false){
            tempWep++;
        }
        if(tempWep == 5 && plasmaballEnabled == false){
            tempWep = 0;
        }
        return tempWep;
    } 

    private int weaponType()
    {
        int weaponType = -1;
        if (Greenfoot.isKeyDown("1"))
        {
            weaponType = 0;
        }
        if (Greenfoot.isKeyDown("2"))
        {
            weaponType = 1;
        }
        if (Greenfoot.isKeyDown("3"))
        {
            weaponType = 2;
        }
        if (Greenfoot.isKeyDown("4"))
        {
            weaponType = 3;
        }
        if (Greenfoot.isKeyDown("5"))
        {
            weaponType = 4;
        }
        if (Greenfoot.isKeyDown("6"))
        {
            weaponType = 5;
        }

        return weaponType;
    }

    private boolean mapIsOpen;
    private boolean firstPass = true;
    private boolean pressOnce = true;
    private int totalClick = 0;
    public static int getIndexOf( int toSearch, int[] tab ){
         int i = 0;
         try{
             while(!(tab[i] == toSearch) )
             {  i++; }
             
             return i;
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             return -1;
         }
    }
    public void openMap(boolean override)
    {
        if((Greenfoot.isKeyDown("t") && !mapIsOpen && totalClick == 0) || (override && !mapIsOpen))
        {
            if(firstPass)
            {
                int x = (int) (ship.getSpaceX()/10) + 460;
                int y = (int) (ship.getSpaceY()/10) + 270;
                int newx = (int) (ship.getSpaceX()/10) + 460;
                int newy = (int) (ship.getSpaceY()/10) + 270;

                //int[] secArray = {0, 1, 2, 10, 11, 12, 20, 21, 22};
                
                int[] secArray = {0, 10, 20, 1, 11, 21, 2, 12, 22};
                
                
                secx = (x>0) ? (int) Math.ceil(x/getWidth()) : -1;
                secy = (y>0) ? (int) Math.ceil(y/getHeight()) : -1;
                
                String a = secx + "" + secy;
                String b = "-1";
                String secPos =  (secx<0 || secy<0) ? b : a;
                int secPosInt = Integer.parseInt(secPos);
                
                int sectorFake = (getIndexOf(secPosInt, secArray));
                sector = sectorFake;
                
                Map map = new Map(sector);

                System.out.println(secPos);
                
                if(x > getWidth())
                {
                    newx = x - getWidth()*secx;
                }
                if(y > getHeight())
                {
                    newy = y - getHeight()*secy;
                }
                if(x < 0)
                {
                    newx = x + getWidth()*secx;
                }
                if(y < 0)
                {
                    newy = y + getHeight()*secy;
                }
                addObject(map, getWidth()/2, getHeight()/2);
                addObject(new PlayerIcon(), newx, newy);
                addObject(mapBackButton, 471, 18);
                mapIsOpen = true;
                setPause = true;
                firstPass = false;
            }
        }
        else if((Greenfoot.isKeyDown("t") && mapIsOpen && totalClick == 0) || (mapIsOpen && override))
        {
            List<MapItems> m = getObjects(MapItems.class);
            removeObjects(m);
            removeObject(mapBackButton);
            mapIsOpen = false;
            firstPass = true;
            setPause = false;
        }
        if(Greenfoot.isKeyDown("t") && pressOnce)
        {
            pressOnce = false;
            totalClick += 1;
        }
        if(!Greenfoot.isKeyDown("t") && !pressOnce)
        {
            pressOnce = true;
            totalClick -= 1;
        }
    }
    public int getSectorMiddleX()
    {
        return 9300*secx;
    }
    
    public int getSectorMiddleY()
    {
        return 2700*secy;
    }
}

//Classception
class ScrollingListener implements MouseWheelListener
{
    double aftAmount = 0;
    double initAmount = 0;

    public void mouseWheelMoved(MouseWheelEvent e){
        initAmount += e.getWheelRotation();                 
        e.consume();
    }

    public double getScroll(){
        double t = Math.round(initAmount/2);

        initAmount = 0;
        return t;
    }
}