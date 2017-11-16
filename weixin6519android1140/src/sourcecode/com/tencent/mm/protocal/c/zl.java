package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zl
  extends com.tencent.mm.bm.a
{
  public int tMX;
  public int ugF;
  public int uqo;
  public azp uqp;
  public String uqq;
  public int uqr;
  public long uqs;
  
  public zl()
  {
    GMTrace.i(3819299667968L, 28456);
    GMTrace.o(3819299667968L, 28456);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3819433885696L, 28457);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tMX);
      paramVarArgs.fk(2, this.uqo);
      if (this.uqp != null)
      {
        paramVarArgs.fm(3, this.uqp.aYq());
        this.uqp.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.ugF);
      if (this.uqq != null) {
        paramVarArgs.e(5, this.uqq);
      }
      paramVarArgs.fk(6, this.uqr);
      paramVarArgs.T(7, this.uqs);
      GMTrace.o(3819433885696L, 28457);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tMX) + 0 + b.a.a.a.fh(2, this.uqo);
      paramInt = i;
      if (this.uqp != null) {
        paramInt = i + b.a.a.a.fj(3, this.uqp.aYq());
      }
      i = paramInt + b.a.a.a.fh(4, this.ugF);
      paramInt = i;
      if (this.uqq != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uqq);
      }
      i = b.a.a.a.fh(6, this.uqr);
      int j = b.a.a.a.S(7, this.uqs);
      GMTrace.o(3819433885696L, 28457);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3819433885696L, 28457);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zl localzl = (zl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3819433885696L, 28457);
        return -1;
      case 1: 
        localzl.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3819433885696L, 28457);
        return 0;
      case 2: 
        localzl.uqo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3819433885696L, 28457);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzl.uqp = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3819433885696L, 28457);
        return 0;
      case 4: 
        localzl.ugF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3819433885696L, 28457);
        return 0;
      case 5: 
        localzl.uqq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3819433885696L, 28457);
        return 0;
      case 6: 
        localzl.uqr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3819433885696L, 28457);
        return 0;
      }
      localzl.uqs = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3819433885696L, 28457);
      return 0;
    }
    GMTrace.o(3819433885696L, 28457);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */