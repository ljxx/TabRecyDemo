package com.ylx.tabrecydemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/5/27  下午4:37
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public abstract class LazyLoadFragment extends BaseFragment {

    protected boolean isViewCreated = false; //view是否被创建
    protected boolean isFirstLoad = true; //是否是第一次加载
    protected boolean isNeedInitView = false; //是否需要初始化view

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isViewCreated = true;
        if(isNeedInitView) {
            lazyLoad();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser && isFirstLoad) {
            if(isViewCreated) { //onViewCreated是否已经执行
                isFirstLoad = false;
                lazyLoad();
            } else {
                isNeedInitView = true;
            }
        }
    }

    protected abstract void lazyLoad();
}
