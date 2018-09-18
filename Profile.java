package com.example.android.splashapplication;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profile extends AppCompatActivity {

    private Context context;

    final static String TAG="deleted";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        context=this;
    }
    public void delete(View view)
    {
        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        user.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    Log.d(TAG,"user account deleted");
                }
            }
        });
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

    public void logOut(View view)
    {
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(this, "Logged  out!", Toast.LENGTH_LONG).show();
        Intent i=new Intent(Profile.this, signup.class);
        startActivity(i);
        finish();
    }
}
