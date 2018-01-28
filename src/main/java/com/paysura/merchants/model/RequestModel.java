package com.paysura.merchants.model;

import java.math.BigDecimal;
import java.util.Calendar;

public class RequestModel {

	double price;
	double ipcRateInCent;
	BigDecimal remainingIPC;
	double minProfitInPercent;
	float LogBase;
	double increase;
	int loyaltyTimeLimit;
	double loyaltyBonusInPercent;
	Calendar lastPurchaseDate;
	double currentBonusCampaign;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getIpcRateInCent() {
		return ipcRateInCent;
	}

	public void setIpcRateInCent(double ipcRateInCent) {
		this.ipcRateInCent = ipcRateInCent;
	}

	public BigDecimal getRemainingIPC() {
		return remainingIPC;
	}

	public void setRemainingIPC(BigDecimal remainingIPC) {
		this.remainingIPC = remainingIPC;
	}

	public double getMinProfitInPercent() {
		return minProfitInPercent;
	}

	public void setMinProfitInPercent(double minProfitInPercent) {
		this.minProfitInPercent = minProfitInPercent;
	}

	public float getLogBase() {
		return LogBase;
	}

	public void setLogBase(float logBase) {
		LogBase = logBase;
	}

	public double getIncrease() {
		return increase;
	}

	public void setIncrease(double increase) {
		this.increase = increase;
	}

	public int getLoyaltyTimeLimit() {
		return loyaltyTimeLimit;
	}

	public void setLoyaltyTimeLimit(int loyaltyTimeLimit) {
		this.loyaltyTimeLimit = loyaltyTimeLimit;
	}

	public double getLoyaltyBonusInPercent() {
		return loyaltyBonusInPercent;
	}

	public void setLoyaltyBonusInPercent(double loyaltyBonusInPercent) {
		this.loyaltyBonusInPercent = loyaltyBonusInPercent;
	}

	public Calendar getLastPurchaseDate() {
		return lastPurchaseDate;
	}

	public void setLastPurchaseDate(Calendar lastPurchaseDate) {
		this.lastPurchaseDate = lastPurchaseDate;
	}

	public double getCurrentBonusCampaign() {
		return currentBonusCampaign;
	}

	public void setCurrentBonusCampaign(double currentBonusCampaign) {
		this.currentBonusCampaign = currentBonusCampaign;
	}

}
