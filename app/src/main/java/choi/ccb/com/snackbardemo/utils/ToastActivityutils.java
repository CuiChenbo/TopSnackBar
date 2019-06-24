package choi.ccb.com.snackbardemo.utils;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.SuperToast;

import choi.ccb.com.snackbardemo.R;

public class ToastActivityutils {
    private static SuperActivityToast superActivityToast;
    public static void show(Context context, String s){
        if (superActivityToast == null)
        superActivityToast = SuperActivityToast.create(context, new Style(), Style.TYPE_BUTTON);
        superActivityToast.setButtonText(">")
                .setButtonIconResource(R.drawable.ic_launcher_background)
                .setOnButtonClickListener("good_tag_name", null, new SuperActivityToast.OnButtonClickListener() {
                    @Override
                    public void onClick(View view, Parcelable token) {
                        Log.i("ccb", "onClick: 点了我");
                    }
                })
                .setProgressBarColor(Color.WHITE)
                .setText(s)
                .setDuration(Style.DURATION_VERY_LONG)
                .setGravity(Gravity.TOP)
                .setFrame(Style.FRAME_LOLLIPOP)
                .setColor(context.getResources().getColor(R.color.bantoum))
                .setAnimations(Style.ANIMATIONS_FADE)
                .show();
    }
}
