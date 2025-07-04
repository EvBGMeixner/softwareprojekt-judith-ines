

public class FRANKLIN extends FIGUR
{
   double deltaX;
    double deltaY;
    public FRANKLIN()
    {
        super("");
        deltaX = 0;
        deltaY = 0;

    }
    public void bewegenF(){
        verschiebenUm(deltaX, 0);
    }

    public void bewegeNachLinksF(){
        deltaX = -0.2;
    }

    public void bewegeNachRechtsF(){
        deltaX = 0.2;
    }

    public void anhalten(){
        deltaX = 0;
    }

    public void springen(){
        for(int i=4; i>-4; i--)
        {deltaY = i*0.1;
            long l=(long) 0.1875;
            try {
                wait(l);
            }
            catch(Exception e) {
                //  Block of code to handle errors
            }
        }
    }
}
