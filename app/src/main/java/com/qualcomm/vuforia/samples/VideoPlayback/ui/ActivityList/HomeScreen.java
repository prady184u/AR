/*===============================================================================
Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of QUALCOMM Incorporated, registered in the United States 
and other countries. Trademarks of QUALCOMM Incorporated are used with permission.
===============================================================================*/

package com.qualcomm.vuforia.samples.VideoPlayback.ui.ActivityList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.qualcomm.vuforia.samples.VideoPlayback.R;
import com.qualcomm.vuforia.samples.VideoPlayback.app.VideoPlayback.VideoPlayback;


public class HomeScreen extends Activity implements OnClickListener
{
    private static final String LOGTAG = "HomeScreen:";

    private Button mARSearchButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_screen);

        mARSearchButton = (Button) findViewById(R.id.arSearch_button);
        mARSearchButton.setOnClickListener(this);
    }
    
    
    // Starts the chosen activity
    private void startARActivity()
    {

        Intent intent = new Intent(HomeScreen.this,
                VideoPlayback.class);
//        Intent i = new Intent();
//        i.setClassName(mClassToLaunchPackage, mClassToLaunch);
        startActivity(intent);
    }
    
    
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.arSearch_button:
                startARActivity();
                break;
        }
    }

}
