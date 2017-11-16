package com.tencent.mm.plugin.i.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(20661074395136L, 153937);
    GMTrace.o(20661074395136L, 153937);
  }
  
  protected final List<com.tencent.mm.plugin.i.b.a> I(au paramau)
  {
    GMTrace.i(20661208612864L, 153938);
    if (paramau == null)
    {
      GMTrace.o(20661208612864L, 153938);
      return null;
    }
    com.tencent.mm.ao.d locald = n.IZ().n(paramau);
    if ((locald == null) || (locald.gGR == 0L))
    {
      w.w("MicroMsg.ImageMsgHandler", "%s can not get imgInfo", new Object[] { aiJ() });
      GMTrace.o(20661208612864L, 153938);
      return null;
    }
    String str2 = n.IZ().l(locald.gGS, "", "");
    long l5 = e.aY(str2);
    String str1 = n.IZ().l(locald.gGU, "", "");
    long l6 = e.aY(str1);
    Object localObject7 = n.IZ().l(locald.gGU, "", "") + "hd";
    long l7 = e.aY((String)localObject7);
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    long l2 = 0L;
    long l1 = 0L;
    long l4 = l2;
    long l3 = l1;
    Object localObject3 = localObject6;
    Object localObject2 = localObject5;
    Object localObject1 = localObject4;
    if (locald.II())
    {
      locald = n.IZ().gr(locald.gHb);
      l4 = l2;
      l3 = l1;
      localObject3 = localObject6;
      localObject2 = localObject5;
      localObject1 = localObject4;
      if (locald != null)
      {
        localObject6 = n.IZ().l(locald.gGS, "", "");
        if (!bg.eW((String)localObject6, str2)) {
          l2 = e.aY((String)localObject6);
        }
        localObject4 = n.IZ().l(locald.gGU, "", "");
        if (!bg.eW((String)localObject4, str1)) {
          l1 = e.aY((String)localObject4);
        }
        localObject5 = n.IZ().l(locald.gGU, "", "") + "hd";
        l4 = l2;
        l3 = l1;
        localObject3 = localObject5;
        localObject2 = localObject4;
        localObject1 = localObject6;
        if (!bg.eW((String)localObject5, (String)localObject7))
        {
          l4 = e.aY((String)localObject5);
          l3 = l2;
          l2 = l4;
          localObject1 = localObject6;
          localObject2 = localObject4;
          localObject3 = localObject5;
        }
      }
    }
    for (;;)
    {
      localObject4 = J(paramau);
      ((com.tencent.mm.plugin.i.b.a)localObject4).field_msgSubType = 20;
      ((com.tencent.mm.plugin.i.b.a)localObject4).field_path = tH(str2);
      ((com.tencent.mm.plugin.i.b.a)localObject4).field_size = l5;
      localObject5 = J(paramau);
      ((com.tencent.mm.plugin.i.b.a)localObject5).field_msgSubType = 21;
      ((com.tencent.mm.plugin.i.b.a)localObject5).field_path = tH(str1);
      ((com.tencent.mm.plugin.i.b.a)localObject5).field_size = l6;
      localObject6 = J(paramau);
      ((com.tencent.mm.plugin.i.b.a)localObject6).field_msgSubType = 22;
      ((com.tencent.mm.plugin.i.b.a)localObject6).field_path = tH((String)localObject7);
      ((com.tencent.mm.plugin.i.b.a)localObject6).field_size = l7;
      localObject7 = J(paramau);
      ((com.tencent.mm.plugin.i.b.a)localObject7).field_msgSubType = 23;
      ((com.tencent.mm.plugin.i.b.a)localObject7).field_path = tH((String)localObject1);
      ((com.tencent.mm.plugin.i.b.a)localObject7).field_size = l3;
      localObject1 = J(paramau);
      ((com.tencent.mm.plugin.i.b.a)localObject1).field_msgSubType = 24;
      ((com.tencent.mm.plugin.i.b.a)localObject1).field_path = tH((String)localObject2);
      ((com.tencent.mm.plugin.i.b.a)localObject1).field_size = l1;
      paramau = J(paramau);
      paramau.field_msgSubType = 25;
      paramau.field_path = tH((String)localObject3);
      paramau.field_size = l2;
      w.i("MicroMsg.ImageMsgHandler", "%s create image wx file index bigItem[%s] thumb[%s][%s] hd[%s %s %s]", new Object[] { aiJ(), localObject4, localObject5, localObject6, localObject7, localObject1, paramau });
      localObject2 = new ArrayList();
      ((List)localObject2).add(localObject4);
      ((List)localObject2).add(localObject5);
      ((List)localObject2).add(localObject6);
      ((List)localObject2).add(localObject7);
      ((List)localObject2).add(localObject1);
      ((List)localObject2).add(paramau);
      GMTrace.o(20661208612864L, 153938);
      return (List<com.tencent.mm.plugin.i.b.a>)localObject2;
      l2 = 0L;
      l1 = l3;
      l3 = l4;
    }
  }
  
  protected final String aiJ()
  {
    GMTrace.i(20661342830592L, 153939);
    String str = "image_" + hashCode();
    GMTrace.o(20661342830592L, 153939);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */