package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.d.c;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.protocal.c.aqo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class o
  extends i
  implements com.tencent.mm.ad.e, b.a
{
  private int otj;
  private TextView oyA;
  private TextView oyB;
  private final int oyC;
  private final int oyD;
  private ae oyE;
  public int oyf;
  public int oyg;
  private long oyh;
  private final int oyi;
  private final int oyj;
  private final int oyk;
  private final int oyl;
  private float oyq;
  private final int oyt;
  com.tencent.mm.plugin.scanner.a.e oyy;
  private int oyz;
  
  public o(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint, (byte)0);
    GMTrace.i(6110262067200L, 45525);
    this.oyf = 0;
    this.oyg = 2;
    this.oyz = 0;
    this.oyi = 184;
    this.oyj = 46;
    this.oyk = 276;
    this.oyl = 70;
    this.oyt = 50;
    this.oyC = 5000;
    this.oyD = 8000;
    this.oyE = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6159654191104L, 45893);
        if (o.this.oyf >= o.this.oyg)
        {
          if (o.this.oyy != null) {
            at.wS().c(o.this.oyy);
          }
          paramAnonymousMessage = o.this;
          paramAnonymousMessage.oyf -= 1;
        }
        GMTrace.o(6159654191104L, 45893);
      }
    };
    cP(184, 46);
    this.oyq = com.tencent.mm.plugin.scanner.util.p.cS(276, this.oxM);
    w.d("MicroMsg.scanner.ScanModeOCR", "frameRectWidth = [%s], frameRectHeight = [%s], scaleRate = [%s]", new Object[] { Integer.valueOf(this.oxM), Integer.valueOf(this.oxN), Float.valueOf(this.oyq) });
    this.otj = ((int)(System.currentTimeMillis() & 0xFFFFFFFFFFFFFFFF));
    GMTrace.o(6110262067200L, 45525);
  }
  
  private void bdd()
  {
    GMTrace.i(6111067373568L, 45531);
    if (this.oxQ == null)
    {
      w.e("MicroMsg.scanner.ScanModeOCR", "dealWithNetWork(), scanUICallback == null");
      GMTrace.o(6111067373568L, 45531);
      return;
    }
    if ((at.wS().DN() == 6) || (at.wS().DN() == 4))
    {
      this.oxQ.i(1800L, true);
      GMTrace.o(6111067373568L, 45531);
      return;
    }
    this.oyA.setText("");
    this.oyB.setText("");
    this.oxQ.gZ(true);
    GMTrace.o(6111067373568L, 45531);
  }
  
  private void dw(String paramString1, String paramString2)
  {
    GMTrace.i(6111604244480L, 45535);
    if (!bg.nm(paramString1))
    {
      this.iuc.setVisibility(8);
      this.oyA.setText(paramString1);
      this.oyA.setVisibility(0);
    }
    while (!bg.nm(paramString2))
    {
      this.iuc.setVisibility(8);
      this.oyB.setText(paramString2);
      this.oyB.setVisibility(0);
      GMTrace.o(6111604244480L, 45535);
      return;
      this.oyA.setText("");
    }
    this.oyB.setText("");
    GMTrace.o(6111604244480L, 45535);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(6112409550848L, 45541);
    GMTrace.o(6112409550848L, 45541);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6111470026752L, 45534);
    this.oyE.removeMessages(0);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(6111470026752L, 45534);
      return;
      this.oyf -= 1;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        this.oyh -= 300L;
        dw(null, null);
        GMTrace.o(6111470026752L, 45534);
        return;
      }
      w.d("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = (com.tencent.mm.plugin.scanner.a.e)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (aqo)paramString.fUa.gtD.gtK; paramString == null; paramString = null)
      {
        w.e("MicroMsg.scanner.ScanModeOCR", "onSceneEnd(), getResp() == null");
        dw(null, null);
        GMTrace.o(6111470026752L, 45534);
        return;
      }
      w.d("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() clientScanID = %s, imageType = %s, source = %s, translate = %s", new Object[] { Integer.valueOf(paramString.tWr), Integer.valueOf(paramString.tWv), paramString.uGN, paramString.uGO });
      if (bg.nm(paramString.uGO))
      {
        GMTrace.o(6111470026752L, 45534);
        return;
      }
      dw(paramString.uGN, paramString.uGO);
      if (this.oyy != null) {
        at.wS().c(this.oyy);
      }
    }
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6111201591296L, 45532);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      GMTrace.o(6111201591296L, 45532);
      return;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      boolean bool;
      if (paramArrayOfByte == null)
      {
        bool = true;
        w.w("MicroMsg.scanner.ScanModeOCR", "greyData null:[%s]", new Object[] { Boolean.valueOf(bool) });
        if ((System.currentTimeMillis() - this.oyh <= 1840L) || (oAj[1] != 1)) {
          break label133;
        }
        this.oyh = System.currentTimeMillis();
        this.oxQ.i(0L, true);
      }
      for (;;)
      {
        this.oyz = 0;
        GMTrace.o(6111201591296L, 45532);
        return;
        bool = false;
        break;
        label133:
        this.oxQ.dk(40L);
      }
    }
    if (this.oyf >= this.oyg)
    {
      if ((System.currentTimeMillis() - this.oyh > 1840L) && (oAj[1] == 1))
      {
        this.oyh = System.currentTimeMillis();
        this.oxQ.i(0L, true);
      }
      for (;;)
      {
        w.w("MicroMsg.scanner.ScanModeOCR", "hasDoSceneCount[%s], maxDoSceneCount[%s]", new Object[] { Integer.valueOf(this.oyf), Integer.valueOf(this.oyg) });
        GMTrace.o(6111201591296L, 45532);
        return;
        this.oxQ.dk(40L);
      }
    }
    this.oyy = new com.tencent.mm.plugin.scanner.a.e(paramArrayOfByte, "en", "zh_CN", this.otj);
    at.wS().a(this.oyy, 0);
    this.oyf += 1;
    this.oyE.removeMessages(0);
    if (am.is2G(this.oxQ.bcT()))
    {
      this.oyE.sendEmptyMessageDelayed(0, 8000L);
      this.oxR += paramArrayOfByte.length;
      w.d("MicroMsg.scanner.ScanModeOCR", "totalNetworkFlow[%s], hasTakePicNum[%s], maxDoSceneCount[%s]", new Object[] { Integer.valueOf(this.oxR), Integer.valueOf(this.oyz), Integer.valueOf(this.oyg) });
      if ((System.currentTimeMillis() - this.oyh <= 1840L) || (oAj[1] != 1)) {
        break label495;
      }
      this.oyh = System.currentTimeMillis();
      this.oxQ.i(0L, true);
    }
    for (;;)
    {
      w.v("MicroMsg.scanner.ScanModeOCR", "onDecodeFinished:" + this.oyf + "," + this.oyz);
      GMTrace.o(6111201591296L, 45532);
      return;
      this.oyE.sendEmptyMessageDelayed(0, 5000L);
      break;
      label495:
      this.oxQ.dk(40L);
    }
  }
  
  protected final int bcA()
  {
    GMTrace.i(6112006897664L, 45538);
    GMTrace.o(6112006897664L, 45538);
    return 0;
  }
  
  protected final void bcB()
  {
    GMTrace.i(6110530502656L, 45527);
    h(new Rect(0, 0, 0, 0));
    this.oxQ.b(4, null);
    this.oxQ.i(1800L, true);
    onResume();
    GMTrace.o(6110530502656L, 45527);
  }
  
  protected final boolean bcC()
  {
    GMTrace.i(6112141115392L, 45539);
    GMTrace.o(6112141115392L, 45539);
    return true;
  }
  
  protected final boolean bcD()
  {
    GMTrace.i(6112275333120L, 45540);
    GMTrace.o(6112275333120L, 45540);
    return true;
  }
  
  public final void bct()
  {
    GMTrace.i(6111335809024L, 45533);
    w.d("MicroMsg.scanner.ScanModeOCR", "decodeFail");
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      GMTrace.o(6111335809024L, 45533);
      return;
    }
    if ((System.currentTimeMillis() - this.oyh > 1840L) && (oAj[1] == 1))
    {
      this.oyh = System.currentTimeMillis();
      this.oxQ.i(0L, true);
      GMTrace.o(6111335809024L, 45533);
      return;
    }
    this.oxQ.dk(40L);
    GMTrace.o(6111335809024L, 45533);
  }
  
  protected final void bcx()
  {
    GMTrace.i(6110933155840L, 45530);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      GMTrace.o(6110933155840L, 45530);
      return;
    }
    bdd();
    GMTrace.o(6110933155840L, 45530);
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bcy()
  {
    GMTrace.i(6110798938112L, 45529);
    int i;
    if (this.oxK == null)
    {
      i = 50;
      if (com.tencent.mm.compatible.d.p.fQC.fOS > 0)
      {
        i = com.tencent.mm.compatible.d.p.fQC.fOS;
        w.d("MicroMsg.scanner.ScanModeOCR", "ImageQuality=[%s]", new Object[] { Integer.valueOf(com.tencent.mm.compatible.d.p.fQC.fOS) });
      }
      if (!am.is2G(this.oxQ.bcT())) {
        break label120;
      }
    }
    label120:
    for (this.oxK = new com.tencent.mm.plugin.scanner.util.k(this, i - 10, this.oyq, true, this.oxQ.bcP());; this.oxK = new com.tencent.mm.plugin.scanner.util.k(this, i, this.oyq, true, this.oxQ.bcP()))
    {
      com.tencent.mm.plugin.scanner.util.b localb = this.oxK;
      GMTrace.o(6110798938112L, 45529);
      return localb;
    }
  }
  
  protected final int bcz()
  {
    GMTrace.i(6110664720384L, 45528);
    int i = R.i.cFi;
    GMTrace.o(6110664720384L, 45528);
    return i;
  }
  
  protected final void h(Rect paramRect)
  {
    GMTrace.i(6110396284928L, 45526);
    this.iuc = ((TextView)this.oxQ.findViewById(R.h.bZJ));
    this.oyB = ((TextView)this.oxQ.findViewById(R.h.bSi));
    this.oyA = ((TextView)this.oxQ.findViewById(R.h.bSj));
    this.iuc = ((TextView)this.oxQ.findViewById(R.h.bZJ));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iuc.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.a(this.oxQ.bcT(), 13.0F));
      this.iuc.setLayoutParams(localLayoutParams);
      localLayoutParams = (RelativeLayout.LayoutParams)this.oyA.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.a(this.oxQ.bcT(), 13.0F));
      this.oyA.setLayoutParams(localLayoutParams);
      this.oyA.setVisibility(4);
    }
    if (c.sG())
    {
      this.iuc.setPadding(BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.iuc.getPaddingTop(), BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.iuc.getPaddingBottom());
      this.oyA.setPadding(BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.oyA.getPaddingTop(), BackwardSupportUtil.b.a(this.oxQ.bcT(), 54.0F), this.oyA.getPaddingBottom());
    }
    if (this.oxK != null) {
      ((com.tencent.mm.plugin.scanner.util.k)this.oxK).naa = this.oxQ.bcP();
    }
    bdd();
    hb(true);
    GMTrace.o(6110396284928L, 45526);
  }
  
  protected final void onPause()
  {
    GMTrace.i(6111872679936L, 45537);
    hb(false);
    at.wS().b(392, this);
    GMTrace.o(6111872679936L, 45537);
  }
  
  protected final void onResume()
  {
    GMTrace.i(6111738462208L, 45536);
    at.wS().a(392, this);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      GMTrace.o(6111738462208L, 45536);
      return;
    }
    bdd();
    GMTrace.o(6111738462208L, 45536);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */