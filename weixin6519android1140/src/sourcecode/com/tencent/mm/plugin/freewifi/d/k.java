package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.azx;
import com.tencent.mm.protocal.c.cl;
import com.tencent.mm.protocal.c.hu;
import com.tencent.mm.protocal.c.hv;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class k
  extends c
{
  public k(String paramString1, azx paramazx, int paramInt, String paramString2)
  {
    GMTrace.i(7252052279296L, 54032);
    aBl();
    if ((8 != paramInt) || (9 != paramInt)) {
      w.e("MicroMsg.FreeWifi.NetSceneScanAndReportNearFieldFreeWifi", "invalid channel, channel is :%d", new Object[] { Integer.valueOf(paramInt) });
    }
    hu localhu = (hu)this.fUa.gtC.gtK;
    localhu.tVK = paramString1;
    localhu.tWP = paramazx;
    localhu.tMZ = paramInt;
    localhu.tNa = paramString2;
    GMTrace.o(7252052279296L, 54032);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7251783843840L, 54030);
    b.a locala = new b.a();
    locala.gtF = new hu();
    locala.gtG = new hv();
    locala.uri = "/cgi-bin/mmo2o-bin/bizwificonnect";
    locala.gtE = 1705;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7251783843840L, 54030);
  }
  
  public final String aBz()
  {
    GMTrace.i(7252186497024L, 54033);
    Object localObject = ((hv)this.fUa.gtD.gtK).tWQ;
    if ((localObject != null) && (((LinkedList)localObject).size() == 1))
    {
      localObject = ((cl)((LinkedList)localObject).get(0)).tQv;
      GMTrace.o(7252186497024L, 54033);
      return (String)localObject;
    }
    GMTrace.o(7252186497024L, 54033);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(7251918061568L, 54031);
    GMTrace.o(7251918061568L, 54031);
    return 1705;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */