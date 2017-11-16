package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;

public final class j
  extends i
  implements b.a
{
  private long ouk;
  private HighlightRectSideView oxX;
  boolean oxY;
  private View.OnClickListener oxZ;
  
  public j(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint);
    GMTrace.i(6156432965632L, 45869);
    this.oxY = false;
    this.oxZ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6136434524160L, 45720);
        paramAnonymousView = ((LayoutInflater)j.this.oxQ.bcT().getSystemService("layout_inflater")).inflate(R.i.cEZ, null);
        Activity localActivity = j.this.oxQ.bcT();
        h.a(localActivity, localActivity.getString(R.l.dUU), localActivity.getString(R.l.dUT), paramAnonymousView, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6068654571520L, 45215);
            paramAnonymous2DialogInterface.dismiss();
            GMTrace.o(6068654571520L, 45215);
          }
        }).show();
        GMTrace.o(6136434524160L, 45720);
      }
    };
    if (paramInt == 1) {}
    for (paramPoint = new Point(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);; paramPoint = new Point(paramDisplayMetrics.heightPixels, paramDisplayMetrics.widthPixels))
    {
      paramInt = paramPoint.y - (int)(118.0F * paramDisplayMetrics.density);
      paramPoint = new Point((int)((int)(paramInt * 1.586F) / paramDisplayMetrics.density), (int)(paramInt / paramDisplayMetrics.density));
      paramb.bcT().setResult(0);
      this.oxO = 0;
      this.oxP = 64;
      cP(paramPoint.x, paramPoint.y);
      if (bg.eD(paramb.bcT()) >= 100L) {
        break;
      }
      w.w("MicroMsg.ScanModeBankCard", "memory is not much");
      this.ouk = 280L;
      GMTrace.o(6156432965632L, 45869);
      return;
    }
    this.ouk = 80L;
    GMTrace.o(6156432965632L, 45869);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(6158177796096L, 45882);
    GMTrace.o(6158177796096L, 45882);
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6157640925184L, 45878);
    w.d("MicroMsg.ScanModeBankCard", "decode success, resultType:%d", new Object[] { Integer.valueOf(paramInt1) });
    if (3 != paramInt1)
    {
      w.e("MicroMsg.ScanModeBankCard", "decode success, but result type error:" + paramInt1);
      GMTrace.o(6157640925184L, 45878);
      return;
    }
    paramArrayOfByte = ((g)this.oxK).bdr();
    if (this.oxY)
    {
      this.oxQ.bcR();
      ConfirmScanBankCardResultUI.c(paramArrayOfByte, paramString);
      GMTrace.o(6157640925184L, 45878);
      return;
    }
    ob localob = new ob();
    localob.eSY.cardId = paramString;
    localob.eSY.eSZ = paramArrayOfByte;
    a.vgX.m(localob);
    this.oxQ.bcT().finish();
    GMTrace.o(6157640925184L, 45878);
  }
  
  protected final int bcA()
  {
    GMTrace.i(6157238272000L, 45875);
    GMTrace.o(6157238272000L, 45875);
    return 300;
  }
  
  protected final void bcB()
  {
    GMTrace.i(6157372489728L, 45876);
    GMTrace.o(6157372489728L, 45876);
  }
  
  protected final boolean bcC()
  {
    GMTrace.i(6157909360640L, 45880);
    GMTrace.o(6157909360640L, 45880);
    return false;
  }
  
  protected final boolean bcD()
  {
    GMTrace.i(6158043578368L, 45881);
    GMTrace.o(6158043578368L, 45881);
    return false;
  }
  
  public final void bct()
  {
    GMTrace.i(6157775142912L, 45879);
    w.d("MicroMsg.ScanModeBankCard", "onDecodeFailed");
    if (this.oxQ == null)
    {
      w.e("MicroMsg.ScanModeBankCard", "ui callback is null");
      GMTrace.o(6157775142912L, 45879);
      return;
    }
    boolean[] arrayOfBoolean = ((g)this.oxK).oAH;
    this.oxX.a(arrayOfBoolean);
    this.oxQ.dk(this.ouk);
    GMTrace.o(6157775142912L, 45879);
  }
  
  protected final void bcx()
  {
    GMTrace.i(6156835618816L, 45872);
    GMTrace.o(6156835618816L, 45872);
  }
  
  protected final b bcy()
  {
    GMTrace.i(6156969836544L, 45873);
    if ((this.oxK == null) && (this.oxQ != null)) {
      this.oxK = new g(this, this.oxQ.bcP(), this.oxY);
    }
    b localb = this.oxK;
    GMTrace.o(6156969836544L, 45873);
    return localb;
  }
  
  protected final int bcz()
  {
    GMTrace.i(6157104054272L, 45874);
    int i = R.i.cEY;
    GMTrace.o(6157104054272L, 45874);
    return i;
  }
  
  protected final void h(Rect paramRect)
  {
    GMTrace.i(6157506707456L, 45877);
    LinearLayout localLinearLayout = (LinearLayout)this.oxQ.findViewById(R.h.bgi);
    TextView localTextView = (TextView)this.oxQ.findViewById(R.h.bgl);
    this.oxX = ((HighlightRectSideView)this.oxQ.findViewById(R.h.bgk));
    this.oxX.i(paramRect);
    paramRect = this.oxQ.bcT().getIntent();
    if (paramRect != null)
    {
      paramRect = bg.aq(paramRect.getStringExtra("bank_card_owner"), "");
      localTextView.setText(String.format(this.oxQ.bcT().getResources().getString(R.l.dUV), new Object[] { paramRect }));
    }
    for (;;)
    {
      if (bg.nm(paramRect)) {
        localLinearLayout.setVisibility(8);
      }
      for (;;)
      {
        if ((this.oxK != null) && (this.oxQ != null))
        {
          paramRect = (g)this.oxK;
          boolean bool = this.oxQ.bcP();
          w.d("MicroMsg.ScanBankCardDecoder", "need rotate:" + bool);
          paramRect.oAF = bool;
        }
        GMTrace.o(6157506707456L, 45877);
        return;
        localLinearLayout.setVisibility(0);
        ((ImageView)this.oxQ.findViewById(R.h.bgj)).setOnClickListener(this.oxZ);
      }
      paramRect = null;
    }
  }
  
  protected final void onPause()
  {
    GMTrace.i(6156701401088L, 45871);
    GMTrace.o(6156701401088L, 45871);
  }
  
  protected final void onResume()
  {
    GMTrace.i(6156567183360L, 45870);
    GMTrace.o(6156567183360L, 45870);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */