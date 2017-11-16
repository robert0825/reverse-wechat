package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auc
  extends com.tencent.mm.bm.a
{
  public bjz uJw;
  public String urA;
  public int ury;
  public String urz;
  
  public auc()
  {
    GMTrace.i(3826547425280L, 28510);
    GMTrace.o(3826547425280L, 28510);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3826681643008L, 28511);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ury);
      if (this.urz != null) {
        paramVarArgs.e(2, this.urz);
      }
      if (this.urA != null) {
        paramVarArgs.e(3, this.urA);
      }
      if (this.uJw != null)
      {
        paramVarArgs.fm(4, this.uJw.aYq());
        this.uJw.a(paramVarArgs);
      }
      GMTrace.o(3826681643008L, 28511);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.ury) + 0;
      paramInt = i;
      if (this.urz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.urz);
      }
      i = paramInt;
      if (this.urA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.urA);
      }
      paramInt = i;
      if (this.uJw != null) {
        paramInt = i + b.a.a.a.fj(4, this.uJw.aYq());
      }
      GMTrace.o(3826681643008L, 28511);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3826681643008L, 28511);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auc localauc = (auc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3826681643008L, 28511);
        return -1;
      case 1: 
        localauc.ury = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3826681643008L, 28511);
        return 0;
      case 2: 
        localauc.urz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3826681643008L, 28511);
        return 0;
      case 3: 
        localauc.urA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3826681643008L, 28511);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bjz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bjz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localauc.uJw = ((bjz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3826681643008L, 28511);
      return 0;
    }
    GMTrace.o(3826681643008L, 28511);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\auc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */