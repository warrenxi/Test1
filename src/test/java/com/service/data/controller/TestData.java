package com.service.data.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestData {

        DataDelegate dataDelegate = new DataDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dataDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}