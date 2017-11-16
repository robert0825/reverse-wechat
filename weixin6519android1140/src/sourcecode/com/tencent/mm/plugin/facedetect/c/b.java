package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends Enum<b>
{
  static
  {
    GMTrace.i(5985976451072L, 44599);
    kSm = 1;
    kSn = new int[] { kSm };
    GMTrace.o(5985976451072L, 44599);
  }
  
  public static a a(Context paramContext, e parame, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(14547054231552L, 108384);
    w.i("MicroMsg.FaceDetectControllerFactory", "alvinluo getController serverScene: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(14547054231552L, 108384);
      return null;
    case 0: 
    case 1: 
    case 3: 
    case 4: 
      paramContext = new c(paramContext, parame, paramInt);
      GMTrace.o(14547054231552L, 108384);
      return paramContext;
    }
    paramContext = new d(paramContext, parame, paramInt, paramBundle);
    GMTrace.o(14547054231552L, 108384);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */