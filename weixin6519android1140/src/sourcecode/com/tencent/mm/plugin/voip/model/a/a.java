package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.boc;
import com.tencent.mm.protocal.c.bod;
import com.tencent.mm.protocal.c.bpm;
import com.tencent.mm.protocal.c.bpr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.y.at;

public final class a
  extends n<boc, bod>
{
  public String TAG;
  
  public a(int paramInt1, long paramLong, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    GMTrace.i(5295828893696L, 39457);
    this.TAG = "MicroMsg.NetSceneVoipAck";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new boc();
    ((b.a)localObject).gtG = new bod();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipack";
    ((b.a)localObject).gtE = 305;
    ((b.a)localObject).gtH = 123;
    ((b.a)localObject).gtI = 1000000123;
    this.fUa = ((b.a)localObject).DA();
    localObject = (boc)this.fUa.gtC.gtK;
    ((boc)localObject).uhU = paramInt1;
    ((boc)localObject).uhV = paramLong;
    ((boc)localObject).uXV = paramInt2;
    if (paramInt2 != 1)
    {
      ((boc)localObject).uXR = 0;
      GMTrace.o(5295828893696L, 39457);
      return;
    }
    ((boc)localObject).uXU = paramString;
    paramString = new bpr();
    paramString.jib = 2;
    azp localazp = new azp();
    localazp.be(paramArrayOfByte1);
    paramString.tTe = localazp;
    ((boc)localObject).uXS = paramString;
    paramArrayOfByte1 = new bpr();
    paramArrayOfByte1.jib = 3;
    paramString = new azp();
    paramString.be(paramArrayOfByte2);
    paramArrayOfByte1.tTe = paramString;
    ((boc)localObject).uXT = paramArrayOfByte1;
    ((boc)localObject).uXW = System.currentTimeMillis();
    ((boc)localObject).uXR = 1;
    GMTrace.o(5295828893696L, 39457);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5296097329152L, 39459);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, final k paramAnonymousk)
      {
        GMTrace.i(5297439506432L, 39469);
        com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "ack response:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " status:" + a.this.qFK.mStatus);
        if (a.this.qFK.mStatus == 1)
        {
          com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "reject ok!");
          GMTrace.o(5297439506432L, 39469);
          return;
        }
        if (a.this.qFK.mStatus != 3)
        {
          com.tencent.mm.plugin.voip.b.a.dU(a.this.TAG, "ack response not within WAITCONNECT, ignored.");
          GMTrace.o(5297439506432L, 39469);
          return;
        }
        if (paramAnonymousInt1 != 0)
        {
          if (paramAnonymousInt1 == 4)
          {
            a.this.qFK.qFr.qKT.qGe = 12;
            a.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
            a.this.qFK.r(1, paramAnonymousInt2, "");
            GMTrace.o(5297439506432L, 39469);
            return;
          }
          a.this.qFK.qFr.qKT.qGe = 12;
          a.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
          a.this.qFK.r(1, 56532, "");
          GMTrace.o(5297439506432L, 39469);
          return;
        }
        paramAnonymousString = (bod)a.this.bvh();
        if (paramAnonymousString.uXR != 1)
        {
          com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "onVoipAckResp: do not use preconnect");
          GMTrace.o(5297439506432L, 39469);
          return;
        }
        a.this.qFK.qET = true;
        a.this.qFK.qFr.qJS = 1;
        a.this.qFK.qFr.mjF = paramAnonymousString.uhU;
        a.this.qFK.qFr.mjG = paramAnonymousString.uhV;
        a.this.qFK.qFr.mjN = paramAnonymousString.uXX;
        a.this.qFK.qFr.qJz = paramAnonymousString.uYb;
        a.this.qFK.qFr.qJA = paramAnonymousString.uYc;
        a.this.qFK.wk(paramAnonymousString.uXZ);
        com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "ack ok, roomid =" + a.this.qFK.qFr.mjF + ",memberid = " + a.this.qFK.qFr.mjN);
        paramAnonymousk = paramAnonymousString.uXY;
        if (paramAnonymousk.mkb > 0)
        {
          paramAnonymousk.mkb -= 1;
          com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "zhengxue[ENCRYPT] got encryptStrategy[" + paramAnonymousk.mkb + "] from ackresp relaydata");
        }
        for (;;)
        {
          com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "ack with switchtcpcnt  =" + a.this.qFK.qFr.qJy + " RedirectReqThreshold =" + paramAnonymousk.uZC + " BothSideSwitchFlag =" + paramAnonymousk.uZD + " WifiScanInterval =" + paramAnonymousString.uYc);
          a.this.qFK.qFr.qKp = paramAnonymousk.uZD;
          a.this.qFK.wj(paramAnonymousk.uZh);
          a.this.qFK.aG(paramAnonymousk.uXS.tTe.uNP.toByteArray());
          if ((paramAnonymousk.uZo != null) && (paramAnonymousk.uZo.uNP != null) && (paramAnonymousk.uZA != null) && (paramAnonymousk.uZA.uNP != null)) {
            a.this.qFK.a(paramAnonymousk.uZo.uNP.toByteArray(), paramAnonymousk.uZn, paramAnonymousk.mkb, paramAnonymousk.uZA.uNP.toByteArray());
          }
          a.this.qFK.g(paramAnonymousk.uZr, paramAnonymousk.uZs, paramAnonymousk.uZt, paramAnonymousk.uZu, paramAnonymousk.uZv);
          a.this.qFK.aH(paramAnonymousk.uXT.tTe.uNP.toByteArray());
          at.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19596190941184L, 146003);
              a.this.qFK.a(paramAnonymousk.uZi, paramAnonymousk.uZj, paramAnonymousk.uZq);
              a.this.qFK.wi(paramAnonymousk.uZz);
              a.this.qFK.wh(paramAnonymousk.uZC);
              if ((paramAnonymousk.uZx != null) && (paramAnonymousk.uZy != null)) {
                a.this.qFK.b(paramAnonymousk.uZw, paramAnonymousk.uZx.uNP.toByteArray(), paramAnonymousk.uZy.uNP.toByteArray());
              }
              d.btG().buT();
              com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "ack success, try connect channel");
              a.this.qFK.btV();
              GMTrace.o(19596190941184L, 146003);
            }
          });
          GMTrace.o(5297439506432L, 39469);
          return;
          paramAnonymousk.mkb = 1;
          com.tencent.mm.plugin.voip.b.a.dV(a.this.TAG, "zhengxue[LOGIC]:got no EncryptStrategy in ackresp mrdata");
        }
      }
    };
    GMTrace.o(5296097329152L, 39459);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5295963111424L, 39458);
    GMTrace.o(5295963111424L, 39458);
    return 305;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */