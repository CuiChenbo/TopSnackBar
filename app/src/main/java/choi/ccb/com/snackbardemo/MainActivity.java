package choi.ccb.com.snackbardemo;

import android.graphics.Color;
import android.os.Parcelable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import choi.ccb.com.topsnackbarlibrary.TopSnackbar;


public class MainActivity extends AppCompatActivity {

    private RelativeLayout rlRoot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.btn);
        rlRoot = findViewById(R.id.rl);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopSnackbar.make(rlRoot,"我是在顶部弹出的",6000).show();
            }
        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopSnackbar.make(MainActivity.this.getWindow().getDecorView(),"你看看\n我是在最顶部弹出的",6000).show();
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iii();
            }
        });
    }


    private void iii(){
        Snackbar.make(rlRoot,"普通Snackbar",6000).show();
    }
}
