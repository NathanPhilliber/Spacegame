import greenfoot.*;
public class Level3 extends Platformer
{
    public Level3()
    {
        this(0,0);
    }

    public Level3(double returnX, double returnY)
    {
        super(returnX, returnY);
        prepare();
    }

    private void prepare()
    {
        //Level Generated

        int offsetX = 0;
        int offsetY = 0;

        setBackground("PlanetOneBG.png");
        addObject(new BulletLauncher(85,0),229+offsetX,148+offsetY);
        addObject(new BulletLauncher(85,0),229+offsetX,202+offsetY);
        addObject(new BulletLauncher(85,0),229+offsetX,256+offsetY);
        addObject(new BulletLauncher(86,180),310+offsetX,175+offsetY);
        addObject(new BulletLauncher(86,180),310+offsetX,229+offsetY);
        addObject(new Block(43),13+offsetX,418+offsetY);
        addObject(new Block(43),13+offsetX,472+offsetY);
        addObject(new Block(43),13+offsetX,445+offsetY);
        addObject(new Block(43),67+offsetX,445+offsetY);
        addObject(new Block(43),40+offsetX,418+offsetY);
        addObject(new Block(43),67+offsetX,418+offsetY);
        addObject(new Block(43),40+offsetX,472+offsetY);
        addObject(new Block(43),67+offsetX,472+offsetY);
        addObject(new Block(43),40+offsetX,445+offsetY);
        addObject(new Block(43),121+offsetX,445+offsetY);
        addObject(new Block(43),94+offsetX,418+offsetY);
        addObject(new Block(43),121+offsetX,418+offsetY);
        addObject(new Block(43),94+offsetX,472+offsetY);
        addObject(new Block(43),121+offsetX,472+offsetY);
        addObject(new Block(43),94+offsetX,445+offsetY);
        addObject(new Block(43),148+offsetX,418+offsetY);
        addObject(new Block(43),148+offsetX,472+offsetY);
        addObject(new Block(43),148+offsetX,445+offsetY);
        addObject(new Block(43),202+offsetX,445+offsetY);
        addObject(new Block(43),175+offsetX,418+offsetY);
        addObject(new Block(43),202+offsetX,418+offsetY);
        addObject(new Block(43),175+offsetX,472+offsetY);
        addObject(new Block(43),202+offsetX,472+offsetY);
        addObject(new Block(43),175+offsetX,445+offsetY);
        addObject(new Block(43),256+offsetX,445+offsetY);
        addObject(new Block(43),229+offsetX,418+offsetY);
        addObject(new Block(43),256+offsetX,418+offsetY);
        addObject(new Block(43),229+offsetX,472+offsetY);
        addObject(new Block(43),256+offsetX,472+offsetY);
        addObject(new Block(43),283+offsetX,472+offsetY);
        addObject(new Block(43),229+offsetX,445+offsetY);
        addObject(new Block(43),310+offsetX,418+offsetY);
        addObject(new Block(43),283+offsetX,391+offsetY);
        addObject(new Block(43),310+offsetX,391+offsetY);
        addObject(new Block(43),283+offsetX,445+offsetY);
        addObject(new Block(43),310+offsetX,445+offsetY);
        addObject(new Block(43),283+offsetX,418+offsetY);
        addObject(new Block(43),337+offsetX,391+offsetY);
        addObject(new Block(43),364+offsetX,391+offsetY);
        addObject(new Block(43),391+offsetX,391+offsetY);
        addObject(new Block(43),337+offsetX,445+offsetY);
        addObject(new Block(43),337+offsetX,418+offsetY);
        addObject(new Block(43),391+offsetX,445+offsetY);
        addObject(new Block(43),364+offsetX,418+offsetY);
        addObject(new Block(43),391+offsetX,418+offsetY);
        addObject(new Block(43),364+offsetX,472+offsetY);
        addObject(new Block(43),391+offsetX,472+offsetY);
        addObject(new Block(43),364+offsetX,445+offsetY);
        addObject(new Block(43),418+offsetX,418+offsetY);
        addObject(new Block(43),418+offsetX,472+offsetY);
        addObject(new Block(43),418+offsetX,445+offsetY);
        addObject(new Block(43),445+offsetX,418+offsetY);
        addObject(new Block(43),445+offsetX,472+offsetY);
        addObject(new Block(43),445+offsetX,445+offsetY);
        addObject(new Block(43),499+offsetX,445+offsetY);
        addObject(new Block(43),472+offsetX,418+offsetY);
        addObject(new Block(43),499+offsetX,418+offsetY);
        addObject(new Block(43),472+offsetX,472+offsetY);
        addObject(new Block(43),499+offsetX,472+offsetY);
        addObject(new Block(43),472+offsetX,445+offsetY);
        addObject(new Block(43),526+offsetX,418+offsetY);
        addObject(new Block(43),526+offsetX,472+offsetY);
        addObject(new Block(43),526+offsetX,445+offsetY);
        addObject(new Block(43),580+offsetX,445+offsetY);
        addObject(new Block(43),553+offsetX,418+offsetY);
        addObject(new Block(43),580+offsetX,418+offsetY);
        addObject(new Block(43),553+offsetX,472+offsetY);
        addObject(new Block(43),580+offsetX,472+offsetY);
        addObject(new Block(43),553+offsetX,445+offsetY);
        addObject(new Block(43),634+offsetX,445+offsetY);
        addObject(new Block(43),607+offsetX,418+offsetY);
        addObject(new Block(43),634+offsetX,418+offsetY);
        addObject(new Block(43),607+offsetX,472+offsetY);
        addObject(new Block(43),634+offsetX,472+offsetY);
        addObject(new Block(43),607+offsetX,445+offsetY);
        addObject(new Block(43),688+offsetX,445+offsetY);
        addObject(new Block(43),661+offsetX,418+offsetY);
        addObject(new Block(43),688+offsetX,418+offsetY);
        addObject(new Block(43),715+offsetX,418+offsetY);
        addObject(new Block(43),661+offsetX,472+offsetY);
        addObject(new Block(43),688+offsetX,472+offsetY);
        addObject(new Block(43),661+offsetX,445+offsetY);
        addObject(new Block(43),742+offsetX,472+offsetY);
        addObject(new Block(43),715+offsetX,445+offsetY);
        addObject(new Block(43),742+offsetX,445+offsetY);
        addObject(new Block(43),769+offsetX,445+offsetY);
        addObject(new Block(43),715+offsetX,499+offsetY);
        addObject(new Block(43),742+offsetX,499+offsetY);
        addObject(new Block(43),769+offsetX,499+offsetY);
        addObject(new Block(43),715+offsetX,472+offsetY);
        addObject(new Block(43),769+offsetX,472+offsetY);
        addObject(new PlatformPlayer(),67+offsetX,337+offsetY);

    }
}
