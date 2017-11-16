package com.tencent.mm.plugin.appbrand.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.o.a;
import com.tencent.mm.plugin.appbrand.compat.o.b;
import com.tencent.mm.plugin.appbrand.n.a.a;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;

public class AppBrandLoadIconPreference
  extends Preference
{
  int iFa;
  private int iFb;
  int iFc;
  b.f iFd;
  private final int iFe;
  public AppBrandNearbyShowcaseView iGa;
  View iGb;
  public String iGc;
  private boolean iGd;
  private int iGe;
  public LinkedList<com.tencent.mm.plugin.appbrand.n.b> iGf;
  ThreeDotsLoadingView izH;
  private Context mContext;
  private View mView;
  
  public AppBrandLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20043538628608L, 149336);
    this.mView = null;
    this.iGd = false;
    this.iFe = -1;
    this.iGe = -1;
    this.iGf = new LinkedList();
    bT(paramContext);
    GMTrace.o(20043538628608L, 149336);
  }
  
  public AppBrandLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20043672846336L, 149337);
    this.mView = null;
    this.iGd = false;
    this.iFe = -1;
    this.iGe = -1;
    this.iGf = new LinkedList();
    bT(paramContext);
    GMTrace.o(20043672846336L, 149337);
  }
  
  static void b(View paramView, Runnable paramRunnable)
  {
    GMTrace.i(20044343934976L, 149342);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(paramRunnable).start();
    GMTrace.o(20044343934976L, 149342);
  }
  
  private void bT(Context paramContext)
  {
    GMTrace.i(20043807064064L, 149338);
    setLayoutResource(o.b.hPu);
    this.mContext = paramContext;
    GMTrace.o(20043807064064L, 149338);
  }
  
  public static void onDestroy()
  {
    GMTrace.i(20044209717248L, 149341);
    com.tencent.mm.plugin.appbrand.n.a.reset();
    GMTrace.o(20044209717248L, 149341);
  }
  
  final void bJ(final View paramView)
  {
    GMTrace.i(20044478152704L, 149343);
    if (paramView.getVisibility() == 0) {
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20043135975424L, 149333);
          paramView.setVisibility(8);
          GMTrace.o(20043135975424L, 149333);
        }
      }).start();
    }
    GMTrace.o(20044478152704L, 149343);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20043941281792L, 149339);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(20043941281792L, 149339);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(20044075499520L, 149340);
    super.onBindView(paramView);
    this.iFa = com.tencent.mm.br.a.fromDPToPix(this.mContext, 21);
    this.iFb = com.tencent.mm.br.a.fromDPToPix(this.mContext, 11);
    this.iFc = com.tencent.mm.br.a.fromDPToPix(this.mContext, 2);
    this.iGb = paramView.findViewById(o.a.hPs);
    this.izH = ((ThreeDotsLoadingView)paramView.findViewById(o.a.hBc));
    this.iGa = ((AppBrandNearbyShowcaseView)paramView.findViewById(o.a.hPt));
    this.iGa.jR(this.iFa + this.iFc * 2);
    this.iGa.jS(this.iFb);
    if ((this.iGc == null) || (this.izH == null))
    {
      w.i("MicroMsg.AppBrandLoadIconPreference", "startLoad mTalker or mLoadingView is null");
      GMTrace.o(20044075499520L, 149340);
      return;
    }
    if (this.iGd)
    {
      w.i("MicroMsg.AppBrandLoadIconPreference", "startLoad has load.");
      GMTrace.o(20044075499520L, 149340);
      return;
    }
    this.iGd = true;
    bJ(this.iGb);
    b(this.izH, null);
    this.izH.cju();
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20043404410880L, 149335);
        AppBrandLoadIconPreference localAppBrandLoadIconPreference = AppBrandLoadIconPreference.this;
        com.tencent.mm.plugin.appbrand.n.a.reset();
        com.tencent.mm.plugin.appbrand.n.a.a(localAppBrandLoadIconPreference.iGc, new AppBrandLoadIconPreference.2(localAppBrandLoadIconPreference));
        GMTrace.o(20043404410880L, 149335);
      }
    });
    GMTrace.o(20044075499520L, 149340);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\widget\AppBrandLoadIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */