package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.bm.a
{
  public int tLg;
  public int tLw;
  public LinkedList<b> tLx;
  public com.tencent.mm.bm.b tLy;
  
  public g()
  {
    GMTrace.i(13103005696000L, 97625);
    this.tLx = new LinkedList();
    GMTrace.o(13103005696000L, 97625);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13103139913728L, 97626);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLg);
      paramVarArgs.fk(2, this.tLw);
      paramVarArgs.d(3, 8, this.tLx);
      if (this.tLy != null) {
        paramVarArgs.b(4, this.tLy);
      }
      GMTrace.o(13103139913728L, 97626);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tLg) + 0 + b.a.a.a.fh(2, this.tLw) + b.a.a.a.c(3, 8, this.tLx);
      paramInt = i;
      if (this.tLy != null) {
        paramInt = i + b.a.a.a.a(4, this.tLy);
      }
      GMTrace.o(13103139913728L, 97626);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tLx.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13103139913728L, 97626);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13103139913728L, 97626);
        return -1;
      case 1: 
        localg.tLg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103139913728L, 97626);
        return 0;
      case 2: 
        localg.tLw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103139913728L, 97626);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((b)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localg.tLx.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13103139913728L, 97626);
        return 0;
      }
      localg.tLy = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(13103139913728L, 97626);
      return 0;
    }
    GMTrace.o(13103139913728L, 97626);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */