package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.x.a;
import com.tencent.mm.protocal.x.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public long gMc;
  private byte[] gMx;
  private q guL;
  private int uin;
  
  public h(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(13449958522880L, 100210);
    this.gMc = -1L;
    this.uin = 0;
    this.gMc = paramLong;
    this.gMx = paramArrayOfByte;
    GMTrace.o(13449958522880L, 100210);
  }
  
  public h(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13450092740608L, 100211);
    this.gMc = -1L;
    this.uin = 0;
    this.gMc = paramLong;
    this.gMx = paramArrayOfByte;
    this.uin = paramInt;
    GMTrace.o(13450092740608L, 100211);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13450226958336L, 100212);
    if (bg.bq(this.gMx))
    {
      w.e("MicroMsg.NetSceneNotifyData", "dkpush %s", new Object[] { "get keyBuf failed" });
      GMTrace.o(13450226958336L, 100212);
      return -1;
    }
    if (this.uin == 0) {
      this.guL = new a();
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneNotifyData", "doScene now:%d buf:%s", new Object[] { Long.valueOf(this.gMc), bg.bo(this.gMx) });
      ((x.a)this.guL.DC()).gOD = this.gMc;
      ((x.a)this.guL.DC()).eIn = this.gMx;
      this.fUd = parame1;
      int i = a(parame, this.guL, this);
      GMTrace.o(13450226958336L, 100212);
      return i;
      this.guL = new b();
      ((b)this.guL).uin = this.uin;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13450495393792L, 100214);
    w.i("MicroMsg.NetSceneNotifyData", "onGYNetEnd [%d,%d] %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13450495393792L, 100214);
  }
  
  public final int getType()
  {
    GMTrace.i(13450361176064L, 100213);
    GMTrace.o(13450361176064L, 100213);
    return 268369922;
  }
  
  public static final class a
    extends i
  {
    private final x.a gMy;
    private final x.b gMz;
    
    public a()
    {
      GMTrace.i(13448482127872L, 100199);
      this.gMy = new x.a();
      this.gMz = new x.b();
      GMTrace.o(13448482127872L, 100199);
    }
    
    public final int getType()
    {
      GMTrace.i(13448616345600L, 100200);
      GMTrace.o(13448616345600L, 100200);
      return 268369922;
    }
    
    public final String getUri()
    {
      GMTrace.i(13448750563328L, 100201);
      GMTrace.o(13448750563328L, 100201);
      return null;
    }
  }
  
  public static final class b
    implements q
  {
    private final x.a gMy;
    private final x.b gMz;
    int uin;
    
    public b()
    {
      GMTrace.i(13435731443712L, 100104);
      this.gMy = new x.a();
      this.gMz = new x.b();
      GMTrace.o(13435731443712L, 100104);
    }
    
    public final k.d DC()
    {
      GMTrace.i(13436134096896L, 100107);
      this.gMy.tKl = p.ta();
      this.gMy.tKk = d.DEVICE_TYPE;
      this.gMy.tKj = d.tJC;
      this.gMy.dp(this.uin);
      x.a locala = this.gMy;
      GMTrace.o(13436134096896L, 100107);
      return locala;
    }
    
    public final boolean DD()
    {
      GMTrace.i(13436268314624L, 100108);
      GMTrace.o(13436268314624L, 100108);
      return false;
    }
    
    public final int Dz()
    {
      GMTrace.i(13436402532352L, 100109);
      GMTrace.o(13436402532352L, 100109);
      return 0;
    }
    
    public final int getType()
    {
      GMTrace.i(13435865661440L, 100105);
      GMTrace.o(13435865661440L, 100105);
      return 268369922;
    }
    
    public final String getUri()
    {
      GMTrace.i(13435999879168L, 100106);
      GMTrace.o(13435999879168L, 100106);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */