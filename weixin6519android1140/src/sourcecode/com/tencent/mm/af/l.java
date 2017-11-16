package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.storage.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class l
  implements o, b, d
{
  private com.tencent.mm.storage.o gxo;
  private p gxp;
  
  public l()
  {
    GMTrace.i(14586782679040L, 108680);
    GMTrace.o(14586782679040L, 108680);
  }
  
  public final List<String> collectStoragePaths()
  {
    GMTrace.i(14587990638592L, 108689);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "brandicon/" });
    GMTrace.o(14587990638592L, 108689);
    return localLinkedList;
  }
  
  public final void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(14587856420864L, 108688);
    GMTrace.o(14587856420864L, 108688);
  }
  
  public final void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(14587453767680L, 108685);
    paramg1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf();
    paramg2 = new com.tencent.mm.storage.o(paramg1);
    this.gxo = paramg2;
    paramg1.a(paramg2);
    this.gxp = new p(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP());
    GMTrace.o(14587453767680L, 108685);
  }
  
  public final com.tencent.mm.storage.o yN()
  {
    GMTrace.i(14586916896768L, 108681);
    com.tencent.mm.storage.o localo = this.gxo;
    GMTrace.o(14586916896768L, 108681);
    return localo;
  }
  
  public final p yO()
  {
    GMTrace.i(14587051114496L, 108682);
    p localp = this.gxp;
    GMTrace.o(14587051114496L, 108682);
    return localp;
  }
  
  public final String zh()
  {
    GMTrace.i(14587185332224L, 108683);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "brandicon/";
    GMTrace.o(14587185332224L, 108683);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\af\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */