package com.tencent.mm.wallet_core.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.y.q;

public final class t
{
  public static int clW()
  {
    GMTrace.i(1443511664640L, 10755);
    if (q.zR())
    {
      i = a.i.tfa;
      GMTrace.o(1443511664640L, 10755);
      return i;
    }
    int i = a.i.sKC;
    GMTrace.o(1443511664640L, 10755);
    return i;
  }
  
  public static String clX()
  {
    GMTrace.i(1443645882368L, 10756);
    if (q.zR())
    {
      GMTrace.o(1443645882368L, 10756);
      return "R";
    }
    if (q.zS())
    {
      GMTrace.o(1443645882368L, 10756);
      return "HK$";
    }
    GMTrace.o(1443645882368L, 10756);
    return "¥";
  }
  
  public static int clY()
  {
    GMTrace.i(1443914317824L, 10758);
    if (q.zR())
    {
      i = a.g.sPX;
      GMTrace.o(1443914317824L, 10758);
      return i;
    }
    int i = a.g.sPl;
    GMTrace.o(1443914317824L, 10758);
    return i;
  }
  
  public static int clZ()
  {
    GMTrace.i(1444048535552L, 10759);
    if (q.zR())
    {
      i = a.i.taq;
      GMTrace.o(1444048535552L, 10759);
      return i;
    }
    int i = a.i.tap;
    GMTrace.o(1444048535552L, 10759);
    return i;
  }
  
  public static int cma()
  {
    GMTrace.i(1444182753280L, 10760);
    if (q.zR())
    {
      i = a.g.sMh;
      GMTrace.o(1444182753280L, 10760);
      return i;
    }
    int i = a.g.sMg;
    GMTrace.o(1444182753280L, 10760);
    return i;
  }
  
  public static String fJ(Context paramContext)
  {
    GMTrace.i(1443780100096L, 10757);
    if (q.zR())
    {
      paramContext = paramContext.getString(a.i.tgB);
      GMTrace.o(1443780100096L, 10757);
      return paramContext;
    }
    paramContext = paramContext.getString(a.i.tgA);
    GMTrace.o(1443780100096L, 10757);
    return paramContext;
  }
  
  public static String fK(Context paramContext)
  {
    GMTrace.i(17857534492672L, 133049);
    if (q.zR())
    {
      paramContext = paramContext.getString(a.i.tbc);
      GMTrace.o(17857534492672L, 133049);
      return paramContext;
    }
    paramContext = paramContext.getString(a.i.tbb);
    GMTrace.o(17857534492672L, 133049);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */