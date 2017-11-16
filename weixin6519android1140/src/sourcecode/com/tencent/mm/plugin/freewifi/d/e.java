package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.un;
import com.tencent.mm.protocal.c.uo;
import com.tencent.mm.protocal.c.up;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class e
  extends c
{
  public e(LinkedList<un> paramLinkedList)
  {
    GMTrace.i(7251381190656L, 54027);
    aBl();
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0)) {
      ((uo)this.fUa.gtC.gtK).umR = paramLinkedList;
    }
    GMTrace.o(7251381190656L, 54027);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7251112755200L, 54025);
    b.a locala = new b.a();
    locala.gtF = new uo();
    locala.gtG = new up();
    locala.uri = "/cgi-bin/mmo2o-bin/freewifireport";
    locala.gtE = 1781;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7251112755200L, 54025);
  }
  
  public final LinkedList<un> aBu()
  {
    GMTrace.i(7251649626112L, 54029);
    Object localObject = (up)this.fUa.gtD.gtK;
    if (localObject == null)
    {
      GMTrace.o(7251649626112L, 54029);
      return null;
    }
    localObject = ((up)localObject).umR;
    GMTrace.o(7251649626112L, 54029);
    return (LinkedList<un>)localObject;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7251515408384L, 54028);
    w.i("MicroMsg.FreeWifi.NetSceneFreeWifiReport", "doBeforeCallback. netId=%d, errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (m.cf(paramInt2, paramInt3)) {
      j.aBi().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7252454932480L, 54035);
          Object localObject = (up)e.this.fUa.gtD.gtK;
          if (localObject == null)
          {
            GMTrace.o(7252454932480L, 54035);
            return;
          }
          localObject = ((up)localObject).umR;
          GMTrace.o(7252454932480L, 54035);
        }
      });
    }
    GMTrace.o(7251515408384L, 54028);
  }
  
  public final int getType()
  {
    GMTrace.i(15395578707968L, 114706);
    GMTrace.o(15395578707968L, 114706);
    return 1781;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */