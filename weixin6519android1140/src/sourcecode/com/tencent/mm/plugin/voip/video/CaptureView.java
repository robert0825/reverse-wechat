package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.video.ObservableSurfaceView;

public class CaptureView
  extends ObservableSurfaceView
{
  public CaptureView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5382533545984L, 40103);
    init();
    GMTrace.o(5382533545984L, 40103);
  }
  
  public CaptureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5382667763712L, 40104);
    init();
    GMTrace.o(5382667763712L, 40104);
  }
  
  public CaptureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5382801981440L, 40105);
    init();
    GMTrace.o(5382801981440L, 40105);
  }
  
  private void init()
  {
    GMTrace.i(5382936199168L, 40106);
    if (i.bwe()) {
      bsZ();
    }
    GMTrace.o(5382936199168L, 40106);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\CaptureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */