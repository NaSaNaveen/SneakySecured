package com.example.nasa.sneakynotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Sneaky extends AppCompatActivity
{
    Button e,d;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneaky);

        e=(Button)findViewById(R.id.encrypt);
        d=(Button)findViewById(R.id.decrypt);

        Frequency_values.freq.put("l",23618);
        Frequency_values.freq.put("f",25392);
        Frequency_values.freq.put("a", 27895 );
        Frequency_values.freq.put("6", 34295 );
        Frequency_values.freq.put("c", 34984);
        Frequency_values.freq.put("o", 35244);
        Frequency_values.freq.put("m", 39016);
        Frequency_values.freq.put("k", 40134);
        Frequency_values.freq.put("d", 41598);
        Frequency_values.freq.put("h", 43075);
        Frequency_values.freq.put("[", 43545);
        Frequency_values.freq.put("X", 46915);
        Frequency_values.freq.put("&", 47593);
        Frequency_values.freq.put("g", 47631);
        Frequency_values.freq.put("v", 50643);
        Frequency_values.freq.put("b", 50722);
        Frequency_values.freq.put("i", 51632);
        Frequency_values.freq.put("Y", 60091 );
        Frequency_values.freq.put("e", 61618 );
        Frequency_values.freq.put("n", 62262);
        Frequency_values.freq.put("F", 62918);
        Frequency_values.freq.put("j", 91953);
        Frequency_values.freq.put("V", 92378);
        Frequency_values.freq.put("q", 118728);
        Frequency_values.freq.put("r", 130831);
        Frequency_values.freq.put("A", 150386);
        Frequency_values.freq.put("1", 150665);
        Frequency_values.freq.put("-", 164485);
        Frequency_values.freq.put(",", 164592);
        Frequency_values.freq.put("s", 166484 );
        Frequency_values.freq.put("2", 167323);
        Frequency_values.freq.put("p", 171488 );
        Frequency_values.freq.put("9", 171570);
        Frequency_values.freq.put(">", 185988);
        Frequency_values.freq.put("C", 187115);
        Frequency_values.freq.put("L", 190084 );
        Frequency_values.freq.put("5", 194813);
        Frequency_values.freq.put("M", 198309);
        Frequency_values.freq.put("!", 199178);
        Frequency_values.freq.put("U", 202537);
        Frequency_values.freq.put("'", 208559);
        Frequency_values.freq.put("E", 210222);
        Frequency_values.freq.put("/", 210841);
        Frequency_values.freq.put(".", 216379);
        Frequency_values.freq.put("B", 216498);
        Frequency_values.freq.put("G", 217607);
        Frequency_values.freq.put("K", 217891);
        Frequency_values.freq.put(":", 223088);
        Frequency_values.freq.put("S", 223518);
        Frequency_values.freq.put("I", 224830);
        Frequency_values.freq.put("%", 225581);
        Frequency_values.freq.put("4", 225977);
        Frequency_values.freq.put(")", 229001);
        Frequency_values.freq.put("Q", 229883);
        Frequency_values.freq.put("P", 231686);
        Frequency_values.freq.put("7", 247484);
        Frequency_values.freq.put("N", 249825);
        Frequency_values.freq.put(";", 253181);
        Frequency_values.freq.put("?", 253181);
        Frequency_values.freq.put("3", 259677);
        Frequency_values.freq.put("_", 261141);
        Frequency_values.freq.put("8", 264718);
        Frequency_values.freq.put("]", 265877);
        Frequency_values.freq.put("y", 267487);
        Frequency_values.freq.put("O", 274382);
        Frequency_values.freq.put("x", 277367);
        Frequency_values.freq.put("D", 281713);
        Frequency_values.freq.put("t", 282656);
        Frequency_values.freq.put("u", 287690);
        Frequency_values.freq.put("W", 291964);
        Frequency_values.freq.put("(", 306117);
        Frequency_values.freq.put("z", 313004);
        Frequency_values.freq.put("R", 313137);
        Frequency_values.freq.put("T", 313743);
        Frequency_values.freq.put("0", 313988);
        Frequency_values.freq.put("@", 332166);
        Frequency_values.freq.put("w", 336562);
        Frequency_values.freq.put("\"",338352);
        Frequency_values.freq.put("^", 347070);
        Frequency_values.freq.put("J", 349870);
        Frequency_values.freq.put("H", 391919);



        Frequency_values.reversefreq.put(23618,"l");
        Frequency_values.reversefreq.put(25392,"f");
        Frequency_values.reversefreq.put( 27895,"a" );
        Frequency_values.reversefreq.put( 34295,"6" );
        Frequency_values.reversefreq.put( 34984,"c");
        Frequency_values.reversefreq.put(35244,"o" );
        Frequency_values.reversefreq.put( 39016,"m");
        Frequency_values.reversefreq.put( 40134,"k");
        Frequency_values.reversefreq.put( 41598,"d");
        Frequency_values.reversefreq.put( 43075,"h");
        Frequency_values.reversefreq.put( 43545,"[");
        Frequency_values.reversefreq.put( 46915,"X");
        Frequency_values.reversefreq.put( 47593,"&");
        Frequency_values.reversefreq.put( 47631,"g");
        Frequency_values.reversefreq.put( 50643,"v");
        Frequency_values.reversefreq.put( 50722,"b");
        Frequency_values.reversefreq.put( 51632,"i");
        Frequency_values.reversefreq.put(60091, "Y" );
        Frequency_values.reversefreq.put(61618, "e" );
        Frequency_values.reversefreq.put(62262,"n" );
        Frequency_values.reversefreq.put(62918,"F" );
        Frequency_values.reversefreq.put(91953,"j" );
        Frequency_values.reversefreq.put(92378,"V" );
        Frequency_values.reversefreq.put(118728,"q" );
        Frequency_values.reversefreq.put(130831,"r" );
        Frequency_values.reversefreq.put(150386,"A" );
        Frequency_values.reversefreq.put(150665,"1" );
        Frequency_values.reversefreq.put(164485,"-" );
        Frequency_values.reversefreq.put( 164592,",");
        Frequency_values.reversefreq.put(166484, "s" );
        Frequency_values.reversefreq.put(167323,"2" );
        Frequency_values.reversefreq.put(171488, "p" );
        Frequency_values.reversefreq.put(171570,"9" );
        Frequency_values.reversefreq.put(185988,">" );
        Frequency_values.reversefreq.put(187115,"C" );
        Frequency_values.reversefreq.put(190084, "L" );
        Frequency_values.reversefreq.put( 194813,"5");
        Frequency_values.reversefreq.put(198309,"M" );
        Frequency_values.reversefreq.put(199178,"!" );
        Frequency_values.reversefreq.put(202537,"U" );
        Frequency_values.reversefreq.put(208559,"'" );
        Frequency_values.reversefreq.put(210222,"E" );
        Frequency_values.reversefreq.put(210841,"/" );
        Frequency_values.reversefreq.put(216379,"." );
        Frequency_values.reversefreq.put(216498,"B" );
        Frequency_values.reversefreq.put(217607,"G");
        Frequency_values.reversefreq.put(217891,"K");
        Frequency_values.reversefreq.put(223088,":");
        Frequency_values.reversefreq.put(223518,"S");
        Frequency_values.reversefreq.put(224830,"I");
        Frequency_values.reversefreq.put(225581,"%");
        Frequency_values.reversefreq.put(225977,"4");
        Frequency_values.reversefreq.put( 229001,")");
        Frequency_values.reversefreq.put(229883,"Q");
        Frequency_values.reversefreq.put(231686,"P");
        Frequency_values.reversefreq.put(247484,"7");
        Frequency_values.reversefreq.put(249825,"N");
        Frequency_values.reversefreq.put(253181,";");
        Frequency_values.reversefreq.put(253181,"?");
        Frequency_values.reversefreq.put(259677,"3");
        Frequency_values.reversefreq.put( 261141,"_");
        Frequency_values.reversefreq.put( 264718,"8");
        Frequency_values.reversefreq.put( 265877,"]");
        Frequency_values.reversefreq.put( 267487,"y");
        Frequency_values.reversefreq.put( 274382,"O");
        Frequency_values.reversefreq.put( 277367,"x");
        Frequency_values.reversefreq.put( 281713,"D");
        Frequency_values.reversefreq.put( 282656,"t");
        Frequency_values.reversefreq.put( 287690,"u");
        Frequency_values.reversefreq.put( 291964,"W");
        Frequency_values.reversefreq.put( 306117,"(");
        Frequency_values.reversefreq.put( 313004,"z");
        Frequency_values.reversefreq.put( 313137,"R");
        Frequency_values.reversefreq.put( 313743,"T");
        Frequency_values.reversefreq.put( 313988,"0");
        Frequency_values.reversefreq.put( 332166,"@");
        Frequency_values.reversefreq.put(336562,"w" );
        Frequency_values.reversefreq.put(338352,"\"");
        Frequency_values.reversefreq.put( 347070,"^");
        Frequency_values.reversefreq.put( 349870,"J");
        Frequency_values.reversefreq.put(391919,"H" );






        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sneaky.this,Encrpyt.class);
                startActivity(i);
            }
        });



        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sneaky.this,Decrypt.class);
                startActivity(i);
            }
        });
    }
}
