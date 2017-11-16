package com.tencent.mm.opensdk.diffdev;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.diffdev.a.a;
import com.tencent.mm.opensdk.utils.Log;

public class DiffDevOAuthFactory
{
  public static final int MAX_SUPPORTED_VERSION = 1;
  private static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
  public static final int VERSION_1 = 1;
  private static IDiffDevOAuth v1Instance;
  
  static
  {
    GMTrace.i(2281701376L, 17);
    v1Instance = null;
    GMTrace.o(2281701376L, 17);
  }
  
  private DiffDevOAuthFactory()
  {
    GMTrace.i(1879048192L, 14);
    GMTrace.o(1879048192L, 14);
  }
  
  public static IDiffDevOAuth getDiffDevOAuth()
  {
    GMTrace.i(2013265920L, 15);
    IDiffDevOAuth localIDiffDevOAuth = getDiffDevOAuth(1);
    GMTrace.o(2013265920L, 15);
    return localIDiffDevOAuth;
  }
  
  public static IDiffDevOAuth getDiffDevOAuth(int paramInt)
  {
    GMTrace.i(2147483648L, 16);
    Log.v("MicroMsg.SDK.DiffDevOAuthFactory", "getDiffDevOAuth, version = " + paramInt);
    if (paramInt > 1)
    {
      Log.e("MicroMsg.SDK.DiffDevOAuthFactory", "getDiffDevOAuth fail, unsupported version = " + paramInt);
      GMTrace.o(2147483648L, 16);
      return null;
    }
    switch (paramInt)
    {
    default: 
      GMTrace.o(2147483648L, 16);
      return null;
    }
    if (v1Instance == null) {
      v1Instance = new a();
    }
    IDiffDevOAuth localIDiffDevOAuth = v1Instance;
    GMTrace.o(2147483648L, 16);
    return localIDiffDevOAuth;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\DiffDevOAuthFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */