package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ru
  extends ayx
{
  public int tOG;
  public String uhT;
  public int uhU;
  public long uhV;
  
  public ru()
  {
    GMTrace.i(3975797538816L, 29622);
    GMTrace.o(3975797538816L, 29622);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3975931756544L, 29623);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      if (this.uhT != null) {
        paramVarArgs.e(4, this.uhT);
      }
      paramVarArgs.fk(5, this.tOG);
      GMTrace.o(3975931756544L, 29623);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV);
      paramInt = i;
      if (this.uhT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uhT);
      }
      i = b.a.a.a.fh(5, this.tOG);
      GMTrace.o(3975931756544L, 29623);
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
      GMTrace.o(3975931756544L, 29623);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ru localru = (ru)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3975931756544L, 29623);
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
          localru.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3975931756544L, 29623);
        return 0;
      case 2: 
        localru.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3975931756544L, 29623);
        return 0;
      case 3: 
        localru.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3975931756544L, 29623);
        return 0;
      case 4: 
        localru.uhT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3975931756544L, 29623);
        return 0;
      }
      localru.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3975931756544L, 29623);
      return 0;
    }
    GMTrace.o(3975931756544L, 29623);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */