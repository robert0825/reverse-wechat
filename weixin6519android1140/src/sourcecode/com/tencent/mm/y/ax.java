package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.aey;
import com.tencent.mm.protocal.c.aez;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class ax
{
  public static final class a
    extends k.d
    implements k.b
  {
    public aey gny;
    
    public a()
    {
      GMTrace.i(689073815552L, 5134);
      this.gny = new aey();
      GMTrace.o(689073815552L, 5134);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(689208033280L, 5135);
      this.tKq = ac.bOo();
      this.gny.tUK = new azp().be(bg.bQN());
      this.gny.uNh = k.a(this);
      byte[] arrayOfByte = this.gny.toByteArray();
      GMTrace.o(689208033280L, 5135);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(689342251008L, 5136);
      GMTrace.o(689342251008L, 5136);
      return 616;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(689476468736L, 5137);
      GMTrace.o(689476468736L, 5137);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public aez gnz;
    
    public b()
    {
      GMTrace.i(631494410240L, 4705);
      this.gnz = new aez();
      GMTrace.o(631494410240L, 4705);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(631762845696L, 4707);
      GMTrace.o(631762845696L, 4707);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(631628627968L, 4706);
      this.gnz = ((aez)new aez().aD(paramArrayOfByte));
      k.a(this, this.gnz.uND);
      int i = this.gnz.uND.tST;
      GMTrace.o(631628627968L, 4706);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */