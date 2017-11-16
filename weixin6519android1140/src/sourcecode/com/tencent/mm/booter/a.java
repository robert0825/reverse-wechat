package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.ad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements ac
{
  private static volatile a fIy;
  private c fIA;
  private ap fIw;
  private ap.a fIx;
  private List<ad> fIz;
  
  private a()
  {
    GMTrace.i(502242738176L, 3742);
    this.fIz = new ArrayList();
    this.fIw = new ap();
    this.fIx = new ap.a()
    {
      public final void dR(int paramAnonymousInt)
      {
        GMTrace.i(495129198592L, 3689);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(495129198592L, 3689);
          return;
          w.v("MicroMsg.BackgroundPlayer", "call end");
          a.this.rh();
          GMTrace.o(495129198592L, 3689);
          return;
          w.v("MicroMsg.BackgroundPlayer", "call start");
          a.this.ri();
        }
      }
    };
    this.fIw.a(this.fIx);
    this.fIw.eA(ab.getContext());
    if (this.fIA == null) {
      this.fIA = new c() {};
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.fIA);
    GMTrace.o(502242738176L, 3742);
  }
  
  public static a rg()
  {
    GMTrace.i(18725923192832L, 139519);
    if (fIy == null) {}
    try
    {
      if (fIy == null) {
        fIy = new a();
      }
      a locala = fIy;
      GMTrace.o(18725923192832L, 139519);
      return locala;
    }
    finally {}
  }
  
  public final void a(ad paramad)
  {
    GMTrace.i(502376955904L, 3743);
    if (paramad != null)
    {
      w.d("MicroMsg.BackgroundPlayer", "add callback : %s", new Object[] { paramad.toString() });
      this.fIz.add(paramad);
    }
    GMTrace.o(502376955904L, 3743);
  }
  
  public final void b(ad paramad)
  {
    GMTrace.i(502511173632L, 3744);
    if (paramad != null) {
      this.fIz.remove(paramad);
    }
    GMTrace.o(502511173632L, 3744);
  }
  
  public final void rh()
  {
    GMTrace.i(502645391360L, 3745);
    if (this.fIz == null)
    {
      GMTrace.o(502645391360L, 3745);
      return;
    }
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((ad)localIterator.next()).Az();
    }
    GMTrace.o(502645391360L, 3745);
  }
  
  public final void ri()
  {
    GMTrace.i(502779609088L, 3746);
    if (this.fIz == null)
    {
      GMTrace.o(502779609088L, 3746);
      return;
    }
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((ad)localIterator.next()).AA();
    }
    GMTrace.o(502779609088L, 3746);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */