package com.tencent.mm.plugin.appbrand.dynamic.i;

import android.content.ContentValues;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.plugin.appbrand.widget.l;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
{
  public static l a(ContentValues paramContentValues)
  {
    GMTrace.i(19984080175104L, 148893);
    if (paramContentValues != null)
    {
      l locall = new l();
      locall.field_id = paramContentValues.getAsString("id");
      locall.field_appId = paramContentValues.getAsString("appId");
      locall.field_cacheKey = paramContentValues.getAsString("cacheKey");
      locall.field_updateTime = bg.c(paramContentValues.getAsLong("updateTime"));
      locall.field_interval = bg.e(paramContentValues.getAsInteger("interval"));
      locall.vmr = bg.c(paramContentValues.getAsLong("rowid"));
      GMTrace.o(19984080175104L, 148893);
      return locall;
    }
    GMTrace.o(19984080175104L, 148893);
    return null;
  }
  
  public static l pU(String paramString)
  {
    GMTrace.i(19983945957376L, 148892);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", paramString);
    paramString = a((ContentValues)e.a("com.tencent.mm", localBundle, a.class));
    GMTrace.o(19983945957376L, 148892);
    return paramString;
  }
  
  private static class a
    implements i<Bundle, ContentValues>
  {
    private a()
    {
      GMTrace.i(17724122071040L, 132055);
      GMTrace.o(17724122071040L, 132055);
    }
  }
  
  private static class b
    implements i<ContentValues, Bundle>
  {
    private b()
    {
      GMTrace.i(17720900845568L, 132031);
      GMTrace.o(17720900845568L, 132031);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */