package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnb;
import com.tencent.mm.protocal.c.bnc;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class k
{
  public static final class a
    extends k.d
    implements com.tencent.mm.protocal.k.b
  {
    public bnb kRO;
    
    public a()
    {
      GMTrace.i(16415901876224L, 122308);
      this.kRO = new bnb();
      GMTrace.o(16415901876224L, 122308);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(16416036093952L, 122309);
      this.tKq = ac.bOo();
      this.kRO.tUK = new azp().be(bg.bQN());
      this.kRO.uNh = com.tencent.mm.protocal.k.a(this);
      this.tKp = this.kRO.tUK.uNP.toByteArray();
      byte[] arrayOfByte = this.kRO.toByteArray();
      GMTrace.o(16416036093952L, 122309);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(16416170311680L, 122310);
      GMTrace.o(16416170311680L, 122310);
      return 930;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(16416304529408L, 122311);
      GMTrace.o(16416304529408L, 122311);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public bnc kRP;
    
    public b()
    {
      GMTrace.i(16414693916672L, 122299);
      this.kRP = new bnc();
      GMTrace.o(16414693916672L, 122299);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(16414962352128L, 122301);
      GMTrace.o(16414962352128L, 122301);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(16414828134400L, 122300);
      this.kRP = ((bnc)new bnc().aD(paramArrayOfByte));
      com.tencent.mm.protocal.k.a(this, this.kRP.uND);
      int i = this.kRP.uND.tST;
      GMTrace.o(16414828134400L, 122300);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */