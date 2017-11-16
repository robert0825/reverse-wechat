package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;

final class a
{
  View mView;
  TextView rye;
  FrameLayout ryf;
  PatternLockView ryg;
  TextView ryh;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(20222048206848L, 150666);
    this.mView = null;
    this.rye = null;
    this.ryf = null;
    this.ryg = null;
    this.ryh = null;
    this.mView = View.inflate(paramActivity, a.e.rvY, null);
    this.rye = ((TextView)this.mView.findViewById(a.d.cHe));
    this.ryf = ((FrameLayout)this.mView.findViewById(a.d.rvU));
    this.ryg = ((PatternLockView)this.mView.findViewById(a.d.rvT));
    this.ryh = ((TextView)this.mView.findViewById(a.d.rvW));
    GMTrace.o(20222048206848L, 150666);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */