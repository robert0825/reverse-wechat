package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.bm.a
{
  public LinkedList<k> jhj;
  public int jhk;
  
  public l()
  {
    GMTrace.i(14831998468096L, 110507);
    this.jhj = new LinkedList();
    GMTrace.o(14831998468096L, 110507);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14832132685824L, 110508);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.jhj);
      paramVarArgs.fk(2, this.jhk);
      GMTrace.o(14832132685824L, 110508);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.jhj);
      i = b.a.a.a.fh(2, this.jhk);
      GMTrace.o(14832132685824L, 110508);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhj.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14832132685824L, 110508);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      l locall = (l)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14832132685824L, 110508);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locall.jhj.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(14832132685824L, 110508);
        return 0;
      }
      locall.jhk = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(14832132685824L, 110508);
      return 0;
    }
    GMTrace.o(14832132685824L, 110508);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */