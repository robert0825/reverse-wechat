package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.e.e;
import com.tencent.mm.plugin.exdevice.service.p;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import junit.framework.Assert;

public class a
  implements c
{
  private long kCF;
  protected com.tencent.mm.plugin.exdevice.b.c kDM;
  protected d kDN;
  private m kDO;
  
  public a(com.tencent.mm.plugin.exdevice.b.c paramc, d paramd)
  {
    GMTrace.i(11120609853440L, 82855);
    this.kDM = null;
    this.kDN = null;
    this.kCF = -1L;
    this.kDO = null;
    this.kDM = paramc;
    this.kDN = paramd;
    GMTrace.o(11120609853440L, 82855);
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(11121012506624L, 82858);
    w.i("MicroMsg.exdevice.ExDeviceTask", "------onTaskEnd------ taskId = %d, errType = %d, errCode = %d, errMsg = %s, deviceId = %d, reqCmdId = %d, respCmdId = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Long.valueOf(this.kDM.joF), Short.valueOf(this.kDM.atn()), Short.valueOf(this.kDM.kwR) });
    long l = this.kDM.joF;
    if (paramInt1 == 0) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.exdevice.g.a.k(l, i);
      if ((paramp == null) || (paramp == this.kDO)) {
        break;
      }
      w.e("MicroMsg.exdevice.ExDeviceTask", "netCmd != mRemoteTask");
      GMTrace.o(11121012506624L, 82858);
      return;
    }
    if ((-1 == paramInt1) && (-2 == paramInt2)) {
      w.e("MicroMsg.exdevice.ExDeviceTask", "Time Out in local!!!");
    }
    if (this.kDM.kwS != null)
    {
      i = this.kDM.kwS.kBk;
      if ((-5 == i) || (-3 == i) || (-4 == i))
      {
        w.w("MicroMsg.exdevice.ExDeviceTask", "ErrorCode = %d, destroy channel(deviceId = %d)", new Object[] { Integer.valueOf(this.kDM.kwS.kBk), Long.valueOf(this.kDM.joF) });
        if ((u.aut().kxo == null) || (!u.aut().kxo.bN(this.kDM.joF))) {
          break label335;
        }
      }
    }
    label335:
    for (i = 1;; i = 0)
    {
      if (i == 0) {
        w.e("MicroMsg.exdevice.ExDeviceTask", "stopChannel Failed!!!");
      }
      if (this.kDN != null) {
        this.kDN.a(paramLong, paramInt1, paramInt2, paramString);
      }
      this.kDO = null;
      GMTrace.o(11121012506624L, 82858);
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(11120744071168L, 82856);
    this.kDN = paramd;
    GMTrace.o(11120744071168L, 82856);
  }
  
  public final boolean b(com.tencent.mm.plugin.exdevice.service.m paramm)
  {
    GMTrace.i(11120878288896L, 82857);
    if (paramm == null)
    {
      w.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher is null");
      GMTrace.o(11120878288896L, 82857);
      return false;
    }
    if (this.kDO != null)
    {
      w.e("MicroMsg.exdevice.ExDeviceTask", "Prev task is still working!!!");
      GMTrace.o(11120878288896L, 82857);
      return false;
    }
    w.i("MicroMsg.exdevice.ExDeviceTask", "------startTask begin------cmdReqId = %d, cmdRespId = %d, deviceId = %d", new Object[] { Short.valueOf(this.kDM.atn()), Short.valueOf(this.kDM.kwR), Long.valueOf(this.kDM.joF) });
    m localm = new m(this.kDM, this);
    long l = paramm.a(localm);
    if (-1L == l)
    {
      w.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher.startTask Failed!!!");
      GMTrace.o(11120878288896L, 82857);
      return false;
    }
    this.kDO = localm;
    this.kCF = l;
    paramm = this.kDO;
    Assert.assertNotNull(paramm.kEj);
    paramm = paramm.kEj;
    paramm.kEc = false;
    paramm.kEd = false;
    at.xB().bQi().postDelayed(paramm.kEe, 15000L);
    GMTrace.o(11120878288896L, 82857);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */