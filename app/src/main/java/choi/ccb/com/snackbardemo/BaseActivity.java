package choi.ccb.com.snackbardemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getContentView();
    protected abstract void initView();
    public View getDecorView(){
        return this.getWindow().getDecorView();
    }
    public Context mContext;
    public Activity mActivity;
    public void start(Class clazz){
        Intent intent = new Intent(mContext,clazz);
        startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        mContext = this;
        setContentView(getContentView());
        initView();
    }

}
