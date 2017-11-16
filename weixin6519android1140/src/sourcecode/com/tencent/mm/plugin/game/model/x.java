package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class x
{
  public static x lNS;
  
  public x()
  {
    GMTrace.i(12611097722880L, 93960);
    GMTrace.o(12611097722880L, 93960);
  }
  
  static x aFD()
  {
    GMTrace.i(12611231940608L, 93961);
    if (lNS == null) {
      lNS = new x();
    }
    x localx = lNS;
    GMTrace.o(12611231940608L, 93961);
    return localx;
  }
  
  static void c(Map<String, String> paramMap, q paramq)
  {
    GMTrace.i(12611366158336L, 93962);
    paramq.lMR.clear();
    int i = 0;
    if (i == 0) {}
    for (String str1 = ".sysmsg.gamecenter.jump_info.jump";; str1 = ".sysmsg.gamecenter.jump_info.jump" + i)
    {
      if (!paramMap.containsKey(str1)) {
        break label198;
      }
      String str2 = (String)paramMap.get(str1 + ".$id");
      q.d locald = new q.d();
      locald.lNE = bg.getInt((String)paramMap.get(str1 + ".jump_type"), 0);
      locald.kHd = bg.aq((String)paramMap.get(str1 + ".jump_url"), "");
      if (!bg.nm(str2)) {
        paramq.lMR.put(str2, locald);
      }
      i += 1;
      break;
    }
    label198:
    GMTrace.o(12611366158336L, 93962);
  }
  
  static void d(Map<String, String> paramMap, q paramq)
  {
    GMTrace.i(12611500376064L, 93963);
    paramq.lNv = bg.getInt((String)paramMap.get(".sysmsg.gamecenter.report.msg_subtype"), 0);
    paramq.lNw = bg.aq((String)paramMap.get(".sysmsg.gamecenter.report.noticeid"), "");
    GMTrace.o(12611500376064L, 93963);
  }
  
  static void e(Map<String, String> paramMap, q paramq)
  {
    boolean bool2 = true;
    GMTrace.i(15198547083264L, 113238);
    paramq.lNd.url = bg.aq((String)paramMap.get(".sysmsg.gamecenter.float_layer.open_url"), "");
    q.a locala = paramq.lNd;
    if (bg.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.full_screen"), 0) == 1)
    {
      bool1 = true;
      locala.lMy = bool1;
      paramq.lNd.orientation = bg.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.orientation"), 0);
      paramq = paramq.lNd;
      if (bg.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.is_transparent"), 0) != 1) {
        break label133;
      }
    }
    label133:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramq.lNA = bool1;
      GMTrace.o(15198547083264L, 113238);
      return;
      bool1 = false;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */