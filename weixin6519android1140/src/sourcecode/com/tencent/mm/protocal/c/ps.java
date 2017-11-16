package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ps
  extends ayx
{
  public int cfz;
  public String eSd;
  public String ufN;
  public int ufO;
  
  public ps()
  {
    GMTrace.i(15002052329472L, 111774);
    GMTrace.o(15002052329472L, 111774);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15002186547200L, 111775);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      if (this.ufN != null) {
        paramVarArgs.e(3, this.ufN);
      }
      paramVarArgs.fk(4, this.ufO);
      paramVarArgs.fk(5, this.cfz);
      GMTrace.o(15002186547200L, 111775);
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
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eSd);
      }
      i = paramInt;
      if (this.ufN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ufN);
      }
      paramInt = b.a.a.a.fh(4, this.ufO);
      int j = b.a.a.a.fh(5, this.cfz);
      GMTrace.o(15002186547200L, 111775);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15002186547200L, 111775);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ps localps = (ps)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15002186547200L, 111775);
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
          localps.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15002186547200L, 111775);
        return 0;
      case 2: 
        localps.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15002186547200L, 111775);
        return 0;
      case 3: 
        localps.ufN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15002186547200L, 111775);
        return 0;
      case 4: 
        localps.ufO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15002186547200L, 111775);
        return 0;
      }
      localps.cfz = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(15002186547200L, 111775);
      return 0;
    }
    GMTrace.o(15002186547200L, 111775);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */