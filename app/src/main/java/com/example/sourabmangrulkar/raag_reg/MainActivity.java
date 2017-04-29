package com.example.sourabmangrulkar.raag_reg;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    Button scan, submit, scan2, submit2;
    EditText regNo,regNo2;
    final Activity activity = this;
    int whichOne=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ActionBar ab=getSupportActionBar();
       // ab.setLogo(R.drawable.raag);
        //ab.setDisplayUseLogoEnabled(true);
        //ab.setDisplayShowHomeEnabled(true);
        setTitle("Raag NITG");
        scan = (Button) findViewById(R.id.scan_btn);
        submit = (Button) findViewById(R.id.submit_btn);
        regNo = (EditText) findViewById(R.id.editText);
        regNo2 = (EditText) findViewById(R.id.editText2);
        scan2 = (Button) findViewById(R.id.scan_btn2);
        submit2 = (Button) findViewById(R.id.submit_btn2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackgroundWorker bg=new BackgroundWorker(getApplicationContext());
                bg.execute(regNo.getText().toString());
                long  time=System.currentTimeMillis();
                while (System.currentTimeMillis()>time+5*1000)
                {

                }
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Backgroundworker2 bg1=new Backgroundworker2(getApplicationContext());
                bg1.execute(regNo2.getText().toString());
                long  time=System.currentTimeMillis();
                while (System.currentTimeMillis()>time+5*1000)
                {

                }
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
            }
        });
        scanButtonListener();
        scan2ButtonListener();
    }

    public void scanButtonListener(){

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whichOne=0;
                //Toast.makeText(view.getContext(), "scan method", Toast.LENGTH_LONG).show();
                IntentIntegrator intentIntegrator = new IntentIntegrator(activity);
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                intentIntegrator.setPrompt("Scan");
                intentIntegrator.setCameraId(0);
                intentIntegrator.setBeepEnabled(false);
                intentIntegrator.setBarcodeImageEnabled(false);
                intentIntegrator.initiateScan();
            }
        });
    }

    public void scan2ButtonListener(){

        scan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whichOne=1;
                //Toast.makeText(view.getContext(), "scan method", Toast.LENGTH_LONG).show();
                IntentIntegrator intentIntegrator = new IntentIntegrator(activity);
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                intentIntegrator.setPrompt("Scan");
                intentIntegrator.setCameraId(0);
                intentIntegrator.setBeepEnabled(false);
                intentIntegrator.setBarcodeImageEnabled(false);
                intentIntegrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            else
            {
                    if(whichOne == 0) {
                        regNo.setText(result.getContents().toString());
                        Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                    }
                else if(whichOne == 1) {
                        regNo2.setText(result.getContents().toString());
                        Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                    }
            }
        }

        else
            super.onActivityResult(requestCode, resultCode, data);
    }
}
