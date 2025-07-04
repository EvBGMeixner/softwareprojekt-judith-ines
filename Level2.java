
public class Level2 extends LEVEL
{   int leben;
    BLOCK[] blöcke;
    FRANKLIN franklin;
    RUBY ruby;
    Nilpferd[] nilpferde;
    Gift[] gift;
    Baumstamm[] baumstamm;
    Auto autolevel1;
    Diamand[] diamanten;
    Liane[] lianen;
    TEXT anzeigeleben;
    TEXT anzeigeverloren;
    boolean pausiert;
    
    public Level2()
    {leben=3;
        blöcke= new BLOCK[30];
        franklin= new FRANKLIN();
        ruby= new RUBY();
        nilpferde= new Nilpferd[4];
        gift= new Gift[10];
        baumstamm= new Baumstamm[3];
        autolevel1= new Auto();
        diamanten= new Diamand[7];
        lianen= new Liane[3];
        anzeigeleben=new TEXT (-12,8,1,"Leben: I I I");
        
    }
    @Override
    public void bildAktualisierungReagieren(double sekunden) {
        if (pausiert==false){
            Ruby.bewegenR();
            Franklin.bewegenR();
        }
    }
    @Override
    public void tasteReagieren(int taste){
        if(taste == 38){
            Ruby.geschwindigkeit=0;
            Franklin.geschwindigkeit=0;
            pausiert = true;
            anzeigeLeben.setzeInhalt("Leben:"+leben+ "                                        PAUSE");            
        }if (taste == 40){
            ball.bewegen();
            ball.geschwindigkeit=0.2;
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
    public void rubyverliereLeben(){
        if(leben>0){leben=leben-1;};
        if(leben==2)anzeigeleben.setzeInhalt("Leben: I I");
        if(leben==1)anzeigeleben.setzeInhalt("Leben: I");
        if (leben>0){
            ruby.geheAufStart();};
        if(leben==0){anzeigeverloren.setzeInhalt("verloren :(");
            anzeigeleben.setzeInhalt(" ");};
    }
    public void franklinverliereLeben(){
        if(leben>0){leben=leben-1;};
        if(leben==2)anzeigeleben.setzeInhalt("Leben: I I");
        if(leben==1)anzeigeleben.setzeInhalt("Leben: I");
        if (leben>0){
            ruby.geheAufStart();};
        if(leben==0){anzeigeverloren.setzeInhalt("verloren :(");
            anzeigeleben.setzeInhalt(" ");};
    }
}