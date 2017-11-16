package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lf
  extends com.tencent.mm.bm.a
{
  public int jNj;
  public LinkedList<lg> ubR;
  public int ubS;
  public azq ubT;
  
  public lf()
  {
    GMTrace.i(13339228897280L, 99385);
    this.ubR = new LinkedList();
    GMTrace.o(13339228897280L, 99385);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13339363115008L, 99386);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jNj);
      paramVarArgs.d(2, 8, this.ubR);
      paramVarArgs.fk(3, this.ubS);
      if (this.ubT != null)
      {
        paramVarArgs.fm(4, this.ubT.aYq());
        this.ubT.a(paramVarArgs);
      }
      GMTrace.o(13339363115008L, 99386);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jNj) + 0 + b.a.a.a.c(2, 8, this.ubR) + b.a.a.a.fh(3, this.ubS);
      paramInt = i;
      if (this.ubT != null) {
        paramInt = i + b.a.a.a.fj(4, this.ubT.aYq());
      }
      GMTrace.o(13339363115008L, 99386);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ubR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13339363115008L, 99386);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lf locallf = (lf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13339363115008L, 99386);
        return -1;
      case 1: 
        locallf.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339363115008L, 99386);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new lg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((lg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locallf.ubR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13339363115008L, 99386);
        return 0;
      case 3: 
        locallf.ubS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339363115008L, 99386);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locallf.ubT = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13339363115008L, 99386);
      return 0;
    }
    GMTrace.o(13339363115008L, 99386);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\lf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */