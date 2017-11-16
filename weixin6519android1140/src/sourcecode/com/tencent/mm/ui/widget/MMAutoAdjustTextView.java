package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bx.a.c;
import com.tencent.mm.bx.a.j;

public class MMAutoAdjustTextView
  extends TextView
{
  private float fWN;
  private float gbV;
  private Paint mE;
  private float xpA;
  private boolean xpB;
  
  public MMAutoAdjustTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(13047305338880L, 97210);
    this.xpB = true;
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.j.enN));
    init();
    GMTrace.o(13047305338880L, 97210);
  }
  
  public MMAutoAdjustTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(13047439556608L, 97211);
    this.xpB = true;
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.j.enN));
    init();
    GMTrace.o(13047439556608L, 97211);
  }
  
  private void Ej(int paramInt)
  {
    GMTrace.i(13047842209792L, 97214);
    if (paramInt <= 0)
    {
      GMTrace.o(13047842209792L, 97214);
      return;
    }
    measure(0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    for (float f = getMeasuredWidth(); f > paramInt; f = getMeasuredWidth())
    {
      this.gbV -= a.getDensity(getContext());
      setTextSize(0, this.gbV * this.fWN);
      measure(0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }
    GMTrace.o(13047842209792L, 97214);
  }
  
  private void b(TypedArray paramTypedArray)
  {
    GMTrace.i(13047707992064L, 97213);
    if (paramTypedArray != null)
    {
      this.xpB = paramTypedArray.getBoolean(a.j.xwr, true);
      paramTypedArray.recycle();
    }
    GMTrace.o(13047707992064L, 97213);
  }
  
  private void init()
  {
    GMTrace.i(13047573774336L, 97212);
    this.xpA = a.V(getContext(), a.c.aQR);
    this.gbV = getTextSize();
    this.fWN = a.dZ(getContext());
    this.mE = new Paint();
    this.mE.set(getPaint());
    GMTrace.o(13047573774336L, 97212);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13048110645248L, 97216);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      getText().toString();
      Ej(paramInt1);
    }
    GMTrace.o(13048110645248L, 97216);
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13047976427520L, 97215);
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence.toString();
    Ej(getWidth());
    GMTrace.o(13047976427520L, 97215);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\MMAutoAdjustTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */