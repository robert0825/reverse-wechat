package com.tencent.mm.bi;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.f;

public final class a
{
  public static int bIN()
  {
    GMTrace.i(4088674648064L, 30463);
    if (Build.VERSION.SDK_INT < 19)
    {
      i = a.f.aYC;
      GMTrace.o(4088674648064L, 30463);
      return i;
    }
    int i = a.f.aYD;
    GMTrace.o(4088674648064L, 30463);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */