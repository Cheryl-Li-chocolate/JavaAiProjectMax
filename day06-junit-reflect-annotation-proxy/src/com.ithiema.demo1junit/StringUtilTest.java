package com.ithiema.demo1junit;

import org.junit.Assert;
import org.junit.Test;
public class StringUtilTest {
    @Test
    public void printNumber() {
        StringUtil.printNumber("张三");
        StringUtil.printNumber("");
        StringUtil.printNumber(null);

    }

    @Test
    public void testGetMaxIndex() {
        int index = StringUtil.getMaxIndex("张三");
        int index2 = StringUtil.getMaxIndex("");
        int index3 = StringUtil.getMaxIndex(null);
        Assert.assertEquals("本轮测试失败，业务获取的最大索引有问题",1, index);
        Assert.assertEquals("本轮测试失败，业务获取的最大索引有问题",-1, index2);
        Assert.assertEquals("本轮测试失败，业务获取的最大索引有问题",-1, index3);

    }
}
