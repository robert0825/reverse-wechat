package com.tencent.mm.plugin.sns.data;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bew;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  public ConcurrentHashMap<String, CharSequence> ppg;
  
  public d()
  {
    GMTrace.i(8781463289856L, 65427);
    this.ppg = new ConcurrentHashMap();
    GMTrace.o(8781463289856L, 65427);
  }
  
  public final void a(bew parambew, CharSequence paramCharSequence)
  {
    GMTrace.i(8781597507584L, 65428);
    this.ppg.put(parambew.uQm + "-" + parambew.uQp + "-" + parambew.nIp, paramCharSequence);
    GMTrace.o(8781597507584L, 65428);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\data\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */