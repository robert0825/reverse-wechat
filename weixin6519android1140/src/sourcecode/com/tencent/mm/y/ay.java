package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.afc;
import com.tencent.mm.protocal.c.afd;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class ay
{
  public static final class a
    extends k.d
    implements k.b
  {
    public afc gnA;
    
    public a()
    {
      GMTrace.i(643842441216L, 4797);
      this.gnA = new afc();
      GMTrace.o(643842441216L, 4797);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(643976658944L, 4798);
      this.tKq = ac.bOo();
      this.gnA.tUK = new azp().be(bg.bQN());
      this.gnA.uNh = k.a(this);
      byte[] arrayOfByte = this.gnA.toByteArray();
      GMTrace.o(643976658944L, 4798);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(644110876672L, 4799);
      GMTrace.o(644110876672L, 4799);
      return 618;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(644245094400L, 4800);
      GMTrace.o(644245094400L, 4800);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public afd gnB;
    
    public b()
    {
      GMTrace.i(615119847424L, 4583);
      this.gnB = new afd();
      GMTrace.o(615119847424L, 4583);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(615388282880L, 4585);
      GMTrace.o(615388282880L, 4585);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(615254065152L, 4584);
      this.gnB = ((afd)new afd().aD(paramArrayOfByte));
      k.a(this, this.gnB.uND);
      int i = this.gnB.uND.tST;
      GMTrace.o(615254065152L, 4584);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */