package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awr;
import com.tencent.mm.protocal.c.aws;
import com.tencent.mm.sdk.platformtools.w;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public v(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4571321597952L, 34059);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new awr();
    ((b.a)localObject).gtG = new aws();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/qymsgstatenotify";
    ((b.a)localObject).gtE = 1361;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (awr)this.fUa.gtC.gtK;
    ((awr)localObject).tVU = paramString1;
    ((awr)localObject).tVO = paramString2;
    ((awr)localObject).time_stamp = paramInt;
    GMTrace.o(4571321597952L, 34059);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4571724251136L, 34062);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneQyMsgStateNotify", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4571724251136L, 34062);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4571455815680L, 34060);
    w.d("MicroMsg.NetSceneQyMsgStateNotify", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4571455815680L, 34060);
  }
  
  public final int getType()
  {
    GMTrace.i(4571590033408L, 34061);
    GMTrace.o(4571590033408L, 34061);
    return 1361;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */