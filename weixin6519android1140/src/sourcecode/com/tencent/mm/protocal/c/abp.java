package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abp
  extends ayx
{
  public int tPV;
  public azq tPW;
  public azq tPX;
  public long tQd;
  public int tRC;
  public int tRD;
  public int tRE;
  public int usj;
  
  public abp()
  {
    GMTrace.i(3700248543232L, 27569);
    GMTrace.o(3700248543232L, 27569);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3700382760960L, 27570);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tPV);
      if (this.tPW != null)
      {
        paramVarArgs.fm(3, this.tPW.aYq());
        this.tPW.a(paramVarArgs);
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(4, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tRC);
      paramVarArgs.fk(6, this.tRD);
      paramVarArgs.fk(7, this.tRE);
      paramVarArgs.fk(8, this.usj);
      paramVarArgs.T(9, this.tQd);
      GMTrace.o(3700382760960L, 27570);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tPV);
      paramInt = i;
      if (this.tPW != null) {
        paramInt = i + b.a.a.a.fj(3, this.tPW.aYq());
      }
      i = paramInt;
      if (this.tPX != null) {
        i = paramInt + b.a.a.a.fj(4, this.tPX.aYq());
      }
      paramInt = b.a.a.a.fh(5, this.tRC);
      int j = b.a.a.a.fh(6, this.tRD);
      int k = b.a.a.a.fh(7, this.tRE);
      int m = b.a.a.a.fh(8, this.usj);
      int n = b.a.a.a.S(9, this.tQd);
      GMTrace.o(3700382760960L, 27570);
      return i + paramInt + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      GMTrace.o(3700382760960L, 27570);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abp localabp = (abp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3700382760960L, 27570);
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
          localabp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 2: 
        localabp.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabp.tPW = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabp.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 5: 
        localabp.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 6: 
        localabp.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 7: 
        localabp.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3700382760960L, 27570);
        return 0;
      case 8: 
        localabp.usj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3700382760960L, 27570);
        return 0;
      }
      localabp.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3700382760960L, 27570);
      return 0;
    }
    GMTrace.o(3700382760960L, 27570);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\abp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */