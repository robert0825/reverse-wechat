package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ayb;
import com.tencent.mm.protocal.c.ayc;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class j
{
  public static final class a
    extends k.d
    implements k.b
  {
    public ayb kRM;
    
    public a()
    {
      GMTrace.i(16416438747136L, 122312);
      this.kRM = new ayb();
      GMTrace.o(16416438747136L, 122312);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(16416572964864L, 122313);
      this.tKq = ac.bOo();
      this.kRM.tUK = new azp().be(bg.bQN());
      this.kRM.uNh = k.a(this);
      this.tKp = this.kRM.tUK.uNP.toByteArray();
      byte[] arrayOfByte = this.kRM.toByteArray();
      GMTrace.o(16416572964864L, 122313);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(16416707182592L, 122314);
      GMTrace.o(16416707182592L, 122314);
      return 931;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(16416841400320L, 122315);
      GMTrace.o(16416841400320L, 122315);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public ayc kRN;
    
    public b()
    {
      GMTrace.i(16415096569856L, 122302);
      this.kRN = new ayc();
      GMTrace.o(16415096569856L, 122302);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(16415365005312L, 122304);
      GMTrace.o(16415365005312L, 122304);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(16415230787584L, 122303);
      this.kRN = ((ayc)new ayc().aD(paramArrayOfByte));
      k.a(this, this.kRN.uND);
      int i = this.kRN.uND.tST;
      GMTrace.o(16415230787584L, 122303);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */