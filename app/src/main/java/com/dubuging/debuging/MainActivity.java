package com.dubuging.debuging;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnCallSecondActivity;
    private static final String TAG = MainActivity.class.getSimpleName();
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onResume: ............................................................");
        mBtnCallSecondActivity=(Button)findViewById(R.id.id_btn_CallSecondActivity);

        mBtnCallSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(MainActivity.this,"ON CREATE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d(TAG, "onstart: ............................................................");
        Toast.makeText(MainActivity.this,"ON START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d(TAG, "onResume: ............................................................");
        Toast.makeText(MainActivity.this,"ON RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d(TAG,"On pause................................");
        Toast.makeText(MainActivity.this,"ON PAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Log.d(TAG,"On restart................................");
        Toast.makeText(MainActivity.this,"ON RESTART", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated met
        // hod stub
        super.onStop();
        Log.d(TAG,"On onstop................................");
        Toast.makeText(MainActivity.this,"ON STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        //TODO Auto-generated method stub
        super.onDestroy();
        Log.d(TAG,"On destroy................................");
        Toast.makeText(MainActivity.this,"ON DESTROY", Toast.LENGTH_SHORT).show();
    }
}