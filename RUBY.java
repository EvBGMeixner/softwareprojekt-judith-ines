
public class RUBY extends FIGUR
{
    double deltaX;
    double deltaY;
    
<<<<<<< HEAD
    public RUBY(String bildName)
=======
    public RUBY(Titelloses 6)
>>>>>>> 0bd0f8b837b2205493fc7ddd63f8abaae3ab7aba
    {
        
        deltaX = 0;
        deltaY = 0;

    }
    public void bewegenR(){
        verschiebenUm(deltaX, 0);
    }

    public void bewegeNachLinksR(){
        deltaX = -0.2;
    }

    public void bewegeNachRechtsR(){
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
    public void geheAufStart(){
        setzeMittelpunkt(0,0);}
}
