package com.paysura.merchants.service;



import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paysura.merchants.interfaces.IMessagingClient;

public class SQSClient implements IMessagingClient {

  private AmazonSQS sqsClient;
  private ObjectMapper mapper = new ObjectMapper();

  public SQSClient(AmazonSQS amazonSQS) {
    this.sqsClient = amazonSQS;
  }


@Override
public String sendMessage(String json) {
	    String resultCode = null;
	    SendMessageRequest sendMessagerequest = new SendMessageRequest().withQueueUrl(System.getenv("QUEUE_NAME"));
	    sendMessagerequest.setMessageBody(json); // MAX 256 KB
	    sqsClient.sendMessage(sendMessagerequest);
	    //TODO: parse result and return
	return resultCode;
}

@Override
public String receiveMessage() {
	// TODO Auto-generated method stub
	return null;
}

}
