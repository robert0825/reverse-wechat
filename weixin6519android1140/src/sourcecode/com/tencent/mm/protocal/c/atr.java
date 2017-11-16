package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atr
  extends com.tencent.mm.bm.a
{
  public alk ufs;
  public int uhM;
  
  public atr()
  {
    GMTrace.i(17870285176832L, 133144);
    GMTrace.o(17870285176832L, 133144);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17870419394560L, 133145);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufs != null)
      {
        paramVarArgs.fm(1, this.ufs.aYq());
        this.ufs.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhM);
      GMTrace.o(17870419394560L, 133145);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ufs != null) {
        paramInt = b.a.a.a.fj(1, this.ufs.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uhM);
      GMTrace.o(17870419394560L, 133145);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17870419394560L, 133145);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atr localatr = (atr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17870419394560L, 133145);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((alk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localatr.ufs = ((alk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17870419394560L, 133145);
        return 0;
      }
      localatr.uhM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(17870419394560L, 133145);
      return 0;
    }
    GMTrace.o(17870419394560L, 133145);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\atr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */