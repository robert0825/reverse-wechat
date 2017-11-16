package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.ao;
import oicq.wlogin_sdk.a.f;

public final class g
  extends d
{
  public g(i parami)
  {
    this.yrE = 2064;
    this.yrF = 2;
    this.yrH = parami;
  }
  
  public final byte[] bQ(byte[] paramArrayOfByte)
  {
    int k = this.yrH.yrR;
    byte[] arrayOfByte1 = this.yrH.yrM.cth();
    Object localObject = this.yrH.yrN;
    byte[] arrayOfByte2 = new byte[((oicq.wlogin_sdk.a.g)localObject).ysz];
    int i;
    if (((oicq.wlogin_sdk.a.g)localObject).ysz <= 0)
    {
      localObject = new f();
      ao localao = new ao();
      localObject = ((f)localObject).bR(arrayOfByte1);
      paramArrayOfByte = localao.n(paramArrayOfByte, arrayOfByte2);
      arrayOfByte2 = new byte[localObject.length + paramArrayOfByte.length];
      if (arrayOfByte1.length <= 0) {
        break label209;
      }
      System.arraycopy(localObject, 0, arrayOfByte2, 0, localObject.length);
      i = localObject.length + 0;
    }
    for (int j = 1;; j = 0)
    {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, i, paramArrayOfByte.length);
      paramArrayOfByte = super.j(arrayOfByte2, this.yrF, j + 1);
      a(this.yrz, this.yrE, yrA, this.yrH._uin, this.yrB, this.yrC, k, this.yrD, paramArrayOfByte);
      return super.cte();
      System.arraycopy(((oicq.wlogin_sdk.a.g)localObject).yry, ((oicq.wlogin_sdk.a.g)localObject).ysB, arrayOfByte2, 0, ((oicq.wlogin_sdk.a.g)localObject).ysz);
      break;
      label209:
      i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\request\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */