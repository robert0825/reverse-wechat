package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hr;
import com.tencent.mm.protocal.c.hs;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public h(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3)
  {
    GMTrace.i(6058185588736L, 45137);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new hr();
    ((b.a)localObject).gtG = new hs();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanproductreport";
    ((b.a)localObject).gtE = 1064;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (hr)this.fUa.gtC.gtK;
    ((hr)localObject).tWD = d.tJw;
    ((hr)localObject).tWE = d.tJv;
    ((hr)localObject).tWF = d.tJy;
    ((hr)localObject).tWG = d.tJz;
    ((hr)localObject).tWH = v.bPK();
    ((hr)localObject).oqP = 11294;
    ((hr)localObject).tWI = null;
    ((hr)localObject).osT = paramString1;
    ((hr)localObject).osS = paramString2;
    ((hr)localObject).type = paramInt1;
    ((hr)localObject).value = paramString3;
    ((hr)localObject).count = paramInt2;
    ((hr)localObject).nBz = paramInt3;
    w.v("MircoMsg.NetSceneScanProductReport", "statid:" + paramString2);
    GMTrace.o(6058185588736L, 45137);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6058588241920L, 45140);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6058588241920L, 45140);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6058319806464L, 45138);
    w.d("MircoMsg.NetSceneScanProductReport", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6058319806464L, 45138);
  }
  
  public final int getType()
  {
    GMTrace.i(6058454024192L, 45139);
    GMTrace.o(6058454024192L, 45139);
    return 1064;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */