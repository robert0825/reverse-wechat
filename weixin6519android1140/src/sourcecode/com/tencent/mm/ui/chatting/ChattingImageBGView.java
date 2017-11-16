package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class ChattingImageBGView
  extends ImageView
{
  private Bitmap lEg;
  private int wvv;
  
  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2105070845952L, 15684);
    this.wvv = 0;
    setScaleType(ImageView.ScaleType.MATRIX);
    GMTrace.o(2105070845952L, 15684);
  }
  
  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2104936628224L, 15683);
    this.wvv = 0;
    setScaleType(ImageView.ScaleType.MATRIX);
    GMTrace.o(2104936628224L, 15683);
  }
  
  private void ccp()
  {
    GMTrace.i(2105473499136L, 15687);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2248683814912L, 16754);
        if (ChattingImageBGView.a(ChattingImageBGView.this) == null)
        {
          w.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but bmp is null");
          GMTrace.o(2248683814912L, 16754);
          return;
        }
        if (ChattingImageBGView.a(ChattingImageBGView.this).getWidth() == 0) {
          w.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but measured width error");
        }
        Matrix localMatrix = new Matrix();
        float f2 = ChattingImageBGView.this.getMeasuredWidth() / ChattingImageBGView.a(ChattingImageBGView.this).getWidth();
        float f1 = ChattingImageBGView.this.getMeasuredHeight() / ChattingImageBGView.a(ChattingImageBGView.this).getHeight();
        w.d("MicroMsg.ChattingImageBGView", "scaleW[%f], scaleH[%f] measured width[%d] measured height[%d]", new Object[] { Float.valueOf(f2), Float.valueOf(f1), Integer.valueOf(ChattingImageBGView.this.getMeasuredWidth()), Integer.valueOf(ChattingImageBGView.this.getMeasuredHeight()) });
        if (f2 > f1) {
          localMatrix.setScale(f2, f2);
        }
        for (;;)
        {
          ChattingImageBGView.this.setImageMatrix(localMatrix);
          GMTrace.o(2248683814912L, 16754);
          return;
          localMatrix.setScale(f1, f1);
          f2 = ChattingImageBGView.a(ChattingImageBGView.this).getWidth();
          localMatrix.postTranslate((ChattingImageBGView.this.getMeasuredWidth() - f2 * f1) / 2.0F, 0.0F);
        }
      }
    });
    GMTrace.o(2105473499136L, 15687);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2105205063680L, 15685);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (this.wvv != paramInt3 - paramInt1))
    {
      this.wvv = (paramInt3 - paramInt1);
      w.d("MicroMsg.ChattingImageBGView", "on layout changed, %d, %d, %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      ccp();
    }
    GMTrace.o(2105205063680L, 15685);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(2105339281408L, 15686);
    this.lEg = paramBitmap;
    super.setImageBitmap(paramBitmap);
    ccp();
    GMTrace.o(2105339281408L, 15686);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingImageBGView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */