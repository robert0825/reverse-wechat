package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.f;
import com.tencent.mm.plugin.appbrand.widget.f.1;
import com.tencent.mm.plugin.appbrand.widget.f.a;
import com.tencent.mm.plugin.appbrand.widget.f.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class e
  extends k
{
  private String iue;
  private LinearLayout iuf;
  private FrameLayout iug;
  private f iuh;
  private FrameLayout iui;
  private AppBrandPageView iuj;
  private Map<String, AppBrandPageView> iuk;
  private LinkedList<a> iul;
  
  public e(Context paramContext, m paramm)
  {
    super(paramContext, paramm);
    GMTrace.i(10218264068096L, 76132);
    this.iuk = new HashMap();
    this.iul = new LinkedList();
    this.iuj = this.hyJ.Zt();
    GMTrace.o(10218264068096L, 76132);
  }
  
  private f Zc()
  {
    GMTrace.i(10218532503552L, 76134);
    f localf = new f(getContext());
    Object localObject1 = this.hyJ.hzM.hyH.hPA;
    localf.iJr = ((a.d)localObject1).hPI;
    Object localObject4 = ((a.d)localObject1).gjg;
    String str1 = ((a.d)localObject1).hPJ;
    Object localObject3 = ((a.d)localObject1).hPK;
    Object localObject2 = ((a.d)localObject1).hPL;
    localf.iJs = g.at((String)localObject4, localf.getResources().getColor(o.c.aOE));
    localf.iJt = g.at(str1, localf.getResources().getColor(o.c.aPp));
    float f = com.tencent.mm.br.a.fromDPToPix(localf.getContext(), 1);
    if (f / 2.0F > 1.0F) {}
    for (int i = (int)(f / 2.0F);; i = 1)
    {
      localObject4 = new GradientDrawable();
      ((GradientDrawable)localObject4).setColor(g.at((String)localObject3, -1));
      localObject3 = new GradientDrawable();
      ((GradientDrawable)localObject3).setShape(0);
      ((GradientDrawable)localObject3).setColor(0);
      if ("white".equals(localObject2))
      {
        ((GradientDrawable)localObject3).setStroke(i, Color.parseColor("#33ffffff"));
        localObject2 = new LayerDrawable(new Drawable[] { localObject4, localObject3 });
        if (!"top".equals(localf.iJr)) {
          break label407;
        }
        ((LayerDrawable)localObject2).setLayerInset(1, -i, -i, -i, -i);
        localf.iJq.setImageDrawable((Drawable)localObject2);
        localObject1 = ((a.d)localObject1).eOM.iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label506;
        }
        localObject4 = (a.e)((Iterator)localObject1).next();
        localObject2 = ((a.e)localObject4).url;
        localObject3 = ((a.e)localObject4).text;
        str1 = ((a.e)localObject4).eQA;
        String str2 = ((a.e)localObject4).hPM;
        localObject4 = new f.a();
        try
        {
          ((f.a)localObject4).ua = f.sM(str1);
          ((f.a)localObject4).iJy = f.sM(str2);
          ((f.a)localObject4).iJz = ((String)localObject3);
          ((f.a)localObject4).mUrl = ((String)localObject2);
          if ((((f.a)localObject4).iJz == null) && ((((f.a)localObject4).ua == null) || (((f.a)localObject4).iJy == null)))
          {
            w.e("MicroMsg.AppBrandPageTabBar", "illegal data");
            continue;
            ((GradientDrawable)localObject3).setStroke(i, Color.parseColor("#33000000"));
            break;
            label407:
            ((LayerDrawable)localObject2).setLayerInset(1, -i, 0, -i, -i);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.AppBrandPageTabBar", localException.getMessage());
          }
          localObject2 = (LinearLayout)LayoutInflater.from(localf.getContext()).inflate(o.g.hDm, localf.iJp, false);
          localf.a((View)localObject2, (f.a)localObject4, false);
          ((LinearLayout)localObject2).setOnClickListener(new f.1(localf));
          localf.iJu.add(localObject4);
          localf.iJp.addView((View)localObject2);
        }
      }
      label506:
      localf.iJw = new f.b()
      {
        public final void rH(String paramAnonymousString)
        {
          GMTrace.i(10264703401984L, 76478);
          e.this.hyJ.rJ(paramAnonymousString);
          GMTrace.o(10264703401984L, 76478);
        }
      };
      GMTrace.o(10218532503552L, 76134);
      return localf;
    }
  }
  
  private void Zd()
  {
    GMTrace.i(17295296430080L, 128860);
    Iterator localIterator = this.iul.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      removeCallbacks(locala);
      locala.Lv = true;
    }
    this.iul.clear();
    GMTrace.o(17295296430080L, 128860);
  }
  
  /* Error */
  private AppBrandPageView rD(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 360
    //   5: ldc_w 362
    //   8: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 67	com/tencent/mm/plugin/appbrand/page/e:iuj	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   15: ifnull +61 -> 76
    //   18: aload_0
    //   19: getfield 67	com/tencent/mm/plugin/appbrand/page/e:iuj	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   22: astore_2
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 67	com/tencent/mm/plugin/appbrand/page/e:iuj	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   28: aload_0
    //   29: getfield 50	com/tencent/mm/plugin/appbrand/page/e:iuk	Ljava/util/Map;
    //   32: aload_1
    //   33: aload_2
    //   34: invokeinterface 368 3 0
    //   39: pop
    //   40: aload_2
    //   41: getfield 372	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:iuf	Landroid/widget/LinearLayout;
    //   44: aload_2
    //   45: getfield 376	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivf	Lcom/tencent/mm/plugin/appbrand/widget/a;
    //   48: invokevirtual 379	android/widget/LinearLayout:removeView	(Landroid/view/View;)V
    //   51: aload_0
    //   52: getfield 381	com/tencent/mm/plugin/appbrand/page/e:iui	Landroid/widget/FrameLayout;
    //   55: aload_2
    //   56: getfield 372	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:iuf	Landroid/widget/LinearLayout;
    //   59: iconst_0
    //   60: invokevirtual 386	android/widget/FrameLayout:addView	(Landroid/view/View;I)V
    //   63: ldc2_w 360
    //   66: ldc_w 362
    //   69: invokestatic 70	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_2
    //   75: areturn
    //   76: aload_0
    //   77: getfield 59	com/tencent/mm/plugin/appbrand/page/k:hyJ	Lcom/tencent/mm/plugin/appbrand/page/m;
    //   80: invokevirtual 65	com/tencent/mm/plugin/appbrand/page/m:Zt	()Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   83: astore_2
    //   84: goto -56 -> 28
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	e
    //   0	92	1	paramString	String
    //   22	62	2	localAppBrandPageView	AppBrandPageView
    // Exception table:
    //   from	to	target	type
    //   2	28	87	finally
    //   28	72	87	finally
    //   76	84	87	finally
  }
  
  private void rE(String paramString)
  {
    GMTrace.i(10218935156736L, 76137);
    AppBrandPageView localAppBrandPageView2 = (AppBrandPageView)this.iuk.get(h.sv(paramString));
    localAppBrandPageView2.iuf.setVisibility(4);
    paramString = null;
    Iterator localIterator = this.iuk.values().iterator();
    if (localIterator.hasNext())
    {
      AppBrandPageView localAppBrandPageView1 = (AppBrandPageView)localIterator.next();
      if (localAppBrandPageView1.iuf.getVisibility() != 0) {
        break label172;
      }
      paramString = localAppBrandPageView1;
    }
    label172:
    for (;;)
    {
      break;
      localAppBrandPageView2.iuf.setVisibility(0);
      if (this.iug.indexOfChild(localAppBrandPageView2.ivf) == -1) {
        this.iug.addView(localAppBrandPageView2.ivf, 0);
      }
      if (paramString != null)
      {
        paramString.iuf.setVisibility(4);
        this.iug.removeView(paramString.ivf);
      }
      localAppBrandPageView2.Wz();
      if (paramString != null) {
        paramString.Wb();
      }
      Zl();
      GMTrace.o(10218935156736L, 76137);
      return;
    }
  }
  
  protected final View Zb()
  {
    GMTrace.i(18355482263552L, 136759);
    LinearLayout localLinearLayout;
    if (this.iuf == null)
    {
      localLinearLayout = new LinearLayout(getContext());
      localLinearLayout.setOrientation(1);
      localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.iug = new FrameLayout(getContext());
      this.iug.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
      this.iui = new FrameLayout(getContext());
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
      localLayoutParams.weight = 1.0F;
      this.iui.setLayoutParams(localLayoutParams);
      this.iuh = Zc();
      if (!"top".equals(this.hyJ.hzM.hyH.hPA.hPI)) {
        break label193;
      }
      localLinearLayout.addView(this.iug);
      localLinearLayout.addView(this.iuh);
      localLinearLayout.addView(this.iui);
    }
    for (;;)
    {
      this.iuf = localLinearLayout;
      localLinearLayout = this.iuf;
      GMTrace.o(18355482263552L, 136759);
      return localLinearLayout;
      label193:
      localLinearLayout.addView(this.iug);
      localLinearLayout.addView(this.iui);
      localLinearLayout.addView(this.iuh);
    }
  }
  
  public final void Ze()
  {
    GMTrace.i(10219203592192L, 76139);
    super.Ze();
    Zh().Wz();
    GMTrace.o(10219203592192L, 76139);
  }
  
  public final void Zf()
  {
    GMTrace.i(10219337809920L, 76140);
    super.Zf();
    Zh().Wb();
    GMTrace.o(10219337809920L, 76140);
  }
  
  protected final void Zg()
  {
    GMTrace.i(10219472027648L, 76141);
    super.Zg();
    if (this.iuj != null) {
      this.iuj.onDestroy();
    }
    Iterator localIterator = this.iuk.values().iterator();
    while (localIterator.hasNext()) {
      ((AppBrandPageView)localIterator.next()).onDestroy();
    }
    GMTrace.o(10219472027648L, 76141);
  }
  
  /* Error */
  public final AppBrandPageView Zh()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 490
    //   5: ldc_w 492
    //   8: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 67	com/tencent/mm/plugin/appbrand/page/e:iuj	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   15: ifnull +21 -> 36
    //   18: aload_0
    //   19: getfield 67	com/tencent/mm/plugin/appbrand/page/e:iuj	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   22: astore_1
    //   23: ldc2_w 490
    //   26: ldc_w 492
    //   29: invokestatic 70	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: aload_0
    //   37: getfield 50	com/tencent/mm/plugin/appbrand/page/e:iuk	Ljava/util/Map;
    //   40: aload_0
    //   41: getfield 494	com/tencent/mm/plugin/appbrand/page/e:iue	Ljava/lang/String;
    //   44: invokestatic 395	com/tencent/mm/plugin/appbrand/n/h:sv	(Ljava/lang/String;)Ljava/lang/String;
    //   47: invokeinterface 399 2 0
    //   52: checkcast 370	com/tencent/mm/plugin/appbrand/page/AppBrandPageView
    //   55: astore_1
    //   56: ldc2_w 490
    //   59: ldc_w 492
    //   62: invokestatic 70	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: goto -33 -> 32
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	e
    //   22	34	1	localAppBrandPageView	AppBrandPageView
    //   68	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	32	68	finally
    //   36	65	68	finally
  }
  
  public final String Zi()
  {
    GMTrace.i(10220008898560L, 76145);
    String str = this.iue;
    GMTrace.o(10220008898560L, 76145);
    return str;
  }
  
  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10219606245376L, 76142);
    if ((this.iuj != null) && (c(paramArrayOfInt, this.iuj.hashCode()))) {
      this.iuj.h(paramString1, paramString2, 0);
    }
    Iterator localIterator = this.iuk.values().iterator();
    while (localIterator.hasNext())
    {
      AppBrandPageView localAppBrandPageView = (AppBrandPageView)localIterator.next();
      if (c(paramArrayOfInt, localAppBrandPageView.hashCode())) {
        localAppBrandPageView.h(paramString1, paramString2, 0);
      }
    }
    GMTrace.o(10219606245376L, 76142);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10219740463104L, 76143);
    super.cleanup();
    if (this.iuj != null) {
      this.iuj.cleanup();
    }
    Iterator localIterator = this.iuk.values().iterator();
    while (localIterator.hasNext()) {
      ((AppBrandPageView)localIterator.next()).cleanup();
    }
    Zd();
    GMTrace.o(10219740463104L, 76143);
  }
  
  public final void loadUrl(final String paramString)
  {
    GMTrace.i(10218666721280L, 76135);
    if (paramString.equals(this.iue))
    {
      GMTrace.o(10218666721280L, 76135);
      return;
    }
    int i = this.iuh.sN(paramString);
    if (i < 0)
    {
      GMTrace.o(10218666721280L, 76135);
      return;
    }
    this.iue = paramString;
    this.iuh.jV(i);
    if (this.iuk.get(h.sv(paramString)) == null)
    {
      final AppBrandPageView localAppBrandPageView = rD(h.sv(paramString));
      Zm();
      final a local2 = new a()
      {
        public final void Zj()
        {
          GMTrace.i(10224035430400L, 76175);
          e.a(e.this, paramString);
          e.this.hyJ.Zu();
          GMTrace.o(10224035430400L, 76175);
        }
      };
      localAppBrandPageView.a(new AppBrandPageView.e()
      {
        public final void onReady()
        {
          GMTrace.i(10234907066368L, 76256);
          localAppBrandPageView.b(this);
          local2.run();
          w.i("MicroMsg.AppBrandMultiplePage", "Tab page onReady received, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.fJi) });
          GMTrace.o(10234907066368L, 76256);
        }
      });
      if (this.iuk.size() > 1)
      {
        this.iul.add(local2);
        postDelayed(local2, 500L);
      }
      localAppBrandPageView.rN(paramString);
      GMTrace.o(10218666721280L, 76135);
      return;
    }
    Zd();
    rE(paramString);
    GMTrace.o(10218666721280L, 76135);
  }
  
  public final boolean rF(String paramString)
  {
    GMTrace.i(18355616481280L, 136760);
    if (this.iuh.sN(paramString) != -1)
    {
      GMTrace.o(18355616481280L, 136760);
      return true;
    }
    GMTrace.o(18355616481280L, 136760);
    return false;
  }
  
  public final boolean rG(String paramString)
  {
    GMTrace.i(20370090360832L, 151769);
    Object localObject1 = this.iuk.values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (AppBrandPageView)((Iterator)localObject1).next();
      if ((((AppBrandPageView)localObject2).ivj.iwc != null) && (((AppBrandPageView)localObject2).ivj.iwc.equals(paramString)))
      {
        GMTrace.o(20370090360832L, 151769);
        return true;
      }
    }
    localObject1 = this.iuh;
    Object localObject2 = ((f)localObject1).iJu;
    Iterator localIterator = ((f)localObject1).iJu.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localObject1 = (f.a)localIterator.next();
    } while ((((f.a)localObject1).mUrl == null) || (!((f.a)localObject1).mUrl.equals(paramString)));
    for (paramString = (String)localObject1; ((LinkedList)localObject2).indexOf(paramString) != -1; paramString = null)
    {
      GMTrace.o(20370090360832L, 151769);
      return true;
    }
    GMTrace.o(20370090360832L, 151769);
    return false;
  }
  
  private static abstract class a
    implements Runnable
  {
    boolean Lv;
    private boolean iuo;
    
    public a()
    {
      GMTrace.i(10239470469120L, 76290);
      this.iuo = false;
      this.Lv = false;
      GMTrace.o(10239470469120L, 76290);
    }
    
    public abstract void Zj();
    
    public void run()
    {
      GMTrace.i(10239738904576L, 76292);
      if ((!this.iuo) && (!this.Lv)) {}
      for (int i = 1; i == 0; i = 0)
      {
        GMTrace.o(10239738904576L, 76292);
        return;
      }
      this.iuo = true;
      Zj();
      GMTrace.o(10239738904576L, 76292);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */