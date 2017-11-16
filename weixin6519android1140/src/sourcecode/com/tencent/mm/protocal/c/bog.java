package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bog
  extends ayx
{
  public String uKB;
  public bpr uXS;
  public bpr uXT;
  public long uXW;
  public int uYf;
  public int uYg;
  public int udE;
  public int uhU;
  public long uhV;
  
  public bog()
  {
    GMTrace.i(3709375348736L, 27637);
    GMTrace.o(3709375348736L, 27637);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3709509566464L, 27638);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKB != null) {
        paramVarArgs.e(2, this.uKB);
      }
      paramVarArgs.fk(3, this.uhU);
      paramVarArgs.fk(4, this.uYf);
      if (this.uXS != null)
      {
        paramVarArgs.fm(5, this.uXS.aYq());
        this.uXS.a(paramVarArgs);
      }
      if (this.uXT != null)
      {
        paramVarArgs.fm(6, this.uXT.aYq());
        this.uXT.a(paramVarArgs);
      }
      paramVarArgs.T(7, this.uhV);
      paramVarArgs.fk(8, this.udE);
      paramVarArgs.T(9, this.uXW);
      paramVarArgs.fk(10, this.uYg);
      GMTrace.o(3709509566464L, 27638);
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
      if (this.uKB != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uKB);
      }
      i = i + b.a.a.a.fh(3, this.uhU) + b.a.a.a.fh(4, this.uYf);
      paramInt = i;
      if (this.uXS != null) {
        paramInt = i + b.a.a.a.fj(5, this.uXS.aYq());
      }
      i = paramInt;
      if (this.uXT != null) {
        i = paramInt + b.a.a.a.fj(6, this.uXT.aYq());
      }
      paramInt = b.a.a.a.S(7, this.uhV);
      int j = b.a.a.a.fh(8, this.udE);
      int k = b.a.a.a.S(9, this.uXW);
      int m = b.a.a.a.fh(10, this.uYg);
      GMTrace.o(3709509566464L, 27638);
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
      GMTrace.o(3709509566464L, 27638);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bog localbog = (bog)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3709509566464L, 27638);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbog.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 2: 
        localbog.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 3: 
        localbog.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 4: 
        localbog.uYf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbog.uXS = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbog.uXT = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 7: 
        localbog.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 8: 
        localbog.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3709509566464L, 27638);
        return 0;
      case 9: 
        localbog.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3709509566464L, 27638);
        return 0;
      }
      localbog.uYg = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3709509566464L, 27638);
      return 0;
    }
    GMTrace.o(3709509566464L, 27638);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */