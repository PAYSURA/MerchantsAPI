package com.paysura.merchants.service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.paysura.merchants.interfaces.IAlgorithmClient;
import com.paysura.merchants.interfaces.IDatabaseClient;
import com.paysura.merchants.interfaces.IMessagingClient;
import com.paysura.merchants.interfaces.IRestClient;

/*
 * The Injector Modul is for Injecting dependencies.
 * */
public class InjectorModul extends AbstractModule {

	@Override
  protected void configure() { 
  }

	public static final String API_KEY = System.getenv("API_KEY");
	public static final String REGION_NAME = System.getenv("REGION_NAME");
	public static final String URL = System.getenv("URL");

	@Provides
	IDatabaseClient provideDatabaseClient() {
		IDatabaseClient databaseClient = new DynamoDBClient(
				AmazonDynamoDBClientBuilder.standard().withRegion(System.getenv("REGION_NAME")).build());
		return databaseClient;
	}

	@Provides
	IMessagingClient provideMessagingClient() {
		IMessagingClient messagingClient = new SQSClient(
				AmazonSQSClientBuilder.standard().withRegion(REGION_NAME).build());
		return messagingClient;
	}

	@Provides
	IRestClient provideRestClient() {
		IRestClient restClient = new RestClient(URL, "API_KEY");
		return restClient;
	}

	@Provides
	IAlgorithmClient provideAlgorithmClient() {
		IAlgorithmClient algorithmClient = new AlgorithmClient();
		return algorithmClient;
	}

}
