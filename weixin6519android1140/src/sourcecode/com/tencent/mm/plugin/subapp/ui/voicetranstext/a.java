package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awj;
import com.tencent.mm.protocal.c.bmk;
import com.tencent.mm.protocal.c.bnv;
import com.tencent.mm.protocal.c.boa;
import com.tencent.mm.protocal.c.mu;
import com.tencent.mm.protocal.c.mv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int quT;
  public static int quU;
  public static int quV;
  private b gtx;
  private String mFileName;
  public int mState;
  private com.tencent.mm.ad.e nuY;
  private String quP;
  private int quQ;
  private bnv quR;
  private long quS;
  public boa quW;
  public bmk quX;
  public awj quY;
  int quZ;
  
  static
  {
    GMTrace.i(5770691215360L, 42995);
    quT = 1;
    quU = 2;
    quV = 3;
    GMTrace.o(5770691215360L, 42995);
  }
  
  public a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    GMTrace.i(5769885908992L, 42989);
    this.mState = -1;
    a(paramString1, paramInt1, paramInt2, paramLong, paramString2);
    GMTrace.o(5769885908992L, 42989);
  }
  
  public a(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(5769751691264L, 42988);
    this.mState = -1;
    a(paramString1, paramInt, -1, -1L, paramString2);
    GMTrace.o(5769751691264L, 42988);
  }
  
  private void a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    GMTrace.i(5770020126720L, 42990);
    b.a locala = new b.a();
    locala.gtF = new mu();
    locala.gtG = new mv();
    locala.uri = "/cgi-bin/micromsg-bin/checkvoicetrans";
    locala.gtE = 546;
    locala.gtH = 0;
    locala.gtI = 0;
    this.mFileName = paramString2;
    this.gtx = locala.DA();
    w.i("MicroMsg.NetSceneCheckVoiceTrans", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
    if (paramInt2 >= 0) {
      this.quR = d.av(paramInt2, paramString2);
    }
    if (paramLong > 0L) {
      this.quS = paramLong;
    }
    this.quP = paramString1;
    this.quQ = paramInt1;
    GMTrace.o(5770020126720L, 42990);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5770288562176L, 42992);
    this.nuY = parame1;
    parame1 = (mu)this.gtx.gtC.gtK;
    parame1.udw = this.quP;
    parame1.tRC = this.quQ;
    parame1.udx = this.quR;
    parame1.tQd = this.quS;
    int i = a(parame, this.gtx, this);
    GMTrace.o(5770288562176L, 42992);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5770422779904L, 42993);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (mv)this.gtx.gtD.gtK;
      if (paramq == null)
      {
        GMTrace.o(5770422779904L, 42993);
        return;
      }
      this.quW = paramq.udy;
      this.mState = paramq.jhA;
      this.quX = paramq.udz;
      this.quY = paramq.udA;
      this.quZ = paramq.udB;
    }
    for (;;)
    {
      this.nuY.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5770422779904L, 42993);
      return;
      w.i("MicroMsg.NetSceneCheckVoiceTrans", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.quP });
    }
  }
  
  public final boolean brN()
  {
    GMTrace.i(5770556997632L, 42994);
    if ((this.quW != null) && (!bg.nm(this.quW.uXN)))
    {
      GMTrace.o(5770556997632L, 42994);
      return true;
    }
    GMTrace.o(5770556997632L, 42994);
    return false;
  }
  
  public final int getType()
  {
    GMTrace.i(5770154344448L, 42991);
    GMTrace.o(5770154344448L, 42991);
    return 546;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\voicetranstext\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */