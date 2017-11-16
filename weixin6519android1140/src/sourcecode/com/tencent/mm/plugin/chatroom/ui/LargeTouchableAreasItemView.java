package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import java.util.ArrayList;
import java.util.Iterator;

public class LargeTouchableAreasItemView
  extends LinearLayout
{
  private static final int jOH;
  private boolean fWv;
  private final ArrayList<b> jOI;
  private c jOJ;
  a jOK;
  private int jOL;
  private int jOM;
  private int jON;
  private ImageButton jOO;
  private final Paint mPaint;
  
  static
  {
    GMTrace.i(9102512095232L, 67819);
    jOH = Color.argb(0, 0, 0, 0);
    GMTrace.o(9102512095232L, 67819);
  }
  
  public LargeTouchableAreasItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9101572571136L, 67812);
    this.jOI = new ArrayList();
    this.mPaint = new Paint();
    this.jOM = -1;
    this.jON = -1;
    setOrientation(0);
    setDescendantFocusability(393216);
    this.jOJ = new c(this);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.jOL = ((int)(paramContext.getResources().getDisplayMetrics().density * 66.0F + 0.5F));
    LayoutInflater.from(paramContext).inflate(R.i.ctp, this);
    GMTrace.o(9101572571136L, 67812);
  }
  
  public final void dE(boolean paramBoolean)
  {
    GMTrace.i(9102109442048L, 67816);
    ImageButton localImageButton;
    if (this.fWv != paramBoolean)
    {
      this.fWv = paramBoolean;
      localImageButton = this.jOO;
      if (!this.fWv) {
        break label51;
      }
    }
    label51:
    for (int i = R.k.cLt;; i = R.k.cLu)
    {
      localImageButton.setImageResource(i);
      GMTrace.o(9102109442048L, 67816);
      return;
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(9101975224320L, 67815);
    Iterator localIterator = this.jOI.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      this.mPaint.setColor(localb.color);
      paramCanvas.drawRect(localb.rect, this.mPaint);
    }
    super.dispatchDraw(paramCanvas);
    GMTrace.o(9101975224320L, 67815);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(9101706788864L, 67813);
    super.onFinishInflate();
    this.jOO = ((ImageButton)findViewById(R.h.biF));
    this.jOO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9076205420544L, 67623);
        paramAnonymousView = LargeTouchableAreasItemView.this;
        if (!LargeTouchableAreasItemView.a(LargeTouchableAreasItemView.this)) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.dE(bool);
          if (LargeTouchableAreasItemView.b(LargeTouchableAreasItemView.this) != null) {
            LargeTouchableAreasItemView.b(LargeTouchableAreasItemView.this).dF(LargeTouchableAreasItemView.a(LargeTouchableAreasItemView.this));
          }
          GMTrace.o(9076205420544L, 67623);
          return;
        }
      }
    });
    GMTrace.o(9101706788864L, 67813);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9101841006592L, 67814);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if ((paramInt1 != this.jOM) || (paramInt2 != this.jON))
    {
      this.jOM = paramInt1;
      this.jON = paramInt2;
      Object localObject1 = this.jOJ;
      if (((c)localObject1).jSF != null) {
        ((c)localObject1).jSF.clear();
      }
      ((c)localObject1).jSG = null;
      localObject1 = new Rect(paramInt1 - this.jOO.getWidth() - this.jOL, 0, paramInt1, paramInt2);
      paramInt1 = jOH;
      Object localObject2 = this.jOO;
      c localc = this.jOJ;
      localObject2 = new TouchDelegate((Rect)localObject1, (View)localObject2);
      if (localc.jSF == null) {
        localc.jSF = new ArrayList();
      }
      localc.jSF.add(localObject2);
      this.jOI.add(new b((Rect)localObject1, paramInt1));
      setTouchDelegate(this.jOJ);
    }
    GMTrace.o(9101841006592L, 67814);
  }
  
  public static abstract interface a
  {
    public abstract void dF(boolean paramBoolean);
  }
  
  private static final class b
  {
    public int color;
    public Rect rect;
    
    public b(Rect paramRect, int paramInt)
    {
      GMTrace.i(9135798091776L, 68067);
      this.rect = paramRect;
      this.color = paramInt;
      GMTrace.o(9135798091776L, 68067);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\LargeTouchableAreasItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */