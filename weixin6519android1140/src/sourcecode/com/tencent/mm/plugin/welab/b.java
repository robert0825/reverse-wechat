package com.tencent.mm.plugin.welab;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final b saJ;
  public c rBn;
  public com.tencent.mm.plugin.welab.c.a saK;
  public Map<String, com.tencent.mm.plugin.welab.a.a.b> saL;
  public com.tencent.mm.plugin.welab.a.a.b saM;
  
  static
  {
    GMTrace.i(15679986073600L, 116825);
    saJ = new b();
    GMTrace.o(15679986073600L, 116825);
  }
  
  public b()
  {
    GMTrace.i(15679449202688L, 116821);
    this.saL = new HashMap();
    c.a locala = new c.a();
    locala.gKC = true;
    locala.gKB = true;
    this.rBn = locala.Jn();
    GMTrace.o(15679449202688L, 116821);
  }
  
  public static void E(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(16004390322176L, 119242);
    f.F(paramBoolean1, paramBoolean2);
    GMTrace.o(16004390322176L, 119242);
  }
  
  private com.tencent.mm.plugin.welab.a.a.b Nk(String paramString)
  {
    GMTrace.i(17767608614912L, 132379);
    paramString = (com.tencent.mm.plugin.welab.a.a.b)this.saL.get(paramString);
    GMTrace.o(17767608614912L, 132379);
    return paramString;
  }
  
  public static String a(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    GMTrace.i(17767340179456L, 132377);
    String str = "";
    Object localObject = saJ.Nk(parama.field_LabsAppId);
    if (localObject != null)
    {
      str = parama.field_LabsAppId;
      str = ((com.tencent.mm.plugin.welab.a.a.b)localObject).bGC();
      w.i("WelabMgr", "get appName from opener , appid %s, appName %s", new Object[] { parama.field_LabsAppId, str });
    }
    localObject = str;
    if (TextUtils.isEmpty(str)) {
      localObject = parama.Ns("field_Title");
    }
    GMTrace.o(17767340179456L, 132377);
    return (String)localObject;
  }
  
  public static String b(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    GMTrace.i(17767474397184L, 132378);
    String str = "";
    Object localObject = saJ.Nk(parama.field_LabsAppId);
    if (localObject != null)
    {
      str = parama.field_LabsAppId;
      str = ((com.tencent.mm.plugin.welab.a.a.b)localObject).bGB();
      w.i("WelabMgr", "get icon url from opener , appid %s, url %s", new Object[] { parama.field_LabsAppId, str });
    }
    localObject = str;
    if (TextUtils.isEmpty(str)) {
      localObject = parama.field_Icon;
    }
    GMTrace.o(17767474397184L, 132378);
    return (String)localObject;
  }
  
  public static b bGu()
  {
    GMTrace.i(15679583420416L, 116822);
    b localb = saJ;
    GMTrace.o(15679583420416L, 116822);
    return localb;
  }
  
  public final com.tencent.mm.plugin.welab.c.a.a Nl(String paramString)
  {
    GMTrace.i(15679851855872L, 116824);
    com.tencent.mm.plugin.welab.c.a locala = this.saK;
    com.tencent.mm.plugin.welab.c.a.a locala1 = new com.tencent.mm.plugin.welab.c.a.a();
    locala1.field_LabsAppId = paramString;
    locala.b(locala1, new String[0]);
    GMTrace.o(15679851855872L, 116824);
    return locala1;
  }
  
  public final List<com.tencent.mm.plugin.welab.c.a.a> bGv()
  {
    GMTrace.i(16420062625792L, 122339);
    List localList = this.saK.bGD();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)localIterator.next();
      if ((!locala.isRunning()) || ((locala.field_Switch != 2) && (locala.field_Switch != 1))) {
        localIterator.remove();
      }
    }
    GMTrace.o(16420062625792L, 122339);
    return localList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */