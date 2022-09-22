package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ClipboardManager copyng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onMyButtonClick(View view) {
        EditText text1 = findViewById(R.id.text1);
        EditText text2 = findViewById(R.id.text2);
        EditText text3 = findViewById(R.id.text3);
        TextView done = findViewById(R.id.textView);
        String a = (text1.getText().toString());
        String b = (text2.getText().toString());
        String c = (text3.getText().toString());
        if ((Objects.equals(a, "")) || (Objects.equals(b, "")) || (Objects.equals(c, ""))){
            done.setText(R.string.needmore);
        }
        else{
            List listin = new ArrayList();
            listin.add(a);
            listin.add(b);
            listin.add(c);
            Switch symb = findViewById(R.id.symbols);
            if(symb.isChecked()){
                done.setText(cod.codws(listin));
            }
            else {
                done.setText(cod.cod(listin));
            }
            Button copy = findViewById(R.id.button_copy);
            copy.setVisibility(View.VISIBLE);
        }
    }

    public void setPrimaryClip (ClipData clip){

    }
    public void Copy(View view) {
        copyng = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        TextView done = findViewById(R.id.textView);
        String txtCopy = done.getText().toString();
        ClipData clip;
        clip = ClipData.newPlainText("text", txtCopy);
        copyng.setPrimaryClip(clip);
    }
}