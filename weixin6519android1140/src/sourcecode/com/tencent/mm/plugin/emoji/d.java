package com.tencent.mm.plugin.emoji;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.am.a;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.y.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends p
  implements b
{
  private static d kfN;
  
  private d()
  {
    super(a.class);
    GMTrace.i(16406909288448L, 122241);
    GMTrace.o(16406909288448L, 122241);
  }
  
  public static d apQ()
  {
    try
    {
      GMTrace.i(16407043506176L, 122242);
      if (kfN == null) {
        kfN = new d();
      }
      d locald = kfN;
      GMTrace.o(16407043506176L, 122242);
      return locald;
    }
    finally {}
  }
  
  public static String apR()
  {
    GMTrace.i(16407311941632L, 122244);
    String str = h.xy().fYU + "emoji/";
    GMTrace.o(16407311941632L, 122244);
    return str;
  }
  
  public final List<String> collectStoragePaths()
  {
    GMTrace.i(16407177723904L, 122243);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "emoji/" });
    GMTrace.o(16407177723904L, 122243);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */