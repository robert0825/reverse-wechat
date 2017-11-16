package com.tencent.mm.plugin.exdevice.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import java.util.HashMap;

public final class v
{
  private static v kDj;
  final HashMap<Long, Integer> kDk;
  public af kxr;
  
  static
  {
    GMTrace.i(11162217349120L, 83165);
    kDj = null;
    GMTrace.o(11162217349120L, 83165);
  }
  
  private v()
  {
    GMTrace.i(11161948913664L, 83163);
    this.kDk = new HashMap();
    this.kxr = new af();
    GMTrace.o(11161948913664L, 83163);
  }
  
  public static v auu()
  {
    GMTrace.i(11162083131392L, 83164);
    if (kDj == null) {
      kDj = new v();
    }
    v localv = kDj;
    GMTrace.o(11162083131392L, 83164);
    return localv;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */