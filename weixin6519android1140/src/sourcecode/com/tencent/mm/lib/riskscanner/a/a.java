package com.tencent.mm.lib.riskscanner.a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider;

public final class a
{
  public static Bundle aU(Context paramContext)
  {
    GMTrace.i(17533801332736L, 130637);
    paramContext = paramContext.getContentResolver();
    try
    {
      paramContext = paramContext.call(RiskScannerReqBufferProvider.CONTENT_URI, "prepareReqBuffer", null, null);
      GMTrace.o(17533801332736L, 130637);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      GMTrace.o(17533801332736L, 130637);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\lib\riskscanner\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */