package com.tencent.mm.ui.e;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.b.b.b;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  public String mUrl;
  private String msr;
  private boolean vYc;
  private b.b vYd;
  private String vYe;
  
  public a(Context paramContext, b.b paramb)
  {
    super(paramContext);
    GMTrace.i(16235513249792L, 120964);
    this.msr = null;
    this.mUrl = null;
    this.vYc = false;
    this.vYd = null;
    this.vYe = "";
    this.vYd = paramb;
    refresh();
    GMTrace.o(16235513249792L, 120964);
  }
  
  private void refresh()
  {
    GMTrace.i(16235781685248L, 120966);
    at.AR().zt();
    if (com.tencent.mm.y.b.b.a(this.vYd))
    {
      w.i("MicroMsg.ChattingMonitoredBanner", "hy: start show banner: %s, %s, %s, %b", new Object[] { this.vYd, this.msr, this.mUrl, Boolean.valueOf(this.vYc) });
      Object localObject;
      ImageView localImageView;
      if (this.vYd == b.b.gpR)
      {
        at.AR().zt();
        this.msr = com.tencent.mm.y.b.b.Ce();
        at.AR().zt();
        this.mUrl = com.tencent.mm.y.b.b.Cf();
        at.AR().zt();
        this.vYc = com.tencent.mm.y.b.b.Cg();
        localObject = (TextView)getView().findViewById(R.h.bob);
        localImageView = (ImageView)getView().findViewById(R.h.bps);
        if (bg.nm(this.msr)) {
          break label369;
        }
        ((TextView)localObject).setText(this.msr);
        label165:
        ((TextView)localObject).setSelected(true);
        if (bg.nm(this.mUrl)) {
          break label379;
        }
        getView().findViewById(R.h.bOl).setBackgroundResource(R.g.bbc);
        localImageView.setImageResource(R.g.aYa);
        ((TextView)localObject).setTextColor(ab.getContext().getResources().getColor(R.e.aPh));
      }
      for (;;)
      {
        getView().setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16236721209344L, 120973);
            a.this.By(1);
            paramAnonymousView = a.this;
            String str = a.this.mUrl;
            if (bg.nm(str))
            {
              w.e("MicroMsg.ChattingMonitoredBanner", "hy: not provide url");
              GMTrace.o(16236721209344L, 120973);
              return;
            }
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", str);
            localIntent.putExtra("showShare", false);
            localIntent.putExtra("show_bottom", false);
            d.b((Context)paramAnonymousView.tyb.get(), "webview", ".ui.tools.WebViewUI", localIntent);
            GMTrace.o(16236721209344L, 120973);
          }
        });
        if (getView().getVisibility() != 0)
        {
          localObject = new StringBuilder();
          h.xw();
          this.vYe = (com.tencent.mm.kernel.a.ww() + "_" + System.currentTimeMillis());
          By(0);
        }
        setVisibility(0);
        if (!this.vYc) {
          break label421;
        }
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16236452773888L, 120971);
            w.i("MicroMsg.ChattingMonitoredBanner", "hy: user required close the banner");
            a.this.By(2);
            at.AR().zt().c(b.b.gpQ);
            at.AR().zt().c(b.b.gpR);
            a.this.setVisibility(8);
            GMTrace.o(16236452773888L, 120971);
          }
        });
        GMTrace.o(16235781685248L, 120966);
        return;
        at.AR().zt();
        this.msr = com.tencent.mm.y.b.b.Cb();
        at.AR().zt();
        this.mUrl = com.tencent.mm.y.b.b.Cc();
        at.AR().zt();
        this.vYc = com.tencent.mm.y.b.b.Cd();
        break;
        label369:
        ((TextView)localObject).setText(R.l.cUV);
        break label165;
        label379:
        getView().findViewById(R.h.bOl).setBackgroundResource(R.e.aPg);
        localImageView.setImageResource(R.g.aXZ);
        ((TextView)localObject).setTextColor(ab.getContext().getResources().getColor(R.e.white));
      }
      label421:
      localImageView.setVisibility(8);
      GMTrace.o(16235781685248L, 120966);
      return;
    }
    w.i("MicroMsg.ChattingMonitoredBanner", "hy: should not show banner");
    setVisibility(8);
    GMTrace.o(16235781685248L, 120966);
  }
  
  public final void By(int paramInt)
  {
    int i = 1;
    GMTrace.i(17804652707840L, 132655);
    g localg = g.ork;
    String str = this.vYe;
    if (this.vYd == b.b.gpQ) {
      i = 0;
    }
    localg.i(14439, new Object[] { str, Integer.valueOf(paramInt), Integer.valueOf(i) });
    g.ork.a(633L, paramInt, 1L, false);
    GMTrace.o(17804652707840L, 132655);
  }
  
  public final boolean abd()
  {
    GMTrace.i(16236050120704L, 120968);
    refresh();
    boolean bool = super.abd();
    GMTrace.o(16236050120704L, 120968);
    return bool;
  }
  
  public final void destroy()
  {
    GMTrace.i(16236184338432L, 120969);
    GMTrace.o(16236184338432L, 120969);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(16235647467520L, 120965);
    int i = R.i.ctk;
    GMTrace.o(16235647467520L, 120965);
    return i;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(16235915902976L, 120967);
    super.setVisibility(paramInt);
    getView().findViewById(R.h.bOl).setVisibility(paramInt);
    GMTrace.o(16235915902976L, 120967);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */