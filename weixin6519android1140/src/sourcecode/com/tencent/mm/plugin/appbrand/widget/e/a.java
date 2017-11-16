package com.tencent.mm.plugin.appbrand.widget.e;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONObject;

public abstract class a
  extends c
{
  public static final LinkedList<Runnable> iQT;
  public static boolean iQU;
  public static a iQV;
  
  static
  {
    GMTrace.i(15433964978176L, 114992);
    iQT = new LinkedList();
    iQU = false;
    iQV = new a()
    {
      public final void adD()
      {
        GMTrace.i(15435441373184L, 115003);
        d.xB().A(new Runnable()
        {
          /* Error */
          public final void run()
          {
            // Byte code:
            //   0: ldc2_w 34
            //   3: ldc 36
            //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
            //   8: aload_0
            //   9: monitorenter
            //   10: getstatic 42	com/tencent/mm/plugin/appbrand/widget/e/a:iQT	Ljava/util/LinkedList;
            //   13: invokevirtual 48	java/util/LinkedList:pollFirst	()Ljava/lang/Object;
            //   16: checkcast 6	java/lang/Runnable
            //   19: astore_1
            //   20: aload_1
            //   21: ifnull +20 -> 41
            //   24: aload_1
            //   25: invokeinterface 50 1 0
            //   30: aload_0
            //   31: monitorexit
            //   32: ldc2_w 34
            //   35: ldc 36
            //   37: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
            //   40: return
            //   41: ldc 52
            //   43: ldc 54
            //   45: invokestatic 59	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
            //   48: iconst_0
            //   49: putstatic 63	com/tencent/mm/plugin/appbrand/widget/e/a:iQU	Z
            //   52: goto -22 -> 30
            //   55: astore_1
            //   56: aload_0
            //   57: monitorexit
            //   58: aload_1
            //   59: athrow
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	60	0	this	1
            //   19	6	1	localRunnable	Runnable
            //   55	4	1	localObject	Object
            // Exception table:
            //   from	to	target	type
            //   10	20	55	finally
            //   24	30	55	finally
            //   30	32	55	finally
            //   41	52	55	finally
            //   56	58	55	finally
          }
        });
        GMTrace.o(15435441373184L, 115003);
      }
    };
    GMTrace.o(15433964978176L, 114992);
  }
  
  public a()
  {
    GMTrace.i(15433159671808L, 114986);
    GMTrace.o(15433159671808L, 114986);
  }
  
  protected final boolean a(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, final JSONObject paramJSONObject, final g paramg)
  {
    GMTrace.i(20750597619712L, 154604);
    paramAppBrandPageView = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15431817494528L, 114976);
        a.this.a(paramAppBrandPageView, paramInt, paramView, paramJSONObject, a.iQV, paramg);
        GMTrace.o(15431817494528L, 114976);
      }
    };
    if (!iQU)
    {
      iQU = true;
      paramAppBrandPageView.run();
    }
    for (;;)
    {
      GMTrace.o(20750597619712L, 154604);
      return true;
      iQT.add(paramAppBrandPageView);
      w.i("MicroMsg.BaseMarkerAnimatorJsApi", "add to MarkerAnimator!");
    }
  }
  
  public abstract boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, a parama, g paramg);
  
  public static abstract interface a
  {
    public abstract void adD();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */