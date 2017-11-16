package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class n
  extends i<o>
{
  public static final String hRr;
  
  static
  {
    GMTrace.i(19991730585600L, 148950);
    hRr = i.a(o.hIP, "LaunchWxaWidgetRespData");
    GMTrace.o(19991730585600L, 148950);
  }
  
  public n(e parame)
  {
    super(parame, o.hIP, "LaunchWxaWidgetRespData", o.eZt);
    GMTrace.i(19990656843776L, 148942);
    GMTrace.o(19990656843776L, 148942);
  }
  
  public final boolean a(o paramo, boolean paramBoolean)
  {
    GMTrace.i(19990925279232L, 148944);
    paramo.field_appIdHash = paramo.field_appId.hashCode();
    super.a(paramo, paramBoolean);
    paramBoolean = a(paramo, new String[] { "appId" });
    GMTrace.o(19990925279232L, 148944);
    return paramBoolean;
  }
  
  public final boolean a(o paramo, boolean paramBoolean, String... paramVarArgs)
  {
    GMTrace.i(19991059496960L, 148945);
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
          paramo.field_appIdHash = paramo.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.a(paramo, paramBoolean, paramVarArgs);
        GMTrace.o(19991059496960L, 148945);
        return paramBoolean;
      }
      i += 1;
    }
  }
  
  public final boolean a(o paramo, String... paramVarArgs)
  {
    GMTrace.i(19990791061504L, 148943);
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
          paramo.field_appIdHash = paramo.field_appId.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramo, paramVarArgs);
        GMTrace.o(19990791061504L, 148943);
        return bool;
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */