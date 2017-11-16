package com.tencent.mm.plugin.shake.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.List;

public final class c
  extends l.b
  implements com.tencent.mm.ad.e
{
  private Context context;
  public float fJn;
  public float fJo;
  private a.a fJt;
  public com.tencent.mm.modelgeo.c gxh;
  public boolean oMj;
  public b oMk;
  public a oMl;
  private int oMm;
  public ae oMn;
  public Runnable oMo;
  public int oyS;
  public int oyT;
  public boolean oyW;
  
  public c(Context paramContext, l.a parama)
  {
    super(parama);
    GMTrace.i(6508754501632L, 48494);
    this.fJn = -85.0F;
    this.fJo = -1000.0F;
    this.oyS = 1;
    this.oyT = 64536;
    this.oyW = false;
    this.oMj = true;
    this.oMm = 0;
    this.oMn = new ae();
    this.oMo = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6500164567040L, 48430);
        if ((c.this.oMn != null) && (c.this.oMo != null)) {
          c.this.oMn.removeCallbacks(c.this.oMo);
        }
        if (c.this.oMl != null) {
          at.wS().c(c.this.oMl);
        }
        if ((c.this.oMk != null) && (c.this.oMk.eWZ != null)) {
          c.this.oMl = new a(c.this.oMk.eWZ);
        }
        if (c.this.oMl != null) {
          at.wS().a(c.this.oMl, 0);
        }
        GMTrace.o(6500164567040L, 48430);
      }
    };
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15393699659776L, 114692);
        com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.Mk();
        boolean bool1;
        if (paramAnonymousInt == 0)
        {
          bool1 = false;
          if (c.this.gxh != null) {
            break label116;
          }
        }
        label116:
        for (boolean bool2 = false;; bool2 = c.this.gxh.gET)
        {
          locale.a(2002, bool1, bool2, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          w.i("MicroMsg.ShakeFriendService", "getlocaion lat %f lng %f hasGetLbsInfo " + c.this.oyW, new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
          if (paramAnonymousBoolean) {
            break label131;
          }
          GMTrace.o(15393699659776L, 114692);
          return true;
          bool1 = true;
          break;
        }
        label131:
        if ((c.this.oMj) && (c.this.fJn == -85.0F) && (c.this.fJo == -1000.0F))
        {
          c.this.oMj = false;
          c.this.fJn = paramAnonymousFloat2;
          c.this.fJo = paramAnonymousFloat1;
          c.this.oyT = ((int)paramAnonymousDouble2);
          c.this.oyS = paramAnonymousInt;
          c.this.oyW = true;
        }
        GMTrace.o(15393699659776L, 114692);
        return false;
      }
    };
    this.context = paramContext;
    GMTrace.o(6508754501632L, 48494);
  }
  
  private void beW()
  {
    GMTrace.i(6509157154816L, 48497);
    this.gxh = com.tencent.mm.modelgeo.c.Ir();
    this.oMj = true;
    this.gxh.a(this.fJt, true);
    GMTrace.o(6509157154816L, 48497);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6509828243456L, 48502);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(6509828243456L, 48502);
      return;
      paramString = (b)paramk;
      if ((paramString.beV() == 3) || (paramString.beV() == 4))
      {
        w.v("MicroMsg.ShakeFriendService", "onSceneEnd ignore location report response");
        GMTrace.o(6509828243456L, 48502);
        return;
      }
      if ((paramInt2 != 0) || (paramInt1 != 0) || (paramString.ret != 0))
      {
        w.e("MicroMsg.ShakeFriendService", "onSceneEnd reprot failed");
        this.oMx.d(null, 3L);
        GMTrace.o(6509828243456L, 48502);
        return;
      }
      this.oMn.postDelayed(this.oMo, 3000L);
      GMTrace.o(6509828243456L, 48502);
      return;
      paramString = (a)paramk;
      if ((paramInt2 != 0) || (paramInt1 != 0) || (paramString.ret != 0))
      {
        this.oMx.d(null, 3L);
        GMTrace.o(6509828243456L, 48502);
        return;
      }
      paramString = paramString.oMh;
      if (paramString.size() == 0)
      {
        w.i("MicroMsg.ShakeFriendService", "empty shake get list");
        this.oMx.d(null, 3L);
        GMTrace.o(6509828243456L, 48502);
        return;
      }
      this.oMx.d(paramString, 1L);
      GMTrace.o(6509828243456L, 48502);
      return;
      paramString = (com.tencent.mm.plugin.shake.c.a.b)paramk;
      if ((paramInt2 != 0) || (paramInt1 != 0))
      {
        if (this.oMx != null)
        {
          this.oMx.a(1251, null, 2L);
          GMTrace.o(6509828243456L, 48502);
        }
      }
      else if (this.oMx != null) {
        this.oMx.a(1251, paramString.oMQ, 1L);
      }
    }
  }
  
  public final void beX()
  {
    GMTrace.i(6509694025728L, 48501);
    super.beX();
    at.wS().b(161, this);
    at.wS().b(162, this);
    at.wS().b(1251, this);
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    GMTrace.o(6509694025728L, 48501);
  }
  
  public final void init()
  {
    GMTrace.i(6508888719360L, 48495);
    at.wS().a(161, this);
    at.wS().a(162, this);
    at.wS().a(1251, this);
    beW();
    GMTrace.o(6508888719360L, 48495);
  }
  
  public final void pause()
  {
    GMTrace.i(6509425590272L, 48499);
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    GMTrace.o(6509425590272L, 48499);
  }
  
  public final void reset()
  {
    GMTrace.i(6509291372544L, 48498);
    if (this.oMk != null) {
      at.wS().c(this.oMk);
    }
    if (this.oMl != null) {
      at.wS().c(this.oMl);
    }
    if ((this.oMn != null) && (this.oMo != null)) {
      this.oMn.removeCallbacks(this.oMo);
    }
    GMTrace.o(6509291372544L, 48498);
  }
  
  public final void resume()
  {
    GMTrace.i(6509559808000L, 48500);
    if (this.gxh != null) {
      this.gxh.a(this.fJt, true);
    }
    GMTrace.o(6509559808000L, 48500);
  }
  
  public final void start()
  {
    GMTrace.i(6509022937088L, 48496);
    reset();
    init();
    this.oMk = new b(this.fJo, this.fJn, this.oyT, this.oyS, "", "");
    at.wS().a(this.oMk, 0);
    if (!this.oyW)
    {
      if (this.gxh == null) {
        beW();
      }
      this.gxh.b(this.fJt, true);
    }
    if (this.oMm <= 0) {}
    for (this.oMm += 1;; this.oMm = 0)
    {
      w.i("MicroMsg.ShakeFriendService", "do doGetLbsCard");
      com.tencent.mm.plugin.shake.c.a.b localb = new com.tencent.mm.plugin.shake.c.a.b(this.fJo, this.fJn);
      at.wS().a(localb, 0);
      GMTrace.o(6509022937088L, 48496);
      return;
      if ((this.oMm > 0) && (this.oMm <= 10))
      {
        this.oMm += 1;
        GMTrace.o(6509022937088L, 48496);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */