package com.tencent.mm.plugin.talkroom.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;

public final class h
{
  private static final int qwC;
  
  static
  {
    GMTrace.i(5144833949696L, 38332);
    qwC = a.qwC;
    GMTrace.o(5144833949696L, 38332);
  }
  
  public static String ax(Context paramContext, String paramString)
  {
    GMTrace.i(5144699731968L, 38331);
    if (bg.nm(paramString))
    {
      GMTrace.o(5144699731968L, 38331);
      return null;
    }
    at.AR();
    x localx = c.yK().TE(paramString);
    if (localx == null)
    {
      GMTrace.o(5144699731968L, 38331);
      return null;
    }
    if (s.eb(paramString))
    {
      if (bg.nm(localx.field_nickname))
      {
        paramContext = paramContext.getString(R.l.eef);
        GMTrace.o(5144699731968L, 38331);
        return paramContext;
      }
      paramContext = localx.vj();
      GMTrace.o(5144699731968L, 38331);
      return paramContext;
    }
    paramContext = r.fs(paramString);
    GMTrace.o(5144699731968L, 38331);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */