package com.example.shado.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    // creates all of the button objects
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv, buttonMul,
            button10, buttonC, buttonEqual;
    // creates the edit text object
    EditText calculatorEditText;
    //creates two floats
    float mValueOne, mValueTwo;
    // creates booleans for the calculator functions
    boolean calculatorAddition, mSubtract, calculatorMultiplication, calculatorDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        calculatorEditText = (EditText) findViewById(R.id.edt1);

        // implement logic for clicking on any button and making EditText display

        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + "9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText(calculatorEditText.getText() + ".");
            }
        });

        // implement logic for adding the two buttons. the one before add is clicked and the one after
        // logic is used for subtraction, multiplication, and division as well
        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (calculatorEditText == null)
                {
                    calculatorEditText.setText("");
                }
                else
                {
                    mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                    calculatorAddition = true; // this will be used when the equal button is clicked
                    calculatorEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                mSubtract = true;
                calculatorEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                calculatorMultiplication = true;
                calculatorEditText.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                calculatorDivision = true;
                calculatorEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueTwo = Float.parseFloat(calculatorEditText.getText() + "");

                if (calculatorAddition == true)
                {
                    calculatorEditText.setText(mValueOne + mValueTwo + "");
                    calculatorAddition = false;
                }

                if (mSubtract == true)
                {
                    calculatorEditText.setText(mValueOne + mValueTwo + "");
                    mSubtract = false;
                }

                if (calculatorMultiplication == true)
                {
                    calculatorEditText.setText(mValueOne + mValueTwo + "");
                    calculatorMultiplication = false;
                }

                if (calculatorDivision == true)
                {
                    calculatorEditText.setText(mValueOne + mValueTwo + "");
                    calculatorDivision = false;
                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorEditText.setText("");
            }
        });

    }
}
