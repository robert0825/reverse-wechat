package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;

public class MoonImageView
  extends ImageView
{
  ImageView jpC;
  private final int[] jqV;
  private final double[] jqW;
  
  public MoonImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7647591923712L, 56979);
    this.jqV = new int[] { 0, R.g.aUl, R.g.aUm, R.g.aUn, R.g.aUo, R.g.aUp, R.g.aUq, R.g.aUr };
    this.jqW = new double[] { 0.0D, 20.0D, 35.0D, 50.0D, 60.0D, 50.0D, 35.0D, 20.0D };
    GMTrace.o(7647591923712L, 56979);
  }
  
  public MoonImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7647726141440L, 56980);
    this.jqV = new int[] { 0, R.g.aUl, R.g.aUm, R.g.aUn, R.g.aUo, R.g.aUp, R.g.aUq, R.g.aUr };
    this.jqW = new double[] { 0.0D, 20.0D, 35.0D, 50.0D, 60.0D, 50.0D, 35.0D, 20.0D };
    GMTrace.o(7647726141440L, 56980);
  }
  
  public void setVisibility(int paramInt)
  {
    int i = 2;
    int j = 0;
    GMTrace.i(7647860359168L, 56981);
    Object localObject = new f();
    if (((f)localObject).jqS <= 2)
    {
      i = 0;
      setBackgroundResource(this.jqV[i]);
      localObject = this.jpC;
      switch (i)
      {
      default: 
        j = 170;
      }
    }
    for (;;)
    {
      ((ImageView)localObject).setAlpha(j);
      if (i > 0)
      {
        j = getContext().getResources().getDisplayMetrics().heightPixels / 8;
        double d = this.jqW[i] * 3.141592653589793D / 180.0D;
        i = (int)((1.0D - Math.cos(d)) * j);
        int k = (int)((1.0D - Math.sin(d)) * j);
        localObject = (ViewGroup.MarginLayoutParams)getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).setMargins(j + i, j + k, ((ViewGroup.MarginLayoutParams)localObject).rightMargin, ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
        setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      this.jpC.setVisibility(paramInt);
      super.setVisibility(paramInt);
      GMTrace.o(7647860359168L, 56981);
      return;
      if (((f)localObject).jqS <= 6)
      {
        i = 1;
        break;
      }
      if (((f)localObject).jqS <= 10) {
        break;
      }
      if (((f)localObject).jqS <= 14)
      {
        i = 3;
        break;
      }
      if (((f)localObject).jqS <= 17)
      {
        i = 4;
        break;
      }
      if (((f)localObject).jqS <= 21)
      {
        i = 5;
        break;
      }
      if (((f)localObject).jqS <= 26)
      {
        i = 6;
        break;
      }
      i = 7;
      break;
      j = 255;
      continue;
      j = 170;
      continue;
      j = 127;
      continue;
      j = 85;
      continue;
      j = 85;
      continue;
      j = 127;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\MoonImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */