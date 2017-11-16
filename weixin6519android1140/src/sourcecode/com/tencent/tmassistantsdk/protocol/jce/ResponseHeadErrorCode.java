package com.tencent.tmassistantsdk.protocol.jce;

import java.io.Serializable;

public final class ResponseHeadErrorCode
  implements Serializable
{
  public static final ResponseHeadErrorCode EC_BUSINESS_ERROR;
  public static final ResponseHeadErrorCode EC_SERVER_INTERNAL_ERROR;
  public static final int _EC_BUSINESS_ERROR = -11;
  public static final int _EC_SERVER_INTERNAL_ERROR = -10;
  private static ResponseHeadErrorCode[] __values;
  private String __T = new String();
  private int __value;
  
  static
  {
    if (!ResponseHeadErrorCode.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      __values = new ResponseHeadErrorCode[2];
      EC_SERVER_INTERNAL_ERROR = new ResponseHeadErrorCode(0, -10, "EC_SERVER_INTERNAL_ERROR");
      EC_BUSINESS_ERROR = new ResponseHeadErrorCode(1, -11, "EC_BUSINESS_ERROR");
      return;
    }
  }
  
  private ResponseHeadErrorCode(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    __values[paramInt1] = this;
  }
  
  public static ResponseHeadErrorCode convert(int paramInt)
  {
    int i = 0;
    while (i < __values.length)
    {
      if (__values[i].value() == paramInt) {
        return __values[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public static ResponseHeadErrorCode convert(String paramString)
  {
    int i = 0;
    while (i < __values.length)
    {
      if (__values[i].toString().equals(paramString)) {
        return __values[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public final String toString()
  {
    return this.__T;
  }
  
  public final int value()
  {
    return this.__value;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\tmassistantsdk\protocol\jce\ResponseHeadErrorCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */