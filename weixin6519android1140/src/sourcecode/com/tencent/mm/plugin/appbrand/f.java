package com.tencent.mm.plugin.appbrand;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  implements n
{
  MMActivity hyB;
  FrameLayout hyK;
  public LinkedList<e> hzq;
  public HashMap<String, e> hzr;
  private AppBrandRemoteTaskController.c hzs;
  
  public f(MMActivity paramMMActivity, AppBrandRemoteTaskController.c paramc, FrameLayout paramFrameLayout)
  {
    GMTrace.i(20702816108544L, 154248);
    this.hyB = paramMMActivity;
    this.hzq = new LinkedList();
    this.hzr = new HashMap();
    this.hyK = paramFrameLayout;
    this.hzs = paramc;
    GMTrace.o(20702816108544L, 154248);
  }
  
  public final e RO()
  {
    GMTrace.i(15407389868032L, 114794);
    e locale = (e)this.hzq.peek();
    GMTrace.o(15407389868032L, 114794);
    return locale;
  }
  
  public final int RP()
  {
    GMTrace.i(20703487197184L, 154253);
    int i = this.hzq.size();
    GMTrace.o(20703487197184L, 154253);
    return i;
  }
  
  public final AppBrandRemoteTaskController.c RR()
  {
    GMTrace.i(20703889850368L, 154256);
    AppBrandRemoteTaskController.c localc = this.hzs;
    GMTrace.o(20703889850368L, 154256);
    return localc;
  }
  
  public final void a(e parame)
  {
    GMTrace.i(20703084544000L, 154250);
    int i = this.hzq.indexOf(parame);
    if (i < this.hzq.size()) {
      if (((e)this.hzq.get(i)).RF())
      {
        i = 1;
        label47:
        if (i == 0) {
          break label195;
        }
        if (!parame.RF())
        {
          i = this.hzq.indexOf(parame) + 1;
          if ((i != 0) && (i < this.hzq.size())) {
            break label109;
          }
        }
      }
    }
    for (;;)
    {
      parame.finish();
      GMTrace.o(20703084544000L, 154250);
      return;
      i += 1;
      break;
      i = 0;
      break label47;
      label109:
      Object localObject = new LinkedList();
      while ((i < this.hzq.size()) && (!((e)this.hzq.get(i)).RF()))
      {
        ((LinkedList)localObject).add(this.hzq.get(i));
        i += 1;
      }
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        d((e)((Iterator)localObject).next());
      }
    }
    label195:
    close();
    GMTrace.o(20703084544000L, 154250);
  }
  
  public final void a(final e parame, final AppBrandInitConfig paramAppBrandInitConfig, final AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(15407255650304L, 114793);
    if ((paramAppBrandInitConfig == null) || (paramAppBrandStatObject == null))
    {
      GMTrace.o(15407255650304L, 114793);
      return;
    }
    if (parame == null)
    {
      Iterator localIterator = this.hzq.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        locale.hyK.setVisibility(8);
        this.hzr.put(locale.hyD, locale);
        locale.hyU.hKO.ib(12);
      }
      this.hzq.clear();
    }
    if (nY(paramAppBrandInitConfig.appId) == null)
    {
      this.hyB.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15569659101184L, 116003);
          f localf = f.this;
          e locale1 = parame;
          AppBrandInitConfig localAppBrandInitConfig = paramAppBrandInitConfig;
          AppBrandStatObject localAppBrandStatObject = paramAppBrandStatObject;
          if (locale1 != null) {
            locale1.onPause();
          }
          e locale2 = new e(localf.hyB, localf);
          locale2.a(localAppBrandInitConfig, localAppBrandStatObject);
          locale2.hyE = locale1;
          locale2.RA();
          localf.hzq.push(locale2);
          localf.hyK.addView(locale2.hyK);
          if (locale1 != null)
          {
            locale1.h(null);
            locale2.RL();
          }
          GMTrace.o(15569659101184L, 116003);
        }
      });
      GMTrace.o(15407255650304L, 114793);
      return;
    }
    this.hyB.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        boolean bool2 = false;
        GMTrace.i(15504563503104L, 115518);
        f localf = f.this;
        e locale1 = parame;
        AppBrandInitConfig localAppBrandInitConfig = paramAppBrandInitConfig;
        AppBrandStatObject localAppBrandStatObject = paramAppBrandStatObject;
        e locale2 = localf.nY(localAppBrandInitConfig.appId);
        int i = localf.hzq.indexOf(locale2) - 1;
        if (i >= 0)
        {
          Object localObject = new LinkedList();
          while ((i >= 0) && (((e)localf.hzq.get(i)).RF()))
          {
            ((LinkedList)localObject).add(localf.hzq.get(i));
            i -= 1;
          }
          localObject = ((LinkedList)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            e locale3 = (e)((Iterator)localObject).next();
            if (locale3 != locale1) {
              localf.d(locale3);
            }
          }
        }
        if (!localf.hzq.contains(locale2))
        {
          localf.hzq.push(locale2);
          if (localf.hyK.indexOfChild(locale2.hyK) == -1) {
            localf.hyK.addView(locale2.hyK);
          }
          localf.hzr.remove(locale2.hyD);
        }
        localf.hzq.remove(locale2);
        localf.hzq.push(locale2);
        locale2.hyK.setVisibility(0);
        localf.hyK.bringChildToFront(locale2.hyK);
        locale2.hyE = locale1;
        boolean bool1;
        if (locale2.gaD)
        {
          if (localAppBrandInitConfig == null) {
            break label419;
          }
          if (!locale2.hyY) {
            break label398;
          }
          locale2.hyY = false;
          bool1 = true;
          locale2.hyW = bool1;
          bool1 = bool2;
          if (localAppBrandInitConfig != null)
          {
            if (localAppBrandStatObject != null) {
              break label424;
            }
            bool1 = bool2;
          }
        }
        for (;;)
        {
          locale2.hyX = bool1;
          locale2.hyF = localAppBrandInitConfig;
          locale2.a(localAppBrandStatObject, localAppBrandInitConfig.hQy);
          if (locale1 != null)
          {
            locale1.onPause();
            locale1.h(new f.3(localf, locale1));
            locale2.RL();
            locale2.onResume();
          }
          GMTrace.o(15504563503104L, 115518);
          return;
          label398:
          if (localAppBrandInitConfig.hKs != locale2.hyF.hKs)
          {
            bool1 = true;
            break;
          }
          label419:
          bool1 = false;
          break;
          label424:
          bool1 = bool2;
          if (localAppBrandStatObject.scene != 1022) {
            if ((bg.nm(localAppBrandInitConfig.hQy)) && (bg.nm(localAppBrandInitConfig.gqZ)) && (bg.nm(locale2.hyF.hQy)))
            {
              bool1 = bool2;
              if (bg.nm(locale2.hyF.gqZ)) {}
            }
            else
            {
              bool1 = true;
            }
          }
        }
      }
    });
    GMTrace.o(15407255650304L, 114793);
  }
  
  public final e b(e parame)
  {
    GMTrace.i(20703352979456L, 154252);
    int i = this.hzq.indexOf(parame);
    int j = this.hzq.size();
    if ((i == -1) || (i >= j - 1))
    {
      GMTrace.o(20703352979456L, 154252);
      return null;
    }
    parame = (e)this.hzq.get(i + 1);
    GMTrace.o(20703352979456L, 154252);
    return parame;
  }
  
  public final boolean c(e parame)
  {
    GMTrace.i(20703621414912L, 154254);
    boolean bool = this.hzq.contains(parame);
    GMTrace.o(20703621414912L, 154254);
    return bool;
  }
  
  public final void close()
  {
    GMTrace.i(20702950326272L, 154249);
    this.hyB.moveTaskToBack(true);
    GMTrace.o(20702950326272L, 154249);
  }
  
  public final void d(final e parame)
  {
    GMTrace.i(15407658303488L, 114796);
    this.hyB.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17759421333504L, 132318);
        f localf = f.this;
        e locale = parame;
        if (locale != null)
        {
          locale.cleanup();
          localf.hyK.removeView(locale.hyK);
          localf.hzr.remove(locale.hyD);
          localf.hzq.remove(locale);
        }
        GMTrace.o(17759421333504L, 132318);
      }
    });
    GMTrace.o(15407658303488L, 114796);
  }
  
  public final void finish()
  {
    GMTrace.i(20703218761728L, 154251);
    this.hyB.finish();
    GMTrace.o(20703218761728L, 154251);
  }
  
  final e nY(String paramString)
  {
    GMTrace.i(17400120475648L, 129641);
    Iterator localIterator = this.hzq.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.hyD.equals(paramString))
      {
        GMTrace.o(17400120475648L, 129641);
        return locale;
      }
    }
    paramString = (e)this.hzr.get(paramString);
    GMTrace.o(17400120475648L, 129641);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */