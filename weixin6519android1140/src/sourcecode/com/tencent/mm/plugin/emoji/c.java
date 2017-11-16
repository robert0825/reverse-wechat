package com.tencent.mm.plugin.emoji;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, String paramString3)
  {
    GMTrace.i(11330123726848L, 84416);
    w.i("MicroMsg.emoji.EmojiReportHepler", "report kv stat md5:%s, downType:%d donwloadResult:%d verifyResult:%d productID:%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2 });
    g.ork.i(12007, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2, Integer.valueOf(paramInt4), paramString3 });
    GMTrace.o(11330123726848L, 84416);
  }
  
  public static void bu(long paramLong)
  {
    GMTrace.i(11329989509120L, 84415);
    w.i("MicroMsg.emoji.EmojiReportHepler", "report id stat key:%d, value:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(1L) });
    g.ork.a(96L, paramLong, 1L, false);
    GMTrace.o(11329989509120L, 84415);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */