package com.tencent.mm.plugin.offline.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.r;

public class OfflineAlertView
  extends LinearLayout
{
  private View hqF;
  RelativeLayout nBA;
  boolean nBB;
  a nBC;
  public int nBz;
  
  public OfflineAlertView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6234279247872L, 46449);
    this.nBz = 0;
    this.hqF = null;
    this.nBA = null;
    this.nBB = true;
    this.nBC = null;
    init();
    GMTrace.o(6234279247872L, 46449);
  }
  
  public OfflineAlertView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6234413465600L, 46450);
    this.nBz = 0;
    this.hqF = null;
    this.nBA = null;
    this.nBB = true;
    this.nBC = null;
    init();
    GMTrace.o(6234413465600L, 46450);
  }
  
  private void init()
  {
    GMTrace.i(6234547683328L, 46451);
    this.hqF = LayoutInflater.from(getContext()).inflate(a.g.sPE, this);
    this.nBA = ((RelativeLayout)this.hqF.findViewById(a.f.sCP));
    GMTrace.o(6234547683328L, 46451);
  }
  
  final void a(final View paramView, View.OnClickListener paramOnClickListener, int paramInt)
  {
    GMTrace.i(15383901765632L, 114619);
    this.nBz = paramInt;
    setVisibility(0);
    this.nBA.removeAllViews();
    View localView = LayoutInflater.from(getContext()).inflate(a.g.sPN, null);
    if (paramInt == 6) {
      ((TextView)localView.findViewById(a.f.spL)).setText(a.i.sWu);
    }
    this.nBA.addView(localView);
    ((Button)this.hqF.findViewById(a.f.bGm)).setOnClickListener(paramOnClickListener);
    this.nBB = false;
    paramView.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6233473941504L, 46443);
        w.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", new Object[] { Integer.valueOf(paramView.getHeight()), Integer.valueOf(paramView.getMeasuredHeight()) });
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)OfflineAlertView.a(OfflineAlertView.this).getLayoutParams();
        if (paramView.getHeight() > 0)
        {
          localLayoutParams.height = paramView.getHeight();
          OfflineAlertView.a(OfflineAlertView.this).setLayoutParams(localLayoutParams);
          OfflineAlertView.a(OfflineAlertView.this).invalidate();
        }
        if (OfflineAlertView.b(OfflineAlertView.this) != null) {
          OfflineAlertView.b(OfflineAlertView.this).onShow();
        }
        GMTrace.o(6233473941504L, 46443);
      }
    });
    GMTrace.o(15383901765632L, 114619);
  }
  
  public final void dismiss()
  {
    GMTrace.i(6235084554240L, 46455);
    if (this.nBA != null) {
      this.nBA.removeAllViews();
    }
    setVisibility(8);
    if (this.nBC != null) {
      this.nBC.onClose();
    }
    this.nBB = true;
    GMTrace.o(6235084554240L, 46455);
  }
  
  public final boolean isShowing()
  {
    GMTrace.i(6234816118784L, 46453);
    if (getVisibility() == 0)
    {
      GMTrace.o(6234816118784L, 46453);
      return true;
    }
    GMTrace.o(6234816118784L, 46453);
    return false;
  }
  
  public final boolean sg(int paramInt)
  {
    GMTrace.i(6234950336512L, 46454);
    if (isShowing())
    {
      if (paramInt == this.nBz)
      {
        GMTrace.o(6234950336512L, 46454);
        return true;
      }
      if ((paramInt == 2) && ((this.nBz == 3) || (this.nBz == 4) || (this.nBz == 2) || (this.nBz == 5)))
      {
        GMTrace.o(6234950336512L, 46454);
        return true;
      }
      if ((paramInt == 5) && (this.nBz == 4))
      {
        GMTrace.o(6234950336512L, 46454);
        return true;
      }
      if (paramInt == 6)
      {
        GMTrace.o(6234950336512L, 46454);
        return true;
      }
      GMTrace.o(6234950336512L, 46454);
      return false;
    }
    GMTrace.o(6234950336512L, 46454);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void onClose();
    
    public abstract void onShow();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\ui\OfflineAlertView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */