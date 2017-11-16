package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;

public final class h
  extends d
{
  public h(i parami)
  {
    this.yrE = 2064;
    this.yrF = 3;
    this.yrH = parami;
  }
  
  public final int l(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = new f();
    g localg = new g();
    int i = super.F(paramArrayOfByte, paramInt1 + 2);
    super.ctf();
    int j = paramInt1 + 5;
    switch (i)
    {
    case 3: 
    case 4: 
    default: 
      k(paramArrayOfByte, j, this.yrt - j - 1);
      return i;
    case 2: 
      paramInt2 = localf.n(paramArrayOfByte, j, this.yrt - j);
      paramInt1 = paramInt2;
      if (paramInt2 >= 0)
      {
        this.yrH.yrM = localf;
        paramInt2 = localg.n(paramArrayOfByte, j, this.yrt - j);
        paramInt1 = paramInt2;
        if (paramInt2 >= 0)
        {
          this.yrH.yrN = localg;
          return i;
        }
      }
      break;
    case 5: 
      super.k(paramArrayOfByte, j, this.yrt - j - 1);
      return i;
    }
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\request\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */