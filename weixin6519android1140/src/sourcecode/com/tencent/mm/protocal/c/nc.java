package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nc
  extends ayx
{
  public String tQb;
  public String tVK;
  public int udW;
  public String udX;
  public LinkedList<nb> udY;
  
  public nc()
  {
    GMTrace.i(3666828328960L, 27320);
    this.udY = new LinkedList();
    GMTrace.o(3666828328960L, 27320);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3666962546688L, 27321);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.udW);
      if (this.udX != null) {
        paramVarArgs.e(3, this.udX);
      }
      if (this.tVK != null) {
        paramVarArgs.e(4, this.tVK);
      }
      if (this.tQb != null) {
        paramVarArgs.e(5, this.tQb);
      }
      paramVarArgs.d(6, 8, this.udY);
      GMTrace.o(3666962546688L, 27321);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.udW);
      paramInt = i;
      if (this.udX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.udX);
      }
      i = paramInt;
      if (this.tVK != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tVK);
      }
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tQb);
      }
      i = b.a.a.a.c(6, 8, this.udY);
      GMTrace.o(3666962546688L, 27321);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.udY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3666962546688L, 27321);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nc localnc = (nc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3666962546688L, 27321);
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
          localnc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3666962546688L, 27321);
        return 0;
      case 2: 
        localnc.udW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3666962546688L, 27321);
        return 0;
      case 3: 
        localnc.udX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3666962546688L, 27321);
        return 0;
      case 4: 
        localnc.tVK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3666962546688L, 27321);
        return 0;
      case 5: 
        localnc.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3666962546688L, 27321);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new nb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((nb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localnc.udY.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3666962546688L, 27321);
      return 0;
    }
    GMTrace.o(3666962546688L, 27321);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */