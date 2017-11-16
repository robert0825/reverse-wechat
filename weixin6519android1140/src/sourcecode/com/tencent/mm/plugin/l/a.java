package com.tencent.mm.plugin.l;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.t;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.y.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends p
  implements b
{
  private static a kdS;
  
  private a()
  {
    super(t.class);
    GMTrace.i(14601412411392L, 108789);
    GMTrace.o(14601412411392L, 108789);
  }
  
  public static a apu()
  {
    try
    {
      GMTrace.i(14601546629120L, 108790);
      if (kdS == null) {
        kdS = new a();
      }
      a locala = kdS;
      GMTrace.o(14601546629120L, 108790);
      return locala;
    }
    finally {}
  }
  
  public static String ze()
  {
    GMTrace.i(14601815064576L, 108792);
    Object localObject = new StringBuilder();
    h.xz();
    localObject = h.xy().fYU + "package/";
    GMTrace.o(14601815064576L, 108792);
    return (String)localObject;
  }
  
  public final List<String> collectStoragePaths()
  {
    GMTrace.i(14601680846848L, 108791);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "package/" });
    GMTrace.o(14601680846848L, 108791);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\l\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */