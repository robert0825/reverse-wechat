package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aas;
import com.tencent.mm.protocal.c.aat;
import com.tencent.mm.protocal.c.aau;
import com.tencent.mm.protocal.c.aav;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class z
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  private String kAb;
  b kzP;
  
  public z(LinkedList<aat> paramLinkedList, String paramString1, String paramString2)
  {
    GMTrace.i(10949616467968L, 81581);
    this.kAb = "";
    this.kzP = null;
    this.fXo = null;
    this.kAb = paramString2;
    paramString2 = new b.a();
    paramString2.gtF = new aau();
    paramString2.gtG = new aav();
    paramString2.uri = "/cgi-bin/micromsg-bin/getharddeviceoperticket";
    paramString2.gtE = 543;
    paramString2.gtH = 0;
    paramString2.gtI = 0;
    this.kzP = paramString2.DA();
    paramString2 = (aau)this.kzP.gtC.gtK;
    if (!bg.nm(paramString1))
    {
      aas localaas = new aas();
      localaas.tTT = paramString1;
      paramString2.urt = localaas;
    }
    paramString2.urs = paramLinkedList;
    GMTrace.o(10949616467968L, 81581);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10949884903424L, 81583);
    this.fXo = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(10949884903424L, 81583);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10950019121152L, 81584);
    w.i("MicroMsg.exdevice.NetsceneGetHardDeviceOperTicket", "GetHardDeviceOperTicket onGYNetEnd netId = %s, errType = %s, errCode = %s, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10950019121152L, 81584);
  }
  
  public final int getType()
  {
    GMTrace.i(10949750685696L, 81582);
    GMTrace.o(10949750685696L, 81582);
    return 543;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */