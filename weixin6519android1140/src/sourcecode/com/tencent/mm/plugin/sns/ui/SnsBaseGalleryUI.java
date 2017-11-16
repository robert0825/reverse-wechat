package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.l;

public abstract class SnsBaseGalleryUI
  extends MMActivity
  implements t.a
{
  private boolean jpN;
  private LinearLayout pXY;
  s pXZ;
  private LinearLayout pYa;
  t pYb;
  private boolean pYc;
  private TextView pYd;
  protected SnsInfoFlip pYe;
  protected Button pYf;
  
  public SnsBaseGalleryUI()
  {
    GMTrace.i(8402969296896L, 62607);
    this.pYc = true;
    this.jpN = true;
    this.pYd = null;
    GMTrace.o(8402969296896L, 62607);
  }
  
  public final void addView(View paramView)
  {
    GMTrace.i(8403371950080L, 62610);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.pXY.addView(paramView, localLayoutParams);
    GMTrace.o(8403371950080L, 62610);
  }
  
  public void ahC()
  {
    int j = 8;
    boolean bool = false;
    GMTrace.i(8404445691904L, 62618);
    if (!this.pYc)
    {
      GMTrace.o(8404445691904L, 62618);
      return;
    }
    s locals;
    if (this.jpN)
    {
      i = 8;
      AU(i);
      if (this.pXZ != null)
      {
        locals = this.pXZ;
        if (!this.jpN) {
          break label100;
        }
      }
    }
    label100:
    for (int i = j;; i = 0)
    {
      locals.setVisibility(i);
      if (!this.jpN) {
        bool = true;
      }
      this.jpN = bool;
      GMTrace.o(8404445691904L, 62618);
      return;
      i = 0;
      break;
    }
  }
  
  public void bT(String paramString, int paramInt)
  {
    GMTrace.i(8404311474176L, 62617);
    GMTrace.o(8404311474176L, 62617);
  }
  
  public void bU(String paramString, int paramInt)
  {
    GMTrace.i(8403908820992L, 62614);
    if ((!this.pYc) || (ae.biM()))
    {
      GMTrace.o(8403908820992L, 62614);
      return;
    }
    paramString = ae.bjd().Is(paramString);
    if ((paramString == null) || (paramString.field_snsId == 0L))
    {
      lf(false);
      GMTrace.o(8403908820992L, 62614);
      return;
    }
    lf(true);
    GMTrace.o(8403908820992L, 62614);
  }
  
  public final void bnw()
  {
    GMTrace.i(8404579909632L, 62619);
    this.jpN = false;
    AU(8);
    if (this.pXZ != null) {
      this.pXZ.setVisibility(8);
    }
    GMTrace.o(8404579909632L, 62619);
  }
  
  public final void dR(String paramString1, String paramString2)
  {
    GMTrace.i(8404177256448L, 62616);
    if (!this.pYc)
    {
      GMTrace.o(8404177256448L, 62616);
      return;
    }
    sq(paramString1);
    Ve(paramString2);
    GMTrace.o(8404177256448L, 62616);
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(8403774603264L, 62613);
    int i = i.g.pfH;
    GMTrace.o(8403774603264L, 62613);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8403103514624L, 62608);
    super.onCreate(paramBundle);
    ae.biY().E(3, true);
    this.pXY = ((LinearLayout)findViewById(i.f.pbe));
    this.pYa = ((LinearLayout)findViewById(i.f.content));
    this.pYb = new t(this, this);
    paramBundle = this.pYb;
    w.i("MicroMsg.GalleryTitleManager", "onAttach");
    h.xz();
    h.xx().fYr.a(218, paramBundle);
    a.vgX.b(paramBundle.leg);
    a.vgX.b(paramBundle.pSq);
    GMTrace.o(8403103514624L, 62608);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8403640385536L, 62612);
    super.onDestroy();
    Object localObject;
    if (this.pYb != null)
    {
      localObject = this.pYb;
      w.i("MicroMsg.GalleryTitleManager", "onDetch");
      h.xz();
      h.xx().fYr.b(218, (e)localObject);
      a.vgX.c(((t)localObject).leg);
      a.vgX.c(((t)localObject).pSq);
    }
    if (this.pYe != null)
    {
      localObject = this.pYe;
      if ((((SnsInfoFlip)localObject).qaT != null) && ((((SnsInfoFlip)localObject).qaT instanceof MMGestureGallery)))
      {
        localObject = (MMGestureGallery)((SnsInfoFlip)localObject).qaT;
        ((MMGestureGallery)localObject).xhC.release();
        ((MMGestureGallery)localObject).xhD.release();
        ((MMGestureGallery)localObject).xhB.release();
      }
      this.pYe.onDestroy();
    }
    GMTrace.o(8403640385536L, 62612);
  }
  
  protected void onPause()
  {
    GMTrace.i(8404043038720L, 62615);
    if (this.pYe != null) {
      this.pYe.onPause();
    }
    if (this.pYb != null)
    {
      t localt = this.pYb;
      if (localt.pSn != null)
      {
        ak localak = new ak();
        localak.eBA.activity = ((Activity)localt.context);
        localak.eBA.eBB = localt.pSn;
        a.vgX.m(localak);
        localt.pSn = null;
        localt.eDh = 0;
        localt.eDg = 0;
      }
    }
    super.onPause();
    GMTrace.o(8404043038720L, 62615);
  }
  
  public void onResume()
  {
    GMTrace.i(8403237732352L, 62609);
    super.onResume();
    if (this.pXZ != null) {
      this.pXZ.refresh();
    }
    GMTrace.o(8403237732352L, 62609);
  }
  
  @SuppressLint({"ResourceAsColor"})
  public final void r(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8403506167808L, 62611);
    this.pXZ = new s(this, paramInt, paramBoolean);
    this.pXZ.setBackgroundColor(i.c.transparent);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.pXZ.getBackground().setAlpha(50);
    this.pYa.addView(this.pXZ, localLayoutParams);
    paramInt = getIntent().getIntExtra("sns_source", 0);
    this.pXZ.eHm = paramInt;
    GMTrace.o(8403506167808L, 62611);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsBaseGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */