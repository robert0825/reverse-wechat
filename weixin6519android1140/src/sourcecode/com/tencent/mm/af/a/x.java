package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkj;
import com.tencent.mm.protocal.c.bkk;
import com.tencent.mm.protocal.c.hb;
import com.tencent.mm.sdk.platformtools.w;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public x(String paramString1, String paramString2, hb paramhb1, hb paramhb2, Object paramObject)
  {
    GMTrace.i(4578703572992L, 34114);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bkj();
    ((b.a)localObject).gtG = new bkk();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/updatebizchatmemberlist";
    ((b.a)localObject).gtE = 1357;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bkj)this.fUa.gtC.gtK;
    ((bkj)localObject).tVU = paramString1;
    ((bkj)localObject).tVO = paramString2;
    ((bkj)localObject).uVf = paramhb1;
    ((bkj)localObject).uVg = paramhb2;
    this.data = paramObject;
    GMTrace.o(4578703572992L, 34114);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4579106226176L, 34117);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4579106226176L, 34117);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4578837790720L, 34115);
    w.d("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4578837790720L, 34115);
  }
  
  public final int getType()
  {
    GMTrace.i(4578972008448L, 34116);
    GMTrace.o(4578972008448L, 34116);
    return 1357;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */