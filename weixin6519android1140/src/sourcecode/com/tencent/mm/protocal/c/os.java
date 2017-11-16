package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class os
  extends ayx
{
  public int jNj;
  public int tOG;
  public LinkedList<pb> tPE;
  public String ufz;
  
  public os()
  {
    GMTrace.i(3727092088832L, 27769);
    this.tPE = new LinkedList();
    GMTrace.o(3727092088832L, 27769);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3727226306560L, 27770);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jNj);
      paramVarArgs.d(3, 8, this.tPE);
      if (this.ufz != null) {
        paramVarArgs.e(4, this.ufz);
      }
      paramVarArgs.fk(5, this.tOG);
      GMTrace.o(3727226306560L, 27770);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jNj) + b.a.a.a.c(3, 8, this.tPE);
      paramInt = i;
      if (this.ufz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ufz);
      }
      i = b.a.a.a.fh(5, this.tOG);
      GMTrace.o(3727226306560L, 27770);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3727226306560L, 27770);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      os localos = (os)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3727226306560L, 27770);
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
          localos.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3727226306560L, 27770);
        return 0;
      case 2: 
        localos.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3727226306560L, 27770);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localos.tPE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3727226306560L, 27770);
        return 0;
      case 4: 
        localos.ufz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3727226306560L, 27770);
        return 0;
      }
      localos.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3727226306560L, 27770);
      return 0;
    }
    GMTrace.o(3727226306560L, 27770);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */