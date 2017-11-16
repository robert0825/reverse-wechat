package com.tencent.mm.plugin.subapp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aby;
import com.tencent.mm.protocal.c.abz;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private String filePath;
  private int gsL;
  private RandomAccessFile hdi;
  private int joX;
  String url;
  
  public a(String paramString)
  {
    GMTrace.i(5847195320320L, 43565);
    this.url = paramString;
    this.joX = 0;
    this.gsL = 0;
    this.filePath = null;
    this.hdi = null;
    GMTrace.o(5847195320320L, 43565);
  }
  
  private boolean c(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(5847866408960L, 43570);
    if (paramInt == 0)
    {
      if ((this.hdi != null) || (this.filePath != null))
      {
        w.e("MicroMsg.NetSceneGetPSMImg", "writeFile param error");
        GMTrace.o(5847866408960L, 43570);
        return false;
      }
      this.filePath = com.tencent.mm.pluginsdk.k.a.a.OT(paramString);
      if (this.filePath == null)
      {
        w.e("MicroMsg.NetSceneGetPSMImg", "writeFile getPath From url failed:[" + paramString + "]");
        GMTrace.o(5847866408960L, 43570);
        return false;
      }
    }
    try
    {
      this.hdi = new RandomAccessFile(this.filePath, "rw");
      return false;
    }
    catch (Exception paramString)
    {
      try
      {
        this.hdi.seek(paramInt);
        this.hdi.write(paramArrayOfByte, 0, paramArrayOfByte.length);
        GMTrace.o(5847866408960L, 43570);
        return true;
      }
      catch (IOException paramString)
      {
        w.e("MicroMsg.NetSceneGetPSMImg", "writeFile write file error [" + this.filePath + "]  e:" + paramString.getMessage());
        GMTrace.o(5847866408960L, 43570);
      }
      paramString = paramString;
      w.e("MicroMsg.NetSceneGetPSMImg", "writeFile open file error [" + this.filePath + "] e:" + paramString.getMessage());
      GMTrace.o(5847866408960L, 43570);
      return false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5847329538048L, 43566);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new aby();
    parame1.gtG = new abz();
    parame1.uri = "/cgi-bin/micromsg-bin/getpsmimg";
    parame1.gtE = 141;
    parame1.gtH = 29;
    parame1.gtI = 1000000029;
    parame1 = parame1.DA();
    aby localaby = (aby)parame1.gtC.gtK;
    localaby.URL = this.url;
    localaby.tWu = this.joX;
    w.v("MicroMsg.NetSceneGetPSMImg", "doscene url:[" + this.url + "] + offset:" + this.joX + " totallen:" + this.gsL);
    int i = a(parame, parame1, this);
    GMTrace.o(5847329538048L, 43566);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(5847463755776L, 43567);
    paramq = ((aby)((com.tencent.mm.ad.b)paramq).gtC.gtK).URL;
    if (paramq == null) {
      i = 0;
    }
    while (i == 0)
    {
      w.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : url invalid:" + this.url);
      i = k.b.gun;
      GMTrace.o(5847463755776L, 43567);
      return i;
      if (paramq.indexOf("weixin://") != 0) {
        i = 0;
      } else {
        i = 1;
      }
    }
    if ((this.joX < 0) || (this.gsL < 0))
    {
      w.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.joX + " total:" + this.gsL);
      i = k.b.gun;
      GMTrace.o(5847463755776L, 43567);
      return i;
    }
    if (this.joX == 0)
    {
      if (this.gsL != 0)
      {
        w.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.joX + " total:" + this.gsL);
        i = k.b.gun;
        GMTrace.o(5847463755776L, 43567);
        return i;
      }
    }
    else if (this.joX >= this.gsL)
    {
      w.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.joX + " total:" + this.gsL);
      i = k.b.gun;
      GMTrace.o(5847463755776L, 43567);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(5847463755776L, 43567);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5847732191232L, 43569);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetPSMImg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5847732191232L, 43569);
      return;
    }
    paramq = (abz)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneGetPSMImg", "onGYNetEnd url:[" + this.url + "] + offset:" + this.joX + " Resp[ totallen:" + paramq.tWt + " bufSize:" + paramq.ues.uNN + " ]");
    if (paramq.tWt > 0) {
      this.gsL = paramq.tWt;
    }
    if (!c(this.url, paramq.ues.uNP.tJp, this.joX))
    {
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(5847732191232L, 43569);
      return;
    }
    paramInt1 = this.joX;
    this.joX = (paramq.ues.uNN + paramInt1);
    if (this.gsL <= this.joX)
    {
      w.d("MicroMsg.NetSceneGetPSMImg", "down url:[" + this.url + "] final size: " + this.gsL);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5847732191232L, 43569);
      return;
    }
    if (a(this.gtW, this.fUd) < 0) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5847732191232L, 43569);
  }
  
  public final int getType()
  {
    GMTrace.i(5848000626688L, 43571);
    GMTrace.o(5848000626688L, 43571);
    return 141;
  }
  
  protected final int vB()
  {
    GMTrace.i(5847597973504L, 43568);
    GMTrace.o(5847597973504L, 43568);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */