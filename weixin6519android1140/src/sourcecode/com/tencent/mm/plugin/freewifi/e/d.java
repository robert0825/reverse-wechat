package com.tencent.mm.plugin.freewifi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private String eCE;
  private String eEU;
  private int lqW;
  
  public d()
  {
    GMTrace.i(7243730780160L, 53970);
    GMTrace.o(7243730780160L, 53970);
  }
  
  public final boolean i(int paramInt, String paramString1, String paramString2)
  {
    boolean bool = true;
    label184:
    for (;;)
    {
      try
      {
        GMTrace.i(7243864997888L, 53971);
        w.i("MicroMsg.FreeWifi.Protocol31Locker", "threeOneStartUpType=%d, apKey=%s, ticket=%s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
        if ((paramInt != 1) && (paramInt != 2))
        {
          if (paramInt == 3)
          {
            break label184;
            if (i == 0)
            {
              GMTrace.o(7243864997888L, 53971);
              return bool;
            }
          }
          else
          {
            i = 0;
            continue;
          }
          if ((m.yp(paramString1)) || (m.yp(paramString2)))
          {
            GMTrace.o(7243864997888L, 53971);
            bool = false;
            continue;
          }
          if ((paramString1.equals(this.eCE)) && (paramString2.equals(this.eEU)) && (this.lqW != paramInt))
          {
            GMTrace.o(7243864997888L, 53971);
            bool = false;
            continue;
          }
          this.lqW = paramInt;
          this.eCE = paramString1;
          this.eEU = paramString2;
          GMTrace.o(7243864997888L, 53971);
          continue;
        }
        int i = 1;
      }
      finally {}
    }
  }
  
  private static final class a
  {
    public static d lqX;
    
    static
    {
      GMTrace.i(7242254385152L, 53959);
      lqX = new d();
      GMTrace.o(7242254385152L, 53959);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */