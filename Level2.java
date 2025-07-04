
public class Level2 extends LEVEL
{  BLOCK[] blöcke;
    FRANKLIN franklin;
    RUBY ruby;
    Nilpferd[] nilpferde;
    Gift[] gift;
    Baumstamm[] baumstamm;
    Auto autolevel1;
    Diamand[] diamanten;
    Liane[] lianen;
    TEXT anzeigeleben;
    
    public Level2()
    {blöcke= new BLOCK[30];
        franklin= new FRANKLIN();
        ruby= new RUBY();
        nilpferde= new Nilpferd[4];
        gift= new Gift[10];
        baumstamm= new Baumstamm[3];
        autolevel1= new Auto();
        diamanten= new Diamand[7];
        lianen= new Liane[3];
        anzeigeleben=new TEXT (-12,8,1,"I I I");
        
    }}