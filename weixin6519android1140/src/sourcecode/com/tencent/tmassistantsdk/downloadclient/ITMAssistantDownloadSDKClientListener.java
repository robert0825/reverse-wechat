package com.tencent.tmassistantsdk.downloadclient;

public abstract interface ITMAssistantDownloadSDKClientListener
{
  public abstract void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString, long paramLong1, long paramLong2);
  
  public abstract void OnDownloadSDKTaskStateChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\downloadclient\ITMAssistantDownloadSDKClientListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */