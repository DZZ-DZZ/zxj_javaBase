package com.zhang.p21p40;

public class ChangeChar {
    public static void main(String[] args) {
        // \t：一个制表位，实现对齐的功能
        System.out.println("北京\t天津\t上海");
        // \n：换行符
        System.out.println("jack\nsmith\nmary");
        // \\：输出一个\
        System.out.println("C:\\Windows\\System32\\cmd.exe");
        // \"：一个"
        System.out.println("老韩说：\"要好好学习java\"");
        // \'：一个'
        System.out.println("老韩说：\'要好好学习java\'");//单引号不转义也可以正常输出
        // \r：一个回车
        System.out.println("韩顺平教育\r北京");//按照视频解释应该正确输出北京平教育，但我只输出了北京
    }
}
