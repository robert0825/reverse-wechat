package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class zn
  extends com.tencent.mm.bm.a
{
  public String ugz;
  
  public zn()
  {
    GMTrace.i(3712865009664L, 27663);
    GMTrace.o(3712865009664L, 27663);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3712999227392L, 27664);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugz == null) {
        throw new b("Not all required fields were included: DesignerID");
      }
      if (this.ugz != null) {
        paramVarArgs.e(1, this.ugz);
      }
      GMTrace.o(3712999227392L, 27664);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugz == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.ugz) + 0;; paramInt = 0)
    {
      GMTrace.o(3712999227392L, 27664);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.ugz == null) {
          throw new b("Not all required fields were included: DesignerID");
        }
        GMTrace.o(3712999227392L, 27664);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        zn localzn = (zn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3712999227392L, 27664);
          return -1;
        }
        localzn.ugz = locala.yqV.readString();
        GMTrace.o(3712999227392L, 27664);
        return 0;
      }
      GMTrace.o(3712999227392L, 27664);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */