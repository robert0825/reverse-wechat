package com.tencent.mm.plugin.appbrand.launching.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;

public final class f
  implements com.tencent.mm.plugin.appbrand.k.d
{
  private static final int[] iqU;
  private static final int[] iqV;
  private final d iqW;
  private final e iqX;
  private final c iqY;
  
  static
  {
    GMTrace.i(17333145829376L, 129142);
    iqU = new int[] { 1025, 1031, 1032 };
    iqV = new int[] { 1011, 1012, 1013, 1047, 1049, 1048, 1050 };
    GMTrace.o(17333145829376L, 129142);
  }
  
  public f()
  {
    GMTrace.i(17332743176192L, 129139);
    this.iqW = new d();
    this.iqX = new e();
    this.iqY = new c();
    GMTrace.o(17332743176192L, 129139);
  }
  
  public final boolean b(Context paramContext, String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(17668824367104L, 131643);
    if (a.b(iqU, paramInt))
    {
      if (a.a.iqL == this.iqW.a(paramContext, paramString, paramInt, paramBundle))
      {
        GMTrace.o(17668824367104L, 131643);
        return true;
      }
      GMTrace.o(17668824367104L, 131643);
      return false;
    }
    if (a.b(iqV, paramInt))
    {
      if (a.a.iqL == this.iqX.a(paramContext, paramString, paramInt, paramBundle))
      {
        GMTrace.o(17668824367104L, 131643);
        return true;
      }
      GMTrace.o(17668824367104L, 131643);
      return false;
    }
    if ((1064 == paramInt) || (1078 == paramInt))
    {
      if (a.a.iqL == this.iqY.a(paramContext, paramString, paramInt, paramBundle))
      {
        GMTrace.o(17668824367104L, 131643);
        return true;
      }
      GMTrace.o(17668824367104L, 131643);
      return false;
    }
    w.e("MicroMsg.WeAppLinkOpener", "handleScanCodeLink, unhandled case link[ %s ], scene[ %d ]", new Object[] { paramString, Integer.valueOf(paramInt) });
    GMTrace.o(17668824367104L, 131643);
    return false;
  }
  
  public final boolean rc(String paramString)
  {
    GMTrace.i(17332877393920L, 129140);
    if (bg.nm(paramString))
    {
      GMTrace.o(17332877393920L, 129140);
      return false;
    }
    w.i("MicroMsg.WeAppLinkOpener", "handle appLink = %s", new Object[] { paramString });
    Object localObject2 = b.values();
    int k = localObject2.length;
    int i = 0;
    Object localObject1;
    int j;
    if (i < k)
    {
      localObject1 = localObject2[i];
      if ((!bg.nm(paramString)) && (paramString.startsWith(((b)localObject1).gTl)))
      {
        j = 1;
        label85:
        if (j == 0) {
          break label122;
        }
      }
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        try
        {
          localObject2 = Uri.parse(paramString);
          paramString = (String)localObject2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            label122:
            w.e("MicroMsg.WeAppLinkOpener", "handle nativeLink = %s, exp = %s", new Object[] { paramString, localException });
            paramString = null;
          }
          paramString = paramString.getQueryParameter("username");
          if ((!bg.nm(paramString)) && (x.eU(paramString))) {
            break label187;
          }
          GMTrace.o(17332877393920L, 129140);
          return false;
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = ((b)localObject1).scene;
          localAppBrandStatObject.eAv = b.Yy();
          localAppBrandStatObject.eVi = b.Yz();
          localAppBrandStatObject.eVj = b.YA();
          AppBrandLaunchProxyUI.a(null, paramString, null, 0, -1, localAppBrandStatObject, null);
          GMTrace.o(17332877393920L, 129140);
          return true;
        }
        if (paramString == null)
        {
          GMTrace.o(17332877393920L, 129140);
          return false;
          j = 0;
          break label85;
          i += 1;
          break;
        }
      }
      label187:
      GMTrace.o(17332877393920L, 129140);
      return false;
      localObject1 = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */