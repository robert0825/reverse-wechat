package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bog;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.protocal.c.bpm;
import com.tencent.mm.protocal.c.bpr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class b
  extends n<bog, boh>
{
  public String TAG;
  
  public b(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(5294486716416L, 39447);
    this.TAG = "MicroMsg.NetSceneVoipAnswer";
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bog();
    ((b.a)localObject1).gtG = new boh();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/voipanswer";
    ((b.a)localObject1).gtE = 172;
    ((b.a)localObject1).gtH = 65;
    ((b.a)localObject1).gtI = 1000000065;
    this.fUa = ((b.a)localObject1).DA();
    localObject1 = (bog)this.fUa.gtC.gtK;
    ((bog)localObject1).uYf = paramInt1;
    ((bog)localObject1).uhU = paramInt3;
    ((bog)localObject1).udE = paramInt2;
    Object localObject2 = new bpr();
    ((bpr)localObject2).jib = 2;
    azp localazp = new azp();
    localazp.be(paramArrayOfByte1);
    ((bpr)localObject2).tTe = localazp;
    ((bog)localObject1).uXS = ((bpr)localObject2);
    paramArrayOfByte1 = new bpr();
    paramArrayOfByte1.jib = 3;
    localObject2 = new azp();
    ((azp)localObject2).be(paramArrayOfByte2);
    paramArrayOfByte1.tTe = ((azp)localObject2);
    ((bog)localObject1).uXT = paramArrayOfByte1;
    ((bog)localObject1).uhV = paramLong;
    if (paramBoolean2) {
      if (!paramBoolean1) {
        break label256;
      }
    }
    label256:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      ((bog)localObject1).uYg = paramInt1;
      ((bog)localObject1).uXW = System.currentTimeMillis();
      GMTrace.o(5294486716416L, 39447);
      return;
    }
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5294755151872L, 39449);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5289654878208L, 39411);
        a.dV(b.this.TAG, "Anwser response:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " status:" + b.this.qFK.mStatus);
        if (b.this.qFK.mStatus == 1)
        {
          a.dV(b.this.TAG, "reject ok!");
          GMTrace.o(5289654878208L, 39411);
          return;
        }
        if (b.this.qFK.mStatus != 4)
        {
          a.dU(b.this.TAG, "Anwser response not within WAITCONNECT, ignored.");
          GMTrace.o(5289654878208L, 39411);
          return;
        }
        if (paramAnonymousInt1 != 0)
        {
          if (paramAnonymousInt1 == 4)
          {
            b.this.qFK.qFr.qKT.qGe = 12;
            b.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
            b.this.qFK.r(1, paramAnonymousInt2, "");
            GMTrace.o(5289654878208L, 39411);
            return;
          }
          b.this.qFK.qFr.qKT.qGe = 12;
          b.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
          b.this.qFK.r(1, 56532, "");
          GMTrace.o(5289654878208L, 39411);
          return;
        }
        paramAnonymousString = (boh)b.this.bvh();
        b.this.qFK.qFr.mjF = paramAnonymousString.uhU;
        b.this.qFK.qFr.mjG = paramAnonymousString.uhV;
        b.this.qFK.qFr.mjN = paramAnonymousString.uXX;
        b.this.qFK.qFr.qJU = paramAnonymousString.uYj;
        b.this.qFK.qFr.qJV = paramAnonymousString.uYk;
        b.this.qFK.qFr.qJW = paramAnonymousString.uYl;
        b.this.qFK.qFr.qJX = paramAnonymousString.uYm;
        b.this.qFK.qFr.qJZ = paramAnonymousString.uYo;
        b.this.qFK.qFr.qJY = paramAnonymousString.uYt;
        b.this.qFK.qFr.qJz = paramAnonymousString.uYb;
        b.this.qFK.qFr.qKa = paramAnonymousString.uYv;
        b.this.qFK.wk(paramAnonymousString.uXZ);
        b.this.qFK.qFr.qJA = paramAnonymousString.uYc;
        a.dV(b.this.TAG, "onAnwserResp: audioTsdfBeyond3G = " + b.this.qFK.qFr.qJU + ",audioTsdEdge = " + b.this.qFK.qFr.qJV + ",passthroughQosAlgorithm = " + b.this.qFK.qFr.qJW + ",fastPlayRepair = " + b.this.qFK.qFr.qJX + ", audioDtx = " + b.this.qFK.qFr.qJZ + ", switchtcppktCnt=" + b.this.qFK.qFr.qJy + ", SvrCfgListV=" + b.this.qFK.qFr.qJY + ", setMaxBRForRelay=" + b.this.qFK.qFr.qKa + ", RedirectreqThreshold=" + paramAnonymousString.uXY.uZC + ", BothSideSwitchFlag=" + paramAnonymousString.uXY.uZD + ", WifiScanInterval=" + paramAnonymousString.uYc);
        b.this.qFK.qFr.qKb = paramAnonymousString.uYs;
        a.dV(b.this.TAG, "answerResp AudioAecMode5 = " + b.this.qFK.qFr.qKb);
        b.this.qFK.qER = true;
        a.dV(b.this.TAG, "answer ok, roomid =" + b.this.qFK.qFr.mjF + ",memberid = " + b.this.qFK.qFr.mjN);
        paramAnonymousString = paramAnonymousString.uXY;
        if (paramAnonymousString.mkb > 0)
        {
          paramAnonymousString.mkb -= 1;
          a.dV(b.this.TAG, "zhengxue[ENCRYPT] got encryptStrategy[" + paramAnonymousString.mkb + "] from answerresp relaydata");
        }
        for (;;)
        {
          a.dV(b.this.TAG, "answer with relayData peerid.length =" + paramAnonymousString.uXS.tTe.uNN);
          a.dV(b.this.TAG, "answer with relayData capinfo.length =" + paramAnonymousString.uXT.tTe.uNN);
          b.this.qFK.wj(paramAnonymousString.uZh);
          try
          {
            at.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19596459376640L, 146005);
                b.this.qFK.a(paramAnonymousString.uZi, paramAnonymousString.uZj, paramAnonymousString.uZq);
                if (paramAnonymousString.uXS.tTe.uNP != null)
                {
                  b.this.qFK.aG(paramAnonymousString.uXS.tTe.uNP.toByteArray());
                  if ((paramAnonymousString.uZo != null) && (paramAnonymousString.uZo.uNP != null) && (paramAnonymousString.uZA != null) && (paramAnonymousString.uZA.uNP != null)) {
                    b.this.qFK.a(paramAnonymousString.uZo.uNP.toByteArray(), paramAnonymousString.uZn, paramAnonymousString.mkb, paramAnonymousString.uZA.uNP.toByteArray());
                  }
                  b.this.qFK.g(paramAnonymousString.uZr, paramAnonymousString.uZs, paramAnonymousString.uZt, paramAnonymousString.uZu, paramAnonymousString.uZv);
                  b.this.qFK.wi(paramAnonymousString.uZz);
                  if ((paramAnonymousString.uZx != null) && (paramAnonymousString.uZy != null) && (paramAnonymousString.uZx.uNP != null) && (paramAnonymousString.uZy.uNP != null)) {
                    b.this.qFK.b(paramAnonymousString.uZw, paramAnonymousString.uZx.uNP.toByteArray(), paramAnonymousString.uZy.uNP.toByteArray());
                  }
                  if (paramAnonymousString.uXT.tTe.uNP == null) {
                    break label536;
                  }
                  b.this.qFK.aH(paramAnonymousString.uXT.tTe.uNP.toByteArray());
                }
                for (;;)
                {
                  b.this.qFK.wh(paramAnonymousString.uZC);
                  b.this.qFK.qFr.qKp = paramAnonymousString.uZD;
                  if (!b.this.qFK.qET) {
                    break label638;
                  }
                  b.this.qFK.qET = false;
                  if (b.this.qFK.qEO != true) {
                    break label554;
                  }
                  a.dV(b.this.TAG, "channel pre-connect already success, start talk");
                  b.this.qFK.btR();
                  GMTrace.o(19596459376640L, 146005);
                  return;
                  w.e(b.this.TAG, "multiRelayData.PeerId.Buffer.getBuffer() is null");
                  break;
                  label536:
                  w.e(b.this.TAG, "multiRelayData.CapInfo.Buffer.getBuffer() is null");
                }
                label554:
                if (b.this.qFK.qES == true)
                {
                  a.dV(b.this.TAG, "channel pre-connect already failed");
                  b.this.qFK.r(1, 56536, "");
                  GMTrace.o(19596459376640L, 146005);
                  return;
                }
                a.dV(b.this.TAG, "channel pre-connect still connecting...");
                GMTrace.o(19596459376640L, 146005);
                return;
                label638:
                w.i(b.this.TAG, "isPreConnect is false");
                b.this.qFK.btW();
                b.this.qFK.btV();
                GMTrace.o(19596459376640L, 146005);
              }
            });
            GMTrace.o(5289654878208L, 39411);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e(b.this.TAG, "get proxy ip fail..");
            GMTrace.o(5289654878208L, 39411);
          }
          paramAnonymousString.mkb = 1;
          a.dV(b.this.TAG, "zhengxue[LOGIC]:got no EncryptStrategy in answerresp mrdata");
        }
      }
    };
    GMTrace.o(5294755151872L, 39449);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5294620934144L, 39448);
    GMTrace.o(5294620934144L, 39448);
    return 172;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */