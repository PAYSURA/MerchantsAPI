package com.paysura.merchants.service;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.paysura.merchants.model.MerchantsRequestModel;

public class EntryPointTest {

	private EntryPoint handler;
	
	
	private Context createContext() {
		TestContext ctx = new TestContext();
		return ctx;
	}



	@Test
	public void pumpServiceReturnsMasterDataTest() throws JsonProcessingException, IOException {
		Context ctx = createContext();
		Injector injector = Guice.createInjector(new EntryPointTestInjector());
		handler = new EntryPoint(injector);
		double result = handler.handleRequest(new MerchantsRequestModel(), ctx);
		assertEquals(5.0, result,0.1);
	}

}
