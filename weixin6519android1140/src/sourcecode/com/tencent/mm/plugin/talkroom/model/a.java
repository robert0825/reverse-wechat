package com.tencent.mm.plugin.talkroom.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;

public final class a
{
  public static final int qwC;
  private static int qwP;
  
  static
  {
    GMTrace.i(5147920957440L, 38355);
    int i = l.sK();
    qwP = i;
    if ((i & 0x400) != 0) {}
    for (i = 16000;; i = 8000)
    {
      qwC = i;
      GMTrace.o(5147920957440L, 38355);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */