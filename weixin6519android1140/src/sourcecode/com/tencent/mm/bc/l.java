package com.tencent.mm.bc;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.fj;
import com.tencent.mm.g.a.kh;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.HashMap;
import java.util.List;

public class l
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  public static int[] gZV;
  public static int gZW;
  private final int ety;
  private n gZN;
  private g gZO;
  private c gZP;
  private d gZQ;
  private i gZR;
  private k gZS;
  private final long gZT;
  private final int gZU;
  private com.tencent.mm.sdk.b.c gZX;
  
  static
  {
    GMTrace.i(1417876078592L, 10564);
    gZV = new int['Ϩ'];
    gZW = 0;
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("LBSVERIFYMESSAGE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(1413715329024L, 10533);
        String[] arrayOfString = i.fTX;
        GMTrace.o(1413715329024L, 10533);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SHAKEVERIFYMESSAGE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(1410896756736L, 10512);
        String[] arrayOfString = k.fTX;
        GMTrace.o(1410896756736L, 10512);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("VERIFY_CONTACT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(1422305263616L, 10597);
        String[] arrayOfString = m.fTX;
        GMTrace.o(1422305263616L, 10597);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("FMESSAGE_MSGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(1422036828160L, 10595);
        String[] arrayOfString = g.fTX;
        GMTrace.o(1422036828160L, 10595);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("FMESSAGE_CONVERSATION_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(1424586964992L, 10614);
        String[] arrayOfString = c.fTX;
        GMTrace.o(1424586964992L, 10614);
        return arrayOfString;
      }
    });
    GMTrace.o(1417876078592L, 10564);
  }
  
  public l()
  {
    GMTrace.i(1416399683584L, 10553);
    this.gZN = new n();
    this.gZQ = new d();
    this.gZT = 259200000L;
    this.ety = 0;
    this.gZU = 2;
    this.gZX = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(1416399683584L, 10553);
  }
  
  private static l MJ()
  {
    GMTrace.i(1416533901312L, 10554);
    l locall2 = (l)at.AK().gZ(l.class.getName());
    l locall1 = locall2;
    if (locall2 == null)
    {
      locall1 = new l();
      at.AK().a(l.class.getName(), locall1);
    }
    GMTrace.o(1416533901312L, 10554);
    return locall1;
  }
  
  public static g MK()
  {
    GMTrace.i(1416668119040L, 10555);
    h.xw().wG();
    if (MJ().gZO == null)
    {
      localObject = MJ();
      at.AR();
      ((l)localObject).gZO = new g(com.tencent.mm.y.c.yH());
      localObject = ML();
      MJ().gZO.a((j.a)localObject, at.xB().ngv.getLooper());
    }
    Object localObject = MJ().gZO;
    GMTrace.o(1416668119040L, 10555);
    return (g)localObject;
  }
  
  public static c ML()
  {
    GMTrace.i(1416802336768L, 10556);
    h.xw().wG();
    if (MJ().gZP == null)
    {
      localObject = MJ();
      at.AR();
      ((l)localObject).gZP = new c(com.tencent.mm.y.c.yH());
    }
    Object localObject = MJ().gZP;
    GMTrace.o(1416802336768L, 10556);
    return (c)localObject;
  }
  
  public static i MM()
  {
    GMTrace.i(1416936554496L, 10557);
    h.xw().wG();
    if (MJ().gZR == null)
    {
      localObject = MJ();
      at.AR();
      ((l)localObject).gZR = new i(com.tencent.mm.y.c.yH());
    }
    Object localObject = MJ().gZR;
    GMTrace.o(1416936554496L, 10557);
    return (i)localObject;
  }
  
  public static k MN()
  {
    GMTrace.i(1417070772224L, 10558);
    h.xw().wG();
    if (MJ().gZS == null)
    {
      localObject = MJ();
      at.AR();
      ((l)localObject).gZS = new k(com.tencent.mm.y.c.yH());
    }
    Object localObject = MJ().gZS;
    GMTrace.o(1417070772224L, 10558);
    return (k)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(1417607643136L, 10562);
    d.c.a(Integer.valueOf(37), this.gZN);
    d.c.a(Integer.valueOf(40), this.gZQ);
    com.tencent.mm.sdk.b.a.vgX.b(this.gZX);
    int i = ML().Mz();
    long l = System.currentTimeMillis();
    at.AR();
    if ((l - bg.a((Long)com.tencent.mm.y.c.xh().get(340225, null), 0L) > 259200000L) && (i > 0))
    {
      Object localObject = ML().MA();
      int j = ((List)localObject).size();
      String str = (String)((List)localObject).get(0);
      i = 1;
      while (i < j)
      {
        str = str + ", " + (String)((List)localObject).get(i);
        i += 1;
      }
      localObject = new kh();
      ((kh)localObject).eOz.userName = null;
      ((kh)localObject).eOz.aDn = str;
      ((kh)localObject).eOz.type = 0;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      at.AR();
      com.tencent.mm.y.c.xh().set(340225, Long.valueOf(System.currentTimeMillis()));
    }
    GMTrace.o(1417607643136L, 10562);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(1417741860864L, 10563);
    GMTrace.o(1417741860864L, 10563);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(1417473425408L, 10561);
    GMTrace.o(1417473425408L, 10561);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(1417204989952L, 10559);
    d.c.aE(Integer.valueOf(37));
    d.c.aE(Integer.valueOf(40));
    com.tencent.mm.sdk.b.a.vgX.c(this.gZX);
    at.getNotification().ry();
    GMTrace.o(1417204989952L, 10559);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(1417339207680L, 10560);
    HashMap localHashMap = fIv;
    GMTrace.o(1417339207680L, 10560);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */