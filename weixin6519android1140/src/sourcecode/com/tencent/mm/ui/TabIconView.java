package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.d;

public class TabIconView
  extends ImageView
{
  private Paint jrC;
  private Bitmap vOL;
  private Bitmap vOM;
  private Bitmap vON;
  private Rect vOO;
  private Rect vOP;
  private Rect vOQ;
  private int vOR;
  
  public TabIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2897760747520L, 21590);
    this.vOR = 0;
    GMTrace.o(2897760747520L, 21590);
  }
  
  public TabIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2897626529792L, 21589);
    this.vOR = 0;
    GMTrace.o(2897626529792L, 21589);
  }
  
  public final void Bq(int paramInt)
  {
    GMTrace.i(2898029182976L, 21592);
    this.vOR = paramInt;
    invalidate();
    GMTrace.o(2898029182976L, 21592);
  }
  
  public final void g(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(2897894965248L, 21591);
    if (paramBoolean)
    {
      this.vOL = d.Ah(paramInt1);
      this.vOM = d.Ah(paramInt3);
    }
    for (this.vON = d.Ah(paramInt2);; this.vON = d.Ag(paramInt2))
    {
      this.vOO = new Rect(0, 0, this.vOL.getWidth(), this.vOL.getHeight());
      this.vOP = new Rect(0, 0, this.vOM.getWidth(), this.vOM.getHeight());
      this.vOQ = new Rect(0, 0, this.vON.getWidth(), this.vON.getHeight());
      this.jrC = new Paint(1);
      GMTrace.o(2897894965248L, 21591);
      return;
      this.vOL = d.Ag(paramInt1);
      this.vOM = d.Ag(paramInt3);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2898163400704L, 21593);
    super.onDraw(paramCanvas);
    if (this.jrC == null)
    {
      GMTrace.o(2898163400704L, 21593);
      return;
    }
    if (this.vOR < 128)
    {
      this.jrC.setAlpha(255 - this.vOR * 2);
      paramCanvas.drawBitmap(this.vOM, null, this.vOP, this.jrC);
      this.jrC.setAlpha(this.vOR * 2);
      paramCanvas.drawBitmap(this.vON, null, this.vOQ, this.jrC);
      GMTrace.o(2898163400704L, 21593);
      return;
    }
    this.jrC.setAlpha(255 - this.vOR * 2);
    paramCanvas.drawBitmap(this.vON, null, this.vOQ, this.jrC);
    this.jrC.setAlpha(this.vOR * 2);
    paramCanvas.drawBitmap(this.vOL, null, this.vOO, this.jrC);
    GMTrace.o(2898163400704L, 21593);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\TabIconView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */