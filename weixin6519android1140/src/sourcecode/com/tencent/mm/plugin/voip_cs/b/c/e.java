package com.tencent.mm.plugin.voip_cs.b.c;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.h;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.protocal.c.bot;
import com.tencent.mm.protocal.c.bou;
import com.tencent.mm.protocal.c.bov;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public e(long paramLong1, long paramLong2)
  {
    GMTrace.i(11256035540992L, 83864);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bou();
    ((b.a)localObject1).gtG = new bov();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/csvoipreport";
    ((b.a)localObject1).gtE = 312;
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.fUa = ((b.a)localObject1).DA();
    localObject1 = (bou)this.fUa.gtC.gtK;
    ((bou)localObject1).uYy = paramLong1;
    ((bou)localObject1).uhV = paramLong2;
    Object localObject2 = ((bou)localObject1).uYO;
    Object localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
    Object localObject4 = new bot();
    ((bot)localObject4).jib = 1;
    ((bot)localObject4).uYN = ((c)localObject3).mln;
    w.i("MicroMsg.VoipCSReportHelper", "getVoipCSChannelReportData, result: %s", new Object[] { ((bot)localObject4).uYN });
    ((LinkedList)localObject2).add(localObject4);
    ((bou)localObject1).uYO.add(com.tencent.mm.plugin.voip_cs.b.b.bwq().bws());
    localObject2 = ((bou)localObject1).uYO;
    localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
    localObject4 = new bot();
    ((bot)localObject4).jib = 3;
    ((c)localObject3).qJH = at.AS().ss();
    ((c)localObject3).wH(com.tencent.mm.plugin.voip_cs.b.a.a.bww().qIy.bwd());
    int i = ((c)localObject3).qwP & 0xFF;
    ((c)localObject3).qKS = i;
    ((c)localObject3).qKS = i;
    ((c)localObject3).qRH = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_audioDuration;
    ((c)localObject3).qRI = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_videoDuration;
    if ((((c)localObject3).qRl != 1) && (((c)localObject3).qRT != 1))
    {
      ((c)localObject3).qRz = 1;
      ((c)localObject3).qRs = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
      v2protocal localv2protocal = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO;
      localv2protocal.setJNIAppCmd(1, localv2protocal.qKA, localv2protocal.qKA.length);
      i = (int)(v2protocal.aK(localv2protocal.qKA) / 1000L);
      if ((((c)localObject3).qRO == 0) || (i <= ((c)localObject3).qRO)) {
        break label1629;
      }
      i -= ((c)localObject3).qRO;
      label409:
      ((c)localObject3).qRG = i;
      ((bot)localObject4).uYN = (((c)localObject3).qJB + "," + ((c)localObject3).qRp + "," + ((c)localObject3).mjG + "," + ((c)localObject3).qRq + "," + ((c)localObject3).qRr + "," + ((c)localObject3).qJo + "," + ((c)localObject3).qRs + "," + ((c)localObject3).qRt + "," + ((c)localObject3).qRu + "," + ((c)localObject3).qRv + "," + ((c)localObject3).qJH + "," + ((c)localObject3).qJG + "," + ((c)localObject3).qRw + "," + ((c)localObject3).qRx + "," + ((c)localObject3).qRy + "," + ((c)localObject3).qRz + "," + ((c)localObject3).qRA + "," + ((c)localObject3).qRB + "," + ((c)localObject3).qRC + "," + ((c)localObject3).qRD + "," + ((c)localObject3).qRE + "," + ((c)localObject3).qRF + "," + ((c)localObject3).qRG + "," + ((c)localObject3).mld + "," + ((c)localObject3).qRH + "," + ((c)localObject3).qRI + "," + ((c)localObject3).channelStrategy + "," + ((c)localObject3).qKS + "," + ((c)localObject3).qJI + "," + ((c)localObject3).qRJ + "," + ((c)localObject3).qRK + "," + ((c)localObject3).qRL + "," + ((c)localObject3).deviceModel + "," + ((c)localObject3).qRM + "," + ((c)localObject3).qRN);
      w.i("MicroMsg.VoipCSReportHelper", "getVoipCSClientReportData, result: %s", new Object[] { ((bot)localObject4).uYN });
      ((LinkedList)localObject2).add(localObject4);
      localObject1 = ((bou)localObject1).uYO;
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      localObject3 = new bot();
      ((bot)localObject3).jib = 4;
      ((c)localObject2).networkType = c.getNetType(ab.getContext());
      localObject4 = ((TelephonyManager)ab.getContext().getSystemService("phone")).getSimOperator();
      if (localObject4 == null) {
        break label1669;
      }
      if ((!((String)localObject4).equals("46000")) && (!((String)localObject4).equals("46002")) && (!((String)localObject4).equals("46007"))) {
        break label1635;
      }
      i = 1;
      label1006:
      ((c)localObject2).qRm = i;
      ((c)localObject2).qRd = ((int)(System.currentTimeMillis() / 1000L));
      ((c)localObject2).qRn = c.bwt();
      ((c)localObject2).qJH = at.AS().ss();
      localObject4 = com.tencent.mm.plugin.voip.model.k.buC();
      if (((com.tencent.mm.plugin.voip.model.k)localObject4).qHY == 0) {
        break label1675;
      }
      i = ((com.tencent.mm.plugin.voip.model.k)localObject4).qHX / ((com.tencent.mm.plugin.voip.model.k)localObject4).qHY;
      label1071:
      ((c)localObject2).qRo = i;
      if (((c)localObject2).qRo == -1)
      {
        localObject4 = new byte[4];
        if (com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.setAppCmd(10, (byte[])localObject4, 4) >= 0) {
          break label1681;
        }
        ((c)localObject2).qRo = 0;
        w.d("MicroMsg.VoipCSReportHelper", "get netStatus failed");
      }
    }
    for (;;)
    {
      w.i("MicroMsg.VoipCSReportHelper", "getVoipCSThirdPartData Report dataType=%d, dataTime=%s, isClickClose=%d, clickCloseTime=%s, videoFps=%d, videoRate=%d, cameraPixelWidth=%d, cameraPixelHeight=%d, recordPixelWidth=%d, recordPixelHeight=%d, cameraState=%d, networkType=%s, mobileType=%s, mobileNetworkType=%s, networkQuality=%d", new Object[] { Integer.valueOf(((c)localObject2).aGU), Integer.valueOf(((c)localObject2).qRd), Integer.valueOf(((c)localObject2).qRe), Integer.valueOf(((c)localObject2).qRf), Integer.valueOf(((c)localObject2).videoFps), Integer.valueOf(((c)localObject2).qRg), Integer.valueOf(((c)localObject2).qRh), Integer.valueOf(((c)localObject2).qRi), Integer.valueOf(((c)localObject2).qRj), Integer.valueOf(((c)localObject2).qRk), Integer.valueOf(((c)localObject2).qRl), Integer.valueOf(((c)localObject2).networkType), Integer.valueOf(((c)localObject2).qRm), Integer.valueOf(((c)localObject2).qRn), Integer.valueOf(((c)localObject2).qRo) });
      ((bot)localObject3).uYN = (((c)localObject2).aGU + "," + ((c)localObject2).qRd + "," + ((c)localObject2).qRe + "," + ((c)localObject2).qRf + "," + ((c)localObject2).videoFps + "," + ((c)localObject2).qRg + "," + ((c)localObject2).qRh + "," + ((c)localObject2).qRi + "," + ((c)localObject2).qRj + "," + ((c)localObject2).qRk + "," + ((c)localObject2).qRl + "," + ((c)localObject2).networkType + "," + ((c)localObject2).qRm + "," + ((c)localObject2).qRn + "," + ((c)localObject2).qRo + "," + ((c)localObject2).qRp + "," + ((c)localObject2).mjG);
      w.d("MicroMsg.VoipCSReportHelper", "getVoipCSThirdPartData, result: " + ((bot)localObject3).uYN);
      ((LinkedList)localObject1).add(localObject3);
      GMTrace.o(11256035540992L, 83864);
      return;
      if (((c)localObject3).qRl != 1)
      {
        ((c)localObject3).qRz = 2;
        break;
      }
      if (((c)localObject3).qRT != 1)
      {
        ((c)localObject3).qRz = 3;
        break;
      }
      ((c)localObject3).qRz = 0;
      break;
      label1629:
      i = 0;
      break label409;
      label1635:
      if (((String)localObject4).equals("46001"))
      {
        i = 3;
        break label1006;
      }
      if (((String)localObject4).equals("46003"))
      {
        i = 2;
        break label1006;
      }
      label1669:
      i = 0;
      break label1006;
      label1675:
      i = -1;
      break label1071;
      label1681:
      ((c)localObject2).qRo = bg.byteArrayToInt((byte[])localObject4);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11256438194176L, 83867);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11256438194176L, 83867);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11256169758720L, 83865);
    w.i("MicroMsg.NetSceneVoipCSReport", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11256169758720L, 83865);
  }
  
  public final int getType()
  {
    GMTrace.i(11256303976448L, 83866);
    GMTrace.o(11256303976448L, 83866);
    return 312;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */