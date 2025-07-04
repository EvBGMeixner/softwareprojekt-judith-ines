
public class Liane extends FIGUR
{
    boolean lianeziehen;
    public Liane()
    {
        super("");
    }
    void lianeziehen(){
        
    }
    if(taste == 38){
            Ruby.deltaX=0;
            Ruby.deltaY=0
            Franklin.deltaX=0;
            Franklin.deltaY=0;
            pausiert = true;
            anzeigeLeben.setzeInhalt("Leben:"+leben+ "                                        PAUSE");            
        }if (taste == 40){
            pausiert = false;
            anzeigeLeben.setzeInhalt("Leben:"+leben);
        }
        if(pausiert == false){
            if(taste == 37){
                schlaeger.bewegeNachLinks();
            }else if(taste == 39){
                schlaeger.bewegeNachRechts();
            }
        }
}