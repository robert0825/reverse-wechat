package com.tencent.mm.plugin.w;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbh;
import com.tencent.mm.protocal.c.bbi;
import com.tencent.mm.protocal.c.cv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String aeskey;
  private String eML;
  private String fJS;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private int nlB;
  
  public d(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(14714692173824L, 109633);
    this.eML = paramString1;
    this.aeskey = paramString2;
    this.nlB = paramInt;
    this.fJS = paramString3;
    paramString2 = new b.a();
    paramString2.gtF = new bbh();
    paramString2.gtG = new bbi();
    paramString2.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    paramString2.gtE = 222;
    paramString2.gtH = 107;
    paramString2.gtI = 1000000107;
    this.fUa = paramString2.DA();
    w.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "MsgSynchronizeSendAppMsgNetScene fileId[%s], fileLen[%d], selfName[%s], stack[%s]", new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, bg.bQW() });
    GMTrace.o(14714692173824L, 109633);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14714826391552L, 109634);
    this.fUd = parame1;
    parame1 = new f.a();
    parame1.title = "PCSYNC";
    parame1.description = "ANDROID_PCSYNC";
    parame1.type = 35;
    parame1.url = this.eML;
    parame1.giJ = this.aeskey;
    parame1.giv = this.nlB;
    parame1.giK = this.aeskey;
    parame1.showType = 0;
    bbh localbbh = (bbh)this.fUa.gtC.gtK;
    cv localcv = new cv();
    localcv.lSY = this.fJS;
    localcv.tQM = parame1.sdkVer;
    localcv.jib = 35;
    localcv.lSX = this.fJS;
    localcv.nIp = f.a.a(parame1, null, null, 0, 0);
    localcv.nFd = ((int)bg.Pu());
    localbbh.uOF = localcv;
    int i = a(parame, this.fUa, this);
    GMTrace.o(14714826391552L, 109634);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(14715229044736L, 109637);
    int i = k.b.gum;
    GMTrace.o(14715229044736L, 109637);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14714960609280L, 109635);
    w.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "msgSynchronize sendAppMsg onGYNetEnd. [%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14714960609280L, 109635);
  }
  
  public final int getType()
  {
    GMTrace.i(14715094827008L, 109636);
    GMTrace.o(14715094827008L, 109636);
    return 222;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\w\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */