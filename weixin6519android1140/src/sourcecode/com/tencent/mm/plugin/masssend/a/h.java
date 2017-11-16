package com.tencent.mm.plugin.masssend.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.HashMap;

public final class h
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private bt.a mRn;
  private b mTk;
  private c mTl;
  private i mTm;
  private g mTn;
  
  static
  {
    GMTrace.i(11215233351680L, 83560);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("MASSENDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11215501787136L, 83562);
        String[] arrayOfString = b.fTX;
        GMTrace.o(11215501787136L, 83562);
        return arrayOfString;
      }
    });
    GMTrace.o(11215233351680L, 83560);
  }
  
  public h()
  {
    GMTrace.i(11214025392128L, 83551);
    this.mTm = new i();
    this.mTn = new g();
    this.mRn = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(11216978182144L, 83573);
        paramAnonymousa = n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.SubCoreMassSend", "MassSendTopConfXml:" + paramAnonymousa);
        h.aNC().BL(paramAnonymousa);
        h.aNC().aNx();
        h.aNC();
        c.cL(bg.Pv());
        GMTrace.o(11216978182144L, 83573);
      }
    };
    GMTrace.o(11214025392128L, 83551);
  }
  
  private static h aNA()
  {
    GMTrace.i(11214159609856L, 83552);
    h localh2 = (h)at.AK().gZ("plugin.masssend");
    h localh1 = localh2;
    if (localh2 == null)
    {
      localh1 = new h();
      at.AK().a("plugin.favorite", localh1);
    }
    GMTrace.o(11214159609856L, 83552);
    return localh1;
  }
  
  public static b aNB()
  {
    GMTrace.i(11214293827584L, 83553);
    com.tencent.mm.kernel.h.xw().wG();
    if (aNA().mTk == null)
    {
      localObject = aNA();
      at.AR();
      ((h)localObject).mTk = new b(com.tencent.mm.y.c.yH());
    }
    Object localObject = aNA().mTk;
    GMTrace.o(11214293827584L, 83553);
    return (b)localObject;
  }
  
  public static c aNC()
  {
    GMTrace.i(11214428045312L, 83554);
    if (aNA().mTl == null) {
      aNA().mTl = new c();
    }
    c localc = aNA().mTl;
    GMTrace.o(11214428045312L, 83554);
    return localc;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11214964916224L, 83558);
    at.getSysCmdMsgExtension().a("masssendapp", this.mRn, false);
    com.tencent.mm.sdk.b.a.vgX.b(this.mTm);
    com.tencent.mm.sdk.b.a.vgX.b(this.mTn);
    GMTrace.o(11214964916224L, 83558);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11215099133952L, 83559);
    GMTrace.o(11215099133952L, 83559);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11214830698496L, 83557);
    GMTrace.o(11214830698496L, 83557);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11214562263040L, 83555);
    at.getSysCmdMsgExtension().b("masssendapp", this.mRn, false);
    com.tencent.mm.sdk.b.a.vgX.c(this.mTm);
    com.tencent.mm.sdk.b.a.vgX.c(this.mTn);
    GMTrace.o(11214562263040L, 83555);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11214696480768L, 83556);
    HashMap localHashMap = fIv;
    GMTrace.o(11214696480768L, 83556);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */