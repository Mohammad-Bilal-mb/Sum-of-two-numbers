package com.bilal3000.practice1;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView st;
    EditText n1, n2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = findViewById(R.id.sumbutton);
        n1 = findViewById(R.id.firstNumber);
        n2 = findViewById(R.id.secondNumber);
        st = findViewById(R.id.ans);
    }
    public void sum(View view) {

        String s1 = n1.getText().toString();
        int num1 = Integer.parseInt(s1);

        String s2 = n2.getText().toString();
        int num2 = Integer.parseInt(s2);

//        String s3 = st.getText().toString();
        int sum = num1+num2;
        st.setText(""+sum);
    }
}