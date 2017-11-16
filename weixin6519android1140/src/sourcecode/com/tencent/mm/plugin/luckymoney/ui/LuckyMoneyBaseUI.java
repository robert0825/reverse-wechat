package com.tencent.mm.plugin.luckymoney.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.c;

public abstract class LuckyMoneyBaseUI
  extends MMActivity
  implements c
{
  public i mMW;
  private j mMX;
  
  public LuckyMoneyBaseUI()
  {
    GMTrace.i(9878827433984L, 73603);
    this.mMW = null;
    this.mMX = null;
    GMTrace.o(9878827433984L, 73603);
  }
  
  public final void aMA()
  {
    GMTrace.i(9879364304896L, 73607);
    j localj = this.mMX;
    if (localj.hyB.cN().cO() != null) {
      localj.hyB.cN().cO().show();
    }
    localj = this.mMX;
    j.a locala = j.B(localj.hyB, localj.mQF);
    if (locala.mQL != 0) {
      localj.qi(locala.mQL);
    }
    GMTrace.o(9879364304896L, 73607);
  }
  
  public final void aMB()
  {
    GMTrace.i(9879498522624L, 73608);
    j localj = this.mMX;
    if (localj.hyB.cN().cO() != null) {
      localj.hyB.cN().cO().hide();
    }
    localj = this.mMX;
    localj.qi(localj.mQG);
    GMTrace.o(9879498522624L, 73608);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(9879901175808L, 73611);
    if ((!d(paramInt1, paramInt2, paramString, paramk)) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      h.bm(this, paramString);
      finish();
    }
    GMTrace.o(9879901175808L, 73611);
  }
  
  public final void b(k paramk, boolean paramBoolean)
  {
    GMTrace.i(9880438046720L, 73615);
    this.mMW.b(paramk, paramBoolean);
    GMTrace.o(9880438046720L, 73615);
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public final void hN(int paramInt)
  {
    GMTrace.i(9880169611264L, 73613);
    this.mMW.hN(paramInt);
    GMTrace.o(9880169611264L, 73613);
  }
  
  public final void hO(int paramInt)
  {
    GMTrace.i(9880303828992L, 73614);
    this.mMW.hO(paramInt);
    GMTrace.o(9880303828992L, 73614);
  }
  
  public final void l(k paramk)
  {
    GMTrace.i(9880572264448L, 73616);
    this.mMW.b(paramk, true);
    GMTrace.o(9880572264448L, 73616);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9879095869440L, 73605);
    super.onCreate(paramBundle);
    this.mMW = new i(this, this);
    this.mMW.hN(1554);
    this.mMW.hN(1575);
    this.mMW.hN(1668);
    this.mMW.hN(1581);
    this.mMW.hN(1685);
    this.mMW.hN(1585);
    this.mMW.hN(1514);
    this.mMW.hN(1682);
    this.mMW.hN(1612);
    this.mMW.hN(1643);
    this.mMW.hN(1558);
    this.mMX = new j(this);
    this.mMX.mQF = 1;
    paramBundle = this.mMX;
    j.a locala = j.B(paramBundle.hyB, paramBundle.mQF);
    if (paramBundle.hyB.cN().cO() != null)
    {
      if (locala.mQH != null) {
        paramBundle.hyB.cN().cO().setBackgroundDrawable(locala.mQH);
      }
      Object localObject1 = paramBundle.hyB.cN().cO().getCustomView();
      if (localObject1 != null)
      {
        Object localObject2 = ((View)localObject1).findViewById(a.f.divider);
        if ((localObject2 != null) && (locala.iSn != 0)) {
          ((View)localObject2).setBackgroundColor(locala.iSn);
        }
        localObject2 = (TextView)((View)localObject1).findViewById(16908308);
        if ((localObject2 != null) && (locala.mQI != 0)) {
          ((TextView)localObject2).setTextColor(locala.mQI);
        }
        localObject2 = (TextView)((View)localObject1).findViewById(16908309);
        if ((localObject2 != null) && (locala.mQJ != 0)) {
          ((TextView)localObject2).setTextColor(locala.mQJ);
        }
        localObject1 = (ImageView)((View)localObject1).findViewById(a.f.bcM);
        if ((localObject1 != null) && (locala.mQK != 0)) {
          ((ImageView)localObject1).setImageResource(locala.mQK);
        }
      }
      if (locala.mQL != 0) {
        paramBundle.qi(locala.mQL);
      }
    }
    getLayoutId();
    GMTrace.o(9879095869440L, 73605);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9879632740352L, 73609);
    this.mMW.hO(1554);
    this.mMW.hO(1575);
    this.mMW.hO(1668);
    this.mMW.hO(1581);
    this.mMW.hO(1685);
    this.mMW.hO(1585);
    this.mMW.hO(1514);
    this.mMW.hO(1682);
    this.mMW.hO(1612);
    this.mMW.hO(1643);
    this.mMW.hO(1558);
    this.mMX = null;
    super.onDestroy();
    GMTrace.o(9879632740352L, 73609);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9879766958080L, 73610);
    if (paramInt == 4)
    {
      if (this.mMW.aMd()) {
        this.mMW.aMc();
      }
      if ((this.vKB.hqF.getVisibility() == 8) || (this.vKB.hqF.getVisibility() == 4)) {
        finish();
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(9879766958080L, 73610);
    return bool;
  }
  
  public final void q(Drawable paramDrawable)
  {
    GMTrace.i(9879230087168L, 73606);
    j localj = this.mMX;
    if (localj.hyB.cN().cO() != null) {
      localj.hyB.cN().cO().setBackgroundDrawable(paramDrawable);
    }
    GMTrace.o(9879230087168L, 73606);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */