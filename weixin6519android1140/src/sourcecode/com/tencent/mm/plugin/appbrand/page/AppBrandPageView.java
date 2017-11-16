package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.AppBrandOptionButton;
import com.tencent.mm.plugin.appbrand.widget.a.2;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
public final class AppBrandPageView
  extends com.tencent.mm.plugin.appbrand.jsapi.c
{
  public String hyD;
  public com.tencent.mm.plugin.appbrand.e hzM;
  public AppBrandJSInterface hzN;
  public boolean hzQ;
  public LinearLayout iuf;
  public FrameLayout iui;
  public List<com.tencent.mm.plugin.appbrand.menu.k> iut;
  public Set<e> iva;
  public Set<b> ivb;
  public Set<d> ivc;
  public Set<c> ivd;
  public Set<a> ive;
  public com.tencent.mm.plugin.appbrand.widget.a ivf;
  private FrameLayout ivg;
  public u ivh;
  public com.tencent.mm.plugin.appbrand.widget.input.e ivi;
  public t ivj;
  public r ivk;
  public com.tencent.mm.plugin.appbrand.widget.g ivl;
  private FrameLayout.LayoutParams ivm;
  boolean ivn;
  public boolean ivo;
  public int ivp;
  boolean ivq;
  public String ivr;
  private int ivs;
  public c ivt;
  public final p ivu;
  public Context mContext;
  public boolean mRunning;
  
  public AppBrandPageView()
  {
    GMTrace.i(20762006126592L, 154689);
    this.iva = Collections.newSetFromMap(new ConcurrentHashMap());
    this.ivb = Collections.newSetFromMap(new ConcurrentHashMap());
    this.ivc = Collections.newSetFromMap(new ConcurrentHashMap());
    this.ivd = Collections.newSetFromMap(new ConcurrentHashMap());
    this.ive = Collections.newSetFromMap(new ConcurrentHashMap());
    this.mRunning = true;
    this.ivn = false;
    this.hzQ = false;
    this.ivo = false;
    this.ivq = false;
    this.ivr = null;
    this.ivu = new p(hashCode());
    GMTrace.o(20762006126592L, 154689);
  }
  
  private c Zv()
  {
    GMTrace.i(20762408779776L, 154692);
    if (this.ivt != null)
    {
      localc = this.ivt;
      GMTrace.o(20762408779776L, 154692);
      return localc;
    }
    this.ivt = new c(this.mContext);
    this.ivt.a(new x()
    {
      final void WU()
      {
        GMTrace.i(20757442723840L, 154655);
        AppBrandPageView localAppBrandPageView = AppBrandPageView.this;
        localAppBrandPageView.C(localAppBrandPageView.ivp, localAppBrandPageView.ivr);
        GMTrace.o(20757442723840L, 154655);
      }
    });
    c localc = this.ivt;
    GMTrace.o(20762408779776L, 154692);
    return localc;
  }
  
  private com.tencent.mm.plugin.appbrand.jsapi.k.a d(ViewGroup paramViewGroup)
  {
    GMTrace.i(19898046611456L, 148252);
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      Object localObject = paramViewGroup.getChildAt(i);
      if ((localObject instanceof com.tencent.mm.plugin.appbrand.jsapi.k.a))
      {
        paramViewGroup = (com.tencent.mm.plugin.appbrand.jsapi.k.a)localObject;
        GMTrace.o(19898046611456L, 148252);
        return paramViewGroup;
      }
      if ((localObject instanceof ViewGroup))
      {
        localObject = d((ViewGroup)localObject);
        if (localObject != null)
        {
          GMTrace.o(19898046611456L, 148252);
          return (com.tencent.mm.plugin.appbrand.jsapi.k.a)localObject;
        }
      }
      i -= 1;
    }
    GMTrace.o(19898046611456L, 148252);
    return null;
  }
  
  private String rR(String paramString)
  {
    GMTrace.i(10243631218688L, 76321);
    paramString = this.hyD + ":" + this.ivj.hZo + ":" + paramString;
    GMTrace.o(10243631218688L, 76321);
    return paramString;
  }
  
  public final void C(int paramInt, String paramString)
  {
    GMTrace.i(17290867245056L, 128827);
    com.tencent.mm.plugin.appbrand.widget.j.d(this.iuf, paramInt, "black".equals(paramString));
    GMTrace.o(17290867245056L, 128827);
  }
  
  public final com.tencent.mm.plugin.appbrand.e RV()
  {
    GMTrace.i(17290061938688L, 128821);
    com.tencent.mm.plugin.appbrand.e locale = this.hzM;
    GMTrace.o(17290061938688L, 128821);
    return locale;
  }
  
  public final com.tencent.mm.plugin.appbrand.jsruntime.a RW()
  {
    GMTrace.i(20762274562048L, 154691);
    t localt = this.ivj;
    GMTrace.o(20762274562048L, 154691);
    return localt;
  }
  
  final void Wb()
  {
    GMTrace.i(10242154823680L, 76310);
    this.ivj.onPause();
    this.ivu.ivB.aac();
    this.ivj.rS(rR("INVISIBLE"));
    this.ivt.YZ();
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10235175501824L, 76258);
        Iterator localIterator = AppBrandPageView.this.ivb.iterator();
        while (localIterator.hasNext()) {
          ((AppBrandPageView.b)localIterator.next()).Wb();
        }
        GMTrace.o(10235175501824L, 76258);
      }
    });
    GMTrace.o(10242154823680L, 76310);
  }
  
  final void Wz()
  {
    GMTrace.i(10242020605952L, 76309);
    this.ivj.onResume();
    Object localObject1;
    Object localObject2;
    if (com.tencent.mm.plugin.appbrand.a.nL(this.hyD).scene == 1023) {
      if (this.hzM.hyJ.getPageCount() == 1)
      {
        this.ivf.cH(true);
        localObject1 = this.hzM.hyF.hQy;
        localObject2 = this.hzM.hyH.Uq();
        k localk = this.hzM.hyJ.Zs();
        if ((this.hzM.RF()) || (this.hzM.hyJ.getPageCount() != 1) || (localk.rF((String)localObject2)) || (!localk.rG((String)localObject1))) {
          break label365;
        }
        this.ivf.cF(true);
      }
    }
    for (;;)
    {
      a.c(this);
      if (this.ivj.iwn)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandPageView", "reload page %s", new Object[] { this.ivj.iwc });
        this.ivj.init();
        rN(this.ivj.iwc);
        localObject1 = new i();
        localObject2 = new HashMap();
        ((HashMap)localObject2).put("path", this.ivj.hZo);
        ((i)localObject1).r((Map)localObject2).ai(this.hyD, hashCode()).VR();
      }
      localObject1 = this.ivu;
      if (((p)localObject1).ivC > 0L) {
        ((p)localObject1).ivB.aab();
      }
      this.ivj.rS(rR("VISIBLE"));
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10247657750528L, 76351);
          Iterator localIterator = AppBrandPageView.this.ivc.iterator();
          while (localIterator.hasNext()) {
            ((AppBrandPageView.d)localIterator.next()).Wz();
          }
          GMTrace.o(10247657750528L, 76351);
        }
      });
      GMTrace.o(10242020605952L, 76309);
      return;
      this.ivf.cH(false);
      this.ivf.cG(true);
      break;
      if (this.hzM.RF())
      {
        this.ivf.cH(false);
        this.ivf.cG(true);
        break;
      }
      this.ivf.cH(false);
      this.ivf.cG(false);
      break;
      label365:
      this.ivf.cF(false);
    }
  }
  
  public final String Zw()
  {
    GMTrace.i(16151224516608L, 120336);
    Object localObject = this.ivf.iIH.getText();
    if (localObject != null)
    {
      localObject = ((CharSequence)localObject).toString();
      GMTrace.o(16151224516608L, 120336);
      return (String)localObject;
    }
    GMTrace.o(16151224516608L, 120336);
    return "";
  }
  
  public final com.tencent.mm.plugin.appbrand.jsapi.k.a Zx()
  {
    GMTrace.i(19897912393728L, 148251);
    com.tencent.mm.plugin.appbrand.jsapi.k.a locala = d(this.ivh.jm(0));
    GMTrace.o(19897912393728L, 148251);
    return locala;
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.appbrand.e parame)
  {
    GMTrace.i(20762140344320L, 154690);
    this.mContext = paramContext;
    this.hzM = parame;
    this.hyD = parame.hyD;
    parame = this.hyD;
    paramContext = new LinkedList();
    com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isn - 1, true);
    com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isu - 1, false);
    parame = com.tencent.mm.plugin.appbrand.a.nK(parame);
    boolean bool;
    if ((!com.tencent.mm.sdk.a.b.bPq()) && ((parame == null) || (parame.hRg.hKB == 1)))
    {
      bool = true;
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isv - 1, bool);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isw - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isp - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isr - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isy - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.isq - 1, false);
      int i = com.tencent.mm.plugin.appbrand.menu.l.isx;
      if (com.tencent.mm.sdk.a.b.bPq()) {
        break label909;
      }
      bool = true;
      label163:
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, i - 1, bool);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.iss - 1, true);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramContext, com.tencent.mm.plugin.appbrand.menu.l.ist - 1, false);
      this.iut = paramContext;
      this.ivp = this.mContext.getResources().getColor(o.c.aPb);
      this.ivf = new com.tencent.mm.plugin.appbrand.widget.a(this.mContext);
      paramContext = this.ivf.getLayoutParams();
      paramContext.height = com.tencent.mm.plugin.appbrand.widget.b.bX(this.mContext);
      this.ivf.setLayoutParams(paramContext);
      this.ivf.iIR = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(10261347958784L, 76453);
          AppBrandPageView.this.hzM.hyJ.Zr();
          GMTrace.o(10261347958784L, 76453);
        }
      };
      this.ivf.iIS = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(10236786114560L, 76270);
          com.tencent.mm.plugin.appbrand.c.a(AppBrandPageView.this.hyD, c.c.hys);
          paramAnonymousView = AppBrandPageView.this.hzM;
          paramAnonymousView.hyC.a(paramAnonymousView);
          GMTrace.o(10236786114560L, 76270);
        }
      };
      paramContext = this.ivf;
      parame = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15459332128768L, 115181);
          paramAnonymousView = AppBrandPageView.this.ivj;
          paramAnonymousView.getView().scrollTo(paramAnonymousView.getView().getScrollX(), 0);
          j.ao(AppBrandPageView.this.hyD, AppBrandPageView.this.hashCode());
          GMTrace.o(15459332128768L, 115181);
        }
      };
      paramContext.iIG.setOnClickListener(new a.2(paramContext, parame));
      paramContext = this.ivf;
      parame = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = 0;
          GMTrace.i(15462284918784L, 115203);
          paramAnonymousView = (AppBrandOptionButton)paramAnonymousView;
          if ((AppBrandPageView.this.mContext != null) && ((AppBrandPageView.this.mContext instanceof MMActivity))) {}
          for (boolean bool = ((MMActivity)AppBrandPageView.this.mContext).vKB.avJ();; bool = false)
          {
            if (paramAnonymousView.iJk)
            {
              paramAnonymousView = new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19009122598912L, 141629);
                  new l(AppBrandPageView.this.mContext, AppBrandPageView.this.hyD, AppBrandPageView.this, new LinkedList(AppBrandPageView.this.iut));
                  GMTrace.o(19009122598912L, 141629);
                }
              };
              if (bool) {
                i = 100;
              }
              af.i(paramAnonymousView, i);
              GMTrace.o(15462284918784L, 115203);
              return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.i.a.qg(AppBrandPageView.this.hyD);
            GMTrace.o(15462284918784L, 115203);
            return;
          }
        }
      };
      paramContext.iIM.setOnClickListener(parame);
      paramContext = this.ivf;
      parame = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19008854163456L, 141627);
          paramAnonymousView = AppBrandPageView.this.hzM.hyJ;
          paramAnonymousView.rI(paramAnonymousView.hzM.hyH.Uq());
          com.tencent.mm.plugin.appbrand.report.a.a(AppBrandPageView.this.hyD, AppBrandPageView.this.ivj.hZo, 12, "", bg.Pu(), 1, 0);
          GMTrace.o(19008854163456L, 141627);
        }
      };
      paramContext.iIL.setOnClickListener(parame);
      if (this.ivj != null) {
        break label915;
      }
      this.ivj = new t(this.mContext);
      paramContext = this.ivj;
      parame = new AppBrandJSInterface(this);
      this.hzN = parame;
      paramContext.addJavascriptInterface(parame, "WeixinJSCore");
      this.ivj.addJavascriptInterface(new DeviceInfoForSDK(), "__deviceInfo");
      label427:
      this.ivj.ivt = Zv();
      paramContext = this.ivj;
      parame = this.hzM;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onRuntimeReady, preLoadWebView %b", new Object[] { Boolean.valueOf(paramContext.iwk) });
      paramContext.hzM = parame;
      paramContext.hyD = parame.hyD;
      if (!bg.nm(paramContext.hyD)) {
        break label948;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandWebView", "doInitWebView mAppId is null");
    }
    for (;;)
    {
      if (paramContext.hUl) {
        paramContext.ZK();
      }
      this.ivj.iwd = new w()
      {
        public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
        {
          GMTrace.i(20759455989760L, 154670);
          AppBrandPageView.this.ivi.onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
          GMTrace.o(20759455989760L, 154670);
        }
      };
      this.ivj.iwe = new v()
      {
        public final boolean Zy()
        {
          GMTrace.i(20763482521600L, 154700);
          if (AppBrandPageView.this.hzM.RK())
          {
            GMTrace.o(20763482521600L, 154700);
            return false;
          }
          u localu = AppBrandPageView.this.ivh;
          u.5 local5 = new u.5(localu, Boolean.valueOf(false));
          if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            local5.b(null);
          }
          local5.b(localu.mHandler);
          GMTrace.o(20763482521600L, 154700);
          return true;
        }
      };
      if (!this.hzQ) {
        this.ivj.init();
      }
      this.ivk = new r(this.mContext, this.ivj);
      this.ivk.ivR = new r.a()
      {
        public final void Zz()
        {
          GMTrace.i(20757308506112L, 154654);
          AppBrandPageView.this.a("onPullDownRefresh", null, null);
          GMTrace.o(20757308506112L, 154654);
        }
      };
      this.ivk.ivS = new r.b()
      {
        public final void ji(int paramAnonymousInt)
        {
          GMTrace.i(20758650683392L, 154664);
          AppBrandPageView.this.ivi.setTranslationY(paramAnonymousInt);
          GMTrace.o(20758650683392L, 154664);
        }
      };
      this.iui = new FrameLayout(this.mContext);
      this.iui.addView(this.ivk);
      paramContext = this.iui;
      parame = new com.tencent.mm.plugin.appbrand.widget.input.e(this.mContext, this);
      this.ivi = parame;
      paramContext.addView(parame);
      paramContext = this.iui;
      parame = new com.tencent.mm.plugin.appbrand.widget.g(this.mContext);
      this.ivl = parame;
      paramContext.addView(parame);
      this.ivg = new FrameLayout(this.mContext);
      this.ivg.addView(this.iui, new ViewGroup.LayoutParams(-1, -1));
      this.ivk.ivS = this.ivi;
      this.iuf = new LinearLayout(this.mContext)
      {
        protected final void onDetachedFromWindow()
        {
          GMTrace.i(19009525252096L, 141632);
          super.onDetachedFromWindow();
          Object localObject = AppBrandPageView.this.ivh;
          long l = SystemClock.uptimeMillis();
          MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          localMotionEvent.setSource(4098);
          localObject = ((u)localObject).iwu.iterator();
          while (((Iterator)localObject).hasNext())
          {
            View localView = (View)((u.a)((Iterator)localObject).next()).iwG.get();
            if (localView != null) {
              localView.dispatchTouchEvent(localMotionEvent);
            }
          }
          localMotionEvent.recycle();
          GMTrace.o(19009525252096L, 141632);
        }
      };
      this.iuf.setId(o.f.hBe);
      this.iuf.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.iuf.setOrientation(1);
      this.iuf.addView(this.ivf);
      this.iuf.addView(this.ivg, new ViewGroup.LayoutParams(-1, -1));
      this.ivh = new u(this.ivj.getTopView());
      paramContext = this.ivh;
      paramContext.ivt = Zv();
      paramContext.ivt.a(new u.2(paramContext));
      this.ivm = new FrameLayout.LayoutParams(-2, -2);
      this.ivs = com.tencent.mm.br.a.fromDPToPix(this.mContext, 12);
      com.tencent.mm.plugin.appbrand.widget.input.m.i(this);
      GMTrace.o(20762140344320L, 154690);
      return;
      bool = false;
      break;
      label909:
      bool = false;
      break label163;
      label915:
      if (!(this.ivj.getContext() instanceof MutableContextWrapper)) {
        break label427;
      }
      ((MutableContextWrapper)this.ivj.getContext()).setBaseContext(this.mContext);
      break label427;
      label948:
      Bundle localBundle;
      if ((paramContext.iwk) && (paramContext.hzM != null) && (paramContext.getX5WebViewExtension() != null))
      {
        parame = "https://servicewechat.com/" + paramContext.hyD + "/" + paramContext.hzM.hyG.hRg.hKC + "/page-frame.html";
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "setReferer %s", new Object[] { parame });
        localBundle = new Bundle();
        localBundle.putString("url", parame);
      }
      try
      {
        a.a.ch(paramContext.getX5WebViewExtension()).l("invokeMiscMethod", new Object[] { "setReferer", localBundle });
        parame = com.tencent.mm.plugin.appbrand.i.oe(paramContext.hyD);
        if (parame != null) {
          parame.hzK.set(true);
        }
        com.tencent.mm.plugin.appbrand.report.a.cu(paramContext.isX5Kernel);
        paramContext.iwf = com.tencent.mm.plugin.appbrand.h.i.rw(paramContext.hyD);
      }
      catch (Exception parame)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "setReferer error " + parame);
        }
      }
    }
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(10242289041408L, 76311);
    this.ivb.add(paramb);
    GMTrace.o(10242289041408L, 76311);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(10242691694592L, 76314);
    this.ivd.add(paramc);
    GMTrace.o(10242691694592L, 76314);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(17290330374144L, 128823);
    this.ivc.add(paramd);
    GMTrace.o(17290330374144L, 128823);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(10241617952768L, 76306);
    this.iva.add(parame);
    GMTrace.o(10241617952768L, 76306);
  }
  
  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10240946864128L, 76301);
    if (this.hzM == null)
    {
      if (this.hzQ)
      {
        paramArrayOfInt = com.tencent.mm.plugin.appbrand.task.c.aal();
        if (paramArrayOfInt != null)
        {
          paramArrayOfInt.h(paramString1, paramString2, hashCode());
          GMTrace.o(10240946864128L, 76301);
          return;
        }
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandPageView", "publish runtime is null, event %s", new Object[] { paramString1 });
      GMTrace.o(10240946864128L, 76301);
      return;
    }
    this.hzM.hyI.h(paramString1, paramString2, hashCode());
    GMTrace.o(10240946864128L, 76301);
  }
  
  public final void b(b paramb)
  {
    GMTrace.i(10242423259136L, 76312);
    this.ivb.remove(paramb);
    GMTrace.o(10242423259136L, 76312);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(10242825912320L, 76315);
    this.ivd.remove(paramc);
    GMTrace.o(10242825912320L, 76315);
  }
  
  public final void b(d paramd)
  {
    GMTrace.i(17290464591872L, 128824);
    this.ivc.remove(paramd);
    GMTrace.o(17290464591872L, 128824);
  }
  
  public final void b(e parame)
  {
    GMTrace.i(10241752170496L, 76307);
    this.iva.remove(parame);
    GMTrace.o(10241752170496L, 76307);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10241349517312L, 76304);
    this.ivj.destroy();
    this.hzN.cleanup();
    this.iva.clear();
    this.ivd.clear();
    this.ivb.clear();
    this.ivc.clear();
    this.ive.clear();
    GMTrace.o(10241349517312L, 76304);
  }
  
  public final void cr(final boolean paramBoolean)
  {
    GMTrace.i(10243362783232L, 76319);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17298517655552L, 128884);
        AppBrandPageView.this.ivf.cI(paramBoolean);
        GMTrace.o(17298517655552L, 128884);
      }
    });
    GMTrace.o(10243362783232L, 76319);
  }
  
  public final void cs(final boolean paramBoolean)
  {
    GMTrace.i(10243497000960L, 76320);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17295564865536L, 128862);
        AppBrandPageView.this.ivk.ct(paramBoolean);
        AppBrandPageView.this.ivk.cs(paramBoolean);
        GMTrace.o(17295564865536L, 128862);
      }
    });
    GMTrace.o(10243497000960L, 76320);
  }
  
  public final String getAppId()
  {
    GMTrace.i(10240409993216L, 76297);
    String str = this.hyD;
    GMTrace.o(10240409993216L, 76297);
    return str;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(10241215299584L, 76303);
    boolean bool = this.mRunning;
    GMTrace.o(10241215299584L, 76303);
    return bool;
  }
  
  public final com.tencent.mm.plugin.appbrand.menu.k jh(int paramInt)
  {
    GMTrace.i(15458124169216L, 115172);
    com.tencent.mm.plugin.appbrand.menu.k localk = com.tencent.mm.plugin.appbrand.menu.m.d(this.iut, paramInt - 1);
    GMTrace.o(15458124169216L, 115172);
    return localk;
  }
  
  final void onDestroy()
  {
    GMTrace.i(10242557476864L, 76313);
    this.mRunning = false;
    Object localObject = this.ivu;
    ((p)localObject).ivB.aac();
    localObject = ((p)localObject).ivB;
    ((com.tencent.mm.plugin.appbrand.report.e)localObject).quit();
    ((com.tencent.mm.plugin.appbrand.report.e)localObject).pg = true;
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10236249243648L, 76266);
        Iterator localIterator = AppBrandPageView.this.ivd.iterator();
        while (localIterator.hasNext()) {
          ((AppBrandPageView.c)localIterator.next()).onDestroy();
        }
        GMTrace.o(10236249243648L, 76266);
      }
    });
    GMTrace.o(10242557476864L, 76313);
  }
  
  public final void onReady()
  {
    GMTrace.i(10241886388224L, 76308);
    p localp = this.ivu;
    localp.ivD = (bg.Pv() - localp.ivC);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10224303865856L, 76177);
        Object localObject = AppBrandPageView.this.ivj;
        ((t)localObject).hzM.hyT.k(4, System.currentTimeMillis() - ((t)localObject).iwi);
        AppBrandPerformanceManager.b(((t)localObject).hyD, 203, System.currentTimeMillis() - ((t)localObject).iwo);
        com.tencent.mm.plugin.appbrand.performance.a.a(((t)localObject).hyD, "Native", "PageLoad", ((t)localObject).iwo, System.currentTimeMillis(), "");
        localObject = AppBrandPageView.this.iva.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((AppBrandPageView.e)((Iterator)localObject).next()).onReady();
        }
        GMTrace.o(10224303865856L, 76177);
      }
    });
    GMTrace.o(10241886388224L, 76308);
  }
  
  public final void rN(String paramString)
  {
    GMTrace.i(10240544210944L, 76298);
    Object localObject1 = this.ivj;
    ((t)localObject1).hZo = h.sv(paramString);
    ((t)localObject1).iwc = paramString;
    ((t)localObject1).iwn = false;
    int i;
    if (!com.tencent.mm.plugin.appbrand.appcache.w.b(((t)localObject1).hzM, ((t)localObject1).hZo))
    {
      i = 0;
      if (i == 0)
      {
        this.ivf.cE(false);
        runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17302007316480L, 128910);
            AppBrandPageView.this.ivk.ct(this.val$enable);
            GMTrace.o(17302007316480L, 128910);
          }
        });
        if (this.hzM.hyJ.getPageCount() < 2) {
          this.hzM.hyY = true;
        }
        paramString = new d(this.mContext);
        localObject1 = this.hzM.hyG;
        d.inflate(paramString.getContext(), o.g.hCO, paramString);
        paramString.iub = ((ImageView)paramString.findViewById(o.f.hAL));
        paramString.iuc = ((TextView)paramString.findViewById(o.f.hAN));
        paramString.iud = ((Button)paramString.findViewById(o.f.hAK));
        paramString.iuc.setText(paramString.getResources().getString(o.i.hED, new Object[] { ((AppBrandSysConfig)localObject1).eEs }));
        Object localObject2 = new ColorMatrix();
        ((ColorMatrix)localObject2).setSaturation(0.0F);
        localObject2 = new ColorMatrixColorFilter((ColorMatrix)localObject2);
        paramString.iub.setColorFilter((ColorFilter)localObject2);
        com.tencent.mm.modelappbrand.a.b.CT().a(paramString.iub, ((AppBrandSysConfig)localObject1).hQJ, com.tencent.mm.modelappbrand.a.a.CS(), com.tencent.mm.modelappbrand.a.e.grO);
        paramString.iud.setVisibility(8);
        paramString.setBackgroundColor(-1);
        com.tencent.mm.plugin.appbrand.report.a.aq(((AppBrandSysConfig)localObject1).appId, 27);
        this.iui.addView(paramString);
        onReady();
      }
      paramString = this.ivu;
      paramString.ivC = bg.Pv();
      paramString.ivB.aab();
      GMTrace.o(10240544210944L, 76298);
      return;
    }
    ((t)localObject1).iwo = System.currentTimeMillis();
    if (((t)localObject1).hUl)
    {
      ((t)localObject1).rT(((t)localObject1).hZo);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Frame ready, inject page");
    }
    for (;;)
    {
      i = 1;
      break;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Frame not ready, wait for it");
    }
  }
  
  public final void rO(final String paramString)
  {
    GMTrace.i(10242960130048L, 76316);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10250744758272L, 76374);
        AppBrandPageView.this.ivf.sJ(paramString);
        GMTrace.o(10250744758272L, 76374);
      }
    });
    GMTrace.o(10242960130048L, 76316);
  }
  
  public final void rP(final String paramString)
  {
    GMTrace.i(19897778176000L, 148250);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18356287569920L, 136765);
        AppBrandPageView.this.ivk.ct(true);
        AppBrandPageView.this.ivk.cs(false);
        r localr = AppBrandPageView.this.ivk;
        String str = paramString;
        if (bg.nm(str))
        {
          localr.ivV.setVisibility(8);
          GMTrace.o(18356287569920L, 136765);
          return;
        }
        localr.jk(com.tencent.mm.br.a.c(localr.getContext(), o.c.aPo));
        localr.ivV.setTextColor(com.tencent.mm.br.a.c(localr.getContext(), o.c.hAd));
        localr.ivV.setVisibility(0);
        localr.ivV.setText(str);
        GMTrace.o(18356287569920L, 136765);
      }
    });
    GMTrace.o(19897778176000L, 148250);
  }
  
  public final void rQ(String paramString)
  {
    GMTrace.i(17290733027328L, 128826);
    this.ivq = true;
    this.ivr = paramString;
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19008048857088L, 141621);
        AppBrandPageView.this.C(AppBrandPageView.this.ivp, AppBrandPageView.this.ivr);
        GMTrace.o(19008048857088L, 141621);
      }
    });
    GMTrace.o(17290733027328L, 128826);
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(10241483735040L, 76305);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      GMTrace.o(10241483735040L, 76305);
      return;
    }
    this.iuf.post(paramRunnable);
    GMTrace.o(10241483735040L, 76305);
  }
  
  public final void s(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15457989951488L, 115171);
    if (paramInt == 0)
    {
      GMTrace.o(15457989951488L, 115171);
      return;
    }
    Object localObject = this.iut;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      GMTrace.o(15457989951488L, 115171);
      return;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.appbrand.menu.k localk = (com.tencent.mm.plugin.appbrand.menu.k)((Iterator)localObject).next();
      if ((localk != null) && (localk.id == paramInt - 1))
      {
        localk.ism = paramBoolean;
        GMTrace.o(15457989951488L, 115171);
        return;
      }
    }
    GMTrace.o(15457989951488L, 115171);
  }
  
  public final void setFullscreen(boolean paramBoolean)
  {
    GMTrace.i(19897643958272L, 148249);
    this.ivn = paramBoolean;
    if (!(this.mContext instanceof Activity))
    {
      GMTrace.o(19897643958272L, 148249);
      return;
    }
    Window localWindow = ((Activity)this.mContext).getWindow();
    Object localObject = this.ivf.iIM;
    int i;
    if (paramBoolean)
    {
      this.ivf.cD(true);
      com.tencent.mm.plugin.appbrand.widget.a locala = this.ivf;
      if (locala.iIF.indexOfChild(locala.iIM) != -1) {
        locala.iIF.removeView(locala.iIM);
      }
      s(com.tencent.mm.plugin.appbrand.menu.l.iss, false);
      if (this.ivg.indexOfChild((View)localObject) == -1)
      {
        this.ivm.gravity = 53;
        ((AppBrandOptionButton)localObject).setPadding(0, this.ivs, 0, this.ivs);
        this.ivg.addView((View)localObject, this.ivm);
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        i = localWindow.getDecorView().getSystemUiVisibility();
        localWindow.getDecorView().setSystemUiVisibility(i | 0x400 | 0x100);
      }
      localWindow.addFlags(1024);
      GMTrace.o(19897643958272L, 148249);
      return;
    }
    this.ivf.cD(false);
    s(com.tencent.mm.plugin.appbrand.menu.l.iss, true);
    if (this.ivg.indexOfChild((View)localObject) != -1) {
      this.ivg.removeView((View)localObject);
    }
    ((AppBrandOptionButton)localObject).setPadding(0, 0, 0, 0);
    localObject = this.ivf;
    if (((com.tencent.mm.plugin.appbrand.widget.a)localObject).iIF.indexOfChild(((com.tencent.mm.plugin.appbrand.widget.a)localObject).iIM) == -1) {
      ((com.tencent.mm.plugin.appbrand.widget.a)localObject).iIF.addView(((com.tencent.mm.plugin.appbrand.widget.a)localObject).iIM);
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = localWindow.getDecorView().getSystemUiVisibility();
      localWindow.getDecorView().setSystemUiVisibility(i & 0xFBFF & 0xFEFF);
    }
    localWindow.clearFlags(1024);
    GMTrace.o(19897643958272L, 148249);
  }
  
  private class DeviceInfoForSDK
  {
    public DeviceInfoForSDK()
    {
      GMTrace.i(19900059877376L, 148267);
      GMTrace.o(19900059877376L, 148267);
    }
    
    @android.webkit.JavascriptInterface
    @org.xwalk.core.JavascriptInterface
    public float getPixelRatio()
    {
      GMTrace.i(19900194095104L, 148268);
      float f = AppBrandPageView.this.mContext.getResources().getDisplayMetrics().density;
      GMTrace.o(19900194095104L, 148268);
      return f;
    }
    
    @android.webkit.JavascriptInterface
    @org.xwalk.core.JavascriptInterface
    public float getWidth()
    {
      GMTrace.i(19900328312832L, 148269);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandPageView", "DeviceInfoForSDK.getWidth view-width %d", new Object[] { Integer.valueOf(AppBrandPageView.this.iuf.getWidth()) });
      float f = AppBrandPageView.this.mContext.getResources().getDisplayMetrics().widthPixels / getPixelRatio();
      GMTrace.o(19900328312832L, 148269);
      return f;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean Yb();
  }
  
  public static abstract interface b
  {
    public abstract void Wb();
  }
  
  public static abstract interface c
  {
    public abstract void onDestroy();
  }
  
  public static abstract interface d
  {
    public abstract void Wz();
  }
  
  public static abstract interface e
  {
    public abstract void onReady();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\AppBrandPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */