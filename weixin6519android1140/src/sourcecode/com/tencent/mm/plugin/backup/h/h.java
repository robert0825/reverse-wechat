package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public LinkedList<g> jhd;
  
  public h()
  {
    GMTrace.i(14833609080832L, 110519);
    this.jhd = new LinkedList();
    GMTrace.o(14833609080832L, 110519);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14833743298560L, 110520);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jhc);
      paramVarArgs.d(2, 8, this.jhd);
      GMTrace.o(14833743298560L, 110520);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.jhc);
      i = b.a.a.a.c(2, 8, this.jhd);
      GMTrace.o(14833743298560L, 110520);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14833743298560L, 110520);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      h localh = (h)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14833743298560L, 110520);
        return -1;
      case 1: 
        localh.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14833743298560L, 110520);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new g();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localh.jhd.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(14833743298560L, 110520);
      return 0;
    }
    GMTrace.o(14833743298560L, 110520);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */