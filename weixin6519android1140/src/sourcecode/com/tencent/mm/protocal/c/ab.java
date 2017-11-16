package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ab
  extends ayx
{
  public LinkedList<ck> tMY;
  public int tNq;
  public pw tNr;
  public int tNs;
  
  public ab()
  {
    GMTrace.i(3798898573312L, 28304);
    this.tMY = new LinkedList();
    GMTrace.o(3798898573312L, 28304);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3799032791040L, 28305);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tNq);
      paramVarArgs.d(3, 8, this.tMY);
      if (this.tNr != null)
      {
        paramVarArgs.fm(4, this.tNr.aYq());
        this.tNr.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tNs);
      GMTrace.o(3799032791040L, 28305);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tNq) + b.a.a.a.c(3, 8, this.tMY);
      paramInt = i;
      if (this.tNr != null) {
        paramInt = i + b.a.a.a.fj(4, this.tNr.aYq());
      }
      i = b.a.a.a.fh(5, this.tNs);
      GMTrace.o(3799032791040L, 28305);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tMY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3799032791040L, 28305);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ab localab = (ab)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3799032791040L, 28305);
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
          localab.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3799032791040L, 28305);
        return 0;
      case 2: 
        localab.tNq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3799032791040L, 28305);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ck();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ck)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localab.tMY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3799032791040L, 28305);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localab.tNr = ((pw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3799032791040L, 28305);
        return 0;
      }
      localab.tNs = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3799032791040L, 28305);
      return 0;
    }
    GMTrace.o(3799032791040L, 28305);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */