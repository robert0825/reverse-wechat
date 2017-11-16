package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public float fJn;
  public float fJo;
  Map<String, Object> jxc;
  int oMR;
  long oMS;
  String oMT;
  
  public d()
  {
    GMTrace.i(6524323758080L, 48610);
    this.jxc = new HashMap();
    this.oMR = 0;
    this.oMS = 0L;
    this.fJn = -85.0F;
    this.fJo = -1000.0F;
    this.oMT = "";
    this.jxc.clear();
    GMTrace.o(6524323758080L, 48610);
  }
  
  public final void putValue(String paramString, Object paramObject)
  {
    GMTrace.i(6524457975808L, 48611);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6524457975808L, 48611);
      return;
    }
    this.jxc.put(paramString, paramObject);
    GMTrace.o(6524457975808L, 48611);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\c\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */