public class Level2 extends SPIEL
{   int leben;
    BLOCK[] blöckereihe14;
    BLOCK[] blöckereihe12;
    BLOCK[] blöckereihe12teil2;
    BLOCK[] blöckereihe11;
    BLOCK[] blöckereihe9;
    BLOCK[] blöckereihe8;
    BLOCK[] blöckereihe8teil2;
    BLOCK block91;
    BLOCK block92;
    BLOCK block61;
    BLOCK block62;
    BLOCK block51;
    BLOCK block52;
    BLOCK block53;
    BLOCK block4;
    BLOCK[] blöckereihe4;
    BLOCK[] blöckereihe3;
    BLOCK[] blöckereihe3teil2;
    BLOCK[] blöckereihe2;
    FRANKLIN franklin;
    RUBY ruby;
    Nilpferd[] nilpferde;
    Gift[] gift;
    //Baumstamm[] baumstamm;
    Baumstamm baumstamm1;
    Baumstamm baumstamm2;
    Baumstamm baumstamm3;
    Auto autolevel1;
    Diamand[] diamanten;
    Liane[] lianen;
    TEXT anzeigeleben;
    TEXT anzeigeverloren;
    TEXT anzeigediamanten;
    boolean pausiert;
    int gesammeltediamanten;
    int timer;
    TEXT anzeigetimer;
    int zeit;
    boolean zustanddiamant;
    boolean ende;
    Stern stern1;
    Stern stern2;
    Stern stern3;
    Stern stern4;
    Stern stern5;
    Stern stern6;
    int punkte;
    String franklinzustand;
    Hintergrund hintergrund;
    boolean franklinaktiv;
    public Level2()
    {   
        super(800,600, false);
        leben=3;
        setzeSchwerkraft(3.5);
        blöckereihe14= new BLOCK[14];
        int k=-13;
        zeit=120;
        punkte=1;
        franklinaktiv=true;
        //setzeHintergrundgrafik("Hintergrund.png");

        for (int i=0; i<blöckereihe14.length; i++){
            blöckereihe14[i] = new BLOCK(k, -10); // Beispiel: BLOCK(int x, int y)
            k=k+2;
        }
        blöckereihe12= new BLOCK[6];
        int l=-13;
        for (int i=0; i<blöckereihe12.length; i++){
            blöckereihe14[i] = new BLOCK(l, -8); // Beispiel: BLOCK(int x, int y)
            l=l+2;
        }

        blöckereihe12teil2= new BLOCK[2];
        int m=3;
        for (int i=0; i<blöckereihe12teil2.length; i++){
            blöckereihe12teil2[i] = new BLOCK(m, -8); // Beispiel: BLOCK(int x, int y)
            m=m+2;
        }

        blöckereihe11= new BLOCK[4];
        int n=7;
        for (int i=0; i<blöckereihe14.length; i++){
            blöckereihe14[i] = new BLOCK(n, -7); // Beispiel: BLOCK(int x, int y)
            n=n+2;
        }

        blöckereihe9= new BLOCK[2];
        int o=-1;
        for (int i=0; i<blöckereihe9.length; i++){
            blöckereihe9[i] = new BLOCK(o, -5); // Beispiel: BLOCK(int x, int y)
            o=o+2;
        }
        //block91=new BLOCK(-5,-5);
        block92=new BLOCK(5,-5);

        blöckereihe8= new BLOCK[3];
        int p=-13;
        for (int i=0; i<blöckereihe8.length; i++){
            blöckereihe8[i] = new BLOCK(p, -4); // Beispiel: BLOCK(int x, int y)
            p=p+2;
        }

        blöckereihe8teil2= new BLOCK[3];
        int q=9;
        for (int i=0; i<blöckereihe8teil2.length; i++){
            blöckereihe8teil2[i] = new BLOCK(q, -4); // Beispiel: BLOCK(int x, int y)
            q=q+2;
        }

        block61=new BLOCK(-3,-2);
        block62=new BLOCK(8,-2);
        block51=new BLOCK(-12,0);
        block52=new BLOCK(-6,0);
        block53=new BLOCK(0,0);
        block4=new BLOCK(-2,3);

        blöckereihe4= new BLOCK[2];
        int r=10;
        for (int i=0; i<blöckereihe4.length; i++){
            blöckereihe4[i] = new BLOCK(r, 2); // Beispiel: BLOCK(int x, int y)
            r=r+2;
        }

        blöckereihe3= new BLOCK[3];
        int s=-13;
        for (int i=0; i<blöckereihe3.length; i++){
            blöckereihe3[i] = new BLOCK(s, 4); // Beispiel: BLOCK(int x, int y)
            s=s+2;
        }

        blöckereihe3teil2= new BLOCK[2];
        int t=3;
        for (int i=0; i<blöckereihe3teil2.length; i++){
            blöckereihe3teil2[i] = new BLOCK(t, 4); // Beispiel: BLOCK(int x, int y)
            t=t+2;
        }

        blöckereihe2= new BLOCK[3];
        int u=9;
        for (int i=0; i<blöckereihe2.length; i++){
            blöckereihe2[i] = new BLOCK(u, 6); // Beispiel: BLOCK(int x, int y)
            u=u+2;
        }
        hintergrund = new Hintergrund("Wald.png");
        hintergrund.setzeEbene(-1);
        hintergrund.skaliere(8);
        hintergrund.setzeMittelpunkt(0,0);
        franklin= new FRANKLIN("Titelloses 42.png");
        franklin.fuegeZustandVonEinzelbildernHinzu
        ("franklinstehen","Titelloses 42.png");
        franklin.fuegeZustandVonEinzelbildernHinzu
        ("franklinlaufen", "franklinlaufen1_small.png", "franklinlaufen2_small.png");
        franklin.fuegeZustandVonEinzelbildernHinzu
        ("franklinspringen", "franklinspringen_small.png");
        franklin.setzeMittelpunkt( -9 , -9 );

        ruby= new RUBY("Ruby_s.png");
        ruby.fuegeZustandVonEinzelbildernHinzu
        ("rubystehen", "Ruby_s.png");
        ruby.fuegeZustandVonEinzelbildernHinzu
        ("rubylaufen", "rubylaufen1_small.png", "rubylaufen2_small.png");
        ruby.fuegeZustandVonEinzelbildernHinzu
        ("rubyspringen", "rubyspringen_small.png");
        ruby.setzeMittelpunkt( -8 , -9 );
        anzeigetimer = new TEXT(0, 9, 1, zeit);

        autolevel1= new Auto("Car_s.png");
        autolevel1.setzeMittelpunkt(11,7 );

        nilpferde= new Nilpferd[2];
        for (int i=0; i<nilpferde.length; i++){
            nilpferde[i] = new Nilpferd("Nilpferd_.png");
        }
        nilpferde[0].setzeMittelpunkt(5,-7);
        nilpferde[1].setzeMittelpunkt(0,1);

        gift= new Gift[4];
        for (int i=0; i<gift.length; i++){
            gift[i] = new Gift("Gift_.png");
        }
        gift[0].setzeMittelpunkt(3,-8.75);
        gift[1].setzeMittelpunkt(-6,-6.75);
        gift[2].setzeMittelpunkt(-10,5.25);
        gift[3].setzeMittelpunkt(5,5.25);
        //baumstamm= new Baumstamm[3];
        //for (int i=0; i<baumstamm.length; i++){
        //baumstamm[i] = new Baumstamm("Baumstamm_.png");}
        //baumstamm[0].setzeMittelpunkt(-8,-6);
        //baumstamm[1].setzeMittelpunkt(-10,5);
        //baumstamm[2].setzeMittelpunkt(-6,0);
        baumstamm1 = new Baumstamm("Baumstamm_.png");
        baumstamm2 = new Baumstamm("Baumstamm_.png");
        baumstamm3 = new Baumstamm("Baumstamm_.png");
        baumstamm1.setzeMittelpunkt(-8,-6);
        baumstamm2.setzeMittelpunkt(-10,5);
        baumstamm3.setzeMittelpunkt(-6,0);

        stern1 = new Stern("Stern.png");
        stern2 = new Stern("Stern.png");
        stern3 = new Stern("Stern.png");
        stern4 = new Stern("Sterngrau.png");
        stern5 = new Stern("Sterngrau.png");
        stern6 = new Stern("Sterngrau.png");
        stern1.setzeSichtbar(false);
        stern2.setzeSichtbar(false);
        stern3.setzeSichtbar(false);
        stern4.setzeSichtbar(false);
        stern5.setzeSichtbar(false);
        stern6.setzeSichtbar(false);
        stern1.setzeMittelpunkt(-3,-3);
        stern2.setzeMittelpunkt(0,-3);
        stern3.setzeMittelpunkt(3,-3);
        stern4.setzeMittelpunkt(-3,-3);
        stern5.setzeMittelpunkt(0,-3);
        stern6.setzeMittelpunkt(3,-3);
        //Sorry, dass das nicht in einem Feld ist, da kamen komische fehlermeldungen auf..

        diamanten=new Diamand[5];

        for (int i=0; i<diamanten.length; i++){
            diamanten[i] = new Diamand("Diamond_s.png");
        }

        diamanten[0].setzeMittelpunkt(12,-6);
        diamanten[1].setzeMittelpunkt(11,3);
        diamanten[2].setzeMittelpunkt(-12,1);
        diamanten[3].setzeMittelpunkt(-3,-1);
        diamanten[4].setzeMittelpunkt(-12.5,5);/*

        //lianen= new Liane[6];
        //for (int i=0; i<lianen.length; i++){
        //lianen[i] = new Liane("liane.png");
        //lianen[0].setzeMittelpunkt(8,-8);
        //lianen[1].setzeMittelpunkt(-12.5,-5);
        //lianen[2].setzeMittelpunkt(-12.5,3);
        //lianen[3].setzeMittelpunkt(11,-5);
        //lianen[4].setzeMittelpunkt(12,5);
        //lianen[5].setzeMittelpunkt(-6,3);
        }*/
        anzeigeleben=new TEXT (-10,9,0.5,"Leben: I I I");
        anzeigediamanten= new TEXT(10,9,0.5,"Diamanten: 0");
        anzeigeverloren = new TEXT(-3.5,7,2,"  ");
        gesammeltediamanten=0;
        ende=false;

    }

    @Override
    public void bildAktualisierungReagieren(double sekunden) {

        if (ende==false){
            ruby.bewegenR();
            franklin.bewegenF();
        }
        if(ende==false){
            if(istTasteGedrueckt(68)){
                ruby.macheAktiv();
                //ruby.setzeZustand("rubylaufen");
                ruby.spiegelnHorizontal(true);
                ruby.verschiebenUm(0.1,0);}
            if(istTasteGedrueckt(65)){
                ruby.macheAktiv();
                //ruby.setzeZustand("rubylaufen");
                ruby.spiegelnHorizontal(false);
                ruby.verschiebenUm(-0.1,0);}
            if(istTasteGedrueckt(87)){
                ruby.macheAktiv();
                //ruby.setzeZustand("rubyspringen");
                ruby.springe(1);}
            if(istTasteGedrueckt(83)){
                ruby.machePassiv();
            }
        } 
        
        if(ende==false){

            timer++;
            if(zeit>0){
                if (timer>=65){
                    zeit--;
                    timer = 0;
                    anzeigetimer.setzeInhalt(zeit);
                }
            }
        }

        if (zeit==0){
            anzeigetimer.setzeInhalt(zeit);
            anzeigetimer.setzeFarbe("rot");
        }

        if(diamanten != null){
            for(int i=0; i<diamanten.length;i++){
                if(diamanten[i] != null && diamanten[i].istSichtbar() && ruby.beruehrt(diamanten[i])){
                    gesammeltediamanten=gesammeltediamanten+1;
                    anzeigediamanten.setzeInhalt("Diamanten: "+ gesammeltediamanten);
                    diamanten[i].setzeSichtbar(false);
                    diamanten[i].entfernen();}
                if(diamanten[i] != null && diamanten[i].istSichtbar() && franklin.beruehrt(diamanten[i])){
                    gesammeltediamanten=gesammeltediamanten+1;
                    anzeigediamanten.setzeInhalt("Diamanten: "+ gesammeltediamanten);
                    diamanten[i].setzeSichtbar(false);
                    diamanten[i].entfernen();}
            }
        }

        if(gift != null){
            for(int i=0; i<gift.length;i++){
                if(gift[i] != null && ruby.beruehrt(gift[i])){
                    rubyverliereLeben();}
            }
        }

        if(nilpferde != null){
            for(int i=0; i<nilpferde.length;i++){
                if(nilpferde[i] != null && nilpferde[i].istSichtbar() && ruby.beruehrt(nilpferde[i])){
                    rubyverliereLeben();}
            }
        }
        gewinnen();
        if(baumstamm1 != null){
            if(baumstamm1.nenneMittelpunktX()== -2){
                baumstamm2.machePassiv();
            }
        }

        //}
        //}

        //if(ruby.beruehrt(diamand[])||franklin.beruhrt(diamand[]){
        //diamand[i].animiereFarbe(0.5, "schwarz");
        //diamand[i].entfernen();
        //}

        //for(int i=0;i<10;i++){if(ruby.beruehrt(gift[i])){rubyverliereLeben();};};
        //for(int i=0;i<3;i++){if(ruby.beruehrt(nilpferde[i])){rubyverliereLeben();}};
        //for(int i=0;i<3;i++){if(franklin.beruehrt(nilpferde[i])){franklinverliereLeben();};}

    }

    @Override
    public void tasteReagieren(int taste){
        if(ende==false){
            if(taste == 68){
                ruby.setzeZustand("rubylaufen");
            }
            if(taste == 65){
                ruby.setzeZustand("rubylaufen");
            }
            if(taste == 87){
                ruby.setzeZustand("rubyspringen");
            }
            if(taste == 37){
                franklin.macheAktiv();
                franklinaktiv=true;
                franklin.setzeZustand("franklinlaufen");
                franklin.spiegelnHorizontal(false);
                franklin.bewegeNachLinksF();
            }if(taste == 39){
                franklin.macheAktiv();
                franklinaktiv=true;
                franklin.setzeZustand("franklinlaufen");
                franklin.spiegelnHorizontal(true);
                franklin.bewegeNachRechtsF();
            }if (taste == 38){
                franklin.macheAktiv();
                franklinaktiv=true;
                franklin.setzeZustand("franklinspringen");
                franklin.springe(5);
            }if(taste==40 && franklin.steht()==true){
                if(franklinaktiv=true){    
                    franklin.machePassiv();
                    franklinaktiv=false;
                }
            }
            //2 mal hintereinander pfeiltaste nach unten bringt das Spiel zum
            //Abstürzen???
        }
    }

    @Override
    public void tasteLosgelassenReagieren(int taste){
        if(taste == 37||taste == 39){
            franklin.deltaX = 0;
            franklin.setzeZustand("franklinstehen");
        }
        if(taste == 65||taste == 68){
            ruby.deltaX = 0;
            ruby.setzeZustand("rubystehen");
        }   
    }     

    public void rubyverliereLeben(){
        if(leben>0){leben=leben-1;}
        if(leben==2)anzeigeleben.setzeInhalt("Leben: I I");
        if(leben==1)anzeigeleben.setzeInhalt("Leben: I");
        if (leben>0){
            ruby.setzeMittelpunkt( -8 , -9 );};
        if(leben==0){anzeigeverloren.setzeInhalt("verloren :(");
            anzeigeleben.setzeInhalt(" ");
            ende = true;};
    }

    public void franklinverliereLeben(){
        if(leben>0){leben=leben-1;};
        if(leben==2)anzeigeleben.setzeInhalt("Leben: I I");
        if(leben==1)anzeigeleben.setzeInhalt("Leben: I");
        if (leben>0){
            franklin.setzeMittelpunkt(-9,-9);};
        if(leben==0){
            anzeigeverloren.setzeInhalt("verloren :(");
            anzeigeleben.setzeInhalt(" ");
            ende= true;
        };
    }

    public void gewinnen(){
        if(stern1 != null && stern2 != null && stern3 != null && stern4 != null)
        {if(stern5 != null && stern6 != null)
            {if(ruby.beruehrt(autolevel1)&& franklin.beruehrt(autolevel1)){
                    if(zeit>0 && punkte==1){
                        punkte++;
                    }
                    if(gesammeltediamanten==5){
                        punkte++;
                    }
                    if(punkte==1){
                        stern1.setzeSichtbar(true);
                        stern5.setzeSichtbar(true);
                        stern6.setzeSichtbar(true);
                    }
                    if(punkte==2){
                        stern1.setzeSichtbar(true);
                        stern2.setzeSichtbar(true);
                        stern6.setzeSichtbar(true);
                    }
                    if(punkte==3){
                        stern1.setzeSichtbar(true);
                        stern2.setzeSichtbar(true);
                        stern3.setzeSichtbar(true);
                    }
                    anzeigeverloren.setzeInhalt("Gewonnen!");
                    anzeigeverloren.setzeSichtbar(true);
                    ende = true;
                }
            }
        }
    }

}

