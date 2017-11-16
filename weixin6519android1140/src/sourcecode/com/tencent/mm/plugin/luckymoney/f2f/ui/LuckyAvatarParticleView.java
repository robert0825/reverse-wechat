package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public class LuckyAvatarParticleView
  extends View
{
  private Paint jrC;
  private List<Rect> mFI;
  private List<Integer> mFJ;
  private List<Integer> mFK;
  
  public LuckyAvatarParticleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9751991681024L, 72658);
    this.mFI = new ArrayList();
    this.mFJ = new ArrayList();
    this.mFK = new ArrayList();
    this.jrC = new Paint();
    GMTrace.o(9751991681024L, 72658);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(9752125898752L, 72659);
    super.onDraw(paramCanvas);
    int i = 0;
    while (i < this.mFI.size())
    {
      paramCanvas.drawRect((Rect)this.mFI.get(i), this.jrC);
      i += 1;
    }
    GMTrace.o(9752125898752L, 72659);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\ui\LuckyAvatarParticleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */