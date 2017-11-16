package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ae;

public final class h
{
  public static m Ir(String paramString)
  {
    GMTrace.i(8186073448448L, 60991);
    if (u.GE(paramString))
    {
      paramString = ae.bjd().dU(u.IM(paramString));
      GMTrace.o(8186073448448L, 60991);
      return paramString;
    }
    paramString = ae.bjg().dN(u.IM(paramString));
    if (paramString != null)
    {
      paramString = paramString.blF();
      GMTrace.o(8186073448448L, 60991);
      return paramString;
    }
    GMTrace.o(8186073448448L, 60991);
    return null;
  }
  
  public static m Is(String paramString)
  {
    GMTrace.i(8186341883904L, 60993);
    if (u.GE(paramString))
    {
      paramString = ae.bjd().va(u.IN(paramString));
      GMTrace.o(8186341883904L, 60993);
      return paramString;
    }
    paramString = ae.bjg().uW(u.IN(paramString));
    if (paramString != null)
    {
      paramString = paramString.blF();
      GMTrace.o(8186341883904L, 60993);
      return paramString;
    }
    GMTrace.o(8186341883904L, 60993);
    return null;
  }
  
  public static boolean a(String paramString, m paramm)
  {
    GMTrace.i(8186207666176L, 60992);
    if (u.GE(paramString))
    {
      bool = ae.bjd().b(u.IM(paramString), paramm);
      GMTrace.o(8186207666176L, 60992);
      return bool;
    }
    boolean bool = ae.bjg().b(u.IM(paramString), paramm.bmj());
    GMTrace.o(8186207666176L, 60992);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */