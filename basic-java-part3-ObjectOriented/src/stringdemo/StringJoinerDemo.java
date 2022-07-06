package stringdemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("-----");
        sj.add("aaa").add("bbb").add("ccc");

    }
}
