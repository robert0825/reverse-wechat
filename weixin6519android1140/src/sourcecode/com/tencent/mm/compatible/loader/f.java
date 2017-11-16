package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
{
  public f()
  {
    GMTrace.i(13792079511552L, 102759);
    GMTrace.o(13792079511552L, 102759);
  }
  
  public static e a(Application paramApplication, String paramString)
  {
    GMTrace.i(13792213729280L, 102760);
    try
    {
      paramString = (e)ab.getContext().getClassLoader().loadClass(ab.bPT() + paramString).newInstance();
      paramString.app = paramApplication;
      GMTrace.o(13792213729280L, 102760);
      return paramString;
    }
    catch (Exception paramApplication)
    {
      w.printErrStackTrace("MicroMsg.ProfileFactoryImpl", paramApplication, "", new Object[0]);
      GMTrace.o(13792213729280L, 102760);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\loader\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */