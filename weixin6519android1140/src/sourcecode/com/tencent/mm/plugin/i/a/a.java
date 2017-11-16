package com.tencent.mm.plugin.i.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  public a()
  {
    GMTrace.i(20659732217856L, 153927);
    GMTrace.o(20659732217856L, 153927);
  }
  
  protected static com.tencent.mm.plugin.i.b.a J(au paramau)
  {
    GMTrace.i(20660269088768L, 153931);
    com.tencent.mm.plugin.i.b.a locala = new com.tencent.mm.plugin.i.b.a();
    locala.field_msgId = paramau.field_msgId;
    locala.field_msgType = paramau.field_type;
    locala.field_username = paramau.field_talker;
    locala.field_msgtime = paramau.field_createTime;
    GMTrace.o(20660269088768L, 153931);
    return locala;
  }
  
  private static int a(List<com.tencent.mm.plugin.i.b.a> paramList1, List<com.tencent.mm.plugin.i.b.a> paramList2, List<com.tencent.mm.plugin.i.b.a> paramList3, List<com.tencent.mm.plugin.i.b.a> paramList4)
  {
    GMTrace.i(20660134871040L, 153930);
    if ((paramList2 == null) || (paramList2.isEmpty()))
    {
      GMTrace.o(20660134871040L, 153930);
      return -1;
    }
    if ((paramList1 == null) || (paramList1.isEmpty()))
    {
      paramList1 = paramList2.iterator();
      while (paramList1.hasNext()) {
        paramList3.add((com.tencent.mm.plugin.i.b.a)paramList1.next());
      }
      GMTrace.o(20660134871040L, 153930);
      return 0;
    }
    int k = paramList1.size();
    int m = paramList2.size();
    int i = 0;
    int j = 0;
    while (i < m)
    {
      com.tencent.mm.plugin.i.b.a locala2 = (com.tencent.mm.plugin.i.b.a)paramList2.get(i);
      if (locala2 == null) {
        break;
      }
      com.tencent.mm.plugin.i.b.a locala1;
      if (j < k)
      {
        locala1 = (com.tencent.mm.plugin.i.b.a)paramList1.get(j);
        label156:
        if (locala1 == null) {
          break;
        }
        if (locala2.field_msgSubType != locala1.field_msgSubType) {
          break label268;
        }
        if (bg.eW(locala2.field_path, locala1.field_path)) {
          break label230;
        }
        locala2.vmr = locala1.vmr;
        paramList4.add(locala2);
      }
      for (;;)
      {
        i += 1;
        j += 1;
        break;
        locala1 = null;
        break label156;
        label230:
        if (!bg.B(locala2.field_size, locala1.field_size))
        {
          locala2.vmr = locala1.vmr;
          paramList4.add(locala2);
        }
      }
      label268:
      if (locala2.field_msgSubType >= locala1.field_msgSubType) {
        break;
      }
      paramList3.add(locala2);
      i += 1;
    }
    GMTrace.o(20660134871040L, 153930);
    return 1;
  }
  
  public final void H(au paramau)
  {
    int j = 0;
    GMTrace.i(20659866435584L, 153928);
    if (paramau == null)
    {
      GMTrace.o(20659866435584L, 153928);
      return;
    }
    List localList = com.tencent.mm.plugin.i.b.aiA().aiB().K(paramau);
    paramau = I(paramau);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int k = a(localList, paramau, localArrayList1, localArrayList2);
    String str = aiJ();
    if (localList != null) {}
    for (int i = localList.size();; i = 0)
    {
      if (paramau != null) {
        j = paramau.size();
      }
      w.i("MicroMsg.AbstractMsgHandler", "%s handle compare[%d] db[%d] create[%d] insert[%d] update[%d]", new Object[] { str, Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localArrayList1.size()), Integer.valueOf(localArrayList2.size()) });
      if (k >= 0)
      {
        if (!localArrayList1.isEmpty()) {
          com.tencent.mm.plugin.i.b.aiA().aiB().Z(localArrayList1);
        }
        if (!localArrayList2.isEmpty()) {
          com.tencent.mm.plugin.i.b.aiA().aiB().aa(localArrayList2);
        }
      }
      GMTrace.o(20659866435584L, 153928);
      return;
    }
  }
  
  protected abstract List<com.tencent.mm.plugin.i.b.a> I(au paramau);
  
  protected abstract String aiJ();
  
  protected final String tH(String paramString)
  {
    GMTrace.i(20660403306496L, 153932);
    if (bg.nm(paramString))
    {
      GMTrace.o(20660403306496L, 153932);
      return "";
    }
    String str1 = h.xy().fYT;
    int i = paramString.indexOf(str1);
    if (i < 0)
    {
      GMTrace.o(20660403306496L, 153932);
      return paramString;
    }
    String str2 = paramString.substring(i + str1.length());
    w.d("MicroMsg.AbstractMsgHandler", "%s cut down result[%s] root[%s] path[%s]", new Object[] { aiJ(), str2, str1, paramString });
    GMTrace.o(20660403306496L, 153932);
    return str2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */