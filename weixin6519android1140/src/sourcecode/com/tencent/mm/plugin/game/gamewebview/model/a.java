package com.tencent.mm.plugin.game.gamewebview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import java.util.HashMap;

public final class a
{
  private static HashMap<Integer, d> lIm;
  
  static
  {
    GMTrace.i(17073837178880L, 127210);
    lIm = new HashMap();
    GMTrace.o(17073837178880L, 127210);
  }
  
  public static void a(d paramd)
  {
    GMTrace.i(17073434525696L, 127207);
    lIm.put(Integer.valueOf(paramd.hashCode()), paramd);
    GMTrace.o(17073434525696L, 127207);
  }
  
  public static void b(d paramd)
  {
    GMTrace.i(17073568743424L, 127208);
    lIm.remove(Integer.valueOf(paramd.hashCode()));
    GMTrace.o(17073568743424L, 127208);
  }
  
  public static void cleanup()
  {
    GMTrace.i(20362305732608L, 151711);
    lIm.clear();
    GMTrace.o(20362305732608L, 151711);
  }
  
  public static d oA(int paramInt)
  {
    GMTrace.i(17073702961152L, 127209);
    d locald = (d)lIm.get(Integer.valueOf(paramInt));
    GMTrace.o(17073702961152L, 127209);
    return locald;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */