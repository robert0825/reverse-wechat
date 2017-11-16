package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.xe;
import com.tencent.mm.protocal.c.xf;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class i
{
  public static final class a
    extends k.d
    implements k.b
  {
    public xe kRK;
    
    public a()
    {
      GMTrace.i(16416975618048L, 122316);
      this.kRK = new xe();
      GMTrace.o(16416975618048L, 122316);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(16417109835776L, 122317);
      this.tKq = ac.bOo();
      this.kRK.tUK = new azp().be(bg.bQN());
      this.kRK.uNh = k.a(this);
      this.tKp = this.kRK.tUK.uNP.toByteArray();
      byte[] arrayOfByte = this.kRK.toByteArray();
      GMTrace.o(16417109835776L, 122317);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(16417244053504L, 122318);
      GMTrace.o(16417244053504L, 122318);
      return 733;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(16417378271232L, 122319);
      GMTrace.o(16417378271232L, 122319);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public xf kRL;
    
    public b()
    {
      GMTrace.i(16415499223040L, 122305);
      this.kRL = new xf();
      GMTrace.o(16415499223040L, 122305);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(16415767658496L, 122307);
      GMTrace.o(16415767658496L, 122307);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(16415633440768L, 122306);
      this.kRL = ((xf)new xf().aD(paramArrayOfByte));
      k.a(this, this.kRL.uND);
      int i = this.kRL.uND.tST;
      GMTrace.o(16415633440768L, 122306);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */