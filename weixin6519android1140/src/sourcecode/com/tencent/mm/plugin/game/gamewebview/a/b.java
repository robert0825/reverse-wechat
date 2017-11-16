package com.tencent.mm.plugin.game.gamewebview.a;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static final Map<String, Integer> lGg;
  
  static
  {
    GMTrace.i(16938277273600L, 126200);
    HashMap localHashMap = new HashMap();
    lGg = localHashMap;
    localHashMap.put("addDownloadTaskStraight", Integer.valueOf(1));
    lGg.put("cancelDownloadTask", Integer.valueOf(2));
    lGg.put("pauseDownloadTask", Integer.valueOf(3));
    lGg.put("resumeDownloadTask", Integer.valueOf(4));
    lGg.put("openCustomWebview", Integer.valueOf(5));
    lGg.put("openUrlWithExtraWebview", Integer.valueOf(6));
    lGg.put("sendAppMessage", Integer.valueOf(7));
    GMTrace.o(16938277273600L, 126200);
  }
  
  public static int zk(String paramString)
  {
    GMTrace.i(16938143055872L, 126199);
    if (!lGg.containsKey(paramString))
    {
      GMTrace.o(16938143055872L, 126199);
      return 0;
    }
    int i = ((Integer)lGg.get(paramString)).intValue();
    GMTrace.o(16938143055872L, 126199);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */