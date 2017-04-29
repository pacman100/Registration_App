package com.example.sourabmangrulkar.raag_reg;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Sourab Mangrulkar on 1/24/2017.
 */

public class Backgroundworker2 extends AsyncTask<String,String,String> {
    Context context;
    String regcode;

    Backgroundworker2(Context context)
    {
        this.context=context;

    }

    @Override
    protected String doInBackground(String... strings) {
        String url1="http://192.168.9.171/appgr.php";
        try {
            regcode=strings[0];
            URL url = new URL(url1);
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            BufferedWriter br1=new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(),"UTF-8"));

            String postdata= URLEncoder.encode("regcode")+"="+URLEncoder.encode(regcode);
            br1.write(postdata);
            br1.flush();
            br1.close();
            BufferedReader br=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),"iso-8859-1"));

            String result="";
            String line="";
            while((line=br.readLine())!=null)
            {
                result+=line;
            }
            // Toast.makeText(context,"hi"+result,Toast.LENGTH_LONG).show();
            Log.d("Sfssssssssssssssssss",result);
            System.out.println("hghjgjgj"+result);
            br.close();
            SharedPreferences sharedPreferences=context.getSharedPreferences("hllo",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= sharedPreferences.edit();
            editor.putString("regco",result);
            editor.commit();


        }
        catch (Exception e)
        {
            Log.d("Sfssssssssssssssssss","hhh");
            System.out.println("hghjgjgj"+e);

            e.printStackTrace();
        }

        return null;
    }
}
