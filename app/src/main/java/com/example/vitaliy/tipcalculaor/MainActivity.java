package com.example.vitaliy.tipcalculaor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private static final NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormat = NumberFormat.getPercentInstance();

    private double billAmount = 0.0;
    private double percent = 0.15;
    private TextView amountTextView;
    private TextView percentTextView;
    private TextView tipTextView;
    private TextView totalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountTextView = (TextView)findViewById(R.id.amountEditText);
        percentTextView = (TextView)findViewById(R.id.percentTextView);
        tipTextView = (TextView)findViewById(R.id.tipTextView);
        totalTextView = (TextView)findViewById(R.id.totalTextView);
        tipTextView.setText(currentFormat.format(0));
        tipTextView.setText(currentFormat.format(0));

        EditText amountEditText = (EditText)findViewById(R.id.amountEditText);
        amountEditText.addTextChangedListener(amountEditTextWatcher);

        SeekBar percentSeekBar = (SeekBar)findViewById(R.id.percentSeekBar);
        percentSeekBar.setOnSeekBarChangeListener(seekBarListener);
    }
}
