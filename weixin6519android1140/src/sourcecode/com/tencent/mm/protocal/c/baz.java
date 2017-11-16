package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class baz
  extends ayx
{
  public int tMX;
  public azp tQz;
  public int uOt;
  public azq uxT;
  
  public baz()
  {
    GMTrace.i(3757693730816L, 27997);
    GMTrace.o(3757693730816L, 27997);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3757827948544L, 27998);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uxT != null)
      {
        paramVarArgs.fm(2, this.uxT.aYq());
        this.uxT.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tMX);
      paramVarArgs.fk(4, this.uOt);
      if (this.tQz != null)
      {
        paramVarArgs.fm(5, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      GMTrace.o(3757827948544L, 27998);
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
      if (this.uxT != null) {
        i = paramInt + b.a.a.a.fj(2, this.uxT.aYq());
      }
      i = i + b.a.a.a.fh(3, this.tMX) + b.a.a.a.fh(4, this.uOt);
      paramInt = i;
      if (this.tQz != null) {
        paramInt = i + b.a.a.a.fj(5, this.tQz.aYq());
      }
      GMTrace.o(3757827948544L, 27998);
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
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      GMTrace.o(3757827948544L, 27998);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      baz localbaz = (baz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3757827948544L, 27998);
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
          localbaz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3757827948544L, 27998);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbaz.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3757827948544L, 27998);
        return 0;
      case 3: 
        localbaz.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3757827948544L, 27998);
        return 0;
      case 4: 
        localbaz.uOt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3757827948544L, 27998);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbaz.tQz = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3757827948544L, 27998);
      return 0;
    }
    GMTrace.o(3757827948544L, 27998);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\baz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */