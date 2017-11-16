package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpg
  extends ayx
{
  public int jib;
  public long uXW;
  public String uYY;
  public int uhU;
  public long uhV;
  
  public bpg()
  {
    GMTrace.i(3822789328896L, 28482);
    GMTrace.o(3822789328896L, 28482);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3822923546624L, 28483);
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
      if (this.uYY != null) {
        paramVarArgs.e(4, this.uYY);
      }
      paramVarArgs.fk(5, this.jib);
      paramVarArgs.T(6, this.uXW);
      GMTrace.o(3822923546624L, 28483);
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
      if (this.uYY != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uYY);
      }
      i = b.a.a.a.fh(5, this.jib);
      int j = b.a.a.a.S(6, this.uXW);
      GMTrace.o(3822923546624L, 28483);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3822923546624L, 28483);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpg localbpg = (bpg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3822923546624L, 28483);
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
          localbpg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3822923546624L, 28483);
        return 0;
      case 2: 
        localbpg.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822923546624L, 28483);
        return 0;
      case 3: 
        localbpg.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3822923546624L, 28483);
        return 0;
      case 4: 
        localbpg.uYY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3822923546624L, 28483);
        return 0;
      case 5: 
        localbpg.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822923546624L, 28483);
        return 0;
      }
      localbpg.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3822923546624L, 28483);
      return 0;
    }
    GMTrace.o(3822923546624L, 28483);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */