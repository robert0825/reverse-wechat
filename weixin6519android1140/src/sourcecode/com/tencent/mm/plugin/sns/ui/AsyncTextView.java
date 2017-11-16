package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.pluginsdk.ui.d.i;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.pluginsdk.ui.d.m.a;

public class AsyncTextView
  extends TextView
  implements Runnable
{
  private Context context;
  public int jHw;
  public String pOK;
  public boolean pOL;
  public String pOM;
  public m.a pON;
  public boolean pOO;
  public String userName;
  
  public AsyncTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8557856555008L, 63761);
    this.context = paramContext;
    GMTrace.o(8557856555008L, 63761);
  }
  
  public AsyncTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8557722337280L, 63760);
    this.context = paramContext;
    GMTrace.o(8557722337280L, 63760);
  }
  
  public int getBaseline()
  {
    GMTrace.i(8558393425920L, 63765);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(8558393425920L, 63765);
      return i;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8558393425920L, 63765);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8558259208192L, 63764);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(8558259208192L, 63764);
      return;
    }
    catch (Throwable paramCanvas)
    {
      GMTrace.o(8558259208192L, 63764);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8558124990464L, 63763);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(8558124990464L, 63763);
      return;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8558124990464L, 63763);
    }
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(8558527643648L, 63766);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(8558527643648L, 63766);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8558527643648L, 63766);
    }
    return true;
  }
  
  public void run()
  {
    GMTrace.i(8557990772736L, 63762);
    Object localObject1;
    if ((getTag() instanceof String))
    {
      localObject1 = (String)getTag();
      if ((localObject1 != null) && (((String)localObject1).equals(this.userName)))
      {
        GMTrace.o(8557990772736L, 63762);
        return;
      }
    }
    if (this.jHw == 11) {}
    for (int i = 3;; i = 2)
    {
      localObject1 = new m(new a(this.pOL, this.userName, this.pOM, 1), this.pON, i);
      Object localObject2 = getContext();
      String str = this.pOK;
      getTextSize();
      localObject2 = new i(h.d((Context)localObject2, str, i));
      ((i)localObject2).f(localObject1, this.pOK);
      setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
      setTag(this.userName);
      GMTrace.o(8557990772736L, 63762);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\AsyncTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */