package basti.com.noleakhandler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button leakButton,noLeakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setListener();
    }

    private void setListener() {

        leakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LeakCanaryActivity.class);
                startActivity(intent);
            }
        });

        noLeakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NoLeakActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {

        leakButton = (Button) findViewById(R.id.leak_activity);
        noLeakButton = (Button) findViewById(R.id.no_leak_activity);

    }
}
