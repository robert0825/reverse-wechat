package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.v.a.d;

public class MMImageButton
  extends FrameLayout
{
  private ImageView eKZ;
  private TextView nJt;
  
  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3183644508160L, 23720);
    GMTrace.o(3183644508160L, 23720);
  }
  
  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3183778725888L, 23721);
    paramAttributeSet = new FrameLayout.LayoutParams(-2, -2);
    paramAttributeSet.gravity = 17;
    this.eKZ = new ImageView(paramContext);
    this.eKZ.setLayoutParams(paramAttributeSet);
    addView(this.eKZ);
    paramAttributeSet = new FrameLayout.LayoutParams(-2, -2);
    paramAttributeSet.gravity = 17;
    this.nJt = new TextView(paramContext);
    this.nJt.setLayoutParams(paramAttributeSet);
    this.nJt.setClickable(false);
    this.nJt.setFocusable(false);
    this.nJt.setFocusableInTouchMode(false);
    this.nJt.setTextColor(a.U(paramContext, a.d.gcq));
    addView(this.nJt);
    GMTrace.o(3183778725888L, 23721);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(3183912943616L, 23722);
    super.setEnabled(paramBoolean);
    this.nJt.setEnabled(paramBoolean);
    this.eKZ.setEnabled(paramBoolean);
    GMTrace.o(3183912943616L, 23722);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */