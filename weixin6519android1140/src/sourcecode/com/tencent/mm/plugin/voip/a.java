package com.tencent.mm.plugin.voip;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.a;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.plugin.voip.model.e;
import com.tencent.mm.plugin.voip.model.i.a;
import com.tencent.mm.plugin.voip.model.l;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.n;
import com.tencent.mm.plugin.voip.model.o;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.bph;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a
  extends com.tencent.mm.sdk.b.c<si>
{
  public a()
  {
    GMTrace.i(5396894842880L, 40210);
    this.vhf = si.class.getName().hashCode();
    GMTrace.o(5396894842880L, 40210);
  }
  
  private static boolean a(si paramsi)
  {
    boolean bool = true;
    int i = 1;
    int j = 1;
    GMTrace.i(5397029060608L, 40211);
    if ((paramsi instanceof si))
    {
      if (!at.AU())
      {
        GMTrace.o(5397029060608L, 40211);
        return false;
      }
      switch (paramsi.eXf.eHJ)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(5397029060608L, 40211);
      return false;
      paramsi.eXg.eXh = d.btG().ewE;
      continue;
      if (com.tencent.mm.p.a.vq())
      {
        com.tencent.mm.ui.base.h.h(paramsi.eXf.context, R.l.dJT, R.l.cUG);
      }
      else if (paramsi.eXf.eXa == 2)
      {
        l.ay(paramsi.eXf.context, paramsi.eXf.eDs);
      }
      else if (paramsi.eXf.eXa == 3)
      {
        l.az(paramsi.eXf.context, paramsi.eXf.eDs);
      }
      else if (paramsi.eXf.eXa == 4)
      {
        l.aA(paramsi.eXf.context, paramsi.eXf.eDs);
        continue;
        Object localObject1 = d.btG();
        Object localObject2 = paramsi.eXf.eWZ;
        if ((localObject2 != null) && (localObject2.length >= 10) && (localObject2[0] == 1))
        {
          paramsi = new byte[localObject2.length - 1];
          System.arraycopy(localObject2, 1, paramsi, 0, paramsi.length);
          localObject2 = ((m)localObject1).qIe.qDX.qFr.qKT;
          ((com.tencent.mm.plugin.voip.model.h)localObject2).qGK = System.currentTimeMillis();
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.VoipDailReport", "devin:recvInvite:" + ((com.tencent.mm.plugin.voip.model.h)localObject2).qGK);
          try
          {
            paramsi = (bph)new bph().aD(paramsi);
            w.d("MicroMsg.Voip.VoipService", "doTaskCallin in onInviteNotify");
            if (((m)localObject1).qIe.buU()) {
              break label466;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(11523, true, true, new Object[] { Integer.valueOf(paramsi.uhU), Long.valueOf(paramsi.uhV), Integer.valueOf(paramsi.uYQ), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
            ((m)localObject1).a(paramsi);
          }
          catch (IOException paramsi)
          {
            w.printErrStackTrace("MicroMsg.Voip.VoipService", paramsi, "", new Object[0]);
          }
          continue;
          label466:
          com.tencent.mm.plugin.report.service.g.ork.a(11523, true, true, new Object[] { Integer.valueOf(paramsi.uhU), Long.valueOf(paramsi.uhV), Integer.valueOf(paramsi.uYQ), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
          continue;
          d.btG();
          localObject1 = m.JO(paramsi.eXf.content);
          if (localObject1 != null) {
            if (((i.a)localObject1).bud())
            {
              paramsi.eXg.type = 2;
            }
            else
            {
              if (((i.a)localObject1).qGQ == i.a.qGW) {}
              for (i = j; i != 0; i = 0)
              {
                paramsi.eXg.type = 3;
                break;
              }
              paramsi = paramsi.eXg;
              localObject1 = d.btG();
              localObject2 = ab.getContext();
              if ((((m)localObject1).ewE) && (((m)localObject1).qIp) && (!((m)localObject1).qIq))
              {
                w.d("MicroMsg.Voip.VoipService", "isVideoCalling " + ((m)localObject1).qIg + " isAudioCalling " + ((m)localObject1).qIh);
                if (!bg.nm(((m)localObject1).eDs))
                {
                  at.AR();
                  if (com.tencent.mm.y.c.yK().TE(((m)localObject1).eDs) != null) {
                    m.a((Context)localObject2, ((m)localObject1).eDs, true, ((m)localObject1).qIg, true);
                  }
                }
              }
              for (;;)
              {
                paramsi.eXi = bool;
                break;
                bool = false;
              }
              localObject1 = d.btG();
              paramsi = paramsi.eXf.eWZ;
              if (paramsi == null)
              {
                w.d("MicroMsg.Voip.VoipService", "sidney:notify content null");
              }
              else
              {
                w.d("MicroMsg.Voip.VoipService", "voipNotify with data size:" + paramsi.length);
                j = ByteBuffer.wrap(paramsi, 0, 4).getInt();
                long l = ByteBuffer.wrap(paramsi, 4, 8).getLong();
                w.d("MicroMsg.Voip.VoipService", "voipNotify roomid:" + j + " roomkey:" + l);
                if (((m)localObject1).qIr == null)
                {
                  localObject2 = ((m)localObject1).qIe;
                  w.i("MicroMsg.Voip.VoipServiceEx", "current roomid:%d, params roomid:%d", new Object[] { Integer.valueOf(((n)localObject2).qDX.qFr.mjF), Integer.valueOf(j) });
                  if ((j != 0) && (((n)localObject2).qDX.qFr.mjF == j)) {}
                  for (;;)
                  {
                    if (i != 0) {
                      break label940;
                    }
                    w.e("MicroMsg.Voip.VoipService", "voipSyncStatus ignored , not current roomid");
                    break;
                    i = 0;
                  }
                }
                label940:
                if (paramsi.length > 12) {
                  ((m)localObject1).a(m.y(paramsi, paramsi.length - 12), j, l);
                }
                paramsi = ((m)localObject1).qIe;
                com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + " need doSync by notify, status:" + paramsi.qDX.mStatus);
                paramsi.qDX.qFu.a(null, false, 7);
                continue;
                localObject1 = d.btG();
                localObject2 = paramsi.eXf.eWZ;
                if ((!bg.bq((byte[])localObject2)) && (localObject2[0] == 3))
                {
                  try
                  {
                    w.i("MicroMsg.Voip.VoipService", "onCancelNotify");
                    paramsi = new byte[localObject2.length - 1];
                    System.arraycopy(localObject2, 1, paramsi, 0, paramsi.length);
                    localObject2 = new bph();
                    ((bph)localObject2).aD(paramsi);
                    ((m)localObject1).wq(((bph)localObject2).uhU);
                    if ((((m)localObject1).qIr != null) && (((bph)localObject2).uhU == ((m)localObject1).qIr.uhU) && (!((m)localObject1).nmC.bQn()))
                    {
                      ((m)localObject1).qIr = null;
                      ((m)localObject1).qIs = 0L;
                      ((m)localObject1).nmC.stopTimer();
                    }
                    paramsi = ((m)localObject1).qIe;
                    w.i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, roomId: %s", new Object[] { Integer.valueOf(((bph)localObject2).uhU) });
                    if ((paramsi.qDX.qFw == null) || (((bph)localObject2).uhU != paramsi.qDX.qFw.uhU)) {
                      continue;
                    }
                    paramsi.buZ();
                    paramsi.qDX.shutdown();
                  }
                  catch (Exception paramsi)
                  {
                    w.e("MicroMsg.Voip.VoipService", "onCancelNotify error: %s", new Object[] { paramsi.getMessage() });
                  }
                  continue;
                  localObject1 = d.btG();
                  localObject2 = paramsi.eXf.eWZ;
                  if ((!bg.bq((byte[])localObject2)) && (localObject2[0] == 2))
                  {
                    try
                    {
                      w.i("MicroMsg.Voip.VoipService", "onAnswerNotify");
                      paramsi = new byte[localObject2.length - 1];
                      System.arraycopy(localObject2, 1, paramsi, 0, paramsi.length);
                      localObject2 = new bph();
                      ((bph)localObject2).aD(paramsi);
                      paramsi = ((m)localObject1).qIe;
                      w.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, roomId: %s", new Object[] { Integer.valueOf(((bph)localObject2).uhU) });
                      if (((bph)localObject2).uhU != paramsi.qDX.qFw.uhU) {
                        continue;
                      }
                      if (!paramsi.qDX.eQN) {
                        break label1425;
                      }
                      w.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, already accept, ignore it");
                    }
                    catch (Exception paramsi)
                    {
                      w.e("MicroMsg.Voip.VoipService", "onAnswerNotify error: %s", new Object[] { paramsi.getMessage() });
                    }
                    continue;
                    label1425:
                    w.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, not accept, hangout");
                    paramsi.buZ();
                    paramsi.qDX.shutdown();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */