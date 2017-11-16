package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bix
  extends ayx
{
  public int lQc;
  public int tRC;
  public int tRD;
  public String uCu;
  public int uJj;
  public azp ueU;
  public int ugn;
  
  public bix()
  {
    GMTrace.i(3838224367616L, 28597);
    GMTrace.o(3838224367616L, 28597);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3838358585344L, 28598);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ueU == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lQc);
      paramVarArgs.fk(3, this.uJj);
      if (this.ueU != null)
      {
        paramVarArgs.fm(4, this.ueU.aYq());
        this.ueU.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tRD);
      paramVarArgs.fk(6, this.tRC);
      if (this.uCu != null) {
        paramVarArgs.e(7, this.uCu);
      }
      paramVarArgs.fk(8, this.ugn);
      GMTrace.o(3838358585344L, 28598);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.lQc) + b.a.a.a.fh(3, this.uJj);
      paramInt = i;
      if (this.ueU != null) {
        paramInt = i + b.a.a.a.fj(4, this.ueU.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.tRD) + b.a.a.a.fh(6, this.tRC);
      paramInt = i;
      if (this.uCu != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uCu);
      }
      i = b.a.a.a.fh(8, this.ugn);
      GMTrace.o(3838358585344L, 28598);
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
      if (this.ueU == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3838358585344L, 28598);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bix localbix = (bix)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3838358585344L, 28598);
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
          localbix.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 2: 
        localbix.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 3: 
        localbix.uJj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbix.ueU = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 5: 
        localbix.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 6: 
        localbix.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 7: 
        localbix.uCu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      }
      localbix.ugn = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3838358585344L, 28598);
      return 0;
    }
    GMTrace.o(3838358585344L, 28598);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */