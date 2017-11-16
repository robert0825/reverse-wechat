package com.tencent.tmassistantsdk.downloadservice.taskmanager;

public abstract interface IServiceDownloadTaskManagerListener
{
  public abstract void OnDownloadProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2);
  
  public abstract void OnDownloadStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\downloadservice\taskmanager\IServiceDownloadTaskManagerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */