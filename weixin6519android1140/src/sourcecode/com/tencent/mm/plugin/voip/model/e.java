package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.model.a.j;
import com.tencent.mm.plugin.voip.model.a.k;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bgy;
import com.tencent.mm.protocal.c.bmx;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bpa;
import com.tencent.mm.protocal.c.bpb;
import com.tencent.mm.protocal.c.bph;
import com.tencent.mm.protocal.c.bpo;
import com.tencent.mm.protocal.c.bpr;
import com.tencent.mm.protocal.c.bqc;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public final class e
{
  public boolean eQN;
  public Context iPn;
  ae mHandler;
  public int mStatus;
  public boolean qEN;
  public boolean qEO;
  public boolean qEP;
  public boolean qEQ;
  public boolean qER;
  public boolean qES;
  public boolean qET;
  public boolean qEU;
  public bgy qEV;
  public int qEW;
  public long qEX;
  public long qEY;
  public int qEZ;
  public int qFA;
  public int qFB;
  public int qFC;
  public aj qFD;
  public Timer qFE;
  public int qFF;
  private aj qFG;
  private a qFH;
  public int qFa;
  public boolean qFb;
  public boolean qFc;
  public boolean qFd;
  public int qFe;
  int qFf;
  private int qFg;
  int qFh;
  private int qFi;
  int qFj;
  public boolean qFk;
  private boolean qFl;
  private int qFm;
  private boolean qFn;
  private int qFo;
  private int qFp;
  private int qFq;
  public v2protocal qFr;
  public p qFs;
  public g qFt;
  public o qFu;
  public byte[] qFv;
  public bph qFw;
  public boolean qFx;
  public boolean qFy;
  public int qFz;
  
  protected e()
  {
    GMTrace.i(5321330262016L, 39647);
    this.mStatus = 1;
    this.qEN = false;
    this.qEO = false;
    this.qEP = false;
    this.qEQ = false;
    this.eQN = false;
    this.qER = false;
    this.qES = false;
    this.qET = false;
    this.qEU = false;
    this.qEV = new bgy();
    this.qEW = 0;
    this.qEX = 0L;
    this.qEY = 0L;
    this.qEZ = 0;
    this.qFa = 0;
    this.qFb = false;
    this.qFc = false;
    this.qFd = false;
    this.qFe = 10;
    this.qFf = -1;
    this.qFg = -1;
    this.qFh = -1;
    this.qFi = -1;
    this.qFj = -1;
    this.qFk = false;
    this.qFl = false;
    this.qFm = 1;
    this.qFn = false;
    this.qFo = 1;
    this.qFp = -1;
    this.qFq = -1;
    this.iPn = null;
    this.qFs = p.qIS;
    this.qFv = null;
    this.qFw = null;
    this.qFx = false;
    this.qFy = false;
    this.qFz = 0;
    this.qFA = 0;
    this.qFB = 0;
    this.qFC = 0;
    this.qFD = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5247107858432L, 39094);
        w.v("MicroMsg.Voip.VoipContext", "voip repeat sync");
        e.this.qFu.a(null, false, 7);
        GMTrace.o(5247107858432L, 39094);
        return true;
      }
    }, true);
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(5287910047744L, 39398);
        if ((paramAnonymousMessage == null) || (paramAnonymousMessage.what != 59998))
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(5287910047744L, 39398);
          return;
        }
        Object localObject3;
        Object localObject1;
        int i;
        Object localObject4;
        if (paramAnonymousMessage.arg1 == 1)
        {
          if (e.this.qFr.mjF == 0)
          {
            com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "JNI_DOSYNC without roomid , igored!");
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "need dosync for cmd from channel...");
          localObject3 = (byte[])paramAnonymousMessage.obj;
          localObject1 = e.this.qFu;
          i = paramAnonymousMessage.arg2;
          paramAnonymousMessage = new bpr();
          paramAnonymousMessage.jib = 1;
          localObject4 = new azp();
          ((azp)localObject4).be((byte[])localObject3);
          paramAnonymousMessage.tTe = ((azp)localObject4);
          localObject3 = new azp();
          try
          {
            ((azp)localObject3).be(paramAnonymousMessage.toByteArray());
            paramAnonymousMessage = new bpa();
            paramAnonymousMessage.uei = i;
            paramAnonymousMessage.uej = ((azp)localObject3);
            paramAnonymousMessage.lSY = q.zE();
            localObject3 = new bpb();
            ((bpb)localObject3).jhc = 1;
            ((bpb)localObject3).jhd.add(paramAnonymousMessage);
            ((o)localObject1).a((bpb)localObject3, true, 2);
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          catch (IOException paramAnonymousMessage)
          {
            w.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramAnonymousMessage, "", new Object[0]);
            GMTrace.o(5287910047744L, 39398);
            return;
          }
        }
        if (paramAnonymousMessage.arg1 == 4)
        {
          if (e.this.qFr.mjF == 0)
          {
            com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "JNI_STARTDEVFAILED without roomid , igored!");
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "need hangUP for startTalk failed. ");
          e.this.qFr.qKT.qGe = 107;
          e.this.r(1, 56532, "");
          GMTrace.o(5287910047744L, 39398);
          return;
        }
        if (paramAnonymousMessage.arg1 == 6)
        {
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "OnChannelConnected from JNI");
          if (e.this.qFr.mjF == 0)
          {
            com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "OnChannelConnected roomid null, ignored");
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          e.this.qEO = true;
          e.this.qFr.qKT.qGu = 1;
          if ((!e.this.qEP) && (!e.this.qEQ)) {}
          for (e.this.qFr.qJT = 1;; e.this.qFr.qJT = 0)
          {
            e.this.qFr.setInactive();
            com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "Voip.Channel setInactive");
            e.this.btR();
            GMTrace.o(5287910047744L, 39398);
            return;
          }
        }
        if (paramAnonymousMessage.arg1 == 3)
        {
          e.this.mStatus = 5;
          GMTrace.o(5287910047744L, 39398);
          return;
        }
        if (paramAnonymousMessage.arg1 == 5)
        {
          com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "need hangUP for disconnect from channel..envent = " + paramAnonymousMessage.arg2);
          if (e.this.mStatus >= 5)
          {
            e.this.qFr.qKT.qGe = 108;
            if (paramAnonymousMessage.arg2 != 4) {
              break label629;
            }
            e.this.qFr.qKT.qGw = 1;
            com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "channel broken...");
          }
          for (;;)
          {
            e.this.r(1, 56536, "");
            GMTrace.o(5287910047744L, 39398);
            return;
            e.this.qFr.qKT.qGe = 106;
            break;
            label629:
            if (paramAnonymousMessage.arg2 == 1)
            {
              if (e.this.qET == true)
              {
                com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "channel connect fail while pre-connect");
                e.this.qES = true;
                GMTrace.o(5287910047744L, 39398);
                return;
              }
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "channel connect fail...");
              e.this.qEO = false;
              e.this.qFr.qKT.qGw = 5;
            }
            else if (paramAnonymousMessage.arg2 == 5)
            {
              if (e.this.qES == true)
              {
                e.this.qFr.qKT.qGw = 6;
                com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "channel network fail while pre-connect...");
                e.this.qES = true;
                GMTrace.o(5287910047744L, 39398);
                return;
              }
              com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "channel network fail");
              e.this.qFr.qKT.qGw = 6;
            }
          }
        }
        if (paramAnonymousMessage.arg1 == 100)
        {
          com.tencent.mm.plugin.voip.b.a.a((byte[])paramAnonymousMessage.obj, "MicroMsg.Voip.VoipContext", paramAnonymousMessage.arg2);
          GMTrace.o(5287910047744L, 39398);
          return;
        }
        if (paramAnonymousMessage.arg1 == 101)
        {
          com.tencent.mm.plugin.voip.b.a.a((byte[])paramAnonymousMessage.obj, "MicroMsg.v2Core", paramAnonymousMessage.arg2);
          GMTrace.o(5287910047744L, 39398);
          return;
        }
        if (paramAnonymousMessage.arg1 == 7)
        {
          localObject4 = (int[])paramAnonymousMessage.obj;
          i = paramAnonymousMessage.arg2;
          paramAnonymousMessage = null;
          try
          {
            localObject1 = ((WifiManager)ab.getContext().getSystemService("wifi")).getConnectionInfo().getSSID();
            paramAnonymousMessage = (Message)localObject1;
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "Get wifiName failed in voip speedTest!");
            }
          }
          localObject1 = null;
          try
          {
            localObject3 = ((TelephonyManager)ab.getContext().getSystemService("phone")).getSimOperatorName();
            localObject1 = localObject3;
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "Get netName failed in voip speedTest!");
            }
          }
          new j(e.this.qEY, e.this.qEX, e.this.qEZ, (String)localObject1, paramAnonymousMessage, e.this.qFa, i, (int[])localObject4).bvg();
          GMTrace.o(5287910047744L, 39398);
          return;
        }
        Object localObject2;
        if (paramAnonymousMessage.arg1 == 8)
        {
          localObject2 = (byte[])paramAnonymousMessage.obj;
          paramAnonymousMessage = e.this;
          for (;;)
          {
            try
            {
              localObject2 = (bmx)new bmx().aD((byte[])localObject2);
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "steve: onRecvRUDPCmd:" + ((bmx)localObject2).uWZ);
              i = ((bmx)localObject2).uWZ;
              switch (i)
              {
              default: 
                GMTrace.o(5287910047744L, 39398);
                return;
              }
            }
            catch (Exception paramAnonymousMessage)
            {
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
              GMTrace.o(5287910047744L, 39398);
              return;
            }
            if (((bmx)localObject2).uXa != null)
            {
              localObject2 = ((bmx)localObject2).uXa.tJp;
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "steve: remote new network type:" + localObject2);
              i = paramAnonymousMessage.qFr.setAppCmd(302, (byte[])localObject2, 4);
              if (i < 0) {
                com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type " + localObject2 + "fail:" + i + ", [roomid=" + paramAnonymousMessage.qFr.mjN + ", roomkey=" + paramAnonymousMessage.qFr.mjG + "]");
              }
              GMTrace.o(5287910047744L, 39398);
              return;
            }
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
            GMTrace.o(5287910047744L, 39398);
            return;
            if (((bmx)localObject2).uXa != null)
            {
              localObject2 = ((bmx)localObject2).uXa.tJp;
              localObject2 = (boi)new boi().aD((byte[])localObject2);
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "zhengxue: remote audio dev occupied stat :" + ((boi)localObject2).uYw);
              byte[] arrayOfByte = new byte[4];
              arrayOfByte[0] = ((byte)((boi)localObject2).uYw);
              paramAnonymousMessage.qFr.setJNIAppCmd(2, arrayOfByte, 4);
              GMTrace.o(5287910047744L, 39398);
              return;
            }
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "zhengxue:[CHANNEL]EMethod_AudioDevOccupiedStatsSync empty buffer");
          }
        }
        if (paramAnonymousMessage.arg1 == 9)
        {
          paramAnonymousMessage = e.this.qFr.qKT;
          if (0L == paramAnonymousMessage.qGI)
          {
            paramAnonymousMessage.qGI = System.currentTimeMillis();
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "first pkt received timestamp:" + paramAnonymousMessage.qGI);
          }
          com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "get first pkt for voip");
          if (1 == e.this.qFr.qKy)
          {
            paramAnonymousMessage = new bqc();
            paramAnonymousMessage.jhA = 1;
            e.this.qFu.a(paramAnonymousMessage, 2);
            GMTrace.o(5287910047744L, 39398);
          }
        }
        else
        {
          if (paramAnonymousMessage.arg1 == 11)
          {
            e.this.qFC = 2;
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          if (paramAnonymousMessage.arg1 == 12)
          {
            e.this.qFC = 1;
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          if (paramAnonymousMessage.arg1 == 13)
          {
            localObject2 = (int[])paramAnonymousMessage.obj;
            i = paramAnonymousMessage.arg2;
            new com.tencent.mm.plugin.voip.model.a.h(e.this.qFr.mjF, e.this.qFr.mjG, e.this.qFr.mjN, 1, i, (int[])localObject2).bvg();
            GMTrace.o(5287910047744L, 39398);
            return;
          }
          if (paramAnonymousMessage.arg1 == 14)
          {
            localObject2 = (int[])paramAnonymousMessage.obj;
            i = paramAnonymousMessage.arg2;
            new com.tencent.mm.plugin.voip.model.a.h(e.this.qFr.mjF, e.this.qFr.mjG, e.this.qFr.mjN, 2, i, (int[])localObject2).bvg();
          }
        }
        GMTrace.o(5287910047744L, 39398);
      }
    };
    this.qFE = null;
    this.qFF = 0;
    this.qFG = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5263750856704L, 39218);
        if (e.this.mStatus == 4)
        {
          com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "connect time out.. now finish..");
          e.this.qFr.qKT.qGe = 105;
          e.this.r(1, 56536, "");
        }
        GMTrace.o(5263750856704L, 39218);
        return false;
      }
    }, false);
    this.qFH = null;
    this.qFr = new v2protocal(this.mHandler);
    this.qFt = new g(this);
    this.qFu = new o(this);
    this.qFB = 0;
    GMTrace.o(5321330262016L, 39647);
  }
  
  private void btQ()
  {
    GMTrace.i(5323209310208L, 39661);
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "DeviceInfo.mAudioInfo.aecMode:" + com.tencent.mm.compatible.d.p.fQD.fNY);
    if (com.tencent.mm.compatible.d.p.fQD.fNB == 1) {
      this.qFr.qZ(410);
    }
    byte[] arrayOfByte1 = new byte[2];
    label128:
    byte[] arrayOfByte2;
    if (com.tencent.mm.compatible.d.p.fQD.fNY >= 0)
    {
      arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNY);
      this.qFr.setAppCmd(406, arrayOfByte1, 1);
      if (com.tencent.mm.compatible.d.p.fQD.fNZ < 0) {
        break label806;
      }
      arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNZ);
      this.qFr.setAppCmd(408, arrayOfByte1, 1);
      if (com.tencent.mm.compatible.d.p.fQD.fOb < 0) {
        break label848;
      }
      arrayOfByte2 = new byte[5];
      if ((com.tencent.mm.compatible.d.p.fQD.fOc >= 0) && (com.tencent.mm.compatible.d.p.fQD.fOd >= 0))
      {
        arrayOfByte2[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOc);
        arrayOfByte2[1] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOd);
        if (com.tencent.mm.compatible.d.p.fQD.fOe < 0) {
          break label831;
        }
        arrayOfByte2[2] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOe);
        arrayOfByte2[3] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOb);
        arrayOfByte2[4] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOf);
        this.qFr.setAppCmd(404, arrayOfByte2, 5);
      }
    }
    for (;;)
    {
      if ((com.tencent.mm.compatible.d.p.fQD.fNC >= 0) || (com.tencent.mm.compatible.d.p.fQD.fNE >= 0))
      {
        arrayOfByte1[0] = -1;
        arrayOfByte1[1] = -1;
        if (com.tencent.mm.compatible.d.p.fQD.fNC >= 0) {
          arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNC);
        }
        if (com.tencent.mm.compatible.d.p.fQD.fNE >= 0) {
          arrayOfByte1[1] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNE);
        }
        this.qFr.setAppCmd(414, arrayOfByte1, 2);
      }
      if ((com.tencent.mm.compatible.d.p.fQD.fND >= 0) || (com.tencent.mm.compatible.d.p.fQD.fNF >= 0))
      {
        arrayOfByte1[0] = -1;
        arrayOfByte1[1] = -1;
        if (com.tencent.mm.compatible.d.p.fQD.fND >= 0) {
          arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fND);
        }
        if (com.tencent.mm.compatible.d.p.fQD.fNF >= 0) {
          arrayOfByte1[1] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNF);
        }
        this.qFr.setAppCmd(415, arrayOfByte1, 2);
      }
      if ((com.tencent.mm.compatible.d.p.fQD.fNG >= 0) || (com.tencent.mm.compatible.d.p.fQD.fNH >= 0))
      {
        arrayOfByte1[0] = -1;
        arrayOfByte1[1] = -1;
        if (com.tencent.mm.compatible.d.p.fQD.fNG >= 0) {
          arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNG);
        }
        if (com.tencent.mm.compatible.d.p.fQD.fNH >= 0) {
          arrayOfByte1[1] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNH);
        }
        this.qFr.setAppCmd(422, arrayOfByte1, 2);
      }
      if (com.tencent.mm.compatible.d.p.fQD.fNI >= 0)
      {
        arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNI);
        this.qFr.setAppCmd(416, arrayOfByte1, 1);
      }
      if ((com.tencent.mm.compatible.d.p.fQD.fNJ >= 0) && ((this.qFr.qKb != 0) || (com.tencent.mm.compatible.d.p.fQD.fNJ != 5)))
      {
        arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNJ);
        this.qFr.setAppCmd(417, arrayOfByte1, 1);
      }
      if ((com.tencent.mm.compatible.d.p.fQD.fNK >= 0) && ((this.qFr.qKb != 0) || (com.tencent.mm.compatible.d.p.fQD.fNK != 5)))
      {
        arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNK);
        this.qFr.setAppCmd(418, arrayOfByte1, 1);
      }
      if (com.tencent.mm.compatible.d.p.fQD.fNL >= 0)
      {
        arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fNL);
        this.qFr.setAppCmd(419, arrayOfByte1, 1);
      }
      if ((this.qFr.qKb == 1) && ((com.tencent.mm.compatible.d.p.fQD.fNJ == 5) || (com.tencent.mm.compatible.d.p.fQD.fNK == 5))) {
        this.qFr.qJO = 5;
      }
      if (1 != com.tencent.mm.compatible.d.p.fQD.fOi) {
        break label888;
      }
      arrayOfByte2 = new byte[30];
      int n = 0;
      while (n < 15)
      {
        arrayOfByte2[(n * 2)] = ((byte)(com.tencent.mm.compatible.d.p.fQD.fOj[n] & 0xFF));
        arrayOfByte2[(n * 2 + 1)] = ((byte)(com.tencent.mm.compatible.d.p.fQD.fOj[n] >> 8 & 0xFF));
        n += 1;
      }
      if (com.tencent.mm.compatible.d.p.fQD.fNY != -2) {
        break;
      }
      this.qFr.qZ(407);
      break;
      label806:
      if (com.tencent.mm.compatible.d.p.fQD.fNZ != -2) {
        break label128;
      }
      this.qFr.qZ(409);
      break label128;
      label831:
      this.qFr.setAppCmd(404, arrayOfByte2, 2);
      continue;
      label848:
      if (com.tencent.mm.compatible.d.p.fQD.fOb == -2) {
        this.qFr.qZ(405);
      }
    }
    this.qFr.setAppCmd(420, arrayOfByte2, 30);
    label888:
    if (com.tencent.mm.compatible.d.p.fQD.fOi == 0) {
      this.qFr.qZ(421);
    }
    if ((com.tencent.mm.compatible.d.p.fQD.fOk[0] > 0) || (com.tencent.mm.compatible.d.p.fQD.fOk[1] > 0))
    {
      arrayOfByte1[0] = 0;
      arrayOfByte1[1] = 0;
      if ((com.tencent.mm.compatible.d.p.fQD.fOk[0] > 0) && (com.tencent.mm.compatible.d.p.fQD.fOk[0] < 10000)) {
        arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOk[0]);
      }
      if ((com.tencent.mm.compatible.d.p.fQD.fOk[1] > 0) && (com.tencent.mm.compatible.d.p.fQD.fOk[1] < 10000)) {
        arrayOfByte1[1] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOk[1]);
      }
      this.qFr.setAppCmd(423, arrayOfByte1, 2);
    }
    if (com.tencent.mm.compatible.d.p.fQD.fOm > 0)
    {
      arrayOfByte1[0] = ((byte)com.tencent.mm.compatible.d.p.fQD.fOm);
      this.qFr.setAppCmd(424, arrayOfByte1, 1);
    }
    if (com.tencent.mm.compatible.d.p.fQD.fOu >= 0)
    {
      int i = (byte)com.tencent.mm.compatible.d.p.fQD.fOu;
      int j = (byte)com.tencent.mm.compatible.d.p.fQD.fOv;
      int k = (byte)com.tencent.mm.compatible.d.p.fQD.fOw;
      int m = (byte)com.tencent.mm.compatible.d.p.fQD.fOx;
      this.qFr.setAppCmd(426, new byte[] { i, j, k, m }, 4);
    }
    GMTrace.o(5323209310208L, 39661);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5325491011584L, 39678);
    if (parama != null) {
      this.qFH = parama;
    }
    GMTrace.o(5325491011584L, 39678);
  }
  
  public final void a(bof parambof1, bof parambof2, bof parambof3)
  {
    GMTrace.i(5324551487488L, 39671);
    String str = Proxy.getDefaultHost();
    int i = Proxy.getDefaultPort();
    if ((str != null) && (str.length() > 0) && (i > 0))
    {
      localbpo = new bpo();
      try
      {
        localbpo.uZI = 1;
        localbpo.uZJ = i;
        localbpo.uZK = 0;
        localbpo.userName = "";
        localbpo.lnX = "";
        localbpo.uZJ = com.tencent.mm.plugin.voip.b.a.AS(InetAddress.getByName(str).getHostAddress());
        if (this.qFr.a(parambof1, parambof2, parambof3, localbpo) != 0)
        {
          w.i("MicroMsg.Voip.VoipContext", "setIp fail!");
          GMTrace.o(5324551487488L, 39671);
          return;
        }
      }
      catch (UnknownHostException localUnknownHostException)
      {
        localUnknownHostException = localUnknownHostException;
        if (this.qFr.a(parambof1, parambof2, parambof3, localbpo) != 0)
        {
          w.i("MicroMsg.Voip.VoipContext", "setIp fail!");
          GMTrace.o(5324551487488L, 39671);
          return;
        }
      }
      finally
      {
        localObject = finally;
        if (this.qFr.a(parambof1, parambof2, parambof3, localbpo) != 0) {
          w.i("MicroMsg.Voip.VoipContext", "setIp fail!");
        }
        throw ((Throwable)localObject);
      }
      GMTrace.o(5324551487488L, 39671);
      return;
    }
    bpo localbpo = new bpo();
    localbpo.uZI = 0;
    localbpo.uZJ = 0;
    localbpo.uZK = 0;
    localbpo.userName = "";
    localbpo.lnX = "";
    if (this.qFr.a(parambof1, parambof2, parambof3, localbpo) != 0) {
      w.i("MicroMsg.Voip.VoipContext", "setIp fail!");
    }
    GMTrace.o(5324551487488L, 39671);
  }
  
  public final void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    GMTrace.i(5324283052032L, 39669);
    this.qFr.qJu = paramInt1;
    this.qFr.qJv = paramArrayOfByte1;
    this.qFr.qKm = paramInt2;
    this.qFr.qKn = paramArrayOfByte2;
    GMTrace.o(5324283052032L, 39669);
  }
  
  public final void aG(byte[] paramArrayOfByte)
  {
    GMTrace.i(5324014616576L, 39667);
    w.d("MicroMsg.Voip.VoipContext", "updateRemotePid");
    this.qFr.qKT.qGj = 1;
    this.qFr.qKT.qGi = 1;
    this.qFr.qJr = paramArrayOfByte;
    GMTrace.o(5324014616576L, 39667);
  }
  
  public final void aH(byte[] paramArrayOfByte)
  {
    GMTrace.i(5324954140672L, 39674);
    w.i("MicroMsg.Voip.VoipContext", "updateRemoteCapInfo, isGotCapInfo: %s", new Object[] { Byte.valueOf(this.qFr.qKT.qGn) });
    if ((this.qFr.qKT.qGn == 1) || (paramArrayOfByte == null))
    {
      GMTrace.o(5324954140672L, 39674);
      return;
    }
    this.qFr.qKT.qGn = 1;
    this.qFr.qJs = paramArrayOfByte;
    int i = this.qFr.exchangeCabInfo(this.qFr.qJs, this.qFr.qJs.length);
    if (i < 0)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "protocal exchangecabinfo failed ret:" + i);
      this.qFr.qKT.qGe = 15;
      r(1, 56533, "");
    }
    GMTrace.o(5324954140672L, 39674);
  }
  
  public final void b(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(5324148834304L, 39668);
    this.qFr.qKt = paramInt;
    this.qFr.qKu = paramArrayOfByte1;
    this.qFr.qKv = paramArrayOfByte2;
    GMTrace.o(5324148834304L, 39668);
  }
  
  public final void btI()
  {
    int k = 0;
    GMTrace.i(5321464479744L, 39648);
    if ((this.qEN == true) && (this.qEW == 0))
    {
      this.qEW = 1;
      if (this.qFr.field_speedTestInfoLength < 8)
      {
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! bufsize=" + this.qFr.field_speedTestInfoLength);
        GMTrace.o(5321464479744L, 39648);
      }
    }
    else
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "StartVoipSpeedTest fail for status is wrong: isChannelStartConnect=" + this.qEN + " ,mSpeedTestStatus=" + this.qEW);
      GMTrace.o(5321464479744L, 39648);
      return;
    }
    int i = this.qFr.qKR[1];
    if (i + 2 > this.qFr.field_speedTestInfoLength)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + i + ", bufsize=" + this.qFr.field_speedTestInfoLength);
      GMTrace.o(5321464479744L, 39648);
      return;
    }
    int j = this.qFr.qKR[(i + 2 + 1)];
    if (i + 6 + j != this.qFr.field_speedTestInfoLength)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + i + ", C2SRttCnt=" + j + ", bufsize=" + this.qFr.field_speedTestInfoLength);
      GMTrace.o(5321464479744L, 39648);
      return;
    }
    this.qEX = this.qFr.mjG;
    this.qEZ = this.qFr.netType;
    this.qFa = this.qFr.mjF;
    this.qEV.uhU = this.qFr.mjF;
    this.qEV.uSE = this.qFr.qJB;
    this.qEV.udE = this.qFr.netType;
    bgy localbgy = this.qEV;
    if (this.qEN == true)
    {
      i = 1;
      localbgy.uSF = i;
      localbgy = this.qEV;
      if (this.qEO != true) {
        break label493;
      }
    }
    label493:
    for (i = 1;; i = 0)
    {
      localbgy.uSG = i;
      this.qEV.uSH = this.qFr.qKR[0];
      this.qEV.uSI = this.qFr.qKR[1];
      i = 2;
      j = 0;
      while (j < this.qEV.uSI)
      {
        this.qEV.uSJ.add(Integer.valueOf(this.qFr.qKR[i]));
        j += 1;
        i += 1;
      }
      i = 0;
      break;
    }
    localbgy = this.qEV;
    int[] arrayOfInt = this.qFr.qKR;
    j = i + 1;
    localbgy.uSK = arrayOfInt[i];
    localbgy = this.qEV;
    arrayOfInt = this.qFr.qKR;
    i = j + 1;
    localbgy.uSL = arrayOfInt[j];
    j = k;
    while (j < this.qEV.uSL)
    {
      this.qEV.uSM.add(Integer.valueOf(this.qFr.qKR[i]));
      j += 1;
      i += 1;
    }
    this.qEV.uSN = this.qFr.qKR[i];
    this.qEV.uSO = this.qFr.qKR[(i + 1)];
    new k(this.qEV).bvg();
    GMTrace.o(5321464479744L, 39648);
  }
  
  public final void btJ()
  {
    GMTrace.i(5321598697472L, 39649);
    if (this.qEW == 0)
    {
      GMTrace.o(5321598697472L, 39649);
      return;
    }
    if (this.qEW == 1)
    {
      this.qEW = 0;
      this.qFr.qKz = 0L;
      GMTrace.o(5321598697472L, 39649);
      return;
    }
    this.qEW = 0;
    v2protocal localv2protocal = this.qFr;
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "v2protocal StopVoipSpeedTest!");
    localv2protocal.StopSpeedTest();
    localv2protocal.qKz = 0L;
    GMTrace.o(5321598697472L, 39649);
  }
  
  public final void btK()
  {
    GMTrace.i(5321867132928L, 39651);
    this.qFr.qJE = this.qFt.btY();
    this.qFr.qJF = this.qFt.btD();
    GMTrace.o(5321867132928L, 39651);
  }
  
  public final int btL()
  {
    GMTrace.i(5322404003840L, 39655);
    if (this.mStatus == 1)
    {
      GMTrace.o(5322404003840L, 39655);
      return 0;
    }
    if ((this.mStatus == 2) || (this.mStatus == 3))
    {
      GMTrace.o(5322404003840L, 39655);
      return 1;
    }
    if (this.mStatus == 4)
    {
      GMTrace.o(5322404003840L, 39655);
      return 2;
    }
    GMTrace.o(5322404003840L, 39655);
    return 3;
  }
  
  public final boolean btM()
  {
    GMTrace.i(5322538221568L, 39656);
    if (this.mStatus == 3)
    {
      GMTrace.o(5322538221568L, 39656);
      return true;
    }
    GMTrace.o(5322538221568L, 39656);
    return false;
  }
  
  public final boolean btN()
  {
    GMTrace.i(5322672439296L, 39657);
    w.d("MicroMsg.Voip.VoipContext", "isWorking, status: %d", new Object[] { Integer.valueOf(this.mStatus) });
    if (this.mStatus == 1)
    {
      GMTrace.o(5322672439296L, 39657);
      return false;
    }
    GMTrace.o(5322672439296L, 39657);
    return true;
  }
  
  public final boolean btO()
  {
    GMTrace.i(5322940874752L, 39659);
    if (this.qFd)
    {
      GMTrace.o(5322940874752L, 39659);
      return false;
    }
    switch (this.qFf)
    {
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(5322940874752L, 39659);
          return true;
          GMTrace.o(5322940874752L, 39659);
          return true;
        } while (4 == this.qFg);
        GMTrace.o(5322940874752L, 39659);
        return false;
        GMTrace.o(5322940874752L, 39659);
        return false;
      } while ((4 == this.qFg) || (-1 == this.qFg));
      GMTrace.o(5322940874752L, 39659);
      return false;
    } while ((5 != this.qFg) && (6 != this.qFg) && (7 != this.qFg));
    GMTrace.o(5322940874752L, 39659);
    return false;
  }
  
  public final boolean btP()
  {
    GMTrace.i(5323075092480L, 39660);
    if (this.qFd)
    {
      GMTrace.o(5323075092480L, 39660);
      return false;
    }
    switch (this.qFf)
    {
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(5323075092480L, 39660);
          return true;
          GMTrace.o(5323075092480L, 39660);
          return true;
        } while (4 == this.qFg);
        GMTrace.o(5323075092480L, 39660);
        return false;
        GMTrace.o(5323075092480L, 39660);
        return false;
      } while ((4 == this.qFh) || (this.qFh == 0) || (-1 == this.qFh));
      GMTrace.o(5323075092480L, 39660);
      return false;
    } while ((5 != this.qFh) && (6 != this.qFh) && (7 != this.qFh));
    GMTrace.o(5323075092480L, 39660);
    return false;
  }
  
  public final void btR()
  {
    GMTrace.i(5323343527936L, 39662);
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "tryStartTalk: try start talk");
    if ((this.qER != true) || (this.qEO != true))
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "tryStartTalk: fail isCanSendData " + this.qER + ", isChannelConnectedSuccess " + this.qEO);
      GMTrace.o(5323343527936L, 39662);
      return;
    }
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "Voip tryStartTalk, channel setActive");
    this.qFr.setActive();
    if (this.qEU == true)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "tryStartTalk: engine already started, isEngineStarted " + this.qEU);
      GMTrace.o(5323343527936L, 39662);
      return;
    }
    label183:
    g localg;
    label241:
    int k;
    if (this.qFr.startEngine() == 0)
    {
      this.qFr.qKT.qGE = 0;
      btQ();
      if ((btO()) || (btP())) {
        break label1261;
      }
      btU();
      this.qFs.buv();
      localg = this.qFt;
      if (localg.qFN != 2) {
        break label1319;
      }
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipDeviceHandler", "dev start already...");
      ??? = this.qFr.qKT;
      if (((h)???).beginTime != 0L) {
        break label1615;
      }
      ((h)???).qGx = 0;
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "devin:beginTime:" + ((h)???).beginTime + ", CurrentTime: " + System.currentTimeMillis());
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "devin:endNewDial:" + ((h)???).qGx);
      this.qFs.onConnected();
      this.mStatus = 5;
      ??? = this.qFr.qKT;
      ((h)???).qGF = System.currentTimeMillis();
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "devin:beginTalk:" + ((h)???).qGF);
      this.qFr.setSvrConfig(202, this.qFr.qJU, this.qFr.qJV, 0, 0, 0, 0);
      this.qFr.setSvrConfig(203, 0, 0, this.qFr.qJZ, 0, 0, 0);
      this.qFr.setSvrConfig(103, this.qFr.qJW, this.qFr.qJX, this.qFr.qJY, this.qFr.qKa, 0, 0);
      this.qFr.setSvrConfig(205, 0, 0, this.qFr.qKp, 0, 0, 0);
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "bothSideGeneralSwitch" + this.qFr.qKp);
      j = this.qFr.qKc >> 2 & 0x3;
      k = this.qFr.qKc & 0x3;
      if (this.qFr.mjN != 0) {
        break label1633;
      }
    }
    label1261:
    label1319:
    label1615:
    label1633:
    for (int j = (j << 2) + k;; j = (k << 2) + j)
    {
      this.qFr.setSvrConfig(502, 0, 0, j, 0, 0, 0);
      this.qFr.setSvrConfig(503, 0, 0, this.qFr.qKd, this.qFr.qKe, this.qFr.qKf, this.qFr.qKg);
      if ((this.qFr.qKu != null) && (this.qFr.qKv != null))
      {
        this.qFr.setSvrConfig(504, 0, 0, this.qFr.qKt, 0, 0, 0);
        this.qFr.setSvrConfig(505, 0, 0, this.qFr.qKu[0], this.qFr.qKu[1], this.qFr.qKu[2], this.qFr.qKu[3]);
        this.qFr.setSvrConfig(506, 0, 0, this.qFr.qKv[0], this.qFr.qKv[1], 0, 0);
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "FECSvrCtr = " + this.qFr.qKt + ",FECKeyPara1 = " + this.qFr.qKu[0] + "," + this.qFr.qKu[1] + "," + this.qFr.qKu[2] + "," + this.qFr.qKu[3] + ",FECKeyPara2 = " + this.qFr.qKv[0] + "," + this.qFr.qKv[1]);
      }
      k = this.qFr.qKh;
      int m = this.qFr.qKh;
      int n = this.qFr.qKh;
      this.qFr.setSvrConfig(507, 0, 0, (k & 0x4) >> 2, (m & 0x2) >> 1, n & 0x1, 0);
      this.qFr.setjbmbitraterssvrparam();
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "zhengxue[Logic] setSvrConfig brefore onStartTalk: audioTsdfBeyond3G = " + this.qFr.qJU + ",audioTsdEdge = " + this.qFr.qJV + ",passthroughQosAlgorithm = " + this.qFr.qJW + ",fastPlayRepair = " + this.qFr.qJX + ", audioDTX = " + this.qFr.qJZ + ", mARQFlag = " + j + ", mQosStrategy = " + this.qFr.qKh + ", mSvrCfgListV = " + this.qFr.qJY + ", maxBRForRelay = " + this.qFr.qKa);
      ??? = new byte[2];
      ???[0] = ((byte)com.tencent.mm.compatible.d.p.fQC.fPa);
      ???[1] = -1;
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "steve: Model Name: " + Build.MODEL);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "steve: Image Enhancement for Android Capture!!, mode: " + ???[0]);
      this.qFr.setAppCmd(15, (byte[])???, 1);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "anlin: ClientVersion: " + d.tJC);
      ??? = ByteBuffer.allocate(4);
      ((ByteBuffer)???).order(ByteOrder.LITTLE_ENDIAN).putInt(d.tJC);
      ??? = ((ByteBuffer)???).array();
      this.qFr.setAppCmd(505, (byte[])???, 4);
      this.qEU = true;
      GMTrace.o(5323343527936L, 39662);
      return;
      this.qEU = false;
      this.qFr.qKT.qGE = 1;
      break;
      if (this.qFE != null)
      {
        btU();
        break label183;
      }
      this.qFE = new Timer();
      this.qFF = 0;
      ??? = new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(5325893664768L, 39681);
          e locale = e.this;
          locale.qFF += 1;
          if ((e.this.qFr.qKF != 0) || (e.this.qFF > 10))
          {
            e.this.btU();
            e.this.qFE.cancel();
            e.this.qFE = null;
            GMTrace.o(5325893664768L, 39681);
            return;
          }
          GMTrace.o(5325893664768L, 39681);
        }
      };
      this.qFE.schedule((TimerTask)???, 200L, 200L);
      break label183;
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipDeviceHandler", "start device......");
      localg.qFN = 2;
      if (localg.qGb != null)
      {
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipDeviceHandler", "stop videodecode thread..");
        localg.qGb.qGd = true;
        com.tencent.mm.sdk.f.e.remove(localg.qGb);
        localg.qGb = null;
      }
      localg.qGb = new g.b(localg);
      com.tencent.mm.sdk.f.e.post(localg.qGb, "VoipDeviceHandler_decode");
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipDeviceHandler", "start video decode thread..");
      com.tencent.mm.compatible.d.p.fQD.dump();
      localg.qFL = new b();
      localg.qFL.P(v2protocal.nlR, 20, 0);
      localg.qFO = localg.qFL.k(localg.qDX.iPn, true);
      if (localg.qFL.qDW == true) {}
      for (j = 1;; j = 0)
      {
        int i = (byte)j;
        localg.qDX.qFr.setAppCmd(502, new byte[] { i }, 1);
        if (localg.qFO <= 10)
        {
          if (localg.qFO <= 0) {
            localg.qFY = 1;
          }
          localg.qFO = 92;
        }
        localg.qFL.qEf = new g.2(localg);
        if (localg.qFL.btA() <= 0) {
          localg.qFY = 1;
        }
        synchronized (localg.qFX)
        {
          com.tencent.mm.sdk.f.e.b(new g.3(localg), "voip_start_record", 10);
        }
      }
      ((h)???).qGx = ((int)(System.currentTimeMillis() - ((h)???).beginTime));
      break label241;
    }
  }
  
  public final boolean btS()
  {
    GMTrace.i(5323477745664L, 39663);
    boolean bool = btO();
    int i = 0;
    if (bool) {
      i = 1;
    }
    if ((this.qFp == -1) || (this.qFp != i))
    {
      this.qFp = i;
      if (!bool) {
        break label77;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "setAppCmd: set start video Out.......!");
      this.qFr.qZ(203);
    }
    for (;;)
    {
      GMTrace.o(5323477745664L, 39663);
      return bool;
      label77:
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video Out.......!");
      this.qFr.qZ(202);
    }
  }
  
  public final boolean btT()
  {
    GMTrace.i(5323611963392L, 39664);
    boolean bool = btP();
    int i = 0;
    if (bool) {
      i = 1;
    }
    if ((this.qFq == -1) || (this.qFq != i))
    {
      this.qFq = i;
      if (!bool) {
        break label77;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "setAppCmd: set start video In.......!");
      this.qFr.qZ(201);
    }
    for (;;)
    {
      GMTrace.o(5323611963392L, 39664);
      return bool;
      label77:
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video In.......!");
      this.qFr.qZ(200);
    }
  }
  
  public final void btU()
  {
    GMTrace.i(5323746181120L, 39665);
    h localh;
    if (this.mStatus == 5)
    {
      dB(6);
      localh = this.qFr.qKT;
      if (localh.beginTime != 0L) {
        break label143;
      }
    }
    label143:
    for (localh.qGh = 0;; localh.qGh = ((int)(System.currentTimeMillis() - localh.beginTime)))
    {
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "devin:beginTime:" + localh.beginTime + ", CurrentTime: " + System.currentTimeMillis());
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "devin:endDial:" + localh.qGh);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "talking  now .......!");
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5318109036544L, 39623);
          e.this.qFs.bus();
          GMTrace.o(5318109036544L, 39623);
        }
      });
      GMTrace.o(5323746181120L, 39665);
      return;
    }
  }
  
  public final void btV()
  {
    GMTrace.i(5323880398848L, 39666);
    this.qFr.qKT.qGq = 7;
    if ((!bg.bq(this.qFr.qJr)) && ((this.mStatus == 4) || ((this.mStatus == 2) && (this.qET == true)) || ((this.mStatus == 3) && (this.qET == true))))
    {
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel");
      int j = (this.qFr.qKc >> 2 & 0x3) >> 1 & 0x1 & (this.qFr.qKc & 0x3) >> 1 & 0x1;
      v2protocal localv2protocal = this.qFr;
      int k = this.qFr.qJp;
      long l1 = this.qFr.mjF;
      int m = this.qFr.mjN;
      long l2 = this.qFr.mjG;
      byte[] arrayOfByte = this.qFr.qJr;
      int n = this.qFr.channelStrategy;
      int i1 = this.qFr.qJw;
      int i2 = this.qFr.qJx;
      int i3 = this.qFr.qJu;
      if (this.qFr.qJv == null) {}
      for (int i = 0;; i = this.qFr.qJv.length)
      {
        i = localv2protocal.setConfigConnect(k, l1, m, l2, arrayOfByte, n, i1, i2, i3, i, this.qFr.qJv, this.qFr.qJy, j, this.qFr.qJo, this.qFr.qKm, this.qFr.qKn, this.qFr.qKo, this.qFr.qJz);
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "zhengxue[Logic], mARQFlag: " + j + ",  NetType: " + this.qFr.qJo + ", EncryptStrategy: " + this.qFr.qKm);
        if (i >= 0) {
          break;
        }
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipContext", "v2protocal setConfigConnect failed, ret:" + i);
        this.qFr.qKT.qGe = 14;
        r(1, 56534, "");
        GMTrace.o(5323880398848L, 39666);
        return;
      }
      this.qFr.qJr = null;
      this.qEN = true;
      this.qFr.qKT.qGl = 1;
      this.qFr.qKT.qGt = 1;
      GMTrace.o(5323880398848L, 39666);
      return;
    }
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "channel:try start connect fail; mStatus:" + this.mStatus + ", isPreConnect:" + this.qET);
    GMTrace.o(5323880398848L, 39666);
  }
  
  public final void btW()
  {
    GMTrace.i(5325356793856L, 39677);
    w.i("MicroMsg.Voip.VoipContext", "stop repeat voip sync");
    this.qFD.stopTimer();
    GMTrace.o(5325356793856L, 39677);
  }
  
  public final void dB(int paramInt)
  {
    GMTrace.i(5322269786112L, 39654);
    if (paramInt == this.mStatus)
    {
      GMTrace.o(5322269786112L, 39654);
      return;
    }
    if (paramInt == 4) {
      this.qFG.z(60000L, 60000L);
    }
    this.mStatus = paramInt;
    GMTrace.o(5322269786112L, 39654);
  }
  
  public final void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(5324685705216L, 39672);
    this.qFr.qKc = paramInt1;
    this.qFr.qKd = paramInt2;
    this.qFr.qKe = paramInt3;
    this.qFr.qKf = paramInt4;
    this.qFr.qKg = paramInt5;
    GMTrace.o(5324685705216L, 39672);
  }
  
  public final void r(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5325625229312L, 39679);
    btW();
    if (this.qFH != null) {
      this.qFH.r(paramInt1, paramInt2, paramString);
    }
    GMTrace.o(5325625229312L, 39679);
  }
  
  public final void reset()
  {
    GMTrace.i(14694962167808L, 109486);
    w.i("MicroMsg.Voip.VoipContext", "reset");
    this.qFs.buu();
    if (this.qFr.ndo) {
      this.qFr.iB(false);
    }
    this.qFr.reset();
    this.qFf = -1;
    this.qFg = -1;
    this.qFh = -1;
    this.qFi = -1;
    this.qFj = -1;
    this.qFt.btZ();
    this.qFr.qJI = 0;
    this.qFG.stopTimer();
    this.qFu.bvc();
    this.qFD.stopTimer();
    this.qEN = false;
    this.qEO = false;
    this.qEP = false;
    this.qEQ = false;
    this.eQN = false;
    this.qER = false;
    this.qFv = null;
    this.qFw = null;
    this.qFb = false;
    this.qFc = false;
    this.qFd = false;
    this.qFk = false;
    this.qFl = false;
    this.qFn = false;
    this.qFm = 1;
    this.qFo = 1;
    this.qFx = false;
    this.qFp = -1;
    this.qFq = -1;
    this.qES = false;
    this.qET = false;
    this.qER = false;
    this.qEN = false;
    this.qEU = false;
    this.qFe = 10;
    this.mStatus = 1;
    this.qFB = 0;
    this.qFC = 0;
    GMTrace.o(14694962167808L, 109486);
  }
  
  public final void shutdown()
  {
    GMTrace.i(5322135568384L, 39653);
    btW();
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5263079768064L, 39213);
        if (e.this.qFs != null) {
          e.this.qFs.but();
        }
        GMTrace.o(5263079768064L, 39213);
      }
    });
    GMTrace.o(5322135568384L, 39653);
  }
  
  public final void we(int paramInt)
  {
    GMTrace.i(5321732915200L, 39650);
    this.qFr.qJD = Math.abs(paramInt);
    GMTrace.o(5321732915200L, 39650);
  }
  
  public final void wf(int paramInt)
  {
    GMTrace.i(5322001350656L, 39652);
    this.qFr.qJG = paramInt;
    GMTrace.o(5322001350656L, 39652);
  }
  
  public final void wg(int paramInt)
  {
    GMTrace.i(5322806657024L, 39658);
    if ((8 == paramInt) || (9 == paramInt)) {
      this.qFi = paramInt;
    }
    for (;;)
    {
      o localo = this.qFu;
      Object localObject2 = com.tencent.mm.plugin.voip.b.a.wv(paramInt);
      Object localObject1 = new azp();
      ((azp)localObject1).be((byte[])localObject2);
      localObject2 = new azp();
      try
      {
        ((azp)localObject2).be(((azp)localObject1).toByteArray());
        localObject1 = new bpa();
        ((bpa)localObject1).uei = 3;
        ((bpa)localObject1).uej = ((azp)localObject2);
        ((bpa)localObject1).lSY = q.zE();
        localObject2 = new bpb();
        ((bpb)localObject2).jhc = 1;
        ((bpb)localObject2).jhd.add(localObject1);
        localo.a((bpb)localObject2, false, 4);
        GMTrace.o(5322806657024L, 39658);
        return;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", localIOException, "", new Object[0]);
        GMTrace.o(5322806657024L, 39658);
      }
      this.qFf = paramInt;
      this.qFg = paramInt;
    }
  }
  
  public final void wh(int paramInt)
  {
    GMTrace.i(5324417269760L, 39670);
    this.qFr.qKo = paramInt;
    GMTrace.o(5324417269760L, 39670);
  }
  
  public final void wi(int paramInt)
  {
    GMTrace.i(5324819922944L, 39673);
    this.qFr.qKh = paramInt;
    GMTrace.o(5324819922944L, 39673);
  }
  
  public final void wj(int paramInt)
  {
    GMTrace.i(5325088358400L, 39675);
    this.qFr.qKT.qGk = 1;
    this.qFr.channelStrategy = paramInt;
    GMTrace.o(5325088358400L, 39675);
  }
  
  public final void wk(int paramInt)
  {
    GMTrace.i(5325222576128L, 39676);
    this.qFr.qJy = paramInt;
    GMTrace.o(5325222576128L, 39676);
  }
  
  public static abstract interface a
  {
    public abstract void r(int paramInt1, int paramInt2, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */