package com.arun.mycalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    TextView result;
    String buttonText="0";
    boolean lastNu=false;
    boolean lastDot=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =(TextView)findViewById(R.id.tvResult);

//        Button one =(Button) findViewById(R.id.btn1);
//        one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//             buttonText = one.getText().toString();
//             result.append(buttonText);
//            }
//        });

    }

    public void Clicked(View view) {
        Button b = (Button)view;
        buttonText = b.getText().toString();
        result.append(buttonText);
        lastNu=true;
        lastDot=false;

    }

    public void Clear(View view) {
        result.setText("");
    }

    public void DotFun(View view) {
        if(lastNu && !lastDot){
            result.append(".");
            lastDot=true;
            lastNu=false;
        }
    }

    public void Onequals(View view) {
        if(lastNu){
            String no= result.getText().toString();
 //           Double dd=Double.parseDouble((String) result.getText());
//            String neww= String.valueOf(dd);
//            result.setText(neww);


            if(no.contains("-")) {

                StringTokenizer obj = new StringTokenizer(no);
                String data[] = no.split("-");
                Double first = Double.parseDouble(data[0]);
                Double second = Double.parseDouble(data[1]);
                Double ans = first - second;
                String neww = String.valueOf(ans);
                result.setText(neww);
            }
            else if(no.contains("+")) {
                StringTokenizer obj = new StringTokenizer(no);
                String data[] = no.split("\\+");
                Double first = Double.parseDouble(data[0]);
                Double second = Double.parseDouble(data[1]);
                Double ans = first + second;
                String neww = String.valueOf(ans);
                result.setText(neww);
            }
            else if(no.contains("*")) {
                StringTokenizer obj = new StringTokenizer(no);
                String data[] = no.split("\\*");
                Double first = Double.parseDouble(data[0]);
                Double second = Double.parseDouble(data[1]);
                Double ans = first * second;
                String neww = String.valueOf(ans);
                result.setText(neww);
            }
            else if(no.contains("/")) {
                StringTokenizer obj = new StringTokenizer(no);
                String data[] = no.split("/");
                Double first = Double.parseDouble(data[0]);
                Double second = Double.parseDouble(data[1]);
                Double ans = first / second;
                String neww = String.valueOf(ans);
                result.setText(neww);
            }
            else if(no.contains("%")) {
                StringTokenizer obj = new StringTokenizer(no);
                String data[] = no.split("%");
                Double first = Double.parseDouble(data[0]);
                Double second = Double.parseDouble(data[1]);
                Double ans = first % second;
                String neww = String.valueOf(ans);
                result.setText(neww);
            }


        }
    }
}