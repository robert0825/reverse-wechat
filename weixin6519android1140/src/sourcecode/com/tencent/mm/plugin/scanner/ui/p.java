package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.g.a.lu.b;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.plugin.ab.a.c.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.scanner.a.f;
import com.tencent.mm.plugin.scanner.a.l;
import com.tencent.mm.plugin.scanner.util.d;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.hm;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;

public final class p
  extends i
  implements e, c.a, i.a, com.tencent.mm.plugin.scanner.util.b.a
{
  public int eDC;
  public boolean eIE;
  private int mMode;
  public com.tencent.mm.plugin.scanner.util.b oxK;
  public boolean oyG;
  public boolean oyH;
  private TextView oyI;
  boolean oyJ;
  private int oyK;
  private int oyL;
  private Rect oyM;
  private View.OnClickListener oyN;
  public long oyd;
  private e.a oyu;
  
  public p(i.b paramb, Point paramPoint, int paramInt1, int paramInt2)
  {
    super(paramb, paramPoint);
    GMTrace.i(6105027575808L, 45486);
    this.oyd = 80L;
    this.eDC = 0;
    this.oyG = false;
    this.eIE = false;
    this.oyH = false;
    this.mMode = 0;
    this.oyJ = false;
    this.oyM = null;
    this.oyu = new e.a()
    {
      public final void l(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(6145829765120L, 45790);
        w.i("MicroMsg.scanner.ScanModeQRCode", "notify Event: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(6145829765120L, 45790);
          return;
          p.this.oyG = false;
          GMTrace.o(6145829765120L, 45790);
          return;
          p.this.gL(true);
          GMTrace.o(6145829765120L, 45790);
          return;
          p.this.gL(true);
          GMTrace.o(6145829765120L, 45790);
          return;
          p.this.oxQ.bcQ();
          GMTrace.o(6145829765120L, 45790);
          return;
          if (paramAnonymousBundle != null)
          {
            paramAnonymousBundle = paramAnonymousBundle.getString("geta8key_fullurl");
            if ((paramAnonymousBundle != null) && ((paramAnonymousBundle.startsWith("http://login.weixin.qq.com")) || (paramAnonymousBundle.startsWith("https://login.weixin.qq.com")))) {
              p.this.eDC = 2;
            }
          }
          p.this.oxQ.gZ(true);
          p.this.oyG = true;
        }
      }
    };
    this.oyN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6159922626560L, 45895);
        if (p.this.oxQ == null)
        {
          w.e("MicroMsg.scanner.ScanModeQRCode", "toMyQRCodeOnclickListener scanUICallback == null");
          GMTrace.o(6159922626560L, 45895);
          return;
        }
        g.ork.i(11264, new Object[] { Integer.valueOf(3) });
        com.tencent.mm.plugin.scanner.b.hnH.ap(p.this.oxQ.bcT());
        GMTrace.o(6159922626560L, 45895);
      }
    };
    cP(366, 366);
    bdf();
    this.eDC = paramInt1;
    this.mMode = paramInt2;
    this.oxS = true;
    if (bg.eD(paramb.bcT()) < 100L)
    {
      w.w("MicroMsg.scanner.ScanModeQRCode", "memory is not much");
      this.oyd = 280L;
    }
    GMTrace.o(6105027575808L, 45486);
  }
  
  private void bdd()
  {
    GMTrace.i(6106638188544L, 45498);
    if (this.oxQ == null)
    {
      w.e("MicroMsg.scanner.ScanModeQRCode", "dealWithNetWork(), scanUICallback == null");
      GMTrace.o(6106638188544L, 45498);
      return;
    }
    if ((at.wS().DN() == 6) || (at.wS().DN() == 4)) {
      this.oxQ.i(0L, false);
    }
    GMTrace.o(6106638188544L, 45498);
  }
  
  private void bdf()
  {
    float f = 0.7F;
    GMTrace.i(6105430228992L, 45489);
    Object localObject = ad.ff(com.tencent.mm.sdk.platformtools.ab.getContext());
    w.i("MicroMsg.scanner.ScanModeQRCode", "initQRModeFrameRect, baseSize: %s, cameraResolution: %s, widthRatio: %s, heightRatio: %s", new Object[] { localObject, this.kTE, Float.valueOf(0.7F), Float.valueOf(0.7F) });
    int i = Math.min(((Point)localObject).x, ((Point)localObject).y);
    if (i >= 720)
    {
      if (this.kTE != null) {
        for (;;)
        {
          j(i, f);
          int j = this.oyK;
          int k = this.kTE.y;
          localObject = new Rect();
          this.oxQ.bcT().getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
          w.i("MicroMsg.scanner.ScanModeQRCode", "getScanFrameWidth, frameRect.width: %s", new Object[] { Integer.valueOf(((Rect)localObject).width()) });
          j = j * k / ((Rect)localObject).width();
          k = this.oyL;
          int m = this.kTE.x;
          localObject = new Rect();
          this.oxQ.bcT().getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
          w.i("MicroMsg.scanner.ScanModeQRCode", "getScanFrameHeight, frameRect.height: %s", new Object[] { Integer.valueOf(((Rect)localObject).width()) });
          k = k * m / ((Rect)localObject).height();
          w.i("MicroMsg.scanner.ScanModeQRCode", "scanWidth: %s, scanHeight: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
          if (Math.max(j, k) <= 750) {
            break;
          }
          w.i("MicroMsg.scanner.ScanModeQRCode", "scan size exceed upper bound, decrease ratio");
          f -= 0.05F;
        }
      }
      j(i, 0.7F);
      w.d("MicroMsg.scanner.ScanModeQRCode", "initQRModeFrameRect, qrCodeframeRectWidthInPx = [%s] [%sdp], qrCodeframeRectHeightInPx = [%s] [%sdp], oldTARGET_WIDTH_Dp = [%s][%sdp]", new Object[] { Integer.valueOf(this.oyK), Integer.valueOf(com.tencent.mm.br.a.Y(com.tencent.mm.sdk.platformtools.ab.getContext(), this.oyK)), Integer.valueOf(this.oyL), Integer.valueOf(com.tencent.mm.br.a.Y(com.tencent.mm.sdk.platformtools.ab.getContext(), this.oyK)), Integer.valueOf(com.tencent.mm.br.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ab.getContext(), 366)), Integer.valueOf(366) });
    }
    for (;;)
    {
      if ((this.oxN > this.oyL) || (this.oxM > this.oyL))
      {
        this.oxN = this.oyL;
        this.oxM = this.oyK;
      }
      w.i("MicroMsg.scanner.ScanModeQRCode", "final frameRectWidthInPx: %s[%sdp], frameRectHeightInPx: %s[%sdp]", new Object[] { Integer.valueOf(this.oxM), Integer.valueOf(com.tencent.mm.br.a.Y(com.tencent.mm.sdk.platformtools.ab.getContext(), this.oxM)), Integer.valueOf(this.oxN), Integer.valueOf(com.tencent.mm.br.a.Y(com.tencent.mm.sdk.platformtools.ab.getContext(), this.oxN)) });
      GMTrace.o(6105430228992L, 45489);
      return;
      j(i, 0.7F);
    }
  }
  
  private void j(int paramInt, float paramFloat)
  {
    GMTrace.i(6105296011264L, 45488);
    this.oyK = Math.round(paramInt * paramFloat);
    this.oyL = Math.round(paramInt * paramFloat);
    if (this.oyK % 2 == 1) {
      this.oyK += 1;
    }
    if (this.oyL % 2 == 1) {
      this.oyL += 1;
    }
    w.i("MicroMsg.scanner.ScanModeQRCode", "calcQrCodeFrameRectSizePx, qrCodeframeRectWidthInPx: %s, qrCodeframeRectHeightInPx: %s, base: %s, ratio: %s", new Object[] { Integer.valueOf(this.oyK), Integer.valueOf(this.oyL), Integer.valueOf(paramInt), Float.valueOf(paramFloat) });
    GMTrace.o(6105296011264L, 45488);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(6108517236736L, 45512);
    if ((paramBundle.containsKey("zoom_action")) && (paramBundle.containsKey("zoom_type")) && (paramBundle.containsKey("zoom_scale")) && (this.oxQ != null)) {
      this.oxQ.N(paramBundle.getInt("zoom_action"), paramBundle.getInt("zoom_type"), paramBundle.getInt("zoom_scale"));
    }
    GMTrace.o(6108517236736L, 45512);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6107175059456L, 45502);
    w.i("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd: errType = [%s] errCode = [%s] errMsg = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((this.oxQ == null) || (paramk == null))
    {
      if (paramk == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        this.oyG = false;
        GMTrace.o(6107175059456L, 45502);
        return;
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      h.a(this.oxQ.bcT(), R.l.dOZ, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6142340104192L, 45764);
          p.this.gL(true);
          GMTrace.o(6142340104192L, 45764);
        }
      });
      GMTrace.o(6107175059456L, 45502);
      return;
    }
    int i;
    switch (paramInt1)
    {
    default: 
      i = 0;
    }
    while (i != 0)
    {
      gL(true);
      GMTrace.o(6107175059456L, 45502);
      return;
      if (at.wS().DO())
      {
        this.oxQ.bcT();
        at.wS().getNetworkServerIp();
        new StringBuilder().append(paramInt2);
      }
      for (;;)
      {
        i = 1;
        break;
        if (com.tencent.mm.network.ab.bv(this.oxQ.bcT())) {
          com.tencent.mm.pluginsdk.ui.k.dU(this.oxQ.bcT());
        } else {
          Toast.makeText(this.oxQ.bcT(), this.oxQ.bcT().getString(R.l.dwH, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
        }
      }
      Toast.makeText(this.oxQ.bcT(), this.oxQ.bcT().getString(R.l.dwI, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
      i = 1;
    }
    if ((paramInt1 == 4) && (paramInt2 == 63532))
    {
      h.h(this.oxQ.bcT(), R.l.dOU, R.l.cUG);
      gL(true);
      GMTrace.o(6107175059456L, 45502);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this.oxQ.bcT(), this.oxQ.bcT().getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      gL(true);
      GMTrace.o(6107175059456L, 45502);
      return;
    }
    if (paramk.getType() == 1061)
    {
      paramString = ((f)paramk).bcp();
      if (paramString == null)
      {
        w.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd(), getResp() == null");
        gL(true);
        GMTrace.o(6107175059456L, 45502);
        return;
      }
      w.d("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() ScanBarcode Type = %s", new Object[] { Integer.valueOf(paramString.jib) });
      if (bg.nm(paramString.tWp))
      {
        gL(true);
        GMTrace.o(6107175059456L, 45502);
        return;
      }
      switch (com.tencent.mm.plugin.scanner.util.n.a(paramString.jib, paramString.tWp, this, 4, this.oyu, ((f)paramk).eDg, ((f)paramk).eDh, ((f)paramk).otk))
      {
      }
      for (;;)
      {
        this.oxQ.gZ(false);
        GMTrace.o(6107175059456L, 45502);
        return;
        this.oxQ.bcT().finish();
        this.oxQ.bcT().overridePendingTransition(0, 0);
        GMTrace.o(6107175059456L, 45502);
        return;
        w.d("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
        continue;
        w.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
        this.oxQ.i(0L, false);
      }
    }
    if (paramk.getType() == 666)
    {
      if ((paramk instanceof z))
      {
        this.oxQ.gZ(true);
        this.oxQ.bcT().finish();
        this.oxQ.bcT().overridePendingTransition(0, 0);
        GMTrace.o(6107175059456L, 45502);
      }
    }
    else if (paramk.getType() == 971)
    {
      this.oxQ.gZ(true);
      this.oxQ.bcT().finish();
      this.oxQ.bcT().overridePendingTransition(0, 0);
    }
    GMTrace.o(6107175059456L, 45502);
  }
  
  public final void a(int paramInt1, final String paramString, int paramInt2, int paramInt3)
  {
    int i = 1;
    GMTrace.i(6106906624000L, 45500);
    Activity localActivity = this.oxQ.bcT();
    Object localObject = new lu();
    if (paramInt1 == 1) {}
    for (((lu)localObject).eQn.eQp = 0;; ((lu)localObject).eQn.eQp = 1)
    {
      ((lu)localObject).eQn.scanResult = paramString;
      if (!this.oyJ) {
        break;
      }
      w.d("MicroMsg.scanner.ScanModeQRCode", "need to finish on decode success");
      ((lu)localObject).eQn.eQl = 1;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_scan_result", paramString);
      ((Intent)localObject).putExtra("key_scan_result_type", paramInt1);
      ((Intent)localObject).putExtra("key_scan_result_code_type", paramInt2);
      ((Intent)localObject).putExtra("key_scan_result_code_version", paramInt3);
      localActivity.setResult(-1, (Intent)localObject);
      localActivity.finish();
      localActivity.overridePendingTransition(0, 0);
      GMTrace.o(6106906624000L, 45500);
      return;
    }
    ((lu)localObject).eQn.eQl = 0;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if ((((lu)localObject).eQo.ret == 1) || (((lu)localObject).eQo.ret == 2))
    {
      localActivity.finish();
      localActivity.overridePendingTransition(0, 0);
    }
    if (paramInt1 == 1)
    {
      this.oxQ.bcH();
      this.oxQ.gZ(true);
      this.oyG = false;
      if (((lu)localObject).eQo.ret != 2)
      {
        if (this.oyH) {}
        for (paramInt1 = i;; paramInt1 = 0)
        {
          this.oxQ.a(paramString, paramInt1, paramInt2, paramInt3, this.oyu);
          GMTrace.o(6106906624000L, 45500);
          return;
        }
      }
    }
    else if (paramInt1 == 2)
    {
      if ((paramString == null) || (paramString.length() <= 0))
      {
        w.e("MicroMsg.scanner.ScanModeQRCode", "result is null");
        this.oyG = false;
        this.oxQ.gZ(false);
        GMTrace.o(6106906624000L, 45500);
        return;
      }
      paramString = paramString.split(",", 2);
      if ((paramString == null) || (paramString.length < 2))
      {
        w.e("MicroMsg.scanner.ScanModeQRCode", "wrong zbar format");
        this.oyG = false;
        this.oxQ.gZ(false);
        GMTrace.o(6106906624000L, 45500);
        return;
      }
      paramString = new f(com.tencent.mm.plugin.scanner.util.p.FZ(paramString[0]), paramString[1], paramInt2, paramInt3);
      paramString.otk = this.oyH;
      at.wS().a(paramString, 0);
      this.oxQ.bcH();
      this.oxQ.gZ(true);
      localActivity = this.oxQ.bcT();
      this.oxQ.bcT().getString(R.l.cUG);
      this.htG = h.a(localActivity, this.oxQ.bcT().getString(R.l.dPe), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(6066104434688L, 45196);
          at.wS().c(paramString);
          p.this.oxQ.gZ(false);
          p.this.oyG = false;
          GMTrace.o(6066104434688L, 45196);
        }
      });
    }
    GMTrace.o(6106906624000L, 45500);
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6106772406272L, 45499);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      GMTrace.o(6106772406272L, 45499);
      return;
    }
    if (this.oyG)
    {
      w.w("MicroMsg.scanner.ScanModeQRCode", "is decoding, return");
      GMTrace.o(6106772406272L, 45499);
      return;
    }
    this.oyG = true;
    w.d("MicroMsg.scanner.ScanModeQRCode", "decode success:%s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      this.oyG = false;
      GMTrace.o(6106772406272L, 45499);
      return;
    }
    if (at.wS().DN() == 0)
    {
      Toast.makeText(this.oxQ.bcT(), this.oxQ.bcT().getString(R.l.dwI), 0).show();
      this.oyG = false;
      GMTrace.o(6106772406272L, 45499);
      return;
    }
    a(paramInt1, paramString, paramInt2, paramInt3);
    GMTrace.o(6106772406272L, 45499);
  }
  
  public final void b(final Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6107711930368L, 45506);
    if (paramActivity == null)
    {
      GMTrace.o(6107711930368L, 45506);
      return;
    }
    this.oyG = true;
    if (paramInt2 != -1)
    {
      this.oyG = false;
      this.oyH = false;
      GMTrace.o(6107711930368L, 45506);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(6107711930368L, 45506);
      return;
      if (paramIntent == null)
      {
        w.e("MicroMsg.scanner.ScanModeQRCode", "onActivityResult data == null");
        this.oyG = false;
        this.oyH = false;
        GMTrace.o(6107711930368L, 45506);
        return;
      }
      at.AR();
      paramIntent = com.tencent.mm.ui.tools.a.c(paramActivity, paramIntent, com.tencent.mm.y.c.yU());
      w.d("MicroMsg.scanner.ScanModeQRCode", "select: [%s]", new Object[] { paramIntent });
      new ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6109859414016L, 45522);
          p localp = p.this;
          Activity localActivity = paramActivity;
          paramActivity.getString(R.l.cUG);
          localp.htG = h.a(localActivity, paramActivity.getString(R.l.dPc), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(6159117320192L, 45889);
              p.this.oyG = false;
              p.this.oyH = false;
              p.this.eIE = false;
              GMTrace.o(6159117320192L, 45889);
            }
          });
          GMTrace.o(6109859414016L, 45522);
        }
      });
      if (this.oxK != null) {
        this.oxK.releaseDecoder();
      }
      this.eIE = true;
      if (this.oxQ != null) {
        this.oxQ.gZ(true);
      }
      l.oto.reset();
      com.tencent.mm.plugin.scanner.c.bcm().osA.a(paramIntent, new com.tencent.mm.plugin.ab.a.b.a()
      {
        public final void Fk(String paramAnonymousString)
        {
          GMTrace.i(6133884387328L, 45701);
          l.oto.tu(l.otm);
          if (p.this.oxK != null) {
            p.this.oxK.bdl();
          }
          if ((p.this.htG == null) || (!p.this.htG.isShowing()))
          {
            p.this.oyG = false;
            p.this.oyH = false;
            GMTrace.o(6133884387328L, 45701);
            return;
          }
          p.this.eIE = true;
          if (p.this.oxQ != null) {
            p.this.oxQ.gZ(true);
          }
          p.this.htG.dismiss();
          l.oto.aIS();
          h.a(paramActivity, R.l.dPb, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(6145561329664L, 45788);
              p.this.oyG = false;
              p.this.oyH = false;
              p.this.eIE = false;
              l.oto.reset();
              l.oto.tu(l.otl);
              if (p.this.oxQ != null)
              {
                p.this.oxQ.gZ(false);
                p.this.oxQ.dk(p.this.oyd);
              }
              GMTrace.o(6145561329664L, 45788);
            }
          });
          GMTrace.o(6133884387328L, 45701);
        }
        
        public final void i(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          int j = 1;
          GMTrace.i(6133750169600L, 45700);
          l.oto.tu(l.otm);
          if (p.this.oxK != null) {
            p.this.oxK.bdl();
          }
          if ((p.this.htG == null) || (!p.this.htG.isShowing()))
          {
            p.this.oyG = false;
            p.this.oyH = false;
            GMTrace.o(6133750169600L, 45700);
            return;
          }
          p.this.eIE = true;
          if (p.this.oxQ != null) {
            p.this.oxQ.gZ(true);
          }
          p.this.htG.dismiss();
          if (bg.nm(paramAnonymousString2))
          {
            l.oto.aIS();
            h.a(paramActivity, R.l.dPb, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6114691252224L, 45558);
                p.this.oyG = false;
                p.this.oyH = false;
                p.this.eIE = false;
                l.oto.reset();
                l.oto.tu(l.otl);
                if (p.this.oxQ != null)
                {
                  p.this.oxQ.gZ(false);
                  p.this.oxQ.dk(p.this.oyd);
                }
                GMTrace.o(6114691252224L, 45558);
              }
            });
            GMTrace.o(6133750169600L, 45700);
            return;
          }
          bq.BG().c(10237, new Object[] { Integer.valueOf(1) });
          p.this.oxQ.bcH();
          int i = j;
          if (paramAnonymousInt1 != 19) {
            if (paramAnonymousInt1 != 22) {
              break label255;
            }
          }
          label255:
          for (i = j;; i = 2)
          {
            p.this.a(i, paramAnonymousString2, paramAnonymousInt1, paramAnonymousInt2);
            p.this.oyH = false;
            GMTrace.o(6133750169600L, 45700);
            return;
          }
        }
      }, null);
      GMTrace.o(6107711930368L, 45506);
      return;
      this.oxQ.bcR();
    }
  }
  
  protected final int bcA()
  {
    GMTrace.i(6107577712640L, 45505);
    GMTrace.o(6107577712640L, 45505);
    return 366;
  }
  
  protected final void bcB()
  {
    GMTrace.i(6106101317632L, 45494);
    h(new Rect(0, 0, 0, 0));
    if (this.mMode == 2) {
      this.oxQ.b(4, null);
    }
    for (;;)
    {
      this.oxQ.a(this);
      onResume();
      GMTrace.o(6106101317632L, 45494);
      return;
      this.oxQ.b(0, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6067580829696L, 45207);
          p.this.bdi();
          GMTrace.o(6067580829696L, 45207);
        }
      });
    }
  }
  
  protected final boolean bcC()
  {
    GMTrace.i(6108114583552L, 45509);
    GMTrace.o(6108114583552L, 45509);
    return true;
  }
  
  protected final boolean bcD()
  {
    GMTrace.i(6108248801280L, 45510);
    GMTrace.o(6108248801280L, 45510);
    return true;
  }
  
  public final void bct()
  {
    GMTrace.i(6107040841728L, 45501);
    w.i("MicroMsg.scanner.ScanModeQRCode", "decodeFail");
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      GMTrace.o(6107040841728L, 45501);
      return;
    }
    if (!this.eIE) {
      this.oxQ.dk(this.oyd);
    }
    GMTrace.o(6107040841728L, 45501);
  }
  
  protected final void bcx()
  {
    GMTrace.i(6106503970816L, 45497);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeQRCode", "handleNetworkChange(), scanUICallback == null");
      GMTrace.o(6106503970816L, 45497);
      return;
    }
    bdd();
    GMTrace.o(6106503970816L, 45497);
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bcy()
  {
    GMTrace.i(6106369753088L, 45496);
    if ((this.oxK == null) && (this.oxQ != null)) {
      this.oxK = new d(this, this.mMode, this.oxQ.bcP());
    }
    com.tencent.mm.plugin.scanner.util.b localb = this.oxK;
    GMTrace.o(6106369753088L, 45496);
    return localb;
  }
  
  protected final int bcz()
  {
    GMTrace.i(6106235535360L, 45495);
    int i = R.i.cFk;
    GMTrace.o(6106235535360L, 45495);
    return i;
  }
  
  public final void bdg()
  {
    GMTrace.i(6105698664448L, 45491);
    this.oxS = false;
    GMTrace.o(6105698664448L, 45491);
  }
  
  public final boolean bdh()
  {
    GMTrace.i(6105832882176L, 45492);
    boolean bool = this.oxS;
    GMTrace.o(6105832882176L, 45492);
    return bool;
  }
  
  public final void bdi()
  {
    GMTrace.i(16030428561408L, 119436);
    this.oyH = true;
    this.oyG = true;
    this.oxQ.bcO();
    GMTrace.o(16030428561408L, 119436);
  }
  
  protected final void d(Point paramPoint)
  {
    GMTrace.i(6105161793536L, 45487);
    this.oxJ = null;
    this.oyM = null;
    super.d(paramPoint);
    bdf();
    GMTrace.o(6105161793536L, 45487);
  }
  
  public final void gL(boolean paramBoolean)
  {
    GMTrace.i(6107980365824L, 45508);
    if (this.oxQ == null)
    {
      w.e("MicroMsg.scanner.ScanModeQRCode", "continueScan, scanUICallback == null");
      GMTrace.o(6107980365824L, 45508);
      return;
    }
    if (paramBoolean)
    {
      this.oyG = false;
      this.oxQ.gZ(false);
      GMTrace.o(6107980365824L, 45508);
      return;
    }
    this.oxQ.bcT().finish();
    this.oxQ.bcT().overridePendingTransition(0, 0);
    GMTrace.o(6107980365824L, 45508);
  }
  
  public final Context getContext()
  {
    GMTrace.i(6107846148096L, 45507);
    if (this.oxQ == null)
    {
      w.e("MicroMsg.scanner.ScanModeQRCode", "getContext(), scanUICallback == null");
      GMTrace.o(6107846148096L, 45507);
      return null;
    }
    Activity localActivity = this.oxQ.bcT();
    GMTrace.o(6107846148096L, 45507);
    return localActivity;
  }
  
  protected final void h(Rect paramRect)
  {
    GMTrace.i(6105967099904L, 45493);
    this.oyI = ((TextView)this.oxQ.findViewById(R.h.bZM));
    this.oyI.setOnClickListener(this.oyN);
    this.iuc = ((TextView)this.oxQ.findViewById(R.h.bZJ));
    if (paramRect.bottom > 0)
    {
      this.oyI.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iuc.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.a(this.oxQ.bcT(), 13.0F));
      this.iuc.setLayoutParams(localLayoutParams);
    }
    if (this.oxK != null) {
      ((d)this.oxK).naa = this.oxQ.bcP();
    }
    bdd();
    if (this.mMode == 2) {
      this.iuc.setText(R.l.dOM);
    }
    for (;;)
    {
      hb(true);
      GMTrace.o(6105967099904L, 45493);
      return;
      if (this.mMode == 1) {
        this.iuc.setText(R.l.dOL);
      } else if (this.eDC == 1) {
        this.iuc.setText(R.l.dPf);
      } else if (this.eDC == 2) {
        this.iuc.setText(R.l.ekt);
      } else {
        this.iuc.setText(R.l.dPg);
      }
    }
  }
  
  protected final Rect hc(boolean paramBoolean)
  {
    GMTrace.i(6105564446720L, 45490);
    int i1 = this.oxL.x;
    int i2 = this.oxL.y;
    int j = BackwardSupportUtil.b.a(this.oxQ.bcT(), this.oxO);
    if (!this.oxQ.bcP()) {
      j = 0;
    }
    for (;;)
    {
      int m;
      int i;
      int n;
      int k;
      if (!paramBoolean) {
        if (i1 < i2)
        {
          m = i1 / 2 - this.oyK / 2;
          i = i1 / 2;
          n = this.oyK / 2 + i;
          k = i2 / 2 - this.oyL / 2;
          i = k;
          if (k - j > 0) {
            i = k - j;
          }
          k = this.oyL + i;
          j = n;
        }
      }
      for (;;)
      {
        w.d("MicroMsg.scanner.ScanModeQRCode", "qrCodeScanFrameRect: width = %s, height = %s; left = %s, right = %s, top = %s, bottom = %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
        this.oyM = new Rect(m, i, j, k);
        Rect localRect = this.oyM;
        GMTrace.o(6105564446720L, 45490);
        return localRect;
        m = i2 / 2 - this.oyK / 2;
        i = i2 / 2;
        k = this.oyK / 2 + i;
        n = i1 / 2 - this.oyL / 2;
        i = n;
        if (n - j > 0) {
          i = n - j;
        }
        n = this.oyL + i;
        j = k;
        k = n;
        continue;
        if (i1 < i2)
        {
          m = i2 / 2 - this.oyK / 2;
          i = i2 / 2;
          j = this.oyK / 2 + i;
          i = BackwardSupportUtil.b.a(this.oxQ.bcT(), this.oxP);
          k = this.oyL + i;
        }
        else
        {
          m = i1 / 2 - this.oyK / 2;
          i = i1 / 2;
          j = this.oyK / 2 + i;
          i = BackwardSupportUtil.b.a(this.oxQ.bcT(), this.oxP);
          k = this.oyL + i;
        }
      }
    }
  }
  
  public final boolean isPause()
  {
    GMTrace.i(6108383019008L, 45511);
    boolean bool = this.eIE;
    GMTrace.o(6108383019008L, 45511);
    return bool;
  }
  
  protected final void onPause()
  {
    GMTrace.i(6107443494912L, 45504);
    super.onPause();
    hb(false);
    at.wS().b(1061, this);
    at.wS().b(666, this);
    at.wS().b(971, this);
    GMTrace.o(6107443494912L, 45504);
  }
  
  protected final void onResume()
  {
    GMTrace.i(6107309277184L, 45503);
    at.wS().a(1061, this);
    at.wS().a(666, this);
    at.wS().a(971, this);
    if (this.oxQ == null)
    {
      w.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      GMTrace.o(6107309277184L, 45503);
      return;
    }
    if (!this.oyH) {
      this.oyG = false;
    }
    bdd();
    GMTrace.o(6107309277184L, 45503);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */