package com.smart.melo.tweenanimation;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by melo on 2017/3/8.
 * 自定义loading
 */
public class CoustomLoadDialog extends Dialog {
    private Context context;
    private CoustomLoadDialog customProgressDialog;

    public CoustomLoadDialog(Context context) {
        super(context);
        this.context = context;
    }

    public CoustomLoadDialog(Context context, int theme) {
        super(context, theme);
    }

    public CoustomLoadDialog createDialog() {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.customprogressdialog, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.layout_customdialog);// 加载布局
        //xml中的ImageView
        ImageView loadimage = (ImageView) v.findViewById(R.id.loading_image);
        // 加载动画
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.loading_animation);
        // 使用ImageView显示动画
        loadimage.startAnimation(animation);

        customProgressDialog = new CoustomLoadDialog(context, R.style.CustomDialog);
        // 设置布局
        customProgressDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        customProgressDialog.getWindow().getAttributes().gravity = Gravity.CENTER;

        return customProgressDialog;
    }

    /**
     * setTitile 标题
     *
     * @param strTitle
     * @return
     */
    public CoustomLoadDialog setTitile(String strTitle) {
        return customProgressDialog;
    }

    /**
     * setMessage 提示内容
     *
     * @param strMessage
     * @return
     */
    public CoustomLoadDialog setMessage(String strMessage) {
        TextView tvMsg = (TextView) customProgressDialog.findViewById(R.id.id_tv_loadingmsg);

        if (tvMsg != null) {
            tvMsg.setText(strMessage);
        }

        return customProgressDialog;
    }
}
