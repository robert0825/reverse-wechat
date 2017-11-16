package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class d
  extends i<c>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(16642998272000L, 124000);
    fTX = new String[] { i.a(c.fTp, "CanvasInfo") };
    GMTrace.o(16642998272000L, 124000);
  }
  
  public d(e parame)
  {
    this(parame, c.fTp, "CanvasInfo");
    GMTrace.i(16642595618816L, 123997);
    GMTrace.o(16642595618816L, 123997);
  }
  
  private d(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(16642729836544L, 123998);
    GMTrace.o(16642729836544L, 123998);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(16642864054272L, 123999);
    if (paramc == null)
    {
      GMTrace.o(16642864054272L, 123999);
      return;
    }
    paramc.field_createTime = System.currentTimeMillis();
    if (!b(paramc)) {
      c(paramc, new String[0]);
    }
    GMTrace.o(16642864054272L, 123999);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */