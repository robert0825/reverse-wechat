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

public class MHardwareAccelerateDrawableView
  extends View
  implements a
{
  public final b hOg;
  private final Set<View.OnAttachStateChangeListener> hOh;
  
  public MHardwareAccelerateDrawableView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17697815396352L, 131859);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    setLayerType(2, null);
    GMTrace.o(17697815396352L, 131859);
  }
  
  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17697949614080L, 131860);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    setLayerType(2, null);
    GMTrace.o(17697949614080L, 131860);
  }
  
  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17698083831808L, 131861);
    this.hOg = new b(this);
    this.hOh = new LinkedHashSet();
    setLayerType(2, null);
    GMTrace.o(17698083831808L, 131861);
  }
  
  public final void TM()
  {
    GMTrace.i(17698352267264L, 131863);
    postInvalidate();
    GMTrace.o(17698352267264L, 131863);
  }
  
  public final void TN()
  {
    GMTrace.i(18859201396736L, 140512);
    this.hOg.TN();
    GMTrace.o(18859201396736L, 140512);
  }
  
  public final int TO()
  {
    GMTrace.i(18967917756416L, 141322);
    GMTrace.o(18967917756416L, 141322);
    return 667;
  }
  
  public final int TP()
  {
    GMTrace.i(18968051974144L, 141323);
    GMTrace.o(18968051974144L, 141323);
    return 668;
  }
  
  public final void TQ()
  {
    GMTrace.i(18860409356288L, 140521);
    this.hOg.TQ();
    GMTrace.o(18860409356288L, 140521);
  }
  
  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    GMTrace.i(20783346745344L, 154848);
    this.hOg.a(paramJSONArray, parama);
    GMTrace.o(20783346745344L, 154848);
  }
  
  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18859469832192L, 140514);
    if (this.hOh.contains(paramOnAttachStateChangeListener))
    {
      GMTrace.o(18859469832192L, 140514);
      return;
    }
    this.hOh.add(paramOnAttachStateChangeListener);
    super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18859469832192L, 140514);
  }
  
  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    GMTrace.i(20783480963072L, 154849);
    this.hOg.b(paramJSONArray, parama);
    GMTrace.o(20783480963072L, 154849);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18858798743552L, 140509);
    boolean bool = this.hOg.d(paramCanvas);
    GMTrace.o(18858798743552L, 140509);
    return bool;
  }
  
  public final int getType()
  {
    GMTrace.i(20000857391104L, 149018);
    GMTrace.o(20000857391104L, 149018);
    return 0;
  }
  
  public final void i(Runnable paramRunnable)
  {
    GMTrace.i(17698486484992L, 131864);
    post(paramRunnable);
    GMTrace.o(17698486484992L, 131864);
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18860006703104L, 140518);
    boolean bool = this.hOg.hNA;
    GMTrace.o(18860006703104L, 140518);
    return bool;
  }
  
  public final void oI(String paramString)
  {
    GMTrace.i(18859335614464L, 140513);
    this.hOg.oI(paramString);
    GMTrace.o(18859335614464L, 140513);
  }
  
  public final void oJ(String paramString)
  {
    GMTrace.i(18860140920832L, 140519);
    this.hOg.hNz = paramString;
    GMTrace.o(18860140920832L, 140519);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17698218049536L, 131862);
    d(paramCanvas);
    GMTrace.o(17698218049536L, 131862);
  }
  
  public final void onPause()
  {
    GMTrace.i(18859738267648L, 140516);
    this.hOg.onPause();
    GMTrace.o(18859738267648L, 140516);
  }
  
  public final void onResume()
  {
    GMTrace.i(18859872485376L, 140517);
    this.hOg.onResume();
    GMTrace.o(18859872485376L, 140517);
  }
  
  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    GMTrace.i(18859604049920L, 140515);
    this.hOh.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    GMTrace.o(18859604049920L, 140515);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18860275138560L, 140520);
    this.hOg.hND = paramLong;
    GMTrace.o(18860275138560L, 140520);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\widget\MHardwareAccelerateDrawableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */