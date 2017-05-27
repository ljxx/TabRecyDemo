package com.ylx.tabrecydemo.fragment;


import android.support.v4.app.Fragment;

import com.ylx.tabrecydemo.base.IList;
import com.ylx.tabrecydemo.base.LazyLoadFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AbsListFragment extends LazyLoadFragment implements IList {

    @Override
    public void loadData(int pageIndex) {

    }

    @Override
    public void refreshData() {

    }

    @Override
    public void loadMore() {

    }

    @Override
    public void showError(Exception e) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmpty(String msg) {

    }

    @Override
    public void showContent() {

    }

    @Override
    protected void lazyLoad() {

    }

    @Override
    public int setLayoutResourceId() {
        return 0;
    }

    @Override
    protected void setUpView() {

    }

    @Override
    protected void setUpData() {

    }
}
