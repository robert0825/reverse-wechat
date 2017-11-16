package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.qmessage.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.br;
import java.util.HashMap;

public final class g
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private e nRt;
  private f nRu;
  private a nRv;
  private b nRw;
  
  static
  {
    GMTrace.i(8940377079808L, 66611);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("QCONTACT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8940645515264L, 66613);
        String[] arrayOfString = e.fTX;
        GMTrace.o(8940645515264L, 66613);
        return arrayOfString;
      }
    });
    GMTrace.o(8940377079808L, 66611);
  }
  
  public g()
  {
    GMTrace.i(8939034902528L, 66601);
    this.nRu = new f();
    this.nRv = new a();
    this.nRw = new b();
    GMTrace.o(8939034902528L, 66601);
  }
  
  private static g aYj()
  {
    GMTrace.i(8939169120256L, 66602);
    g localg2 = (g)at.AK().gZ("plugin.qmessage");
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg1 = new g();
      at.AK().a("plugin.qmessage", localg1);
    }
    GMTrace.o(8939169120256L, 66602);
    return localg1;
  }
  
  public static e aYk()
  {
    GMTrace.i(8939303337984L, 66603);
    h.xw().wG();
    if (aYj().nRt == null)
    {
      localObject = aYj();
      at.AR();
      ((g)localObject).nRt = new e(com.tencent.mm.y.c.yH());
    }
    Object localObject = aYj().nRt;
    GMTrace.o(8939303337984L, 66603);
    return (e)localObject;
  }
  
  public static void aYl()
  {
    GMTrace.i(8939840208896L, 66607);
    at.AR();
    if (com.tencent.mm.y.c.yP().TO("qmessage") == null)
    {
      localObject = new ae();
      ((ae)localObject).setUsername("qmessage");
      ((ae)localObject).setContent("");
      ((ae)localObject).x(bg.Pv());
      ((ae)localObject).dC(0);
      ((ae)localObject).dz(0);
      at.AR();
      com.tencent.mm.y.c.yP().d((ae)localObject);
      GMTrace.o(8939840208896L, 66607);
      return;
    }
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().Ca("qmessage");
    ae localae = new ae();
    localae.setUsername("qmessage");
    if (localObject == null) {}
    for (localObject = "";; localObject = ((ce)localObject).field_content)
    {
      localae.setContent((String)localObject);
      localae.x(bg.Pv());
      localae.dC(0);
      localae.dz(0);
      at.AR();
      com.tencent.mm.y.c.yP().a(localae, "qmessage");
      GMTrace.o(8939840208896L, 66607);
      return;
    }
  }
  
  public static void aYm()
  {
    GMTrace.i(8939974426624L, 66608);
    bc.Bi();
    at.AR();
    com.tencent.mm.y.c.yP().Ch("@qqim");
    at.AR();
    com.tencent.mm.y.c.yP().TN("qmessage");
    GMTrace.o(8939974426624L, 66608);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8940108644352L, 66609);
    d.c.a(Integer.valueOf(36), this.nRu);
    d.c.a(Integer.valueOf(39), this.nRu);
    com.tencent.mm.sdk.b.a.vgX.b(this.nRv);
    com.tencent.mm.sdk.b.a.vgX.b(this.nRw);
    GMTrace.o(8940108644352L, 66609);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(8940242862080L, 66610);
    GMTrace.o(8940242862080L, 66610);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8939705991168L, 66606);
    w.d("MicroMsg.SubCoreQMsg", "clear plugin");
    if ((paramInt & 0x20) != 0) {
      aYm();
    }
    GMTrace.o(8939705991168L, 66606);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8939437555712L, 66604);
    d.c.aE(Integer.valueOf(36));
    d.c.aE(Integer.valueOf(39));
    com.tencent.mm.sdk.b.a.vgX.c(this.nRv);
    com.tencent.mm.sdk.b.a.vgX.c(this.nRw);
    GMTrace.o(8939437555712L, 66604);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(8939571773440L, 66605);
    HashMap localHashMap = fIv;
    GMTrace.o(8939571773440L, 66605);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */