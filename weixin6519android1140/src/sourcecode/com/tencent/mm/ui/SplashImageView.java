package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.ui.chatting.en;

public class SplashImageView
  extends ImageView
{
  private boolean hasDrawed;
  en vOB;
  
  public SplashImageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17828811898880L, 132835);
    setImageResource(R.g.bcd);
    GMTrace.o(17828811898880L, 132835);
  }
  
  public SplashImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17828946116608L, 132836);
    setImageResource(R.g.bcd);
    GMTrace.o(17828946116608L, 132836);
  }
  
  public SplashImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17829080334336L, 132837);
    setImageResource(R.g.bcd);
    GMTrace.o(17829080334336L, 132837);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17829214552064L, 132838);
    super.onDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.vOB != null) {
        this.vOB.aDr();
      }
    }
    GMTrace.o(17829214552064L, 132838);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\SplashImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */