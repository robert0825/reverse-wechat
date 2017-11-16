package com.tencent.mm.plugin.talkroom.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.HashMap;

public final class b
  implements aq
{
  private n ovf;
  public g qwQ;
  private d qwR;
  public c qwS;
  private e qwT;
  f qwU;
  
  public b()
  {
    GMTrace.i(5158121504768L, 38431);
    this.qwR = new d();
    this.qwS = new c();
    this.ovf = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(5147115651072L, 38349);
        if (paramAnonymousInt != 4)
        {
          GMTrace.o(5147115651072L, 38349);
          return;
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5156242456576L, 38417);
            if (b.this.qwQ != null) {
              b.this.qwQ.in(false);
            }
            GMTrace.o(5156242456576L, 38417);
          }
        });
        GMTrace.o(5147115651072L, 38349);
      }
    };
    GMTrace.o(5158121504768L, 38431);
  }
  
  public static b bse()
  {
    GMTrace.i(5158255722496L, 38432);
    b localb2 = (b)at.AK().gZ("plugin.talkroom");
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = new b();
      at.AK().a("plugin.talkroom", localb1);
    }
    GMTrace.o(5158255722496L, 38432);
    return localb1;
  }
  
  public static g bsf()
  {
    GMTrace.i(5158389940224L, 38433);
    if (bse().qwQ == null) {
      bse().qwQ = new g();
    }
    g localg = bse().qwQ;
    GMTrace.o(5158389940224L, 38433);
    return localg;
  }
  
  public static e bsg()
  {
    GMTrace.i(5158524157952L, 38434);
    if (bse().qwT == null) {
      bse().qwT = new e();
    }
    e locale = bse().qwT;
    GMTrace.o(5158524157952L, 38434);
    return locale;
  }
  
  public static String bsh()
  {
    GMTrace.i(5158658375680L, 38435);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zn() + "talkroom/";
    GMTrace.o(5158658375680L, 38435);
    return (String)localObject;
  }
  
  public static f bsi()
  {
    GMTrace.i(5158792593408L, 38436);
    if (bse().qwU == null) {
      bse().qwU = new f();
    }
    f localf = bse().qwU;
    GMTrace.o(5158792593408L, 38436);
    return localf;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5159195246592L, 38439);
    d.c.a(Integer.valueOf(56), this.qwR);
    at.a(this.ovf);
    com.tencent.mm.pluginsdk.p.a.tlV = bsg();
    com.tencent.mm.pluginsdk.p.a.tlW = bsf();
    GMTrace.o(5159195246592L, 38439);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5159329464320L, 38440);
    GMTrace.o(5159329464320L, 38440);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5159061028864L, 38438);
    GMTrace.o(5159061028864L, 38438);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5159463682048L, 38441);
    d.c.aE(Integer.valueOf(56));
    at.b(this.ovf);
    com.tencent.mm.pluginsdk.p.a.tlV = null;
    com.tencent.mm.pluginsdk.p.a.tlW = null;
    if (this.qwQ != null)
    {
      this.qwQ.aKW();
      this.qwQ = null;
    }
    GMTrace.o(5159463682048L, 38441);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5158926811136L, 38437);
    GMTrace.o(5158926811136L, 38437);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */