package com.tencent.mm.opensdk.openapi;

import android.content.Intent;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.ILog;

public abstract interface IWXAPI
{
  public abstract void detach();
  
  public abstract int getWXAppSupportAPI();
  
  public abstract boolean handleIntent(Intent paramIntent, IWXAPIEventHandler paramIWXAPIEventHandler);
  
  public abstract boolean isWXAppInstalled();
  
  public abstract boolean isWXAppSupportAPI();
  
  public abstract boolean openWXApp();
  
  public abstract boolean registerApp(String paramString);
  
  public abstract boolean registerApp(String paramString, long paramLong);
  
  public abstract boolean sendReq(BaseReq paramBaseReq);
  
  public abstract boolean sendResp(BaseResp paramBaseResp);
  
  public abstract void setLogImpl(ILog paramILog);
  
  public abstract void unregisterApp();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\openapi\IWXAPI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */