package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bsi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;

public abstract class b
  extends c
{
  public b()
  {
    GMTrace.i(9192572190720L, 68490);
    GMTrace.o(9192572190720L, 68490);
  }
  
  protected static String d(String paramString, au paramau)
  {
    GMTrace.i(9192840626176L, 68492);
    Object localObject = paramString;
    if (s.eb(paramString))
    {
      int i = bc.gO(paramau.field_content);
      localObject = paramString;
      if (i != -1)
      {
        paramau = paramau.field_content.substring(0, i).trim();
        localObject = paramString;
        if (paramau != null)
        {
          localObject = paramString;
          if (paramau.length() > 0) {
            localObject = paramau;
          }
        }
      }
    }
    GMTrace.o(9192840626176L, 68492);
    return (String)localObject;
  }
  
  protected final String c(String paramString, au paramau)
  {
    GMTrace.i(9192706408448L, 68491);
    if (s.eb(paramString))
    {
      paramString = d(paramString, paramau);
      paramString = String.format(ab.getContext().getString(R.l.dMs), new Object[] { h.KX(paramString), Character.valueOf('​'), h.V(paramau).nIp });
      GMTrace.o(9192706408448L, 68491);
      return paramString;
    }
    paramString = String.format(ab.getContext().getString(R.l.dMt), new Object[] { h.V(paramau).nIp });
    GMTrace.o(9192706408448L, 68491);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */