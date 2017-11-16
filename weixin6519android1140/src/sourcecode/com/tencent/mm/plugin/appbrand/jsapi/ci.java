package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.c;
import java.util.LinkedList;
import java.util.List;

public final class ci
{
  public static long hZG;
  private static long hZH;
  private g hYg;
  public final List<e> hZI;
  public Runnable hZJ;
  
  static
  {
    GMTrace.i(10348321046528L, 77101);
    hZG = 200L;
    hZH = 20L;
    GMTrace.o(10348321046528L, 77101);
  }
  
  public ci()
  {
    GMTrace.i(10347649957888L, 77096);
    this.hZI = new LinkedList();
    if (VZ()) {}
    for (int i = 20;; i = 200)
    {
      hZG = i;
      this.hZJ = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10407242629120L, 77540);
          synchronized (ci.this.hZI)
          {
            if (ci.this.hZI.isEmpty())
            {
              GMTrace.o(10407242629120L, 77540);
              return;
            }
            e locale = (e)ci.this.hZI.remove(0);
            locale.VR();
            w.v("MicroMsg.SensorJsEventPublisher", "publish next event(event : %s), list size is : %d.", new Object[] { locale.getName(), Integer.valueOf(ci.this.hZI.size()) });
          }
          synchronized (ci.this.hZI)
          {
            boolean bool = ci.this.hZI.isEmpty();
            if (!bool) {
              d.xB().h(this, ci.hZG);
            }
            GMTrace.o(10407242629120L, 77540);
            return;
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
        }
      };
      this.hYg = new g(hZG, new g.a()
      {
        public final boolean f(Object... arg1)
        {
          GMTrace.i(10453010874368L, 77881);
          synchronized (ci.this.hZI)
          {
            if (ci.this.hZI.isEmpty())
            {
              GMTrace.o(10453010874368L, 77881);
              return false;
            }
            ci.this.hZJ.run();
            GMTrace.o(10453010874368L, 77881);
            return true;
          }
        }
      });
      GMTrace.o(10347649957888L, 77096);
      return;
    }
  }
  
  public static ci VY()
  {
    GMTrace.i(10347381522432L, 77094);
    ci localci = a.hZL;
    GMTrace.o(10347381522432L, 77094);
    return localci;
  }
  
  private static boolean VZ()
  {
    GMTrace.i(19711752404992L, 146864);
    if (MMWebView.getCurWebType() == WebView.c.ynG)
    {
      if (MMWebView.getTbsCoreVersion(ab.getContext()) >= 36867)
      {
        GMTrace.o(19711752404992L, 146864);
        return true;
      }
      GMTrace.o(19711752404992L, 146864);
      return false;
    }
    if (MMWebView.getCurWebType() == WebView.c.ynF)
    {
      GMTrace.o(19711752404992L, 146864);
      return true;
    }
    GMTrace.o(19711752404992L, 146864);
    return false;
  }
  
  public static int Wa()
  {
    GMTrace.i(10347515740160L, 77095);
    if (VZ())
    {
      GMTrace.o(10347515740160L, 77095);
      return 5;
    }
    GMTrace.o(10347515740160L, 77095);
    return 20;
  }
  
  public final boolean a(e parame, c arg2)
  {
    GMTrace.i(18837592342528L, 140351);
    if (parame == null)
    {
      GMTrace.o(18837592342528L, 140351);
      return false;
    }
    if (!parame.b(???))
    {
      GMTrace.o(18837592342528L, 140351);
      return false;
    }
    for (;;)
    {
      synchronized (this.hZI)
      {
        boolean bool = this.hZI.isEmpty();
        if (!this.hZI.isEmpty())
        {
          if (((e)this.hZI.get(0)).equals(parame))
          {
            this.hZI.add(0, parame);
            this.hZI.remove(1);
            if ((bool) && (!this.hYg.h(new Object[0])))
            {
              w.v("MicroMsg.SensorJsEventPublisher", "post delay publish event(event : %s).", new Object[] { parame.getName() });
              d.xB().h(this.hZJ, hZG);
            }
            GMTrace.o(18837592342528L, 140351);
            return true;
          }
          this.hZI.remove(parame);
          this.hZI.add(parame);
        }
      }
      this.hZI.add(parame);
    }
  }
  
  private static final class a
  {
    static ci hZL;
    
    static
    {
      GMTrace.i(19711349751808L, 146861);
      hZL = new ci();
      GMTrace.o(19711349751808L, 146861);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */