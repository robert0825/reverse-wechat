package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqp
  extends ayx
{
  public String uGP;
  public int uGQ;
  public LinkedList<String> uGR;
  
  public aqp()
  {
    GMTrace.i(17868942999552L, 133134);
    this.uGR = new LinkedList();
    GMTrace.o(17868942999552L, 133134);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17869077217280L, 133135);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uGP != null) {
        paramVarArgs.e(2, this.uGP);
      }
      paramVarArgs.fk(3, this.uGQ);
      paramVarArgs.d(4, 1, this.uGR);
      GMTrace.o(17869077217280L, 133135);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uGP != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uGP);
      }
      paramInt = b.a.a.a.fh(3, this.uGQ);
      int j = b.a.a.a.c(4, 1, this.uGR);
      GMTrace.o(17869077217280L, 133135);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uGR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17869077217280L, 133135);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqp localaqp = (aqp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17869077217280L, 133135);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaqp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17869077217280L, 133135);
        return 0;
      case 2: 
        localaqp.uGP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17869077217280L, 133135);
        return 0;
      case 3: 
        localaqp.uGQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17869077217280L, 133135);
        return 0;
      }
      localaqp.uGR.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(17869077217280L, 133135);
      return 0;
    }
    GMTrace.o(17869077217280L, 133135);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */