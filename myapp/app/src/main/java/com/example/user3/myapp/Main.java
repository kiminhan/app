package com.example.user3.myapp;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main extends AppCompatActivity {
    ImageView imageView, imageView2, imageView3, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10;
    TextView text, text2, text3, text4, text5;

    int f_count=1, e_count=0, t_count=2, m_count = 0;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        //        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView) findViewById(R.id.imageView10);

        text = (TextView)findViewById(R.id.text);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);
        text5 = (TextView)findViewById(R.id.text5);

        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if ( flag == true ) {
                    imageView.setImageResource(R.drawable.wavelength);
                    Toast.makeText(getApplicationContext(), "WAVELENGTH 1064 변경됩니다", Toast.LENGTH_LONG).show();
                    text.setText("1064");
                    flag = false;
                }
                else {
                    imageView.setImageResource(R.drawable.wavelength2);
                    Toast.makeText(getApplicationContext(), "WAVELENGTH 532 변경됩니다", Toast.LENGTH_LONG).show();
                    text.setText("532");
                    flag = true;
                }
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if ( flag == true ) {
                    imageView6.setImageResource(R.drawable.standby2);
                    flag = false;
                }
                else {
                    imageView6.setImageResource(R.drawable.standby);
                    flag = true;
                }
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if ( flag == true ) {
                    imageView8.setImageResource(R.drawable.ready2);
                    flag = false;
                }
                else {
                    imageView8.setImageResource(R.drawable.ready);
                    flag = true;
                }
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_count++;
                text3.setText(""+f_count);
                if (f_count >= 10) {
                    f_count = 0;
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t_count > 10) {
                    t_count = 2;
                }
                text4.setText(""+t_count);
                t_count++;
                if (t_count == 3){
                    double e_count = (m_count*31.845);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 4){
                    double e_count = (m_count*14.154);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 5){
                    double e_count = (m_count*7.963);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 6){
                    double e_count = (m_count*5.1);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 7){
                    double e_count = (m_count*3.536);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 8){
                    double e_count = (m_count*2.6);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 9){
                    double e_count = (m_count*1.9909);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 10){
                    double e_count = (m_count*1.572);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 11){
                    double e_count = (m_count*1.2725);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_count += 5;
                text5.setText(""+m_count);
                if (m_count >= 500) {
                    m_count = 500;
                    text5.setText(""+m_count);
                }
                if (t_count == 3){
                    double e_count = (m_count*31.845);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 4){
                    double e_count = (m_count*14.154);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 5){
                    double e_count = (m_count*7.963);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 6){
                    double e_count = (m_count*5.1);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 7){
                    double e_count = (m_count*3.536);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 8){
                    double e_count = (m_count*2.6);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 9){
                    double e_count = (m_count*1.9909);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 10){
                    double e_count = (m_count*1.572);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 11){
                    double e_count = (m_count*1.2725);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_count -= 5;
                text5.setText(""+m_count);
                if (m_count <= 0) {
                    m_count = 0;
                    text5.setText(""+m_count);
                }
                if (t_count == 3){
                    double e_count = (m_count*31.845);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 4){
                    double e_count = (m_count*14.154);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 5){
                    double e_count = (m_count*7.963);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 6){
                    double e_count = (m_count*5.1);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 7){
                    double e_count = (m_count*3.536);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 8){
                    double e_count = (m_count*2.6);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 9){
                    double e_count = (m_count*1.9909);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 10){
                    double e_count = (m_count*1.572);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
                else if (t_count == 11){
                    double e_count = (m_count*1.2725);
                    e_count = (int)e_count;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String number = decimalFormat.format(e_count);
                    text2.setText(""+ number);
                }
            }
        });
    }
}