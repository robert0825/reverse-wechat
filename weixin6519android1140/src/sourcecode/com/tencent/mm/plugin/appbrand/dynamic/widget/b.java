package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MHardwareAccelerateDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class b
{
  private static volatile boolean fXO;
  public static volatile int hWf;
  
  static
  {
    GMTrace.i(18853832687616L, 140472);
    hWf = 0;
    fXO = false;
    GMTrace.o(18853832687616L, 140472);
  }
  
  public static int Vs()
  {
    GMTrace.i(18853430034432L, 140469);
    int i = hWf;
    GMTrace.o(18853430034432L, 140469);
    return i;
  }
  
  public static String Vt()
  {
    GMTrace.i(18853698469888L, 140471);
    switch (hWf)
    {
    default: 
      GMTrace.o(18853698469888L, 140471);
      return "MHADrawableView";
    case 1: 
      GMTrace.o(18853698469888L, 140471);
      return "MTextureView";
    case 2: 
      GMTrace.o(18853698469888L, 140471);
      return "MSurfaceView";
    case 3: 
      GMTrace.o(18853698469888L, 140471);
      return "MCanvasView";
    }
    GMTrace.o(18853698469888L, 140471);
    return "MDrawableView";
  }
  
  public static View aZ(Context paramContext)
  {
    GMTrace.i(18853564252160L, 140470);
    if (!fXO) {
      initialize();
    }
    w.d("MicroMsg.WidgetDrawableViewFactory", "inflate(mode : %d)", new Object[] { Integer.valueOf(hWf) });
    switch (hWf)
    {
    default: 
      paramContext = new MHardwareAccelerateDrawableView(paramContext);
      paramContext.hOg.hNw.hNS = com.tencent.mm.plugin.appbrand.dynamic.b.b.TS();
      GMTrace.o(18853564252160L, 140470);
      return paramContext;
    case 1: 
      paramContext = new MTextureView(paramContext);
      paramContext.hOg.hNw.hNS = com.tencent.mm.plugin.appbrand.dynamic.b.b.TS();
      GMTrace.o(18853564252160L, 140470);
      return paramContext;
    case 2: 
      paramContext = new MSurfaceView(paramContext);
      paramContext.hOg.hNw.hNS = com.tencent.mm.plugin.appbrand.dynamic.b.b.TS();
      GMTrace.o(18853564252160L, 140470);
      return paramContext;
    case 3: 
      paramContext = new MCanvasView(paramContext);
      paramContext.hOg.hNw.hNS = com.tencent.mm.plugin.appbrand.dynamic.b.b.TS();
      GMTrace.o(18853564252160L, 140470);
      return paramContext;
    }
    paramContext = new MDrawableView(paramContext);
    paramContext.hOg.hNw.hNS = com.tencent.mm.plugin.appbrand.dynamic.b.b.TS();
    GMTrace.o(18853564252160L, 140470);
    return paramContext;
  }
  
  public static void initialize()
  {
    GMTrace.i(18966844014592L, 141314);
    com.tencent.mm.bv.a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18967112450048L, 141316);
        Object localObject = a.b.fVY;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.er("100284");
        if (localObject == null)
        {
          w.i("MicroMsg.WidgetDrawableViewFactory", "widget canvas mode ABTest item is null.");
          GMTrace.o(18967112450048L, 141316);
          return;
        }
        if (!((c)localObject).isValid())
        {
          b.iz(0);
          GMTrace.o(18967112450048L, 141316);
          return;
        }
        try
        {
          b.iz(bg.getInt((String)((c)localObject).bSg().get("mode"), 0));
          w.i("MicroMsg.WidgetDrawableViewFactory", "current canvas mode is : %d", new Object[] { Integer.valueOf(b.hWf) });
          GMTrace.o(18967112450048L, 141316);
          return;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.WidgetDrawableViewFactory", "parse widget canvas mode error : %s", new Object[] { Log.getStackTraceString(localException) });
          GMTrace.o(18967112450048L, 141316);
        }
      }
    });
    GMTrace.o(18966844014592L, 141314);
  }
  
  public static void iz(int paramInt)
  {
    GMTrace.i(18853295816704L, 140468);
    hWf = paramInt;
    fXO = true;
    GMTrace.o(18853295816704L, 140468);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */