package com.tencent.mm.x;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class h
{
  public static boolean eU(String paramString)
  {
    GMTrace.i(16382213226496L, 122057);
    if ((paramString != null) && (paramString.endsWith("@app")))
    {
      GMTrace.o(16382213226496L, 122057);
      return true;
    }
    GMTrace.o(16382213226496L, 122057);
    return false;
  }
  
  public static k eV(String paramString)
  {
    GMTrace.i(16382615879680L, 122060);
    try
    {
      k localk = (k)new k().aD(Base64.decode(paramString, 0));
      paramString = localk;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramString = (k)new k().aD(bg.St(paramString));
        }
        catch (Exception paramString)
        {
          paramString = new k();
        }
      }
    }
    GMTrace.o(16382615879680L, 122060);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */