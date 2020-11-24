package com.xw.j2se.work.module_3;

public enum Operation {
    ADD(1,"添加"),DELETE(2,"删除"),MODIFY(3,"修改"),
    FIND(4,"查找"),ALL(5,"遍历所有"),
    QUIT(6,"退出"),NULL(0,"null");

    int code;
    String desc;

    Operation(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "CODE=" + code +
                ", DESC='" + desc + '\'' +
                '}';
    }

    public static Operation operationOf(int val) {
        for(Operation op : Operation.values()) {
            if(val == op.code)
                return op;
        }
        return NULL;
    }
}
