package com.tencent.mm.ui.d;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.f;

public final class a
{
  public String appId;
  public Context context;
  public WxaExposedParams iBy;
  public f ius;
  public int scene;
  public String username;
  public h vXj;
  public String vXk;
  public boolean vXl;
  
  public a(Context paramContext)
  {
    GMTrace.i(17883841167360L, 133245);
    this.iBy = new WxaExposedParams.a().UI();
    this.appId = "";
    this.vXk = "";
    this.context = paramContext;
    GMTrace.o(17883841167360L, 133245);
  }
  
  private String getAppId()
  {
    GMTrace.i(17884109602816L, 133247);
    if (bg.nm(this.username))
    {
      GMTrace.o(17884109602816L, 133247);
      return null;
    }
    if (bg.nm(this.appId))
    {
      localObject = ((com.tencent.mm.plugin.appbrand.k.b)h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(this.username);
      if (localObject != null) {
        this.appId = ((WxaAttributes)localObject).field_appId;
      }
    }
    Object localObject = this.appId;
    GMTrace.o(17884109602816L, 133247);
    return (String)localObject;
  }
  
  public final void Bx(int paramInt)
  {
    GMTrace.i(17884243820544L, 133248);
    if (bg.nm(getAppId()))
    {
      GMTrace.o(17884243820544L, 133248);
      return;
    }
    w.d("MicroMsg.AppBrandSerivceActionSheet", "stev report(%s), eventId : %s, appId %s, sceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(paramInt), this.appId, this.vXk });
    g.ork.i(13798, new Object[] { Integer.valueOf(paramInt), getAppId(), Integer.valueOf(0), this.vXk, Long.valueOf(bg.Pu()) });
    GMTrace.o(17884243820544L, 133248);
  }
  
  public final String bZj()
  {
    GMTrace.i(17884512256000L, 133250);
    if (this.iBy == null)
    {
      GMTrace.o(17884512256000L, 133250);
      return "";
    }
    if (bg.nm(this.iBy.eCQ)) {
      this.iBy.eCQ = "";
    }
    String str = this.context.getString(R.l.cRP, new Object[] { this.iBy.eCQ });
    GMTrace.o(17884512256000L, 133250);
    return str;
  }
  
  public final void ej(int paramInt1, int paramInt2)
  {
    GMTrace.i(17884378038272L, 133249);
    if (bg.nm(getAppId()))
    {
      GMTrace.o(17884378038272L, 133249);
      return;
    }
    w.d("MicroMsg.AppBrandSerivceActionSheet", "stev report(%s), appId : %s, scene %s, sceneId %s, action %s", new Object[] { Integer.valueOf(13918), this.appId, Integer.valueOf(paramInt1), this.vXk, Integer.valueOf(paramInt2) });
    g.ork.i(13918, new Object[] { getAppId(), Integer.valueOf(paramInt1), this.vXk, Integer.valueOf(paramInt2), Long.valueOf(bg.Pu()) });
    GMTrace.o(17884378038272L, 133249);
  }
  
  public final void show(int paramInt)
  {
    GMTrace.i(17883975385088L, 133246);
    this.ius = new f(this.context, f.xpQ, true);
    switch (paramInt)
    {
    default: 
      GMTrace.o(17883975385088L, 133246);
      return;
    case 1: 
      this.vXj = new a();
      if (this.vXj == null) {
        w.e("MicroMsg.AppBrandSerivceActionSheet", "resetTitleView, state is null");
      }
      break;
    }
    for (;;)
    {
      this.ius.qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(2894807957504L, 21568);
          if (a.this.vXj == null)
          {
            w.e("MicroMsg.AppBrandSerivceActionSheet", "resetOnCreateMenuListener, state is null");
            GMTrace.o(2894807957504L, 21568);
            return;
          }
          a.this.vXj.a(paramAnonymousn);
          GMTrace.o(2894807957504L, 21568);
        }
      };
      this.ius.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(2890915643392L, 21539);
          if (a.this.vXj == null)
          {
            w.e("MicroMsg.AppBrandSerivceActionSheet", "resetOnCreateMenuListener, state is null");
            GMTrace.o(2890915643392L, 21539);
            return;
          }
          a.this.vXj.c(paramAnonymousMenuItem, paramAnonymousInt);
          GMTrace.o(2890915643392L, 21539);
        }
      };
      this.ius.bFk();
      GMTrace.o(17883975385088L, 133246);
      return;
      this.vXj = new b();
      break;
      this.vXj = new f();
      break;
      this.vXj = new g();
      break;
      this.vXj = new d();
      break;
      this.vXj = new e();
      break;
      View localView = this.vXj.bZk();
      if (localView != null) {
        this.ius.dH(localView);
      }
    }
  }
  
  public final class a
    extends a.c
  {
    public a()
    {
      super();
      GMTrace.i(17880754159616L, 133222);
      GMTrace.o(17880754159616L, 133222);
    }
    
    public final void a(n paramn)
    {
      GMTrace.i(17880888377344L, 133223);
      super.a(paramn);
      paramn.e(2, a.this.context.getString(R.l.cSd));
      paramn.e(7, a.this.bZj());
      GMTrace.o(17880888377344L, 133223);
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(17881022595072L, 133224);
      super.c(paramMenuItem, paramInt);
      GMTrace.o(17881022595072L, 133224);
    }
  }
  
  public final class b
    extends a.c
  {
    public b()
    {
      super();
      GMTrace.i(17882230554624L, 133233);
      GMTrace.o(17882230554624L, 133233);
    }
    
    public final void a(n paramn)
    {
      GMTrace.i(17882364772352L, 133234);
      super.a(paramn);
      paramn.e(3, a.this.context.getString(R.l.cSf));
      paramn.e(7, a.this.bZj());
      GMTrace.o(17882364772352L, 133234);
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(17882498990080L, 133235);
      super.c(paramMenuItem, paramInt);
      GMTrace.o(17882498990080L, 133235);
    }
  }
  
  public class c
    implements a.h
  {
    public c()
    {
      GMTrace.i(17882633207808L, 133236);
      GMTrace.o(17882633207808L, 133236);
    }
    
    public void a(n paramn)
    {
      GMTrace.i(17882901643264L, 133238);
      GMTrace.o(17882901643264L, 133238);
    }
    
    public View bZk()
    {
      GMTrace.i(17882767425536L, 133237);
      GMTrace.o(17882767425536L, 133237);
      return null;
    }
    
    public void c(MenuItem paramMenuItem, int paramInt)
    {
      int i = 1;
      GMTrace.i(17883035860992L, 133239);
      switch (paramMenuItem.getItemId())
      {
      default: 
        paramInt = 0;
      }
      for (;;)
      {
        if (paramInt != 0) {
          a.this.ius.bFl();
        }
        GMTrace.o(17883035860992L, 133239);
        return;
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17885988651008L, 133261);
            a.this.show(3);
            GMTrace.o(17885988651008L, 133261);
          }
        }, 100L);
        paramInt = i;
        continue;
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17880619941888L, 133221);
            a.this.show(4);
            GMTrace.o(17880619941888L, 133221);
          }
        }, 100L);
        paramInt = i;
        continue;
        a.this.ius.bFl();
        paramInt = i;
        continue;
        paramInt = i;
        if (!bg.nm(a.this.username))
        {
          b.j(a.this.context, a.this.username, true);
          if (a.this.vXl)
          {
            a.this.Bx(6);
            paramInt = i;
          }
          else
          {
            a.this.ej(a.this.scene, 4);
            paramInt = i;
            continue;
            paramInt = i;
            if (!bg.nm(a.this.username))
            {
              b.j(a.this.context, a.this.username, false);
              if (a.this.vXl)
              {
                a.this.Bx(1);
                paramInt = i;
              }
              else
              {
                a.this.ej(a.this.scene, 2);
                paramInt = i;
                continue;
                paramMenuItem = a.this;
                Context localContext = a.this.context;
                WxaExposedParams localWxaExposedParams = a.this.iBy;
                if (localWxaExposedParams == null)
                {
                  w.e("MicroMsg.AppBrandSerivceActionSheet", "exportUrlParams is null");
                  paramInt = i;
                }
                else
                {
                  w.i("MicroMsg.AppBrandSerivceActionSheet", "exportUrlParams : %s", new Object[] { localWxaExposedParams.toString() });
                  paramInt = i;
                  if (!bg.nm(localWxaExposedParams.username))
                  {
                    Intent localIntent = new Intent();
                    localIntent.putExtra("key_username", localWxaExposedParams.username);
                    localIntent.putExtra("key_from_scene", 4);
                    localIntent.putExtra("key_scene_exposed_params", localWxaExposedParams);
                    d.b(localContext, "appbrand", ".ui.AppBrandProfileUI", localIntent);
                    paramMenuItem.ej(paramMenuItem.scene, 1);
                    paramInt = i;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final class d
    extends a.c
  {
    public d()
    {
      super();
      GMTrace.i(17886659739648L, 133266);
      GMTrace.o(17886659739648L, 133266);
    }
    
    public final void a(n paramn)
    {
      GMTrace.i(17886793957376L, 133267);
      super.a(paramn);
      paramn.e(2, a.this.context.getString(R.l.cSd));
      paramn.e(7, a.this.bZj());
      GMTrace.o(17886793957376L, 133267);
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(17886928175104L, 133268);
      super.c(paramMenuItem, paramInt);
      GMTrace.o(17886928175104L, 133268);
    }
  }
  
  public final class e
    extends a.c
  {
    public e()
    {
      super();
      GMTrace.i(17885451780096L, 133257);
      GMTrace.o(17885451780096L, 133257);
    }
    
    public final void a(n paramn)
    {
      GMTrace.i(17885585997824L, 133258);
      super.a(paramn);
      paramn.e(3, a.this.context.getString(R.l.cSf));
      paramn.e(7, a.this.bZj());
      GMTrace.o(17885585997824L, 133258);
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(17885720215552L, 133259);
      super.c(paramMenuItem, paramInt);
      GMTrace.o(17885720215552L, 133259);
    }
  }
  
  public final class f
    extends a.c
  {
    public f()
    {
      super();
      GMTrace.i(17879948853248L, 133216);
      GMTrace.o(17879948853248L, 133216);
    }
    
    public final void a(n paramn)
    {
      GMTrace.i(17880217288704L, 133218);
      super.a(paramn);
      paramn.e(5, a.this.context.getString(R.l.cRV));
      paramn.e(4, a.this.context.getString(R.l.cSb));
      GMTrace.o(17880217288704L, 133218);
    }
    
    public final View bZk()
    {
      GMTrace.i(17880083070976L, 133217);
      View localView = v.fb(a.this.context).inflate(R.i.crR, null);
      ((TextView)localView.findViewById(R.h.bez)).setText(a.this.context.getString(R.l.cSc));
      GMTrace.o(17880083070976L, 133217);
      return localView;
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(17880351506432L, 133219);
      super.c(paramMenuItem, paramInt);
      GMTrace.o(17880351506432L, 133219);
    }
  }
  
  public final class g
    extends a.c
  {
    public g()
    {
      super();
      GMTrace.i(17884914909184L, 133253);
      GMTrace.o(17884914909184L, 133253);
    }
    
    public final void a(n paramn)
    {
      GMTrace.i(17885183344640L, 133255);
      super.a(paramn);
      paramn.e(6, a.this.context.getString(R.l.cRW));
      paramn.e(4, a.this.context.getString(R.l.cSb));
      GMTrace.o(17885183344640L, 133255);
    }
    
    public final View bZk()
    {
      GMTrace.i(17885049126912L, 133254);
      View localView = v.fb(a.this.context).inflate(R.i.crR, null);
      ((TextView)localView.findViewById(R.h.bez)).setText(a.this.context.getString(R.l.cSe));
      GMTrace.o(17885049126912L, 133254);
      return localView;
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(17885317562368L, 133256);
      super.c(paramMenuItem, paramInt);
      GMTrace.o(17885317562368L, 133256);
    }
  }
  
  public static abstract interface h
  {
    public abstract void a(n paramn);
    
    public abstract View bZk();
    
    public abstract void c(MenuItem paramMenuItem, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */