package com.paysura.merchants.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.paysura.merchants.interfaces.IAlgorithmClient;
import com.paysura.merchants.interfaces.IDatabaseClient;
import com.paysura.merchants.interfaces.IMessagingClient;
import com.paysura.merchants.interfaces.IRestClient;
import com.paysura.merchants.model.MerchantsRequestModel;

public class EntryPoint implements RequestHandler<MerchantsRequestModel, Double> {

	/*
	 * Interfaces
	 */
	IDatabaseClient dbClient;
	IMessagingClient queueClient;
	IAlgorithmClient algorithmClient;
	IRestClient restServiceClient;
	ObjectMapper mapper = new ObjectMapper();

	/*
	 * Dependency Injection. All dependencies are injected through the
	 * InjectorModul. For DependencyInjection Google Guice Framwork is used.
	 */
	public EntryPoint() {
		this(Guice.createInjector(new InjectorModul()));
	}

	/*
	 * Testing Purpose ONLY This Constructor is only for testing. Together with
	 * Mockito we can Inject a new Injector with mocked Instances of Interfaces.
	 */
	EntryPoint(Injector injector) {
		this.dbClient = injector.getInstance(IDatabaseClient.class);
		this.queueClient = injector.getInstance(IMessagingClient.class);
		this.algorithmClient = injector.getInstance(IAlgorithmClient.class);
		this.restServiceClient = injector.getInstance(IRestClient.class);
	}

	/*
	 * This method is triggered in serverless lambda function in AWS. here should be
	 * our logic.This function will be triggered by API-Gateway.
	 */
	@Override
	public Double handleRequest(MerchantsRequestModel request, Context context) {

		double result = algorithmClient.calcIPC(request);

		return result;

	}
}