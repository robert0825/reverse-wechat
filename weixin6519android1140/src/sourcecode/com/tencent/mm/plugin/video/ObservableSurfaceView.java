package com.tencent.mm.plugin.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class ObservableSurfaceView
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  protected SurfaceHolder hOi;
  protected boolean qBA;
  protected boolean qBB;
  private a qBy;
  protected boolean qBz;
  
  public ObservableSurfaceView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12483859316736L, 93012);
    this.qBy = null;
    this.qBz = false;
    this.qBA = false;
    this.qBB = false;
    init();
    GMTrace.o(12483859316736L, 93012);
  }
  
  public ObservableSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12483993534464L, 93013);
    this.qBy = null;
    this.qBz = false;
    this.qBA = false;
    this.qBB = false;
    init();
    GMTrace.o(12483993534464L, 93013);
  }
  
  public ObservableSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12484127752192L, 93014);
    this.qBy = null;
    this.qBz = false;
    this.qBA = false;
    this.qBB = false;
    init();
    GMTrace.o(12484127752192L, 93014);
  }
  
  private void init()
  {
    GMTrace.i(12484261969920L, 93015);
    this.hOi = getHolder();
    this.hOi.addCallback(this);
    GMTrace.o(12484261969920L, 93015);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(12484664623104L, 93018);
    this.qBy = parama;
    if (this.qBB) {
      this.hOi.setType(3);
    }
    GMTrace.o(12484664623104L, 93018);
  }
  
  public final void bsZ()
  {
    GMTrace.i(12484530405376L, 93017);
    this.qBB = true;
    if (this.qBB) {
      this.hOi.setType(3);
    }
    GMTrace.o(12484530405376L, 93017);
  }
  
  public final boolean bta()
  {
    GMTrace.i(12485201494016L, 93022);
    boolean bool = this.qBz;
    GMTrace.o(12485201494016L, 93022);
    return bool;
  }
  
  public final SurfaceHolder getSurfaceHolder()
  {
    GMTrace.i(12484396187648L, 93016);
    SurfaceHolder localSurfaceHolder = this.hOi;
    GMTrace.o(12484396187648L, 93016);
    return localSurfaceHolder;
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(12484933058560L, 93020);
    w.d("MicroMsg.ObservableSurfaceView", "surfaceChanged");
    this.qBA = true;
    try
    {
      this.hOi.removeCallback(this);
      this.hOi = paramSurfaceHolder;
      this.hOi.addCallback(this);
      if (this.qBy != null) {
        this.qBy.a(this.hOi);
      }
      GMTrace.o(12484933058560L, 93020);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(12484798840832L, 93019);
    this.qBz = true;
    GMTrace.o(12484798840832L, 93019);
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(12485067276288L, 93021);
    this.qBz = false;
    this.qBA = false;
    GMTrace.o(12485067276288L, 93021);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\video\ObservableSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */