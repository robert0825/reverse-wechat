package com.tencent.mm.plugin.gcm.modelgcm;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.k.d;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private q guL;
  private String meX;
  private int uin;
  
  public f(String paramString, int paramInt)
  {
    GMTrace.i(8017495982080L, 59735);
    this.fUd = null;
    this.uin = 0;
    this.meX = null;
    this.meX = paramString;
    this.uin = paramInt;
    GMTrace.o(8017495982080L, 59735);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8017630199808L, 59736);
    this.fUd = parame1;
    this.guL = new a();
    ((a)this.guL).uin = this.uin;
    ((d.a)this.guL.DC()).meV.tMW = this.meX;
    int i = a(parame, this.guL, this);
    GMTrace.o(8017630199808L, 59736);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8017898635264L, 59738);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8017898635264L, 59738);
  }
  
  public final int getType()
  {
    GMTrace.i(8017764417536L, 59737);
    GMTrace.o(8017764417536L, 59737);
    return 624;
  }
  
  public static final class a
    implements q
  {
    private final d.a mfa;
    private final d.b mfb;
    int uin;
    
    public a()
    {
      GMTrace.i(8009577136128L, 59676);
      this.mfa = new d.a();
      this.mfb = new d.b();
      GMTrace.o(8009577136128L, 59676);
    }
    
    public final k.d DC()
    {
      GMTrace.i(8009979789312L, 59679);
      this.mfa.tKl = p.ta();
      this.mfa.tKk = d.DEVICE_TYPE;
      this.mfa.tKj = d.tJC;
      this.mfa.dp(this.uin);
      d.a locala = this.mfa;
      GMTrace.o(8009979789312L, 59679);
      return locala;
    }
    
    public final boolean DD()
    {
      GMTrace.i(8010114007040L, 59680);
      GMTrace.o(8010114007040L, 59680);
      return false;
    }
    
    public final int Dz()
    {
      GMTrace.i(8010248224768L, 59681);
      GMTrace.o(8010248224768L, 59681);
      return 0;
    }
    
    public final int getType()
    {
      GMTrace.i(8009711353856L, 59677);
      GMTrace.o(8009711353856L, 59677);
      return 624;
    }
    
    public final String getUri()
    {
      GMTrace.i(8009845571584L, 59678);
      GMTrace.o(8009845571584L, 59678);
      return "/cgi-bin/micromsg-bin/androidgcmunreg";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gcm\modelgcm\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */