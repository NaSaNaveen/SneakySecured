package com.example.nasa.sneakynotes;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Encrpyt extends AppCompatActivity {

    EditText editing;
    EditText encrpttxt;
    Button encrypt,share,decbutton;

    String plaintext , ciphertext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrpyt);

        editing = (EditText)findViewById(R.id.etext);
        encrpttxt = (EditText)findViewById(R.id.etextview);

        decbutton=(Button)findViewById(R.id.decryptbutton);
        encrypt = (Button)findViewById(R.id.ebutton);
        share = (Button)findViewById(R.id.eshare);


        decbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Encrpyt.this,Decrypt.class);
                startActivity(i);
            }
        });

        encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plaintext = editing.getText().toString();
                Toast.makeText(Encrpyt.this, plaintext, Toast.LENGTH_SHORT).show();
                encrypt(plaintext);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                File mediaStorageDir= new File(Environment.getExternalStorageDirectory()+"/SneakySecured/");
                if(!mediaStorageDir.exists()){
                    if(!mediaStorageDir.mkdirs()){
                        System.out.println("BOw");
                    }
                }
                String timestamp=new SimpleDateFormat("ddMMyyyy_HHmm").format(new Date()) ;

                File medialfile;
                String Filename= "SS_"+timestamp+".txt";
                medialfile=new File(mediaStorageDir.getPath()+File.separator+Filename);

                File original_file = medialfile;
//                Toast.makeText(Encrpyt.this,mediaStorageDir.getPath()+File.separator+Filename.toString(), Toast.LENGTH_SHORT).show();

                try {
                    FileWriter writer = new FileWriter(original_file);
                    writer.write(ciphertext);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,encrpttxt.getText().toString());
                startActivity(Intent.createChooser(i,"SHARE USING"));
            }
        });


    }
    public void encrypt(String text){
        int freq_num ;
        String output = "";

        int index ;
        String[] splited = text.split(" ");
        String[] word = new String[splited.length];
        word = splited;
        for(int i =0 ; i< splited.length ; i++){
            index=0;
            int[] num = new int[9999];
            for(int j =0 ; j<word[i].length();j++){
                index=0;
                System.out.println("BowWord : "+word[i].charAt(j) + "   "+j);
                freq_num=Frequency_values.freq.get(String.valueOf(word[i].charAt(j)));
                while(freq_num > 0){
                    num[index++] = freq_num%4;
                    freq_num = freq_num/4;
                }
                for(int k = index-1;k >= 0;k--){
                    switch(num[k])
                    {
                        case 0:
                            output+="A";
                            break;
                        case 1:
                            output+="T";
                            break;
                        case 2:
                            output+="G";
                            break;
                        case 3:
                            output+="C";
                            break;
                    }
                }
                if(j != word[i].length()-1){
                    output = output+"_";
                }

                System.out.println(word[i].charAt(j)+output);
            }
           if(i != splited.length-1){
               output = output+"&";
           }

           System.out.println("bow :"+word[i]);
           System.out.println("output : "+output);
        }
        ciphertext = output;
        encrpttxt.setText(ciphertext);
    }
}
