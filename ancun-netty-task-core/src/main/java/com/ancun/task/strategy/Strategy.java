package com.ancun.task.strategy;

/**
 * 扫描未完成任务策略接口类
 *
 * @Created on 2015-02-11
 * @author xys
 * @version 1.0
 * @Copyright:杭州安存网络科技有限公司 Copyright (c) 2015
 */
public interface Strategy {
    /**
     * 取得条件SQL
     *
     * @return
     */
    String getStrategy();
}
