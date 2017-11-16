package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  public CardInfo jwB;
  public Map<String, Object> jxc;
  
  public e()
  {
    GMTrace.i(5115171831808L, 38111);
    this.jxc = new HashMap();
    this.jwB = null;
    this.jxc.clear();
    GMTrace.o(5115171831808L, 38111);
  }
  
  public final Object getValue(String paramString)
  {
    GMTrace.i(5115440267264L, 38113);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5115440267264L, 38113);
      return null;
    }
    if (this.jxc.containsKey(paramString))
    {
      paramString = this.jxc.get(paramString);
      GMTrace.o(5115440267264L, 38113);
      return paramString;
    }
    GMTrace.o(5115440267264L, 38113);
    return null;
  }
  
  public final void putValue(String paramString, Object paramObject)
  {
    GMTrace.i(5115306049536L, 38112);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5115306049536L, 38112);
      return;
    }
    this.jxc.put(paramString, paramObject);
    GMTrace.o(5115306049536L, 38112);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */