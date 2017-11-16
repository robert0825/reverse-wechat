package com.tencent.mm.plugin.accountsync.b;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static a htk;
  private Map<String, String> htl;
  
  static
  {
    GMTrace.i(7849455386624L, 58483);
    htk = new a();
    GMTrace.o(7849455386624L, 58483);
  }
  
  public a()
  {
    GMTrace.i(7849186951168L, 58481);
    GMTrace.o(7849186951168L, 58481);
  }
  
  public final Map<String, String> bA(Context paramContext)
  {
    GMTrace.i(7849321168896L, 58482);
    for (;;)
    {
      int i;
      try
      {
        paramContext = bg.n(paramContext.getAssets().open("config/EmailAddress.xml"));
        boolean bool = bg.nm(paramContext);
        if (bool)
        {
          GMTrace.o(7849321168896L, 58482);
          return null;
        }
        Map localMap = bh.q(paramContext, "config");
        if ((localMap == null) || (localMap.isEmpty()))
        {
          w.d("MicroMsg.EmailFormater", "values null");
          GMTrace.o(7849321168896L, 58482);
          return null;
        }
        if (this.htl == null)
        {
          this.htl = new HashMap();
          i = 0;
          Object localObject = new StringBuilder(".config.format");
          if (i == 0)
          {
            paramContext = "";
            localObject = paramContext;
            if (localMap.get(localObject) == null) {
              continue;
            }
            paramContext = (String)localObject + ".emaildomain";
            localObject = (String)localObject + ".loginpage";
            paramContext = (String)localMap.get(paramContext);
            localObject = (String)localMap.get(localObject);
            if ((bg.nm(paramContext)) || (bg.nm((String)localObject))) {
              break label308;
            }
            this.htl.put(paramContext, localObject);
            break label308;
          }
        }
        else
        {
          paramContext = this.htl;
          GMTrace.o(7849321168896L, 58482);
          return paramContext;
        }
        paramContext = Integer.valueOf(i);
        continue;
        paramContext = this.htl;
        GMTrace.o(7849321168896L, 58482);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        w.e("MicroMsg.EmailFormater", "parse email failed:[%s]", new Object[] { paramContext.getMessage() });
        GMTrace.o(7849321168896L, 58482);
        return null;
      }
      label308:
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\accountsync\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */