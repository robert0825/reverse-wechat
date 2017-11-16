package com.tencent.mm.plugin.ad;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;

public enum c
{
  public final SparseArray<b> oRy;
  
  static
  {
    GMTrace.i(20287009587200L, 151150);
    oRx = new c("INSTANCE");
    oRz = new c[] { oRx };
    GMTrace.o(20287009587200L, 151150);
  }
  
  private c()
  {
    GMTrace.i(20286875369472L, 151149);
    this.oRy = new SparseArray();
    GMTrace.o(20286875369472L, 151149);
  }
  
  public final boolean a(b paramb)
  {
    GMTrace.i(6619484127232L, 49319);
    this.oRy.put(paramb.getType(), paramb);
    GMTrace.o(6619484127232L, 49319);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\ad\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */