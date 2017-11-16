package com.tencent.mm.bf;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;

public final class b
{
  public static float aD(long paramLong)
  {
    float f1 = 1.0F;
    GMTrace.i(413256384512L, 3079);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      f1 = Math.round(f1 * 10.0F) / 10.0F;
      GMTrace.o(413256384512L, 3079);
      return f1;
      f1 = f2;
    }
  }
  
  public static CharSequence t(Context paramContext, int paramInt)
  {
    GMTrace.i(413390602240L, 3080);
    if (paramInt <= 0)
    {
      paramContext = paramContext.getString(R.l.duH, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
      GMTrace.o(413390602240L, 3080);
      return paramContext;
    }
    int i = paramInt / 60;
    paramContext = paramContext.getString(R.l.duH, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt % 60) });
    GMTrace.o(413390602240L, 3080);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bf\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */