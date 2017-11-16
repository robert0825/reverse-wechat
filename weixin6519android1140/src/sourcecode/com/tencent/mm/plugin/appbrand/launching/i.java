package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.sdk.e.i<j>
{
  public static final String hRr;
  
  static
  {
    GMTrace.i(15443897090048L, 115066);
    hRr = com.tencent.mm.sdk.e.i.a(j.hIP, "LaunchWxaAppRespTable");
    GMTrace.o(15443897090048L, 115066);
  }
  
  public i(e parame)
  {
    super(parame, j.hIP, "LaunchWxaAppRespTable", j.eZt);
    GMTrace.i(15442823348224L, 115058);
    GMTrace.o(15442823348224L, 115058);
  }
  
  public final boolean a(j paramj, boolean paramBoolean)
  {
    GMTrace.i(15443091783680L, 115060);
    paramj.field_appIdHash = paramj.field_appId.hashCode();
    super.a(paramj, paramBoolean);
    paramBoolean = a(paramj, new String[] { "appId" });
    w.i("MicroMsg.LaunchWxaAppCacheStorage", "insertNotify appId %s ret %B", new Object[] { paramj.field_appId, Boolean.valueOf(paramBoolean) });
    GMTrace.o(15443091783680L, 115060);
    return paramBoolean;
  }
  
  public final boolean a(j paramj, boolean paramBoolean, String... paramVarArgs)
  {
    GMTrace.i(18830344585216L, 140297);
    int i;
    if (!bg.E(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.b(paramj, paramBoolean, paramVarArgs);
        GMTrace.o(18830344585216L, 140297);
        return paramBoolean;
      }
      i += 1;
    }
  }
  
  public final boolean a(j paramj, String... paramVarArgs)
  {
    GMTrace.i(15442957565952L, 115059);
    int i;
    if (!bg.E(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramj, paramVarArgs);
        GMTrace.o(15442957565952L, 115059);
        return bool;
      }
      i += 1;
    }
  }
  
  public final boolean b(j paramj, boolean paramBoolean, String... paramVarArgs)
  {
    GMTrace.i(15443226001408L, 115061);
    int i;
    if (!bg.E(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.a(paramj, paramBoolean, paramVarArgs);
        w.i("MicroMsg.LaunchWxaAppCacheStorage", "updateNotify appId %s, ret %B", new Object[] { paramj.field_appId, Boolean.valueOf(paramBoolean) });
        GMTrace.o(15443226001408L, 115061);
        return paramBoolean;
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */