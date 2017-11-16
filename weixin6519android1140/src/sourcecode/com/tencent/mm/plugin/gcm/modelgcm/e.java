package com.tencent.mm.plugin.gcm.modelgcm;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.k.d;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private q guL;
  private String meX;
  private int uin;
  
  public e(String paramString, int paramInt)
  {
    GMTrace.i(8009040265216L, 59672);
    this.fUd = null;
    this.meX = null;
    this.uin = 0;
    this.meX = paramString;
    this.uin = paramInt;
    GMTrace.o(8009040265216L, 59672);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8009174482944L, 59673);
    this.fUd = parame1;
    this.guL = new a();
    ((a)this.guL).uin = this.uin;
    ((c.a)this.guL.DC()).meT.tMW = this.meX;
    int i = a(parame, this.guL, this);
    GMTrace.o(8009174482944L, 59673);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8009442918400L, 59675);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8009442918400L, 59675);
  }
  
  public final int getType()
  {
    GMTrace.i(8009308700672L, 59674);
    GMTrace.o(8009308700672L, 59674);
    return 623;
  }
  
  public static final class a
    implements q
  {
    private final c.a meY;
    private final c.b meZ;
    int uin;
    
    public a()
    {
      GMTrace.i(8010919313408L, 59686);
      this.meY = new c.a();
      this.meZ = new c.b();
      GMTrace.o(8010919313408L, 59686);
    }
    
    public final k.d DC()
    {
      GMTrace.i(8011321966592L, 59689);
      this.meY.tKl = p.ta();
      this.meY.tKk = d.DEVICE_TYPE;
      this.meY.tKj = d.tJC;
      this.meY.dp(this.uin);
      c.a locala = this.meY;
      GMTrace.o(8011321966592L, 59689);
      return locala;
    }
    
    public final boolean DD()
    {
      GMTrace.i(8011456184320L, 59690);
      GMTrace.o(8011456184320L, 59690);
      return false;
    }
    
    public final int Dz()
    {
      GMTrace.i(8011590402048L, 59691);
      GMTrace.o(8011590402048L, 59691);
      return 0;
    }
    
    public final int getType()
    {
      GMTrace.i(8011053531136L, 59687);
      GMTrace.o(8011053531136L, 59687);
      return 623;
    }
    
    public final String getUri()
    {
      GMTrace.i(8011187748864L, 59688);
      GMTrace.o(8011187748864L, 59688);
      return "/cgi-bin/micromsg-bin/androidgcmreg";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gcm\modelgcm\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */