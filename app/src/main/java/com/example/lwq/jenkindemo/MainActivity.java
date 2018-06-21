package com.example.lwq.jenkindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"dev测试",Toast.LENGTH_SHORT).show();
        System.out.println("git  fetch  test3");
        System.out.println("git  fetch  test3");
    }
}
