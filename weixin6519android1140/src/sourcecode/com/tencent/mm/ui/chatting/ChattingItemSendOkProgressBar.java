package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.SoftReference;

public class ChattingItemSendOkProgressBar
  extends ProgressBar
{
  private static SoftReference<Bitmap> wxL;
  private static SoftReference<Bitmap> wxM;
  private static SoftReference<Bitmap> wxN;
  private static int wxT;
  private static int wxU;
  private boolean mBy;
  private float rotation;
  private int wxH;
  private int wxI;
  private boolean wxJ;
  private boolean wxK;
  private Bitmap wxO;
  private Bitmap wxP;
  private Bitmap wxQ;
  private boolean wxR;
  private a wxS;
  
  static
  {
    GMTrace.i(2515777093632L, 18744);
    wxL = null;
    wxM = null;
    wxN = null;
    wxT = 0;
    wxU = 0;
    wxT = a.fromDPToPix(ab.getContext(), 1);
    wxU = a.fromDPToPix(ab.getContext(), 6);
    GMTrace.o(2515777093632L, 18744);
  }
  
  public ChattingItemSendOkProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2515374440448L, 18741);
    this.wxH = 0;
    this.wxI = 0;
    this.rotation = 0.0F;
    this.mBy = false;
    this.wxJ = false;
    this.wxK = false;
    this.wxO = null;
    this.wxP = null;
    this.wxQ = null;
    this.wxR = false;
    this.wxS = null;
    GMTrace.o(2515374440448L, 18741);
  }
  
  public ChattingItemSendOkProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2515508658176L, 18742);
    this.wxH = 0;
    this.wxI = 0;
    this.rotation = 0.0F;
    this.mBy = false;
    this.wxJ = false;
    this.wxK = false;
    this.wxO = null;
    this.wxP = null;
    this.wxQ = null;
    this.wxR = false;
    this.wxS = null;
    GMTrace.o(2515508658176L, 18742);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2515642875904L, 18743);
    if (!this.wxR)
    {
      super.onDraw(paramCanvas);
      GMTrace.o(2515642875904L, 18743);
      return;
    }
    paramCanvas.saveLayerAlpha(new RectF(0.0F, 0.0F, this.wxO.getWidth(), this.wxO.getHeight()), 255, 31);
    if (this.mBy)
    {
      if (!this.wxJ)
      {
        if (((int)(this.rotation - 270.0F) % 360 == 0) && (this.wxK))
        {
          this.wxJ = true;
          invalidate();
          GMTrace.o(2515642875904L, 18743);
          return;
        }
        localObject1 = new Matrix();
        ((Matrix)localObject1).setRotate(this.rotation, this.wxO.getWidth() / 2, this.wxO.getHeight() / 2);
        paramCanvas.drawBitmap(this.wxO, (Matrix)localObject1, null);
        this.rotation += 6.0F;
        invalidate();
        GMTrace.o(2515642875904L, 18743);
        return;
      }
      if (this.wxH <= this.wxP.getWidth())
      {
        localObject1 = new Matrix();
        this.rotation += 6.0F;
        ((Matrix)localObject1).setRotate(this.rotation, this.wxO.getWidth() / 2, this.wxO.getHeight() / 2);
        int j = (int)this.rotation % 360;
        int i = j;
        if (j < 270) {
          i = j + 360;
        }
        if ((i >= 270) && (i < 450))
        {
          localObject2 = new Paint();
          ((Paint)localObject2).setColor(-16776961);
          paramCanvas.drawBitmap(this.wxO, (Matrix)localObject1, (Paint)localObject2);
          ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
          paramCanvas.drawRect(0.0F, 0.0F, this.wxO.getWidth(), this.wxO.getHeight() / 2, (Paint)localObject2);
        }
        localObject1 = new Rect(0, 0, this.wxH, this.wxP.getHeight());
        localObject2 = new Rect(wxT, wxU, this.wxH + wxT, this.wxP.getHeight() + wxU);
        paramCanvas.drawBitmap(this.wxP, (Rect)localObject1, (Rect)localObject2, null);
        this.wxH += 2;
        invalidate();
        GMTrace.o(2515642875904L, 18743);
        return;
      }
      localObject1 = new Rect(0, 0, this.wxP.getWidth(), this.wxP.getHeight());
      localObject2 = new Rect(wxT, wxU, this.wxP.getWidth() + wxT, this.wxP.getHeight() + wxU);
      paramCanvas.drawBitmap(this.wxP, (Rect)localObject1, (Rect)localObject2, null);
      if (this.wxI < 255)
      {
        Paint localPaint = new Paint();
        localPaint.setAlpha(this.wxI);
        paramCanvas.drawBitmap(this.wxQ, (Rect)localObject1, (Rect)localObject2, localPaint);
        this.wxI += 20;
        invalidate();
        GMTrace.o(2515642875904L, 18743);
        return;
      }
      paramCanvas.drawBitmap(this.wxQ, (Rect)localObject1, (Rect)localObject2, null);
      this.mBy = false;
      this.rotation = 0.0F;
      this.wxH = 0;
      this.wxI = 0;
      this.wxK = false;
      this.wxJ = false;
      GMTrace.o(2515642875904L, 18743);
      return;
    }
    Object localObject1 = new Rect(0, 0, this.wxQ.getWidth(), this.wxQ.getHeight());
    Object localObject2 = new Rect(wxT, wxU, this.wxQ.getWidth() + wxT, this.wxQ.getHeight() + wxU);
    paramCanvas.drawBitmap(this.wxQ, (Rect)localObject1, (Rect)localObject2, null);
    GMTrace.o(2515642875904L, 18743);
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingItemSendOkProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */