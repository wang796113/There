package com.qf.Proxy;

import com.qf.service.FangDongService;
import com.qf.service.impl.FangDongServiceImpl;

public class FangDongProxy implements FangDongService {
    private FangDongService fangDongService = new FangDongServiceImpl();
    public void zuFang() {
        System.out.println("1");
        fangDongService.zuFang();
        System.out.println("2");
    }
}
