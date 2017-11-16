package com.tencent.mm.opensdk.diffdev;

import com.tencent.gmtrace.GMTrace;

public enum OAuthErrCode
{
  private int code;
  
  static
  {
    GMTrace.i(8992587776L, 67);
    WechatAuth_Err_OK = new OAuthErrCode("WechatAuth_Err_OK", 0, 0);
    WechatAuth_Err_NormalErr = new OAuthErrCode("WechatAuth_Err_NormalErr", 1, -1);
    WechatAuth_Err_NetworkErr = new OAuthErrCode("WechatAuth_Err_NetworkErr", 2, -2);
    WechatAuth_Err_JsonDecodeErr = new OAuthErrCode("WechatAuth_Err_JsonDecodeErr", 3, -3);
    WechatAuth_Err_Cancel = new OAuthErrCode("WechatAuth_Err_Cancel", 4, -4);
    WechatAuth_Err_Timeout = new OAuthErrCode("WechatAuth_Err_Timeout", 5, -5);
    WechatAuth_Err_Auth_Stopped = new OAuthErrCode("WechatAuth_Err_Auth_Stopped", 6, -6);
    $VALUES = new OAuthErrCode[] { WechatAuth_Err_OK, WechatAuth_Err_NormalErr, WechatAuth_Err_NetworkErr, WechatAuth_Err_JsonDecodeErr, WechatAuth_Err_Cancel, WechatAuth_Err_Timeout, WechatAuth_Err_Auth_Stopped };
    GMTrace.o(8992587776L, 67);
  }
  
  private OAuthErrCode(int paramInt)
  {
    GMTrace.i(8589934592L, 64);
    this.code = paramInt;
    GMTrace.o(8589934592L, 64);
  }
  
  public final int getCode()
  {
    GMTrace.i(8724152320L, 65);
    int i = this.code;
    GMTrace.o(8724152320L, 65);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(8858370048L, 66);
    String str = "OAuthErrCode:" + this.code;
    GMTrace.o(8858370048L, 66);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\OAuthErrCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */