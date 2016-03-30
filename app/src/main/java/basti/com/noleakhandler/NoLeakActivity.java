package basti.com.noleakhandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

/**
 * Created by Bowen on 2016-03-30.
 */
public class NoLeakActivity extends AppCompatActivity {

    private NoLeakHandler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mHandler = new NoLeakHandler(this);

        Message message = Message.obtain();

        mHandler.sendMessageDelayed(message,10*10*1000);
    }

    private static class NoLeakHandler extends Handler{
        private WeakReference<NoLeakActivity> mActivity;

        public NoLeakHandler(NoLeakActivity activity){
            mActivity = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    }
}
