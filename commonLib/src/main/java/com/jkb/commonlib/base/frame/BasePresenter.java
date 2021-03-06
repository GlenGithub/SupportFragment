package com.jkb.commonlib.base.frame;

/**
 * Presenter层基类
 * Created by yj on 2017/5/5.
 */

public interface BasePresenter {

    /**
     * 开始P层业务
     */
    void start();

    /**
     * 绑定数据到视图中
     */
    void bindDataToView();

    /**
     * 銷毀P层
     */
    void destroy();
}
