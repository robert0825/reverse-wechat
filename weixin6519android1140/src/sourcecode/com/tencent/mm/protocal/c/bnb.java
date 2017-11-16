package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnb
  extends ayx
{
  public azp tUK;
  public String uMy;
  public String uMz;
  public String uoX;
  public long uoY;
  
  public bnb()
  {
    GMTrace.i(3642400702464L, 27138);
    GMTrace.o(3642400702464L, 27138);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3642534920192L, 27139);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uoX != null) {
        paramVarArgs.e(2, this.uoX);
      }
      paramVarArgs.T(3, this.uoY);
      if (this.tUK != null)
      {
        paramVarArgs.fm(4, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      if (this.uMy != null) {
        paramVarArgs.e(5, this.uMy);
      }
      if (this.uMz != null) {
        paramVarArgs.e(6, this.uMz);
      }
      GMTrace.o(3642534920192L, 27139);
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
      if (this.uoX != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uoX);
      }
      i += b.a.a.a.S(3, this.uoY);
      paramInt = i;
      if (this.tUK != null) {
        paramInt = i + b.a.a.a.fj(4, this.tUK.aYq());
      }
      i = paramInt;
      if (this.uMy != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uMy);
      }
      paramInt = i;
      if (this.uMz != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uMz);
      }
      GMTrace.o(3642534920192L, 27139);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3642534920192L, 27139);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnb localbnb = (bnb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3642534920192L, 27139);
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
          localbnb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3642534920192L, 27139);
        return 0;
      case 2: 
        localbnb.uoX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3642534920192L, 27139);
        return 0;
      case 3: 
        localbnb.uoY = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3642534920192L, 27139);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnb.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3642534920192L, 27139);
        return 0;
      case 5: 
        localbnb.uMy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3642534920192L, 27139);
        return 0;
      }
      localbnb.uMz = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3642534920192L, 27139);
      return 0;
    }
    GMTrace.o(3642534920192L, 27139);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */