package com.dubuging.debuging;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;

import com.dubuging.debuging.listner.OnFragmentInteractionListener;


public class Main2Activity extends FragmentActivity implements OnFragmentInteractionListener {



    private static final String TAG = Main2Activity.class.getSimpleName();
    /** Called when the activity is first created. */


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG, "Second oncreate: ............................................................");

        Toast.makeText(Main2Activity.this,"Second ON CREATE", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d(TAG, "Second onstart: ............................................................");
        Toast.makeText(Main2Activity.this,"Second ON START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d(TAG, "Second onResume: ............................................................");
        Toast.makeText(Main2Activity.this,"Second ON RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d(TAG,"Second On pause................................");
        Toast.makeText(Main2Activity.this,"Second ON PAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Log.d(TAG,"Second On restart................................");
        Toast.makeText(Main2Activity.this,"Second ON RESTART", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated met
        // hod stub
        super.onStop();
        Log.d(TAG,"Second On onstop................................");
        Toast.makeText(Main2Activity.this,"Second ON STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        //TODO Auto-generated method stub
        super.onDestroy();
        Log.d(TAG,"Second On destroy................................");
        Toast.makeText(Main2Activity.this,"Second ON DESTROY", Toast.LENGTH_SHORT).show();
    }
}