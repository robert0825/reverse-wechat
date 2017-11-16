package com.tencent.mm.ipcinvoker;

import android.content.Context;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

public final class d
{
  public static Context fVo;
  private static String fVp;
  
  public static boolean em(String paramString)
  {
    GMTrace.i(18689684406272L, 139249);
    if ((paramString != null) && (paramString.equals(vP())))
    {
      GMTrace.o(18689684406272L, 139249);
      return true;
    }
    GMTrace.o(18689684406272L, 139249);
    return false;
  }
  
  public static Context getContext()
  {
    GMTrace.i(18689550188544L, 139248);
    Assert.assertNotNull("IPCInvoker not initialize.", fVo);
    Context localContext = fVo;
    GMTrace.o(18689550188544L, 139248);
    return localContext;
  }
  
  public static String vP()
  {
    GMTrace.i(18689818624000L, 139250);
    if ((fVp == null) || (fVp.length() == 0)) {
      fVp = com.tencent.mm.loader.stub.d.r(fVo, Process.myPid());
    }
    String str = fVp;
    GMTrace.o(18689818624000L, 139250);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */