package com.ylx.tabrecydemo.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.support.RxFragment;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/5/27  下午4:20
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public abstract class BaseFragment extends RxFragment {

    private View mContentView;
    private Context mContext;
    private ProgressDialog mProgressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContentView = inflater.inflate(setLayoutResourceId(), container, false);
        mContext = getContext();
        mProgressDialog = new ProgressDialog(mContext);
        mProgressDialog.setCanceledOnTouchOutside(false);
        init();
        setUpView();
        setUpData();

        return mContentView;
    }

    /**
     * 传递不同布局文件，父类不知道子类的布局文件是什么，所以让子类去实现
     * @return
     */
    public abstract int setLayoutResourceId();

    protected void init() {}

    protected abstract void setUpView();

    protected abstract void setUpData();

    /**
     * 初始化控件
     * @param d
     * @param <T>
     * @return
     */
    protected <T extends View> T $(int d) {
        return (T) mContentView.findViewById(d);
    }

    protected View getContentView() {
        return mContentView;
    }

    public Context getContext() {
        return mContext;
    }

    public void refresh() {

    }

    protected ProgressDialog getProgressDialog() {
        return mProgressDialog;
    }


}
