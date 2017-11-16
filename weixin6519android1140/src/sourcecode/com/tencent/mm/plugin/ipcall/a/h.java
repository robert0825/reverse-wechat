package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ie;
import com.tencent.mm.g.a.ie.a;
import com.tencent.mm.protocal.c.ava;
import com.tencent.mm.protocal.c.avj;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
  extends c<ie>
{
  public a mjd;
  
  public h()
  {
    GMTrace.i(11572118290432L, 86219);
    this.vhf = ie.class.getName().hashCode();
    GMTrace.o(11572118290432L, 86219);
  }
  
  private boolean a(ie paramie)
  {
    GMTrace.i(11572252508160L, 86220);
    if ((paramie instanceof ie))
    {
      paramie = paramie.eLF.eLG;
      if ((paramie == null) || (paramie.length <= 0))
      {
        GMTrace.o(11572252508160L, 86220);
        return false;
      }
      if (paramie[0] == 101)
      {
        Object localObject = new byte[paramie.length - 1];
        System.arraycopy(paramie, 1, localObject, 0, localObject.length);
        try
        {
          paramie = (ava)new ava().aD((byte[])localObject);
          w.d("MicroMsg.IPCallSvrNotifyListener", "roomId: %d, roomKey: %d, DtmfPayloadType: %d", new Object[] { Integer.valueOf(paramie.uhU), Long.valueOf(paramie.uhV), Integer.valueOf(paramie.mka) });
          localObject = paramie.uKw;
          if (localObject != null)
          {
            localObject = ((LinkedList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              avj localavj = (avj)((Iterator)localObject).next();
              w.d("MicroMsg.IPCallSvrNotifyListener", "userstatus: %d, userstatusKey: %d, memberId: %d", new Object[] { Integer.valueOf(localavj.uJk), Integer.valueOf(localavj.uKG), Integer.valueOf(localavj.uKF) });
              continue;
              GMTrace.o(11572252508160L, 86220);
            }
          }
        }
        catch (Exception paramie)
        {
          w.e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", new Object[] { paramie.getMessage() });
        }
      }
    }
    for (;;)
    {
      return false;
      if (this.mjd != null) {
        this.mjd.a(paramie);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(ava paramava);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */