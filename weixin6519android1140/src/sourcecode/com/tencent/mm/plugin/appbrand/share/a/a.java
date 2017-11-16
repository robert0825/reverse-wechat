package com.tencent.mm.plugin.appbrand.share.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b.e;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.g;
import com.tencent.mm.modelappbrand.r;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class a
  implements g
{
  private final Map<Integer, a> izA;
  private final Map<String, SoftReference<b.e>> izy;
  private final Map<String, SoftReference<b.f>> izz;
  
  public a()
  {
    GMTrace.i(18348100288512L, 136704);
    this.izy = new ConcurrentHashMap();
    this.izz = new ConcurrentHashMap();
    this.izA = new ConcurrentHashMap();
    GMTrace.o(18348100288512L, 136704);
  }
  
  public final b.f CI()
  {
    GMTrace.i(18348905594880L, 136710);
    String str = String.format("%d-%d-dp", new Object[] { Integer.valueOf(112), Integer.valueOf(90) });
    Object localObject1 = (SoftReference)this.izz.get(str);
    b.f localf;
    if (localObject1 != null)
    {
      localf = (b.f)((SoftReference)localObject1).get();
      localObject1 = localf;
      if (localf != null) {
        break label145;
      }
    }
    try
    {
      localObject1 = (SoftReference)this.izz.get(str);
      if (localObject1 != null)
      {
        localf = (b.f)((SoftReference)localObject1).get();
        localObject1 = localf;
        if (localf != null) {}
      }
      else
      {
        localObject1 = new com.tencent.mm.plugin.appbrand.share.b(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 112), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 90));
        this.izz.put(str, new SoftReference(localObject1));
      }
      label145:
      GMTrace.o(18348905594880L, 136710);
      return (b.f)localObject1;
    }
    finally {}
  }
  
  public final void a(String paramString, View paramView)
  {
    GMTrace.i(18348502941696L, 136707);
    Assert.assertNotNull(paramView);
    if (!(paramView instanceof WxaShareMessagePage))
    {
      GMTrace.o(18348502941696L, 136707);
      return;
    }
    w.i("MicroMsg.WxaShareMessageService", "onUnbindView(%s, %s)", new Object[] { paramString, Integer.valueOf(paramView.hashCode()) });
    paramView = (WxaShareMessagePage)paramView;
    ((e)h.h(e.class)).a(paramString, paramView.izG);
    this.izA.remove(Integer.valueOf(1));
    GMTrace.o(18348502941696L, 136707);
  }
  
  public final boolean a(String paramString, final View paramView, Bundle paramBundle)
  {
    GMTrace.i(18348368723968L, 136706);
    Assert.assertNotNull(paramView);
    Assert.assertNotNull(paramBundle);
    if (!(paramView instanceof WxaShareMessagePage))
    {
      GMTrace.o(18348368723968L, 136706);
      return false;
    }
    w.i("MicroMsg.WxaShareMessageService", "onBindView(%s, %s)", new Object[] { paramString, Integer.valueOf(paramView.hashCode()) });
    paramView = (WxaShareMessagePage)paramView;
    boolean bool = paramBundle.getBoolean("is_dynamic_page");
    Object localObject = paramBundle.getString("title", "");
    paramView.izE.setText((CharSequence)localObject);
    if (bool)
    {
      paramView.ilS.setVisibility(4);
      localObject = paramView.izG;
      ((IPCDynamicPageView)localObject).setVisibility(0);
      paramBundle.putInt("view_init_width", WxaShareMessagePage.aag());
      paramBundle.putInt("view_init_height", WxaShareMessagePage.aah());
      ((e)h.h(e.class)).a(paramString, (View)localObject, paramBundle, new r(new f()
      {
        public final void q(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(18349576683520L, 136715);
          switch (paramAnonymousInt)
          {
          case 2: 
          case 3: 
          default: 
            paramView.izH.ZI();
            paramView.izH.setVisibility(4);
            paramView.izF.setVisibility(0);
            paramView.izG.setVisibility(4);
            paramView.izF.setImageResource(o.h.cJx);
            GMTrace.o(18349576683520L, 136715);
            return;
          case 0: 
            paramView.izH.setVisibility(0);
            paramView.izF.setVisibility(4);
            paramView.izG.setVisibility(4);
            paramView.izH.cju();
            GMTrace.o(18349576683520L, 136715);
            return;
          case 1: 
            paramView.izH.ZI();
            paramView.izH.setVisibility(4);
            paramView.izF.setVisibility(0);
            paramView.izG.setVisibility(4);
            paramView.izF.setImageResource(o.h.cLZ);
            GMTrace.o(18349576683520L, 136715);
            return;
          }
          paramView.izH.setVisibility(4);
          paramView.izF.setVisibility(4);
          paramView.izG.setVisibility(0);
          GMTrace.o(18349576683520L, 136715);
        }
      }));
    }
    for (;;)
    {
      GMTrace.o(18348368723968L, 136706);
      return true;
      paramView.izG.setVisibility(4);
      paramView.ilS.setVisibility(0);
      paramString = paramBundle.getByteArray("image_data");
      if ((paramString != null) && (paramString.length > 0))
      {
        paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
        if ((paramString != null) && (!paramString.isRecycled()))
        {
          paramView.s(paramString);
          GMTrace.o(18348368723968L, 136706);
          return true;
        }
      }
      paramString = paramBundle.getString("delay_load_img_path");
      if (!bg.nm(paramString))
      {
        paramBundle = com.tencent.mm.modelappbrand.a.b.CT().hx(paramString);
        if (paramBundle != null)
        {
          if (!paramBundle.isRecycled()) {
            paramView.s(paramBundle);
          }
          for (;;)
          {
            GMTrace.o(18348368723968L, 136706);
            return true;
            paramView.se(paramString);
          }
        }
        paramView.izH.setVisibility(0);
        paramView.izF.setVisibility(4);
        paramView.ilS.setVisibility(4);
        paramView.izH.cju();
        paramString = new a()
        {
          public final void z(final Bundle paramAnonymousBundle)
          {
            GMTrace.i(18349845118976L, 136717);
            com.tencent.mm.bv.a.U(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(18349308248064L, 136713);
                a.2.this.izB.se(paramAnonymousBundle.getString("delay_load_img_path"));
                GMTrace.o(18349308248064L, 136713);
              }
            });
            GMTrace.o(18349845118976L, 136717);
          }
        };
        this.izA.put(Integer.valueOf(1), paramString);
      }
      else
      {
        paramView.se(paramBundle.getString("image_url"));
      }
    }
  }
  
  public final b.e aM(int paramInt1, int paramInt2)
  {
    GMTrace.i(18348771377152L, 136709);
    String str = String.format("%d-%d-dp", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject1 = (SoftReference)this.izy.get(str);
    b.e locale;
    if (localObject1 != null)
    {
      locale = (b.e)((SoftReference)localObject1).get();
      localObject1 = locale;
      if (locale != null) {
        break label152;
      }
    }
    try
    {
      localObject1 = (SoftReference)this.izy.get(str);
      if (localObject1 != null)
      {
        locale = (b.e)((SoftReference)localObject1).get();
        localObject1 = locale;
        if (locale != null) {}
      }
      else
      {
        localObject1 = new com.tencent.mm.plugin.appbrand.share.a(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), paramInt1), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), paramInt2));
        this.izy.put(str, new SoftReference(localObject1));
      }
      label152:
      GMTrace.o(18348771377152L, 136709);
      return (b.e)localObject1;
    }
    finally {}
  }
  
  public final View aZ(Context paramContext)
  {
    GMTrace.i(18348234506240L, 136705);
    Assert.assertNotNull(paramContext);
    paramContext = new WxaShareMessagePage(paramContext);
    GMTrace.o(18348234506240L, 136705);
    return paramContext;
  }
  
  public final void n(Bundle paramBundle)
  {
    GMTrace.i(18348637159424L, 136708);
    a locala = (a)this.izA.get(Integer.valueOf(1));
    if (locala != null) {
      locala.z(paramBundle);
    }
    GMTrace.o(18348637159424L, 136708);
  }
  
  private static abstract interface a
  {
    public abstract void z(Bundle paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\share\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */