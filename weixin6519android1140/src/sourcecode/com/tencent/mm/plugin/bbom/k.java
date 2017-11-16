package com.tencent.mm.plugin.bbom;

import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.t;
import com.tencent.mm.bm.b;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.ai;
import com.tencent.mm.g.a.fs;
import com.tencent.mm.g.a.ie;
import com.tencent.mm.g.a.ka;
import com.tencent.mm.g.a.ka.a;
import com.tencent.mm.g.a.pc;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.a.sg;
import com.tencent.mm.g.a.si;
import com.tencent.mm.modelsimple.j;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.zero.a.c;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.bbg;
import com.tencent.mm.protocal.o.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class k
  implements c
{
  public k()
  {
    GMTrace.i(8025414828032L, 59794);
    GMTrace.o(8025414828032L, 59794);
  }
  
  public final void a(NotifyReceiver.NotifyService paramNotifyService, int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    GMTrace.i(8025549045760L, 59795);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(8025549045760L, 59795);
      return;
      w.d("MicroMsg.NotifyReceiverCallbackImpl", "on direct send notify");
      paramNotifyService = new o.b();
      paramNotifyService.deviceID = p.ta();
      paramArrayOfByte2 = new t(paramNotifyService, 10);
      try
      {
        if (paramArrayOfByte2.a(10, paramArrayOfByte1, null)) {
          at.wS().a(0, 0, "", new j(paramNotifyService));
        }
        GMTrace.o(8025549045760L, 59795);
        return;
      }
      catch (RemoteException paramNotifyService)
      {
        w.printErrStackTrace("MicroMsg.NotifyReceiverCallbackImpl", paramNotifyService, "", new Object[0]);
        GMTrace.o(8025549045760L, 59795);
        return;
      }
      NotifyReceiver.NotifyService.dn("NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
      paramNotifyService = new rb();
      paramNotifyService.eVS.eVU = true;
      a.vgX.m(paramNotifyService);
      paramNotifyService = paramNotifyService.eVT.eVW;
      if (!bg.nm(paramNotifyService))
      {
        w.v("MicroMsg.NotifyReceiverCallbackImpl", "voipinvite, exit talkroom first: " + paramNotifyService);
        paramNotifyService = new rb();
        paramNotifyService.eVS.eVV = true;
        a.vgX.m(paramNotifyService);
      }
      if ((paramArrayOfByte1 != null) && (paramArrayOfByte1.length > 0))
      {
        if (paramArrayOfByte1[0] == 1)
        {
          w.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify case MM_VOIP_PUSHTYPE_INVITE, will launch voipUI");
          paramNotifyService = new si();
          paramNotifyService.eXf.eHJ = 3;
          paramNotifyService.eXf.eWZ = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
        }
        if (paramArrayOfByte1[0] == 101)
        {
          w.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify case MM_PSTN_PUSHTYPE_INVITE");
          paramNotifyService = new ie();
          paramNotifyService.eLF.eLG = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
        }
        if (paramArrayOfByte1[0] == 3)
        {
          w.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify, MM_VOIP_PUSHTYPE_CANCEL");
          paramNotifyService = new si();
          paramNotifyService.eXf.eHJ = 9;
          paramNotifyService.eXf.eWZ = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
        }
        if (paramArrayOfByte1[0] == 2)
        {
          w.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify, MM_VOIP_PUSHTYPE_ANSWERED");
          paramNotifyService = new si();
          paramNotifyService.eXf.eHJ = 10;
          paramNotifyService.eXf.eWZ = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
        }
        if (paramArrayOfByte1[0] == 102)
        {
          w.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify, MM_VOIP_PUSHTYPE_ANSWERED");
          paramNotifyService = new sg();
          paramNotifyService.eWY.eWZ = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
          w.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MMFunc_VoipSync do VoipSync");
          paramNotifyService = new si();
          paramNotifyService.eXf.eHJ = 6;
          paramNotifyService.eXf.eWZ = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
          w.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MM_VOIP_CS_PUSHTYPE_SYN do VoipSync");
          GMTrace.o(8025549045760L, 59795);
          return;
          paramNotifyService = new fs();
          paramNotifyService.eIm.eIn = paramArrayOfByte1;
          a.vgX.m(paramNotifyService);
          GMTrace.o(8025549045760L, 59795);
          return;
          NotifyReceiver.NotifyService.dn("NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
          if (!bg.bq(paramArrayOfByte1))
          {
            paramNotifyService = new String(paramArrayOfByte1);
            paramArrayOfByte1 = new ai();
            paramArrayOfByte1.eBo.type = 4;
            paramArrayOfByte1.eBo.eBq = paramNotifyService;
            a.vgX.m(paramArrayOfByte1);
            GMTrace.o(8025549045760L, 59795);
            return;
            w.i("MicroMsg.NotifyReceiverCallbackImpl", "jacks do voice notify UI");
            if (paramArrayOfByte1.length >= 8)
            {
              paramNotifyService = new byte[4];
              paramArrayOfByte2 = new byte[4];
              System.arraycopy(paramArrayOfByte1, 0, paramNotifyService, 0, 4);
              System.arraycopy(paramArrayOfByte1, 4, paramArrayOfByte2, 0, 4);
              paramArrayOfByte1 = new ka();
              paramArrayOfByte1.eOo.eOp = com.tencent.mm.a.n.c(paramNotifyService, 0);
              paramArrayOfByte1.eOo.eOq = com.tencent.mm.a.n.c(paramArrayOfByte2, 0);
              w.i("MicroMsg.NotifyReceiverCallbackImpl", "notifyId: %d, sequence: %d", new Object[] { Integer.valueOf(paramArrayOfByte1.eOo.eOp), Integer.valueOf(paramArrayOfByte1.eOo.eOq) });
              a.vgX.m(paramArrayOfByte1);
            }
            GMTrace.o(8025549045760L, 59795);
            return;
            if (paramArrayOfByte1 == null)
            {
              paramInt = -1;
              w.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY notify respBuf len[%d]", new Object[] { Integer.valueOf(paramInt) });
              d.oqe.a(403L, 38L, 1L, false);
              if (paramArrayOfByte1 == null) {
                break label1111;
              }
            }
            label1111:
            for (paramNotifyService = new bbg();; paramNotifyService = null)
            {
              try
              {
                paramNotifyService.aD(paramArrayOfByte1);
                w.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", new Object[] { Integer.valueOf(paramNotifyService.uOy), Integer.valueOf(paramNotifyService.uOz), Integer.valueOf(paramNotifyService.uOA), Integer.valueOf(paramNotifyService.uOB), Integer.valueOf(paramNotifyService.uOC), Integer.valueOf(paramNotifyService.uOD) });
                paramNotifyService = MMProtocalJni.decodeSecureNotifyData(paramArrayOfByte2, paramNotifyService.uOy, paramNotifyService.uOz, paramNotifyService.uOA, paramNotifyService.uOB, paramNotifyService.uOC, paramNotifyService.uOD, paramNotifyService.uOE, paramNotifyService.ugp.tJp);
                if (paramNotifyService == null) {
                  break label1116;
                }
                w.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data len:%d", new Object[] { Integer.valueOf(paramNotifyService.length) });
                paramArrayOfByte1 = new pc();
                paramArrayOfByte1.eUc.data = paramNotifyService;
                a.vgX.m(paramArrayOfByte1);
                GMTrace.o(8025549045760L, 59795);
                return;
              }
              catch (Exception paramNotifyService)
              {
                w.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData parseFrom e: " + paramNotifyService.getMessage());
                d.oqe.a(403L, 39L, 1L, false);
              }
              paramInt = paramArrayOfByte1.length;
              break;
            }
            label1116:
            w.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data is null");
            d.oqe.a(403L, 40L, 1L, false);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */