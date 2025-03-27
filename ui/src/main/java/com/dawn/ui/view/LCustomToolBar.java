package com.dawn.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.core.content.ContextCompat;

import com.dawn.ui.R;


/**
 * Created by 90449 on 2018/1/9.
 */
@SuppressWarnings("unused")
public class LCustomToolBar extends Toolbar {
    public LCustomToolBar(Context context) {
        super(context);
    }

    public LCustomToolBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LCustomToolBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private TextView tvTitleLeft;
    private TextView tvTitle;
    private TextView tvTitleRight;

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tvTitleLeft = findViewById(R.id.tv_title_left);
        tvTitle = findViewById(R.id.tv_title);
        tvTitleRight = findViewById(R.id.tv_title_right);
    }

    /**
     * 获取标题控件
     */
    public TextView getMainTitle(){
        return tvTitle;
    }

    /**
     * 获取左侧控件
     */
    public TextView getMainTitleLeft(){
        return tvTitleLeft;
    }

    /**
     * 获取右侧控件
     */
    public TextView getMainTitleRight(){
        return tvTitleRight;
    }

    //设置主title的内容
    public void setMainTitle(String text) {
        if(tvTitle != null){
            this.setTitle(" ");
            tvTitle.setVisibility(View.VISIBLE);
            tvTitle.setText(text);
        }
    }

    //设置主title的内容文字的颜色
    public void setMainTitleColor(int color) {
        if(tvTitle != null)
            tvTitle.setTextColor(color);
    }

    //设置title左边文字
    public void setMainTitleLeftText(String text) {
        if(tvTitleLeft != null){
            tvTitleLeft.setVisibility(View.VISIBLE);
            tvTitleLeft.setText(text);
        }
    }

    //设置title左边文字颜色
    public void setMainTitleLeftColor(int color) {
        if(tvTitleLeft != null)
            tvTitleLeft.setTextColor(color);
    }

    //设置title左边图标
    public void setMainTitleLeftDrawable(int res) {
        if(tvTitleLeft != null){
            if(res == -1){
                tvTitleLeft.setCompoundDrawables(null, null, null, null);
                return;
            }
            Drawable dwLeft = ContextCompat.getDrawable(getContext(), res);
            dwLeft.setBounds(0, 0, 60, 60);
            tvTitleLeft.setCompoundDrawables(dwLeft, null, null, null);
        }
    }

    //设置title右边文字
    public void setMainTitleRightText(String text) {
        if(tvTitleRight != null){
            tvTitleRight.setVisibility(View.VISIBLE);
            tvTitleRight.setText(text);
        }
    }

    //设置title右边文字颜色
    public void setMainTitleRightColor(int color) {
        if(tvTitleRight != null)
            tvTitleRight.setTextColor(color);
    }

    //设置title右边图标
    public void setMainTitleRightDrawable(int res) {
        if(tvTitleRight != null){
            if(res == -1){
                tvTitleRight.setCompoundDrawables(null, null, null, null);
                return;
            }
            Drawable dwRight = ContextCompat.getDrawable(getContext(), res);
            dwRight.setBounds(0, 0, dwRight.getMinimumWidth(), dwRight.getMinimumHeight());
            tvTitleRight.setCompoundDrawables(null, null, dwRight, null);
        }
    }

    //设置toolbar状态栏颜色
    public void setToolbarBackground(int res) {
        this.setBackgroundResource(res);
    }

    //设置toolbar左边图标
    public void setToolbarLeftBackImageRes(int res) {
        this.setNavigationIcon(res);
    }

    //设置toolbar左边文字
    public void setToolbarLeftText(String text) {
        this.setNavigationContentDescription(text);
    }

    //设置toolbar的标题
    public void setToolbarTitle(String text) {
        this.setTitle(text);
    }

    //设置toolbar标题的颜色
    public void setToolbarTitleColor(int color) {
        this.setTitleTextColor(color);
    }

    //设置toolbar子标题
    public void setToolbarSubTitleText(String text) {
        this.setSubtitle(text);
    }

    //设置toolbar子标题颜色
    public void setToolbarSubTitleTextColor(int color) {
        this.setSubtitleTextColor(color);
    }

}

