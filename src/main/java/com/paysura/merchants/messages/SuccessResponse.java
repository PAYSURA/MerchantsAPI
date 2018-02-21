package com.paysura.merchants.messages;

/**
 * SuccessResponse
 */
public class SuccessResponse {
  public String message;
  public String statusCode = "200";

  public SuccessResponse(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "{\"body\":\""+this.message+"\",\"statusCode\":\""+this.statusCode+"\"}";
  }
}
