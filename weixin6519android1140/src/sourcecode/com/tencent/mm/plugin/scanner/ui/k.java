package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.compatible.d.c;
import com.tencent.mm.plugin.scanner.a.g;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.protocal.c.ho;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class k
  extends i
  implements e, b.a
{
  private static int oyc;
  private int otj;
  public TextView ouQ;
  public View ouR;
  private long oyd;
  g oye;
  private int oyf;
  private int oyg;
  private long oyh;
  private final int oyi;
  private final int oyj;
  private final int oyk;
  private final int oyl;
  private final int oym;
  private final int oyn;
  private final int oyo;
  private final int oyp;
  private float oyq;
  private final long oyr;
  public long oys;
  private final int oyt;
  private e.a oyu;
  public View.OnTouchListener oyv;
  
  static
  {
    GMTrace.i(6130126290944L, 45673);
    oyc = 300;
    GMTrace.o(6130126290944L, 45673);
  }
  
  public k(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint);
    GMTrace.i(6127039283200L, 45650);
    this.oyd = 130L;
    this.oyf = 0;
    this.oyg = 1;
    this.oyi = 260;
    this.oyj = 300;
    this.oyk = 390;
    this.oyl = 450;
    this.oym = 220;
    this.oyn = 240;
    this.oyo = 330;
    this.oyp = 360;
    this.oyr = 30000L;
    this.oyt = 50;
    this.oyu = new e.a()
    {
      public final void l(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(6083150086144L, 45323);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(6083150086144L, 45323);
          return;
          GMTrace.o(6083150086144L, 45323);
          return;
          GMTrace.o(6083150086144L, 45323);
          return;
          GMTrace.o(6083150086144L, 45323);
          return;
          k.this.oxQ.bcQ();
        }
      }
    };
    if (!c.sG()) {
      cP(260, 300);
    }
    for (this.oyq = com.tencent.mm.plugin.scanner.util.p.cS(390, this.oxM);; this.oyq = com.tencent.mm.plugin.scanner.util.p.cS(330, this.oxM))
    {
      w.d("MicroMsg.scanner.ScanModeImage", "frameRectWidth = [%s], frameRectHeight = [%s], scaleRate = [%s]", new Object[] { Integer.valueOf(this.oxM), Integer.valueOf(this.oxN), Float.valueOf(this.oyq) });
      if (bg.eD(paramb.bcT()) < 100L)
      {
        w.w("MicroMsg.scanner.ScanModeImage", "memory is not much");
        this.oyd = 300L;
      }
      this.otj = ((int)(System.currentTimeMillis() & 0xFFFFFFFFFFFFFFFF));
      this.oys = System.currentTimeMillis();
      GMTrace.o(6127039283200L, 45650);
      return;
      cP(220, 240);
    }
  }
  
  private void bdd()
  {
    GMTrace.i(6127844589568L, 45656);
    if (this.oxQ == null)
    {
      w.e("MicroMsg.scanner.ScanModeImage", "dealWithNetWork(), scanUICallback == null");
      GMTrace.o(6127844589568L, 45656);
      return;
    }
    if ((at.wS().DN() == 6) || (at.wS().DN() == 4)) {
      this.oxQ.i(0L, false);
    }
    GMTrace.o(6127844589568L, 45656);
  }
  
  private void bde()
  {
    GMTrace.i(6128247242752L, 45659);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6097779818496L, 45432);
        if (System.currentTimeMillis() - k.this.oys > 30000L)
        {
          w.d("MicroMsg.scanner.ScanModeImage", "show scan img nothing recognize");
          k.this.oxQ.gZ(true);
          k.this.iuc.setVisibility(8);
          k.this.ouQ.setText(R.l.dVl);
          k.this.ouQ.setVisibility(0);
          if (k.this.oyv == null) {
            k.this.oyv = new View.OnTouchListener()
            {
              public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
              {
                GMTrace.i(6096706076672L, 45424);
                k.this.oxQ.gZ(false);
                k.this.iuc.setVisibility(0);
                k.this.iuc.setText(com.tencent.mm.plugin.scanner.util.p.dy(com.tencent.mm.plugin.scanner.util.p.oBx, k.this.oxQ.bcT().getString(R.l.dVn)));
                k.this.ouQ.setVisibility(8);
                k.this.oys = System.currentTimeMillis();
                GMTrace.o(6096706076672L, 45424);
                return false;
              }
            };
          }
          k.this.ouR.setOnTouchListener(k.this.oyv);
        }
        GMTrace.o(6097779818496L, 45432);
      }
    });
    GMTrace.o(6128247242752L, 45659);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(6129186766848L, 45666);
    GMTrace.o(6129186766848L, 45666);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6128381460480L, 45660);
    this.oyf = 0;
    if ((this.oxQ == null) || (paramk == null))
    {
      if (paramk == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(6128381460480L, 45660);
        return;
      }
    }
    if (paramk.getType() == 1062)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label165;
      }
      w.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.iuc.setText(com.tencent.mm.plugin.scanner.util.p.dy(com.tencent.mm.plugin.scanner.util.p.oBx, this.oxQ.bcT().getString(R.l.dVn)));
    }
    for (;;)
    {
      if (this.oye != null) {
        at.wS().c(this.oye);
      }
      GMTrace.o(6128381460480L, 45660);
      return;
      label165:
      this.oyf = this.oyg;
      paramString = (g)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (ho)paramString.fUa.gtD.gtK; paramString == null; paramString = null)
      {
        w.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd(), getResp() == null");
        GMTrace.o(6128381460480L, 45660);
        return;
      }
      w.d("MicroMsg.scanner.ScanModeImage", "onSceneEnd() clientScanID = %s, imageType = %s", new Object[] { Integer.valueOf(paramString.tWr), Integer.valueOf(paramString.tWv) });
      switch (com.tencent.mm.plugin.scanner.util.n.a(paramString.jib, paramString.tWx, this, 3, this.oyu, 0, 0, false))
      {
      default: 
        break;
      case 0: 
        this.oxQ.bcH();
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6136702959616L, 45722);
            if ((k.this.oxQ != null) && (k.this.oxQ.bcT() != null))
            {
              k.this.oxQ.bcT().finish();
              k.this.oxQ.bcT().overridePendingTransition(0, 0);
            }
            GMTrace.o(6136702959616L, 45722);
          }
        }, 700L);
        break;
      case 1: 
        w.d("MicroMsg.scanner.ScanModeImage", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
        break;
      case 2: 
        w.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
      }
    }
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6127978807296L, 45657);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      GMTrace.o(6127978807296L, 45657);
      return;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      w.w("MicroMsg.scanner.ScanModeImage", "greyData null");
      if ((System.currentTimeMillis() - this.oyh > 1800L + this.oyd) && (oAj[1] == 1))
      {
        this.oyh = System.currentTimeMillis();
        this.oxQ.i(0L, true);
        GMTrace.o(6127978807296L, 45657);
        return;
      }
      this.oxQ.dk(this.oyd);
      GMTrace.o(6127978807296L, 45657);
      return;
    }
    bde();
    if (this.oyf >= this.oyg)
    {
      w.d("MicroMsg.scanner.ScanModeImage", "too quick to send image, return now");
      this.oxQ.dk(this.oyd);
      if ((System.currentTimeMillis() - this.oyh > 1800L + this.oyd) && (oAj[1] == 1))
      {
        this.oyh = System.currentTimeMillis();
        this.oxQ.i(0L, true);
        GMTrace.o(6127978807296L, 45657);
        return;
      }
      this.oxQ.dk(this.oyd);
      GMTrace.o(6127978807296L, 45657);
      return;
    }
    this.oye = new g(paramArrayOfByte, paramArrayOfByte.length, this.otj);
    at.wS().a(this.oye, 0);
    this.oyf += 1;
    this.oxR += paramArrayOfByte.length;
    w.d("MicroMsg.scanner.ScanModeImage", "totalNetworkFlow : [%s]", new Object[] { Integer.valueOf(this.oxR) });
    if ((System.currentTimeMillis() - this.oyh > 1800L + this.oyd) && (oAj[1] == 1))
    {
      this.oyh = System.currentTimeMillis();
      this.oxQ.i(0L, true);
      GMTrace.o(6127978807296L, 45657);
      return;
    }
    this.oxQ.dk(this.oyd);
    GMTrace.o(6127978807296L, 45657);
  }
  
  protected final int bcA()
  {
    GMTrace.i(6128784113664L, 45663);
    int i = oyc;
    GMTrace.o(6128784113664L, 45663);
    return i;
  }
  
  protected final void bcB()
  {
    GMTrace.i(6127307718656L, 45652);
    h(new Rect(0, 0, 0, 0));
    this.oxQ.b(4, null);
    onResume();
    GMTrace.o(6127307718656L, 45652);
  }
  
  protected final boolean bcC()
  {
    GMTrace.i(6128918331392L, 45664);
    GMTrace.o(6128918331392L, 45664);
    return true;
  }
  
  protected final boolean bcD()
  {
    GMTrace.i(6129052549120L, 45665);
    GMTrace.o(6129052549120L, 45665);
    return true;
  }
  
  public final void bct()
  {
    GMTrace.i(6128113025024L, 45658);
    w.d("MicroMsg.scanner.ScanModeImage", "decodeFail");
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      GMTrace.o(6128113025024L, 45658);
      return;
    }
    bde();
    if ((System.currentTimeMillis() - this.oyh > 1800L + this.oyd) && (oAj[1] == 1))
    {
      this.oyh = System.currentTimeMillis();
      this.oxQ.i(0L, true);
      GMTrace.o(6128113025024L, 45658);
      return;
    }
    this.oxQ.dk(this.oyd);
    GMTrace.o(6128113025024L, 45658);
  }
  
  protected final void bcx()
  {
    GMTrace.i(6127710371840L, 45655);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      GMTrace.o(6127710371840L, 45655);
      return;
    }
    bdd();
    GMTrace.o(6127710371840L, 45655);
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bcy()
  {
    GMTrace.i(6127576154112L, 45654);
    int i;
    if (this.oxK == null)
    {
      i = 50;
      if (com.tencent.mm.compatible.d.p.fQC.fOS > 0)
      {
        i = com.tencent.mm.compatible.d.p.fQC.fOS;
        w.d("MicroMsg.scanner.ScanModeImage", "ImageQuality=[%s]", new Object[] { Integer.valueOf(com.tencent.mm.compatible.d.p.fQC.fOS) });
      }
      if (!am.is2G(this.oxQ.bcT())) {
        break label120;
      }
    }
    label120:
    for (this.oxK = new com.tencent.mm.plugin.scanner.util.k(this, i - 10, this.oyq, false, this.oxQ.bcP());; this.oxK = new com.tencent.mm.plugin.scanner.util.k(this, i, this.oyq, false, this.oxQ.bcP()))
    {
      com.tencent.mm.plugin.scanner.util.b localb = this.oxK;
      GMTrace.o(6127576154112L, 45654);
      return localb;
    }
  }
  
  protected final int bcz()
  {
    GMTrace.i(6127441936384L, 45653);
    int i = R.i.cFg;
    GMTrace.o(6127441936384L, 45653);
    return i;
  }
  
  protected final void h(Rect paramRect)
  {
    GMTrace.i(6127173500928L, 45651);
    this.ouR = this.oxQ.findViewById(R.h.bZF);
    this.ouQ = ((TextView)this.oxQ.findViewById(R.h.bZG));
    this.iuc = ((TextView)this.oxQ.findViewById(R.h.bZJ));
    this.iuc.setText(com.tencent.mm.plugin.scanner.util.p.dy(com.tencent.mm.plugin.scanner.util.p.oBx, this.oxQ.bcT().getString(R.l.dVn)));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iuc.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.a(this.oxQ.bcT(), 13.0F));
      this.iuc.setLayoutParams(localLayoutParams);
    }
    if (c.sG()) {
      this.iuc.setPadding(BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.iuc.getPaddingTop(), BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.iuc.getPaddingBottom());
    }
    if (this.oxK != null) {
      ((com.tencent.mm.plugin.scanner.util.k)this.oxK).naa = this.oxQ.bcP();
    }
    bdd();
    hb(true);
    GMTrace.o(6127173500928L, 45651);
  }
  
  protected final void onPause()
  {
    GMTrace.i(6128649895936L, 45662);
    super.onPause();
    hb(false);
    at.wS().b(1062, this);
    GMTrace.o(6128649895936L, 45662);
  }
  
  protected final void onResume()
  {
    GMTrace.i(6128515678208L, 45661);
    at.wS().a(1062, this);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      GMTrace.o(6128515678208L, 45661);
      return;
    }
    this.oyf = 0;
    bdd();
    GMTrace.o(6128515678208L, 45661);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */