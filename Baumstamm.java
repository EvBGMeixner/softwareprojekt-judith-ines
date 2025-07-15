
public class Baumstamm extends FIGUR
{
    boolean umgefallen;
    boolean aktiv;
    public Baumstamm( String bildName )
    {
        super( bildName);
        macheAktiv();
        aktiv=true;
    }
    public void umfallen(){
        drehenUm(90);
    }
    
}