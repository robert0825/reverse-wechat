package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.plugin.appbrand.menu.m;
import com.tencent.mm.plugin.appbrand.menu.m.a;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class l
{
  public String hyD;
  public AppBrandPageView inZ;
  public f ius;
  public List<k> iut;
  
  l(Context paramContext, String paramString, AppBrandPageView paramAppBrandPageView, List<k> paramList)
  {
    GMTrace.i(15460540088320L, 115190);
    this.hyD = paramString;
    this.inZ = paramAppBrandPageView;
    this.iut = paramList;
    this.ius = new f(paramContext, f.xpQ, false);
    this.ius.qik = new p.c()
    {
      public final void a(n paramAnonymousn)
      {
        GMTrace.i(14326266068992L, 106739);
        Iterator localIterator = l.this.iut.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (k)localIterator.next();
          if ((localObject != null) && (!((k)localObject).ism))
          {
            Context localContext = l.this.inZ.mContext;
            AppBrandPageView localAppBrandPageView = l.this.inZ;
            String str = l.this.hyD;
            boolean bool = l.this.ius.xpF.booleanValue();
            if (localObject != null)
            {
              m.isB = bool;
              localObject = (a)m.a.isC.isA.get(Integer.valueOf(((k)localObject).id));
              if (localObject != null) {
                ((a)localObject).a(localContext, localAppBrandPageView, paramAnonymousn, str);
              }
            }
          }
        }
        GMTrace.o(14326266068992L, 106739);
      }
    };
    this.ius.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(14325997633536L, 106737);
        paramAnonymousInt = com.tencent.mm.plugin.appbrand.menu.l.jc(paramAnonymousMenuItem.getItemId());
        if (paramAnonymousInt == 0)
        {
          GMTrace.o(14325997633536L, 106737);
          return;
        }
        paramAnonymousMenuItem = m.d(l.this.iut, paramAnonymousInt - 1);
        Context localContext = l.this.inZ.mContext;
        AppBrandPageView localAppBrandPageView = l.this.inZ;
        String str = l.this.hyD;
        if (paramAnonymousMenuItem == null) {
          paramAnonymousInt = 0;
        }
        for (;;)
        {
          if (paramAnonymousInt != 0) {
            l.this.ius.bFl();
          }
          GMTrace.o(14325997633536L, 106737);
          return;
          a locala = (a)m.a.isC.isA.get(Integer.valueOf(paramAnonymousMenuItem.id));
          if (locala == null)
          {
            paramAnonymousInt = 0;
          }
          else
          {
            locala.a(localContext, localAppBrandPageView, str, paramAnonymousMenuItem);
            paramAnonymousInt = 1;
          }
        }
      }
    };
    this.ius.rRu = this.inZ.ivn;
    this.ius.bFk();
    GMTrace.o(15460540088320L, 115190);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */