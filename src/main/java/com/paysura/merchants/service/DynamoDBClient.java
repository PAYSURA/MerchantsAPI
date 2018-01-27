package com.paysura.merchants.service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.TableNameOverride;
import com.paysura.merchants.interfaces.IDatabaseClient;

public class DynamoDBClient implements IDatabaseClient {

  private AmazonDynamoDB awsClient;
  private DynamoDBMapper mapper;

  public DynamoDBClient(AmazonDynamoDB awsClient) {
    this.awsClient = awsClient;
    DynamoDBMapperConfig mapperConfig = new DynamoDBMapperConfig.Builder()
        .withTableNameOverride(TableNameOverride.withTableNameReplacement(System.getenv("TABLE_NAME"))).build();
    this.mapper = new DynamoDBMapper(this.awsClient, mapperConfig);
  }

  @Override
  public String read() {
    return null; 

  }

  @Override
  public void write(String  json) {
	  //TODO: parse json to object. Object have to be a DynamoDB mapper
   // mapper.save(data);
  }

}
