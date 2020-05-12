package com.natsumehill.learn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 对SimpleApp的简要单元测试测试
 */
public class SimpleAppTest {

    /**
     * 测试SimpleApp的greeting()方法
     */
    @Test
    public void greeting() {
        Assert.assertEquals("Hello junit", new SimpleApp().greeting());
    }
}