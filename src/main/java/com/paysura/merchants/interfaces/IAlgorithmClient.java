package com.paysura.merchants.interfaces;

import java.math.BigDecimal;

import com.paysura.merchants.model.RequestModel;

public interface IAlgorithmClient {
	public BigDecimal calcIPC(RequestModel request);
}
