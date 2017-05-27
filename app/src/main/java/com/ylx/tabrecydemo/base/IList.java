package com.ylx.tabrecydemo.base;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/5/27  下午4:47
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public interface IList {

    /**
     * 加载数据
     * @param pageIndex 页数
     */
    void loadData(int pageIndex);

    /**
     * 刷新数据
     */
    void refreshData();

    /**
     * 加载更多数据
     */
    void loadMore();

    /**
     * 显示异常信息
     * @param e 错误信息
     */
    void showError(Exception e);

    /**
     * 显示加载框
     */
    void showLoading();

    /**
     * 无数据时的处理
     * @param msg 提示信息
     */
    void showEmpty(String msg);

    /**
     * 显示内容
     */
    void showContent();

}
