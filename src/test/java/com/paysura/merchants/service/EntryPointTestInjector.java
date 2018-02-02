package com.paysura.merchants.service;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.paysura.merchants.interfaces.IAlgorithmClient;
import com.paysura.merchants.interfaces.IDatabaseClient;
import com.paysura.merchants.interfaces.IMessagingClient;
import com.paysura.merchants.interfaces.IRestClient;
import com.paysura.merchants.model.MerchantsRequestModel;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.mockito.Mockito;

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
		when(algorithmClient.calcIPC(Mockito.any( MerchantsRequestModel.class))).thenReturn(5.0);
		return algorithmClient;
	}

}
