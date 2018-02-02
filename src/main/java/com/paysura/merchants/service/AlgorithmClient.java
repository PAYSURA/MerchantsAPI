package com.paysura.merchants.service;

import com.paysura.merchants.interfaces.IAlgorithmClient;
import com.paysura.merchants.model.MerchantsRequestModel;

public class AlgorithmClient implements IAlgorithmClient {

	public double calcIPC(MerchantsRequestModel request) {
		double iPC;
		// dummy algorithm
	iPC= request.getPrice();
		request.getIpcRateInCent();
		request.getMinProfitInPercent();
		request.getIncrease();
		request.getLoyaltyTimeLimit();
		request.getLoyaltyBonusInPercent();
		request.getCurrentBonusCampaign();
		request.getLogBase();
		return iPC;

	}
}
