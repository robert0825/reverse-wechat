package com.tencent.mm.ui.contact;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.af.d;
import com.tencent.mm.af.f;
import com.tencent.mm.modelmulti.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.snackbar.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.List;

public final class v
{
  public static String WB(String paramString)
  {
    GMTrace.i(1708457459712L, 12729);
    Object localObject = com.tencent.mm.ac.n.Di().ig(paramString);
    at.AR();
    x localx = c.yK().TE(paramString);
    int i = localx.fiZ;
    if (localObject != null) {
      i = ((h)localObject).fiZ;
    }
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    int j;
    int k;
    int m;
    String str8;
    if (localx.bSA())
    {
      paramString = f.iK(localx.field_username);
      localObject = bg.Sw(localx.field_username);
      str1 = bg.Sw(localx.vj());
      str2 = bg.Sw(localx.qQ());
      str3 = bg.Sw(localx.vj());
      str4 = bg.Sw(localx.qR());
      str5 = bg.Sw(localx.getProvince());
      str6 = bg.Sw(localx.getCity());
      str7 = bg.Sw(localx.signature);
      j = localx.fjj;
      k = localx.fja;
      m = localx.field_verifyFlag;
      str8 = bg.Sw(localx.fjp);
      if (paramString != null) {
        break label308;
      }
    }
    label308:
    for (paramString = "";; paramString = bg.Sw(paramString.field_brandIconURL))
    {
      paramString = String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", new Object[] { localObject, str1, str2, str3, str4, Integer.valueOf(i), str5, str6, str7, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), str8, paramString, bg.Sw(localx.fjq) });
      GMTrace.o(1708457459712L, 12729);
      return paramString;
      paramString = null;
      break;
    }
  }
  
  public static void a(Activity paramActivity, String paramString, List<String> paramList)
  {
    GMTrace.i(1708591677440L, 12730);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      j localj = new j(paramString, WB((String)localIterator.next()), 42);
      at.wS().a(localj, 0);
    }
    a.e(paramActivity, paramActivity.getString(R.l.dCJ));
    g.ork.i(11003, new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramList.size()) });
    paramActivity.setResult(-1);
    com.tencent.mm.sdk.platformtools.af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1812341981184L, 13503);
        this.wUk.finish();
        GMTrace.o(1812341981184L, 13503);
      }
    }, 1800L);
    GMTrace.o(1708591677440L, 12730);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */