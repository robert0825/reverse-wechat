package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.R.color;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.b.c.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.zzab;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  private View agK;
  private View.OnClickListener agL = null;
  private int mSize;
  private int rz;
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    w.a(true, "Unknown button size %d", new Object[] { Integer.valueOf(0) });
    w.a(true, "Unknown color scheme %s", new Object[] { Integer.valueOf(0) });
    this.mSize = 0;
    this.rz = 0;
    paramContext = getContext();
    if (this.agK != null) {
      removeView(this.agK);
    }
    try
    {
      this.agK = b.a(paramContext, this.mSize, this.rz);
      addView(this.agK);
      this.agK.setEnabled(isEnabled());
      this.agK.setOnClickListener(this);
      return;
    }
    catch (c.a paramAttributeSet)
    {
      int i = this.mSize;
      int j = this.rz;
      paramAttributeSet = new zzab(paramContext);
      paramContext = paramContext.getResources();
      if ((i >= 0) && (i < 3))
      {
        bool = true;
        label161:
        w.a(bool, "Unknown button size %d", new Object[] { Integer.valueOf(i) });
        if ((j < 0) || (j >= 2)) {
          break label319;
        }
      }
      label319:
      for (boolean bool = true;; bool = false)
      {
        w.a(bool, "Unknown color scheme %s", new Object[] { Integer.valueOf(j) });
        paramAttributeSet.setTypeface(Typeface.DEFAULT_BOLD);
        paramAttributeSet.setTextSize(14.0F);
        float f = paramContext.getDisplayMetrics().density;
        paramAttributeSet.setMinHeight((int)(48.0F * f + 0.5F));
        paramAttributeSet.setMinWidth((int)(f * 48.0F + 0.5F));
        switch (i)
        {
        default: 
          throw new IllegalStateException("Unknown button size: " + i);
          bool = false;
          break label161;
        }
      }
      for (paramInt = zzab.n(j, R.drawable.common_signin_btn_text_dark, R.drawable.common_signin_btn_text_light); paramInt == -1; paramInt = zzab.n(j, R.drawable.common_signin_btn_icon_dark, R.drawable.common_signin_btn_icon_light)) {
        throw new IllegalStateException("Could not find background resource!");
      }
      paramAttributeSet.setBackgroundDrawable(paramContext.getDrawable(paramInt));
      paramAttributeSet.setTextColor(paramContext.getColorStateList(zzab.n(j, R.color.common_signin_btn_text_dark, R.color.common_signin_btn_text_light)));
      switch (i)
      {
      default: 
        throw new IllegalStateException("Unknown button size: " + i);
      }
    }
    paramAttributeSet.setText(paramContext.getString(R.string.common_signin_button_text));
    for (;;)
    {
      this.agK = paramAttributeSet;
      break;
      paramAttributeSet.setText(paramContext.getString(R.string.common_signin_button_text_long));
      continue;
      paramAttributeSet.setText(null);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((this.agL != null) && (paramView == this.agK)) {
      this.agL.onClick(this);
    }
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.agK.setEnabled(paramBoolean);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.agL = paramOnClickListener;
    if (this.agK != null) {
      this.agK.setOnClickListener(this);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\common\SignInButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */