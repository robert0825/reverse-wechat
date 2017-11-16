package com.tencent.mm.plugin.appbrand.compat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.hi.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyWebViewUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.protocal.c.afq;
import com.tencent.mm.protocal.c.afr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.f.a;
import java.io.File;
import java.util.Map;

final class a
  implements com.tencent.mm.plugin.appbrand.compat.a.a
{
  a()
  {
    GMTrace.i(19484387573760L, 145170);
    GMTrace.o(19484387573760L, 145170);
  }
  
  public final void I(Context paramContext, String paramString)
  {
    GMTrace.i(19484521791488L, 145171);
    paramString = new Intent(paramContext, AppBrandNearbyWebViewUI.class).putExtra("rawUrl", paramString);
    if (!(paramContext instanceof Activity)) {
      paramString.addFlags(268435456);
    }
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramString, 3);
      GMTrace.o(19484521791488L, 145171);
      return;
    }
    paramContext.startActivity(paramString);
    GMTrace.o(19484521791488L, 145171);
  }
  
  public final int TY()
  {
    GMTrace.i(19485998186496L, 145182);
    hi localhi = new hi();
    com.tencent.mm.sdk.b.a.vgX.m(localhi);
    int i = localhi.eKF.eKG;
    GMTrace.o(19485998186496L, 145182);
    return i;
  }
  
  public final void a(final a.a parama)
  {
    GMTrace.i(19486132404224L, 145183);
    b.a locala = new b.a();
    locala.gtF = new afq();
    locala.gtG = new afr();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/getwerunuserstate";
    locala.gtE = 1926;
    locala.gtH = 0;
    locala.gtI = 0;
    u.a(locala.DA(), new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
      {
        boolean bool2 = true;
        GMTrace.i(20498268291072L, 152724);
        if (paramAnonymousk.getType() != 1926)
        {
          GMTrace.o(20498268291072L, 152724);
          return 0;
        }
        boolean bool1;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = (afr)paramAnonymousb.gtD.gtK;
          if ((paramAnonymousString != null) && (paramAnonymousString.uvs)) {
            bool1 = true;
          }
        }
        for (;;)
        {
          if (parama != null) {
            parama.i(bool2, bool1);
          }
          GMTrace.o(20498268291072L, 152724);
          return 0;
          bool1 = false;
          continue;
          bool1 = false;
          bool2 = false;
        }
      }
    }, true);
    GMTrace.o(19486132404224L, 145183);
  }
  
  public final void a(f.a parama, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    GMTrace.i(19484790226944L, 145173);
    l.a(parama, paramString1, paramString2, paramString3, null, paramArrayOfByte);
    GMTrace.o(19484790226944L, 145173);
  }
  
  public final Intent bC(Context paramContext)
  {
    GMTrace.i(19484656009216L, 145172);
    Intent localIntent = ((g)h.h(g.class)).Kv();
    localIntent.setClass(paramContext, AppBrandSearchUI.class);
    localIntent.putExtra("key_trust_url", true);
    localIntent.putExtra("title", paramContext.getString(R.l.cRU));
    localIntent.putExtra("searchbar_tips", paramContext.getString(R.l.cRU));
    localIntent.putExtra("KRightBtn", true);
    localIntent.putExtra("ftsneedkeyboard", true);
    localIntent.putExtra("ftsType", 64);
    localIntent.putExtra("ftsbizscene", 201);
    paramContext = ((g)h.h(g.class)).Up();
    String str = com.tencent.mm.modelappbrand.b.CE();
    paramContext.put("WASessionId", str);
    localIntent.putExtra("rawUrl", ((g)h.h(g.class)).n(paramContext));
    localIntent.putExtra("key_load_js_without_delay", true);
    localIntent.addFlags(67108864);
    localIntent.putExtra("key_session_id", str);
    paramContext = h.xy().xh().get(w.a.vwr, null);
    if ((paramContext != null) && ((paramContext instanceof String))) {}
    for (paramContext = (String)paramContext;; paramContext = "")
    {
      localIntent.putExtra("key_search_input_hint", paramContext);
      GMTrace.o(19484656009216L, 145172);
      return localIntent;
    }
  }
  
  public final String bD(Context paramContext)
  {
    GMTrace.i(19485192880128L, 145176);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = localContext.getString(R.l.dZZ);
    GMTrace.o(19485192880128L, 145176);
    return paramContext;
  }
  
  public final String bE(Context paramContext)
  {
    GMTrace.i(19485327097856L, 145177);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = localContext.getString(R.l.dZV);
    GMTrace.o(19485327097856L, 145177);
    return paramContext;
  }
  
  public final String bF(Context paramContext)
  {
    GMTrace.i(19485461315584L, 145178);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = localContext.getString(R.l.dZX);
    GMTrace.o(19485461315584L, 145178);
    return paramContext;
  }
  
  public final String bG(Context paramContext)
  {
    GMTrace.i(19485595533312L, 145179);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = localContext.getString(R.l.eae);
    GMTrace.o(19485595533312L, 145179);
    return paramContext;
  }
  
  public final View c(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(19485058662400L, 145175);
    paramContext = LayoutInflater.from(paramContext).inflate(R.i.cAE, paramViewGroup, false);
    GMTrace.o(19485058662400L, 145175);
    return paramContext;
  }
  
  public final Intent k(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(19484924444672L, 145174);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(paramString1)), paramString2);
    paramString1 = new Intent(paramContext, AppChooserUI.class);
    paramString1.putExtra("type", 0);
    paramString1.putExtra("title", paramContext.getResources().getString(R.l.dhP));
    paramString1.putExtra("mimetype", paramString2);
    paramString1.putExtra("targetintent", localIntent);
    GMTrace.o(19484924444672L, 145174);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */