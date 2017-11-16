package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.c.a;
import com.tencent.mm.vending.g.g;
import junit.framework.Assert;

public class a<_Resp extends azh>
{
  public b fUa;
  public b<_Resp> gts;
  private com.tencent.mm.bz.e<a<_Resp>> gtt;
  
  public a()
  {
    GMTrace.i(13392110682112L, 99779);
    this.gts = new b(this);
    GMTrace.o(13392110682112L, 99779);
  }
  
  public final com.tencent.mm.bz.e<a<_Resp>> Dy()
  {
    try
    {
      GMTrace.i(13392244899840L, 99780);
      Assert.assertNotNull("You should set a CommReqResp!", this.fUa);
      Assert.assertTrue("RunCgi NetSceneQueue not ready!", u.Ev());
      if (this.gtt == null)
      {
        localObject1 = new c.a() {};
        this.gtt = new com.tencent.mm.bz.e().b((c.a)localObject1);
      }
      Object localObject1 = this.gtt;
      GMTrace.o(13392244899840L, 99780);
      return (com.tencent.mm.bz.e<a<_Resp>>)localObject1;
    }
    finally {}
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, _Resp param_Resp, k paramk)
  {
    GMTrace.i(13392379117568L, 99781);
    GMTrace.o(13392379117568L, 99781);
  }
  
  public static class a<T extends azh>
  {
    public String eAR;
    public k eEg;
    public T eWz;
    public int errCode;
    public int errType;
    public a gtv;
    
    public a()
    {
      GMTrace.i(13389292109824L, 99758);
      GMTrace.o(13389292109824L, 99758);
    }
    
    public static <T extends azh> a<T> a(int paramInt1, int paramInt2, String paramString, T paramT, k paramk, a parama)
    {
      GMTrace.i(13389426327552L, 99759);
      a locala = new a();
      locala.errType = paramInt1;
      locala.errCode = paramInt2;
      locala.eAR = paramString;
      locala.eWz = paramT;
      locala.eEg = paramk;
      locala.gtv = parama;
      if (parama != null) {
        parama.a(paramInt1, paramInt2, paramString, paramT, paramk);
      }
      GMTrace.o(13389426327552L, 99759);
      return locala;
    }
  }
  
  private static final class b<_Resp extends azh>
    extends k
  {
    public e fXo;
    private com.tencent.mm.network.k gtA;
    public final k gtw;
    public b gtx;
    public com.tencent.mm.vending.g.b gty;
    public a gtz;
    public final long mStartTime;
    
    public b(a parama)
    {
      GMTrace.i(13396674084864L, 99813);
      this.fXo = null;
      this.gtw = this;
      this.mStartTime = bg.Pv();
      this.gtA = new com.tencent.mm.network.k()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString, q paramAnonymousq, byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(13389828980736L, 99762);
          g.a(a.b.this.gty, new Object[] { a.a.a(paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString, (azh)a.b.this.gtx.gtD.gtK, a.b.this, a.b.this.gtz) });
          a.b.this.fXo.a(paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString, a.b.this.gtw);
          w.i("MicroMsg.Cgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", new Object[] { Integer.valueOf(a.b.this.gtw.hashCode()), Integer.valueOf(a.b.this.getType()), Long.valueOf(bg.Pv() - a.b.this.mStartTime), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), paramAnonymousString });
          GMTrace.o(13389828980736L, 99762);
        }
      };
      this.gtz = parama;
      GMTrace.o(13396674084864L, 99813);
    }
    
    public final int a(com.tencent.mm.network.e parame, e parame1)
    {
      GMTrace.i(13397076738048L, 99816);
      this.fXo = parame1;
      int i = a(parame, this.gtx, this.gtA);
      w.i("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d", new Object[] { Integer.valueOf(this.gtw.hashCode()), Integer.valueOf(this.gtx.gtE), Integer.valueOf(i), Long.valueOf(bg.Pv() - this.mStartTime) });
      if (i < 0) {
        g.a(this.gty, new Object[] { a.a.a(3, -1, "", (azh)this.gtx.gtD.gtK, this, this.gtz) });
      }
      GMTrace.o(13397076738048L, 99816);
      return i;
    }
    
    public final int getType()
    {
      GMTrace.i(13396942520320L, 99815);
      int i = this.gtx.gtE;
      GMTrace.o(13396942520320L, 99815);
      return i;
    }
    
    protected final int vB()
    {
      GMTrace.i(13396808302592L, 99814);
      GMTrace.o(13396808302592L, 99814);
      return 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ad\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */