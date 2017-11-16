package com.tencent.mm.plugin.appbrand.dynamic.jsengine;

import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.svg.a.e;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.o;
import com.tencent.xweb.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.xwalk.core.WebViewExtensionListener;

public final class b
{
  public static volatile boolean fXO;
  public static final List<a> hUp;
  
  static
  {
    GMTrace.i(19916702875648L, 148391);
    hUp = new LinkedList();
    GMTrace.o(19916702875648L, 148391);
  }
  
  public static boolean a(a parama)
  {
    GMTrace.i(19916568657920L, 148390);
    if (hUp.contains(parama))
    {
      GMTrace.o(19916568657920L, 148390);
      return false;
    }
    if (fXO)
    {
      parama.onInitialized();
      GMTrace.o(19916568657920L, 148390);
      return true;
    }
    boolean bool = hUp.add(parama);
    GMTrace.o(19916568657920L, 148390);
    return bool;
  }
  
  public static void initialize()
  {
    GMTrace.i(19916434440192L, 148389);
    if (fXO)
    {
      GMTrace.o(19916434440192L, 148389);
      return;
    }
    com.tencent.xweb.util.b local1 = new com.tencent.xweb.util.b()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19921400496128L, 148426);
        w.d(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19921400496128L, 148426);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19921132060672L, 148424);
        w.e(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19921132060672L, 148424);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19920997842944L, 148423);
        w.i(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19920997842944L, 148423);
      }
      
      public final void v(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19921534713856L, 148427);
        w.v(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19921534713856L, 148427);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19921266278400L, 148425);
        w.w(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19921266278400L, 148425);
      }
    };
    o local2 = new o()
    {
      public final void c(long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(19915494916096L, 148382);
        w.v("MicroMsg.JSEngineInitializer", "callback: idkeyStat:577" + ", " + paramAnonymousLong1 + ", 1");
        g.ork.a(577L, paramAnonymousLong1, 1L, true);
        GMTrace.o(19915494916096L, 148382);
      }
      
      public final void o(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19915629133824L, 148383);
        w.v("MicroMsg.JSEngineInitializer", "callback: idkeyForPair:577" + ", " + paramAnonymousInt1 + ", 1, 577" + ", " + paramAnonymousInt2 + ", " + paramAnonymousInt3);
        g.ork.a(577, 577, paramAnonymousInt1, paramAnonymousInt2, 1, paramAnonymousInt3, true);
        GMTrace.o(19915629133824L, 148383);
      }
    };
    WebViewExtensionListener local3 = new WebViewExtensionListener()
    {
      public final Object onMiscCallBack(String paramAnonymousString, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(19916031787008L, 148386);
        if ("AddFilterResources".equals(paramAnonymousString)) {
          e.a((Resources)paramAnonymousVarArgs[0], (Map)paramAnonymousVarArgs[1]);
        }
        GMTrace.o(19916031787008L, 148386);
        return null;
      }
    };
    p.a(ab.getContext(), local1, local2, local3);
    WebView.initWebviewCore(ab.getContext(), MMWebView.xrT, new WebView.b()
    {
      public final void oR()
      {
        GMTrace.i(19922340020224L, 148433);
        w.i("MicroMsg.JSEngineInitializer", "onCoreInitFinished");
        b.fXO = true;
        Iterator localIterator = b.hUp.iterator();
        while (localIterator.hasNext()) {
          ((b.a)localIterator.next()).onInitialized();
        }
        GMTrace.o(19922340020224L, 148433);
      }
      
      public final void oS()
      {
        GMTrace.i(19922474237952L, 148434);
        w.i("MicroMsg.JSEngineInitializer", "onCoreInitFailed");
        GMTrace.o(19922474237952L, 148434);
      }
    });
    GMTrace.o(19916434440192L, 148389);
  }
  
  public static abstract interface a
  {
    public abstract void onInitialized();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\jsengine\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */