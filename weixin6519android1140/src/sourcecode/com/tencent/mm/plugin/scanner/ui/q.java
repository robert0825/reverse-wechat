package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.modelsimple.aa.b;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.tools.r;
import com.tencent.mm.protocal.c.aua;
import com.tencent.mm.protocal.c.azz;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Map;

@bj(cua={BaseScanUI.class})
public final class q
  extends i
  implements com.tencent.mm.ad.e, b.a
{
  private static int oyc;
  public float fJn;
  public float fJo;
  private a.a fJt;
  private com.tencent.mm.modelgeo.c gxh;
  public boolean gxk;
  public TextView ouQ;
  public int oyS;
  public int oyT;
  public String oyU;
  public String oyV;
  public boolean oyW;
  float oyX;
  public boolean oyY;
  private boolean oyZ;
  private final int oyi;
  private final int oyj;
  private final int oym;
  private final int oyn;
  boolean oza;
  private a ozb;
  protected ae ozc;
  float pitch;
  
  static
  {
    GMTrace.i(6065835999232L, 45194);
    oyc = 300;
    GMTrace.o(6065835999232L, 45194);
  }
  
  public q(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint);
    GMTrace.i(6062077902848L, 45166);
    this.oyi = 260;
    this.oyj = 300;
    this.oym = 220;
    this.oyn = 240;
    this.oyW = false;
    this.oyX = -10000.0F;
    this.pitch = -10000.0F;
    this.oyY = false;
    this.oyZ = false;
    this.oza = false;
    this.gxk = false;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15373164347392L, 114539);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15373164347392L, 114539);
          return true;
        }
        q.this.fJn = paramAnonymousFloat2;
        q.this.fJo = paramAnonymousFloat1;
        q.this.oyT = ((int)paramAnonymousDouble2);
        q.this.oyU = "";
        q.this.oyV = "";
        q.this.oyS = paramAnonymousInt;
        q.this.oyW = true;
        Object localObject = q.this;
        if ((!((q)localObject).oyW) || (((q)localObject).oyY) || (((q)localObject).oza)) {}
        for (;;)
        {
          if (!q.this.gxk)
          {
            q.this.gxk = true;
            com.tencent.mm.modelstat.n.a(2012, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          }
          GMTrace.o(15373164347392L, 114539);
          return false;
          ((q)localObject).oza = true;
          aua localaua = new aua();
          localaua.ujd = ((q)localObject).oyV;
          localaua.uje = ((q)localObject).oyS;
          localaua.tYz = ((q)localObject).fJn;
          localaua.tYy = ((q)localObject).fJo;
          localaua.ujc = ((q)localObject).oyU;
          localaua.ujb = ((q)localObject).oyT;
          if (at.AU())
          {
            localObject = new aa(localaua, ((q)localObject).oyX, ((q)localObject).pitch);
            at.wS().a((k)localObject, 0);
          }
        }
      }
    };
    this.ozc = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6153345957888L, 45846);
        if (q.this.ouQ != null)
        {
          q.this.oxQ.gZ(true);
          q.this.ouQ.setText(R.l.dVQ);
          q.this.ouQ.setVisibility(0);
        }
        GMTrace.o(6153345957888L, 45846);
      }
    };
    if (!com.tencent.mm.compatible.d.c.sG())
    {
      cP(260, 300);
      GMTrace.o(6062077902848L, 45166);
      return;
    }
    cP(220, 240);
    GMTrace.o(6062077902848L, 45166);
  }
  
  private void bdd()
  {
    GMTrace.i(6062883209216L, 45172);
    if (this.oxQ == null)
    {
      w.e("MicroMsg.scanner.ScanModeStreetView", "dealWithNetWork(), scanUICallback == null");
      GMTrace.o(6062883209216L, 45172);
      return;
    }
    if (this.oyZ)
    {
      this.oxQ.gZ(true);
      GMTrace.o(6062883209216L, 45172);
      return;
    }
    if ((at.AU()) && ((at.wS().DN() == 6) || (at.wS().DN() == 4)))
    {
      this.oxQ.i(0L, false);
      if (this.gxh == null)
      {
        if (this.oxQ == null)
        {
          w.w("MicroMsg.scanner.ScanModeStreetView", "initLBS(), scanUICallback == null");
          GMTrace.o(6062883209216L, 45172);
          return;
        }
        if (this.gxh == null) {
          this.gxh = com.tencent.mm.modelgeo.c.Ir();
        }
        this.fJn = -85.0F;
        this.fJo = -1000.0F;
        this.oyT = 64536;
        this.oyS = 1;
        this.oyU = "";
        this.oyV = "";
        this.gxh.a(this.fJt, true);
      }
    }
    GMTrace.o(6062883209216L, 45172);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(6064091168768L, 45181);
    GMTrace.o(6064091168768L, 45181);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6063285862400L, 45175);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeStreetView", "onSceneEnd(), scanUICallback == null");
      GMTrace.o(6063285862400L, 45175);
      return;
    }
    this.oza = false;
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(6063285862400L, 45175);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.scanner.ScanModeStreetView", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        GMTrace.o(6063285862400L, 45175);
        return;
      }
      this.oza = true;
      paramString = ((aa)paramk).LJ();
      if ((paramString == null) || (paramString.tWx == null))
      {
        w.d("MicroMsg.scanner.ScanModeStreetView", "resp null");
        GMTrace.o(6063285862400L, 45175);
        return;
      }
      w.d("MicroMsg.scanner.ScanModeStreetView", "onSceneEnd() errType = [%s], errCode = [%s], resp.Type=[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramString.jib) });
      if (paramString.jib == 0)
      {
        paramString = aa.lr(paramString.tWx);
        if (bg.nm(paramString))
        {
          w.e("MicroMsg.scanner.ScanModeStreetView", "SCAN_STREET_VIEW_TYPE_STREETVIEW url is null");
          GMTrace.o(6063285862400L, 45175);
          return;
        }
        if (this.ozb == null) {
          this.ozb = new a();
        }
        this.ozb.url = paramString;
        af.F(this.ozb);
        af.i(this.ozb, 800L);
        GMTrace.o(6063285862400L, 45175);
        return;
      }
      if (paramString.jib == 2)
      {
        if ((this.ozc == null) || (this.oyY))
        {
          GMTrace.o(6063285862400L, 45175);
          return;
        }
        this.ozc.removeMessages(0);
        this.ozc.sendEmptyMessageDelayed(0, 1000L);
        GMTrace.o(6063285862400L, 45175);
        return;
      }
      if (paramString.jib == 1) {
        try
        {
          paramString = paramString.tWx;
          if (paramString != null)
          {
            paramString = bh.q(paramString, "recommend");
            if (paramString != null)
            {
              paramk = aa.b.e(paramString, ".recommend");
              aa.b localb = new aa.b();
              localb.title = bg.nl((String)paramString.get(".recommend.title"));
              localb.desc = bg.nl((String)paramString.get(".recommend.desc"));
              localb.gVg = paramk;
            }
          }
          GMTrace.o(6063285862400L, 45175);
          return;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.scanner.ScanModeStreetView", paramString, "", new Object[0]);
          w.e("MicroMsg.scanner.ScanModeStreetView", "MM_SCAN_STREET_VIEW_TYPE_RECOMMEND， [%s]", new Object[] { paramString.getMessage() });
        }
      }
    }
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6063017426944L, 45173);
    GMTrace.o(6063017426944L, 45173);
  }
  
  protected final int bcA()
  {
    GMTrace.i(6063688515584L, 45178);
    int i = oyc;
    GMTrace.o(6063688515584L, 45178);
    return i;
  }
  
  protected final void bcB()
  {
    GMTrace.i(6062346338304L, 45168);
    h(new Rect(0, 0, 0, 0));
    this.oxQ.b(4, null);
    onResume();
    GMTrace.o(6062346338304L, 45168);
  }
  
  protected final boolean bcC()
  {
    GMTrace.i(6063822733312L, 45179);
    GMTrace.o(6063822733312L, 45179);
    return true;
  }
  
  protected final boolean bcD()
  {
    GMTrace.i(6063956951040L, 45180);
    GMTrace.o(6063956951040L, 45180);
    return true;
  }
  
  public final void bct()
  {
    GMTrace.i(6063151644672L, 45174);
    GMTrace.o(6063151644672L, 45174);
  }
  
  protected final void bcx()
  {
    GMTrace.i(6062748991488L, 45171);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeStreetView", "handleNetworkChange(), scanUICallback == null");
      GMTrace.o(6062748991488L, 45171);
      return;
    }
    bdd();
    GMTrace.o(6062748991488L, 45171);
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bcy()
  {
    GMTrace.i(6062614773760L, 45170);
    GMTrace.o(6062614773760L, 45170);
    return null;
  }
  
  protected final int bcz()
  {
    GMTrace.i(6062480556032L, 45169);
    int i = R.i.cFl;
    GMTrace.o(6062480556032L, 45169);
    return i;
  }
  
  protected final void h(Rect paramRect)
  {
    GMTrace.i(6062212120576L, 45167);
    this.ouQ = ((TextView)this.oxQ.findViewById(R.h.bZG));
    this.ouQ.setText(R.l.dVy);
    this.iuc = ((TextView)this.oxQ.findViewById(R.h.bZJ));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iuc.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.a(this.oxQ.bcT(), 13.0F));
      this.iuc.setLayoutParams(localLayoutParams);
    }
    if (com.tencent.mm.compatible.d.c.sG()) {
      this.iuc.setPadding(BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.iuc.getPaddingTop(), BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.iuc.getPaddingBottom());
    }
    bdd();
    hb(true);
    GMTrace.o(6062212120576L, 45167);
  }
  
  protected final void onPause()
  {
    GMTrace.i(6063554297856L, 45177);
    this.oyY = true;
    hb(false);
    if (at.AU()) {
      at.wS().b(424, this);
    }
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    if (this.ozc != null) {
      this.ozc.removeMessages(0);
    }
    GMTrace.o(6063554297856L, 45177);
  }
  
  protected final void onResume()
  {
    GMTrace.i(6063420080128L, 45176);
    if (at.AU()) {
      at.wS().a(424, this);
    }
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeStreetView", "scanUICallback == null");
      GMTrace.o(6063420080128L, 45176);
      return;
    }
    bdd();
    GMTrace.o(6063420080128L, 45176);
  }
  
  private final class a
    implements Runnable
  {
    String url;
    
    public a()
    {
      GMTrace.i(6083284303872L, 45324);
      GMTrace.o(6083284303872L, 45324);
    }
    
    public final void run()
    {
      GMTrace.i(6083418521600L, 45325);
      if ((q.this.oxQ == null) || (q.this.oyY))
      {
        GMTrace.o(6083418521600L, 45325);
        return;
      }
      r.a(new com.tencent.mm.pluginsdk.ui.tools.e());
      Intent localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("jsapi_args_appid", "wx751a1acca5688ba3");
      localIntent.putExtra("jsapiargs", localBundle);
      localIntent.putExtra("rawUrl", this.url);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("title", R.l.dVh);
      localIntent.putExtra("webview_bg_color_rsID", R.e.black);
      localIntent.putExtra("geta8key_scene", 13);
      localIntent.setFlags(65536);
      com.tencent.mm.plugin.scanner.b.hnH.j(localIntent, q.this.oxQ.bcT());
      q.this.oxQ.bcT().finish();
      q.this.oxQ.bcT().overridePendingTransition(0, 0);
      GMTrace.o(6083418521600L, 45325);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */