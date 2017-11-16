package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfd
  extends com.tencent.mm.bm.a
{
  public int nFd;
  public String tRz;
  public azp uQq;
  
  public bfd()
  {
    GMTrace.i(4040490483712L, 30104);
    GMTrace.o(4040490483712L, 30104);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4040624701440L, 30105);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQq == null) {
        throw new b("Not all required fields were included: HBBuffer");
      }
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      paramVarArgs.fk(2, this.nFd);
      if (this.uQq != null)
      {
        paramVarArgs.fm(3, this.uQq.aYq());
        this.uQq.a(paramVarArgs);
      }
      GMTrace.o(4040624701440L, 30105);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tRz != null) {
        paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.nFd);
      paramInt = i;
      if (this.uQq != null) {
        paramInt = i + b.a.a.a.fj(3, this.uQq.aYq());
      }
      GMTrace.o(4040624701440L, 30105);
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
      if (this.uQq == null) {
        throw new b("Not all required fields were included: HBBuffer");
      }
      GMTrace.o(4040624701440L, 30105);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfd localbfd = (bfd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4040624701440L, 30105);
        return -1;
      case 1: 
        localbfd.tRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4040624701440L, 30105);
        return 0;
      case 2: 
        localbfd.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4040624701440L, 30105);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbfd.uQq = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4040624701440L, 30105);
      return 0;
    }
    GMTrace.o(4040624701440L, 30105);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */