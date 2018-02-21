package com.paysura.merchants.messages;


/**
 * ErrorResponse
 */
public class ErrorResponse {
  public String message;
  public String statusCode = "500";

  public ErrorResponse(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "{\"body\":\""+this.message+"\",\"statusCode\":\""+this.statusCode+"\"}";
  }
}
