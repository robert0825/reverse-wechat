package com.tencent.tmassistantsdk.network;

import com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse;

public abstract interface IGetSettingHttpListener
{
  public abstract void onSettingHttpRequestFinish(GetSettingsRequest paramGetSettingsRequest, GetSettingsResponse paramGetSettingsResponse, boolean paramBoolean);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\network\IGetSettingHttpListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */