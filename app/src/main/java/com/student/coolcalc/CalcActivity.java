package com.student.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class CalcActivity extends Activity {

    TextView resultsView;

    public enum Operation {
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
    }

    String runningNumber ="";
    String leftValueStr = "";
    String rightValueStr ="";

    Operation currentOperation;
    int result = 0;

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

        ImageButton calcBtn = (ImageButton)findViewById(R.id.calcBtn);
        ImageButton divideBtn = (ImageButton)findViewById(R.id.divideBtn);
        ImageButton multiplyBtn = (ImageButton)findViewById(R.id.multiplyBtn);
        ImageButton subtractBtn = (ImageButton)findViewById(R.id.subtractBtn);
        ImageButton addBtn = (ImageButton)findViewById(R.id.addBtn);

        resultsView = (TextView)findViewById(R.id.resultsTxt);

        resultsView.setText(""); // Shows when app loads


        oneBtn.setOnClickListener(new View.OnClickListener(){  // anonymous inner class
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(1);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(2);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(3);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(4);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(5);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(6);
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(7);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(8);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(9);
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                numberPressed(0);
            }
        });

        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                processOperation(Operation.EQUAL);// Takes current operation and applies to left/right values
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                processOperation(Operation.DIVIDE);
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                processOperation(Operation.MULTIPLY);
            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                processOperation(Operation.SUBTRACT);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                processOperation(Operation.ADD);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener(){
            @Override  // create unique response
            public void onClick(View v){
                leftValueStr = "";
                rightValueStr = "";
                result = 0;
                runningNumber ="";
                currentOperation = null;
                resultsView.setText("0");

            }
        });

    }


    void processOperation(Operation operation){
        if (currentOperation != null){
            if (runningNumber!= ""){ // if users type values
                rightValueStr = runningNumber;

                switch(currentOperation){
                    case ADD:
                        result = Integer.parseInt(leftValueStr) + Integer.parseInt(rightValueStr);
                        break;
                    case SUBTRACT:
                        result = Integer.parseInt(leftValueStr) - Integer.parseInt(rightValueStr);
                        break;
                    case DIVIDE:
                        result = Integer.parseInt(leftValueStr) / Integer.parseInt(rightValueStr);
                        break;
                    case MULTIPLY:
                        result = Integer.parseInt(leftValueStr) * Integer.parseInt(rightValueStr);
                        break;
                }

                leftValueStr = String.valueOf(result);  // move result to leftValStr
                resultsView.setText(leftValueStr);
            }
        }

        else {
            leftValueStr = runningNumber;
            runningNumber = "";

        }

        currentOperation = operation;// Always update operation to operation selected by user
    }

    // Code to handle events when a number is pressed

    void numberPressed(int number){ // Stores running number when a button is pressed
        runningNumber += String.valueOf(number);
        resultsView.setText(runningNumber);
    }

}
