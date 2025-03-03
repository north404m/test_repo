package com.jdc.wh.test;

import org.junit.jupiter.api.Test;

import com.jdc.wh.handler.Handler;

public class HandlerTest {
	
	@Test
	void testName() {
		Handler handle = new Handler();
		handle.useName();
	}
}
