package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bm.a
{
  public int tLg;
  public int tLu;
  public int tLw;
  public LinkedList<e> tLx;
  public b tLy;
  
  public i()
  {
    GMTrace.i(13101395083264L, 97613);
    this.tLx = new LinkedList();
    GMTrace.o(13101395083264L, 97613);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13101529300992L, 97614);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLg);
      paramVarArgs.fk(2, this.tLw);
      paramVarArgs.fk(3, this.tLu);
      paramVarArgs.d(4, 8, this.tLx);
      if (this.tLy != null) {
        paramVarArgs.b(5, this.tLy);
      }
      GMTrace.o(13101529300992L, 97614);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tLg) + 0 + b.a.a.a.fh(2, this.tLw) + b.a.a.a.fh(3, this.tLu) + b.a.a.a.c(4, 8, this.tLx);
      paramInt = i;
      if (this.tLy != null) {
        paramInt = i + b.a.a.a.a(5, this.tLy);
      }
      GMTrace.o(13101529300992L, 97614);
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
      GMTrace.o(13101529300992L, 97614);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13101529300992L, 97614);
        return -1;
      case 1: 
        locali.tLg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13101529300992L, 97614);
        return 0;
      case 2: 
        locali.tLw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13101529300992L, 97614);
        return 0;
      case 3: 
        locali.tLu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13101529300992L, 97614);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locali.tLx.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13101529300992L, 97614);
        return 0;
      }
      locali.tLy = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(13101529300992L, 97614);
      return 0;
    }
    GMTrace.o(13101529300992L, 97614);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */