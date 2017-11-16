package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<g>
{
  public static final String[] fTX;
  public static final String[] mmV;
  public static int mmW;
  public e fTZ;
  
  static
  {
    GMTrace.i(11579500265472L, 86274);
    fTX = new String[] { i.a(g.fTp, "IPCallMsg") };
    mmV = new String[] { "*", "rowid" };
    mmW = 0;
    GMTrace.o(11579500265472L, 86274);
  }
  
  public h(e parame)
  {
    super(parame, g.fTp, "IPCallMsg", null);
    GMTrace.i(11579366047744L, 86273);
    this.fTZ = parame;
    GMTrace.o(11579366047744L, 86273);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */