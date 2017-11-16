package com.tencent.mm.plugin.subapp.jdbiz;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.hj;
import com.tencent.mm.g.a.ii;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.p.k;
import com.tencent.mm.pluginsdk.p.z;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import java.util.HashMap;
import java.util.Map;

public class c
  implements p.k, aq
{
  private com.tencent.mm.sdk.b.c fJv;
  private a qrT;
  private b qrU;
  Map<String, Integer> qrV;
  
  public c()
  {
    GMTrace.i(5854174642176L, 43617);
    this.qrT = null;
    this.qrU = null;
    this.qrV = new HashMap();
    this.fJv = new com.tencent.mm.sdk.b.c() {};
    w.i("MicroMsg.SubCoreJdIP6", "new SubCoreJDBiz this: " + hashCode() + " stack: " + bg.bQW());
    GMTrace.o(5854174642176L, 43617);
  }
  
  public static void b(b paramb)
  {
    GMTrace.i(5855785254912L, 43629);
    h.xw().wG();
    c localc = brr();
    if (localc.qrU == null) {
      localc.qrU = b.brj();
    }
    w.i("MicroMsg.SubCoreJdIP6", "updatejdMsgContent old: %s new: %s", new Object[] { localc.qrU.brl(), paramb.brl() });
    if (!paramb.a(localc.qrU))
    {
      w.i("MicroMsg.SubCoreJdIP6", "fo zu baoyou! the activityid is same");
      GMTrace.o(5855785254912L, 43629);
      return;
    }
    if ((!bg.nm(paramb.qrJ)) || (paramb.qrI))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(327939, "1");
    }
    if (paramb.qrH)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(327938, "1");
    }
    for (;;)
    {
      localc.qrU = paramb;
      at.AR();
      com.tencent.mm.y.c.xh().set(327942, paramb.eQH);
      localc.brx();
      GMTrace.o(5855785254912L, 43629);
      return;
      at.AR();
      com.tencent.mm.y.c.xh().set(327938, "");
    }
  }
  
  public static String bW(String paramString, int paramInt)
  {
    GMTrace.i(5856187908096L, 43632);
    String str = paramString;
    if (-1 == paramString.indexOf('#')) {
      if (-1 != paramString.indexOf('?')) {
        break label64;
      }
    }
    label64:
    for (str = paramString + "?wc_scene=" + paramInt;; str = paramString + "&wc_scene=" + paramInt)
    {
      GMTrace.o(5856187908096L, 43632);
      return str;
    }
  }
  
  public static c brr()
  {
    GMTrace.i(5854308859904L, 43618);
    c localc2 = (c)p.z.tmj;
    c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = new c();
      p.z.tmj = localc1;
    }
    GMTrace.o(5854308859904L, 43618);
    return localc1;
  }
  
  private void brx()
  {
    GMTrace.i(5855919472640L, 43630);
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5851356069888L, 43596);
        ii localii = new ii();
        com.tencent.mm.sdk.b.a.vgX.m(localii);
        GMTrace.o(5851356069888L, 43596);
      }
    });
    GMTrace.o(5855919472640L, 43630);
  }
  
  public static boolean brz()
  {
    GMTrace.i(5856322125824L, 43633);
    String str1 = g.ut().getValue("JDEntranceConfigName");
    String str2 = g.ut().getValue("JDEntranceConfigIconUrl");
    String str3 = g.ut().getValue("JDEntranceConfigJumpUrl");
    if ((!bg.nm(str1)) && (!bg.nm(str2)) && (!bg.nm(str3)))
    {
      GMTrace.o(5856322125824L, 43633);
      return true;
    }
    GMTrace.o(5856322125824L, 43633);
    return false;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5854711513088L, 43621);
    w.i("MicroMsg.SubCoreJdIP6", "onAccountPostReset");
    if (this.qrT == null) {
      this.qrT = new a();
    }
    at.getSysCmdMsgExtension().a("jd", this.qrT, true);
    com.tencent.mm.sdk.b.a.vgX.b(this.fJv);
    GMTrace.o(5854711513088L, 43621);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5854845730816L, 43622);
    GMTrace.o(5854845730816L, 43622);
  }
  
  public final String brA()
  {
    GMTrace.i(5856456343552L, 43634);
    Object localObject2 = g.ut().getValue("JDEntranceConfigJumpUrl");
    if (bg.nm((String)localObject2))
    {
      GMTrace.o(5856456343552L, 43634);
      return null;
    }
    b localb = brw();
    int j = 1;
    int i = j;
    Object localObject1 = localObject2;
    if (brs())
    {
      if ((!localb.brk()) && ("3".equals(localb.qrF)) && (!bg.nm(localb.jumpUrl)))
      {
        w.i("MicroMsg.SubCoreJdIP6", "jumpUrl update %s", new Object[] { localb.jumpUrl });
        localObject1 = localb.jumpUrl;
        i = 6;
      }
    }
    else
    {
      j = i;
      localObject2 = localObject1;
      if ("2".equals(localb.qrF))
      {
        j = i;
        localObject2 = localObject1;
        if (!bg.nm(localb.jumpUrl))
        {
          if (localb.qrL >= System.currentTimeMillis() / 1000L) {
            break label277;
          }
          k = 1;
          label177:
          j = i;
          localObject2 = localObject1;
          if (k != 0) {
            if ((localb.qrM == 0L) || (localb.qrM >= System.currentTimeMillis() / 1000L)) {
              break label282;
            }
          }
        }
      }
    }
    label277:
    label282:
    for (int k = 1;; k = 0)
    {
      j = i;
      localObject2 = localObject1;
      if (k == 0)
      {
        localObject2 = localb.jumpUrl;
        j = 3;
      }
      localObject1 = bW((String)localObject2, j);
      GMTrace.o(5856456343552L, 43634);
      return (String)localObject1;
      i = j;
      localObject1 = localObject2;
      if (!localb.qrI) {
        break;
      }
      i = 2;
      localObject1 = localObject2;
      break;
      k = 0;
      break label177;
    }
  }
  
  public final boolean brs()
  {
    GMTrace.i(5855114166272L, 43624);
    at.AR();
    boolean bool = "1".equals((String)com.tencent.mm.y.c.xh().get(327939, ""));
    GMTrace.o(5855114166272L, 43624);
    return bool;
  }
  
  public final boolean brt()
  {
    GMTrace.i(5855248384000L, 43625);
    at.AR();
    boolean bool = "1".equals((String)com.tencent.mm.y.c.xh().get(327938, ""));
    GMTrace.o(5855248384000L, 43625);
    return bool;
  }
  
  public final void bru()
  {
    GMTrace.i(5855382601728L, 43626);
    at.AR();
    com.tencent.mm.y.c.xh().set(327938, "");
    GMTrace.o(5855382601728L, 43626);
  }
  
  public final void brv()
  {
    GMTrace.i(5855516819456L, 43627);
    at.AR();
    com.tencent.mm.y.c.xh().set(327939, "");
    GMTrace.o(5855516819456L, 43627);
  }
  
  public final b brw()
  {
    GMTrace.i(5855651037184L, 43628);
    if (this.qrU == null) {
      this.qrU = b.brj();
    }
    b localb = this.qrU;
    GMTrace.o(5855651037184L, 43628);
    return localb;
  }
  
  public final void bry()
  {
    GMTrace.i(5856053690368L, 43631);
    if ((at.AU()) && ((brr().brs()) || (brr().brt())))
    {
      b localb = brr().brw();
      if (((!bg.nm(localb.qrJ)) || (localb.qrI)) && (localb.brk()))
      {
        w.i("MicroMsg.SubCoreJdIP6", "clear red dot/friend dot");
        brr().bru();
        brr().brv();
        brr().brx();
      }
    }
    GMTrace.o(5856053690368L, 43631);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5854577295360L, 43620);
    GMTrace.o(5854577295360L, 43620);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5854979948544L, 43623);
    w.i("MicroMsg.SubCoreJdIP6", "onAccountRelease");
    if (this.qrT != null)
    {
      a locala = this.qrT;
      com.tencent.mm.sdk.b.a.vgX.c(locala.qrC);
      at.getSysCmdMsgExtension().b("jd", this.qrT, true);
    }
    this.qrV.clear();
    this.qrT = null;
    com.tencent.mm.sdk.b.a.vgX.c(this.fJv);
    GMTrace.o(5854979948544L, 43623);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5854443077632L, 43619);
    GMTrace.o(5854443077632L, 43619);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\jdbiz\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */