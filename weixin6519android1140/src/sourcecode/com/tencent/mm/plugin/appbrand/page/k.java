package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.permission.c;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.AppBrandOptionButton;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.k.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public abstract class k
  extends SwipeBackLayout
  implements SwipeBackLayout.a, k.a
{
  private View Hw;
  m hyJ;
  private boolean iuq;
  public boolean iur;
  
  public k(Context paramContext, m paramm)
  {
    super(paramContext);
    GMTrace.i(10250878976000L, 76375);
    this.iur = false;
    this.hyJ = paramm;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    init();
    this.xsJ = false;
    mM(true);
    this.Hw = new com.tencent.mm.plugin.appbrand.widget.k(getContext());
    paramContext = new ViewGroup.LayoutParams(-1, -1);
    ((ViewGroup)this.Hw).addView(Zb(), paramContext);
    addView(this.Hw);
    this.Hw = this.Hw;
    this.xsO = this;
    GMTrace.o(10250878976000L, 76375);
  }
  
  private void a(String paramString, z paramz)
  {
    GMTrace.i(10252892241920L, 76390);
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", h.sv(Zi()));
    localHashMap.put("query", h.sw(Zi()));
    if (paramz != null) {
      localHashMap.put("openType", paramz.toString());
    }
    d.k(localHashMap);
    Zh().a(paramString, new JSONObject(localHashMap).toString(), null);
    GMTrace.o(10252892241920L, 76390);
  }
  
  protected static boolean c(int[] paramArrayOfInt, int paramInt)
  {
    GMTrace.i(10253294895104L, 76393);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      GMTrace.o(10253294895104L, 76393);
      return true;
    }
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramArrayOfInt[i] == paramInt)
      {
        GMTrace.o(10253294895104L, 76393);
        return true;
      }
      i += 1;
    }
    GMTrace.o(10253294895104L, 76393);
    return false;
  }
  
  public final void U(float paramFloat)
  {
    GMTrace.i(10253429112832L, 76394);
    if (this.iuq)
    {
      if (paramFloat == 1.0F) {
        break label51;
      }
      setVisibility(0);
    }
    while (Float.compare(1.0F, paramFloat) <= 0)
    {
      j.n(this.Hw, 0.0F);
      GMTrace.o(10253429112832L, 76394);
      return;
      label51:
      hide();
    }
    float f = this.Hw.getWidth() / 4;
    j.n(this.Hw, f * (1.0F - paramFloat) * -1.0F);
    GMTrace.o(10253429112832L, 76394);
  }
  
  protected abstract View Zb();
  
  public void Ze()
  {
    boolean bool2 = true;
    GMTrace.i(10251952717824L, 76383);
    w.d("MicroMsg.AppBrandPage", "onPageForeground: %s", new Object[] { Zi() });
    com.tencent.mm.ui.widget.k.b(this);
    this.xpb = false;
    m localm = this.hyJ;
    boolean bool1 = bool2;
    if (localm.hzM.RB() == null)
    {
      bool1 = bool2;
      if (localm.iuv.size() == 1) {
        bool1 = false;
      }
    }
    this.mEnable = bool1;
    U(1.0F);
    this.iuq = false;
    setVisibility(0);
    Zl();
    GMTrace.o(10251952717824L, 76383);
  }
  
  public void Zf()
  {
    GMTrace.i(10252086935552L, 76384);
    w.d("MicroMsg.AppBrandPage", "onPageBackground: %s", new Object[] { Zi() });
    com.tencent.mm.ui.widget.k.a(this);
    this.iuq = true;
    GMTrace.o(10252086935552L, 76384);
  }
  
  protected void Zg()
  {
    GMTrace.i(10252221153280L, 76385);
    w.d("MicroMsg.AppBrandPage", "onPageDestroy: %s", new Object[] { Zi() });
    GMTrace.o(10252221153280L, 76385);
  }
  
  public abstract AppBrandPageView Zh();
  
  public abstract String Zi();
  
  public final a.c Zk()
  {
    GMTrace.i(10252489588736L, 76387);
    a.c localc = this.hyJ.hzM.hyH.pd(h.sv(Zi()));
    GMTrace.o(10252489588736L, 76387);
    return localc;
  }
  
  protected final void Zl()
  {
    GMTrace.i(10252623806464L, 76388);
    a.c localc = Zk();
    AppBrandPageView localAppBrandPageView = Zh();
    String str1 = localc.hPP;
    String str2 = localc.hPO;
    if (!localAppBrandPageView.ivo) {
      localAppBrandPageView.ivp = g.at(str1, localAppBrandPageView.ivp);
    }
    if (!localAppBrandPageView.ivq) {
      localAppBrandPageView.ivr = str2;
    }
    localAppBrandPageView.C(localAppBrandPageView.ivp, localAppBrandPageView.ivr);
    Zh().setFullscreen(localc.hPT);
    GMTrace.o(10252623806464L, 76388);
  }
  
  protected final void Zm()
  {
    GMTrace.i(10252758024192L, 76389);
    a.c localc = Zk();
    Zh().rO(localc.hPN);
    Object localObject1 = Zh();
    ((AppBrandPageView)localObject1).runOnUiThread(new AppBrandPageView.8((AppBrandPageView)localObject1, localc.hPP));
    localObject1 = Zh();
    ((AppBrandPageView)localObject1).runOnUiThread(new AppBrandPageView.13((AppBrandPageView)localObject1, localc.hPO));
    Zh().cs(localc.hPU);
    localObject1 = Zh();
    ((AppBrandPageView)localObject1).runOnUiThread(new AppBrandPageView.20((AppBrandPageView)localObject1, localc.hPV, localc.hPK));
    Zh().ivf.cE(true);
    Object localObject2;
    String str;
    boolean bool;
    if (c.b(Zh(), b.b.itX))
    {
      localObject1 = Zh();
      localObject2 = localc.hPQ;
      str = localc.hPR;
      bool = localc.hPS;
      if (localObject1 != null)
      {
        if ((!bg.nm((String)localObject2)) || (!bg.nm(str)) || (bool)) {
          break label266;
        }
        localObject1 = ((AppBrandPageView)localObject1).ivf;
        localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a)localObject1).iIM;
        ((AppBrandOptionButton)localObject2).iJk = true;
        ((AppBrandOptionButton)localObject2).iJl.setVisibility(8);
        ((AppBrandOptionButton)localObject2).iJo.setVisibility(0);
        if (!(((AppBrandOptionButton)localObject2).iJo.getDrawable() instanceof com.tencent.mm.svg.a.b)) {
          ((AppBrandOptionButton)localObject2).iJo.setImageResource(o.h.hDE);
        }
        ((com.tencent.mm.plugin.appbrand.widget.a)localObject1).iIM.setColor(((com.tencent.mm.plugin.appbrand.widget.a)localObject1).iIP);
      }
    }
    for (;;)
    {
      Zh().setFullscreen(localc.hPT);
      GMTrace.o(10252758024192L, 76389);
      return;
      label266:
      b.a((AppBrandPageView)localObject1, (String)localObject2, str, bool);
    }
  }
  
  public final void Zn()
  {
    GMTrace.i(10253160677376L, 76392);
    a("onAppRouteDone", null);
    w.i("MicroMsg.AppBrandPage", "onAppRouteDone: %s", new Object[] { Zi() });
    GMTrace.o(10253160677376L, 76392);
  }
  
  public final boolean Zo()
  {
    GMTrace.i(10253697548288L, 76396);
    GMTrace.o(10253697548288L, 76396);
    return false;
  }
  
  public final void Zp()
  {
    GMTrace.i(10253831766016L, 76397);
    if ((getContext() instanceof MMActivity)) {
      ((MMActivity)getContext()).aLo();
    }
    m localm = this.hyJ;
    localm.runOnUiThread(new m.18(localm, this));
    GMTrace.o(10253831766016L, 76397);
  }
  
  public final void Zq()
  {
    GMTrace.i(10253965983744L, 76398);
    this.iur = true;
    GMTrace.o(10253965983744L, 76398);
  }
  
  public final void a(z paramz)
  {
    GMTrace.i(10253026459648L, 76391);
    a("onAppRoute", paramz);
    w.i("MicroMsg.AppBrandPage", "onAppRoute: %s, %s", new Object[] { paramz.toString(), Zi() });
    GMTrace.o(10253026459648L, 76391);
  }
  
  public abstract void b(String paramString1, String paramString2, int[] paramArrayOfInt);
  
  public void cleanup()
  {
    GMTrace.i(10251818500096L, 76382);
    com.tencent.mm.ui.widget.k.b(this);
    GMTrace.o(10251818500096L, 76382);
  }
  
  public final void f(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(10253563330560L, 76395);
    if (paramBoolean)
    {
      localView = this.Hw;
      if (paramInt > 0) {}
      for (;;)
      {
        j.a(localView, l, 0.0F, null);
        GMTrace.o(10253563330560L, 76395);
        return;
        l = 240L;
      }
    }
    View localView = this.Hw;
    if (paramInt > 0) {}
    for (;;)
    {
      j.a(localView, l, this.Hw.getWidth() * -1 / 4, null);
      GMTrace.o(10253563330560L, 76395);
      return;
      l = 240L;
    }
  }
  
  public final void hide()
  {
    GMTrace.i(10252355371008L, 76386);
    if (this.iuq) {
      setVisibility(4);
    }
    GMTrace.o(10252355371008L, 76386);
  }
  
  public abstract void loadUrl(String paramString);
  
  public final void onCancel()
  {
    GMTrace.i(10254100201472L, 76399);
    this.iur = false;
    GMTrace.o(10254100201472L, 76399);
  }
  
  public abstract boolean rF(String paramString);
  
  public abstract boolean rG(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */