package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.sns.model.a;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfv;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bt.a;
import java.math.BigInteger;

public final class l
  implements bt.a
{
  public l()
  {
    GMTrace.i(8804414521344L, 65598);
    GMTrace.o(8804414521344L, 65598);
  }
  
  private static String Q(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8804682956800L, 65600);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3)))
    {
      GMTrace.o(8804682956800L, 65600);
      return "";
    }
    int j = paramString1.indexOf(paramString2);
    if (j >= 0) {}
    for (int i = paramString1.indexOf(paramString3); (j >= 0) && (i > j); i = -1)
    {
      paramString1 = paramString1.substring(j, i + paramString3.length());
      GMTrace.o(8804682956800L, 65600);
      return paramString1;
    }
    GMTrace.o(8804682956800L, 65600);
    return "";
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(8804548739072L, 65599);
    if ((parama == null) || (parama.gtM == null) || (parama.gtM.tPY == null))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv null msg");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    Object localObject2 = n.a(parama.gtM.tPY);
    w.d("MicroMsg.SimpleExperimentLsn", "recv addMsg " + (String)localObject2);
    parama = Q((String)localObject2, "<TimelineObject", "</TimelineObject>");
    if (bg.nm(parama))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    Object localObject1 = Q((String)localObject2, "<RecXml", "</RecXml>");
    if (bg.nm((String)localObject1))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    Object localObject3 = Q((String)localObject2, "<ADInfo", "</ADInfo>");
    if (bg.nm((String)localObject3))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    localObject2 = e.lz(parama);
    axs localaxs = new axs();
    localaxs.uMo = n.ni((String)localObject3);
    localObject3 = new bfv();
    localaxs.uMn = ((bfv)localObject3);
    ((bfv)localObject3).uRF = n.ni((String)localObject1);
    localObject1 = new bfh();
    ((bfh)localObject1).tXT = new BigInteger(((biz)localObject2).mmR).longValue();
    ((bfh)localObject1).nFd = ((biz)localObject2).nFd;
    ((bfh)localObject1).tRz = ((biz)localObject2).jhi;
    ((bfh)localObject1).uQM = n.H(parama.getBytes());
    ((bfv)localObject3).uQe = ((bfh)localObject1);
    a.b(localaxs);
    GMTrace.o(8804548739072L, 65599);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */