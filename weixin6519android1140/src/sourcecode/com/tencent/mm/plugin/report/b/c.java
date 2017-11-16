package com.tencent.mm.plugin.report.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.akp;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
{
  public static final class a
    extends k.d
    implements k.b
  {
    public akp oqq;
    
    public a()
    {
      GMTrace.i(13105690050560L, 97645);
      this.oqq = new akp();
      GMTrace.o(13105690050560L, 97645);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13105824268288L, 97646);
      this.tKq = ac.bOp();
      this.oqq.tUK = new azp().be(bg.bQN());
      this.oqq.uNh = k.a(this);
      byte[] arrayOfByte = this.oqq.toByteArray();
      GMTrace.o(13105824268288L, 97646);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13105958486016L, 97647);
      GMTrace.o(13105958486016L, 97647);
      return 499;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13106092703744L, 97648);
      GMTrace.o(13106092703744L, 97648);
      return 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */