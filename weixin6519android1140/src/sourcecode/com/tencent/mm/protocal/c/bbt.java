package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbt
  extends ayx
{
  public String lPJ;
  public String lPi;
  public String nuV;
  public String tRP;
  public String uOO;
  public String uOP;
  
  public bbt()
  {
    GMTrace.i(14688788152320L, 109440);
    GMTrace.o(14688788152320L, 109440);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14688922370048L, 109441);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPJ != null) {
        paramVarArgs.e(2, this.lPJ);
      }
      if (this.uOO != null) {
        paramVarArgs.e(3, this.uOO);
      }
      if (this.nuV != null) {
        paramVarArgs.e(5, this.nuV);
      }
      if (this.lPi != null) {
        paramVarArgs.e(4, this.lPi);
      }
      if (this.tRP != null) {
        paramVarArgs.e(6, this.tRP);
      }
      if (this.uOP != null) {
        paramVarArgs.e(7, this.uOP);
      }
      GMTrace.o(14688922370048L, 109441);
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
      if (this.lPJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPJ);
      }
      i = paramInt;
      if (this.uOO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uOO);
      }
      paramInt = i;
      if (this.nuV != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nuV);
      }
      i = paramInt;
      if (this.lPi != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPi);
      }
      paramInt = i;
      if (this.tRP != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tRP);
      }
      i = paramInt;
      if (this.uOP != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uOP);
      }
      GMTrace.o(14688922370048L, 109441);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14688922370048L, 109441);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbt localbbt = (bbt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14688922370048L, 109441);
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
          localbbt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14688922370048L, 109441);
        return 0;
      case 2: 
        localbbt.lPJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14688922370048L, 109441);
        return 0;
      case 3: 
        localbbt.uOO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14688922370048L, 109441);
        return 0;
      case 5: 
        localbbt.nuV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14688922370048L, 109441);
        return 0;
      case 4: 
        localbbt.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14688922370048L, 109441);
        return 0;
      case 6: 
        localbbt.tRP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14688922370048L, 109441);
        return 0;
      }
      localbbt.uOP = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(14688922370048L, 109441);
      return 0;
    }
    GMTrace.o(14688922370048L, 109441);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */