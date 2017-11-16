package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MemberCardTopCropImageView
  extends ImageView
{
  protected int itemPadding;
  protected int jJp;
  protected int jMw;
  private float jMx;
  
  public MemberCardTopCropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4883780468736L, 36387);
    this.jMw = -1;
    this.jJp = -1;
    this.itemPadding = -1;
    init();
    GMTrace.o(4883780468736L, 36387);
  }
  
  public MemberCardTopCropImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4883914686464L, 36388);
    this.jMw = -1;
    this.jJp = -1;
    this.itemPadding = -1;
    init();
    GMTrace.o(4883914686464L, 36388);
  }
  
  private void init()
  {
    GMTrace.i(4884048904192L, 36389);
    setScaleType(ImageView.ScaleType.MATRIX);
    this.jJp = a.V(ab.getContext(), R.f.aRk);
    this.itemPadding = (a.V(ab.getContext(), R.f.aQw) * 2);
    GMTrace.o(4884048904192L, 36389);
  }
  
  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(4884183121920L, 36390);
    boolean bool;
    if (getDrawable() == null)
    {
      bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      GMTrace.o(4884183121920L, 36390);
      return bool;
    }
    Matrix localMatrix = getImageMatrix();
    int i = getDrawable().getIntrinsicWidth();
    int j = getDrawable().getIntrinsicHeight();
    this.jMw = (getContext().getResources().getDisplayMetrics().widthPixels - this.itemPadding);
    int k = this.jMw;
    int m = this.jJp;
    if (i * m > j * k) {}
    for (this.jMx = (m / j);; this.jMx = (k / i))
    {
      localMatrix.setScale(this.jMx, this.jMx);
      setImageMatrix(localMatrix);
      bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      GMTrace.o(4884183121920L, 36390);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\widget\MemberCardTopCropImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */