package com.gson.test.app.util;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilGsonTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @Test
    public void testBasicDataType() {

        Gson gson = new Gson();
        System.out.println(gson.fromJson("100", int.class));

        float aFloat = gson.fromJson("99.99", float.class);
        float aFloat2 = gson.fromJson("\"99.99\"", float.class);
        System.out.println(aFloat + "   " + aFloat2);
        System.out.println(gson.fromJson("\"99.99\"", double.class));

        System.out.println(gson.fromJson("true", boolean.class));
        System.out.println(gson.fromJson("asdf", String.class));

    }
}