package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.widget.a;
import com.tencent.mm.plugin.appbrand.widget.k;

@SuppressLint({"ViewConstructor"})
public final class c
  extends k
  implements i
{
  private e hzM;
  private Runnable iBl;
  private a ivf;
  
  public c(Context paramContext, e parame)
  {
    super(paramContext);
    GMTrace.i(17303752146944L, 128923);
    this.hzM = parame;
    paramContext = new a(paramContext);
    this.ivf = paramContext;
    addView(paramContext);
    this.ivf.cE(false);
    paramContext = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17307510243328L, 128951);
        com.tencent.mm.plugin.appbrand.c.a(c.a(c.this).hyD, c.c.hys);
        c.a(c.this).finish();
        GMTrace.o(17307510243328L, 128951);
      }
    };
    this.ivf.iIS = paramContext;
    this.ivf.iIR = paramContext;
    m(this.hzM.hyF.eEs, -1, "black");
    setBackgroundColor(-1);
    GMTrace.o(17303752146944L, 128923);
  }
  
  private void m(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(17303886364672L, 128924);
    this.ivf.sJ(paramString1);
    this.ivf.setBackgroundColor(paramInt);
    this.ivf.sL(paramString2);
    this.ivf.cG(true);
    u(paramInt, "black".equals(paramString2));
    GMTrace.o(17303886364672L, 128924);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(17304691671040L, 128930);
    m(paramc.hPN, g.at(paramc.hPP, -1), paramc.hPO);
    setBackgroundColor(g.at(paramc.hPK, -1));
    GMTrace.o(17304691671040L, 128930);
  }
  
  public final void aaJ()
  {
    GMTrace.i(17304423235584L, 128928);
    removeCallbacks(this.iBl);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17309255073792L, 128964);
        c.this.setVisibility(8);
        if (c.this.getParent() != null) {
          ((ViewGroup)c.this.getParent()).removeView(c.this);
        }
        GMTrace.o(17309255073792L, 128964);
      }
    });
    GMTrace.o(17304423235584L, 128928);
  }
  
  public final void aaK()
  {
    GMTrace.i(17304557453312L, 128929);
    this.ivf.cH(true);
    GMTrace.o(17304557453312L, 128929);
  }
  
  public final void bm(String paramString1, String paramString2)
  {
    GMTrace.i(17304020582400L, 128925);
    this.ivf.sJ(paramString2);
    GMTrace.o(17304020582400L, 128925);
  }
  
  public final View getView()
  {
    GMTrace.i(17304825888768L, 128931);
    GMTrace.o(17304825888768L, 128931);
    return this;
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(17304154800128L, 128926);
    super.onAttachedToWindow();
    if (this.iBl == null)
    {
      this.iBl = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17306168066048L, 128941);
          if (c.b(c.this) != null) {
            c.b(c.this).cI(true);
          }
          GMTrace.o(17306168066048L, 128941);
        }
      };
      postDelayed(this.iBl, 1500L);
    }
    GMTrace.o(17304154800128L, 128926);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(17304289017856L, 128927);
    super.onDetachedFromWindow();
    removeCallbacks(this.iBl);
    GMTrace.o(17304289017856L, 128927);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */