package com.tencent.mm.plugin.soter.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public abstract class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private g qoZ;
  
  public d()
  {
    GMTrace.i(18499497885696L, 137832);
    GMTrace.o(18499497885696L, 137832);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18499632103424L, 137833);
    w.i("MicroMsg.NetSceneSoterBase", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.qoZ = new g(new a());
    this.qoZ.qpc = 62334;
    paramArrayOfByte = this.qoZ;
    if ((paramInt2 == 4) && (paramInt3 == 62336))
    {
      com.tencent.d.b.a.a(new g.1(paramArrayOfByte), true, new e());
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 == 0) {
        d(paramInt2, paramInt3, paramString, paramq);
      }
      GMTrace.o(18499632103424L, 137833);
      return;
      if ((paramInt2 == 4) && (paramInt3 == paramArrayOfByte.qpc))
      {
        if (paramArrayOfByte.qpb != null) {
          paramArrayOfByte.qpb.bqw();
        }
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 0;
      }
    }
  }
  
  public abstract void aAc();
  
  public abstract void ce(int paramInt1, int paramInt2);
  
  public abstract void d(int paramInt1, int paramInt2, String paramString, q paramq);
  
  private final class a
    implements a
  {
    public a()
    {
      GMTrace.i(18494934482944L, 137798);
      GMTrace.o(18494934482944L, 137798);
    }
    
    public final void bqw()
    {
      GMTrace.i(18495068700672L, 137799);
      d.this.aAc();
      GMTrace.o(18495068700672L, 137799);
    }
    
    public final void vJ(int paramInt)
    {
      GMTrace.i(18495202918400L, 137800);
      d.this.ce(3, paramInt);
      GMTrace.o(18495202918400L, 137800);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */