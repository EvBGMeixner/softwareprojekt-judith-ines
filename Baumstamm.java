
public class Baumstamm extends FIGUR
{
    boolean umgefallen;
    
    public Baumstamm( String bildName )
    {
        super( bildName);
        machePassiv();
    }
    public void umfallen(){
        drehenUm(90);
    }
    
}