package com.CodeBind;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class UserRegistrationTest1 {

	private static UserRegistrationTest userRegistration;
	    @Before
	    public void createObj(){
	    	UserRegistrationTest userRegistration = new UserRegistrationTest();
	    }

	    @Test
	    public void firstName() {
	        boolean actual = userRegistration.firstName("Monika");
	        Assert.assertTrue(actual);
	    }

	    @Test
	    public void lastName() {
	        boolean actual = userRegistration.lastName("Mhaske");
	        Assert.assertTrue(actual);
	    }

	    @Test
	    public void email() {
	        boolean actual = userRegistration1.Email("abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
	                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com");
	        Assert.assertTrue(actual);
	    }

	    @Test
	    public void MobileNo() {
	        boolean actual = userRegistration.MobileNo("+91883050311");
	        Assert.assertTrue(actual);
	    }

	    @Test
	    public void Password() {
	        boolean actual = userRegistration.Password("1M@onika");
	        Assert.assertTrue(actual);
	    }
	}


