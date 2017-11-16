package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;

public final class as
{
  public String eHy;
  public String eUg;
  public boolean qdP;
  public boolean qdQ;
  public int scene;
  
  public as(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(8311298588672L, 61924);
    this.qdP = false;
    this.qdQ = false;
    this.eUg = paramString1;
    this.qdP = paramBoolean1;
    this.qdQ = paramBoolean2;
    this.scene = paramInt;
    this.eHy = paramString2;
    GMTrace.o(8311298588672L, 61924);
  }
  
  public final boolean bpn()
  {
    int i = 2;
    GMTrace.i(8311432806400L, 61925);
    if (this.scene == 1) {}
    for (;;)
    {
      ao.b localb = ao.HA(this.eUg);
      if ((localb != null) && (localb.gpJ) && (!localb.gsF) && ((i & localb.fje) != 0))
      {
        GMTrace.o(8311432806400L, 61925);
        return true;
        if (this.scene == 2) {
          i = 4;
        }
      }
      else
      {
        GMTrace.o(8311432806400L, 61925);
        return false;
      }
      i = -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */