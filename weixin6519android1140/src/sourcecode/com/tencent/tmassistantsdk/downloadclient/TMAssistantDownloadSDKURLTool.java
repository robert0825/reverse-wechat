package com.tencent.tmassistantsdk.downloadclient;

import com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine;
import com.tencent.tmassistantsdk.protocol.jce.AppDetailParam;
import com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadSDKURLTool
  implements ITMAssistantExchangeURLListenner
{
  protected static final String TAG = "TMAssistantDownloadSDKExchangeURL";
  protected static TMAssistantDownloadSDKURLTool mInstance = null;
  protected GetAppSimpleDetailEngine engine = null;
  protected ITMAssistantExchangeURLListenner mListener = null;
  
  private TMAssistantDownloadSDKURLTool(ITMAssistantExchangeURLListenner paramITMAssistantExchangeURLListenner)
  {
    if (paramITMAssistantExchangeURLListenner != null)
    {
      this.mListener = paramITMAssistantExchangeURLListenner;
      this.engine = new GetAppSimpleDetailEngine(this.mListener);
      return;
    }
    TMLog.e("TMAssistantDownloadSDKExchangeURL", "ITMAssistantExchangeURLListenner listener shouldn't be null!");
  }
  
  public static TMAssistantDownloadSDKURLTool getInstance(ITMAssistantExchangeURLListenner paramITMAssistantExchangeURLListenner)
  {
    try
    {
      if (mInstance == null) {
        mInstance = new TMAssistantDownloadSDKURLTool(paramITMAssistantExchangeURLListenner);
      }
      paramITMAssistantExchangeURLListenner = mInstance;
      return paramITMAssistantExchangeURLListenner;
    }
    finally {}
  }
  
  public void exchangeUrlsFromPackageNames(ArrayList<String> paramArrayList)
  {
    if (paramArrayList != null)
    {
      ArrayList localArrayList = new ArrayList();
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String[] arrayOfString = ((String)paramArrayList.next()).split(";");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          AppDetailParam localAppDetailParam = new AppDetailParam();
          localAppDetailParam.packageName = arrayOfString[0];
          if (arrayOfString.length > 1) {
            localAppDetailParam.channelId = arrayOfString[1];
          }
          localArrayList.add(localAppDetailParam);
        }
      }
      if ((localArrayList.size() > 0) && (this.engine != null)) {
        this.engine.sendReuqest(localArrayList);
      }
      return;
    }
    TMLog.w("TMAssistantDownloadSDKExchangeURL", "packageNames is null!");
  }
  
  public void onExchangedURLSucceed(ArrayList<AppSimpleDetail> paramArrayList, boolean paramBoolean)
  {
    if (this.mListener != null) {
      this.mListener.onExchangedURLSucceed(paramArrayList, paramBoolean);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\downloadclient\TMAssistantDownloadSDKURLTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */