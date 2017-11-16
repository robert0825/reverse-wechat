package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.protocal.c.abu;
import com.tencent.mm.protocal.c.abv;
import com.tencent.mm.protocal.c.aqw;
import com.tencent.mm.protocal.c.er;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static String gUj;
  public static String gUk;
  public static String gUl;
  public static String gUm;
  public static String gUn;
  public static String gUo;
  public static String gUp;
  public static String gUq;
  public static String gUr;
  public static String gUs;
  private static int gUt;
  private static int gUu;
  private static int gUv;
  private static int gUw;
  private static boolean gUx;
  private com.tencent.mm.ad.e fUd;
  
  static
  {
    GMTrace.i(1367275995136L, 10187);
    gUu = 0;
    gUv = 22;
    gUw = 0;
    gUx = false;
    GMTrace.o(1367275995136L, 10187);
  }
  
  public q(int paramInt)
  {
    GMTrace.i(1366739124224L, 10183);
    gUt = paramInt;
    GMTrace.o(1366739124224L, 10183);
  }
  
  public static int Ln()
  {
    GMTrace.i(1365799600128L, 10176);
    int i = gUu;
    GMTrace.o(1365799600128L, 10176);
    return i;
  }
  
  public static boolean Lo()
  {
    GMTrace.i(1365933817856L, 10177);
    if ((gUw & 0x2) != 0)
    {
      GMTrace.o(1365933817856L, 10177);
      return true;
    }
    GMTrace.o(1365933817856L, 10177);
    return false;
  }
  
  public static boolean Lp()
  {
    GMTrace.i(1366068035584L, 10178);
    if ((gUv & 0x4) != 0)
    {
      GMTrace.o(1366068035584L, 10178);
      return true;
    }
    GMTrace.o(1366068035584L, 10178);
    return false;
  }
  
  public static int Lq()
  {
    GMTrace.i(1366336471040L, 10180);
    int i = gUt;
    GMTrace.o(1366336471040L, 10180);
    return i;
  }
  
  public static boolean Lr()
  {
    GMTrace.i(1366470688768L, 10181);
    if ((gUw & 0x200) != 0)
    {
      GMTrace.o(1366470688768L, 10181);
      return true;
    }
    GMTrace.o(1366470688768L, 10181);
    return false;
  }
  
  public static boolean Ls()
  {
    GMTrace.i(1366604906496L, 10182);
    if ((gUw & 0x400) != 0)
    {
      GMTrace.o(1366604906496L, 10182);
      return true;
    }
    GMTrace.o(1366604906496L, 10182);
    return false;
  }
  
  public static void bB(boolean paramBoolean)
  {
    GMTrace.i(1366202253312L, 10179);
    if (paramBoolean)
    {
      gUv |= 0x4;
      GMTrace.o(1366202253312L, 10179);
      return;
    }
    gUv &= 0xFFFFFFFB;
    GMTrace.o(1366202253312L, 10179);
  }
  
  public static boolean gX(int paramInt)
  {
    GMTrace.i(1365665382400L, 10175);
    if (gUt == paramInt)
    {
      GMTrace.o(1365665382400L, 10175);
      return false;
    }
    GMTrace.o(1365665382400L, 10175);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1367007559680L, 10185);
    b.a locala = new b.a();
    abu localabu = new abu();
    localabu.kBh = v.bPK();
    w.d("MicroMsg.NetSceneGetOnlineInfo", "language %s", new Object[] { localabu.kBh });
    locala.gtF = localabu;
    locala.gtG = new abv();
    locala.uri = "/cgi-bin/micromsg-bin/getonlineinfo";
    locala.gtE = 526;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUd = parame1;
    int i = a(parame, locala.DA(), this);
    GMTrace.o(1367007559680L, 10185);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1367141777408L, 10186);
    w.i("MicroMsg.NetSceneGetOnlineInfo", "ongynetend %d, %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (abv)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      gUu = paramArrayOfByte.usr;
      w.d("MicroMsg.NetSceneGetOnlineInfo", "iconType:%d onlineInfoFlag:%d", new Object[] { Integer.valueOf(gUu), Integer.valueOf(paramArrayOfByte.tPM) });
      Object localObject = bh.q(paramArrayOfByte.usq, "summary");
      paramInt1 = gUv;
      if (localObject != null)
      {
        gUj = (String)((Map)localObject).get(".summary.banner");
        w.d("MicroMsg.NetSceneGetOnlineInfo", "onlineinfo, count:%d, summary:%s", new Object[] { Integer.valueOf(paramArrayOfByte.uso), paramArrayOfByte.usq });
        localObject = (abu)((com.tencent.mm.ad.b)paramq).gtC.gtK;
        Iterator localIterator = paramArrayOfByte.usp.iterator();
        while (localIterator.hasNext())
        {
          paramq = (aqw)localIterator.next();
          if (paramq.tTB.bNS().hashCode() != ((abu)localObject).uNh.tTB.bNS().hashCode())
          {
            localObject = bh.q(paramq.uHb, "wording");
            w.d("MicroMsg.NetSceneGetOnlineInfo", paramq.uHb);
            if (localObject != null)
            {
              gUk = (String)((Map)localObject).get(".wording.title");
              gUl = (String)((Map)localObject).get(".wording.notify");
              gUm = (String)((Map)localObject).get(".wording.mute_title");
              gUn = (String)((Map)localObject).get(".wording.mute_tips");
              gUo = (String)((Map)localObject).get(".wording.exit");
              gUp = (String)((Map)localObject).get(".wording.exit_confirm");
              gUq = (String)((Map)localObject).get(".wording.lock_title");
              gUr = (String)((Map)localObject).get(".wording.mute_lock_title");
              gUs = (String)((Map)localObject).get(".wording.exit");
            }
            paramInt1 = paramq.uHd;
          }
        }
      }
    }
    for (;;)
    {
      int i = paramArrayOfByte.tPM;
      gUw = i;
      if ((i & 0x2) == 0)
      {
        gUx = true;
        if (paramInt1 != gUv)
        {
          gUv = paramInt1;
          at.AR();
          c.wH();
        }
        if ((paramArrayOfByte.tPM & 0x40) != 0)
        {
          at.AR();
          paramArrayOfByte = c.yK().TE("filehelper");
          if (paramArrayOfByte != null)
          {
            paramq = paramArrayOfByte;
            if (!bg.nm(paramArrayOfByte.field_username)) {}
          }
          else
          {
            z.w(paramArrayOfByte);
            at.AR();
            paramq = c.yK().TE("filehelper");
          }
          if ((paramq != null) && (!a.eE(paramq.field_type)))
          {
            paramq.uA();
            at.AR();
            c.yK().a(paramq.field_username, paramq);
          }
          at.AR();
          paramq = c.yP().TO("filehelper");
          if (paramq != null) {
            break label657;
          }
          paramq = new ae("filehelper");
          paramq.x(bg.Pv());
          at.AR();
          c.yP().d(paramq);
        }
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(1367141777408L, 10186);
        return;
        gUx = false;
        break;
        label657:
        paramq.x(bg.Pv());
        at.AR();
        c.yP().a(paramq, "filehelper");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(1366873341952L, 10184);
    GMTrace.o(1366873341952L, 10184);
    return 526;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */