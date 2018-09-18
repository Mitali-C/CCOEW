package com.example.android.splashapplication;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Notices extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices);
        context=this;
    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.profile)
        {
            Intent intent = new Intent(context, Profile.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.notices)
        {
            Intent intent = new Intent(context, Notices.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.alumnae)
        {
            Intent intent = new Intent(context, Alumnae.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.events)
        {
            Intent intent = new Intent(context, Events.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.competitions)
        {
            Intent intent = new Intent(context, Competitions.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.saved)
        {
            Intent intent = new Intent(context, saved.class);
            startActivity(intent);
        }
    }
}
