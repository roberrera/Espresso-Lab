package com.roberterrera.espresso_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

  TextView mCurrentBalance;
  Button mIncrease, mDecrease, mContactInfo;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mCurrentBalance = (TextView)findViewById(R.id.current_balance);
    mIncrease = (Button)findViewById(R.id.button_increase);
    mDecrease = (Button)findViewById(R.id.button_decrease);
    mContactInfo = (Button)findViewById(R.id.button_contactinfo);

    mCurrentBalance.setText("100");

    mDecrease.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        int balance = Integer.valueOf(mCurrentBalance.getText().toString());
        int decreaseBalance = balance - 5;

        mCurrentBalance.setText(String.valueOf(decreaseBalance));

      }
    });

    mIncrease.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        int balance = Integer.valueOf(mCurrentBalance.getText().toString());
        int increaseBalance = balance + 5;
        mCurrentBalance.setText(String.valueOf(increaseBalance));

      }
    });

    mContactInfo.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(intent);
      }
    });

  }
}
