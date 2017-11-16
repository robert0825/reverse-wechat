package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import java.lang.reflect.Field;

public class LightHouseImageView
  extends ImageView
{
  private ae handler;
  private AnimationDrawable jqP;
  
  public LightHouseImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7605044903936L, 56662);
    this.handler = new ae();
    GMTrace.o(7605044903936L, 56662);
  }
  
  public LightHouseImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7605179121664L, 56663);
    this.handler = new ae();
    GMTrace.o(7605179121664L, 56663);
  }
  
  private void lj(int paramInt)
  {
    GMTrace.i(7605581774848L, 56666);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)getLayoutParams();
    FrameLayout localFrameLayout = (FrameLayout)getParent();
    if (((paramInt >= 6) && (paramInt <= 8)) || ((paramInt >= 21) && (paramInt <= 23))) {
      localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, localFrameLayout.getHeight() * 250 / 800, localFrameLayout.getWidth() * 123 / 480, localMarginLayoutParams.bottomMargin);
    }
    for (;;)
    {
      setLayoutParams(localMarginLayoutParams);
      GMTrace.o(7605581774848L, 56666);
      return;
      if (((paramInt >= 0) && (paramInt <= 8)) || ((paramInt >= 21) && (paramInt <= 29))) {
        localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, localFrameLayout.getHeight() * 245 / 800, localFrameLayout.getWidth() * 130 / 480, localMarginLayoutParams.bottomMargin);
      } else {
        localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, localFrameLayout.getHeight() * 245 / 800, localFrameLayout.getWidth() * 125 / 480 - getWidth(), localMarginLayoutParams.bottomMargin);
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(7605447557120L, 56665);
    try
    {
      Field localField = AnimationDrawable.class.getDeclaredField("mCurFrame");
      localField.setAccessible(true);
      lj(localField.getInt(this.jqP));
      super.onDraw(paramCanvas);
      GMTrace.o(7605447557120L, 56665);
      return;
    }
    catch (Exception paramCanvas)
    {
      GMTrace.o(7605447557120L, 56665);
    }
  }
  
  public void setVisibility(final int paramInt)
  {
    GMTrace.i(7605313339392L, 56664);
    this.handler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7617661370368L, 56756);
        LightHouseImageView.a(LightHouseImageView.this, paramInt);
        LightHouseImageView.a(LightHouseImageView.this, (AnimationDrawable)LightHouseImageView.this.getBackground());
        LightHouseImageView.a(LightHouseImageView.this);
        LightHouseImageView.b(LightHouseImageView.this).start();
        GMTrace.o(7617661370368L, 56756);
      }
    }, 1000L);
    GMTrace.o(7605313339392L, 56664);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\LightHouseImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */