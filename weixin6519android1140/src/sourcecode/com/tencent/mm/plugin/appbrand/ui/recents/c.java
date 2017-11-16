package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.c.c.b;
import com.tencent.mm.plugin.appbrand.c.c.c;
import com.tencent.mm.plugin.appbrand.c.d.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.report.a.b.a;
import com.tencent.mm.plugin.appbrand.report.a.b.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.protocal.c.afz;
import com.tencent.mm.protocal.c.apw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;

final class c
  implements View.OnClickListener, c.c
{
  View UU;
  public Activity eNu;
  private ThreeDotsLoadingView iEW;
  private int iEZ;
  private final int iFa;
  private final int iFb;
  private final int iFc;
  private b.f iFd;
  private final int iFe;
  private final int iFf;
  View iFg;
  TextView iFh;
  public AppBrandNearbyShowcaseView iFi;
  public View iFj;
  private ImageView iFk;
  public boolean iFl;
  
  c(Activity paramActivity, ViewGroup paramViewGroup)
  {
    GMTrace.i(16344766480384L, 121778);
    this.iEZ = a.iFr;
    this.iFe = -1;
    this.iFl = false;
    this.eNu = paramActivity;
    this.iFa = com.tencent.mm.br.a.fromDPToPix(paramActivity, 25);
    this.iFb = com.tencent.mm.br.a.fromDPToPix(paramActivity, 15);
    this.iFc = com.tencent.mm.br.a.fromDPToPix(paramActivity, 2);
    this.UU = LayoutInflater.from(paramActivity).inflate(o.g.hDe, paramViewGroup, false);
    paramActivity = this.UU.findViewById(o.f.hBF);
    this.iFj = paramActivity;
    paramActivity.setOnClickListener(this);
    this.iFg = this.UU.findViewById(o.f.hBZ);
    this.iFh = ((TextView)this.UU.findViewById(o.f.hCa));
    this.iFi = ((AppBrandNearbyShowcaseView)this.UU.findViewById(o.f.hBW));
    this.iFi.jT(4);
    this.iFi.jR(this.iFa + this.iFc * 2);
    this.iFi.jS(this.iFb);
    this.iEW = ((ThreeDotsLoadingView)this.UU.findViewById(o.f.hBX));
    this.iFk = ((ImageView)this.UU.findViewById(o.f.hBY));
    this.iFf = this.iFh.getCurrentTextColor();
    GMTrace.o(16344766480384L, 121778);
  }
  
  private static int at(String paramString, int paramInt)
  {
    GMTrace.i(19703430905856L, 146802);
    try
    {
      int i = Color.parseColor(paramString);
      GMTrace.o(19703430905856L, 146802);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(19703430905856L, 146802);
    }
    return paramInt;
  }
  
  private static void b(View paramView, Runnable paramRunnable)
  {
    GMTrace.i(16345303351296L, 121782);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(paramRunnable).start();
    GMTrace.o(16345303351296L, 121782);
  }
  
  private void bJ(final View paramView)
  {
    GMTrace.i(16345169133568L, 121781);
    if (paramView.getVisibility() == 0) {
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16356846075904L, 121868);
          paramView.setVisibility(8);
          GMTrace.o(16356846075904L, 121868);
        }
      }).start();
    }
    GMTrace.o(16345169133568L, 121781);
  }
  
  public final void Tz()
  {
    GMTrace.i(16345437569024L, 121783);
    if (this.UU != null) {
      this.UU.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16344632262656L, 121777);
          c.this.abr();
          if (c.this.iFl)
          {
            c.this.iFj.performClick();
            c.this.iFl = false;
          }
          GMTrace.o(16344632262656L, 121777);
        }
      });
    }
    GMTrace.o(16345437569024L, 121783);
  }
  
  final void abq()
  {
    GMTrace.i(16344900698112L, 121779);
    this.iEZ = a.iFs;
    bJ(this.iFg);
    bJ(this.iFk);
    b(this.iEW, null);
    this.iEW.cju();
    GMTrace.o(16344900698112L, 121779);
  }
  
  public final void abr()
  {
    final boolean bool = true;
    int j = 0;
    GMTrace.i(16345034915840L, 121780);
    if (this.UU == null)
    {
      GMTrace.o(16345034915840L, 121780);
      return;
    }
    Object localObject1;
    if (com.tencent.mm.plugin.appbrand.c.c.Ts())
    {
      this.UU.setVisibility(0);
      localObject1 = ((AppBrandLauncherUI)this.eNu).iAU;
      if (localObject1 != null) {
        ((d.d)localObject1).hMI[5] = "1";
      }
    }
    for (;;)
    {
      this.iEW.ZI();
      bJ(this.iEW);
      localObject1 = com.tencent.mm.plugin.appbrand.c.c.Tw();
      if (localObject1 != null) {
        break;
      }
      this.iEZ = a.iFp;
      bJ(this.iFg);
      b(this.iFk, null);
      GMTrace.o(16345034915840L, 121780);
      return;
      this.UU.setVisibility(8);
    }
    if ((((afz)localObject1).iXf <= 0) || (bg.cc(((afz)localObject1).uvG)))
    {
      this.iEZ = a.iFr;
      bJ(this.iFg);
      GMTrace.o(16345034915840L, 121780);
      return;
    }
    this.iEZ = a.iFq;
    Object localObject2 = ((AppBrandLauncherUI)this.eNu).iAU;
    if (localObject2 != null) {
      ((d.d)localObject2).hMI[3] = "1";
    }
    localObject2 = c.b.jdMethod_if(((afz)localObject1).uvK);
    switch (6.iFo[localObject2.ordinal()])
    {
    default: 
      this.iFi.jT(Math.min(((afz)localObject1).uvG.size(), 4));
      if (this.iFg.getVisibility() == 0) {
        break;
      }
    }
    for (;;)
    {
      if (bool) {
        this.iFi.abZ();
      }
      int i = j;
      if (this.iFd == null)
      {
        this.iFd = new com.tencent.mm.plugin.appbrand.ui.widget.a(this.iFa, this.iFc);
        i = j;
      }
      while (i < this.iFi.getChildCount())
      {
        com.tencent.mm.modelappbrand.a.b.CT().a(this.iFi.jU(i), ((apw)((afz)localObject1).uvG.get(i)).uFL, com.tencent.mm.modelappbrand.a.a.CS(), this.iFd);
        i += 1;
      }
      this.iFh.setText(this.eNu.getString(o.i.hFz, new Object[] { Integer.valueOf(((afz)localObject1).iXf) }));
      break;
      this.iFh.setText(((afz)localObject1).eLQ);
      this.iFh.setTextColor(at(((afz)localObject1).uvL, this.iFf));
      break;
      bool = false;
    }
    b(this.iFg, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16344363827200L, 121775);
        if ((bool) && (c.this.iFi != null)) {
          c.this.iFi.aca();
        }
        GMTrace.o(16344363827200L, 121775);
      }
    });
    GMTrace.o(16345034915840L, 121780);
  }
  
  public final void abs()
  {
    GMTrace.i(16345706004480L, 121785);
    if (this.eNu == null)
    {
      GMTrace.o(16345706004480L, 121785);
      return;
    }
    d.d locald = ((AppBrandLauncherUI)this.eNu).iAU;
    if (locald != null) {
      locald.hMI[8] = "1";
    }
    GMTrace.o(16345706004480L, 121785);
  }
  
  public final void onClick(View paramView)
  {
    int i = 0;
    GMTrace.i(16345571786752L, 121784);
    if (paramView.getId() == o.f.hBF)
    {
      if (this.eNu == null)
      {
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      if (a.iFs == this.iEZ)
      {
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      if (a.iFr == this.iEZ)
      {
        abs();
        this.eNu.startActivityForResult(new Intent(this.eNu, AppBrandNearbyEmptyUI.class), 3);
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      if ((com.tencent.mm.plugin.appbrand.c.c.Tw() != null) && (com.tencent.mm.plugin.appbrand.c.c.Tx())) {}
      for (boolean bool = true;; bool = false)
      {
        this.iFl = bool;
        if ((a.iFp == this.iEZ) || (this.iFl)) {
          i = 1;
        }
        paramView = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16346779746304L, 121793);
            if (c.this.eNu == null)
            {
              GMTrace.o(16346779746304L, 121793);
              return;
            }
            afz localafz = com.tencent.mm.plugin.appbrand.c.c.Tw();
            if ((localafz != null) && (!bg.nm(localafz.uvE)))
            {
              ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).I(c.this.eNu, localafz.uvE);
              c.this.abs();
              com.tencent.mm.plugin.appbrand.report.a.b localb = new com.tencent.mm.plugin.appbrand.report.a.b();
              localb.iyM = b.b.iyY;
              localb.iyN = localafz.iXf;
              localb.iyO = localafz.uvC;
              localb.iyQ = b.a.iyR;
              localb.rw();
            }
            GMTrace.o(16346779746304L, 121793);
          }
        };
        if (i == 0) {
          break;
        }
        abq();
        com.tencent.mm.plugin.appbrand.c.c.refresh();
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      paramView.run();
    }
    GMTrace.o(16345571786752L, 121784);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(16350940495872L, 121824);
      iFp = 1;
      iFq = 2;
      iFr = 3;
      iFs = 4;
      iFt = new int[] { iFp, iFq, iFr, iFs };
      GMTrace.o(16350940495872L, 121824);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */