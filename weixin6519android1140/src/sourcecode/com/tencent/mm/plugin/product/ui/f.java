package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.g.a.mb.b;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.plugin.product.b.i;
import com.tencent.mm.plugin.product.b.j;
import com.tencent.mm.plugin.product.b.l;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bz;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class f
  implements e
{
  static int gRb;
  public boolean nJA;
  public com.tencent.mm.plugin.product.b.c nJB;
  public a nJC;
  private com.tencent.mm.sdk.b.c nJD;
  public Activity nJy;
  public boolean nJz;
  
  static
  {
    GMTrace.i(6032147349504L, 44943);
    gRb = 0;
    GMTrace.o(6032147349504L, 44943);
  }
  
  public f(Activity paramActivity, a parama)
  {
    GMTrace.i(6030134083584L, 44928);
    this.nJz = false;
    this.nJA = false;
    this.nJD = new com.tencent.mm.sdk.b.c() {};
    this.nJy = paramActivity;
    com.tencent.mm.plugin.product.a.a.aWW();
    this.nJB = com.tencent.mm.plugin.product.a.a.aWX();
    this.nJC = parama;
    GMTrace.o(6030134083584L, 44928);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6030805172224L, 44933);
    w.d("MicroMsg.MallProductUI", "errCode: " + paramInt2 + ", errMsg: " + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.product.b.h))
      {
        paramk = (com.tencent.mm.plugin.product.b.h)paramk;
        this.nJB.a(paramk.nHY, paramk.nHZ);
        if (this.nJC != null) {
          this.nJC.o(paramInt1, paramInt2, paramString);
        }
        if (!bg.nm(paramk.nHY.nIc))
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11007, new Object[] { this.nJB.aXf(), paramk.nHY.nIc, Integer.valueOf(gRb), Integer.valueOf(1) });
          GMTrace.o(6030805172224L, 44933);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11007, new Object[] { this.nJB.aXf(), paramk.nHX, Integer.valueOf(gRb), Integer.valueOf(1) });
        GMTrace.o(6030805172224L, 44933);
        return;
      }
      Object localObject2;
      Object localObject1;
      if ((paramk instanceof j))
      {
        localObject2 = (j)paramk;
        paramString = this.nJB;
        paramk = ((j)localObject2).nHE;
        localObject1 = ((j)localObject2).nHP;
        localObject2 = ((j)localObject2).nHQ;
        paramString.nHE = paramk;
        paramString.nHQ = ((LinkedList)localObject2);
        paramString.nHP = ((LinkedList)localObject1);
        paramString.su(0);
        this.nJy.startActivity(new Intent(this.nJy, MallProductSubmitUI.class));
        com.tencent.mm.plugin.report.service.g.ork.i(11009, new Object[] { this.nJB.aXf(), this.nJB.nHC.nIc, Integer.valueOf(gRb), Integer.valueOf(1) });
        GMTrace.o(6030805172224L, 44933);
        return;
      }
      if (!(paramk instanceof com.tencent.mm.plugin.product.b.f))
      {
        if ((paramk instanceof l))
        {
          paramString = ((l)paramk).nIb;
          paramInt1 = 6;
          if (gRb == 7) {
            paramInt1 = 1001;
          }
          w.d("MicroMsg.MallProductUI", "payScene:" + paramInt1);
          com.tencent.mm.pluginsdk.wallet.g.a(this.nJy, paramString, this.nJB.getAppId(), paramInt1, 3);
          com.tencent.mm.sdk.b.a.vgX.b(this.nJD);
          GMTrace.o(6030805172224L, 44933);
          return;
        }
        if ((paramk instanceof com.tencent.mm.plugin.product.b.k))
        {
          com.tencent.mm.ui.base.h.bm(this.nJy, this.nJy.getString(a.i.sVV));
          aXx();
          GMTrace.o(6030805172224L, 44933);
          return;
        }
        if ((paramk instanceof com.tencent.mm.plugin.product.b.g)) {
          try
          {
            this.nJy.dismissDialog(55534);
            paramString = this.nJB;
            paramString.nHP = ((com.tencent.mm.plugin.product.b.g)paramk).nHP;
            paramString.su(0);
            GMTrace.o(6030805172224L, 44933);
            return;
          }
          catch (Exception paramString)
          {
            for (;;)
            {
              w.e("MicroMsg.MallProductUI", paramString.toString());
            }
          }
        }
        if ((paramk instanceof i)) {
          try
          {
            this.nJy.dismissDialog(55534);
            localObject2 = (i)paramk;
            paramk = this.nJB;
            localObject1 = ((i)localObject2).mUrl;
            localObject2 = ((i)localObject2).nIa;
            if ((!bg.nm((String)localObject1)) && (localObject2 != null) && (((LinkedList)localObject2).size() > 0))
            {
              if (paramk.nHT == null) {
                paramk.nHT = new HashMap();
              }
              paramk.nHT.put(localObject1, localObject2);
            }
            if (this.nJC != null) {
              this.nJC.o(paramInt1, paramInt2, paramString);
            }
            GMTrace.o(6030805172224L, 44933);
            return;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.MallProductUI", localException.toString());
            }
          }
        }
      }
    }
    else
    {
      switch (paramInt2)
      {
      default: 
        w.i("MicroMsg.MallProductUI", "unkown errCode " + paramInt2);
        paramk = paramString;
        if (bg.nm(paramString)) {
          paramk = paramInt2 + " : " + this.nJy.getString(a.i.sVL);
        }
        if (this.nJC != null) {
          this.nJC.o(paramInt1, paramInt2, paramk);
        }
        break;
      }
    }
    do
    {
      GMTrace.o(6030805172224L, 44933);
      return;
      w.i("MicroMsg.MallProductUI", "deal with MMBIZPAY_FUNC_ERR_NO_EXISTED_PRODUCT");
    } while (!(paramk instanceof com.tencent.mm.plugin.product.b.h));
    paramk = (com.tencent.mm.plugin.product.b.h)paramk;
    this.nJB.a(paramk.nHY, paramk.nHZ);
    if (this.nJC != null) {
      this.nJC.o(paramInt1, paramInt2, paramString);
    }
    GMTrace.o(6030805172224L, 44933);
  }
  
  public final void aXw()
  {
    GMTrace.i(6030536736768L, 44931);
    m localm = this.nJB.nHC;
    cf localcf = new cf();
    tt localtt = new tt();
    tw localtw = new tw();
    ts localts = new ts();
    localtw.QY(q.zE());
    localtw.QZ(q.zE());
    localtw.zZ(11);
    localtw.eE(bg.Pv());
    localts.QR(localm.nIg.name);
    localts.QS(this.nJB.aXq());
    localts.zW(localm.nId);
    localts.QU(this.nJB.a(localm));
    localts.QT(localm.aXs());
    localcf.eDv.title = localm.nIg.name;
    localcf.eDv.desc = this.nJB.aXq();
    localcf.eDv.eDx = localtt;
    localcf.eDv.type = 11;
    localtt.a(localtw);
    localtt.b(localts);
    localcf.eDv.activity = this.nJy;
    localcf.eDv.eDC = 5;
    com.tencent.mm.sdk.b.a.vgX.m(localcf);
    GMTrace.o(6030536736768L, 44931);
  }
  
  public final void aXx()
  {
    GMTrace.i(6030670954496L, 44932);
    Object localObject = com.tencent.mm.plugin.product.a.a.aWW().aWY();
    axt localaxt = this.nJB.aXe();
    if ((localaxt != null) && (!bg.nm(localaxt.lQf)) && (!localaxt.lQf.contains(";")))
    {
      ((d)localObject).nHU.remove(localaxt.lQf);
      ((d)localObject).nHU.add(localaxt.lQf);
      ((d)localObject).aXr();
    }
    localObject = new Intent(this.nJy, MallProductUI.class);
    ((Intent)localObject).putExtra("key_go_finish", true);
    ((Intent)localObject).addFlags(67108864);
    this.nJy.startActivity((Intent)localObject);
    GMTrace.o(6030670954496L, 44932);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6030939389952L, 44934);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(6030939389952L, 44934);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        this.nJB.S(paramIntent);
        if (this.nJC != null) {
          this.nJC.o(0, 0, "");
        }
        com.tencent.mm.kernel.h.xz();
        Object localObject = com.tencent.mm.kernel.h.xx().fYr;
        paramIntent = this.nJB;
        if (paramIntent.nHC != null) {}
        for (paramIntent = paramIntent.nHC.nIc;; paramIntent = "")
        {
          ((n)localObject).a(new com.tencent.mm.plugin.product.b.g(paramIntent, this.nJB.nHE, this.nJB.nHI), 0);
          GMTrace.o(6030939389952L, 44934);
          return;
        }
        localObject = new ss();
        ((ss)localObject).eYc.context = this.nJy;
        ((ss)localObject).eYc.result = paramInt1;
        ((ss)localObject).eYc.intent = paramIntent;
        this.nJD.a((com.tencent.mm.sdk.b.b)localObject);
        GMTrace.o(6030939389952L, 44934);
        return;
        if (this.nJC != null)
        {
          this.nJC.o(0, 0, "");
          GMTrace.o(6030939389952L, 44934);
          return;
          this.nJy.showDialog(55534);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(new i(this.nJB.nHE, this.nJB.nHL), 0);
          GMTrace.o(6030939389952L, 44934);
          return;
          if ((paramInt2 == -1) && (paramIntent != null))
          {
            this.nJB.S(paramIntent);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(new j(this.nJB.aXm(), gRb), 0);
          }
        }
      }
    }
  }
  
  public final void onStart()
  {
    GMTrace.i(6030268301312L, 44929);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(553, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(554, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(555, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(556, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(557, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(578, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(579, this);
    GMTrace.o(6030268301312L, 44929);
  }
  
  public final void onStop()
  {
    GMTrace.i(6030402519040L, 44930);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(553, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(554, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(555, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(556, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(557, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(578, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(579, this);
    GMTrace.o(6030402519040L, 44930);
  }
  
  public static abstract interface a
  {
    public abstract void o(int paramInt1, int paramInt2, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */