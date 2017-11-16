package com.tencent.mm.plugin.voip_cs.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sg;
import com.tencent.mm.g.a.sg.a;
import com.tencent.mm.plugin.voip_cs.b.b;
import com.tencent.mm.plugin.voip_cs.b.d;
import com.tencent.mm.protocal.c.boq;
import com.tencent.mm.protocal.c.box;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.IOException;

public final class a
  extends c<sg>
{
  public a()
  {
    GMTrace.i(11282879086592L, 84064);
    this.vhf = sg.class.getName().hashCode();
    GMTrace.o(11282879086592L, 84064);
  }
  
  private static boolean a(sg paramsg)
  {
    GMTrace.i(11283013304320L, 84065);
    d locald;
    Object localObject;
    if ((paramsg instanceof sg))
    {
      if (!at.AU())
      {
        GMTrace.o(11283013304320L, 84065);
        return false;
      }
      locald = b.bwp();
      localObject = paramsg.eWY.eWZ;
      if ((localObject != null) && (localObject.length != 0))
      {
        paramsg = new byte[localObject.length - 1];
        System.arraycopy(localObject, 1, paramsg, 0, paramsg.length);
        localObject = new boq();
      }
    }
    try
    {
      ((boq)localObject).aD(paramsg);
      w.i("MicroMsg.voipcs.VoipCSService", "notify status = " + ((boq)localObject).uYK + ",notifySeq = " + locald.qRV);
      paramsg = new box();
      paramsg.uYy = ((boq)localObject).uYy;
      paramsg.uhV = ((boq)localObject).uhV;
      paramsg.uYI = ((boq)localObject).uYI;
      paramsg.uYK = ((boq)localObject).uYK;
      paramsg.uYL = ((boq)localObject).uYL;
      paramsg.uYM = ((boq)localObject).uYM;
      paramsg.uYJ = ((boq)localObject).uYJ;
      locald.a(paramsg);
      GMTrace.o(11283013304320L, 84065);
      return false;
    }
    catch (IOException paramsg)
    {
      for (;;)
      {
        w.e("MicroMsg.voipcs.VoipCSService", "csNotify.parseFrom content error!", new Object[] { paramsg });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */