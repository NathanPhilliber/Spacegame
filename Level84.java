import greenfoot.*;

//Level generated by Level Creator
//Level designed by: 

public class Level84 extends Platformer{
    public Level84(){
        this(0,0);
    }

    public Level84(double x, double y){
        super(x,y);
    }

    private boolean firstPass = true;
    public void act()
    {
        if(firstPass)
        {
            prepare();
            firstPass = false;
        }
    }

    public void prepare()
    {
        //Level Generated

        int offsetX = 0;
        int offsetY = (getHeight()-540)/2;

        addObject(new Block(31),-14+offsetX,499+offsetY);
        addObject(new Block(31),13+offsetX,499+offsetY);
        addObject(new Block(31),-14+offsetX,553+offsetY);
        addObject(new Block(31),13+offsetX,553+offsetY);
        addObject(new Block(31),-14+offsetX,526+offsetY);
        addObject(new Block(31),40+offsetX,499+offsetY);
        addObject(new Block(31),40+offsetX,553+offsetY);
        addObject(new Block(31),67+offsetX,499+offsetY);
        addObject(new Block(31),67+offsetX,553+offsetY);
        addObject(new Block(31),94+offsetX,499+offsetY);
        addObject(new Block(31),94+offsetX,553+offsetY);
        addObject(new Block(31),121+offsetX,499+offsetY);
        addObject(new Block(31),121+offsetX,553+offsetY);
        addObject(new Block(31),148+offsetX,499+offsetY);
        addObject(new Block(31),175+offsetX,499+offsetY);
        addObject(new Block(31),202+offsetX,499+offsetY);
        addObject(new Block(31),148+offsetX,553+offsetY);
        addObject(new Block(31),175+offsetX,553+offsetY);
        addObject(new Block(31),202+offsetX,553+offsetY);
        addObject(new Block(31),229+offsetX,499+offsetY);
        addObject(new Block(31),229+offsetX,553+offsetY);
        addObject(new Block(31),256+offsetX,499+offsetY);
        addObject(new Block(31),283+offsetX,499+offsetY);
        addObject(new Block(31),256+offsetX,553+offsetY);
        addObject(new Block(31),283+offsetX,553+offsetY);
        addObject(new Block(31),310+offsetX,499+offsetY);
        addObject(new Block(31),310+offsetX,553+offsetY);
        addObject(new Block(31),337+offsetX,499+offsetY);
        addObject(new Block(31),364+offsetX,499+offsetY);
        addObject(new Block(31),337+offsetX,553+offsetY);
        addObject(new Block(31),364+offsetX,553+offsetY);
        addObject(new Block(31),391+offsetX,499+offsetY);
        addObject(new Block(31),391+offsetX,553+offsetY);
        addObject(new Block(31),418+offsetX,499+offsetY);
        addObject(new Block(31),445+offsetX,499+offsetY);
        addObject(new Block(31),418+offsetX,553+offsetY);
        addObject(new Block(31),445+offsetX,553+offsetY);
        addObject(new Block(31),472+offsetX,499+offsetY);
        addObject(new Block(31),499+offsetX,499+offsetY);
        addObject(new Block(31),472+offsetX,553+offsetY);
        addObject(new Block(31),499+offsetX,553+offsetY);
        addObject(new Block(31),526+offsetX,499+offsetY);
        addObject(new Block(31),526+offsetX,553+offsetY);
        addObject(new Block(31),553+offsetX,499+offsetY);
        addObject(new Block(31),580+offsetX,499+offsetY);
        addObject(new Block(31),553+offsetX,553+offsetY);
        addObject(new Block(31),580+offsetX,553+offsetY);
        addObject(new Block(31),607+offsetX,553+offsetY);
        addObject(new Block(31),634+offsetX,553+offsetY);
        addObject(new Block(31),661+offsetX,553+offsetY);
        addObject(new Block(31),688+offsetX,553+offsetY);
        addObject(new Block(31),715+offsetX,553+offsetY);
        addObject(new Block(31),769+offsetX,499+offsetY);
        addObject(new Block(31),742+offsetX,553+offsetY);
        addObject(new Block(31),769+offsetX,553+offsetY);
        addObject(new Block(31),796+offsetX,553+offsetY);
        addObject(new Block(31),850+offsetX,499+offsetY);
        addObject(new Block(31),823+offsetX,499+offsetY);
        addObject(new Block(31),877+offsetX,499+offsetY);
        addObject(new Block(31),904+offsetX,499+offsetY);
        addObject(new Block(31),931+offsetX,499+offsetY);
        addObject(new Block(31),904+offsetX,553+offsetY);
        addObject(new Block(31),931+offsetX,553+offsetY);
        addObject(new Block(31),958+offsetX,553+offsetY);
        addObject(new Block(31),985+offsetX,553+offsetY);
        addObject(new Block(31),1039+offsetX,499+offsetY);
        addObject(new Block(31),1012+offsetX,553+offsetY);
        addObject(new Block(31),1039+offsetX,553+offsetY);
        addObject(new Block(31),1066+offsetX,499+offsetY);
        addObject(new Block(31),1066+offsetX,553+offsetY);
        addObject(new Block(31),1093+offsetX,499+offsetY);
        addObject(new Block(31),1120+offsetX,499+offsetY);
        addObject(new Block(31),1147+offsetX,499+offsetY);
        addObject(new Block(31),1093+offsetX,553+offsetY);
        addObject(new Block(31),1120+offsetX,553+offsetY);
        addObject(new Block(31),1147+offsetX,553+offsetY);
        addObject(new Block(31),1174+offsetX,499+offsetY);
        addObject(new Block(31),1201+offsetX,499+offsetY);
        addObject(new Block(31),1228+offsetX,499+offsetY);
        addObject(new Block(31),1174+offsetX,553+offsetY);
        addObject(new Block(31),1201+offsetX,553+offsetY);
        addObject(new Block(31),1228+offsetX,553+offsetY);
        addObject(new Block(31),1282+offsetX,499+offsetY);
        addObject(new Block(31),1255+offsetX,499+offsetY);
        addObject(new Block(31),1309+offsetX,499+offsetY);
        addObject(new Block(31),1309+offsetX,553+offsetY);
        addObject(new Block(31),1336+offsetX,553+offsetY);
        addObject(new Block(31),1363+offsetX,553+offsetY);
        addObject(new Block(31),1390+offsetX,553+offsetY);
        addObject(new Block(31),1417+offsetX,553+offsetY);
        addObject(new Block(31),1444+offsetX,553+offsetY);
        addObject(new Block(31),1471+offsetX,553+offsetY);
        addObject(new Block(31),1768+offsetX,553+offsetY);
        addObject(new Block(31),1795+offsetX,553+offsetY);
        addObject(new Block(31),1822+offsetX,553+offsetY);
        addObject(new Block(31),1849+offsetX,553+offsetY);
        addObject(new Block(31),1876+offsetX,553+offsetY);
        addObject(new Block(31),1903+offsetX,553+offsetY);
        addObject(new Block(31),1930+offsetX,553+offsetY);
        addObject(new Block(31),1957+offsetX,553+offsetY);
        addObject(new Block(31),1984+offsetX,553+offsetY);
        addObject(new Block(31),2011+offsetX,553+offsetY);
        addObject(new Block(31),2038+offsetX,553+offsetY);
        addObject(new Block(31),2065+offsetX,553+offsetY);
        addObject(new Block(31),2092+offsetX,553+offsetY);
        addObject(new Block(31),2119+offsetX,553+offsetY);
        addObject(new Block(31),2146+offsetX,553+offsetY);
        addObject(new Block(31),2173+offsetX,553+offsetY);
        addObject(new Block(31),2200+offsetX,553+offsetY);
        addObject(new Block(31),2227+offsetX,553+offsetY);
        addObject(new Block(31),2254+offsetX,553+offsetY);
        addObject(new Block(31),2281+offsetX,553+offsetY);
        addObject(new Block(31),2308+offsetX,553+offsetY);
        addObject(new Block(31),2335+offsetX,553+offsetY);
        addObject(new Block(31),2362+offsetX,553+offsetY);
        addObject(new Block(31),2389+offsetX,553+offsetY);
        addObject(new Block(31),2416+offsetX,553+offsetY);
        addObject(new Block(31),2443+offsetX,553+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,472+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,445+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,418+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,391+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,364+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,337+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,310+offsetY);
        addObject(new SpikeBlock(84),121+offsetX,472+offsetY);
        addObject(new BulletLauncher(86,180),418+offsetX,472+offsetY);
        addObject(new BulletLauncher(86,180),418+offsetX,445+offsetY);
        addObject(new BulletLauncher(85,0),445+offsetX,445+offsetY);
        addObject(new BulletLauncher(85,0),445+offsetX,472+offsetY);
        addObject(new PlatformPlayer(),40+offsetX,337+offsetY);
        addObject(new LavaBlock(2),1336+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1390+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1417+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1444+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1471+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1498+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1525+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1552+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1579+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1606+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1633+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1660+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1687+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1714+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1741+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1768+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1795+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1822+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1849+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1876+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1903+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1930+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1957+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1984+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2011+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2038+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2065+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2092+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2119+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2146+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2254+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2200+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2173+offsetX,526+offsetY);
        addObject(new LavaBlock(2),2227+offsetX,526+offsetY);
        addObject(new LavaBlock(1),2254+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2227+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2200+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2173+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2146+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2038+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2119+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2092+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2065+offsetX,499+offsetY);
        addObject(new LavaBlock(1),2011+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1984+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1957+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1930+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1903+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1876+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1849+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1822+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1795+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1768+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1741+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1714+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1687+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1660+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1633+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1606+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1579+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1552+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1525+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1498+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1471+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1363+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1390+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1417+offsetX,499+offsetY);
        addObject(new LavaBlock(1),1444+offsetX,499+offsetY);
        addObject(new LavaBlock(2),1363+offsetX,526+offsetY);
        addObject(new LavaBlock(1),1336+offsetX,499+offsetY);
        addObject(new Block(31),2470+offsetX,499+offsetY);
        addObject(new Block(31),2470+offsetX,526+offsetY);
        addObject(new SlimeBlock(88),337+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),364+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),391+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),418+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),445+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),472+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),499+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),310+offsetX,283+offsetY);
        addObject(new SlimeBlock(88),283+offsetX,283+offsetY);
        addObject(new Block(65),1282+offsetX,-14+offsetY);
        addObject(new Block(65),1309+offsetX,-14+offsetY);
        addObject(new Block(65),1336+offsetX,-14+offsetY);
        addObject(new Block(65),1336+offsetX,40+offsetY);
        addObject(new Block(65),1336+offsetX,13+offsetY);
        addObject(new Block(65),1363+offsetX,-14+offsetY);
        addObject(new Block(65),1363+offsetX,40+offsetY);
        addObject(new Block(65),1363+offsetX,13+offsetY);
        addObject(new Block(65),1390+offsetX,-14+offsetY);
        addObject(new Block(65),1390+offsetX,40+offsetY);
        addObject(new Block(65),1390+offsetX,13+offsetY);
        addObject(new Block(65),1417+offsetX,-14+offsetY);
        addObject(new Block(65),1417+offsetX,40+offsetY);
        addObject(new Block(65),1417+offsetX,13+offsetY);
        addObject(new Block(65),1444+offsetX,-14+offsetY);
        addObject(new Block(65),1444+offsetX,40+offsetY);
        addObject(new Block(65),1444+offsetX,13+offsetY);
        addObject(new Block(65),1471+offsetX,-14+offsetY);
        addObject(new Block(65),1471+offsetX,40+offsetY);
        addObject(new Block(65),1471+offsetX,13+offsetY);
        addObject(new Block(65),1498+offsetX,-14+offsetY);
        addObject(new Block(65),1498+offsetX,40+offsetY);
        addObject(new Block(65),1498+offsetX,13+offsetY);
        addObject(new Block(65),1525+offsetX,-14+offsetY);
        addObject(new Block(65),1525+offsetX,40+offsetY);
        addObject(new Block(65),1525+offsetX,13+offsetY);
        addObject(new Block(65),1552+offsetX,-14+offsetY);
        addObject(new Block(65),1552+offsetX,40+offsetY);
        addObject(new Block(65),1552+offsetX,13+offsetY);
        addObject(new Block(65),1579+offsetX,-14+offsetY);
        addObject(new Block(65),1579+offsetX,40+offsetY);
        addObject(new Block(65),1579+offsetX,13+offsetY);
        addObject(new Block(65),1606+offsetX,-14+offsetY);
        addObject(new Block(65),1606+offsetX,40+offsetY);
        addObject(new Block(65),1606+offsetX,13+offsetY);
        addObject(new Block(65),1633+offsetX,-14+offsetY);
        addObject(new Block(65),1633+offsetX,40+offsetY);
        addObject(new Block(65),1633+offsetX,13+offsetY);
        addObject(new Block(65),1660+offsetX,-14+offsetY);
        addObject(new Block(65),1660+offsetX,40+offsetY);
        addObject(new Block(65),1660+offsetX,13+offsetY);
        addObject(new Block(65),1687+offsetX,-14+offsetY);
        addObject(new Block(65),1687+offsetX,40+offsetY);
        addObject(new Block(65),1687+offsetX,13+offsetY);
        addObject(new Block(65),1714+offsetX,-14+offsetY);
        addObject(new Block(65),1714+offsetX,40+offsetY);
        addObject(new Block(65),1714+offsetX,13+offsetY);
        addObject(new Block(65),1741+offsetX,-14+offsetY);
        addObject(new Block(65),1741+offsetX,40+offsetY);
        addObject(new Block(65),1741+offsetX,13+offsetY);
        addObject(new Block(65),1768+offsetX,-14+offsetY);
        addObject(new Block(65),1768+offsetX,40+offsetY);
        addObject(new Block(65),1768+offsetX,13+offsetY);
        addObject(new Block(65),1795+offsetX,-14+offsetY);
        addObject(new Block(65),1795+offsetX,40+offsetY);
        addObject(new Block(65),1795+offsetX,13+offsetY);
        addObject(new Block(65),1822+offsetX,-14+offsetY);
        addObject(new Block(65),1822+offsetX,40+offsetY);
        addObject(new Block(65),1822+offsetX,13+offsetY);
        addObject(new Block(65),1849+offsetX,-14+offsetY);
        addObject(new Block(65),1849+offsetX,40+offsetY);
        addObject(new Block(65),1849+offsetX,13+offsetY);
        addObject(new Block(65),1876+offsetX,-14+offsetY);
        addObject(new Block(65),1876+offsetX,40+offsetY);
        addObject(new Block(65),1876+offsetX,13+offsetY);
        addObject(new Block(65),1903+offsetX,-14+offsetY);
        addObject(new Block(65),1903+offsetX,40+offsetY);
        addObject(new Block(65),1903+offsetX,13+offsetY);
        addObject(new Block(65),1930+offsetX,-14+offsetY);
        addObject(new Block(65),1930+offsetX,40+offsetY);
        addObject(new Block(65),1930+offsetX,13+offsetY);
        addObject(new Block(65),1957+offsetX,-14+offsetY);
        addObject(new Block(65),1957+offsetX,40+offsetY);
        addObject(new Block(65),1957+offsetX,13+offsetY);
        addObject(new Block(65),1984+offsetX,-14+offsetY);
        addObject(new Block(65),1984+offsetX,40+offsetY);
        addObject(new Block(65),1984+offsetX,13+offsetY);
        addObject(new Block(65),2011+offsetX,-14+offsetY);
        addObject(new Block(65),2011+offsetX,40+offsetY);
        addObject(new Block(65),2011+offsetX,13+offsetY);
        addObject(new Block(65),2065+offsetX,13+offsetY);
        addObject(new Block(65),2038+offsetX,-14+offsetY);
        addObject(new Block(65),2065+offsetX,-14+offsetY);
        addObject(new Block(65),2038+offsetX,40+offsetY);
        addObject(new Block(65),2065+offsetX,40+offsetY);
        addObject(new Block(65),2038+offsetX,13+offsetY);
        addObject(new Block(65),2092+offsetX,-14+offsetY);
        addObject(new Block(65),2092+offsetX,40+offsetY);
        addObject(new Block(65),2092+offsetX,13+offsetY);
        addObject(new Block(65),2119+offsetX,-14+offsetY);
        addObject(new Block(65),2119+offsetX,40+offsetY);
        addObject(new Block(65),2119+offsetX,13+offsetY);
        addObject(new Block(65),2146+offsetX,-14+offsetY);
        addObject(new Block(65),2146+offsetX,40+offsetY);
        addObject(new Block(65),2146+offsetX,13+offsetY);
        addObject(new Block(65),2173+offsetX,-14+offsetY);
        addObject(new Block(65),2173+offsetX,40+offsetY);
        addObject(new Block(65),2173+offsetX,13+offsetY);
        addObject(new Block(65),2200+offsetX,-14+offsetY);
        addObject(new Block(65),2200+offsetX,40+offsetY);
        addObject(new Block(65),2200+offsetX,13+offsetY);
        addObject(new Block(65),2227+offsetX,-14+offsetY);
        addObject(new Block(65),2227+offsetX,40+offsetY);
        addObject(new Block(65),2227+offsetX,13+offsetY);
        addObject(new Block(65),2281+offsetX,13+offsetY);
        addObject(new Block(65),2254+offsetX,-14+offsetY);
        addObject(new Block(65),2281+offsetX,-14+offsetY);
        addObject(new Block(65),2254+offsetX,40+offsetY);
        addObject(new Block(65),2281+offsetX,40+offsetY);
        addObject(new Block(65),2254+offsetX,13+offsetY);
        addObject(new Block(65),2335+offsetX,13+offsetY);
        addObject(new Block(65),2308+offsetX,-14+offsetY);
        addObject(new Block(65),2335+offsetX,-14+offsetY);
        addObject(new Block(65),2308+offsetX,40+offsetY);
        addObject(new Block(65),2335+offsetX,40+offsetY);
        addObject(new Block(65),2308+offsetX,13+offsetY);
        addObject(new Block(65),2443+offsetX,-14+offsetY);
        addObject(new Block(65),2443+offsetX,40+offsetY);
        addObject(new Block(65),2443+offsetX,13+offsetY);
        addObject(new Block(65),2389+offsetX,13+offsetY);
        addObject(new Block(65),2362+offsetX,-14+offsetY);
        addObject(new Block(65),2389+offsetX,-14+offsetY);
        addObject(new Block(65),2416+offsetX,-14+offsetY);
        addObject(new Block(65),2362+offsetX,40+offsetY);
        addObject(new Block(65),2389+offsetX,40+offsetY);
        addObject(new Block(65),2416+offsetX,40+offsetY);
        addObject(new Block(65),2362+offsetX,13+offsetY);
        addObject(new Block(65),2416+offsetX,13+offsetY);
        addObject(new Block(65),2470+offsetX,13+offsetY);
        addObject(new Block(65),2470+offsetX,40+offsetY);
        addObject(new Block(65),283+offsetX,310+offsetY);
        addObject(new Block(65),310+offsetX,310+offsetY);
        addObject(new Block(65),337+offsetX,310+offsetY);
        addObject(new Block(65),364+offsetX,310+offsetY);
        addObject(new Block(65),391+offsetX,310+offsetY);
        addObject(new Block(65),418+offsetX,310+offsetY);
        addObject(new Block(65),445+offsetX,310+offsetY);
        addObject(new Block(65),472+offsetX,310+offsetY);
        addObject(new Block(65),499+offsetX,310+offsetY);
        addObject(new Block(31),2443+offsetX,526+offsetY);
        addObject(new Block(31),2416+offsetX,526+offsetY);
        addObject(new Block(31),2389+offsetX,526+offsetY);
        addObject(new Block(31),2362+offsetX,526+offsetY);
        addObject(new Block(31),2335+offsetX,526+offsetY);
        addObject(new Block(31),2308+offsetX,526+offsetY);
        addObject(new Block(31),2281+offsetX,526+offsetY);
        addObject(new Block(31),2281+offsetX,499+offsetY);
        addObject(new Block(31),2308+offsetX,499+offsetY);
        addObject(new Block(31),2335+offsetX,499+offsetY);
        addObject(new Block(31),2362+offsetX,499+offsetY);
        addObject(new Block(31),2389+offsetX,499+offsetY);
        addObject(new Block(31),2416+offsetX,499+offsetY);
        addObject(new Block(31),2443+offsetX,499+offsetY);
        addObject(new ExitPortal(),2443+offsetX,418+offsetY);
        addObject(new Block(65),2497+offsetX,13+offsetY);
        addObject(new Block(65),2497+offsetX,40+offsetY);
        addObject(new Block(65),2497+offsetX,67+offsetY);
        addObject(new Block(65),2497+offsetX,94+offsetY);
        addObject(new Block(65),2497+offsetX,121+offsetY);
        addObject(new Block(65),2497+offsetX,148+offsetY);
        addObject(new Block(65),2497+offsetX,175+offsetY);
        addObject(new Block(65),2497+offsetX,202+offsetY);
        addObject(new Block(65),2497+offsetX,229+offsetY);
        addObject(new Block(31),2497+offsetX,283+offsetY);
        addObject(new Block(31),2497+offsetX,310+offsetY);
        addObject(new Block(31),2497+offsetX,337+offsetY);
        addObject(new Block(31),2497+offsetX,364+offsetY);
        addObject(new Block(31),2497+offsetX,391+offsetY);
        addObject(new Block(31),2497+offsetX,418+offsetY);
        addObject(new Block(31),2497+offsetX,445+offsetY);
        addObject(new Block(31),2497+offsetX,472+offsetY);
        addObject(new Block(31),2497+offsetX,499+offsetY);
        addObject(new Block(31),2497+offsetX,526+offsetY);
        addObject(new Block(65),2497+offsetX,256+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,283+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,256+offsetY);
        addObject(new ClimbBlock(24),256+offsetX,229+offsetY);
        addObject(new Block(65),1309+offsetX,40+offsetY);
        addObject(new Block(65),1309+offsetX,13+offsetY);
        addObject(new Block(65),1282+offsetX,13+offsetY);
        addObject(new Block(65),1282+offsetX,40+offsetY);
        addObject(new Block(65),1255+offsetX,40+offsetY);
        addObject(new Block(65),1228+offsetX,40+offsetY);
        addObject(new Block(65),1228+offsetX,13+offsetY);
        addObject(new Block(65),1255+offsetX,13+offsetY);
        addObject(new Block(65),1201+offsetX,13+offsetY);
        addObject(new Block(65),1201+offsetX,40+offsetY);
        addObject(new Block(65),1174+offsetX,40+offsetY);
        addObject(new Block(65),1174+offsetX,13+offsetY);
        addObject(new Block(65),1147+offsetX,13+offsetY);
        addObject(new Block(65),1147+offsetX,40+offsetY);
        addObject(new Block(65),1120+offsetX,40+offsetY);
        addObject(new Block(65),1093+offsetX,13+offsetY);
        addObject(new Block(65),1093+offsetX,40+offsetY);
        addObject(new Block(65),1120+offsetX,13+offsetY);
        addObject(new GravityBlock(95),2335+offsetX,67+offsetY);
        addObject(new GravityBlock(95),1228+offsetX,472+offsetY);
        addObject(new LavaBlock(2),607+offsetX,526+offsetY);
        addObject(new LavaBlock(2),634+offsetX,526+offsetY);
        addObject(new LavaBlock(2),661+offsetX,526+offsetY);
        addObject(new LavaBlock(2),688+offsetX,526+offsetY);
        addObject(new LavaBlock(2),715+offsetX,526+offsetY);
        addObject(new LavaBlock(2),742+offsetX,526+offsetY);
        addObject(new LavaBlock(1),607+offsetX,499+offsetY);
        addObject(new LavaBlock(1),634+offsetX,499+offsetY);
        addObject(new LavaBlock(1),715+offsetX,499+offsetY);
        addObject(new LavaBlock(1),742+offsetX,499+offsetY);
        addObject(new LavaBlock(1),688+offsetX,499+offsetY);
        addObject(new LavaBlock(1),661+offsetX,499+offsetY);
        addObject(new ElevatorBlock(87),634+offsetX,391+offsetY);
        addObject(new ElevatorBlock(87),661+offsetX,391+offsetY);
        addObject(new ElevatorBlock(87),688+offsetX,391+offsetY);
        addObject(new ElevatorBlock(87),715+offsetX,391+offsetY);
        addObject(new Coin(90),634+offsetX,283+offsetY);
        addObject(new Coin(90),661+offsetX,283+offsetY);
        addObject(new Coin(90),688+offsetX,283+offsetY);
        addObject(new Coin(90),715+offsetX,283+offsetY);
        addObject(new SpikeBlock(84),796+offsetX,499+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,472+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,445+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,418+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,391+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,364+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,337+offsetY);
        addObject(new ClimbBlock(61),904+offsetX,310+offsetY);
        addObject(new Block(32),931+offsetX,337+offsetY);
        addObject(new Block(32),931+offsetX,364+offsetY);
        addObject(new Block(32),931+offsetX,445+offsetY);
        addObject(new Block(32),958+offsetX,472+offsetY);
        addObject(new Block(32),958+offsetX,445+offsetY);
        addObject(new Block(32),931+offsetX,472+offsetY);
        addObject(new Block(32),931+offsetX,418+offsetY);
        addObject(new Block(32),931+offsetX,391+offsetY);
        addObject(new Block(32),958+offsetX,418+offsetY);
        addObject(new Block(32),958+offsetX,391+offsetY);
        addObject(new Block(32),958+offsetX,364+offsetY);
        addObject(new Block(32),1039+offsetX,445+offsetY);
        addObject(new Block(32),1039+offsetX,472+offsetY);
        addObject(new Block(32),1066+offsetX,472+offsetY);
        addObject(new LavaBlock(2),985+offsetX,418+offsetY);
        addObject(new LavaBlock(1),985+offsetX,391+offsetY);
        addObject(new LavaBlock(2),1012+offsetX,445+offsetY);
        addObject(new LavaBlock(2),985+offsetX,445+offsetY);
        addObject(new LavaBlock(1),1012+offsetX,418+offsetY);
        addObject(new LavaBlock(2),985+offsetX,472+offsetY);
        addObject(new LavaBlock(2),1012+offsetX,472+offsetY);
        addObject(new LavaBlock(2),1012+offsetX,499+offsetY);
        addObject(new LavaBlock(2),985+offsetX,499+offsetY);
        addObject(new LavaBlock(2),1012+offsetX,526+offsetY);
        addObject(new LavaBlock(2),985+offsetX,526+offsetY);
        addObject(new LavaBlock(2),958+offsetX,526+offsetY);
        addObject(new LavaBlock(2),904+offsetX,526+offsetY);
        addObject(new LavaBlock(2),877+offsetX,526+offsetY);
        addObject(new LavaBlock(2),850+offsetX,526+offsetY);
        addObject(new LavaBlock(2),823+offsetX,526+offsetY);
        addObject(new LavaBlock(2),796+offsetX,526+offsetY);
        addObject(new LavaBlock(2),769+offsetX,526+offsetY);
        addObject(new LavaBlock(2),931+offsetX,526+offsetY);
        addObject(new Block(31),958+offsetX,499+offsetY);
        addObject(new LavaBlock(2),1039+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1093+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1120+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1066+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1147+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1174+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1201+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1228+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1255+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1282+offsetX,526+offsetY);
        addObject(new LavaBlock(2),1309+offsetX,526+offsetY);
        addObject(new LavaBlock(2),13+offsetX,526+offsetY);
        addObject(new LavaBlock(2),40+offsetX,526+offsetY);
        addObject(new LavaBlock(2),67+offsetX,526+offsetY);
        addObject(new LavaBlock(2),94+offsetX,526+offsetY);
        addObject(new LavaBlock(2),121+offsetX,526+offsetY);
        addObject(new LavaBlock(2),148+offsetX,526+offsetY);
        addObject(new LavaBlock(2),175+offsetX,526+offsetY);
        addObject(new LavaBlock(2),283+offsetX,526+offsetY);
        addObject(new LavaBlock(2),229+offsetX,526+offsetY);
        addObject(new LavaBlock(2),202+offsetX,526+offsetY);
        addObject(new LavaBlock(2),256+offsetX,526+offsetY);
        addObject(new LavaBlock(2),310+offsetX,526+offsetY);
        addObject(new LavaBlock(2),337+offsetX,526+offsetY);
        addObject(new LavaBlock(2),364+offsetX,526+offsetY);
        addObject(new LavaBlock(2),391+offsetX,526+offsetY);
        addObject(new LavaBlock(2),418+offsetX,526+offsetY);
        addObject(new LavaBlock(2),445+offsetX,526+offsetY);
        addObject(new LavaBlock(2),472+offsetX,526+offsetY);
        addObject(new LavaBlock(2),499+offsetX,526+offsetY);
        addObject(new LavaBlock(2),526+offsetX,526+offsetY);
        addObject(new LavaBlock(2),553+offsetX,526+offsetY);
        addObject(new LavaBlock(2),580+offsetX,526+offsetY);
        addObject(new SpikeBlock(84),1336+offsetX,67+offsetY);
        addObject(new Coin(90),1012+offsetX,337+offsetY);
        addObject(new Coin(90),1012+offsetX,364+offsetY);
        addObject(new Coin(90),1012+offsetX,310+offsetY);
        addObject(new Coin(90),1012+offsetX,283+offsetY);
        addObject(new Coin(90),337+offsetX,229+offsetY);
        addObject(new Coin(90),364+offsetX,229+offsetY);
        addObject(new Coin(90),391+offsetX,229+offsetY);
        addObject(new Coin(90),418+offsetX,229+offsetY);
        addObject(new Coin(90),445+offsetX,229+offsetY);
        addObject(new FallingBlock(75),850+offsetX,310+offsetY);
        addObject(new FallingBlock(75),823+offsetX,310+offsetY);
        addObject(new FallingBlock(75),823+offsetX,283+offsetY);
        addObject(new FallingBlock(75),796+offsetX,283+offsetY);
        addObject(new FallingBlock(75),796+offsetX,256+offsetY);
        addObject(new FallingBlock(75),769+offsetX,256+offsetY);
        addObject(new FallingBlock(75),769+offsetX,229+offsetY);
        addObject(new FallingBlock(75),742+offsetX,229+offsetY);
        addObject(new FallingBlock(75),742+offsetX,202+offsetY);
        addObject(new FallingBlock(75),715+offsetX,202+offsetY);
        addObject(new FallingBlock(75),715+offsetX,175+offsetY);
        addObject(new FallingBlock(75),688+offsetX,175+offsetY);
        addObject(new FallingBlock(75),688+offsetX,148+offsetY);
        addObject(new FallingBlock(75),661+offsetX,148+offsetY);
        addObject(new FallingBlock(75),661+offsetX,121+offsetY);
        addObject(new FallingBlock(75),580+offsetX,121+offsetY);
        addObject(new FallingBlock(75),634+offsetX,121+offsetY);
        addObject(new FallingBlock(75),607+offsetX,121+offsetY);
        addObject(new FallingBlock(75),499+offsetX,121+offsetY);
        addObject(new FallingBlock(75),553+offsetX,121+offsetY);
        addObject(new FallingBlock(75),526+offsetX,121+offsetY);
        addObject(new FallingBlock(75),472+offsetX,121+offsetY);
        addObject(new FallingBlock(75),445+offsetX,121+offsetY);
        addObject(new FallingBlock(75),418+offsetX,121+offsetY);
        addObject(new FallingBlock(75),391+offsetX,121+offsetY);
        addObject(new FallingBlock(75),364+offsetX,121+offsetY);
        addObject(new FallingBlock(75),337+offsetX,121+offsetY);
        addObject(new FallingBlock(75),310+offsetX,121+offsetY);
        addObject(new FallingBlock(75),283+offsetX,121+offsetY);
        addObject(new Coin(90),283+offsetX,40+offsetY);
        addObject(new Coin(90),283+offsetX,67+offsetY);
        addObject(new Coin(90),310+offsetX,67+offsetY);
        addObject(new Coin(90),310+offsetX,13+offsetY);
        addObject(new Coin(90),310+offsetX,40+offsetY);
        addObject(new Coin(90),310+offsetX,94+offsetY);
        addObject(new Coin(90),337+offsetX,67+offsetY);
        addObject(new Coin(90),337+offsetX,40+offsetY);
        addObject(new Coin(90),364+offsetX,13+offsetY);
        addObject(new Coin(90),364+offsetX,40+offsetY);
        addObject(new Coin(90),364+offsetX,67+offsetY);
        addObject(new Coin(90),364+offsetX,94+offsetY);
        addObject(new Coin(90),391+offsetX,40+offsetY);
        addObject(new Coin(90),391+offsetX,67+offsetY);
        addObject(new Coin(90),418+offsetX,13+offsetY);
        addObject(new Coin(90),418+offsetX,40+offsetY);
        addObject(new Coin(90),418+offsetX,67+offsetY);
        addObject(new Coin(90),418+offsetX,94+offsetY);
        addObject(new Coin(90),445+offsetX,67+offsetY);
        addObject(new Coin(90),445+offsetX,40+offsetY);
        addObject(new MeltingBlock(89),553+offsetX,121+offsetY);
        addObject(new MeltingBlock(89),580+offsetX,121+offsetY);
        addObject(new MeltingBlock(89),607+offsetX,121+offsetY);
        addObject(new MeltingBlock(89),715+offsetX,202+offsetY);
        addObject(new MeltingBlock(89),742+offsetX,202+offsetY);
        addObject(new MeltingBlock(89),742+offsetX,229+offsetY);
        addObject(new MeltingBlock(89),769+offsetX,229+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,67+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,94+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,175+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,121+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,148+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,202+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,229+offsetY);
        addObject(new ClimbBlock(25),1444+offsetX,256+offsetY);
        addObject(new Block(63),1471+offsetX,202+offsetY);
        addObject(new Block(63),1498+offsetX,202+offsetY);
        addObject(new Block(63),1525+offsetX,202+offsetY);
        addObject(new Block(63),1552+offsetX,202+offsetY);
        addObject(new Block(63),1579+offsetX,202+offsetY);
        addObject(new Block(63),1606+offsetX,202+offsetY);
        addObject(new Block(63),1633+offsetX,202+offsetY);
        addObject(new Block(63),1660+offsetX,202+offsetY);
        addObject(new BulletLauncher(86,180),1606+offsetX,67+offsetY);
        addObject(new BulletLauncher(86,180),1606+offsetX,94+offsetY);

    }
}
