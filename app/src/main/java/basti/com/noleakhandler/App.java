package basti.com.noleakhandler;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Bowen on 2016-03-30.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
