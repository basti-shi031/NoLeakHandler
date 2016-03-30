package basti.com.noleakhandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bowen on 2016-03-30.
 */
public class LeakCanaryActivity extends AppCompatActivity {

    private  Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);

            }
        };

        Message message = Message.obtain();
        message.what = 1;
        mHandler.sendMessageDelayed(message,10*10*1000);
    }
    
}
