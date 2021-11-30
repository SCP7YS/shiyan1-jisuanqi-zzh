package com.example.experiment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator();



        TextView textView = (TextView) findViewById(R.id.textView);

        Button zero = (Button) findViewById(R.id.zero);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);

        Button ce = (Button) findViewById(R.id.ce);

        Button dian = (Button) findViewById(R.id.dian);

        Button jiahao = (Button) findViewById(R.id.jiahao);
        Button jianhao = (Button) findViewById(R.id.jianhao);
        Button chenghao = (Button) findViewById(R.id.chenghao);
        Button chuhao = (Button) findViewById(R.id.chuhao);

        Button genhao = (Button) findViewById(R.id.genhao);
        Button pingfang = (Button) findViewById(R.id.pingfang);
        Button lifang = (Button) findViewById(R.id.lifang);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button xfenzhi1 = (Button) findViewById(R.id.xfenzhi1) ;

        Button kuohao1 = (Button) findViewById(R.id.kuohao1);
        Button kuohao2 = (Button) findViewById(R.id.kuohao2);

        Button dengyu = (Button) findViewById(R.id.dengyu);




        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("0",textView);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("1",textView);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("2",textView);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("3",textView);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("4",textView);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("5",textView);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("6",textView);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("7",textView);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("8",textView);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("9",textView);
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().equals("")) {
                    textView.setText("0.");
                } else {
                    textView.append(".");
                }
            }
        });

        jiahao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.calculate(textView.getText().toString(),"+");
                textView.setText("");
            }
        });

        jianhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.calculate(textView.getText().toString(),"-");
                textView.setText("");
            }
        });

        chenghao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.calculate(textView.getText().toString(),"*");
                textView.setText("");
            }
        });

        chuhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.calculate(textView.getText().toString(),"/");
                textView.setText("");
            }
        });

        dengyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(calculator.calculate(textView.getText().toString(),"="));
                toConversion(textView);
            }
        });

        genhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Math.sqrt(Double.parseDouble(textView.getText().toString()));
                textView.setText(result.toString());
            }
        });

        pingfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Math.pow(Double.parseDouble(textView.getText().toString()),2);
                textView.setText(result.toString());
            }
        });

        lifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Math.pow(Double.parseDouble(textView.getText().toString()),3);
                textView.setText(result.toString());
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Math.sin(Double.parseDouble(textView.getText().toString()));
                textView.setText(result.toString());
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Math.cos(Double.parseDouble(textView.getText()

                        .toString()));
                textView.setText(result.toString());
            }
        });

        xfenzhi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = 1/Double.parseDouble(textView.getText().toString());
                textView.setText(result.toString());
            }
        });

        kuohao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] str = new String[5];
                str[0] = "0";
                calculator.cal.add(str);
                calculator.index++;
                textView.setText("");
            }
        });

        kuohao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(calculator.calculate(textView.getText().toString(),"="));
                calculator.cal.remove(calculator.index);
                calculator.index--;
                toConversion(textView);
            }
        });




    }

    public void setNumber(String num, TextView textView) {
        if(textView.getText().toString().equals("")|| textView.getText().toString().equals("0")) {
            textView.setText(num);
        } else {
            textView.append(num);
        }
        toConversion(textView);

    }

    public void toConversion(TextView textView) {
        String s = textView.getText().toString();
        double d = Double.parseDouble(s);
        int i = (int) d;
        TextView HEX = (TextView) findViewById(R.id.HEX);
        HEX.setText(""+Integer.toHexString(i));
        TextView DEC = (TextView) findViewById(R.id.DEC);
        DEC.setText(""+i);
        TextView OCT = (TextView) findViewById(R.id.OCT);
        OCT.setText(""+Integer.toOctalString(i));
        TextView BIN = (TextView) findViewById(R.id.BIN);
        BIN.setText(""+Integer.toBinaryString(i));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help:
                showHelp();
                return true;
            case R.id.unit:
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                return true;
            case R.id.exit:
                finish();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showHelp() {
        Toast.makeText(MainActivity.this, "help", Toast.LENGTH_LONG).show();
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);

        }else{
            setContentView(R.layout.activity_main2);

        }
    }
}
