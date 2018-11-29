package com.example.user.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int i = 42;
    Button btnarray[];
    int status[];
    int btncount = 0;
    Button btn_6202;
    Button seabar2;
    LinearLayout layout;
    LinearLayout parent_layout;
    LinearLayout layout2;
    LinearLayout layout3;
    LinearLayout layout4;
    LinearLayout layout5;
    LinearLayout layout6;
    LinearLayout layout7;
    LinearLayout layout8;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rnd = new Random();

        btnarray = new Button[42];
        status = new int[42];
        for (int i=0; i<42; i++){
            status[i] = rnd.nextInt(2);
        }

        parent_layout = (LinearLayout) findViewById(R.id.parent_layout);
        layout = (LinearLayout) findViewById(R.id.createlayout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

        layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        layout3 = new LinearLayout(this);
        layout3.setOrientation(LinearLayout.HORIZONTAL);
        layout4 = new LinearLayout(this);
        layout4.setOrientation(LinearLayout.HORIZONTAL);
        layout5 = new LinearLayout(this);
        layout5.setOrientation(LinearLayout.HORIZONTAL);
        layout6 = new LinearLayout(this);
        layout6.setOrientation(LinearLayout.HORIZONTAL);
        layout7 = new LinearLayout(this);
        layout7.setOrientation(LinearLayout.HORIZONTAL);
        layout8 = new LinearLayout(this);
        layout8.setOrientation(LinearLayout.HORIZONTAL);
        btn_6202 = (Button) findViewById(R.id.btn_6202);
        btn_6202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layout.addView(layout2);
                layout.addView(layout3);
                layout.addView(layout4);
                layout.addView(layout5);
                layout.addView(layout6);
                layout.addView(layout7);
                layout.addView(layout8);


                setContentView(parent_layout);

                layout.setVisibility(View.VISIBLE);

                LinearLayout.LayoutParams miss = (LinearLayout.LayoutParams) btn_6202.getLayoutParams();
                miss.bottomMargin=0;
                miss.topMargin=0;

                btn_6202.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 80));
//                btn_6202.startAnimation(animation);
            }
        });
        for (; i > 36; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout8.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout8.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
        for (; i > 30; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout7.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout7.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
        for (; i > 24; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout6.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout6.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
        for (; i > 18; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout5.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout5.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
        for (; i > 12; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout4.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout4.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
        for (; i > 6; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout3.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout3.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
        for (; i > 0; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout2.addView(b);
            if (i % 2 == 1) {
                TextView t = new TextView((this));
                t.setText("   ");
                layout2.addView(t);
            }
            btnarray[btncount] = b;
            pcstatus(btnarray[btncount], status[btncount]);
            btncount++;
        }
    }

    public void pcstatus(Button b, int i){
        if (i == 0){
            b.setBackgroundColor(Color.rgb(183,183,183));
        }
        else{
            b.setBackgroundColor(Color.rgb(247,208,236));
        }
    }
}