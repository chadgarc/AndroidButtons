package com.example.chris.kokoagame_menu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //MediaPlayer mp = MediaPlayer.create(this, R.raw.menuchoose);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se añaden todos los botones creados
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);

        // Animacion solo para el boton de salida
        final Button exit = (Button)findViewById(R.id.exit);
        final MediaPlayer mpexit = MediaPlayer.create(this, R.raw.closemenu);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpexit.start();
                Toast.makeText(MainActivity.this,"#"+view.getId(),Toast.LENGTH_LONG).show();
                exit.setBackgroundResource(R.drawable.btns_e);
            }
        });

    }

    // Animacion para todos los botones
    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub
        MediaPlayer mpbutton = MediaPlayer.create(this, R.raw.menuchoose);
        mpbutton.start();
        Toast.makeText(MainActivity.this,"#"+view.getId(),Toast.LENGTH_LONG).show();
        Button btn = new Button(this);
        btn.setBackgroundResource(R.drawable.btns_b);
    }
}
