package com.tencent.mm.plugin.masssend.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  private LinkedList<d> mTh;
  
  public c()
  {
    GMTrace.i(11217112399872L, 83574);
    GMTrace.o(11217112399872L, 83574);
  }
  
  private static String aNy()
  {
    GMTrace.i(11217515053056L, 83577);
    if (at.AU())
    {
      at.AR();
      String str = String.format("%s/masssend_%s.ini", new Object[] { com.tencent.mm.y.c.zn(), v.bPK() });
      w.d("MicroMsg.MassSendService", "config file path is %s", new Object[] { str });
      GMTrace.o(11217515053056L, 83577);
      return str;
    }
    GMTrace.o(11217515053056L, 83577);
    return "";
  }
  
  private boolean aNz()
  {
    GMTrace.i(11217649270784L, 83578);
    byte[] arrayOfByte;
    if (this.mTh == null)
    {
      localObject = aNy();
      arrayOfByte = com.tencent.mm.a.e.d((String)localObject, 0, -1);
      if (arrayOfByte == null)
      {
        GMTrace.o(11217649270784L, 83578);
        return false;
      }
    }
    try
    {
      this.mTh = ((e)new e().aD(arrayOfByte)).mTi;
      if (this.mTh == null)
      {
        w.w("MicroMsg.MassSendService", "info list is empty");
        GMTrace.o(11217649270784L, 83578);
        return false;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.loader.stub.b.deleteFile((String)localObject);
      GMTrace.o(11217649270784L, 83578);
      return false;
    }
    w.i("MicroMsg.MassSendService", "info list[%s]", new Object[] { this.mTh.toString() });
    long l = bg.Pu();
    Object localObject = this.mTh.iterator();
    while (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      if ((locald.epR <= l) && (l <= locald.end))
      {
        GMTrace.o(11217649270784L, 83578);
        return true;
      }
    }
    GMTrace.o(11217649270784L, 83578);
    return false;
  }
  
  public static void cL(long paramLong)
  {
    GMTrace.i(11217380835328L, 83576);
    at.AR();
    com.tencent.mm.y.c.xh().set(102409, Long.valueOf(paramLong));
    GMTrace.o(11217380835328L, 83576);
  }
  
  public final void BL(String paramString)
  {
    GMTrace.i(11217783488512L, 83579);
    if (bg.nm(paramString))
    {
      GMTrace.o(11217783488512L, 83579);
      return;
    }
    Object localObject1 = bh.q(paramString, "Festivals");
    if (localObject1 == null)
    {
      GMTrace.o(11217783488512L, 83579);
      return;
    }
    e locale = new e();
    int i = 0;
    Object localObject2 = new StringBuilder(".Festivals.Festival");
    if (i == 0) {}
    for (paramString = "";; paramString = String.valueOf(i))
    {
      paramString = paramString;
      if (!((Map)localObject1).containsKey(paramString)) {
        break label206;
      }
      localObject2 = new d();
      ((d)localObject2).epR = bg.Sp((String)((Map)localObject1).get(paramString + ".StartTime"));
      ((d)localObject2).end = (bg.Sp((String)((Map)localObject1).get(paramString + ".EndTime")) + 86400000);
      locale.mTi.add(localObject2);
      i += 1;
      break;
    }
    label206:
    locale.count = locale.mTi.size();
    this.mTh = locale.mTi;
    for (;;)
    {
      try
      {
        paramString = locale.toByteArray();
        localObject1 = aNy();
        if (bg.nm((String)localObject1))
        {
          w.w("MicroMsg.MassSendService", "mass send config file path is null, return");
          GMTrace.o(11217783488512L, 83579);
          return;
        }
        localObject2 = new File((String)localObject1);
        if (!((File)localObject2).exists())
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(102408, Boolean.valueOf(false));
          w.d("MicroMsg.MassSendService", "save to config file : %s", new Object[] { locale.toString() });
          com.tencent.mm.a.e.b((String)localObject1, paramString, paramString.length);
          GMTrace.o(11217783488512L, 83579);
          return;
        }
        if (!com.tencent.mm.a.g.h((File)localObject2).equals(com.tencent.mm.a.g.n(paramString)))
        {
          i = 1;
          if (i != 0)
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(102408, Boolean.valueOf(false));
          }
        }
        else
        {
          i = 0;
        }
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.MassSendService", paramString, "", new Object[0]);
        GMTrace.o(11217783488512L, 83579);
        return;
      }
    }
  }
  
  public final void aNx()
  {
    Object localObject1 = null;
    GMTrace.i(11217246617600L, 83575);
    boolean bool1 = aNz();
    at.AR();
    boolean bool2 = ((Boolean)com.tencent.mm.y.c.xh().get(102408, Boolean.valueOf(false))).booleanValue();
    int i;
    if ((q.zP() & 0x10000) == 0)
    {
      i = 1;
      w.d("MicroMsg.MassSendService", "hadSetTop is %B", new Object[] { Boolean.valueOf(bool2) });
      if ((i == 0) || (bool2) || (!bool1)) {
        break label419;
      }
      w.d("MicroMsg.MassSendService", "set top conversation");
      at.AR();
      if (com.tencent.mm.y.c.yP().TO("masssendapp") != null) {
        break label260;
      }
      at.AR();
      if (com.tencent.mm.y.c.yP().TO("masssendapp") == null)
      {
        localObject1 = new ae();
        ((ae)localObject1).setUsername("masssendapp");
        ((ae)localObject1).setContent(ab.getContext().getResources().getString(R.l.djS));
        ((ae)localObject1).x(bg.Pv() + 2000L);
        ((ae)localObject1).dC(0);
        ((ae)localObject1).dz(0);
        at.AR();
        com.tencent.mm.y.c.yP().d((ae)localObject1);
      }
    }
    label260:
    Object localObject2;
    for (;;)
    {
      com.tencent.mm.plugin.report.service.g.ork.A(10425, "");
      at.AR();
      com.tencent.mm.y.c.xh().set(102409, Long.valueOf(bg.Pv()));
      at.AR();
      com.tencent.mm.y.c.xh().set(102408, Boolean.valueOf(true));
      GMTrace.o(11217246617600L, 83575);
      return;
      i = 0;
      break;
      localObject2 = h.aNB().goN.a("select * from massendinfo ORDER BY createtime DESC  limit 1", null, 2);
      if (localObject2 != null) {
        break label369;
      }
      if (localObject1 != null) {
        break label405;
      }
      localObject1 = ab.getContext().getResources().getString(R.l.djS);
      label300:
      localObject2 = new ae();
      ((ae)localObject2).setUsername("masssendapp");
      ((ae)localObject2).setContent((String)localObject1);
      ((ae)localObject2).x(bg.Pv() + 2000L);
      ((ae)localObject2).dC(0);
      ((ae)localObject2).dz(0);
      at.AR();
      com.tencent.mm.y.c.yP().a((ae)localObject2, "masssendapp");
    }
    label369:
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new a();
      ((a)localObject1).b((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      label405:
      h.aNB();
      localObject1 = b.a((a)localObject1);
      break label300;
      label419:
      if (!bool1)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(102408, Boolean.valueOf(false));
      }
      GMTrace.o(11217246617600L, 83575);
      return;
      localObject1 = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */