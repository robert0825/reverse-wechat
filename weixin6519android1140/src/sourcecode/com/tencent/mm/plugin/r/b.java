package com.tencent.mm.plugin.r;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.api.bucket.a;
import com.tencent.mm.storage.at;
import java.util.HashMap;

public final class b
  implements a, com.tencent.mm.kernel.b.b
{
  private static b mUq;
  
  private b()
  {
    GMTrace.i(16422210109440L, 122355);
    GMTrace.o(16422210109440L, 122355);
  }
  
  public static b aOd()
  {
    try
    {
      GMTrace.i(16422344327168L, 122356);
      if (mUq == null) {
        mUq = new b();
      }
      b localb = mUq;
      GMTrace.o(16422344327168L, 122356);
      return localb;
    }
    finally {}
  }
  
  public final HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(16422478544896L, 122357);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("MediaCheckDumplicationStorage".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(16422746980352L, 122359);
        String[] arrayOfString = at.fTX;
        GMTrace.o(16422746980352L, 122359);
        return arrayOfString;
      }
    });
    GMTrace.o(16422478544896L, 122357);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\r\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */