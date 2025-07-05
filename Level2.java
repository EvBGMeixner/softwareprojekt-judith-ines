
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
    TEXT anzeigediamanten;
    boolean pausiert;
    int gesammeltediamanten;
    public Level2()
    {leben=3;
        blöcke= new BLOCK[30];
        for (int i=0; i<5;i++){
        }
        franklin= new FRANKLIN("Titelloses 4.png");
        ruby= new RUBY("Titelloses 6.png");
        nilpferde= new Nilpferd[4];
        gift= new Gift[10];
        baumstamm= new Baumstamm[3];
        autolevel1= new Auto("auto","");
        diamanten= new Diamand[7];
        lianen= new Liane[3];
        anzeigeleben=new TEXT (-12,8,1,"Leben: I I I");
        anzeigediamanten= new TEXT(12,8,1,"0");
        gesammeltediamanten=0;
        FRANKLIN.aktivMachen();
        RUBY.aktivMachen();
        BlOCK.passivMachen();
        Baumstamm.passivMachen();
    }
    @Override
    public void bildAktualisierungReagieren(double sekunden) {
        if (pausiert==false){
            RUBY.bewegenR();
            FRANKLIN.bewegenR();
        }
        if(ruby.beruehrt(gift)){rubyverliereLeben();};
        if(ruby.beruehrt(nilpferd)){rubyverliereLeben();}
        if(franklin.beruehrt(nilpferd)){franklinverliereLeben();};
        if(ruby.beruehrt(baumstamm)||franklin.beruehrt(baumstamm)){
        baumstamm.umfallen();}
    }
    @Override
    public void tasteReagieren(int taste){
        if(taste == 38){
            RUBY.geschwindigkeit=0;
            FRANKLIN.geschwindigkeit=0;
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
                FRANKLIN.bewegeNachLinks();
            }else if(taste == 39){
                FRANKLIN.bewegeNachRechts();
            }else if (taste == 26){
                FRANKLIN.springen();
            }else {FRANKLIN.anhalten();}
            if(taste == 37){
                RUBY.bewegeNachLinks();
            }else if(taste == 39){
                RUBY.bewegeNachRechts();
            }else if (taste == 26){
                RUBY.springen();
            }else {FRANKLIN.anhalten();}
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
    public void diamantensammeln(){
    for(int i=0; i<7;i++){if(ruby.beruehrt(diamanten[i])|| franklin.beruehrt(diamanten[i])){
        gesammeltediamanten=gesammeltediamanten+1;
        anzeigediamanten.setzeInhalt(gesammeltediamanten);}
    }}
    public String gewinnen(){
    if(ruby.beruehrt(autolevel1)&& franklin.beruehrt(autolevel1)){
    return("Gewonnen!");}}
}
    