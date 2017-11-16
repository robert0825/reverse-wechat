package com.tencent.mm.ipcinvoker.wx_extension.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;

public final class a
{
  public a()
  {
    GMTrace.i(18977984086016L, 141397);
    GMTrace.o(18977984086016L, 141397);
  }
  
  public static com.tencent.mm.storage.c er(String paramString)
  {
    GMTrace.i(18978252521472L, 141399);
    if (paramString.length() == 0)
    {
      w.i("MicroMsg.IPCNewABTest", "get ABTestItem by layerId failed, id is null.", new Object[] { paramString });
      GMTrace.o(18978252521472L, 141399);
      return null;
    }
    if (ab.bPY())
    {
      paramString = com.tencent.mm.y.c.c.Ct().er(paramString);
      GMTrace.o(18978252521472L, 141399);
      return paramString;
    }
    paramString = (Bundle)e.a("com.tencent.mm", new IPCString(paramString), a.class);
    if (paramString == null)
    {
      GMTrace.o(18978252521472L, 141399);
      return null;
    }
    com.tencent.mm.storage.c localc = new com.tencent.mm.storage.c();
    localc.field_layerId = paramString.getString("layerId");
    localc.field_business = paramString.getString("business");
    localc.field_expId = paramString.getString("expId");
    localc.field_rawXML = paramString.getString("rawXML");
    localc.field_startTime = paramString.getLong("startTime");
    localc.field_endTime = paramString.getLong("endTime");
    localc.field_sequence = paramString.getLong("sequence");
    localc.field_prioritylevel = paramString.getInt("prioritylevel");
    localc.field_needReport = paramString.getBoolean("needReport");
    GMTrace.o(18978252521472L, 141399);
    return localc;
  }
  
  private static class a
    implements i<IPCString, Bundle>
  {
    private a()
    {
      GMTrace.i(18978386739200L, 141400);
      GMTrace.o(18978386739200L, 141400);
    }
  }
  
  private static final class b
  {
    public static a fVY;
    
    static
    {
      GMTrace.i(20278688088064L, 151088);
      fVY = new a();
      GMTrace.o(20278688088064L, 151088);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\wx_extension\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */