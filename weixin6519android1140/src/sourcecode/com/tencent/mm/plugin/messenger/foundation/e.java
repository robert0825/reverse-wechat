package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.az;

public final class e
  implements i
{
  public e()
  {
    GMTrace.i(13235075940352L, 98609);
    GMTrace.o(13235075940352L, 98609);
  }
  
  public final c a(g paramg, ar paramar, as paramas)
  {
    GMTrace.i(13235478593536L, 98612);
    paramg = new av(paramg, paramar, paramas);
    GMTrace.o(13235478593536L, 98612);
    return paramg;
  }
  
  public final ar d(g paramg)
  {
    GMTrace.i(13235210158080L, 98610);
    paramg = new ad(paramg);
    GMTrace.o(13235210158080L, 98610);
    return paramg;
  }
  
  public final as e(g paramg)
  {
    GMTrace.i(13235344375808L, 98611);
    paramg = new af(paramg);
    GMTrace.o(13235344375808L, 98611);
    return paramg;
  }
  
  public final f f(g paramg)
  {
    GMTrace.i(13235612811264L, 98613);
    paramg = new az(paramg);
    GMTrace.o(13235612811264L, 98613);
    return paramg;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */