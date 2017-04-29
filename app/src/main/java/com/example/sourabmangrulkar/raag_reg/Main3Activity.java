package com.example.sourabmangrulkar.raag_reg;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView1=(TextView)findViewById(R.id.value101);
        TextView textView2=(TextView)findViewById(R.id.value102);
        TextView textView3=(TextView)findViewById(R.id.value103);
        TextView textView4=(TextView)findViewById(R.id.value104);
        TextView textView5=(TextView)findViewById(R.id.value105);
        TextView textView6=(TextView)findViewById(R.id.value106);
        TextView textView7=(TextView)findViewById(R.id.value107);
        TextView textView8=(TextView)findViewById(R.id.value108);
        TextView textView9=(TextView)findViewById(R.id.value109);
        TextView textView10=(TextView)findViewById(R.id.value110);
        TextView textView11=(TextView)findViewById(R.id.value111);
        TextView textView12=(TextView)findViewById(R.id.value112);
        TextView textView13=(TextView)findViewById(R.id.value113);
        TextView textView14=(TextView)findViewById(R.id.value114);

        SharedPreferences sharedPreferences=getSharedPreferences("hllo", Context.MODE_PRIVATE);
        //textView.setText(sharedPreferences.getString("regcode","hi"));
        String sentence=sharedPreferences.getString("regco","hi");
        int f1=sentence.indexOf('#');
        int f2=sentence.indexOf('#',f1+1);
        int f3=sentence.indexOf('#',f2+1);
        int f4=sentence.indexOf('#',f3+1);
        int f5=sentence.indexOf('#',f4+1);
        int f6=sentence.indexOf('#',f5+1);
        int f7=sentence.indexOf('#',f6+1);
        int f8=sentence.indexOf('#',f7+1);
        int f9=sentence.indexOf('#',f8+1);
        int f10=sentence.indexOf('#',f9+1);
        int f11=sentence.indexOf('#',f10+1);
        int f12=sentence.indexOf('#',f11+1);
        int f13=sentence.indexOf('#',f12+1);
        int f14=sentence.indexOf('#',f13+1);

        //System.out.println(f1+" "+f2);
        String word1=sentence.substring(0,f1);
        String word2=sentence.substring(f1+1,f2);
        String word3=sentence.substring(f2+1,f3);
        String word4=sentence.substring(f3+1,f4);
        String word5=sentence.substring(f4+1,f5);
        String word6=sentence.substring(f5+1,f6);
        String word7=sentence.substring(f6+1,f7);
        String word8=sentence.substring(f7+1,f8);
        String word9=sentence.substring(f8+1,f9);
        String word10=sentence.substring(f9+1,f10);
        String word11=sentence.substring(f10+1,f11);
        String word12=sentence.substring(f11+1,f12);
        String word13=sentence.substring(f12+1,f13);
        String word14=sentence.substring(f13+1,f14);


        textView1.setText(word1);
        textView2.setText(word2);
        textView3.setText(word3);
        textView4.setText(word4);
        textView5.setText(word5);
        textView6.setText(word6);
        textView7.setText(word7);
        textView8.setText(word8);
        textView9.setText(word9);
        textView10.setText(word10);
        textView11.setText(word11);
        textView12.setText(word12);
        textView13.setText(word13);
        textView14.setText(word14);





    }
}
