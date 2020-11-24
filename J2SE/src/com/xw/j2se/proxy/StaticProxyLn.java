package com.xw.j2se.proxy;

public class StaticProxyLn {

    private class BeProxyImpl implements BeProxy {
        @Override
        public void service() {
            System.out.println("service...");
        }
    }

    public void proxyService() {
        System.out.println("proxy service...");
        service.service();
        System.out.println("proxy end...");
    }

    BeProxy service = new BeProxyImpl();

    public static void main(String[] args) {
        StaticProxyLn proxy = new StaticProxyLn();
        proxy.proxyService();
    }

}
