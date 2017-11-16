package com.tencent.mm.plugin.appbrand.permission;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.jsapi.b;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.k;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.widget.g;
import com.tencent.mm.plugin.appbrand.widget.g.2;
import com.tencent.mm.plugin.appbrand.widget.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;

final class a
{
  private static final SparseIntArray ixp;
  private static final Set<String> ixq;
  
  static
  {
    GMTrace.i(17322811064320L, 129065);
    ixp = new SparseIntArray()
    {
      public final int get(int paramAnonymousInt)
      {
        GMTrace.i(17323616370688L, 129071);
        paramAnonymousInt = super.get(paramAnonymousInt, o.i.hFl);
        GMTrace.o(17323616370688L, 129071);
        return paramAnonymousInt;
      }
    };
    ixq = new HashSet();
    ixp.put("requestPayment".hashCode(), o.i.hFh);
    ixp.put("playVoice".hashCode(), o.i.hFi);
    ixp.put("operateMusicPlayer".hashCode(), o.i.hFi);
    ixp.put("shareAppMessage".hashCode(), o.i.hFj);
    ixp.put("onShareAppMessage".hashCode(), o.i.hFj);
    ixp.put("shareAppMessageDirectly".hashCode(), o.i.hFj);
    ixp.put("shareTimeline".hashCode(), o.i.hFj);
    ixp.put("onMenuShareTimeline".hashCode(), o.i.hFj);
    ixp.put("launchMiniProgram".hashCode(), o.i.hFg);
    ixq.add("requestPayment");
    ixq.add("playVoice");
    ixq.add("operateMusicPlayer");
    ixq.add("shareAppMessage");
    ixq.add("onShareAppMessage");
    ixq.add("shareAppMessageDirectly");
    ixq.add("shareTimeline");
    ixq.add("onMenuShareTimeline");
    ixq.add("launchMiniProgram");
    ixq.add("makeVoIPCall");
    ixq.add("addCard");
    ixq.add("chooseContact");
    ixq.add("openCard");
    GMTrace.o(17322811064320L, 129065);
  }
  
  static void a(e parame, b paramb)
  {
    GMTrace.i(17322676846592L, 129064);
    if ((parame == null) || (paramb == null))
    {
      GMTrace.o(17322676846592L, 129064);
      return;
    }
    if (!ixq.contains(paramb.getName()))
    {
      GMTrace.o(17322676846592L, 129064);
      return;
    }
    paramb = ab.getResources().getString(ixp.get(paramb.getName().hashCode()));
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17323884806144L, 129073);
        Object localObject1 = this.hzx.hyJ;
        if (localObject1 != null)
        {
          localObject1 = ((m)localObject1).Zs();
          if (localObject1 != null)
          {
            Object localObject2 = ((k)localObject1).Zh();
            if (localObject2 != null)
            {
              localObject1 = this.ixr;
              if (((AppBrandPageView)localObject2).ivl != null)
              {
                localObject2 = ((AppBrandPageView)localObject2).ivl;
                ((g)localObject2).iJn.setText((CharSequence)localObject1);
                if ((((g)localObject2).getTranslationY() == 0.0F) || (((g)localObject2).iJE != null))
                {
                  GMTrace.o(17323884806144L, 129073);
                  return;
                }
                ((g)localObject2).iJA = g.a.iJJ;
                ((g)localObject2).setVisibility(0);
                ((g)localObject2).iJE = ((g)localObject2).animate().translationY(0.0F);
                ((g)localObject2).iJE.setListener(new g.2((g)localObject2));
                ((g)localObject2).iJE.start();
              }
            }
          }
        }
        GMTrace.o(17323884806144L, 129073);
      }
    });
    GMTrace.o(17322676846592L, 129064);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\permission\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */