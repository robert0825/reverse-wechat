package com.tencent.mm.plugin.game.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  public static void V(LinkedList<? extends f> paramLinkedList)
  {
    GMTrace.i(12575664242688L, 93696);
    if (paramLinkedList == null)
    {
      w.e("MicroMsg.GameDataUtil", "Null appInfos");
      GMTrace.o(12575664242688L, 93696);
      return;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      a((f)paramLinkedList.next());
    }
    GMTrace.o(12575664242688L, 93696);
  }
  
  public static void a(f paramf)
  {
    GMTrace.i(12575530024960L, 93695);
    if (paramf == null)
    {
      w.e("MicroMsg.GameDataUtil", "Null appInfo");
      GMTrace.o(12575530024960L, 93695);
      return;
    }
    if (bg.nm(paramf.field_appId))
    {
      w.e("MicroMsg.GameDataUtil", "Invalid appId");
      GMTrace.o(12575530024960L, 93695);
      return;
    }
    String str1 = paramf.field_appId;
    f localf = g.aP(str1, true);
    if (localf == null)
    {
      localf = new f();
      localf.field_appId = str1;
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      String str2 = v.bPK();
      boolean bool1;
      if (str2.equals("zh_CN"))
      {
        localf.field_appName = paramf.field_appName;
        localf.field_appType = paramf.field_appType;
        localf.field_packageName = paramf.field_packageName;
        localf.bX(paramf.fdL);
        localf.ca(paramf.fdQ);
        localf.dg(paramf.fdU);
        localf.cb(paramf.fdR);
        localf.cg(paramf.fdX);
        localf.ch(paramf.fdY);
        localf.ce(paramf.fdV);
        localf.cf(paramf.fdW);
        localf.dh(paramf.fea);
        if (!bg.nm(paramf.fdO)) {
          localf.bY(paramf.fdO);
        }
        if (!bool2) {
          break label339;
        }
        bool1 = an.aWy().l(localf);
        a.a.aWD().Eu(str1);
      }
      for (;;)
      {
        w.i("MicroMsg.GameDataUtil", "Saving AppInfo, appId: %s, insert?: %s, return: %s", new Object[] { str1, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        GMTrace.o(12575530024960L, 93695);
        return;
        if ((str2.equals("zh_TW")) || (str2.equals("zh_HK")))
        {
          localf.field_appName_tw = paramf.field_appName;
          break;
        }
        localf.field_appName_en = paramf.field_appName;
        break;
        label339:
        if (localf.field_appVersion < paramf.field_appVersion)
        {
          w.i("MicroMsg.GameDataUtil", "oldVersion = %s, newVersion = %s", new Object[] { Integer.valueOf(localf.field_appVersion), Integer.valueOf(paramf.field_appVersion) });
          bool1 = an.aWy().a(localf, new String[0]);
          a.a.aWD().Eu(str1);
        }
        else
        {
          int i;
          if ((localf == null) || (bg.nm(localf.field_appIconUrl))) {
            i = 1;
          }
          for (;;)
          {
            if (i == 0) {
              break label571;
            }
            w.i("MicroMsg.GameDataUtil", "oldIcon = %s, newIcon = %s", new Object[] { localf.field_appIconUrl, paramf.field_appIconUrl });
            localf.field_appIconUrl = paramf.field_appIconUrl;
            bool1 = an.aWy().a(localf, new String[0]);
            an.aWw().cA(str1, 1);
            an.aWw().cA(str1, 2);
            an.aWw().cA(str1, 3);
            an.aWw().cA(str1, 4);
            an.aWw().cA(str1, 5);
            break;
            if ((paramf == null) || (bg.nm(paramf.field_appIconUrl))) {
              i = 0;
            } else if (!localf.field_appIconUrl.equals(paramf.field_appIconUrl)) {
              i = 1;
            } else {
              i = 0;
            }
          }
          label571:
          bool1 = an.aWy().a(localf, new String[0]);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */