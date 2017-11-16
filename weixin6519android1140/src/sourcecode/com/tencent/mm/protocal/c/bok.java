package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bok
  extends ayx
{
  public long uKe;
  public int uKf;
  public long uYy;
  public String uYz;
  public long uhV;
  public int unQ;
  
  public bok()
  {
    GMTrace.i(4038343000064L, 30088);
    GMTrace.o(4038343000064L, 30088);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4038477217792L, 30089);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uKf);
      paramVarArgs.T(3, this.uYy);
      paramVarArgs.T(4, this.uhV);
      if (this.uYz != null) {
        paramVarArgs.e(5, this.uYz);
      }
      paramVarArgs.T(6, this.uKe);
      paramVarArgs.fk(7, this.unQ);
      GMTrace.o(4038477217792L, 30089);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uKf) + b.a.a.a.S(3, this.uYy) + b.a.a.a.S(4, this.uhV);
      paramInt = i;
      if (this.uYz != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uYz);
      }
      i = b.a.a.a.S(6, this.uKe);
      int j = b.a.a.a.fh(7, this.unQ);
      GMTrace.o(4038477217792L, 30089);
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
      GMTrace.o(4038477217792L, 30089);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bok localbok = (bok)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4038477217792L, 30089);
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
          localbok.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4038477217792L, 30089);
        return 0;
      case 2: 
        localbok.uKf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4038477217792L, 30089);
        return 0;
      case 3: 
        localbok.uYy = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4038477217792L, 30089);
        return 0;
      case 4: 
        localbok.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4038477217792L, 30089);
        return 0;
      case 5: 
        localbok.uYz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4038477217792L, 30089);
        return 0;
      case 6: 
        localbok.uKe = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4038477217792L, 30089);
        return 0;
      }
      localbok.unQ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4038477217792L, 30089);
      return 0;
    }
    GMTrace.o(4038477217792L, 30089);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */