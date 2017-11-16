package com.tencent.mm.jsapi.core;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.d;
import com.tencent.mm.jsapi.c.a;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public final class e
{
  public d fXF;
  public f fXI;
  public a fXu;
  
  public e(d paramd, f paramf, a parama)
  {
    GMTrace.i(20022332227584L, 149178);
    Assert.assertNotNull(paramd);
    Assert.assertNotNull(paramf);
    Assert.assertNotNull(parama);
    this.fXF = paramd;
    this.fXI = paramf;
    this.fXu = parama;
    GMTrace.o(20022332227584L, 149178);
  }
  
  public static String ws()
  {
    GMTrace.i(20022466445312L, 149179);
    Object localObject = new HashMap();
    ((HashMap)localObject).put("nativeTime", Long.valueOf(System.currentTimeMillis()));
    localObject = new JSONObject((Map)localObject).toString();
    GMTrace.o(20022466445312L, 149179);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\core\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */