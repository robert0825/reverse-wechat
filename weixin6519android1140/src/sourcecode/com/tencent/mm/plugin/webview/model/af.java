package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class af
  extends i<ae>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(12004299374592L, 89439);
    fTX = new String[] { i.a(ae.fTp, "WebviewLocalData") };
    GMTrace.o(12004299374592L, 89439);
  }
  
  public af(e parame)
  {
    super(parame, ae.fTp, "WebviewLocalData", null);
    GMTrace.i(12004030939136L, 89437);
    GMTrace.o(12004030939136L, 89437);
  }
  
  public static int aa(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12004165156864L, 89438);
    int i = (paramString1 + paramString2 + paramString3).hashCode();
    GMTrace.o(12004165156864L, 89438);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */