package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.c.c.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Map;

public final class g
  extends l.b
  implements com.tencent.mm.ad.e
{
  private static int oMR;
  public float fJn;
  public float fJo;
  private a.a fJt;
  private com.tencent.mm.modelgeo.c gxh;
  public int jtE;
  public int jzr;
  public boolean lOt;
  private ae mHandler;
  public String mdd;
  private long oMS;
  private c oNm;
  public e oNn;
  public boolean oNo;
  
  static
  {
    GMTrace.i(6522713145344L, 48598);
    oMR = 0;
    GMTrace.o(6522713145344L, 48598);
  }
  
  public g(l.a parama)
  {
    super(parama);
    GMTrace.i(6519626137600L, 48575);
    this.oNn = new e();
    this.oMS = 0L;
    this.mHandler = new ae();
    this.jtE = 0;
    this.mdd = "";
    this.lOt = false;
    this.oNo = false;
    this.fJn = -85.0F;
    this.fJo = -1000.0F;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15393833877504L, 114693);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15393833877504L, 114693);
          return true;
        }
        if ((g.this.fJn == -85.0F) && (g.this.fJo == -1000.0F))
        {
          g.this.fJn = paramAnonymousFloat2;
          g.this.fJo = paramAnonymousFloat1;
          m.bfq().fJn = g.this.fJn;
          m.bfq().fJo = g.this.fJo;
          if (g.this.oNo)
          {
            w.i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
            g.this.bft();
          }
        }
        GMTrace.o(15393833877504L, 114693);
        return false;
      }
    };
    GMTrace.o(6519626137600L, 48575);
  }
  
  private void aiU()
  {
    GMTrace.i(6520834097152L, 48584);
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    GMTrace.o(6520834097152L, 48584);
  }
  
  private void beW()
  {
    GMTrace.i(6520699879424L, 48583);
    this.gxh = com.tencent.mm.modelgeo.c.Ir();
    this.gxh.a(this.fJt, true);
    GMTrace.o(6520699879424L, 48583);
  }
  
  private void bfu()
  {
    GMTrace.i(6521102532608L, 48586);
    long l2 = System.currentTimeMillis() / 1000L;
    if (a.tO(oMR)) {
      w.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
    }
    for (long l1 = a.tP(oMR);; l1 = a.tQ(a.bfH()))
    {
      w.i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is " + l1);
      this.oMS = (l1 + l2);
      GMTrace.o(6521102532608L, 48586);
      return;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6520968314880L, 48585);
    if ((paramk instanceof c))
    {
      paramk = (c)paramk;
      paramString = this.oNn;
      paramk = paramk.oMQ;
      paramString.jzr = paramk.jzr;
      paramString.jxF = paramk.jxF;
      paramString.eTK = paramk.eTK;
      paramString.title = paramk.title;
      paramString.jxI = paramk.jxI;
      paramString.jxJ = paramk.jxJ;
      paramString.jyT = paramk.jyT;
      paramString.jxH = paramk.jxH;
      paramString.gjg = paramk.gjg;
      paramString.oMR = paramk.oMR;
      paramString.oMU = paramk.oMU;
      paramString.oMV = paramk.oMV;
      paramString.oMW = paramk.oMW;
      paramString.oMX = paramk.oMX;
      paramString.oMY = paramk.oMY;
      paramString.jxM = paramk.jxM;
      paramString.oMZ = paramk.oMZ;
      paramString.oNa = paramk.oNa;
      this.jzr = this.oNn.jzr;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.jzr + "  frequency_level:" + oMR + " control_flag:" + this.oNn.oMU);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label346;
      }
      oMR = this.oNn.oMR;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
      if (this.oMx != null) {
        this.oMx.a(1250, this.oNn, 1L);
      }
      bfu();
    }
    for (;;)
    {
      m.bfq().oMR = oMR;
      m.bfq().oMS = this.oMS;
      this.lOt = false;
      GMTrace.o(6520968314880L, 48585);
      return;
      label346:
      if (((paramInt1 == 5) && (paramInt2 == -1)) || ((paramInt1 == 4) && (paramInt2 != 0)))
      {
        w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.oMx != null) {
          this.oMx.a(1250, this.oNn, 2L);
        }
        long l1 = System.currentTimeMillis() / 1000L;
        long l2 = a.tQ(a.bfH());
        w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is " + l2);
        this.oMS = (l1 + l2);
      }
      else
      {
        w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.oMx != null) {
          this.oMx.a(1250, this.oNn, 2L);
        }
        bfu();
      }
    }
  }
  
  public final void beX()
  {
    GMTrace.i(6520565661696L, 48582);
    at.wS().b(1250, this);
    aiU();
    super.beX();
    GMTrace.o(6520565661696L, 48582);
  }
  
  public final void bft()
  {
    GMTrace.i(6520163008512L, 48579);
    if (this.lOt)
    {
      w.i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
      GMTrace.o(6520163008512L, 48579);
      return;
    }
    this.lOt = true;
    this.oNo = false;
    w.i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
    this.oNm = new c(this.fJo, this.fJn, this.jtE, this.mdd);
    at.wS().a(this.oNm, 0);
    GMTrace.o(6520163008512L, 48579);
  }
  
  public final void init()
  {
    GMTrace.i(6519760355328L, 48576);
    oMR = m.bfq().oMR;
    this.oMS = m.bfq().oMS;
    this.fJn = m.bfq().fJn;
    this.fJo = m.bfq().fJo;
    at.wS().a(1250, this);
    beW();
    GMTrace.o(6519760355328L, 48576);
  }
  
  public final void pause()
  {
    GMTrace.i(6520297226240L, 48580);
    aiU();
    GMTrace.o(6520297226240L, 48580);
  }
  
  public final void reset()
  {
    GMTrace.i(6519894573056L, 48577);
    if (this.oNm != null) {
      at.wS().c(this.oNm);
    }
    GMTrace.o(6519894573056L, 48577);
  }
  
  public final void resume()
  {
    GMTrace.i(6520431443968L, 48581);
    if (this.gxh != null) {
      this.gxh.a(this.fJt, true);
    }
    GMTrace.o(6520431443968L, 48581);
  }
  
  public final void start()
  {
    GMTrace.i(6520028790784L, 48578);
    init();
    reset();
    if (this.gxh == null) {
      beW();
    }
    this.gxh.b(this.fJt, true);
    Object localObject = m.bfq();
    if ((!TextUtils.isEmpty("key_shake_card_item")) && (((d)localObject).jxc.containsKey("key_shake_card_item"))) {}
    long l1;
    long l2;
    for (localObject = ((d)localObject).jxc.get("key_shake_card_item");; localObject = null)
    {
      l1 = System.currentTimeMillis() / 1000L;
      l2 = this.oMS;
      if ((localObject == null) || (!(localObject instanceof e))) {
        break;
      }
      localObject = (e)localObject;
      this.oMx.a(1250, (e)localObject, 1L);
      m.bfq().putValue("key_shake_card_item", null);
      w.i("MicroMsg.ShakeCardService", "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok");
      GMTrace.o(6520028790784L, 48578);
      return;
    }
    int i;
    if (this.oMS == 0L) {
      i = 1;
    }
    while (i != 0) {
      if (this.lOt)
      {
        w.i("MicroMsg.ShakeCardService", "ShakeCardService is doing netscene, return");
        GMTrace.o(6520028790784L, 48578);
        return;
        if (l1 - l2 >= 0L)
        {
          i = 1;
        }
        else
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11666, new Object[] { Integer.valueOf(this.jtE) });
          this.mHandler.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6524055322624L, 48608);
              g.this.oNn.jzr = 3;
              g.this.jzr = g.this.oNn.jzr;
              g.this.oNn.oMY = m.bfq().oMT;
              if (g.a(g.this) != null) {
                g.b(g.this).a(1250, g.this.oNn, 2L);
              }
              GMTrace.o(6524055322624L, 48608);
            }
          }, 3000L);
          w.i("MicroMsg.ShakeCardService", "ShakeCardService do not doNetSceneShakeCard, because time is not expire");
          i = 0;
        }
      }
      else
      {
        if ((this.fJn == -85.0F) || (this.fJo == -1000.0F))
        {
          this.oNo = true;
          w.i("MicroMsg.ShakeCardService", "ShakeCardService location is not geted, wait 4 second");
          this.mHandler.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6523652669440L, 48605);
              if (!g.this.lOt) {
                g.this.bft();
              }
              GMTrace.o(6523652669440L, 48605);
            }
          }, 4000L);
          GMTrace.o(6520028790784L, 48578);
          return;
        }
        bft();
      }
    }
    GMTrace.o(6520028790784L, 48578);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\c\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */