package com.example.webviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{


    TextView goToWebviewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToWebviewText = (TextView)findViewById(R.id.goToWebview);
        goToWebviewText.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.goToWebview:
                startWebViewActivity();
                break;
        }
    }

    private void startWebViewActivity() {

        Intent i = new Intent(MainActivity.this, WebviewActivity.class);
        startActivity(i);
        // close this activity
        finish();

    }

}
