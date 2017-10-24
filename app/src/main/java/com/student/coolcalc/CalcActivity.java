package com.student.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class CalcActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

                //Allow automatic imports when button etc are first written
        Button oneBtn = (Button)findViewById(R.id.oneBtn);
        Button twoBtn = (Button)findViewById(R.id.twoBtn);
        Button threeBtn = (Button)findViewById(R.id.threeBtn);
        Button fourBtn = (Button)findViewById(R.id.fourBtn);
        Button fiveBtn = (Button)findViewById(R.id.fiveBtn);
        Button sixBtn = (Button)findViewById(R.id.sixBtn);
        Button sevenBtn = (Button)findViewById(R.id.sevenBtn);
        Button eightBtn = (Button)findViewById(R.id.eightBtn);
        Button nineBtn = (Button)findViewById(R.id.nineBtn);
        Button zeroBtn = (Button)findViewById(R.id.zeroBtn);

        Button clearBtn = (Button)findViewById(R.id.clearBtn);
        //Button calcBtn = (Button)findViewById(R.id.calcBtn);

        ImageButton calcBtn = (ImageButton)findViewById(R.id.calcBtn);
        ImageButton divideBtn = (ImageButton)findViewById(R.id.divideBtn);
        ImageButton multiplyBtn = (ImageButton)findViewById(R.id.multiplyBtn);
        ImageButton subtractBtn = (ImageButton)findViewById(R.id.subtractBtn);
        ImageButton addBtn = (ImageButton)findViewById(R.id.addBtn);

        TextView resultsView = (TextView)findViewById(R.id.resultsTxt);


        oneBtn.setOnClickListener(new View.OnClickListener(){  // anonymous inner class
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){

            }
        });

    }
}
