package com.tencent.map.geolocation.internal;

import android.content.Context;
import android.os.Bundle;
import c.t.m.g.b.a;
import c.t.m.g.cz;

public abstract class TencentHttpClientFactory
{
  private static TencentHttpClientFactory sCustFact;
  
  public static TencentHttpClientFactory getInstance()
  {
    new TencentHttpClientFactory()
    {
      public final Bundle getParams()
      {
        return null;
      }
    };
  }
  
  public static void setTencentHttpClientFactory(TencentHttpClientFactory paramTencentHttpClientFactory)
  {
    sCustFact = paramTencentHttpClientFactory;
  }
  
  public abstract Bundle getParams();
  
  public TencentHttpClient getTencentHttpClient(Context paramContext, Bundle paramBundle)
  {
    if (sCustFact != null) {
      return (TencentHttpClient)b.a.b(sCustFact.getTencentHttpClient(paramContext, sCustFact.getParams()), "http client should NOT be null");
    }
    return new cz(paramContext, paramBundle.getString("channelId"));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\map\geolocation\internal\TencentHttpClientFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */