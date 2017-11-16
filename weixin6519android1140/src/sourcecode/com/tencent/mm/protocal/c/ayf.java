package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayf
  extends ayx
{
  public int jhZ;
  public int uME;
  public bnw uMF;
  public int uMG;
  
  public ayf()
  {
    GMTrace.i(3715549364224L, 27683);
    GMTrace.o(3715549364224L, 27683);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3715683581952L, 27684);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uMF == null) {
        throw new b("Not all required fields were included: PieceData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhZ);
      paramVarArgs.fk(3, this.uME);
      if (this.uMF != null)
      {
        paramVarArgs.fm(4, this.uMF.aYq());
        this.uMF.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uMG);
      GMTrace.o(3715683581952L, 27684);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhZ) + b.a.a.a.fh(3, this.uME);
      paramInt = i;
      if (this.uMF != null) {
        paramInt = i + b.a.a.a.fj(4, this.uMF.aYq());
      }
      i = b.a.a.a.fh(5, this.uMG);
      GMTrace.o(3715683581952L, 27684);
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
      if (this.uMF == null) {
        throw new b("Not all required fields were included: PieceData");
      }
      GMTrace.o(3715683581952L, 27684);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayf localayf = (ayf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3715683581952L, 27684);
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
          localayf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715683581952L, 27684);
        return 0;
      case 2: 
        localayf.jhZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3715683581952L, 27684);
        return 0;
      case 3: 
        localayf.uME = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3715683581952L, 27684);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayf.uMF = ((bnw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715683581952L, 27684);
        return 0;
      }
      localayf.uMG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3715683581952L, 27684);
      return 0;
    }
    GMTrace.o(3715683581952L, 27684);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */