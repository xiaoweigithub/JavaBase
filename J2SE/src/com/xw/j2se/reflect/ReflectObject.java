package com.xw.j2se.reflect;

public class ReflectObject {



    private String os;
    private int oi;
    public String ps;
    public int pi;
    protected String proS;
    protected int proI;

    public ReflectObject(String os, int oi, String ps, int pi) {
        this.os = os;
        this.oi = oi;
        this.ps = ps;
        this.pi = pi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getOi() {
        return oi;
    }

    public void setOi(int oi) {
        this.oi = oi;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public String getProS() {
        return proS;
    }

    public void setProS(String proS) {
        this.proS = proS;
    }

    public int getProI() {
        return proI;
    }

    public void setProI(int proI) {
        this.proI = proI;
    }

    @Override
    public String toString() {
        return "ReflectObject{" +
                "os='" + os + '\'' +
                ", oi=" + oi +
                ", ps='" + ps + '\'' +
                ", pi=" + pi +
                ", proS='" + proS + '\'' +
                ", proI=" + proI +
                '}';
    }
}
