package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.yq;
import com.tencent.mm.protocal.c.yr;
import com.tencent.mm.sdk.platformtools.bg;

public final class r
{
  public static final class a
    extends k.d
    implements k.b
  {
    public yq tKL;
    
    public a()
    {
      GMTrace.i(13589142306816L, 101247);
      this.tKL = new yq();
      GMTrace.o(13589142306816L, 101247);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13589276524544L, 101248);
      this.tKq = ac.bOq();
      this.tKL.tUK = new azp().be(bg.bQN());
      this.tKL.upy = ac.bOo().ver;
      this.tKL.uNh = k.a(this);
      byte[] arrayOfByte = this.tKL.toByteArray();
      GMTrace.o(13589276524544L, 101248);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13589410742272L, 101249);
      GMTrace.o(13589410742272L, 101249);
      return 381;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13589544960000L, 101250);
      GMTrace.o(13589544960000L, 101250);
      return 179;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public yr tKM;
    
    public b()
    {
      GMTrace.i(13593437274112L, 101279);
      this.tKM = new yr();
      GMTrace.o(13593437274112L, 101279);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13593705709568L, 101281);
      GMTrace.o(13593705709568L, 101281);
      return 1000000179;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13593571491840L, 101280);
      this.tKM = ((yr)new yr().aD(paramArrayOfByte));
      k.a(this, this.tKM.uND);
      int i = this.tKM.uND.tST;
      GMTrace.o(13593571491840L, 101280);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */