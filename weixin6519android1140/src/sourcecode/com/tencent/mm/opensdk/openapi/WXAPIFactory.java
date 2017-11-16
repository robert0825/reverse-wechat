package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXAPIFactory
{
  private static final String TAG = "MicroMsg.PaySdk.WXFactory";
  
  private WXAPIFactory()
  {
    GMTrace.i(52881784832L, 394);
    throw new RuntimeException(getClass().getSimpleName() + " should not be instantiated");
  }
  
  public static IWXAPI createWXAPI(Context paramContext, String paramString)
  {
    GMTrace.i(52613349376L, 392);
    paramContext = createWXAPI(paramContext, paramString, false);
    GMTrace.o(52613349376L, 392);
    return paramContext;
  }
  
  public static IWXAPI createWXAPI(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(52747567104L, 393);
    Log.d("MicroMsg.PaySdk.WXFactory", "createWXAPI, appId = " + paramString + ", checkSignature = " + paramBoolean);
    paramContext = new WXApiImplV10(paramContext, paramString, paramBoolean);
    GMTrace.o(52747567104L, 393);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\openapi\WXAPIFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */