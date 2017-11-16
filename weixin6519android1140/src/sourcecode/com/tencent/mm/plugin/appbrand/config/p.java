package com.tencent.mm.plugin.appbrand.config;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.bm.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.protocal.c.buw;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public final class p
  extends com.tencent.mm.sdk.e.i<WxaAttributes>
{
  public final g goN;
  
  public p(g paramg)
  {
    super(paramg, WxaAttributes.hIP, "WxaAttributesTable", WxaAttributes.eZt);
    GMTrace.i(15534494056448L, 115741);
    this.goN = paramg;
    GMTrace.o(15534494056448L, 115741);
  }
  
  private static boolean a(WxaAttributes paramWxaAttributes, buw parambuw)
  {
    GMTrace.i(15535433580544L, 115748);
    if (("NickName".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_nickname)))
    {
      paramWxaAttributes.field_nickname = parambuw.oqQ;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("BrandIconURL".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_brandIconURL)))
    {
      paramWxaAttributes.field_brandIconURL = parambuw.oqQ;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("BigHeadImgUrl".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_bigHeadURL)))
    {
      paramWxaAttributes.field_bigHeadURL = parambuw.oqQ;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("SmallHeadImgUrl".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_smallHeadURL)))
    {
      paramWxaAttributes.field_smallHeadURL = parambuw.oqQ;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("Signature".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_signature)))
    {
      paramWxaAttributes.field_signature = parambuw.oqQ;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if ("WxAppOpt".equals(parambuw.tVN))
    {
      int i = bg.getInt(parambuw.oqQ, 0);
      if (i != paramWxaAttributes.field_appOpt)
      {
        paramWxaAttributes.field_appOpt = i;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
    }
    if (("RegisterSource".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_registerSource)))
    {
      paramWxaAttributes.field_registerSource = parambuw.oqQ;
      GMTrace.o(15535433580544L, 115748);
      return true;
    }
    if (("WxaAppInfo".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_appInfo))) {
      paramWxaAttributes.field_appInfo = parambuw.oqQ;
    }
    try
    {
      parambuw = new JSONObject(parambuw.oqQ);
      paramWxaAttributes.field_appId = parambuw.getString("Appid");
      parambuw = SysConfigUtil.f(parambuw);
      l.a(paramWxaAttributes.field_appId, parambuw.tQD);
      GMTrace.o(15535433580544L, 115748);
      return true;
      if (("WxaAppVersionInfo".equalsIgnoreCase(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_versionInfo)))
      {
        paramWxaAttributes.field_versionInfo = parambuw.oqQ;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      if (("BindWxaInfo".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_bindWxaInfo)))
      {
        paramWxaAttributes.field_bindWxaInfo = parambuw.oqQ;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      if (("WxaAppDynamic".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_dynamicInfo)))
      {
        paramWxaAttributes.field_dynamicInfo = parambuw.oqQ;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      if (("MMBizMenu".equals(parambuw.tVN)) && (!aR(parambuw.oqQ, paramWxaAttributes.field_bizMenu)))
      {
        paramWxaAttributes.field_bizMenu = parambuw.oqQ;
        GMTrace.o(15535433580544L, 115748);
        return true;
      }
      GMTrace.o(15535433580544L, 115748);
      return false;
    }
    catch (Exception paramWxaAttributes)
    {
      for (;;) {}
    }
  }
  
  private boolean a(WxaAttributes paramWxaAttributes, String... paramVarArgs)
  {
    GMTrace.i(15535702016000L, 115750);
    int i;
    if (!bg.E(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("username"))
        {
          paramVarArgs[i] = "usernameHash";
          paramWxaAttributes.field_usernameHash = paramWxaAttributes.field_username.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramWxaAttributes, paramVarArgs);
        GMTrace.o(15535702016000L, 115750);
        return bool;
      }
      i += 1;
    }
  }
  
  private static boolean aR(String paramString1, String paramString2)
  {
    GMTrace.i(15535567798272L, 115749);
    boolean bool = bg.nl(paramString1).equals(bg.nl(paramString2));
    GMTrace.o(15535567798272L, 115749);
    return bool;
  }
  
  final long UB()
  {
    GMTrace.i(15534628274176L, 115742);
    long l = this.goN.cE(Thread.currentThread().getId());
    GMTrace.o(15534628274176L, 115742);
    return l;
  }
  
  final boolean a(String paramString, b paramb, List<buw> paramList)
  {
    GMTrace.i(15535299362816L, 115747);
    if (bg.cc(paramList))
    {
      GMTrace.o(15535299362816L, 115747);
      return false;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    if (!a(localWxaAttributes, new String[] { "username" })) {}
    boolean bool;
    for (int i = 1;; i = 0)
    {
      paramString = paramList.iterator();
      bool = false;
      while (paramString.hasNext())
      {
        paramList = (buw)paramString.next();
        if (paramList != null) {
          bool = a(localWxaAttributes, paramList) | bool;
        }
      }
    }
    if (bool)
    {
      if (i == 0) {
        break label460;
      }
      b(localWxaAttributes);
    }
    for (;;)
    {
      try
      {
        if (com.tencent.mm.kernel.h.xw().wL())
        {
          String str1 = localWxaAttributes.field_username;
          String str2 = localWxaAttributes.field_nickname;
          String str3 = localWxaAttributes.field_bigHeadURL;
          String str4 = localWxaAttributes.field_smallHeadURL;
          paramList = n.Di().ig(str1);
          i = 0;
          paramString = paramList;
          if (paramList == null)
          {
            paramString = new com.tencent.mm.ac.h();
            i = 1;
          }
          if (!bg.nl(str4).equals(paramString.Dp()))
          {
            paramString.gsT = str4;
            i = 1;
          }
          if (!bg.nl(str3).equals(paramString.Do()))
          {
            paramString.gsU = str3;
            i = 1;
          }
          if (i != 0)
          {
            paramString.username = str1;
            paramString.bi(true);
            paramString.eQl = 31;
            n.Di().a(paramString);
          }
          paramList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str1);
          i = 0;
          paramString = paramList;
          if (paramList == null) {
            paramString = new com.tencent.mm.storage.x();
          }
          if ((int)paramString.fTq == 0)
          {
            paramString.setUsername(str1);
            i = 1;
          }
          if (!str2.equals(paramString.field_nickname))
          {
            paramString.cl(str2);
            paramString.cm(c.nc(str2));
            paramString.cn(c.nb(str2));
            i = 1;
          }
          if (i != 0) {
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().P(paramString);
          }
        }
      }
      catch (Exception paramString)
      {
        label460:
        w.printErrStackTrace("MicroMsg.WxaAttrStorage", paramString, "flushContactInMainDB", new Object[0]);
        continue;
      }
      e.Sl().a(localWxaAttributes.field_appId, localWxaAttributes.UF());
      localWxaAttributes.field_syncTimeSecond = bg.Pu();
      localWxaAttributes.field_syncVersion = bg.bs(paramb.tJp);
      c(localWxaAttributes, new String[] { "username" });
      GMTrace.o(15535299362816L, 115747);
      return bool;
      c(localWxaAttributes, new String[] { "username" });
    }
  }
  
  final int aL(long paramLong)
  {
    GMTrace.i(15534762491904L, 115743);
    int i = this.goN.aL(paramLong);
    GMTrace.o(15534762491904L, 115743);
    return i;
  }
  
  public final WxaAttributes d(String paramString, String... paramVarArgs)
  {
    Object localObject1 = null;
    GMTrace.i(15534896709632L, 115744);
    if (bg.nm(paramString))
    {
      GMTrace.o(15534896709632L, 115744);
      return null;
    }
    if (!paramString.endsWith("@app"))
    {
      GMTrace.o(15534896709632L, 115744);
      return null;
    }
    Object localObject2 = this.goN;
    if (bg.E(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      localObject2 = ((g)localObject2).a("WxaAttributesTable", paramVarArgs, String.format(Locale.US, "%s=?", new Object[] { "usernameHash" }), new String[] { String.valueOf(paramString.hashCode()) }, null, null, null, 2);
      if (localObject2 != null) {
        break;
      }
      GMTrace.o(15534896709632L, 115744);
      return null;
    }
    paramVarArgs = (String[])localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramVarArgs = new WxaAttributes();
      paramVarArgs.b((Cursor)localObject2);
      paramVarArgs.field_username = paramString;
    }
    ((Cursor)localObject2).close();
    GMTrace.o(15534896709632L, 115744);
    return paramVarArgs;
  }
  
  public final WxaAttributes e(String paramString, String... paramVarArgs)
  {
    Object localObject1 = null;
    GMTrace.i(15535030927360L, 115745);
    if (bg.nm(paramString))
    {
      GMTrace.o(15535030927360L, 115745);
      return null;
    }
    Object localObject2 = this.goN;
    if (bg.E(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      localObject2 = ((g)localObject2).a("WxaAttributesTable", paramVarArgs, String.format(Locale.US, "%s=?", new Object[] { "appId" }), new String[] { paramString }, null, null, null, 2);
      if (localObject2 != null) {
        break;
      }
      GMTrace.o(15535030927360L, 115745);
      return null;
    }
    paramVarArgs = (String[])localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramVarArgs = new WxaAttributes();
      paramVarArgs.b((Cursor)localObject2);
      paramVarArgs.field_appId = paramString;
    }
    ((Cursor)localObject2).close();
    GMTrace.o(15535030927360L, 115745);
    return paramVarArgs;
  }
  
  final long pp(String paramString)
  {
    GMTrace.i(15535165145088L, 115746);
    paramString = d(paramString, new String[] { "appInfo" });
    if ((paramString == null) || (paramString.UD() == null))
    {
      GMTrace.o(15535165145088L, 115746);
      return 0L;
    }
    long l = paramString.UD().hML;
    GMTrace.o(15535165145088L, 115746);
    return l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */