package com.paysura.merchants.service;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.paysura.merchants.interfaces.IAlgorithmClient;
import com.paysura.merchants.interfaces.IDatabaseClient;
import com.paysura.merchants.interfaces.IMessagingClient;
import com.paysura.merchants.interfaces.IRestClient;

import static org.mockito.Mockito.mock;

public class EntryPointTestInjector extends AbstractModule {

	@Override
	protected void configure() {
	}

	@Provides
	IDatabaseClient provideDatabaseClient() {
		IDatabaseClient databaseClient = mock(IDatabaseClient.class);
		return databaseClient;
	}

	@Provides
	IMessagingClient provideMessagingClient() {
		IMessagingClient messagingClient = mock(IMessagingClient.class);
		return messagingClient;
	}

	@Provides
	IRestClient provideRestClient() {
		IRestClient restClient = mock(IRestClient.class);
		return restClient;
	}

	@Provides
	IAlgorithmClient provideAlgorithmClient() {
		IAlgorithmClient algorithmClient = mock(IAlgorithmClient.class);
		return algorithmClient;
	}

}
