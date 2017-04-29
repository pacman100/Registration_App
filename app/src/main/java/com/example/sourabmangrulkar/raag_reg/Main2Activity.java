package com.example.sourabmangrulkar.raag_reg;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView1=(TextView)findViewById(R.id.value1);
        TextView textView2=(TextView)findViewById(R.id.value2);
        TextView textView3=(TextView)findViewById(R.id.value3);
        TextView textView4=(TextView)findViewById(R.id.value4);
        TextView textView5=(TextView)findViewById(R.id.value5);
        TextView textView6=(TextView)findViewById(R.id.value6);
        TextView textView7=(TextView)findViewById(R.id.value7);
        TextView textView8=(TextView)findViewById(R.id.value8);
        TextView textView9=(TextView)findViewById(R.id.value9);
        TextView textView10=(TextView)findViewById(R.id.value10);
        TextView textView11=(TextView)findViewById(R.id.value11);
        TextView textView12=(TextView)findViewById(R.id.value12);
        TextView textView13=(TextView)findViewById(R.id.value13);
        TextView textView14=(TextView)findViewById(R.id.value14);
        TextView textView15=(TextView)findViewById(R.id.value15);
        TextView textView16=(TextView)findViewById(R.id.value16);
        TextView textView17=(TextView)findViewById(R.id.value17);
        TextView textView18=(TextView)findViewById(R.id.value18);
        TextView textView19=(TextView)findViewById(R.id.value19);
        TextView textView20=(TextView)findViewById(R.id.value20);
        TextView textView21=(TextView)findViewById(R.id.value21);
        TextView textView22=(TextView)findViewById(R.id.value22);
        TextView textView23=(TextView)findViewById(R.id.value23);
        TextView textView24=(TextView)findViewById(R.id.value24);
        SharedPreferences sharedPreferences=getSharedPreferences("hllo", Context.MODE_PRIVATE);
        //textView.setText(sharedPreferences.getString("regcode","hi"));
        String sentence=sharedPreferences.getString("regcode","hi");
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
        int f15=sentence.indexOf('#',f14+1);
        int f16=sentence.indexOf('#',f15+1);
        int f17=sentence.indexOf('#',f16+1);
        int f18=sentence.indexOf('#',f17+1);
        int f19=sentence.indexOf('#',f18+1);
        int f20=sentence.indexOf('#',f19+1);
        int f21=sentence.indexOf('#',f20+1);
        int f22=sentence.indexOf('#',f21+1);
        int f23=sentence.indexOf('#',f22+1);
        int f24=sentence.indexOf('#',f23+1);
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
        String word15=sentence.substring(f14+1,f15);
        String word16=sentence.substring(f15+1,f16);
        String word17=sentence.substring(f16+1,f17);
        String word18=sentence.substring(f17+1,f18);
        String word19=sentence.substring(f18+1,f19);
        String word20=sentence.substring(f19+1,f20);
        String word21=sentence.substring(f20+1,f21);
        String word22=sentence.substring(f21+1,f22);
        String word23=sentence.substring(f22+1,f23);
        String word24=sentence.substring(f23+1,f24);

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
        textView15.setText(word15);
        textView16.setText(word16);
        textView17.setText(word17);
        textView18.setText(word18);
        textView19.setText(word19);
        textView20.setText(word20);
        textView21.setText(word21);
        textView22.setText(word22);
        textView23.setText(word23);
        textView24.setText(word24);





    }
}
