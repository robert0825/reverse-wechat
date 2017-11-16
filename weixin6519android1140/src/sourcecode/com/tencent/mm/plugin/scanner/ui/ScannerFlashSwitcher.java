package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;

public class ScannerFlashSwitcher
  extends LinearLayout
{
  ImageView oze;
  TextView ozf;
  boolean ozg;
  
  public ScannerFlashSwitcher(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6126233976832L, 45644);
    this.ozg = false;
    init();
    GMTrace.o(6126233976832L, 45644);
  }
  
  public ScannerFlashSwitcher(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6126368194560L, 45645);
    this.ozg = false;
    init();
    GMTrace.o(6126368194560L, 45645);
  }
  
  private void init()
  {
    GMTrace.i(6126502412288L, 45646);
    v.fb(getContext()).inflate(R.i.bZO, this, true);
    this.oze = ((ImageView)findViewById(R.h.bAm));
    this.ozf = ((TextView)findViewById(R.h.bAl));
    this.ozg = true;
    GMTrace.o(6126502412288L, 45646);
  }
  
  public final void bdj()
  {
    GMTrace.i(6126770847744L, 45648);
    w.i("MicroMsg.ScannerFlashSwitcher", "closeFlashStatus");
    this.oze.setImageResource(R.k.cOA);
    GMTrace.o(6126770847744L, 45648);
  }
  
  public final void hide()
  {
    GMTrace.i(6126636630016L, 45647);
    w.i("MicroMsg.ScannerFlashSwitcher", "hide");
    setEnabled(false);
    this.oze.animate().alpha(0.0F).setDuration(500L);
    this.ozf.animate().alpha(0.0F).setDuration(500L).setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(6134689693696L, 45707);
        ScannerFlashSwitcher.this.setVisibility(8);
        GMTrace.o(6134689693696L, 45707);
      }
    });
    GMTrace.o(6126636630016L, 45647);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ScannerFlashSwitcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */