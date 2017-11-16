package com.tencent.mm.plugin.appbrand.ui.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends com.tencent.mm.pluginsdk.ui.b.b
  implements View.OnClickListener, e
{
  private static boolean iDE;
  public String iDA;
  public Drawable iDB;
  private final Runnable iDC;
  private final b.h iDD;
  public View iDx;
  private TextView iDy;
  public ImageView iDz;
  
  static
  {
    GMTrace.i(15520938065920L, 115640);
    iDE = false;
    GMTrace.o(15520938065920L, 115640);
  }
  
  private c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(15518656364544L, 115623);
    this.iDC = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17311805210624L, 128983);
        c.this.iDA = null;
        c.this.iDz.setImageDrawable(c.this.iDB);
        if ((c.this.iDx != null) && (c.this.iDx.getVisibility() == 0)) {}
        for (int i = 1;; i = 0)
        {
          boolean bool = c.this.abd();
          if ((i == 0) && (bool)) {
            com.tencent.mm.sdk.b.a.vgX.m(new ja());
          }
          GMTrace.o(17311805210624L, 128983);
          return;
        }
      }
    };
    this.iDD = new b.h()
    {
      public final void CV()
      {
        GMTrace.i(17315160653824L, 129008);
        if (c.this.iDz != null) {
          c.this.iDz.setImageDrawable(c.this.iDB);
        }
        GMTrace.o(17315160653824L, 129008);
      }
      
      public final void CW()
      {
        GMTrace.i(17315429089280L, 129010);
        GMTrace.o(17315429089280L, 129010);
      }
      
      public final String CX()
      {
        GMTrace.i(17315563307008L, 129011);
        GMTrace.o(17315563307008L, 129011);
        return "AppBrandChattingBannerLoadTarget";
      }
      
      public final void j(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(17315294871552L, 129009);
        if (c.this.iDz == null)
        {
          GMTrace.o(17315294871552L, 129009);
          return;
        }
        int i = com.tencent.mm.br.a.fromDPToPix(c.this.iDz.getContext(), 5);
        paramAnonymousBitmap = new LayerDrawable(new Drawable[] { new BitmapDrawable(c.this.iDz.getContext().getResources(), paramAnonymousBitmap) });
        paramAnonymousBitmap.setLayerInset(0, i, i, i, i);
        c.this.iDz.setImageDrawable(paramAnonymousBitmap);
        GMTrace.o(17315294871552L, 129009);
      }
    };
    if (getView() != null)
    {
      getView().setOnClickListener(this);
      ((d)h.h(d.class)).a(this);
      this.iDx = ((ViewGroup)getView()).getChildAt(0);
      this.iDy = ((TextView)getView().findViewById(R.h.bmX));
      this.iDz = ((ImageView)getView().findViewById(R.h.bmW));
      if (this.iDz != null)
      {
        paramContext = this.iDz;
        Drawable localDrawable = com.tencent.mm.svg.a.a.c(this.iDz.getResources(), R.k.cJv);
        this.iDB = localDrawable;
        paramContext.setImageDrawable(localDrawable);
      }
      setVisibility(8);
    }
    GMTrace.o(15518656364544L, 115623);
  }
  
  public static void abe()
  {
    GMTrace.i(17317979226112L, 129029);
    iDE = false;
    GMTrace.o(17317979226112L, 129029);
  }
  
  public static c bS(Context paramContext)
  {
    GMTrace.i(19504922886144L, 145323);
    paramContext = new c(paramContext);
    GMTrace.o(19504922886144L, 145323);
    return paramContext;
  }
  
  public final void Y(String paramString, int paramInt)
  {
    GMTrace.i(17318113443840L, 129030);
    af.t(this.iDC);
    GMTrace.o(17318113443840L, 129030);
  }
  
  public final boolean abd()
  {
    GMTrace.i(15518924800000L, 115625);
    if (!iDE)
    {
      ((d)h.h(d.class)).b(this);
      ((d)h.h(d.class)).aaZ();
      ((d)h.h(d.class)).a(this);
      iDE = true;
    }
    Object localObject2 = BannerModel.abh();
    if ((localObject2 != null) && (!bg.nm(((BannerModel)localObject2).appId)))
    {
      Object localObject1 = ((BannerModel)localObject2).appName;
      String str = ((BannerModel)localObject2).iDV;
      localObject2 = ((BannerModel)localObject2).izx;
      if (bg.nm(str)) {}
      while (bg.nm((String)localObject1))
      {
        GMTrace.o(15518924800000L, 115625);
        return false;
        localObject1 = str;
      }
      setVisibility(0);
      if (this.iDy != null) {
        this.iDy.setText((CharSequence)localObject1);
      }
      if (!bg.nm((String)localObject2))
      {
        localObject1 = null;
        if (!bg.nm(this.iDA)) {
          localObject1 = com.tencent.mm.modelappbrand.a.b.CT().hw(this.iDA);
        }
        if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
          break label202;
        }
        this.iDD.j((Bitmap)localObject1);
      }
      for (;;)
      {
        GMTrace.o(15518924800000L, 115625);
        return true;
        label202:
        this.iDA = com.tencent.mm.modelappbrand.a.b.CT().a(this.iDD, (String)localObject2, com.tencent.mm.modelappbrand.a.e.grO);
      }
    }
    setVisibility(8);
    GMTrace.o(15518924800000L, 115625);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(15519193235456L, 115627);
    if (this.iDx != null)
    {
      ((ViewGroup)this.iDx).removeAllViews();
      this.iDx.setVisibility(8);
    }
    this.iDx = null;
    this.iDy = null;
    this.iDz = null;
    ((d)h.h(d.class)).b(this);
    GMTrace.o(15519193235456L, 115627);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(15518790582272L, 115624);
    int i = R.i.crQ;
    GMTrace.o(15518790582272L, 115624);
    return i;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(15519327453184L, 115628);
    Object localObject = BannerModel.abh();
    if (localObject == null)
    {
      GMTrace.o(15519327453184L, 115628);
      return;
    }
    String str = ((BannerModel)localObject).appId;
    int i = ((BannerModel)localObject).hZb;
    if (bg.nm(str))
    {
      abd();
      GMTrace.o(15519327453184L, 115628);
      return;
    }
    localObject = new AppBrandStatObject();
    ((AppBrandStatObject)localObject).scene = 1022;
    ((com.tencent.mm.plugin.appbrand.k.c)h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramView.getContext(), null, str, i, -1, null, (AppBrandStatObject)localObject);
    GMTrace.o(15519327453184L, 115628);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(15519059017728L, 115626);
    if (this.iDx != null) {
      this.iDx.setVisibility(paramInt);
    }
    GMTrace.o(15519059017728L, 115626);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\banner\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */