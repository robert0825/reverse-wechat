package com.tencent.mm.plugin.multitalk.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apt;
import com.tencent.mm.protocal.c.apu;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  byte[] eWZ;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  int kwN;
  int kwO;
  
  public n(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(4752112877568L, 35406);
    this.kwN = paramInt1;
    this.kwO = paramInt2;
    b.a locala = new b.a();
    locala.gtF = new apt();
    locala.gtG = new apu();
    String str;
    switch (paramInt2)
    {
    case 1920: 
    case 1921: 
    case 1922: 
    case 1923: 
    case 1924: 
    case 1925: 
    case 1926: 
    case 1930: 
    case 1934: 
    case 1936: 
    default: 
      str = "";
    }
    for (;;)
    {
      w.i("MicroMsg.MT.NetSceneMultiTalk", "netSceneMultiTalk cmdid %d cgiName %s", new Object[] { Integer.valueOf(paramInt2), str });
      locala.uri = str;
      locala.gtE = this.kwO;
      locala.gtH = 0;
      locala.gtI = 0;
      this.fUa = locala.DA();
      ((apt)this.fUa.gtC.gtK).tTe = new azp().be(paramArrayOfByte);
      GMTrace.o(4752112877568L, 35406);
      return;
      str = "/cgi-bin/qcwxmultitalk-bin/createtalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/entertalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/exittalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/cancelcreatetalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/rejectentertalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/addmembers";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/hellotalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/miscinfo";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/voiceackreq";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/oiceredirectreq";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/getgroupinfobatch";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/memberwhisper";
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4752381313024L, 35408);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4752381313024L, 35408);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4752515530752L, 35409);
    w.d("MicroMsg.MT.NetSceneMultiTalk", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " " + this.kwO);
    this.eWZ = com.tencent.mm.platformtools.n.a(((apu)((b)paramq).gtD.gtK).tTe);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4752515530752L, 35409);
  }
  
  public final int getType()
  {
    GMTrace.i(4752247095296L, 35407);
    int i = this.kwO;
    GMTrace.o(4752247095296L, 35407);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */