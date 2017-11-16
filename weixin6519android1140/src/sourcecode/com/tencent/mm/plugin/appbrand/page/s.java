package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.n.h;

public final class s
  extends k
{
  private AppBrandPageView inZ;
  private String mUrl;
  
  public s(Context paramContext, m paramm)
  {
    super(paramContext, paramm);
    GMTrace.i(10254905507840L, 76405);
    GMTrace.o(10254905507840L, 76405);
  }
  
  protected final View Zb()
  {
    GMTrace.i(18358837706752L, 136784);
    if (this.inZ == null) {
      this.inZ = this.hyJ.Zt();
    }
    LinearLayout localLinearLayout = this.inZ.iuf;
    GMTrace.o(18358837706752L, 136784);
    return localLinearLayout;
  }
  
  public final void Ze()
  {
    GMTrace.i(10255710814208L, 76411);
    super.Ze();
    this.inZ.Wz();
    GMTrace.o(10255710814208L, 76411);
  }
  
  public final void Zf()
  {
    GMTrace.i(10255845031936L, 76412);
    super.Zf();
    this.inZ.Wb();
    GMTrace.o(10255845031936L, 76412);
  }
  
  protected final void Zg()
  {
    GMTrace.i(10255442378752L, 76409);
    super.Zg();
    this.inZ.onDestroy();
    GMTrace.o(10255442378752L, 76409);
  }
  
  public final AppBrandPageView Zh()
  {
    GMTrace.i(10256113467392L, 76414);
    AppBrandPageView localAppBrandPageView = this.inZ;
    GMTrace.o(10256113467392L, 76414);
    return localAppBrandPageView;
  }
  
  public final String Zi()
  {
    GMTrace.i(10256247685120L, 76415);
    String str = this.mUrl;
    GMTrace.o(10256247685120L, 76415);
    return str;
  }
  
  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10255979249664L, 76413);
    if (!c(paramArrayOfInt, this.inZ.hashCode()))
    {
      GMTrace.o(10255979249664L, 76413);
      return;
    }
    this.inZ.h(paramString1, paramString2, 0);
    GMTrace.o(10255979249664L, 76413);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10255576596480L, 76410);
    super.cleanup();
    this.inZ.cleanup();
    GMTrace.o(10255576596480L, 76410);
  }
  
  public final void loadUrl(String paramString)
  {
    GMTrace.i(10255173943296L, 76407);
    if (this.mUrl != null)
    {
      GMTrace.o(10255173943296L, 76407);
      return;
    }
    this.mUrl = paramString;
    this.inZ.rN(paramString);
    Zm();
    GMTrace.o(10255173943296L, 76407);
  }
  
  public final boolean rF(String paramString)
  {
    GMTrace.i(18358971924480L, 136785);
    boolean bool = h.sv(this.mUrl).equals(h.sv(paramString));
    GMTrace.o(18358971924480L, 136785);
    return bool;
  }
  
  public final boolean rG(String paramString)
  {
    GMTrace.i(20370895667200L, 151775);
    if ((this.mUrl != null) && (this.mUrl.equals(paramString)))
    {
      GMTrace.o(20370895667200L, 151775);
      return true;
    }
    GMTrace.o(20370895667200L, 151775);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */