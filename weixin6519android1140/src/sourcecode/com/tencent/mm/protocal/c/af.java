package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class af
  extends com.tencent.mm.bm.a
{
  public int tNB;
  public int tNC;
  public int tND;
  public LinkedList<ad> tNE;
  public int tNF;
  public LinkedList<ad> tNG;
  
  public af()
  {
    GMTrace.i(18919196721152L, 140959);
    this.tNE = new LinkedList();
    this.tNG = new LinkedList();
    GMTrace.o(18919196721152L, 140959);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18919330938880L, 140960);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tNB);
      paramVarArgs.fk(2, this.tND);
      paramVarArgs.d(3, 8, this.tNE);
      paramVarArgs.fk(4, this.tNC);
      paramVarArgs.fk(5, this.tNF);
      paramVarArgs.d(6, 8, this.tNG);
      GMTrace.o(18919330938880L, 140960);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tNB);
      i = b.a.a.a.fh(2, this.tND);
      int j = b.a.a.a.c(3, 8, this.tNE);
      int k = b.a.a.a.fh(4, this.tNC);
      int m = b.a.a.a.fh(5, this.tNF);
      int n = b.a.a.a.c(6, 8, this.tNG);
      GMTrace.o(18919330938880L, 140960);
      return paramInt + 0 + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tNE.clear();
      this.tNG.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18919330938880L, 140960);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      af localaf = (af)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(18919330938880L, 140960);
        return -1;
      case 1: 
        localaf.tNB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18919330938880L, 140960);
        return 0;
      case 2: 
        localaf.tND = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18919330938880L, 140960);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ad();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ad)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaf.tNE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(18919330938880L, 140960);
        return 0;
      case 4: 
        localaf.tNC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18919330938880L, 140960);
        return 0;
      case 5: 
        localaf.tNF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(18919330938880L, 140960);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ad();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ad)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaf.tNG.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(18919330938880L, 140960);
      return 0;
    }
    GMTrace.o(18919330938880L, 140960);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */