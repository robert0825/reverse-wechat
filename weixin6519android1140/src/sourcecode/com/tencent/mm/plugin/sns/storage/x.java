package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class x
  extends i<w>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(20835154788352L, 155234);
    fTX = new String[] { i.a(w.fTp, "UxCanvasInfo") };
    GMTrace.o(20835154788352L, 155234);
  }
  
  public x(e parame)
  {
    this(parame, w.fTp, "UxCanvasInfo");
    GMTrace.i(20834752135168L, 155231);
    GMTrace.o(20834752135168L, 155231);
  }
  
  private x(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(20834886352896L, 155232);
    GMTrace.o(20834886352896L, 155232);
  }
  
  public final void a(w paramw)
  {
    GMTrace.i(20835020570624L, 155233);
    if ((paramw == null) || (bg.nm(paramw.field_canvasXml)))
    {
      GMTrace.o(20835020570624L, 155233);
      return;
    }
    paramw.field_createTime = System.currentTimeMillis();
    if (!b(paramw)) {
      c(paramw, new String[0]);
    }
    GMTrace.o(20835020570624L, 155233);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */