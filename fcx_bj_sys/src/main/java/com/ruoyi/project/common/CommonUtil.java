package com.ruoyi.project.common;

import org.springframework.transaction.interceptor.TransactionAspectSupport;

public class CommonUtil {

    public static void rollbackTransaction(){
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    }
}
