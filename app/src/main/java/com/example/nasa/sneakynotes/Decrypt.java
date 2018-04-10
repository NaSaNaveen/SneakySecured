package com.example.nasa.sneakynotes;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Decrypt extends AppCompatActivity {

    EditText decrypttext;
    TextView decryptedtext;
    Button decrypt,share;

    Context context=this;
    String cipherText, plaintext ="" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
//        pass=(EditText)findViewById(R.id.pass);
        share=(Button)findViewById(R.id.dshare);
        decrypt = (Button)findViewById(R.id.dbutton);
        decryptedtext = (TextView) findViewById(R.id.dtextview);
        decrypttext = (EditText) findViewById(R.id.dtext);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(decryptedtext.getText().toString().equals("")){
                    Toast.makeText(context, "THERE IS NO DECRYPTED TEXT", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT,decryptedtext.getText().toString());
                    startActivity(Intent.createChooser(i,"SHARE USING"));
                }

            }
        });

        decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.password);

                final EditText pass = (EditText)dialog.findViewById(R.id.pass);
                Button done = (Button)dialog.findViewById(R.id.passok);

                done.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        if(pass.getText().toString().equals(""))
                        {
                            Toast.makeText(Decrypt.this, "ENTER PASSWORD", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            if(pass.getText().toString().equals("sneaky@123")) {
                                cipherText = decrypttext.getText().toString();
//                                Toast.makeText(Decrypt.this, cipherText, Toast.LENGTH_SHORT).show();
                                if(!cipherText.equals(""))
                                {
                                    decrption(cipherText);
                                }
                                else
                                {
                                    Toast.makeText(Decrypt.this, "Enter Encrypted Text to Decrypt", Toast.LENGTH_SHORT).show();
                                }
                                dialog.dismiss();
                            }
                            else{
                                Toast.makeText(Decrypt.this, "INCORRECT PASSWORD", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                dialog.show();
            }
        });
    }
    public void decrption(String text){
      String[] splited = text.split("&");
      String[] word = new String[splited.length];
      word = splited;
      for (int i =0 ; i< splited.length;i++){

              String[] splited1 = word[i].split("_");
              System.out.println("bow size : "+splited.length+splited1.length);
              for(int k=0; k < splited1.length ; k++){
                  System.out.println("bow bow : "+splited1[k]);
                  String changed = "";
                  for(int j =0 ; j < splited1[k].length();j++){
                      switch(splited1[k].charAt(j))
                      {
                          case 'A':
                              changed+='0';
                              break;
                          case 'T':
                              changed+='1';
                              break;
                          case 'G':
                              changed+='2';
                              break;
                          case 'C':
                              changed+='3';
                              break;
                      }
                  }

                  System.out.println("bow changed : "+changed +"   "+Frequency_values.reversefreq.get(Integer.parseInt(changed,4)));
                  plaintext +=Frequency_values.reversefreq.get(Integer.parseInt(changed,4));
              }

              plaintext +=" ";


          System.out.println("bow word"+word[i]+"   "+ plaintext);
          decryptedtext.setText(plaintext);
      }

    }
}
