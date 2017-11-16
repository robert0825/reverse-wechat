package com.tencent.mm.plugin.scanner.util;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class j
{
  public static boolean bdx()
  {
    GMTrace.i(6179652632576L, 46042);
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100027");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      w.e("MicroMsg.ScanHistoryUtil", "shouldShowHistoryList item.isValid is false");
      GMTrace.o(6179652632576L, 46042);
      return false;
    }
    localObject = ((com.tencent.mm.storage.c)localObject).bSg();
    if (localObject == null)
    {
      w.e("MicroMsg.ScanHistoryUtil", "shouldShowHistoryList args == null");
      GMTrace.o(6179652632576L, 46042);
      return false;
    }
    if ((((Map)localObject).containsKey("showEntrance")) && ("1".equals(((Map)localObject).get("showEntrance"))))
    {
      GMTrace.o(6179652632576L, 46042);
      return true;
    }
    w.e("MicroMsg.ScanHistoryUtil", "not contain the showEntrance key or the value is not 1");
    GMTrace.o(6179652632576L, 46042);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */