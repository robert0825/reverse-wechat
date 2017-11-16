package com.tencent.mm.plugin.welab.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.support.v4.b.a.i;
import android.support.v4.b.a.k;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class WelabRoundCornerImageView
  extends ImageView
{
  public float sbq;
  
  public WelabRoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17486288257024L, 130283);
    GMTrace.o(17486288257024L, 130283);
  }
  
  public WelabRoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17486422474752L, 130284);
    GMTrace.o(17486422474752L, 130284);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(17486556692480L, 130285);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (paramBitmap.getWidth() < 0) || (paramBitmap.getHeight() < 0))
    {
      super.setImageBitmap(paramBitmap);
      GMTrace.o(17486556692480L, 130285);
      return;
    }
    if (this.sbq <= 0.0F)
    {
      super.setImageBitmap(paramBitmap);
      GMTrace.o(17486556692480L, 130285);
      return;
    }
    i locali = k.a(getResources(), paramBitmap);
    float f = Math.min(paramBitmap.getWidth() * this.sbq, paramBitmap.getHeight() * this.sbq);
    if (locali.ij != f)
    {
      locali.tr = false;
      if (!i.n(f)) {
        break label159;
      }
      locali.mPaint.setShader(locali.tm);
    }
    for (;;)
    {
      locali.ij = f;
      locali.invalidateSelf();
      super.setImageDrawable(locali);
      GMTrace.o(17486556692480L, 130285);
      return;
      label159:
      locali.mPaint.setShader(null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\ui\widget\WelabRoundCornerImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */