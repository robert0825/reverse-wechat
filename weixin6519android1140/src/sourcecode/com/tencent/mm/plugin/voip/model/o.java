package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.akb;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.bpa;
import com.tencent.mm.protocal.c.bpb;
import com.tencent.mm.protocal.c.bpm;
import com.tencent.mm.protocal.c.bpr;
import com.tencent.mm.protocal.c.bqc;
import com.tencent.mm.protocal.c.bqe;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.io.IOException;
import java.util.LinkedList;

public final class o
{
  e qDX;
  bpm qIN;
  private bpb qIO;
  private int qIP;
  
  public o(e parame)
  {
    GMTrace.i(5315693117440L, 39605);
    this.qDX = null;
    this.qIN = new bpm();
    this.qIO = null;
    this.qIP = 0;
    this.qDX = parame;
    GMTrace.o(5315693117440L, 39605);
  }
  
  private void a(bpb parambpb)
  {
    GMTrace.i(5315827335168L, 39606);
    if (parambpb == null)
    {
      a.dU("MicroMsg.Voip.VoipSyncHandle", "failed to pushVoipCmdList , VoipCmdList = null");
      this.qIP += 1;
      GMTrace.o(5315827335168L, 39606);
      return;
    }
    if (this.qIO == null) {
      this.qIO = new bpb();
    }
    int i = 0;
    while (i < parambpb.jhc)
    {
      bpa localbpa = (bpa)parambpb.jhd.get(i);
      this.qIO.jhd.add(localbpa);
      i += 1;
    }
    this.qIO.jhc = this.qIO.jhd.size();
    GMTrace.o(5315827335168L, 39606);
  }
  
  private void b(bpb parambpb)
  {
    GMTrace.i(5315961552896L, 39607);
    if ((this.qIO == null) || (this.qIO.jhc <= 0))
    {
      GMTrace.o(5315961552896L, 39607);
      return;
    }
    int i = 0;
    while (i < this.qIO.jhc)
    {
      bpa localbpa = (bpa)this.qIO.jhd.get(i);
      parambpb.jhd.add(localbpa);
      i += 1;
    }
    parambpb.jhc = parambpb.jhd.size();
    bvc();
    GMTrace.o(5315961552896L, 39607);
  }
  
  public final int a(bpb parambpb, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(5316229988352L, 39609);
    if (this.qDX.qFr.mjF == 0)
    {
      a.dU("MicroMsg.Voip.VoipSyncHandle", com.tencent.mm.compatible.util.g.tC() + "failed to do voip sync , roomid = 0");
      GMTrace.o(5316229988352L, 39609);
      return 0;
    }
    if (this.qDX.qFx)
    {
      a.dU("MicroMsg.Voip.VoipSyncHandle", com.tencent.mm.compatible.util.g.tC() + "voip syncing, push to cache...");
      a(parambpb);
      GMTrace.o(5316229988352L, 39609);
      return 0;
    }
    this.qDX.qFx = true;
    if (parambpb == null)
    {
      parambpb = new bpb();
      parambpb.jhc = 0;
      parambpb.jhd = new LinkedList();
    }
    for (;;)
    {
      b(parambpb);
      this.qIP = 0;
      if (this.qDX.qFv == null) {
        this.qDX.qFv = "".getBytes();
      }
      a.dV("MicroMsg.Voip.VoipSyncHandle", "doSync fromjni:" + paramBoolean + " cmdList:" + parambpb.jhc + ",syncKey.length=" + this.qDX.qFv.length);
      new com.tencent.mm.plugin.voip.model.a.m(this.qDX.qFr.mjF, parambpb, this.qDX.qFv, this.qDX.qFr.mjG, paramInt).bvg();
      GMTrace.o(5316229988352L, 39609);
      return 0;
    }
  }
  
  public final void a(final bpr parambpr)
  {
    GMTrace.i(5316498423808L, 39611);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19595922505728L, 146001);
        Object localObject1 = parambpr.tTe.uNP.toByteArray();
        for (;;)
        {
          try
          {
            localObject1 = (bpm)new bpm().aD((byte[])localObject1);
            if ((((bpm)localObject1).uXS != null) && (((bpm)localObject1).uXS.tTe != null) && (((bpm)localObject1).uXS.tTe.uNP != null)) {
              o.this.qIN.uXS = ((bpm)localObject1).uXS;
            }
            if ((((bpm)localObject1).uXT.tTe != null) && (((bpm)localObject1).uXT.tTe.uNP != null)) {
              o.this.qIN.uXT = ((bpm)localObject1).uXT;
            }
            if (((bpm)localObject1).uZh != 0) {
              o.this.qIN.uZh = ((bpm)localObject1).uZh;
            }
            if ((((bpm)localObject1).uZi != null) && (((bpm)localObject1).uZi.uYd != 0)) {
              o.this.qIN.uZi = ((bpm)localObject1).uZi;
            }
            if ((((bpm)localObject1).uZj != null) && (((bpm)localObject1).uZj.uYd != 0)) {
              o.this.qIN.uZj = ((bpm)localObject1).uZj;
            }
            if (((bpm)localObject1).uZl != 0) {
              o.this.qIN.uZl = ((bpm)localObject1).uZl;
            }
            if (((bpm)localObject1).uZm != 0) {
              o.this.qIN.uZm = ((bpm)localObject1).uZm;
            }
            if (((bpm)localObject1).uZq.uYd != 0) {
              o.this.qIN.uZq = ((bpm)localObject1).uZq;
            }
            if (((bpm)localObject1).uZr > 0)
            {
              o.this.qIN.uZr = ((bpm)localObject1).uZr;
              if (((bpm)localObject1).mkb <= 0) {
                break label779;
              }
              o.this.qIN.mkb = (((bpm)localObject1).mkb - 1);
              a.dV("MicroMsg.Voip.VoipSyncHandle", "zhengxue[ENCRYPT] got encryptStrategy[" + o.this.qIN.mkb + "] from relaydata");
              if (((bpm)localObject1).uZs <= 0) {
                break label800;
              }
              o.this.qIN.uZs = ((bpm)localObject1).uZs;
              o.this.qIN.uZt = ((bpm)localObject1).uZt;
              o.this.qIN.uZu = ((bpm)localObject1).uZu;
              o.this.qIN.uZv = ((bpm)localObject1).uZv;
              a.dV("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got ARQCacheLen: " + ((bpm)localObject1).uZs + ", ARQRttThreshold: " + ((bpm)localObject1).uZt + ", ARQUsedRateThreshold: " + ((bpm)localObject1).uZu + ", ARQRespRateThreshold: " + ((bpm)localObject1).uZv);
              if (((bpm)localObject1).uZz <= 0) {
                break label810;
              }
              o.this.qIN.uZz = ((bpm)localObject1).uZz;
              o.this.qIN.uZC = ((bpm)localObject1).uZC;
              if (((bpm)localObject1).uZE != null) {
                o.this.qIN.uZE = ((bpm)localObject1).uZE;
              }
              if ((o.this.qIN.uXS == null) || (o.this.qIN.uXS.tTe == null) || (o.this.qIN.uXS.tTe.uNP == null) || (o.this.qIN.uZh == 0) || (o.this.qIN.uXT == null) || (o.this.qIN.uXT.tTe == null) || (o.this.qIN.uXT.tTe.uNP == null) || (o.this.qIN.uZi == null) || (o.this.qIN.uZi.uYd == 0) || (o.this.qIN.uZj == null) || (o.this.qIN.uZj.uYd == 0) || (o.this.qIN.uZq == null) || (o.this.qIN.uZq.uYd == 0)) {
                break label831;
              }
              i = 1;
              if (i != 0) {
                break;
              }
              GMTrace.o(19595922505728L, 146001);
              return;
            }
          }
          catch (IOException localIOException)
          {
            w.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", localIOException, "", new Object[0]);
            GMTrace.o(19595922505728L, 146001);
            return;
          }
          o.this.qIN.uZr = 0;
          a.dV("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQstrategy in mrdata");
          continue;
          label779:
          o.this.qIN.mkb = 1;
          a.dV("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no EncryptStrategy in mrdata");
          continue;
          label800:
          a.dV("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQKeyParameters in mrdata");
          continue;
          label810:
          o.this.qIN.uZz = 0;
          a.dV("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no QosStrategy in mrdata");
          continue;
          label831:
          i = 0;
        }
        a.dV("MicroMsg.Voip.VoipSyncHandle", "multiRelayData recv all, update. RedirectReqThreshold = " + o.this.qIN.uZC + " BothSideSwitchFlag = " + localIOException.uZD);
        o.this.qDX.wj(o.this.qIN.uZh);
        o.this.qDX.aG(o.this.qIN.uXS.tTe.uNP.toByteArray());
        if ((localIOException.uZo != null) && (localIOException.uZo.uNP != null) && (localIOException.uZA != null) && (localIOException.uZA.uNP != null)) {
          o.this.qDX.a(localIOException.uZo.uNP.toByteArray(), localIOException.uZn, o.this.qIN.mkb, localIOException.uZA.uNP.toByteArray());
        }
        if (d.btG().buK() != 0) {
          o.this.qDX.aH(o.this.qIN.uXT.tTe.uNP.toByteArray());
        }
        o.this.qDX.a(o.this.qIN.uZi, o.this.qIN.uZj, o.this.qIN.uZq);
        o.this.qDX.g(o.this.qIN.uZr, o.this.qIN.uZs, o.this.qIN.uZt, o.this.qIN.uZu, o.this.qIN.uZv);
        o.this.qDX.wi(o.this.qIN.uZz);
        Object localObject2 = o.this.qDX;
        int i = o.this.qIN.uZl;
        int j = o.this.qIN.uZm;
        ((e)localObject2).qFr.qJw = i;
        ((e)localObject2).qFr.qJx = j;
        o.this.qDX.wh(o.this.qIN.uZC);
        o.this.qDX.qFr.qKp = localIOException.uZD;
        if ((localIOException.uZx != null) && (localIOException.uZx.uNP != null) && (localIOException.uZy != null) && (localIOException.uZy.uNP != null)) {
          o.this.qDX.b(localIOException.uZw, localIOException.uZx.uNP.toByteArray(), localIOException.uZy.uNP.toByteArray());
        }
        localObject2 = o.this.qDX;
        akb localakb = o.this.qIN.uZE;
        localObject2 = ((e)localObject2).qFr;
        a.dW("MicroMsg.Voip", "v2protocal updateJbmBitrateRsSvrParam BitrateFlag : " + localakb.uyK + " Bitrate: " + localakb.uyL);
        ((v2protocal)localObject2).field_jbmParamArraySize = 27;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray = new int[((v2protocal)localObject2).field_jbmParamArraySize];
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[0] = localakb.uyJ;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[1] = localakb.uyK;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[2] = localakb.uyL;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[3] = localakb.uyM;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[4] = localakb.uyN;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[5] = localakb.uyO;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[6] = localakb.uyP;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[7] = localakb.uyS;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[8] = localakb.uyT;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[9] = localakb.uyW;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[10] = localakb.uyX;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[11] = localakb.uza;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[12] = localakb.uzb;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[13] = localakb.uze;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[14] = localakb.uzf;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[15] = localakb.uzi;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[16] = localakb.uzj;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[17] = localakb.uzm;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[18] = localakb.uzn;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[19] = localakb.uzq;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[20] = localakb.uzr;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[21] = localakb.uzu;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[22] = localakb.uzv;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[23] = localakb.uzy;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[24] = localakb.uzz;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[25] = localakb.uzC;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[26] = localakb.uzD;
        ((v2protocal)localObject2).field_jbmParamDoubleArraySize = 20;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray = new double[((v2protocal)localObject2).field_jbmParamDoubleArraySize];
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[0] = localakb.uyQ;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[1] = localakb.uyR;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[2] = localakb.uyU;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[3] = localakb.uyV;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[4] = localakb.uyY;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[5] = localakb.uyZ;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[6] = localakb.uzc;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[7] = localakb.uzd;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[8] = localakb.uzg;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[9] = localakb.uzh;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[10] = localakb.uzk;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[11] = localakb.uzl;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[12] = localakb.uzo;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[13] = localakb.uzp;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[14] = localakb.uzs;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[15] = localakb.uzt;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[16] = localakb.uzw;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[17] = localakb.uzx;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[18] = localakb.uzA;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[19] = localakb.uzB;
        o.this.qDX.qET = true;
        o.this.qDX.btV();
        GMTrace.o(19595922505728L, 146001);
      }
    });
    GMTrace.o(5316498423808L, 39611);
  }
  
  public final void a(bqc parambqc, int paramInt)
  {
    GMTrace.i(5316364206080L, 39610);
    a.dW("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged:  status:" + parambqc.jhA);
    if (parambqc.jhA == 1)
    {
      this.qDX.qEQ = true;
      if (1 == paramInt)
      {
        parambqc = this.qDX.qFr.qKT;
        if (0L == parambqc.qGG)
        {
          parambqc.qGG = System.currentTimeMillis();
          a.dV("MicroMsg.VoipDailReport", "accept received timestamp:" + parambqc.qGG);
        }
      }
      if (3 == paramInt)
      {
        parambqc = this.qDX.qFr.qKT;
        if (0L == parambqc.qGH)
        {
          parambqc.qGH = System.currentTimeMillis();
          a.dV("MicroMsg.VoipDailReport", "sync accept received timestamp:" + parambqc.qGH);
        }
      }
      a.dW("MicroMsg.Voip.VoipSyncHandle", "zhengxue[DataAccept]onVoipSyncStatus:ACCEPTdata Flag: " + paramInt);
      this.qDX.qFs.aHH();
      d.btG().qIe.bvb();
      this.qDX.qER = true;
      if (this.qDX.qET == true)
      {
        this.qDX.qET = false;
        if (this.qDX.qEO != true) {
          break label334;
        }
        a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus:ACCEPT, pre-connect already success");
        this.qDX.btR();
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(11519, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(2) });
        this.qDX.btV();
        this.qDX.btW();
        GMTrace.o(5316364206080L, 39610);
        return;
        label334:
        if (this.qDX.qES == true)
        {
          a.dV("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect already fail");
          this.qDX.r(1, 56536, "");
        }
        else
        {
          a.dV("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect still connecting...");
        }
      }
    }
    if (parambqc.jhA == 6)
    {
      a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACKED");
      a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: try use pre-connect");
      this.qDX.qET = true;
      this.qDX.qFr.qJS = 1;
      this.qDX.btV();
      GMTrace.o(5316364206080L, 39610);
      return;
    }
    if (parambqc.jhA == 8)
    {
      a.dV("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACK BUSY");
      this.qDX.qFr.qKT.qGf = 211;
      this.qDX.qFr.qKT.qGe = 11;
      this.qDX.qFr.qKT.qGq = 12;
      com.tencent.mm.plugin.report.service.g.ork.i(11519, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(3) });
      this.qDX.r(1, 211, "");
      this.qDX.btW();
      GMTrace.o(5316364206080L, 39610);
      return;
    }
    if (parambqc.jhA == 2)
    {
      a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_REJECT");
      this.qDX.qFr.qKT.qGe = 103;
      this.qDX.qFr.qKT.qGq = 4;
      this.qDX.qFr.qKT.qGx = ((int)(System.currentTimeMillis() - this.qDX.qFr.qKT.beginTime));
      com.tencent.mm.plugin.report.service.g.ork.i(11519, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(1) });
      this.qDX.btW();
      this.qDX.r(4, 0, "");
      GMTrace.o(5316364206080L, 39610);
      return;
    }
    if (parambqc.jhA == 3)
    {
      this.qDX.qFr.qKT.qGq = 5;
      GMTrace.o(5316364206080L, 39610);
      return;
    }
    if (parambqc.jhA == 4)
    {
      a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_SHUTDOWN");
      if (this.qDX.mStatus < 6) {
        this.qDX.qFr.qKT.qGr = 1;
      }
      this.qDX.qFr.qKT.qGe = 110;
      this.qDX.r(6, 0, "");
      this.qDX.btW();
      GMTrace.o(5316364206080L, 39610);
      return;
    }
    a.dW("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged: unknow status:" + parambqc.jhA);
    GMTrace.o(5316364206080L, 39610);
  }
  
  public final void b(bpr parambpr)
  {
    GMTrace.i(5316632641536L, 39612);
    e locale = this.qDX;
    parambpr = parambpr.tTe.uNP.toByteArray();
    locale.qFr.qJt = parambpr;
    if ((locale.qEN) && (!bg.bq(locale.qFr.qJt)))
    {
      int i = locale.qFr.handleCommand(locale.qFr.qJt, locale.qFr.qJt.length);
      if (i < 0) {
        a.dU("MicroMsg.Voip.VoipContext", "v2protocal handlecommand failed ret:" + i);
      }
      locale.qFr.qJt = null;
    }
    GMTrace.o(5316632641536L, 39612);
  }
  
  public final void bvc()
  {
    GMTrace.i(5316095770624L, 39608);
    if (this.qIO == null)
    {
      GMTrace.o(5316095770624L, 39608);
      return;
    }
    this.qIO.jhd.clear();
    this.qIO.jhc = 0;
    this.qIO = null;
    this.qIP = 0;
    GMTrace.o(5316095770624L, 39608);
  }
  
  public final void c(azp paramazp)
  {
    GMTrace.i(5316766859264L, 39613);
    int i = a.aL(paramazp.uNP.toByteArray());
    a.dW("MicroMsg.Voip.VoipSyncHandle", "voipSync remote status changed, status = " + i);
    paramazp = this.qDX;
    i &= 0xFF;
    if ((8 == i) || (9 == i)) {
      paramazp.qFj = i;
    }
    for (;;)
    {
      if ((1 == i) || (3 == i)) {
        paramazp.wg(2);
      }
      paramazp.qFs.wo(i);
      GMTrace.o(5316766859264L, 39613);
      return;
      paramazp.qFh = i;
      paramazp.qFf = i;
    }
  }
  
  public final void o(k paramk)
  {
    GMTrace.i(5316901076992L, 39614);
    this.qDX.qFx = false;
    Object localObject1 = (bqe)((com.tencent.mm.plugin.voip.model.a.m)paramk).bvh();
    this.qDX.qFr.parseSyncKeyBuff(this.qDX.qFv, this.qDX.qFv.length);
    int j = this.qDX.qFr.field_statusSyncKey;
    int k = this.qDX.qFr.field_relayDataSyncKey;
    int m = this.qDX.qFr.field_connectingStatusKey;
    this.qDX.qFr.parseSyncKeyBuff(((bqe)localObject1).tZA.uNP.toByteArray(), ((bqe)localObject1).tZA.uNN);
    int n = this.qDX.qFr.field_statusSyncKey;
    int i1 = this.qDX.qFr.field_relayDataSyncKey;
    int i2 = this.qDX.qFr.field_connectingStatusKey;
    w.d("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: oldStatusSyncKey:" + j + " oldRelayDataSyncKey:" + k + " oldConnectingStatusSyncKey:" + m);
    w.d("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: newStatusSyncKey:" + n + " newRelayDataSyncKey:" + i1 + " newConnectingStatusSyncKey:" + i2);
    this.qDX.qFv = ((bqe)localObject1).tZA.uNP.toByteArray();
    w.d("MicroMsg.Voip.VoipSyncHandle", "voipSync response: continueflag=" + ((bqe)localObject1).tXv);
    localObject1 = ((bqe)localObject1).van.jhd;
    if ((localObject1 != null) && (((LinkedList)localObject1).size() != 0))
    {
      w.d("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size" + ((LinkedList)localObject1).size());
      int i = ((com.tencent.mm.plugin.voip.model.a.m)paramk).bvf();
      w.d("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size:" + ((LinkedList)localObject1).size() + ",selector = " + i);
      i = 0;
      if (i < ((LinkedList)localObject1).size())
      {
        paramk = (bpa)((LinkedList)localObject1).get(i);
        int i3 = paramk.uei;
        if (i3 == 1) {
          if (n > j)
          {
            if (this.qDX.qFr.mjF != 0) {
              break label449;
            }
            a.dU("MicroMsg.Voip.VoipSyncHandle", "voipSyncStatus ignored , roomid = 0");
          }
        }
        for (;;)
        {
          i += 1;
          break;
          label449:
          Object localObject2;
          try
          {
            localObject2 = (bqc)new bqc().aD(paramk.uej.uNP.toByteArray());
            a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus in...from user=" + paramk.lSY + ",itemStatus =  " + ((bqc)localObject2).jhA);
            a((bqc)localObject2, 3);
          }
          catch (IOException paramk)
          {
            w.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramk, "", new Object[0]);
          }
          continue;
          if (i3 == 2)
          {
            if (i1 > k) {
              if (this.qDX.qFr.mjF == 0)
              {
                a.dU("MicroMsg.Voip.VoipSyncHandle", "RelayData ignored , roomid = 0");
              }
              else
              {
                try
                {
                  localObject2 = (bpr)new bpr().aD(paramk.uej.uNP.toByteArray());
                  a.dW("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncRelayData ...relayType = " + ((bpr)localObject2).jib + ",from user = " + paramk.lSY);
                  if (((bpr)localObject2).jib != 5) {
                    break label674;
                  }
                  a((bpr)localObject2);
                }
                catch (IOException paramk)
                {
                  w.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramk, "", new Object[0]);
                }
                continue;
                label674:
                if (((bpr)localObject2).jib == 3)
                {
                  this.qDX.aH(((bpr)localObject2).tTe.uNP.toByteArray());
                  if ((((bpr)localObject2).tTe != null) && (((bpr)localObject2).tTe.uNP != null)) {
                    this.qIN.uXT = ((bpr)localObject2);
                  }
                }
                else if (((bpr)localObject2).jib == 2)
                {
                  this.qDX.aG(((bpr)localObject2).tTe.uNP.toByteArray());
                  if ((((bpr)localObject2).tTe != null) && (((bpr)localObject2).tTe.uNP != null)) {
                    this.qIN.uXS = ((bpr)localObject2);
                  }
                }
                else if (((bpr)localObject2).jib == 1)
                {
                  b((bpr)localObject2);
                }
              }
            }
          }
          else if ((i3 == 3) && (i2 > m)) {
            if (this.qDX.qFr.mjF == 0)
            {
              w.e("MicroMsg.Voip.VoipSyncHandle", "voipSync(ClientStatus) ignored , roomid = 0");
            }
            else
            {
              try
              {
                localObject2 = new azp().bf(paramk.uej.uNP.toByteArray());
                if (!paramk.lSY.equals(q.zE())) {
                  break label907;
                }
                a.dU("MicroMsg.Voip.VoipSyncHandle", "svr response: local connecting status changed.");
              }
              catch (IOException paramk)
              {
                w.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramk, "", new Object[0]);
              }
              continue;
              label907:
              c((azp)localObject2);
            }
          }
        }
      }
    }
    if (((this.qIO != null) && (this.qIO.jhc > 0)) || (this.qIP > 0)) {
      a(null, false, 7);
    }
    GMTrace.o(5316901076992L, 39614);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */