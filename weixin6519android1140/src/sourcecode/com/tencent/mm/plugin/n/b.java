package com.tencent.mm.plugin.n;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements com.tencent.mm.kernel.api.bucket.b, com.tencent.mm.kernel.b.b
{
  private static b mhO;
  
  private b()
  {
    GMTrace.i(16423015415808L, 122361);
    GMTrace.o(16423015415808L, 122361);
  }
  
  public static b aHC()
  {
    try
    {
      GMTrace.i(16423149633536L, 122362);
      if (mhO == null) {
        mhO = new b();
      }
      b localb = mhO;
      GMTrace.o(16423149633536L, 122362);
      return localb;
    }
    finally {}
  }
  
  public static String yU()
  {
    GMTrace.i(16423418068992L, 122364);
    Object localObject = new StringBuilder();
    h.xz();
    localObject = h.xy().fYU + "image/";
    GMTrace.o(16423418068992L, 122364);
    return (String)localObject;
  }
  
  public static String yV()
  {
    GMTrace.i(16423552286720L, 122365);
    Object localObject = new StringBuilder();
    h.xz();
    localObject = h.xy().fYU + "image2/";
    GMTrace.o(16423552286720L, 122365);
    return (String)localObject;
  }
  
  public static String zk()
  {
    GMTrace.i(16423686504448L, 122366);
    Object localObject = new StringBuilder();
    h.xz();
    localObject = h.xy().fYU + "sfs";
    GMTrace.o(16423686504448L, 122366);
    return (String)localObject;
  }
  
  public final List<String> collectStoragePaths()
  {
    GMTrace.i(16423283851264L, 122363);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "image/", "image2/" });
    GMTrace.o(16423283851264L, 122363);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\n\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */