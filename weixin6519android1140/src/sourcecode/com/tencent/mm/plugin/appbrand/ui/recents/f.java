package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.e;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.c;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;

final class f
  extends AppBrandLauncherUI.c<Object>
{
  f(ArrayList<?> paramArrayList1, ArrayList<?> paramArrayList2)
  {
    super(paramArrayList1, paramArrayList2);
    GMTrace.i(16359798865920L, 121890);
    GMTrace.o(16359798865920L, 121890);
  }
  
  public final boolean bA(int paramInt1, int paramInt2)
  {
    GMTrace.i(16359933083648L, 121891);
    if (!this.iBc.get(paramInt1).getClass().equals(this.iBd.get(paramInt2).getClass()))
    {
      GMTrace.o(16359933083648L, 121891);
      return false;
    }
    if ((this.iBc.get(paramInt1) instanceof e))
    {
      e locale1 = (e)this.iBc.get(paramInt1);
      e locale2 = (e)this.iBd.get(paramInt2);
      if ((locale1.appId.equals(locale2.appId)) && (locale1.hKs == locale2.hKs) && (locale1.eAr.equals(locale2.eAr)))
      {
        GMTrace.o(16359933083648L, 121891);
        return true;
      }
      GMTrace.o(16359933083648L, 121891);
      return false;
    }
    GMTrace.o(16359933083648L, 121891);
    return false;
  }
  
  public final boolean bB(int paramInt1, int paramInt2)
  {
    GMTrace.i(16360067301376L, 121892);
    if ((this.iBc.get(paramInt1) instanceof e))
    {
      e locale1 = (e)this.iBc.get(paramInt1);
      e locale2 = (e)this.iBd.get(paramInt2);
      if ((locale1.appId.equals(locale2.appId)) && (locale1.eAr.equals(locale2.eAr)) && (locale1.hKs == locale2.hKs) && (locale1.hMM == locale2.hMM) && (bg.nl(locale1.hMK).equals(locale2.hMK)) && (bg.nl(locale1.appName).equals(locale2.appName)))
      {
        GMTrace.o(16360067301376L, 121892);
        return true;
      }
      GMTrace.o(16360067301376L, 121892);
      return false;
    }
    GMTrace.o(16360067301376L, 121892);
    return false;
  }
  
  public final Object bC(int paramInt1, int paramInt2)
  {
    GMTrace.i(16360201519104L, 121893);
    if (paramInt1 >= this.iBc.size())
    {
      GMTrace.o(16360201519104L, 121893);
      return null;
    }
    Bundle localBundle = new Bundle();
    if ((this.iBc.get(paramInt1) instanceof e))
    {
      e locale1 = (e)this.iBc.get(paramInt1);
      e locale2 = (e)this.iBd.get(paramInt2);
      if (locale1.hML != locale2.hML) {
        localBundle.putLong("running_flag", locale2.hML);
      }
      if (locale1.hMM != locale2.hMM) {
        localBundle.putBoolean("star", locale2.hMM);
      }
      if (locale1.hKs != locale2.hKs) {
        localBundle.putInt("debug_type", locale2.hKs);
      }
      if (!bg.nl(locale1.hMK).equals(locale2.hMK)) {
        localBundle.putString("icon", locale2.hMK);
      }
      if (!bg.nl(locale1.appName).equals(locale2.appName)) {
        localBundle.putString("nick_name", locale2.appName);
      }
    }
    if (localBundle.size() <= 0)
    {
      GMTrace.o(16360201519104L, 121893);
      return null;
    }
    GMTrace.o(16360201519104L, 121893);
    return localBundle;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */