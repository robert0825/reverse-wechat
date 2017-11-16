package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bju
  extends ayx
{
  public String gVf;
  public int scene;
  public aiu uUG;
  public LinkedList<ci> uUH;
  
  public bju()
  {
    GMTrace.i(3813930958848L, 28416);
    this.uUH = new LinkedList();
    GMTrace.o(3813930958848L, 28416);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3814065176576L, 28417);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.gVf != null) {
        paramVarArgs.e(2, this.gVf);
      }
      paramVarArgs.fk(3, this.scene);
      if (this.uUG != null)
      {
        paramVarArgs.fm(4, this.uUG.aYq());
        this.uUG.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.uUH);
      GMTrace.o(3814065176576L, 28417);
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
      if (this.gVf != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.gVf);
      }
      i += b.a.a.a.fh(3, this.scene);
      paramInt = i;
      if (this.uUG != null) {
        paramInt = i + b.a.a.a.fj(4, this.uUG.aYq());
      }
      i = b.a.a.a.c(5, 8, this.uUH);
      GMTrace.o(3814065176576L, 28417);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uUH.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3814065176576L, 28417);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bju localbju = (bju)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3814065176576L, 28417);
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
          localbju.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3814065176576L, 28417);
        return 0;
      case 2: 
        localbju.gVf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3814065176576L, 28417);
        return 0;
      case 3: 
        localbju.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3814065176576L, 28417);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aiu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aiu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbju.uUG = ((aiu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3814065176576L, 28417);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ci();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ci)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbju.uUH.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3814065176576L, 28417);
      return 0;
    }
    GMTrace.o(3814065176576L, 28417);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */