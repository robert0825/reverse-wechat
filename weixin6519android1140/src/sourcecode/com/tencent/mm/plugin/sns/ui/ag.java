package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.cm;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.cu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class ag
{
  public static int a(Context paramContext, as paramas)
  {
    GMTrace.i(15054799896576L, 112167);
    if (paramas == null)
    {
      GMTrace.o(15054799896576L, 112167);
      return 0;
    }
    if (paramas.jib == 6)
    {
      if (paramas.tOM == null)
      {
        GMTrace.o(15054799896576L, 112167);
        return 0;
      }
      if (a.hnI.n(paramContext, paramas.tOK.lQa))
      {
        i = paramas.tOM.tQx;
        GMTrace.o(15054799896576L, 112167);
        return i;
      }
      i = paramas.tOM.tQy;
      GMTrace.o(15054799896576L, 112167);
      return i;
    }
    int i = paramas.tOG;
    GMTrace.o(15054799896576L, 112167);
    return i;
  }
  
  public static void a(Context paramContext, ay paramay, as paramas)
  {
    GMTrace.i(15054934114304L, 112168);
    if ((paramas != null) && (paramas.tOK != null))
    {
      Object localObject = paramas.tOK.lQa;
      boolean bool;
      if (bg.nm((String)localObject))
      {
        bool = false;
        if (!bool) {
          break label467;
        }
        paramay.qig = false;
        if ((paramas.tOO == null) || (paramas.tOP == null)) {
          break label293;
        }
        if (!a.hnI.n(paramContext, paramas.tOK.lQa)) {
          break label249;
        }
        paramContext = paramas.tOO;
        label87:
        localObject = v.bPK();
        if (!((String)localObject).equals("zh_CN")) {
          break label257;
        }
        paramContext = paramContext.tQI;
        label107:
        switch (paramas.jib)
        {
        default: 
          paramay.qig = false;
        }
      }
      for (;;)
      {
        if (bg.nm(paramContext))
        {
          w.e("MicroMsg.OpenActionContent", "text can not load ?");
          paramay.qig = false;
        }
        GMTrace.o(15054934114304L, 112168);
        return;
        localObject = g.aP((String)localObject, true);
        if ((localObject == null) || (bg.nm(((f)localObject).field_appId)))
        {
          bool = false;
          break;
        }
        if ((((f)localObject).field_appInfoFlag & 0x20) > 0) {}
        for (bool = true;; bool = false)
        {
          w.v("MicroMsg.AppInfoLogic", "canShowSNSTail, appid = %s, ret = %b", new Object[] { ((f)localObject).field_appId, Boolean.valueOf(bool) });
          break;
        }
        label249:
        paramContext = paramas.tOP;
        break label87;
        label257:
        if ((((String)localObject).equals("zh_TW")) || (((String)localObject).equals("zh_HK")))
        {
          paramContext = paramContext.tQJ;
          break label107;
        }
        paramContext = paramContext.tQH;
        break label107;
        label293:
        if (paramas == null) {
          localObject = "";
        }
        for (;;)
        {
          try
          {
            if (bg.nm((String)localObject)) {
              continue;
            }
            int i = paramContext.getResources().getIdentifier((String)localObject, "string", paramContext.getPackageName());
            if (i <= 0) {
              continue;
            }
            paramContext = paramContext.getString(i);
          }
          catch (Exception paramContext)
          {
            paramContext = "";
          }
          if (paramas.jib == 6)
          {
            if (paramas.tON == null) {
              localObject = "";
            } else if (a.hnI.n(paramContext, paramas.tOK.lQa)) {
              localObject = paramas.tON.tQK;
            } else {
              localObject = paramas.tON.tQL;
            }
          }
          else {
            localObject = paramas.tOL;
          }
        }
        break label107;
        paramay.qih = paramContext;
        paramay.qig = true;
        continue;
        if (paramas.tOG == 1)
        {
          paramay.qih = paramContext;
          paramay.qig = true;
          continue;
          paramay.qih = paramContext;
          paramay.qig = true;
        }
      }
    }
    label467:
    paramay.qig = false;
    GMTrace.o(15054934114304L, 112168);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */