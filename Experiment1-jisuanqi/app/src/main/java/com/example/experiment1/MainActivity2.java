package com.example.experiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button back =(Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button enter =(Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bef = 0;
                int aft = 0;
                TextView textViewBefore = (TextView) findViewById(R.id.textViewBefore);
                String beforeStr = textViewBefore.getText().toString();
                TextView textViewAfter = (TextView) findViewById(R.id.textViewAfter);
                String afterStr = textViewAfter.getText().toString();
                switch(beforeStr) {
                    case "纳米":
                        bef = 1;
                        break;
                    case "微米":
                        bef = 4;
                        break;
                    case "毫米":
                        bef = 7;
                        break;
                    case "厘米":
                        bef = 8;
                        break;
                    case "米":
                        bef = 10;
                        break;
                    case "千米":
                        bef = 13;
                        break;
                }

                switch(afterStr) {
                    case "纳米":
                        aft = 1;
                        break;
                    case "微米":
                        aft = 4;
                        break;
                    case "毫米":
                        aft = 7;
                        break;
                    case "厘米":
                        aft = 8;
                        break;
                    case "米":
                        aft = 10;
                        break;
                    case "千米":
                        aft = 13;
                        break;
                }

                EditText editText = (EditText) findViewById(R.id.before);
                int before = Integer.parseInt(editText.getText().toString());
                TextView textView = (TextView) findViewById(R.id.after);
                double after = Math.pow(10,bef-aft) * before;
                textView.setText(after+"");
            }
        });

    }

    public void beforeUnit(View v) {
        PopupMenu p = new PopupMenu(this, v);
        p.setOnMenuItemClickListener(this);
        p.inflate(R.menu.menu_before);
        p.show();
    }

    public void afterUnit(View v) {
        PopupMenu p = new PopupMenu(this, v);
        p.setOnMenuItemClickListener(this);
        p.inflate(R.menu.menu_after);
        p.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nm1:
                TextView nm1 = (TextView) findViewById(R.id.textViewBefore);
                nm1.setText("纳米");
                break;
            case R.id.um1:
                TextView um1 = (TextView) findViewById(R.id.textViewBefore);
                um1.setText("微米");
                break;
            case R.id.mm1:
                TextView mm1 = (TextView) findViewById(R.id.textViewBefore);
                mm1.setText("毫米");
                break;
            case R.id.cm1:
                TextView cm1 = (TextView) findViewById(R.id.textViewBefore);
                cm1.setText("厘米");
                break;
            case R.id.m1:
                TextView m1 = (TextView) findViewById(R.id.textViewBefore);
                m1.setText("米");
                break;
            case R.id.km1:
                TextView km1 = (TextView) findViewById(R.id.textViewBefore);
                km1.setText("千米");
                break;
            case R.id.nm2:
                TextView nm2 = (TextView) findViewById(R.id.textViewAfter);
                nm2.setText("纳米");
                break;
            case R.id.um2:
                TextView um2 = (TextView) findViewById(R.id.textViewAfter);
                um2.setText("微米");
                break;
            case R.id.mm2:
                TextView mm2 = (TextView) findViewById(R.id.textViewAfter);
                mm2.setText("毫米");
                break;
            case R.id.cm2:
                TextView cm2 = (TextView) findViewById(R.id.textViewAfter);
                cm2.setText("厘米");
                break;
            case R.id.m2:
                TextView m2 = (TextView) findViewById(R.id.textViewAfter);
                m2.setText("米");
                break;
            case R.id.km2:
                TextView km2 = (TextView) findViewById(R.id.textViewAfter);
                km2.setText("千米");
                break;
        }
        return false;
    }
}