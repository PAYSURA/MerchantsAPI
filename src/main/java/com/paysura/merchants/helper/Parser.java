package com.paysura.merchants.helper;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.paysura.merchants.model.MerchantsRequestModel;

public class Parser {

	public static String convertToString(MerchantsRequestModel merchantsRequest) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		String merchantRequestAsString = null;
		merchantRequestAsString = mapper.writeValueAsString(merchantsRequest);
		return merchantRequestAsString;
	}

	public static MerchantsRequestModel unconvertToRequestModel(String merchants) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		MerchantsRequestModel merchantsRm = mapper.readValue(merchants, MerchantsRequestModel.class);
		return merchantsRm;
	}

}
