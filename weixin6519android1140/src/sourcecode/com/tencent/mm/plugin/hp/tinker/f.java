package com.tencent.mm.plugin.hp.tinker;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.plugin.hp.b.b;
import com.tencent.mm.protocal.c.bjb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class f
  extends com.tinkerboots.sdk.a.a.a
{
  public f()
  {
    GMTrace.i(15369808904192L, 114514);
    GMTrace.o(15369808904192L, 114514);
  }
  
  public final boolean aHv()
  {
    GMTrace.i(15369943121920L, 114515);
    boolean bool = super.aHv();
    GMTrace.o(15369943121920L, 114515);
    return bool;
  }
  
  public final void aHw()
  {
    GMTrace.i(15370211557376L, 114517);
    super.aHw();
    long l = com.tencent.mm.kernel.a.wM();
    com.tinkerboots.sdk.a locala = com.tinkerboots.sdk.a.csM().fK("uin", String.valueOf(l & 0xFFFFFFFF));
    if (am.isWifi(ab.getContext())) {}
    for (int i = 3;; i = 2)
    {
      locala.fK("network", String.valueOf(i));
      GMTrace.o(15370211557376L, 114517);
      return;
    }
  }
  
  public final void w(Map<String, String> paramMap)
  {
    GMTrace.i(15370077339648L, 114516);
    super.w(paramMap);
    b.pb(2);
    String str2 = "tinker_id_" + BaseBuildInfo.baseRevision();
    if (BaseBuildInfo.PATCH_REV == null) {}
    LinkedList localLinkedList;
    Object localObject;
    for (String str1 = "";; str1 = "tinker_id_" + BaseBuildInfo.PATCH_REV)
    {
      localLinkedList = new LinkedList();
      localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        bjb localbjb = new bjb();
        localbjb.amf = ((String)localObject);
        localbjb.value = ((String)paramMap.get(localObject));
        localLinkedList.add(localbjb);
      }
    }
    paramMap = new StringBuilder();
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      localObject = (bjb)localIterator.next();
      paramMap.append(((bjb)localObject).amf).append(":").append(((bjb)localObject).value).append("\n");
    }
    w.i("Tinker.TinkerPatchRequestCallback", "checkAvailableUpdate BaseID:%s PatchID:%s config:%s", new Object[] { str2, str1, paramMap.toString() });
    paramMap = new com.tencent.mm.plugin.hp.c.a(str2, str1, localLinkedList);
    at.wS().a(paramMap, 0);
    GMTrace.o(15370077339648L, 114516);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */