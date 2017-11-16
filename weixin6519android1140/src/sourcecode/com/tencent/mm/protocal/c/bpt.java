package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpt
  extends ayx
{
  public String uKB;
  public long uXW;
  public bpz uYP;
  public int uhU;
  public long uhV;
  
  public bpt()
  {
    GMTrace.i(4036195516416L, 30072);
    GMTrace.o(4036195516416L, 30072);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4036329734144L, 30073);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uYP == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKB != null) {
        paramVarArgs.e(2, this.uKB);
      }
      paramVarArgs.fk(3, this.uhU);
      paramVarArgs.T(4, this.uhV);
      if (this.uYP != null)
      {
        paramVarArgs.fm(5, this.uYP.aYq());
        this.uYP.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.uXW);
      GMTrace.o(4036329734144L, 30073);
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
      i = i + b.a.a.a.fh(3, this.uhU) + b.a.a.a.S(4, this.uhV);
      paramInt = i;
      if (this.uYP != null) {
        paramInt = i + b.a.a.a.fj(5, this.uYP.aYq());
      }
      i = b.a.a.a.S(6, this.uXW);
      GMTrace.o(4036329734144L, 30073);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uYP == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      GMTrace.o(4036329734144L, 30073);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpt localbpt = (bpt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4036329734144L, 30073);
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
          localbpt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4036329734144L, 30073);
        return 0;
      case 2: 
        localbpt.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4036329734144L, 30073);
        return 0;
      case 3: 
        localbpt.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4036329734144L, 30073);
        return 0;
      case 4: 
        localbpt.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4036329734144L, 30073);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpt.uYP = ((bpz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4036329734144L, 30073);
        return 0;
      }
      localbpt.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(4036329734144L, 30073);
      return 0;
    }
    GMTrace.o(4036329734144L, 30073);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */