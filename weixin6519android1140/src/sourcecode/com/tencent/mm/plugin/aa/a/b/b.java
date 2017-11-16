package com.tencent.mm.plugin.aa.a.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends i<a>
{
  public static final String[] fTX;
  private static final String[] hpt;
  private e fTZ;
  
  static
  {
    GMTrace.i(5587484016640L, 41630);
    fTX = new String[] { i.a(a.fTp, "AAPayRecord") };
    hpt = new String[] { "*", "rowid" };
    GMTrace.o(5587484016640L, 41630);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "AAPayRecord", null);
    GMTrace.i(5587215581184L, 41628);
    this.fTZ = parame;
    GMTrace.o(5587215581184L, 41628);
  }
  
  public final a nu(String paramString)
  {
    GMTrace.i(5587349798912L, 41629);
    if (bg.nm(paramString))
    {
      GMTrace.o(5587349798912L, 41629);
      return null;
    }
    paramString = this.fTZ.a("AAPayRecord", hpt, "payMsgId=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        a locala = new a();
        locala.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(5587349798912L, 41629);
        return locala;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AAPayRecordStorage", "getByPayMsgId error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label159;
      }
      paramString.close();
    }
    GMTrace.o(5587349798912L, 41629);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */