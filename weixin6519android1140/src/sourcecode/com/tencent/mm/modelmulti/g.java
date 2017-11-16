package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.zero.c;
import com.tencent.mm.protocal.c.aqd;
import com.tencent.mm.protocal.c.aqe;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.LinkedList;
import java.util.Queue;
import junit.framework.Assert;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.e fUd;
  public final Queue<a> gFB;
  f gIl;
  public boolean gLX;
  public com.tencent.mm.compatible.util.g.a gMa;
  private StringBuilder gMb;
  final aqd gMl;
  public int gMm;
  public boolean gMn;
  public int gMo;
  public int gMp;
  private final aj gsj;
  private int retryCount;
  
  public g(f paramf)
  {
    GMTrace.i(13446871515136L, 100187);
    this.gIl = null;
    this.gMl = new aqd();
    this.gMb = new StringBuilder();
    this.gMm = 0;
    this.gMn = false;
    this.gMo = 0;
    this.gMp = 0;
    this.retryCount = 3;
    this.gLX = false;
    this.gFB = new LinkedList();
    this.gsj = new aj(h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13435597225984L, 100103);
        if ((!h.xw().wL()) || (a.wF()))
        {
          w.e("MicroMsg.NetSceneInit.dkInit", "acc is not ready stop handle resp");
          GMTrace.o(13435597225984L, 100103);
          return false;
        }
        if (g.this.gLX)
        {
          w.w("MicroMsg.NetSceneInit.dkInit", "Init CANCELED hash:%d", new Object[] { Integer.valueOf(g.this.hashCode()) });
          GMTrace.o(13435597225984L, 100103);
          return false;
        }
        if (g.this.gFB.isEmpty())
        {
          w.v("MicroMsg.NetSceneInit.dkInit", "queue maybe this time is null , wait doscene!");
          GMTrace.o(13435597225984L, 100103);
          return false;
        }
        w.i("MicroMsg.NetSceneInit.dkInit", "pusher hash:%d time:%d list:%d [%d/%b,%d/%d]", new Object[] { Integer.valueOf(g.this.hashCode()), Long.valueOf(g.this.gMa.tD()), Integer.valueOf(g.this.gFB.size()), Integer.valueOf(g.this.gMm), Boolean.valueOf(g.this.gMn), Integer.valueOf(g.this.gMp), Integer.valueOf(g.this.gMo) });
        h.xz();
        long l = h.xy().fYV.cE(Thread.currentThread().getId());
        Object localObject1 = new c();
        ((c)localObject1).bc("NetSceneInit");
        int i;
        int j;
        label281:
        final Object localObject2;
        boolean bool;
        label325:
        Object localObject3;
        if (g.this.gMn)
        {
          i = 40;
          j = 0;
          if (j >= i) {
            break label1024;
          }
          localObject2 = (g.a)g.this.gFB.peek();
          if (((g.a)localObject2).gMu != Integer.MAX_VALUE) {
            break label647;
          }
          if (((g.a)localObject2).gMt != null) {
            break label641;
          }
          bool = true;
          Assert.assertTrue("in Queue tail , resp should be null", bool);
          h.xz();
          localObject3 = (String)h.xy().xh().get(8198, null);
          h.xz();
          h.xy().xh().set(8195, localObject3);
          ab.getContext().getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", (String)localObject3).commit();
          h.xz();
          h.xy().xh().set(8197, "");
          h.xz();
          h.xy().xh().set(8198, "");
          h.xz();
          h.xy().xh().set(15, Integer.valueOf(1));
          h.xz();
          h.xy().xh().kL(true);
          w.i("MicroMsg.NetSceneInit.dkInit", "INIT DONE: hash:%d time:%d netCnt:%d cmdCnt:%d err:[%d,%d] ", new Object[] { Integer.valueOf(g.this.hashCode()), Long.valueOf(g.this.gMa.tD()), Integer.valueOf(g.this.gMm), Integer.valueOf(g.this.gMo), Integer.valueOf(((g.a)localObject2).errType), Integer.valueOf(((g.a)localObject2).errCode) });
          h.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(13437610491904L, 100118);
              g.this.fUd.a(localObject2.errType, localObject2.errCode, localObject2.eAR, g.this);
              GMTrace.o(13437610491904L, 100118);
            }
          });
          bool = false;
        }
        for (;;)
        {
          ((c)localObject1).bd("NetSceneInit");
          h.xz();
          h.xy().fYV.aL(l);
          localObject1 = g.this;
          if (((g)localObject1).gIl == null)
          {
            w.w("MicroMsg.NetSceneInit.dkInit", "dkinit doProgressCallBack progress is null");
            GMTrace.o(13435597225984L, 100103);
            return bool;
            i = 10;
            break;
            label641:
            bool = false;
            break label325;
            label647:
            localObject3 = ((g.a)localObject2).gMt.uGd;
            if ((localObject3 != null) && (((LinkedList)localObject3).size() > ((g.a)localObject2).gFO))
            {
              ((LinkedList)localObject3).size();
              if (((c)localObject1).a((nk)((LinkedList)localObject3).get(((g.a)localObject2).gFO), true)) {}
            }
            else
            {
              g.this.gFB.poll();
              h.xz();
              h.xy().xh().set(8197, bg.bs(n.a(((g.a)localObject2).gMt.uFZ)));
              h.xz();
              h.xy().xh().set(8198, bg.bs(n.a(((g.a)localObject2).gMt.uGa)));
              h.xz();
              h.xy().xh().set(16, Integer.valueOf(0));
              h.xz();
              h.xy().xh().set(8196, Long.valueOf(((g.a)localObject2).gMt.uGb));
              h.xz();
              h.xy().xh().kL(true);
              bool = true;
              continue;
            }
            ((g.a)localObject2).gFO += 1;
            localObject2 = g.this;
            ((g)localObject2).gMp += 1;
            j += 1;
            break label281;
          }
          label895:
          float f1;
          if (((g)localObject1).gMm > 50)
          {
            i = 50;
            if (((g)localObject1).gMn) {
              break label984;
            }
            f1 = 1.0F;
          }
          for (j = i;; j = (int)((100 - i) * f1 + i))
          {
            w.d("MicroMsg.NetSceneInit.dkInit", "doProgressCallBack index:%d sum:%d ratiocmd:%f ratioDoScene:%d", new Object[] { Integer.valueOf(((g)localObject1).gMp), Integer.valueOf(((g)localObject1).gMo), Float.valueOf(f1), Integer.valueOf(i) });
            ((g)localObject1).gIl.a(j, 100, (com.tencent.mm.ad.k)localObject1);
            break;
            i = ((g)localObject1).gMm;
            break label895;
            label984:
            float f2 = ((g)localObject1).gMp / ((g)localObject1).gMo;
            f1 = f2;
            if (f2 > 1.0F) {
              f1 = 1.0F;
            }
          }
          label1024:
          bool = true;
        }
      }
    }, true);
    w.i("MicroMsg.NetSceneInit.dkInit", "NetSceneInit hash:%d stack:%s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    this.gMb.append("stack:" + bg.bQW() + " time:" + bg.Pu());
    this.gIl = paramf;
    GMTrace.o(13446871515136L, 100187);
  }
  
  private int a(com.tencent.mm.network.e parame, azp paramazp1, azp paramazp2)
  {
    GMTrace.i(13447139950592L, 100189);
    this.gMb.append(" lastd:" + this.gtX + " dotime:" + bg.Pu() + " net:" + am.getNetType(ab.getContext()));
    b localb = new b();
    azp localazp = paramazp1;
    if (paramazp1 == null)
    {
      h.xz();
      localazp = n.H(bg.St(bg.nl((String)h.xy().xh().get(8197, null))));
    }
    paramazp1 = paramazp2;
    if (paramazp2 == null)
    {
      h.xz();
      paramazp1 = n.H(bg.St(bg.nl((String)h.xy().xh().get(8198, null))));
    }
    h.xz();
    if ((bg.e((Integer)h.xy().xh().get(16, null)) != 0) && ((localazp == null) || (localazp.uNN <= 0))) {
      localb.DC().tKm = 7;
    }
    for (;;)
    {
      this.gMl.uFZ = localazp;
      this.gMl.uGa = paramazp1;
      ((v.a)localb.DC()).tKR = this.gMl;
      w.i("MicroMsg.NetSceneInit.dkInit", "doScene hash:%d time:%d count:%d user%s lan:%s status:%d cur[%s] max[%s]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.gMa.tD()), Integer.valueOf(this.gMm), this.gMl.jhi, this.gMl.kBh, Integer.valueOf(localb.DC().tKm), bg.bs(n.a(localazp)), bg.bs(n.a(paramazp1)) });
      this.gMm += 1;
      int i = a(parame, localb, this);
      GMTrace.o(13447139950592L, 100189);
      return i;
      h.xz();
      if (bg.nl((String)h.xy().xh().get(8195, null)).length() <= 0) {
        localb.DC().tKm = 3;
      } else {
        localb.DC().tKm = 4;
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aqe paramaqe)
  {
    GMTrace.i(13447676821504L, 100193);
    a locala = new a();
    locala.gMu = paramInt1;
    locala.errCode = paramInt3;
    locala.errType = paramInt2;
    locala.eAR = paramString;
    locala.gMt = paramaqe;
    this.gFB.add(locala);
    if (this.gsj.bQn()) {
      this.gsj.z(50L, 50L);
    }
    GMTrace.o(13447676821504L, 100193);
  }
  
  public final boolean DE()
  {
    GMTrace.i(13447408386048L, 100191);
    GMTrace.o(13447408386048L, 100191);
    return true;
  }
  
  public final boolean DF()
  {
    GMTrace.i(15694481588224L, 116933);
    boolean bool = super.DF();
    GMTrace.o(15694481588224L, 116933);
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13447005732864L, 100188);
    this.gMa = new com.tencent.mm.compatible.util.g.a();
    this.fUd = parame1;
    parame1 = this.gMl;
    h.xz();
    parame1.jhi = ((String)h.xy().xh().get(2, null));
    if (!bg.nm(this.gMl.jhi)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("by DK: req.UserName is null", bool);
      this.gMl.kBh = v.bPK();
      int i = a(parame, null, null);
      GMTrace.o(13447005732864L, 100188);
      return i;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(13448079474688L, 100196);
    int i = k.b.gum;
    GMTrace.o(13448079474688L, 100196);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13447274168320L, 100190);
    this.gMb.append(" endtime:" + bg.Pu());
    w.i("MicroMsg.NetSceneInit.dkInit", "summerinit onGYNetEnd [%d, %d, %s], tid:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(paramInt1) });
    if ((paramInt2 == 4) && (paramInt3 == -100))
    {
      w.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR hash:%d [%d,%d] KICK OUT : %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      this.gLX = true;
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13447274168320L, 100190);
      return;
    }
    if (((paramInt2 != 0) || (paramInt3 != 0)) && ((paramInt2 != 4) || (paramInt3 != -17)))
    {
      w.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR retry:%d hash:%d [%d,%d] %s", new Object[] { Integer.valueOf(this.retryCount), Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      if (this.retryCount > 0)
      {
        this.retryCount -= 1;
        if (a(this.gtW, null, null) != -1) {}
      }
      else
      {
        this.gLX = true;
        this.fUd.a(3, -1, "", this);
      }
      GMTrace.o(13447274168320L, 100190);
      return;
    }
    paramq = ((v.b)paramq.AZ()).tKS;
    this.gMo += paramq.uGc;
    w.i("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd hash:%d [%d,%d] time:%d cmdSum:%d doscenecount:%d conFlag:%d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(this.gMa.tD()), Integer.valueOf(this.gMo), Integer.valueOf(this.gMm), Integer.valueOf(paramq.tXv) });
    a(this.gMm - 1, paramInt2, paramInt3, paramString, paramq);
    if (((paramq.tXv & 0x7) != 0) && (!super.DF()))
    {
      if (a(this.gtW, paramq.uFZ, paramq.uGa) == -1)
      {
        w.e("MicroMsg.NetSceneInit.dkInit", "doScene Failed stop init");
        a(Integer.MAX_VALUE, 3, -1, "", null);
        GMTrace.o(13447274168320L, 100190);
      }
    }
    else
    {
      w.i("MicroMsg.NetSceneInit.dkInit", "NETWORK FINISH onGYNetEnd hash:%d time:%d netCnt:%d", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.gMa.tD()), Integer.valueOf(this.gMm) });
      this.gMn = true;
      a(Integer.MAX_VALUE, 0, 0, "", null);
    }
    GMTrace.o(13447274168320L, 100190);
  }
  
  protected final void cancel()
  {
    GMTrace.i(13447542603776L, 100192);
    w.w("MicroMsg.NetSceneInit.dkInit", "init cancel by :%s", new Object[] { bg.bQW() });
    super.cancel();
    this.gLX = true;
    GMTrace.o(13447542603776L, 100192);
  }
  
  public final String getInfo()
  {
    GMTrace.i(13447811039232L, 100194);
    String str = this.gMb.toString();
    GMTrace.o(13447811039232L, 100194);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(13448347910144L, 100198);
    GMTrace.o(13448347910144L, 100198);
    return 139;
  }
  
  protected final int vB()
  {
    GMTrace.i(13447945256960L, 100195);
    GMTrace.o(13447945256960L, 100195);
    return 500;
  }
  
  final class a
  {
    String eAR;
    int errCode;
    int errType;
    int gFO;
    aqe gMt;
    int gMu;
    
    a()
    {
      GMTrace.i(13450898046976L, 100217);
      this.gFO = 0;
      this.gMu = 0;
      GMTrace.o(13450898046976L, 100217);
    }
  }
  
  public static final class b
    extends i
  {
    private final v.a gMv;
    private final v.b gMw;
    
    public b()
    {
      GMTrace.i(13451032264704L, 100218);
      this.gMv = new v.a();
      this.gMw = new v.b();
      GMTrace.o(13451032264704L, 100218);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(13451166482432L, 100219);
      v.a locala = this.gMv;
      GMTrace.o(13451166482432L, 100219);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(13451300700160L, 100220);
      v.b localb = this.gMw;
      GMTrace.o(13451300700160L, 100220);
      return localb;
    }
    
    public final int getType()
    {
      GMTrace.i(13451434917888L, 100221);
      GMTrace.o(13451434917888L, 100221);
      return 139;
    }
    
    public final String getUri()
    {
      GMTrace.i(13451569135616L, 100222);
      GMTrace.o(13451569135616L, 100222);
      return "/cgi-bin/micromsg-bin/newinit";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */