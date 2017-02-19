package com.example.abwbw.pushexample;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int i = 0;
    private int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtn1(View view){
        NotificationCompat.Builder  builder = new NotificationCompat.Builder(this);
        builder.setContentText("app 2 btn1 hello" + i);
        builder.setTicker("ticker");
        builder.setContentTitle("title");
        builder.setSmallIcon(R.drawable.icon);
        builder.setWhen(1487519755L);
        NotificationManagerCompat.from(this).notify(1, builder.build());
    }

    public void onBtn2(View view){
        NotificationCompat.Builder  builder = new NotificationCompat.Builder(this);
        builder.setContentText("app 2 btn2 hello" + i);
        builder.setTicker("ticker");
        builder.setContentTitle("title");
        builder.setSmallIcon(R.drawable.icon);
        builder.setWhen(1487519755L);
        NotificationManagerCompat.from(this).notify(2, builder.build());
    }
}
