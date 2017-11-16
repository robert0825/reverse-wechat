package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.g.a.od;
import com.tencent.mm.plugin.scanner.util.l;
import com.tencent.mm.protocal.c.hp;
import com.tencent.mm.protocal.c.hq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public abstract class c
  extends i
  implements com.tencent.mm.plugin.scanner.util.b.a
{
  private long ouk;
  public int oul;
  private HighlightRectSideView oum;
  public k oun;
  private r ouo;
  private com.tencent.mm.ui.base.i oup;
  
  public c(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint);
    GMTrace.i(6121804791808L, 45611);
    this.oul = 0;
    this.oun = null;
    this.ouo = null;
    this.oup = null;
    this.oxO = 0;
    this.oxP = 0;
    float f = bcu();
    int i;
    if (paramInt == 1)
    {
      paramPoint = new Point(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);
      i = (int)(paramPoint.y * 0.8F);
      paramInt = (int)(paramPoint.x * 0.8F);
      if (i * f <= paramPoint.x) {
        break label242;
      }
      i = (int)(paramInt / f);
    }
    for (;;)
    {
      Point localPoint = new Point((int)(paramInt / paramDisplayMetrics.density), (int)(i / paramDisplayMetrics.density));
      this.oxP = ((int)((paramPoint.y / paramDisplayMetrics.density - localPoint.y) / 2.0F));
      cP(localPoint.x, localPoint.y);
      if (bg.eD(paramb.bcT()) >= 100L) {
        break label254;
      }
      w.w("MicroMsg.BaseScanModeLicence", "memory is not much");
      this.ouk = 280L;
      GMTrace.o(6121804791808L, 45611);
      return;
      paramPoint = new Point(paramDisplayMetrics.heightPixels, paramDisplayMetrics.widthPixels);
      break;
      label242:
      paramInt = (int)(i * f);
    }
    label254:
    this.ouk = 80L;
    GMTrace.o(6121804791808L, 45611);
  }
  
  private void bcE()
  {
    GMTrace.i(6124086493184L, 45628);
    boolean[] arrayOfBoolean = ((l)this.oxK).bdy();
    this.oum.a(arrayOfBoolean);
    this.oxQ.dk(this.ouk);
    GMTrace.o(6124086493184L, 45628);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(6124354928640L, 45630);
    GMTrace.o(6124354928640L, 45630);
  }
  
  public final void FO(final String paramString)
  {
    GMTrace.i(16030562779136L, 119437);
    if (this.oup != null) {
      this.oup.dismiss();
    }
    this.oup = h.a(this.oxQ.bcT(), R.l.dVq, R.l.cUG, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6147306160128L, 45801);
        at.wS().c(c.this.oun);
        paramAnonymousDialogInterface = new od();
        paramAnonymousDialogInterface.eTb.cardType = paramString;
        paramAnonymousDialogInterface.eTb.eTc = 2;
        a.vgX.m(paramAnonymousDialogInterface);
        c.this.oxQ.bcT().finish();
        GMTrace.o(6147306160128L, 45801);
      }
    }, null);
    GMTrace.o(16030562779136L, 119437);
  }
  
  protected abstract com.tencent.mm.plugin.scanner.util.b a(com.tencent.mm.plugin.scanner.util.b.a parama);
  
  public void a(int paramInt1, final String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6123818057728L, 45626);
    w.d("MicroMsg.BaseScanModeLicence", "onDecodeSuccess");
    paramArrayOfByte = ((l)this.oxK).oBo;
    paramString = bcv();
    if (this.ouo != null) {
      this.ouo.dismiss();
    }
    Object localObject1 = this.oxQ.bcT();
    ((Context)localObject1).getString(R.l.cUG);
    this.ouo = h.a((Context)localObject1, ((Context)localObject1).getString(R.l.dVu), false, null);
    this.ouo.setOnKeyListener(new DialogInterface.OnKeyListener()
    {
      public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(6120059961344L, 45598);
        if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
        {
          c.this.FO(paramString);
          GMTrace.o(6120059961344L, 45598);
          return true;
        }
        GMTrace.o(6120059961344L, 45598);
        return false;
      }
    });
    localObject1 = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject1).gtF = new hp();
    ((com.tencent.mm.ad.b.a)localObject1).gtG = new hq();
    ((com.tencent.mm.ad.b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanlicense";
    ((com.tencent.mm.ad.b.a)localObject1).gtE = 1803;
    localObject1 = ((com.tencent.mm.ad.b.a)localObject1).DA();
    Object localObject2 = new ByteArrayOutputStream();
    if (!paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, 80, (OutputStream)localObject2))
    {
      p(2, paramString, "");
      GMTrace.o(6123818057728L, 45626);
      return;
    }
    paramArrayOfByte = ((ByteArrayOutputStream)localObject2).toByteArray();
    if (bg.bq(paramArrayOfByte))
    {
      p(2, paramString, "");
      GMTrace.o(6123818057728L, 45626);
      return;
    }
    localObject2 = (hp)((com.tencent.mm.ad.b)localObject1).gtC.gtK;
    ((hp)localObject2).tWB = new com.tencent.mm.bm.b(paramArrayOfByte);
    if (paramString.equals("driving")) {
      ((hp)localObject2).tWA = 0;
    }
    for (;;)
    {
      this.oun = u.a((com.tencent.mm.ad.b)localObject1, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(6067849265152L, 45209);
          w.i("MicroMsg.BaseScanModeLicence", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          paramAnonymousString = c.this;
          paramAnonymousString.oul += 1;
          paramAnonymousString = (hq)paramAnonymousb.gtD.gtK;
          c.this.p(paramAnonymousInt2, paramString, paramAnonymousString.tWC);
          GMTrace.o(6067849265152L, 45209);
          return 0;
        }
      }, false);
      GMTrace.o(6123818057728L, 45626);
      return;
      if (paramString.equals("identity")) {
        ((hp)localObject2).tWA = 1;
      }
    }
  }
  
  protected final int bcA()
  {
    GMTrace.i(6123012751360L, 45620);
    GMTrace.o(6123012751360L, 45620);
    return 0;
  }
  
  protected final void bcB()
  {
    GMTrace.i(6123146969088L, 45621);
    GMTrace.o(6123146969088L, 45621);
  }
  
  protected final boolean bcC()
  {
    GMTrace.i(6123415404544L, 45623);
    GMTrace.o(6123415404544L, 45623);
    return false;
  }
  
  protected final boolean bcD()
  {
    GMTrace.i(6123549622272L, 45624);
    GMTrace.o(6123549622272L, 45624);
    return false;
  }
  
  public final void bct()
  {
    GMTrace.i(6123952275456L, 45627);
    w.d("MicroMsg.BaseScanModeLicence", "onDecodeFail");
    if (this.oxQ == null)
    {
      w.e("MicroMsg.BaseScanModeLicence", "ui callback is null");
      GMTrace.o(6123952275456L, 45627);
      return;
    }
    bcE();
    GMTrace.o(6123952275456L, 45627);
  }
  
  protected abstract float bcu();
  
  protected abstract String bcv();
  
  protected abstract int bcw();
  
  protected final void bcx()
  {
    GMTrace.i(6122610098176L, 45617);
    GMTrace.o(6122610098176L, 45617);
  }
  
  protected final com.tencent.mm.plugin.scanner.util.b bcy()
  {
    GMTrace.i(6122744315904L, 45618);
    if (this.oxK == null) {
      this.oxK = a(this);
    }
    com.tencent.mm.plugin.scanner.util.b localb = this.oxK;
    GMTrace.o(6122744315904L, 45618);
    return localb;
  }
  
  protected final int bcz()
  {
    GMTrace.i(6122878533632L, 45619);
    int i = R.i.cFh;
    GMTrace.o(6122878533632L, 45619);
    return i;
  }
  
  protected final void co(View paramView)
  {
    GMTrace.i(6123281186816L, 45622);
    if (paramView != null)
    {
      TextView localTextView = (TextView)paramView.findViewById(R.h.blK);
      if (localTextView != null) {
        localTextView.setText(paramView.getContext().getString(R.l.dVp, new Object[] { paramView.getContext().getString(bcw()) }));
      }
    }
    GMTrace.o(6123281186816L, 45622);
  }
  
  protected final void h(Rect paramRect)
  {
    GMTrace.i(6123683840000L, 45625);
    w.d("MicroMsg.BaseScanModeLicence", "smoothie, maskRect = %s", new Object[] { paramRect });
    HighlightRectSideView localHighlightRectSideView = (HighlightRectSideView)this.oxQ.findViewById(R.h.bkm);
    if (localHighlightRectSideView != null) {
      localHighlightRectSideView.i(paramRect);
    }
    this.oum = localHighlightRectSideView;
    GMTrace.o(6123683840000L, 45625);
  }
  
  protected final void onResume()
  {
    GMTrace.i(6122475880448L, 45616);
    GMTrace.o(6122475880448L, 45616);
  }
  
  public final void p(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6124220710912L, 45629);
    if (paramInt == 0)
    {
      localod = new od();
      localod.eTb.cardType = paramString1;
      localod.eTb.eTc = 1;
      localod.eTb.eTd = paramString2;
      if ((this.oxK instanceof l)) {
        localod.eTb.eTe = ((l)this.oxK).oBo;
      }
      a.vgX.a(localod, Looper.getMainLooper());
      if (this.ouo != null) {
        this.ouo.dismiss();
      }
      this.oxQ.bcT().finish();
      GMTrace.o(6124220710912L, 45629);
      return;
    }
    if (((paramInt & 0x2) > 0) && ((paramInt & 0x1) > 0))
    {
      localod = new od();
      localod.eTb.cardType = paramString1;
      localod.eTb.eTc = 0;
      localod.eTb.eTd = paramString2;
      a.vgX.a(localod, Looper.getMainLooper());
      if (this.ouo != null) {
        this.ouo.dismiss();
      }
      this.oxQ.bcT().finish();
      GMTrace.o(6124220710912L, 45629);
      return;
    }
    if (this.oul >= 3)
    {
      localod = new od();
      localod.eTb.cardType = paramString1;
      localod.eTb.eTc = 1;
      localod.eTb.eTd = paramString2;
      if ((this.oxK instanceof l)) {
        localod.eTb.eTe = ((l)this.oxK).oBo;
      }
      a.vgX.a(localod, Looper.getMainLooper());
      if (this.ouo != null) {
        this.ouo.dismiss();
      }
      this.oxQ.bcT().finish();
      GMTrace.o(6124220710912L, 45629);
      return;
    }
    if (((paramInt & 0x1) > 0) && (this.oul < 3))
    {
      if (this.ouo != null) {
        this.ouo.dismiss();
      }
      bcy().bdl();
      if ((paramInt & 0x20) > 0) {
        paramInt = R.l.dVs;
      }
      for (;;)
      {
        Toast.makeText(this.oxQ.bcT(), paramInt, 0).show();
        bcE();
        GMTrace.o(6124220710912L, 45629);
        return;
        if ((paramInt & 0x40) > 0) {
          paramInt = R.l.dVt;
        } else {
          paramInt = R.l.dVr;
        }
      }
    }
    od localod = new od();
    localod.eTb.cardType = paramString1;
    localod.eTb.eTc = 0;
    localod.eTb.eTd = paramString2;
    a.vgX.a(localod, Looper.getMainLooper());
    if (this.ouo != null) {
      this.ouo.dismiss();
    }
    this.oxQ.bcT().finish();
    GMTrace.o(6124220710912L, 45629);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */