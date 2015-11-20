package com.kidane.yosief.PushNotificationDemo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

/**
 * Created by kidaneyosief on 11/19/2015.
 */
public class ParseApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(getApplicationContext(), "ZU3Q2hAozxovoFXPS3fsWmD2PiCygAVNXfNshLm6", "8AecjFfNght6QymCOaoVqZkBFSzRz6i4hW7ewIKI");
       // PushService.setDefaultPushCallback(this,MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
