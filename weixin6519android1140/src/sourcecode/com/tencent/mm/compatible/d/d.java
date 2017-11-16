package com.tencent.mm.compatible.d;

import android.hardware.Camera;
import com.tencent.gmtrace.GMTrace;

final class d
  implements c.a
{
  d()
  {
    GMTrace.i(13799058833408L, 102811);
    GMTrace.o(13799058833408L, 102811);
  }
  
  public static c.a.a sH()
  {
    GMTrace.i(13799193051136L, 102812);
    c.a.a locala = new c.a.a();
    try
    {
      locala.fPj = Camera.open();
      locala.eSp = 0;
      if (locala.fPj == null)
      {
        GMTrace.o(13799193051136L, 102812);
        return null;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(13799193051136L, 102812);
      return null;
    }
    GMTrace.o(13799193051136L, 102812);
    return localException;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */