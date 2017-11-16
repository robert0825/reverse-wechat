package com.tencent.mm.ui.chatting;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;

public final class dp
{
  public static String a(au paramau, f.a parama)
  {
    GMTrace.i(2127619424256L, 15852);
    String str2 = "";
    String str1 = str2;
    if (parama != null)
    {
      str1 = str2;
      if (!bg.nm(parama.eAE))
      {
        parama = an.afP().Op(parama.eAE);
        str1 = str2;
        if (parama != null)
        {
          str1 = str2;
          if (parama.aDI())
          {
            str1 = str2;
            if (e.aZ(parama.field_fileFullPath)) {
              str1 = parama.field_fileFullPath;
            }
          }
        }
      }
    }
    if (!bg.nm(str1))
    {
      w.d("MicroMsg.HistoryExportUtil", "get hd appmsg image path ok, %s", new Object[] { str1 });
      GMTrace.o(2127619424256L, 15852);
      return str1;
    }
    if (paramau != null) {
      str1 = n.IZ().x(paramau.field_imgPath, true);
    }
    w.d("MicroMsg.HistoryExportUtil", "try get thumb appmsg image path finish, %s", new Object[] { str1 });
    GMTrace.o(2127619424256L, 15852);
    return str1;
  }
  
  public static String eZ(long paramLong)
  {
    GMTrace.i(2127216771072L, 15849);
    String str = f(n.IZ().aq(paramLong));
    if (str != null)
    {
      GMTrace.o(2127216771072L, 15849);
      return str;
    }
    GMTrace.o(2127216771072L, 15849);
    return null;
  }
  
  private static String f(d paramd)
  {
    GMTrace.i(2127485206528L, 15851);
    if (paramd != null)
    {
      if (paramd.II())
      {
        str = paramd.gGS;
        if ((str != null) && (e.aZ(str)))
        {
          GMTrace.o(2127485206528L, 15851);
          return str;
        }
      }
      String str = paramd.gGS;
      str = n.IZ().l(str, null, null);
      if ((str != null) && (e.aZ(str)))
      {
        GMTrace.o(2127485206528L, 15851);
        return str;
      }
      paramd = paramd.gGU;
      paramd = n.IZ().l(paramd, null, null);
      if ((paramd != null) && (e.aZ(paramd)))
      {
        GMTrace.o(2127485206528L, 15851);
        return paramd;
      }
    }
    GMTrace.o(2127485206528L, 15851);
    return null;
  }
  
  public static String fa(long paramLong)
  {
    GMTrace.i(2127350988800L, 15850);
    String str = f(n.IZ().ap(paramLong));
    if (str != null)
    {
      GMTrace.o(2127350988800L, 15850);
      return str;
    }
    GMTrace.o(2127350988800L, 15850);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */