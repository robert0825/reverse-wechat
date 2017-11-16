package com.tencent.mm.plugin.setting.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.setting.ui.setting.SetTextSizeUI;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class FontSelectorView
  extends View
{
  private static SoftReference<Bitmap> oLH;
  private static int oLQ;
  private int heG;
  private float jqu;
  private float lUn;
  private List<b> oLI;
  private int oLJ;
  private int oLK;
  private int oLL;
  private int oLM;
  private int oLN;
  public int oLO;
  public a oLP;
  private boolean oLR;
  private boolean oLS;
  private int topOffset;
  private int yOffset;
  
  static
  {
    GMTrace.i(4725135114240L, 35205);
    oLH = null;
    oLQ = 8;
    GMTrace.o(4725135114240L, 35205);
  }
  
  public FontSelectorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4723927154688L, 35196);
    this.oLI = new ArrayList(8);
    this.oLJ = 0;
    this.topOffset = 0;
    this.yOffset = 0;
    this.heG = 0;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.oLK = 0;
    this.oLL = 0;
    this.oLM = 0;
    this.oLN = 0;
    this.oLO = 0;
    this.oLP = null;
    this.oLR = false;
    this.oLS = false;
    GMTrace.o(4723927154688L, 35196);
  }
  
  public FontSelectorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4724061372416L, 35197);
    this.oLI = new ArrayList(8);
    this.oLJ = 0;
    this.topOffset = 0;
    this.yOffset = 0;
    this.heG = 0;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.oLK = 0;
    this.oLL = 0;
    this.oLM = 0;
    this.oLN = 0;
    this.oLO = 0;
    this.oLP = null;
    this.oLR = false;
    this.oLS = false;
    GMTrace.o(4724061372416L, 35197);
  }
  
  private float ak(float paramFloat)
  {
    GMTrace.i(4724866678784L, 35203);
    paramFloat = TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
    GMTrace.o(4724866678784L, 35203);
    return paramFloat;
  }
  
  private static int al(float paramFloat)
  {
    GMTrace.i(4725000896512L, 35204);
    Paint localPaint = new Paint();
    localPaint.setTextSize(paramFloat);
    localPaint.setAntiAlias(true);
    int i = (int)Math.ceil(localPaint.getFontMetrics().bottom);
    GMTrace.o(4725000896512L, 35204);
    return i;
  }
  
  public static void beT()
  {
    GMTrace.i(15358266179584L, 114428);
    oLQ = 8;
    GMTrace.o(15358266179584L, 114428);
  }
  
  private void beU()
  {
    GMTrace.i(4724464025600L, 35200);
    if ((oLH == null) || (oLH.get() == null)) {
      oLH = new SoftReference(BitmapFactory.decodeResource(getResources(), R.g.aWx));
    }
    GMTrace.o(4724464025600L, 35200);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4724598243328L, 35201);
    super.onDraw(paramCanvas);
    beU();
    Object localObject = new Paint();
    ((Paint)localObject).setARGB(255, 152, 152, 152);
    ((Paint)localObject).setStrokeWidth(2.0F);
    int i = getWidth();
    int j = a.fromDPToPix(getContext(), 5);
    paramCanvas.drawLine(this.oLJ, this.yOffset, i - this.oLJ, this.yOffset, (Paint)localObject);
    i = 0;
    while (i < oLQ)
    {
      paramCanvas.drawLine(this.oLJ + this.heG * i, this.yOffset - j, this.oLJ + this.heG * i, this.yOffset + j, (Paint)localObject);
      i += 1;
    }
    localObject = (Bitmap)oLH.get();
    paramCanvas.drawBitmap((Bitmap)localObject, this.oLL, this.oLM, null);
    String str = getResources().getString(R.l.dXS);
    getResources().getString(R.l.dXR);
    getResources().getString(R.l.dXU);
    float f = ak(SetTextSizeUI.ai(0.875F));
    Paint localPaint = new Paint();
    localPaint.setTextSize(f);
    i = (int)localPaint.measureText("A");
    j = al(f);
    localPaint.setColor(getResources().getColor(R.e.black));
    localPaint.setAntiAlias(true);
    paramCanvas.drawText("A", this.oLJ - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    f = ak(SetTextSizeUI.ai(1.0F));
    localPaint.setTextSize(f);
    i = (int)localPaint.measureText(str);
    j = al(f);
    paramCanvas.drawText(str, this.oLJ + this.heG * 1 - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    f = ak(SetTextSizeUI.ai(2.025F));
    localPaint.setTextSize(f);
    i = (int)localPaint.measureText("A");
    j = al(f);
    paramCanvas.drawText("A", this.oLJ + this.heG * (oLQ - 1) - i / 2, this.yOffset - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    GMTrace.o(4724598243328L, 35201);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(4724195590144L, 35198);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    beU();
    this.oLI.clear();
    setClickable(true);
    this.oLJ = a.fromDPToPix(getContext(), 30);
    this.topOffset = a.fromDPToPix(getContext(), 10);
    paramInt1 = getWidth();
    paramInt2 = getHeight();
    paramInt3 = this.topOffset;
    this.yOffset = (paramInt2 / 2 + paramInt3);
    oLQ = 8;
    this.heG = ((paramInt1 - this.oLJ * 2) / (oLQ - 1));
    Bitmap localBitmap = (Bitmap)oLH.get();
    paramInt1 = 0;
    while (paramInt1 < oLQ)
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
    if (this.oLN >= 0) {
      this.oLL = ((b)this.oLI.get(this.oLK)).left;
    }
    for (;;)
    {
      this.oLM = ((b)this.oLI.get(this.oLK)).top;
      invalidate();
      GMTrace.o(4724195590144L, 35198);
      return;
      if (this.oLL <= ((b)this.oLI.get(this.oLK)).right - this.heG / 2) {
        this.oLL = ((b)this.oLI.get(this.oLK)).left;
      } else {
        this.oLL = ((b)this.oLI.get(this.oLK)).right;
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    GMTrace.i(4724732461056L, 35202);
    boolean bool;
    b localb;
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
      for (bool = true;; bool = true)
      {
        GMTrace.o(4724732461056L, 35202);
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
    label432:
    label583:
    label634:
    do
    {
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.oLR)
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.oLN = ((int)(f1 - this.lUn));
        this.oLL += this.oLN;
        this.lUn = f1;
        this.jqu = f2;
        paramMotionEvent = (b)this.oLI.get(0);
        localb = (b)this.oLI.get(oLQ - 1);
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
            i = 0;
            for (;;)
            {
              if (i >= oLQ) {
                break label432;
              }
              paramMotionEvent = (b)this.oLI.get(i);
              if ((this.oLL >= paramMotionEvent.left - 5) && (this.oLL <= paramMotionEvent.right + 5))
              {
                this.oLK = i;
                this.oLO = this.oLK;
                if (this.oLP == null) {
                  break;
                }
                this.oLP.tI(this.oLK);
                break;
              }
              i += 1;
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
          if (i < oLQ - 1)
          {
            paramMotionEvent = (b)this.oLI.get(i);
            localb = (b)this.oLI.get(i + 1);
            if ((this.oLL > paramMotionEvent.left + this.heG / 2) || (this.oLL < paramMotionEvent.left)) {
              break label583;
            }
            this.oLK = i;
          }
          for (this.oLL = paramMotionEvent.left;; this.oLL = localb.left)
          {
            this.oLO = this.oLK;
            if (this.oLP != null) {
              this.oLP.tI(this.oLK);
            }
            invalidate();
            this.oLR = false;
            bool = true;
            break;
            if ((this.oLL < localb.left - this.heG / 2) || (this.oLL > localb.left)) {
              break label634;
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
      if (i < oLQ)
      {
        paramMotionEvent = (b)this.oLI.get(i);
        if ((f1 < paramMotionEvent.left - 5) || (f1 > paramMotionEvent.right + 5)) {
          break label799;
        }
        this.oLK = i;
        this.oLO = this.oLK;
        this.oLL = paramMotionEvent.left;
        if (this.oLP != null) {
          this.oLP.tI(this.oLK);
        }
      }
      this.oLS = false;
      invalidate();
      bool = true;
      break;
      label799:
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
      GMTrace.i(4725269331968L, 35206);
      this.left = 0;
      this.top = 0;
      this.right = 0;
      this.bottom = 0;
      GMTrace.o(4725269331968L, 35206);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\widget\FontSelectorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */