package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.g.a.gl.a;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.protocal.c.agw;
import com.tencent.mm.protocal.c.aob;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static final String lMb;
  
  static
  {
    GMTrace.i(18027051483136L, 134312);
    lMb = com.tencent.mm.loader.stub.a.ghz + "Game/HvMenu/";
    GMTrace.o(18027051483136L, 134312);
  }
  
  public static void a(gl paramgl)
  {
    GMTrace.i(18026648829952L, 134309);
    switch (paramgl.eJz.nJ)
    {
    }
    for (;;)
    {
      GMTrace.o(18026648829952L, 134309);
      return;
      Object localObject1 = paramgl.eJz.context;
      if (localObject1 != null)
      {
        localObject1 = e.cy((Context)localObject1);
        if (localObject1 != null)
        {
          localObject1 = e.a((GameRegionPreference.a)localObject1);
          paramgl.eJA.result = ((String)localObject1);
        }
      }
      GMTrace.o(18026648829952L, 134309);
      return;
      paramgl = paramgl.eJz.eJB;
      w.i("MicroMsg.GameCommOpertionProcessor", "update hv menu! appid:%s", new Object[] { paramgl });
      if (!bg.nm(paramgl))
      {
        at.wS().a(1369, new com.tencent.mm.ad.e()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(18028796313600L, 134325);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              w.i("MicroMsg.GameCommOpertionProcessor", "pull menu data success. appid:%s", new Object[] { this.jiV });
              at.wS().b(1369, this);
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(18030138490880L, 134335);
                  f.a(this.lMc, f.1.this.jiV);
                  GMTrace.o(18030138490880L, 134335);
                }
              });
              GMTrace.o(18028796313600L, 134325);
              return;
            }
            w.i("MicroMsg.GameCommOpertionProcessor", "pull menu data fail. appid:%s", new Object[] { this.jiV });
            GMTrace.o(18028796313600L, 134325);
          }
        });
        paramgl = new au(paramgl);
        at.wS().a(paramgl, 0);
      }
      GMTrace.o(18026648829952L, 134309);
      return;
      localObject1 = paramgl.eJz.eJB;
      w.i("MicroMsg.GameCommOpertionProcessor", "get hv menu! appid:%s", new Object[] { localObject1 });
      if (!bg.nm((String)localObject1))
      {
        Object localObject2 = SubCoreGameCenter.aGj().zI("pb_game_hv_menu_" + (String)localObject1);
        if (!bg.bq((byte[])localObject2)) {
          try
          {
            localObject2 = new String((byte[])localObject2, "ISO-8859-1");
            paramgl.eJA.result = ((String)localObject2);
            w.i("MicroMsg.GameCommOpertionProcessor", "get hv menu success! appid:%s", new Object[] { localObject1 });
            GMTrace.o(18026648829952L, 134309);
            return;
          }
          catch (UnsupportedEncodingException paramgl) {}
        }
      }
      GMTrace.o(18026648829952L, 134309);
      return;
      b(paramgl);
    }
  }
  
  public static void a(final agw paramagw, String paramString)
  {
    GMTrace.i(18026783047680L, 134310);
    if (paramagw == null)
    {
      GMTrace.o(18026783047680L, 134310);
      return;
    }
    if (bg.cc(paramagw.uwi))
    {
      w.i("MicroMsg.GameCommOpertionProcessor", "menu list is null. appid:%s", new Object[] { paramString });
      GMTrace.o(18026783047680L, 134310);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(paramagw.uwi);
    a(localArrayList, new a()
    {
      public final void onComplete()
      {
        GMTrace.i(18029064749056L, 134327);
        w.i("MicroMsg.GameCommOpertionProcessor", "menu icon download complete! save menu data. appid:%s", new Object[] { this.jiV });
        SubCoreGameCenter.aGj().a("pb_game_hv_menu_" + this.jiV, paramagw);
        GMTrace.o(18029064749056L, 134327);
      }
    });
    GMTrace.o(18026783047680L, 134310);
  }
  
  public static void a(final List<aob> paramList, final a parama)
  {
    GMTrace.i(18026917265408L, 134311);
    if (bg.cc(paramList))
    {
      if (parama != null) {
        parama.onComplete();
      }
      GMTrace.o(18026917265408L, 134311);
      return;
    }
    aob localaob = (aob)paramList.remove(0);
    if ((localaob == null) || (bg.nm(localaob.nFH)))
    {
      w.e("MicroMsg.GameCommOpertionProcessor", "menu is null or thumburl is null");
      GMTrace.o(18026917265408L, 134311);
      return;
    }
    Object localObject = lMb + com.tencent.mm.a.g.n(localaob.nFH.getBytes());
    c.a locala = new c.a();
    locala.gKC = true;
    locala.gKE = ((String)localObject);
    localObject = locala.Jn();
    com.tencent.mm.ao.n.Jd().a(localaob.nFH, (com.tencent.mm.ao.a.a.c)localObject, new com.tencent.mm.ao.a.c.c()
    {
      public final void a(boolean paramAnonymousBoolean, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(18030541144064L, 134338);
        if (paramAnonymousBoolean)
        {
          w.i("MicroMsg.GameCommOpertionProcessor", "menu icon download success! thumburl:%s", new Object[] { this.lMe.nFH });
          f.a(paramList, parama);
        }
        GMTrace.o(18030541144064L, 134338);
      }
    });
    GMTrace.o(18026917265408L, 134311);
  }
  
  private static void b(gl paramgl)
  {
    GMTrace.i(19312320446464L, 143888);
    paramgl = paramgl.eJz.eJB;
    if (bg.nm(paramgl))
    {
      GMTrace.o(19312320446464L, 143888);
      return;
    }
    Object localObject;
    int j;
    boolean bool;
    try
    {
      localObject = new JSONObject(paramgl);
      j = Integer.parseInt(((JSONObject)localObject).getString("game_page_report_id"));
      bool = ((JSONObject)localObject).getBoolean("game_page_report_instantly");
      paramgl = ((JSONObject)localObject).optString("game_page_report_format_data");
      localObject = ((JSONObject)localObject).optString("game_page_report_tabs_format_data");
      w.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, reportId:%d, reportInstantly:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool), paramgl, localObject });
      if (bg.nm(paramgl)) {
        break label193;
      }
      if (bool)
      {
        ai.ab(j, paramgl);
        GMTrace.o(19312320446464L, 143888);
        return;
      }
    }
    catch (JSONException paramgl)
    {
      w.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err1:%s", new Object[] { paramgl.getMessage() });
      GMTrace.o(19312320446464L, 143888);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.A(j, paramgl);
    GMTrace.o(19312320446464L, 143888);
    return;
    label193:
    if (!bg.nm((String)localObject)) {}
    for (;;)
    {
      int i;
      try
      {
        paramgl = new JSONArray((String)localObject);
        i = 0;
        if (i >= paramgl.length()) {
          break label291;
        }
        localObject = paramgl.getString(i);
        if (bg.nm((String)localObject)) {
          break label301;
        }
        if (bool) {
          ai.ab(j, (String)localObject);
        } else {
          com.tencent.mm.plugin.report.service.g.ork.A(j, (String)localObject);
        }
      }
      catch (JSONException paramgl)
      {
        w.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err2:%s", new Object[] { paramgl.getMessage() });
      }
      GMTrace.o(19312320446464L, 143888);
      return;
      label291:
      GMTrace.o(19312320446464L, 143888);
      return;
      label301:
      i += 1;
    }
  }
  
  static abstract interface a
  {
    public abstract void onComplete();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */