package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;

public final class f
{
  public static void a(a parama, String paramString)
  {
    GMTrace.i(20757174288384L, 154653);
    d.oqe.i(14750, new Object[] { Integer.valueOf(parama.value), paramString });
    GMTrace.o(20757174288384L, 154653);
  }
  
  public static enum a
  {
    final int value;
    
    static
    {
      GMTrace.i(20757040070656L, 154652);
      izh = new a("GUIDE_EXPOSE", 0, 1);
      izi = new a("GUIDE_CLOSE", 1, 2);
      izj = new a("TO_APP_LAUNCHER", 2, 3);
      izk = new a("GUIDE_CLOSE_BY_BACK", 3, 4);
      izl = new a[] { izh, izi, izj, izk };
      GMTrace.o(20757040070656L, 154652);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(20756905852928L, 154651);
      this.value = paramInt;
      GMTrace.o(20756905852928L, 154651);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */