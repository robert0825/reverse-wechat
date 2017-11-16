package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bge
  extends ayx
{
  public int jhc;
  public LinkedList<azq> jhd;
  public String lRR;
  public int tMX;
  public int tOG;
  public long uRT;
  
  public bge()
  {
    GMTrace.i(4035927080960L, 30070);
    this.jhd = new LinkedList();
    GMTrace.o(4035927080960L, 30070);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4036061298688L, 30071);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      paramVarArgs.T(3, this.uRT);
      if (this.lRR != null) {
        paramVarArgs.e(4, this.lRR);
      }
      paramVarArgs.fk(5, this.jhc);
      paramVarArgs.d(6, 8, this.jhd);
      paramVarArgs.fk(7, this.tOG);
      GMTrace.o(4036061298688L, 30071);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX) + b.a.a.a.S(3, this.uRT);
      paramInt = i;
      if (this.lRR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRR);
      }
      i = b.a.a.a.fh(5, this.jhc);
      int j = b.a.a.a.c(6, 8, this.jhd);
      int k = b.a.a.a.fh(7, this.tOG);
      GMTrace.o(4036061298688L, 30071);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4036061298688L, 30071);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bge localbge = (bge)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4036061298688L, 30071);
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
          localbge.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 2: 
        localbge.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 3: 
        localbge.uRT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 4: 
        localbge.lRR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 5: 
        localbge.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbge.jhd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4036061298688L, 30071);
        return 0;
      }
      localbge.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4036061298688L, 30071);
      return 0;
    }
    GMTrace.o(4036061298688L, 30071);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */