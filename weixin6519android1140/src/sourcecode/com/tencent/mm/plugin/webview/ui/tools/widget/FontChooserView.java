package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class FontChooserView
  extends View
{
  private static SoftReference<Bitmap> oLH;
  private int heG;
  private float jqu;
  private float lUn;
  private List<b> oLI;
  private int oLJ;
  private int oLK;
  private int oLL;
  private int oLM;
  public int oLO;
  private boolean oLR;
  private boolean oLS;
  public a rVk;
  private int topOffset;
  private int yOffset;
  
  static
  {
    GMTrace.i(12097312260096L, 90132);
    oLH = null;
    GMTrace.o(12097312260096L, 90132);
  }
  
  public FontChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12096372736000L, 90125);
    this.oLI = new ArrayList(4);
    this.oLJ = 0;
    this.topOffset = 0;
    this.yOffset = 0;
    this.heG = 0;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.oLK = 0;
    this.oLL = 0;
    this.oLM = 0;
    this.oLO = 0;
    this.rVk = null;
    this.oLR = false;
    this.oLS = false;
    GMTrace.o(12096372736000L, 90125);
  }
  
  public FontChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12096506953728L, 90126);
    this.oLI = new ArrayList(4);
    this.oLJ = 0;
    this.topOffset = 0;
    this.yOffset = 0;
    this.heG = 0;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.oLK = 0;
    this.oLL = 0;
    this.oLM = 0;
    this.oLO = 0;
    this.rVk = null;
    this.oLR = false;
    this.oLS = false;
    GMTrace.o(12096506953728L, 90126);
  }
  
  private void beU()
  {
    GMTrace.i(12096775389184L, 90128);
    if ((oLH == null) || (oLH.get() == null)) {
      oLH = new SoftReference(BitmapFactory.decodeResource(getResources(), R.g.aWx));
    }
    GMTrace.o(12096775389184L, 90128);
  }
  
  private static int yq(int paramInt)
  {
    GMTrace.i(12097178042368L, 90131);
    Paint localPaint = new Paint();
    localPaint.setTextSize(paramInt);
    localPaint.setAntiAlias(true);
    paramInt = (int)Math.ceil(localPaint.getFontMetrics().bottom);
    GMTrace.o(12097178042368L, 90131);
    return paramInt;
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(12096909606912L, 90129);
    super.onDraw(paramCanvas);
    beU();
    Object localObject = new Paint();
    ((Paint)localObject).setARGB(255, 152, 152, 152);
    ((Paint)localObject).setStrokeWidth(2.0F);
    int i = getWidth();
    int j = a.fromDPToPix(getContext(), 5);
    paramCanvas.drawLine(this.oLJ, this.yOffset, i - this.oLJ, this.yOffset, (Paint)localObject);
    i = 0;
    while (i < 4)
    {
      paramCanvas.drawLine(this.oLJ + this.heG * i, this.yOffset - j, this.oLJ + this.heG * i, this.yOffset + j, (Paint)localObject);
      i += 1;
    }
    localObject = (Bitmap)oLH.get();
    paramCanvas.drawBitmap((Bitmap)localObject, this.oLL, this.oLM, null);
    String str1 = getResources().getString(R.l.ejV);
    String str2 = getResources().getString(R.l.ejW);
    String str3 = getResources().getString(R.l.ejT);
    String str4 = getResources().getString(R.l.ejU);
    j = getResources().getDimensionPixelSize(R.f.aSd);
    Paint localPaint = new Paint();
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str1);
    j = yq(j);
    localPaint.setColor(getResources().getColor(R.e.aPn));
    localPaint.setAntiAlias(true);
    paramCanvas.drawText(str1, this.oLJ - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    j = getResources().getDimensionPixelSize(R.f.aSe);
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str2);
    j = yq(j);
    paramCanvas.drawText(str2, this.oLJ + this.heG * 1 - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    j = getResources().getDimensionPixelSize(R.f.aSb);
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str3);
    j = yq(j);
    paramCanvas.drawText(str3, this.oLJ + this.heG * 2 - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    j = getResources().getDimensionPixelSize(R.f.aSc);
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str4);
    j = yq(j);
    paramCanvas.drawText(str4, this.oLJ + this.heG * 3 - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    GMTrace.o(12096909606912L, 90129);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12096641171456L, 90127);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    beU();
    this.oLI.clear();
    setClickable(true);
    this.oLJ = a.fromDPToPix(getContext(), 50);
    this.topOffset = a.fromDPToPix(getContext(), 10);
    paramInt1 = getWidth();
    paramInt2 = getHeight();
    paramInt3 = this.topOffset;
    this.yOffset = (paramInt2 / 2 + paramInt3);
    this.heG = ((paramInt1 - this.oLJ * 2) / 3);
    Bitmap localBitmap = (Bitmap)oLH.get();
    paramInt1 = 0;
    while (paramInt1 < 4)
    {
      b localb = new b();
      localb.left = (this.oLJ + this.heG * paramInt1 - localBitmap.getWidth() / 2);
      localb.top = (this.yOffset - localBitmap.getHeight() / 2);
      localb.right = (this.oLJ + this.heG * paramInt1 + localBitmap.getWidth() / 2);
      localb.bottom = (this.yOffset + localBitmap.getHeight() / 2);
      this.oLI.add(localb);
      paramInt1 += 1;
    }
    this.oLK = this.oLO;
    this.oLL = ((b)this.oLI.get(this.oLK)).left;
    this.oLM = ((b)this.oLI.get(this.oLK)).top;
    invalidate();
    GMTrace.o(12096641171456L, 90127);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    GMTrace.i(12097043824640L, 90130);
    boolean bool;
    b localb;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
      for (bool = true;; bool = true)
      {
        GMTrace.o(12097043824640L, 90130);
        return bool;
        this.lUn = paramMotionEvent.getX();
        this.jqu = paramMotionEvent.getY();
        localb = (b)this.oLI.get(this.oLK);
        i = j;
        if (this.lUn >= localb.left)
        {
          i = j;
          if (this.lUn <= localb.right)
          {
            i = j;
            if (this.jqu >= localb.top)
            {
              i = j;
              if (this.jqu <= localb.bottom) {
                i = 1;
              }
            }
          }
        }
        if (i == 0) {
          break;
        }
        this.oLR = true;
      }
      this.oLS = true;
    }
    label559:
    label610:
    do
    {
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.oLR)
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.oLL += (int)(f1 - this.lUn);
        this.lUn = f1;
        this.jqu = f2;
        paramMotionEvent = (b)this.oLI.get(0);
        localb = (b)this.oLI.get(3);
        if (this.oLL <= paramMotionEvent.left) {
          this.oLL = paramMotionEvent.left;
        }
        for (;;)
        {
          invalidate();
          bool = true;
          break;
          if (this.oLL >= localb.left)
          {
            this.oLL = localb.left;
          }
          else
          {
            do
            {
              i += 1;
              if (i >= 4) {
                break;
              }
              paramMotionEvent = (b)this.oLI.get(i);
            } while ((this.oLL < paramMotionEvent.left - 5) || (this.oLL > paramMotionEvent.right + 5));
            this.oLK = i;
            this.oLO = this.oLK;
            if (this.rVk != null) {
              this.rVk.tI(this.oLK);
            }
          }
        }
      }
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.oLR)
      {
        i = 0;
        for (;;)
        {
          if (i < 3)
          {
            paramMotionEvent = (b)this.oLI.get(i);
            localb = (b)this.oLI.get(i + 1);
            if ((this.oLL > paramMotionEvent.left + this.heG / 2) || (this.oLL < paramMotionEvent.left)) {
              break label559;
            }
            this.oLK = i;
          }
          for (this.oLL = paramMotionEvent.left;; this.oLL = localb.left)
          {
            this.oLO = this.oLK;
            if (this.rVk != null) {
              this.rVk.tI(this.oLK);
            }
            invalidate();
            this.oLR = false;
            bool = true;
            break;
            if ((this.oLL < localb.left - this.heG / 2) || (this.oLL > localb.left)) {
              break label610;
            }
            this.oLK = (i + 1);
          }
          i += 1;
        }
      }
    } while (!this.oLS);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if ((Math.abs(f1 - this.lUn) <= 10.0F) && (Math.abs(f2 - this.jqu) <= 10.0F)) {
      i = 0;
    }
    for (;;)
    {
      if (i < 4)
      {
        paramMotionEvent = (b)this.oLI.get(i);
        if ((f1 < paramMotionEvent.left - 5) || (f1 > paramMotionEvent.right + 5)) {
          break label773;
        }
        this.oLK = i;
        this.oLO = this.oLK;
        this.oLL = paramMotionEvent.left;
        if (this.rVk != null) {
          this.rVk.tI(this.oLK);
        }
      }
      this.oLS = false;
      invalidate();
      bool = true;
      break;
      label773:
      i += 1;
    }
  }
  
  public static abstract interface a
  {
    public abstract void tI(int paramInt);
  }
  
  private static final class b
  {
    public int bottom;
    public int left;
    public int right;
    public int top;
    
    public b()
    {
      GMTrace.i(12103083622400L, 90175);
      this.left = 0;
      this.top = 0;
      this.right = 0;
      this.bottom = 0;
      GMTrace.o(12103083622400L, 90175);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\FontChooserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */