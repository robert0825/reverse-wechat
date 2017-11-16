package com.tencent.mm.plugin.profile.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afs;
import com.tencent.mm.protocal.c.aft;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String nKY;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(6718402592768L, 50056);
    this.nKY = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new afs();
    ((b.a)localObject).gtG = new aft();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwburl";
    ((b.a)localObject).gtE = 205;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (afs)this.fUa.gtC.gtK;
    ((afs)localObject).jhi = paramString2;
    at.AR();
    paramString2 = bg.nl((String)c.xh().get(46, null));
    ((afs)localObject).tSj = new azp().be(bg.St(paramString2));
    at.AR();
    String str = bg.nl((String)c.xh().get(72, null));
    ((afs)localObject).unP = new azp().be(bg.St(str));
    w.d("MicroMsg.NetSceneGetWeiboURL", "dkwt get weibo url with id=" + paramString1 + ", a2=" + paramString2 + " , newa2:" + str);
    GMTrace.o(6718402592768L, 50056);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6718671028224L, 50058);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6718671028224L, 50058);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6718805245952L, 50059);
    w.d("MicroMsg.NetSceneGetWeiboURL", "dkwt onGYNetEnd:[%d,%d] get weibo url result:[%s] ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), getURL() });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6718805245952L, 50059);
  }
  
  public final int getType()
  {
    GMTrace.i(6718536810496L, 50057);
    GMTrace.o(6718536810496L, 50057);
    return 205;
  }
  
  public final String getURL()
  {
    GMTrace.i(6718939463680L, 50060);
    String str = ((aft)this.fUa.gtD.gtK).URL;
    GMTrace.o(6718939463680L, 50060);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */