package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class af
  extends ayx
{
  public String lPg;
  public int lQC;
  public int lQD;
  
  public af()
  {
    GMTrace.i(12639686098944L, 94173);
    GMTrace.o(12639686098944L, 94173);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12639820316672L, 94174);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPg != null) {
        paramVarArgs.e(2, this.lPg);
      }
      paramVarArgs.fk(3, this.lQC);
      paramVarArgs.fk(4, this.lQD);
      GMTrace.o(12639820316672L, 94174);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.lPg != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPg);
      }
      paramInt = b.a.a.a.fh(3, this.lQC);
      int j = b.a.a.a.fh(4, this.lQD);
      GMTrace.o(12639820316672L, 94174);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12639820316672L, 94174);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      af localaf = (af)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12639820316672L, 94174);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12639820316672L, 94174);
        return 0;
      case 2: 
        localaf.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12639820316672L, 94174);
        return 0;
      case 3: 
        localaf.lQC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12639820316672L, 94174);
        return 0;
      }
      localaf.lQD = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(12639820316672L, 94174);
      return 0;
    }
    GMTrace.o(12639820316672L, 94174);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */