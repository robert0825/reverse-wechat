package com.tencent.mm.plugin.gcm.modelgcm;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.ce;
import com.tencent.mm.protocal.c.cf;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;

public final class c
{
  public static final class a
    extends k.d
    implements k.b
  {
    public ce meT;
    
    public a()
    {
      GMTrace.i(8016153804800L, 59725);
      this.meT = new ce();
      GMTrace.o(8016153804800L, 59725);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(8016288022528L, 59726);
      this.meT.uNh = k.a(this);
      byte[] arrayOfByte = this.meT.toByteArray();
      GMTrace.o(8016288022528L, 59726);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(8016556457984L, 59728);
      GMTrace.o(8016556457984L, 59728);
      return 623;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(8016422240256L, 59727);
      GMTrace.o(8016422240256L, 59727);
      return 289;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public cf meU;
    
    public b()
    {
      GMTrace.i(8010516660224L, 59683);
      this.meU = new cf();
      GMTrace.o(8010516660224L, 59683);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(8010785095680L, 59685);
      GMTrace.o(8010785095680L, 59685);
      return 1000000289;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(8010650877952L, 59684);
      this.meU = ((cf)new cf().aD(paramArrayOfByte));
      k.a(this, this.meU.uND);
      int i = this.meU.uND.tST;
      GMTrace.o(8010650877952L, 59684);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gcm\modelgcm\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */