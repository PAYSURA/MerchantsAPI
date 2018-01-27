package com.paysura.merchants.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.paysura.merchants.interfaces.IAlgorithmClient;
import com.paysura.merchants.interfaces.IDatabaseClient;
import com.paysura.merchants.interfaces.IMessagingClient;
import com.paysura.merchants.interfaces.IRestClient;

public class EntryPoint implements RequestHandler<Object, String> {

	IDatabaseClient dbClient;
	IMessagingClient queueClient;
	IAlgorithmClient algorithmClient;
	IRestClient restServiceClient;

	// Dependency Injection
	public EntryPoint() {
		this(Guice.createInjector(new InjectorModul()));
	}

	// Testing Purpose ONLY
	EntryPoint(Injector injector) {
		this.dbClient = injector.getInstance(IDatabaseClient.class);
		this.queueClient = injector.getInstance(IMessagingClient.class);
		this.algorithmClient = injector.getInstance(IAlgorithmClient.class);
		this.restServiceClient = injector.getInstance(IRestClient.class);
	}

	// this is the Entrypoint
	@Override
	public String handleRequest(Object input, Context context) {

		// TODO: Input and Output Objects defining
		return null;

	}
}