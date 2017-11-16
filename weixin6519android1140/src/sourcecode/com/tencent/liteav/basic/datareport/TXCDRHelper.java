package com.tencent.liteav.basic.datareport;

import android.content.Context;

public class TXCDRHelper
{
  private int mCommandId;
  private String mToken;
  
  public TXCDRHelper(Context paramContext, int paramInt1, int paramInt2, TXCDRExtInfo paramTXCDRExtInfo)
  {
    this.mToken = TXCDRApi.txCreateToken();
    this.mCommandId = paramInt1;
    TXCDRApi.InitEvent(paramContext, this.mToken, paramInt1, paramInt2, paramTXCDRExtInfo);
  }
  
  public TXCDRHelper(Context paramContext, String paramString, int paramInt1, int paramInt2, TXCDRExtInfo paramTXCDRExtInfo)
  {
    this.mToken = paramString;
    this.mCommandId = paramInt1;
    TXCDRApi.InitEvent(paramContext, this.mToken, paramInt1, paramInt2, paramTXCDRExtInfo);
  }
  
  public void reportEvent()
  {
    TXCDRApi.nativeReportEvent(this.mToken, this.mCommandId);
  }
  
  public void setCommonValue(String paramString1, String paramString2)
  {
    TXCDRApi.nativeSetCommonValue(paramString1, paramString2);
  }
  
  public void setEventValue(String paramString, long paramLong)
  {
    TXCDRApi.txSetEventIntValue(this.mToken, this.mCommandId, paramString, paramLong);
  }
  
  public void setEventValue(String paramString1, String paramString2)
  {
    TXCDRApi.txSetEventValue(this.mToken, this.mCommandId, paramString1, paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\basic\datareport\TXCDRHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */