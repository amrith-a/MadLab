package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
                findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (TextUtils.isEmpty(t3.getText().toString())) {
                            Toast.makeText(getApplicationContext(), "empty text", Toast.LENGTH_LONG).show();
                            t3.setError("Enter Result");

                        } else {
                            int n1=Integer.parseInt(t1.getText().toString());
                            int n2=Integer.parseInt(t2.getText().toString());
                            int sum=Integer.parseInt(t3.getText().toString());


                            if(n1+n2==sum) {
                                Toast.makeText(getApplicationContext(), "You Win", Toast.LENGTH_LONG).show();


                            }else{
                                Toast.makeText(getApplicationContext(), "You Lose", Toast.LENGTH_LONG).show();

                            }
                        }

                    }
                });
    }
}




