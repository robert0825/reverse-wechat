package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements com.tencent.mm.jsapi.c.a
{
  private static final int hUb;
  private byte[] hUc;
  private String id;
  
  static
  {
    GMTrace.i(20775562117120L, 154790);
    hUb = -bg.getInt(r.hke, 0);
    GMTrace.o(20775562117120L, 154790);
  }
  
  public a(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(20775293681664L, 154788);
    this.id = paramString;
    this.hUc = paramArrayOfByte;
    GMTrace.o(20775293681664L, 154788);
  }
  
  public final boolean eS(int paramInt)
  {
    GMTrace.i(20775427899392L, 154789);
    int i = hUb;
    if (i == -1)
    {
      w.d("MicroMsg.DefaultPermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm on", new Object[] { this.id, Integer.valueOf(paramInt) });
      paramInt = 1;
    }
    while (paramInt == 1)
    {
      GMTrace.o(20775427899392L, 154789);
      return true;
      if (i == -2)
      {
        w.d("MicroMsg.DefaultPermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm off", new Object[] { this.id, Integer.valueOf(paramInt) });
        paramInt = 0;
      }
      else if (paramInt == -2)
      {
        paramInt = 1;
      }
      else if (paramInt == -1)
      {
        paramInt = 0;
      }
      else if ((this.hUc == null) || (paramInt < 0) || (paramInt >= this.hUc.length))
      {
        paramInt = 0;
      }
      else
      {
        paramInt = this.hUc[paramInt];
      }
    }
    GMTrace.o(20775427899392L, 154789);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */