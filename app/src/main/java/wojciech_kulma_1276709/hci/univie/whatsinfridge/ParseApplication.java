package wojciech_kulma_1276709.hci.univie.whatsinfridge;

/**
 * Created by wojtek on 11.05.2015.
 */
import com.parse.Parse;
import com.parse.ParseACL;

import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "VIF0TVGutYDxZwFZaBTOVOCxIo16AAXSN67LQKXa", "at1r9jysfjUuIm6OV36aj6oHHEbfOltMy8su5jlx");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}