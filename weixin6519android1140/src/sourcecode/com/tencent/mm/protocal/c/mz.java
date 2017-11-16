package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class mz
  extends com.tencent.mm.bm.a
{
  public int udF;
  public int udG;
  public int udH;
  public LinkedList<my> udI;
  public b udJ;
  public ahi udK;
  
  public mz()
  {
    GMTrace.i(13099516035072L, 97599);
    this.udI = new LinkedList();
    GMTrace.o(13099516035072L, 97599);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13099650252800L, 97600);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.udF);
      paramVarArgs.fk(2, this.udG);
      paramVarArgs.fk(3, this.udH);
      paramVarArgs.d(4, 8, this.udI);
      if (this.udJ != null) {
        paramVarArgs.b(5, this.udJ);
      }
      if (this.udK != null)
      {
        paramVarArgs.fm(6, this.udK.aYq());
        this.udK.a(paramVarArgs);
      }
      GMTrace.o(13099650252800L, 97600);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.udF) + 0 + b.a.a.a.fh(2, this.udG) + b.a.a.a.fh(3, this.udH) + b.a.a.a.c(4, 8, this.udI);
      paramInt = i;
      if (this.udJ != null) {
        paramInt = i + b.a.a.a.a(5, this.udJ);
      }
      i = paramInt;
      if (this.udK != null) {
        i = paramInt + b.a.a.a.fj(6, this.udK.aYq());
      }
      GMTrace.o(13099650252800L, 97600);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.udI.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13099650252800L, 97600);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mz localmz = (mz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13099650252800L, 97600);
        return -1;
      case 1: 
        localmz.udF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13099650252800L, 97600);
        return 0;
      case 2: 
        localmz.udG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13099650252800L, 97600);
        return 0;
      case 3: 
        localmz.udH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13099650252800L, 97600);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new my();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((my)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localmz.udI.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13099650252800L, 97600);
        return 0;
      case 5: 
        localmz.udJ = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(13099650252800L, 97600);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ahi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ahi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localmz.udK = ((ahi)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13099650252800L, 97600);
      return 0;
    }
    GMTrace.o(13099650252800L, 97600);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\mz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */