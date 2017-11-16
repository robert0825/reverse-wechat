package com.tencent.mm.plugin.soter.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bkx;
import com.tencent.mm.protocal.c.bky;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
{
  public static final class a
    extends k.d
    implements k.b
  {
    public bkx qoX;
    
    public a()
    {
      GMTrace.i(18498692579328L, 137826);
      this.qoX = new bkx();
      GMTrace.o(18498692579328L, 137826);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(18498826797056L, 137827);
      this.tKq = ac.bOo();
      this.qoX.tUK = new azp().be(bg.bQN());
      this.qoX.uNh = k.a(this);
      this.tKp = this.qoX.tUK.uNP.toByteArray();
      byte[] arrayOfByte = this.qoX.toByteArray();
      GMTrace.o(18498826797056L, 137827);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(18498961014784L, 137828);
      GMTrace.o(18498961014784L, 137828);
      return 627;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(18499095232512L, 137829);
      GMTrace.o(18499095232512L, 137829);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public bky qoY;
    
    public b()
    {
      GMTrace.i(18495337136128L, 137801);
      this.qoY = new bky();
      GMTrace.o(18495337136128L, 137801);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(18495605571584L, 137803);
      GMTrace.o(18495605571584L, 137803);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(18495471353856L, 137802);
      this.qoY = ((bky)new bky().aD(paramArrayOfByte));
      k.a(this, this.qoY.uND);
      int i = this.qoY.uND.tST;
      GMTrace.o(18495471353856L, 137802);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */