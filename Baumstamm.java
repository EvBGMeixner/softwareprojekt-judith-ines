
public class Baumstamm extends FIGUR
{
    boolean umgefallen;
    
    public Baumstamm( String bildName )
    {
        super( bildName);
        macheAktiv();
        
    }
    public void umfallen(){
        drehenUm(90);
    }
    
}