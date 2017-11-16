package com.tencent.mm.plugin.appbrand.config;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.List;

public final class t
{
  public String appId;
  public String eCQ;
  public String gwN;
  public List<WxaAttributes.WxaEntryInfo> hRF;
  public List<Pair<String, String>> hRS;
  public int hRY;
  public String hSb;
  private String hSc;
  public String signature;
  public String username;
  
  public t()
  {
    GMTrace.i(15536238886912L, 115754);
    this.hSc = null;
    GMTrace.o(15536238886912L, 115754);
  }
  
  public final String UJ()
  {
    GMTrace.i(15536373104640L, 115755);
    if ((bg.nm(this.hSc)) && (!bg.cc(this.hRS)))
    {
      Object localObject2 = new StringBuilder();
      Iterator localIterator = this.hRS.iterator();
      label118:
      while (localIterator.hasNext())
      {
        localObject1 = (Pair)localIterator.next();
        if (bg.nm((String)((Pair)localObject1).second)) {}
        for (localObject1 = (String)((Pair)localObject1).first;; localObject1 = (String)((Pair)localObject1).second)
        {
          if (bg.nm((String)localObject1)) {
            break label118;
          }
          ((StringBuilder)localObject2).append("、");
          ((StringBuilder)localObject2).append((String)localObject1);
          break;
        }
      }
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = localObject2;
      if (!bg.nm((String)localObject2)) {
        localObject1 = ((String)localObject2).replaceFirst("、", "");
      }
      this.hSc = ((String)localObject1);
    }
    Object localObject1 = bg.nl(this.hSc);
    GMTrace.o(15536373104640L, 115755);
    return (String)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */