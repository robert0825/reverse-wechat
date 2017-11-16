package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.k;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.permission.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public abstract class e
  extends b
{
  private int hXG;
  private com.tencent.mm.plugin.appbrand.e hzM;
  public String mData;
  
  public e()
  {
    GMTrace.i(10324430290944L, 76923);
    GMTrace.o(10324430290944L, 76923);
  }
  
  public final boolean VR()
  {
    GMTrace.i(10324967161856L, 76927);
    if ((this.hzM == null) && (!com.tencent.mm.sdk.a.b.bPq()) && (!com.tencent.mm.sdk.a.b.bPo()))
    {
      GMTrace.o(10324967161856L, 76927);
      return false;
    }
    boolean bool1;
    boolean bool3;
    boolean bool2;
    if (this.hzM.hyU.hKO.Tc() == com.tencent.mm.plugin.appbrand.b.a.hKL)
    {
      bool1 = true;
      bool3 = b(this.hzM.hyI);
      if ((!bool1) && (!bool3)) {
        break label170;
      }
      bool2 = true;
      label82:
      if (com.tencent.mm.compatible.loader.a.a(l.hXR, getClass())) {
        break label175;
      }
    }
    label170:
    label175:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        w.i("MicroMsg.AppBrandJsApiEvent", "dispatchToService, canSend %B, event %s, index %d, suspend %b, hasPermission %b", new Object[] { Boolean.valueOf(bool2), getName(), Integer.valueOf(VO()), Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      }
      if (bool2) {
        break label180;
      }
      GMTrace.o(10324967161856L, 76927);
      return false;
      bool1 = false;
      break;
      bool2 = false;
      break label82;
    }
    label180:
    if ((this.hzM == null) || (this.hzM.hyI == null))
    {
      GMTrace.o(10324967161856L, 76927);
      return false;
    }
    this.hzM.hyI.h(getName(), this.mData, this.hXG);
    GMTrace.o(10324967161856L, 76927);
    return true;
  }
  
  public final e a(c paramc)
  {
    GMTrace.i(10324564508672L, 76924);
    if (paramc == null)
    {
      GMTrace.o(10324564508672L, 76924);
      return this;
    }
    this.hzM = paramc.RV();
    this.hXG = paramc.hashCode();
    GMTrace.o(10324564508672L, 76924);
    return this;
  }
  
  public final e ai(String paramString, int paramInt)
  {
    GMTrace.i(10324698726400L, 76925);
    this.hzM = com.tencent.mm.plugin.appbrand.a.nI(paramString);
    this.hXG = paramInt;
    GMTrace.o(10324698726400L, 76925);
    return this;
  }
  
  final boolean b(c paramc)
  {
    GMTrace.i(18838397648896L, 140357);
    if (com.tencent.mm.plugin.appbrand.permission.c.k(this.hzM).a(paramc, this, null).code == 1)
    {
      GMTrace.o(18838397648896L, 140357);
      return true;
    }
    GMTrace.o(18838397648896L, 140357);
    return false;
  }
  
  public final boolean f(int[] paramArrayOfInt)
  {
    GMTrace.i(10325101379584L, 76928);
    if (!b(this.hzM.hyJ.Zs().Zh()))
    {
      w.d("MicroMsg.AppBrandJsApiEvent", "event name = %s, ctrlIndex = %d, perm denied", new Object[] { getName(), Integer.valueOf(VO()) });
      GMTrace.o(10325101379584L, 76928);
      return false;
    }
    if ((this.hzM == null) || (this.hzM.hyJ == null))
    {
      GMTrace.o(10325101379584L, 76928);
      return false;
    }
    this.hzM.hyJ.c(getName(), this.mData, paramArrayOfInt);
    GMTrace.o(10325101379584L, 76928);
    return true;
  }
  
  public final e r(Map<String, Object> paramMap)
  {
    GMTrace.i(10324832944128L, 76926);
    d.k(paramMap);
    this.mData = new JSONObject(paramMap).toString();
    GMTrace.o(10324832944128L, 76926);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */