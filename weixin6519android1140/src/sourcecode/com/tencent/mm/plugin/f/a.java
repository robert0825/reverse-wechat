package com.tencent.mm.plugin.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.k;
import com.tencent.mm.y.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends p
  implements b
{
  private static a iUU;
  
  private a()
  {
    super(n.class);
    GMTrace.i(14604230983680L, 108810);
    GMTrace.o(14604230983680L, 108810);
  }
  
  public static a adZ()
  {
    try
    {
      GMTrace.i(14604365201408L, 108811);
      if (iUU == null) {
        iUU = new a();
      }
      a locala = iUU;
      GMTrace.o(14604365201408L, 108811);
      return locala;
    }
    finally {}
  }
  
  public static String aea()
  {
    GMTrace.i(14604633636864L, 108813);
    String str = h.xy().fYU + "avatar/";
    GMTrace.o(14604633636864L, 108813);
    return str;
  }
  
  public final List<String> collectStoragePaths()
  {
    GMTrace.i(14604499419136L, 108812);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "avatar/" });
    GMTrace.o(14604499419136L, 108812);
    return localLinkedList;
  }
  
  public final void eO(String paramString)
  {
    GMTrace.i(14604767854592L, 108814);
    super.eO(paramString);
    if (f.ty())
    {
      h.xz();
      if (h.xy().fYT.equals(com.tencent.mm.compatible.util.e.ghz))
      {
        h.xz();
        com.tencent.mm.sdk.f.e.post(new k(h.xy().cachePath, paramString, "avatar/"), "Account_moveDataFiles_" + "avatar/");
      }
    }
    GMTrace.o(14604767854592L, 108814);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */