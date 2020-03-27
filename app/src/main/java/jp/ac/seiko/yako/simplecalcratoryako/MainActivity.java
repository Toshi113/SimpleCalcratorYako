package jp.ac.seiko.yako.simplecalcratoryako;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static jp.ac.seiko.yako.simplecalcratoryako.Operations.PLUS;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView result_textView;
    private TextView problem_textView;

    private Button button_0;
    private Button button_00;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;

    private Button button_minus;
    private Button button_plus;
    private Button button_waru;
    private Button button_x;

    private Button button_clear;
    private Button button_equal;

    private int first_int = 0;
    private int second_int = 0;
    private String first_string = "";
    private String second_string = "";
    private int now_stage = 1;
    private String problem = "";


    private Operations operation = Operations.NONE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_textView = findViewById(R.id.textView_result);
        problem_textView = findViewById(R.id.textView_Problem);
        button_0 = findViewById(R.id.button_0);
        button_00 = findViewById(R.id.button_00);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_minus = findViewById(R.id.button_minus);
        button_plus = findViewById(R.id.button_plus);
        button_waru = findViewById(R.id.button_waru);
        button_x = findViewById(R.id.button_x);
        button_clear = findViewById(R.id.button_clear);
        button_equal = findViewById(R.id.button_equal);

        button_0.setOnClickListener(this);
        button_00.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);

        button_minus.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_x.setOnClickListener(this);
        button_waru.setOnClickListener(this);
        button_equal.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        init();
    }

    private void init() {
        result_textView.setText("");
        problem_textView.setText("");
        problem = "";
        now_stage = 1;
        operation = Operations.NONE;
        first_int = 0;
        second_int = 0;
        first_string = "";
        second_string = "";
    }

    private void calc() {
        Log.i("result","first_string:" + first_string + "first_int:" + String.valueOf(first_int) + "second_string:" + second_string + "second_int:" + String.valueOf(second_int));
        int result = 0;
        if(operation == Operations.PLUS){
            result = first_int + second_int;
        }else if(operation == Operations.MINUS) {
            result = first_int - second_int;
        }else if(operation == Operations.X) {
            result = first_int * second_int;
        }else if(operation == Operations.WARU) {
            result = first_int / second_int;
        }
        result_textView.setText(String.valueOf(result));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_0:
                if(now_stage == 1) {
                    first_string += "0";
                }else if(now_stage == 3) {
                    second_string += "0";
                }
                problem += "0";
                problem_textView.setText(problem);
                break;
            case R.id.button_00:
                if(now_stage == 1) {
                    first_string += "00";
                }else if(now_stage == 3) {
                    second_string += "00";
                }
                problem += "00";
                problem_textView.setText(problem);
                break;
            case R.id.button_1:
                if(now_stage == 1) {
                    first_string += "1";
                }else if(now_stage == 3) {
                    second_string += "1";
                }
                problem += "1";
                problem_textView.setText(problem);
                break;
            case R.id.button_2:
                if(now_stage == 1) {
                    first_string += "2";
                }else if(now_stage == 3) {
                    second_string += "2";
                }
                problem += "2";
                problem_textView.setText(problem);
                break;
            case R.id.button_3:
                if(now_stage == 1) {
                    first_string += "3";
                }else if(now_stage == 3) {
                    second_string += "3";
                }
                problem += "3";
                problem_textView.setText(problem);
                break;
            case R.id.button_4:
                if(now_stage == 1) {
                    first_string += "4";
                }else if(now_stage == 3) {
                    second_string += "4";
                }
                problem += "4";
                problem_textView.setText(problem);
                break;
            case R.id.button_5:
                if(now_stage == 1) {
                    first_string += "5";
                }else if(now_stage == 3) {
                    second_string += "5";
                }
                problem += "5";
                problem_textView.setText(problem);
                break;
            case R.id.button_6:
                if(now_stage == 1) {
                    first_string += "6";
                }else if(now_stage == 3) {
                    second_string += "6";
                }
                problem += "6";
                problem_textView.setText(problem);
                break;
            case R.id.button_7:
                if(now_stage == 1) {
                    first_string += "7";
                }else if(now_stage == 3) {
                    second_string += "7";
                }
                problem += "7";
                problem_textView.setText(problem);
                break;
            case R.id.button_8:
                if(now_stage == 1) {
                    first_string += "8";
                }else if(now_stage == 3) {
                    second_string += "8";
                }
                problem += "8";
                problem_textView.setText(problem);
                break;
            case R.id.button_9:
                if(now_stage == 1) {
                    first_string += "9";
                }else if(now_stage == 3) {
                    second_string += "9";
                }
                problem += "9";
                problem_textView.setText(problem);
                break;
            case R.id.button_minus:
                if(now_stage == 1) {
                    try{
                        first_int = Integer.parseInt(first_string);
                        operation = Operations.MINUS;
                    }catch(ArithmeticException e) {
                        return;
                    }
                    now_stage = 3;
                }
                problem += " - ";
                problem_textView.setText(problem);
                break;
            case R.id.button_plus:
                if(now_stage == 1) {
                    try{
                        first_int = Integer.parseInt(first_string);
                        operation = PLUS;
                    }catch(ArithmeticException e) {
                        return;
                    }
                    now_stage = 3;
                }
                problem += " + ";
                problem_textView.setText(problem);
                break;
            case R.id.button_x:
                if(now_stage == 1) {
                    try{
                        first_int = Integer.parseInt(first_string);
                        operation = Operations.X;
                    }catch(ArithmeticException e) {
                        return;
                    }
                    now_stage = 3;
                }
                problem += " X ";
                problem_textView.setText(problem);
                break;
            case R.id.button_waru:
                if(now_stage == 1) {
                    try{
                        first_int = Integer.parseInt(first_string);
                        operation = Operations.WARU;
                    }catch(ArithmeticException e) {
                        return;
                    }
                    now_stage = 3;
                }
                problem += " ÷ ";
                problem_textView.setText(problem);
                break;
            case R.id.button_clear:
                init();
                break;
            case R.id.button_equal:
                try {
                    second_int = Integer.parseInt(second_string);
                }catch(ArithmeticException e) {
                    return;
                }
                now_stage = 5;
                calc();
        }
    }
}
