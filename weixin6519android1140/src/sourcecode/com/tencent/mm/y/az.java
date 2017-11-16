package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnq;
import com.tencent.mm.protocal.c.bnr;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class az
{
  public static final class a
    extends k.d
    implements k.b
  {
    public bnq gnC;
    
    public a()
    {
      GMTrace.i(684778848256L, 5102);
      this.gnC = new bnq();
      GMTrace.o(684778848256L, 5102);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(684913065984L, 5103);
      this.tKq = ac.bOo();
      this.gnC.tUK = new azp().be(bg.bQN());
      this.gnC.uNh = k.a(this);
      byte[] arrayOfByte = this.gnC.toByteArray();
      GMTrace.o(684913065984L, 5103);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(685047283712L, 5104);
      GMTrace.o(685047283712L, 5104);
      return 617;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(685181501440L, 5105);
      GMTrace.o(685181501440L, 5105);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public bnr gnD;
    
    public b()
    {
      GMTrace.i(680349663232L, 5069);
      this.gnD = new bnr();
      GMTrace.o(680349663232L, 5069);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(680618098688L, 5071);
      GMTrace.o(680618098688L, 5071);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(680483880960L, 5070);
      this.gnD = ((bnr)new bnr().aD(paramArrayOfByte));
      k.a(this, this.gnD.uND);
      int i = this.gnD.uND.tST;
      GMTrace.o(680483880960L, 5070);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */