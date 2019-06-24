package choi.ccb.com.snackbardemo.utils;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import choi.ccb.com.snackbardemo.R;

public class ToastUtils {
    private static Toast toast;

    public static void show(Context c, int shijian) {
        if (toast == null) {
            toast = new Toast(c);
        }
        toast.setView(View.inflate(c, R.layout.toast_layout, null));
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();


    }

    public static void show(Context c,CharSequence s) {
        if (toast == null) {
            toast = Toast.makeText(c,s,Toast.LENGTH_SHORT);
        }
        toast.setText(s);
        toast.show();


    }
}
