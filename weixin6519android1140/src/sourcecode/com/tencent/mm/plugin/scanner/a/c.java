package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hh;
import com.tencent.mm.protocal.c.hi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(String paramString1, LinkedList<String> paramLinkedList, int paramInt, String paramString2, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(6058722459648L, 45141);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new hh();
    ((b.a)localObject).gtG = new hi();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetactioninfo";
    ((b.a)localObject).gtE = 1068;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (hh)this.fUa.gtC.gtK;
    ((hh)localObject).tRS = paramString1;
    ((hh)localObject).tOG = paramInt;
    ((hh)localObject).tWl = paramString2;
    ((hh)localObject).tWk = paramLinkedList;
    ((hh)localObject).tWn = paramDouble2;
    ((hh)localObject).tWm = paramDouble1;
    GMTrace.o(6058722459648L, 45141);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6059125112832L, 45144);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6059125112832L, 45144);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6058856677376L, 45142);
    w.i("MicroMsg.NetSceneGetActionInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6058856677376L, 45142);
  }
  
  public final int getType()
  {
    GMTrace.i(6058990895104L, 45143);
    GMTrace.o(6058990895104L, 45143);
    return 1068;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */