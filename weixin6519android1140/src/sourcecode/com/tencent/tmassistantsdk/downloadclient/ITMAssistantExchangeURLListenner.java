package com.tencent.tmassistantsdk.downloadclient;

import com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail;
import java.util.ArrayList;

public abstract interface ITMAssistantExchangeURLListenner
{
  public abstract void onExchangedURLSucceed(ArrayList<AppSimpleDetail> paramArrayList, boolean paramBoolean);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\downloadclient\ITMAssistantExchangeURLListenner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */