package com.paysura.merchants.interfaces;

import com.paysura.merchants.model.MerchantsRequestModel;

public interface IAlgorithmClient {
	public double calcIPC(MerchantsRequestModel request);
}
