package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class iu
  extends com.tencent.mm.bm.a
{
  public long tXT;
  public String tXU;
  
  public iu()
  {
    GMTrace.i(3974723796992L, 29614);
    GMTrace.o(3974723796992L, 29614);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3974858014720L, 29615);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXU == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      paramVarArgs.T(1, this.tXT);
      if (this.tXU != null) {
        paramVarArgs.e(2, this.tXU);
      }
      GMTrace.o(3974858014720L, 29615);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.tXT) + 0;
      paramInt = i;
      if (this.tXU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tXU);
      }
      GMTrace.o(3974858014720L, 29615);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tXU == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      GMTrace.o(3974858014720L, 29615);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      iu localiu = (iu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3974858014720L, 29615);
        return -1;
      case 1: 
        localiu.tXT = locala.yqV.nk();
        GMTrace.o(3974858014720L, 29615);
        return 0;
      }
      localiu.tXU = locala.yqV.readString();
      GMTrace.o(3974858014720L, 29615);
      return 0;
    }
    GMTrace.o(3974858014720L, 29615);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\iu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */