package com.deaenita.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView mShowCount;
    int mCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView)findViewById(R.id.text);
    }

    public void ShowToast(View view) {
        Toast.makeText(this, "Kamu Klik Button", Toast.LENGTH_SHORT).show();
    }

    public void CountUp(View view) {
        mCount++;
        if(mShowCount != null);
          mShowCount.setText(Integer.toString(mCount));
    }
}
