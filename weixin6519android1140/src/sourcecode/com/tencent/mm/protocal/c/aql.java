package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aql
  extends com.tencent.mm.bm.a
{
  public long lastUpdateTime;
  public LinkedList<jl> ufh;
  public int ufi;
  public int ufj;
  public int version;
  
  public aql()
  {
    GMTrace.i(3689242689536L, 27487);
    this.ufh = new LinkedList();
    GMTrace.o(3689242689536L, 27487);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3689376907264L, 27488);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.ufh);
      paramVarArgs.fk(2, this.version);
      paramVarArgs.fk(3, this.ufi);
      paramVarArgs.fk(4, this.ufj);
      paramVarArgs.T(5, this.lastUpdateTime);
      GMTrace.o(3689376907264L, 27488);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.ufh);
      i = b.a.a.a.fh(2, this.version);
      int j = b.a.a.a.fh(3, this.ufi);
      int k = b.a.a.a.fh(4, this.ufj);
      int m = b.a.a.a.S(5, this.lastUpdateTime);
      GMTrace.o(3689376907264L, 27488);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ufh.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3689376907264L, 27488);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aql localaql = (aql)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3689376907264L, 27488);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((jl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaql.ufh.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3689376907264L, 27488);
        return 0;
      case 2: 
        localaql.version = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689376907264L, 27488);
        return 0;
      case 3: 
        localaql.ufi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689376907264L, 27488);
        return 0;
      case 4: 
        localaql.ufj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689376907264L, 27488);
        return 0;
      }
      localaql.lastUpdateTime = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3689376907264L, 27488);
      return 0;
    }
    GMTrace.o(3689376907264L, 27488);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */