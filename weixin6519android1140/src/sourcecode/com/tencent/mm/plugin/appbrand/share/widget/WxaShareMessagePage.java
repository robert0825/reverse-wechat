package com.tencent.mm.plugin.appbrand.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public class WxaShareMessagePage
  extends LinearLayout
  implements b.h
{
  public ImageView ilS;
  public TextView izE;
  public ImageView izF;
  public IPCDynamicPageView izG;
  public ThreeDotsLoadingView izH;
  
  public WxaShareMessagePage(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18349979336704L, 136718);
    init(paramContext);
    GMTrace.o(18349979336704L, 136718);
  }
  
  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18350113554432L, 136719);
    init(paramContext);
    GMTrace.o(18350113554432L, 136719);
  }
  
  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18350247772160L, 136720);
    init(paramContext);
    GMTrace.o(18350247772160L, 136720);
  }
  
  public static int aag()
  {
    GMTrace.i(18351321513984L, 136728);
    int i = c.jM(224);
    GMTrace.o(18351321513984L, 136728);
    return i;
  }
  
  public static int aah()
  {
    GMTrace.i(18351455731712L, 136729);
    int i = c.jM(180);
    GMTrace.o(18351455731712L, 136729);
    return i;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(18350381989888L, 136721);
    View localView = View.inflate(paramContext, o.g.hDC, this);
    this.ilS = ((ImageView)localView.findViewById(o.f.bsu));
    this.izF = ((ImageView)localView.findViewById(o.f.bxd));
    this.izG = ((IPCDynamicPageView)localView.findViewById(o.f.hCE));
    this.izE = ((TextView)localView.findViewById(o.f.chT));
    this.izH = ((ThreeDotsLoadingView)localView.findViewById(o.f.bKL));
    paramContext = ((a)h.h(a.class)).c(paramContext, (ViewGroup)localView);
    ((ViewGroup)localView.findViewById(o.f.brL)).addView(paramContext);
    setGravity(17);
    GMTrace.o(18350381989888L, 136721);
  }
  
  public final void CV()
  {
    GMTrace.i(18350516207616L, 136722);
    GMTrace.o(18350516207616L, 136722);
  }
  
  public final void CW()
  {
    GMTrace.i(18350784643072L, 136724);
    this.izH.setVisibility(4);
    this.izH.ZI();
    this.ilS.setImageBitmap(null);
    this.izF.setVisibility(0);
    GMTrace.o(18350784643072L, 136724);
  }
  
  public final String CX()
  {
    GMTrace.i(18350918860800L, 136725);
    String str = com.tencent.mm.plugin.appbrand.n.g.aQ(this);
    GMTrace.o(18350918860800L, 136725);
    return str;
  }
  
  public final void j(Bitmap paramBitmap)
  {
    GMTrace.i(18350650425344L, 136723);
    this.izH.setVisibility(4);
    this.izH.ZI();
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.ilS.setImageBitmap(paramBitmap);
      this.izF.setVisibility(4);
      GMTrace.o(18350650425344L, 136723);
      return;
    }
    this.ilS.setImageBitmap(null);
    this.izF.setVisibility(0);
    GMTrace.o(18350650425344L, 136723);
  }
  
  public final void s(Bitmap paramBitmap)
  {
    GMTrace.i(18351187296256L, 136727);
    this.ilS.setVisibility(0);
    this.izH.setVisibility(4);
    this.izF.setVisibility(4);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      b.f localf = ((com.tencent.mm.modelappbrand.g)h.h(com.tencent.mm.modelappbrand.g.class)).CI();
      this.ilS.setImageBitmap(localf.k(paramBitmap));
      GMTrace.o(18351187296256L, 136727);
      return;
    }
    this.ilS.setImageBitmap(null);
    GMTrace.o(18351187296256L, 136727);
  }
  
  public final void se(String paramString)
  {
    GMTrace.i(18351053078528L, 136726);
    this.izH.setVisibility(0);
    this.izH.cju();
    this.izF.setVisibility(4);
    this.ilS.setVisibility(0);
    b.CT().a(this, paramString, null, ((com.tencent.mm.modelappbrand.g)h.h(com.tencent.mm.modelappbrand.g.class)).aM(112, 90));
    GMTrace.o(18351053078528L, 136726);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\share\widget\WxaShareMessagePage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */