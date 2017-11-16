package com.tencent.mm.ui.d;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.g.a.rz.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.protocal.c.bih;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class b
{
  public static String Vv(String paramString)
  {
    GMTrace.i(17883572731904L, 133243);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(17883572731904L, 133243);
      return null;
    }
    paramString = ((com.tencent.mm.plugin.appbrand.k.b)h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(paramString);
    if ((paramString != null) && (paramString.UD() != null))
    {
      paramString = paramString.UD().hRO;
      GMTrace.o(17883572731904L, 133243);
      return paramString;
    }
    w.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
    GMTrace.o(17883572731904L, 133243);
    return null;
  }
  
  public static String Vw(String paramString)
  {
    GMTrace.i(17883706949632L, 133244);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(17883706949632L, 133244);
      return null;
    }
    paramString = ((com.tencent.mm.plugin.appbrand.k.b)h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(paramString);
    if (paramString != null)
    {
      paramString = paramString.field_nickname;
      GMTrace.o(17883706949632L, 133244);
      return paramString;
    }
    w.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
    GMTrace.o(17883706949632L, 133244);
    return null;
  }
  
  public static void j(Context paramContext, final String paramString, final boolean paramBoolean)
  {
    int j = 1;
    GMTrace.i(17883438514176L, 133242);
    Object localObject1 = new rz();
    ((rz)localObject1).eWN.eAr = paramString;
    Object localObject2 = ((rz)localObject1).eWN;
    if (paramBoolean)
    {
      i = 2;
      ((rz.a)localObject2).action = i;
      ((rz)localObject1).eWN.eWP = 2;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new LinkedList();
      localObject2 = new bih();
      ((bih)localObject2).uTM = paramString;
      if (!paramBoolean) {
        break label169;
      }
    }
    label169:
    for (int i = j;; i = 0)
    {
      ((bih)localObject2).uTL = i;
      ((bih)localObject2).jib = 3;
      ((LinkedList)localObject1).add(localObject2);
      at.wS().a(1176, new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          int i = 1;
          GMTrace.i(17883304296448L, 133241);
          at.wS().b(1176, this);
          w.d("MicroMsg.AppBrandServiceHelper", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(true) });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            u.makeText(this.val$context, R.l.dNa, 0).show();
            paramAnonymousString = new rz();
            paramAnonymousString.eWN.eAr = paramString;
            paramAnonymousk = paramAnonymousString.eWN;
            paramAnonymousInt1 = i;
            if (!paramBoolean) {
              paramAnonymousInt1 = 2;
            }
            paramAnonymousk.action = paramAnonymousInt1;
            paramAnonymousString.eWN.eWP = 2;
            a.vgX.m(paramAnonymousString);
            GMTrace.o(17883304296448L, 133241);
            return;
          }
          GMTrace.o(17883304296448L, 133241);
        }
      });
      paramContext = new com.tencent.mm.modelappbrand.k((LinkedList)localObject1);
      at.wS().a(paramContext, 0);
      GMTrace.o(17883438514176L, 133242);
      return;
      i = 1;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */