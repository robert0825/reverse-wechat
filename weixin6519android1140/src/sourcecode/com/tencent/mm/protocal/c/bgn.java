package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgn
  extends ayx
{
  public int tQP;
  public String tRz;
  public long uQA;
  public String uQz;
  public long uRW;
  public int uRX;
  
  public bgn()
  {
    GMTrace.i(3950296170496L, 29432);
    GMTrace.o(3950296170496L, 29432);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3950430388224L, 29433);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uQz != null) {
        paramVarArgs.e(2, this.uQz);
      }
      if (this.tRz != null) {
        paramVarArgs.e(3, this.tRz);
      }
      paramVarArgs.T(4, this.uQA);
      paramVarArgs.fk(5, this.tQP);
      paramVarArgs.T(6, this.uRW);
      paramVarArgs.fk(7, this.uRX);
      GMTrace.o(3950430388224L, 29433);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uQz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uQz);
      }
      i = paramInt;
      if (this.tRz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tRz);
      }
      paramInt = b.a.a.a.S(4, this.uQA);
      int j = b.a.a.a.fh(5, this.tQP);
      int k = b.a.a.a.S(6, this.uRW);
      int m = b.a.a.a.fh(7, this.uRX);
      GMTrace.o(3950430388224L, 29433);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3950430388224L, 29433);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgn localbgn = (bgn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3950430388224L, 29433);
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
          localbgn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 2: 
        localbgn.uQz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 3: 
        localbgn.tRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 4: 
        localbgn.uQA = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 5: 
        localbgn.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      case 6: 
        localbgn.uRW = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3950430388224L, 29433);
        return 0;
      }
      localbgn.uRX = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3950430388224L, 29433);
      return 0;
    }
    GMTrace.o(3950430388224L, 29433);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */