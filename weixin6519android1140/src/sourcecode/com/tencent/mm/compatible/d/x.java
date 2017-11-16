package com.tencent.mm.compatible.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Method;

public final class x
{
  private static Class<?> fRn;
  private static Method fRo;
  private static Method fRp;
  
  static
  {
    GMTrace.i(13795971825664L, 102788);
    fRn = null;
    fRo = null;
    fRp = null;
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      fRn = localClass;
      fRo = localClass.getDeclaredMethod("get", new Class[] { String.class });
      fRp = fRn.getDeclaredMethod("getInt", new Class[] { String.class, Integer.TYPE });
      fRo.setAccessible(true);
      fRp.setAccessible(true);
      GMTrace.o(13795971825664L, 102788);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SystemProperties", localException, "", new Object[0]);
      GMTrace.o(13795971825664L, 102788);
    }
  }
  
  public static String get(String paramString)
  {
    GMTrace.i(13795837607936L, 102787);
    try
    {
      paramString = (String)fRo.invoke(null, new Object[] { paramString });
      GMTrace.o(13795837607936L, 102787);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.SystemProperties", paramString, "", new Object[0]);
      GMTrace.o(13795837607936L, 102787);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */