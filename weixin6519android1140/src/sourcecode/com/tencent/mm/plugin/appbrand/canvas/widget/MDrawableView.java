package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MDrawableView
  extends View
  implements a
{
  public final b hOg;
  private final Set<View.OnAttachStateChangeListener> hOh;
  
  public MDrawableView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18860812009472L, 140524);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    setLayerType(1, null);
    GMTrace.o(18860812009472L, 140524);
  }
  
  public MDrawableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17698889138176L, 131867);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    setLayerType(1, null);
    GMTrace.o(17698889138176L, 131867);
  }
  
  public MDrawableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17699023355904L, 131868);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    setLayerType(1, null);
    GMTrace.o(17699023355904L, 131868);
  }
  
  public final void TM()
  {
    GMTrace.i(18860946227200L, 140525);
    postInvalidate();
    GMTrace.o(18860946227200L, 140525);
  }
  
  public final void TN()
  {
    GMTrace.i(18861617315840L, 140530);
    this.hOg.TN();
    GMTrace.o(18861617315840L, 140530);
  }
  
  public final int TO()
  {
    GMTrace.i(18968186191872L, 141324);
    GMTrace.o(18968186191872L, 141324);
    return 667;
  }
  
  public final int TP()
  {
    GMTrace.i(18968320409600L, 141325);
    GMTrace.o(18968320409600L, 141325);
    return 668;
  }
  
  public final void TQ()
  {
    GMTrace.i(18862825275392L, 140539);
    this.hOg.TQ();
    GMTrace.o(18862825275392L, 140539);
  }
  
  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    GMTrace.i(20783615180800L, 154850);
    this.hOg.a(paramJSONArray, parama);
    GMTrace.o(20783615180800L, 154850);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18861885751296L, 140532);
    if (this.hOh.contains(paramOnAttachStateChangeListener))
    {
      GMTrace.o(18861885751296L, 140532);
      return;
    }
    this.hOh.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18861885751296L, 140532);
  }
  
  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    GMTrace.i(20783749398528L, 154851);
    this.hOg.b(paramJSONArray, parama);
    GMTrace.o(20783749398528L, 154851);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18861214662656L, 140527);
    boolean bool = this.hOg.d(paramCanvas);
    GMTrace.o(18861214662656L, 140527);
    return bool;
  }
  
  public final int getType()
  {
    GMTrace.i(20000991608832L, 149019);
    GMTrace.o(20000991608832L, 149019);
    return 4;
  }
  
  public final void i(Runnable paramRunnable)
  {
    GMTrace.i(18861080444928L, 140526);
    post(paramRunnable);
    GMTrace.o(18861080444928L, 140526);
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18862422622208L, 140536);
    boolean bool = this.hOg.hNA;
    GMTrace.o(18862422622208L, 140536);
    return bool;
  }
  
  public final void oI(String paramString)
  {
    GMTrace.i(18861751533568L, 140531);
    this.hOg.oI(paramString);
    GMTrace.o(18861751533568L, 140531);
  }
  
  public final void oJ(String paramString)
  {
    GMTrace.i(18862556839936L, 140537);
    this.hOg.hNz = paramString;
    GMTrace.o(18862556839936L, 140537);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17699157573632L, 131869);
    d(paramCanvas);
    GMTrace.o(17699157573632L, 131869);
  }
  
  public final void onPause()
  {
    GMTrace.i(18862154186752L, 140534);
    this.hOg.onPause();
    GMTrace.o(18862154186752L, 140534);
  }
  
  public final void onResume()
  {
    GMTrace.i(18862288404480L, 140535);
    this.hOg.onResume();
    GMTrace.o(18862288404480L, 140535);
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18862019969024L, 140533);
    this.hOh.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18862019969024L, 140533);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18862691057664L, 140538);
    this.hOg.hND = paramLong;
    GMTrace.o(18862691057664L, 140538);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\widget\MDrawableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */