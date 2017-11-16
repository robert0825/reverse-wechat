package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class ap
  extends i<ao>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(1565784014848L, 11666);
    fTX = new String[] { i.a(ao.fTp, "GetSysCmdMsgInfo") };
    GMTrace.o(1565784014848L, 11666);
  }
  
  public ap(g paramg)
  {
    super(paramg, ao.fTp, "GetSysCmdMsgInfo", null);
    GMTrace.i(1565649797120L, 11665);
    this.fTZ = paramg;
    GMTrace.o(1565649797120L, 11665);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */