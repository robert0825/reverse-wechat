package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atu
  extends com.tencent.mm.bm.a
{
  public btt uJm;
  public btv uJn;
  public btp uJo;
  public String udZ;
  
  public atu()
  {
    GMTrace.i(3630589542400L, 27050);
    GMTrace.o(3630589542400L, 27050);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3630723760128L, 27051);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.udZ == null) {
        throw new b("Not all required fields were included: PkgId");
      }
      if (this.udZ != null) {
        paramVarArgs.e(1, this.udZ);
      }
      if (this.uJm != null)
      {
        paramVarArgs.fm(2, this.uJm.aYq());
        this.uJm.a(paramVarArgs);
      }
      if (this.uJn != null)
      {
        paramVarArgs.fm(3, this.uJn.aYq());
        this.uJn.a(paramVarArgs);
      }
      if (this.uJo != null)
      {
        paramVarArgs.fm(4, this.uJo.aYq());
        this.uJo.a(paramVarArgs);
      }
      GMTrace.o(3630723760128L, 27051);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.udZ != null) {
        i = b.a.a.b.b.a.f(1, this.udZ) + 0;
      }
      paramInt = i;
      if (this.uJm != null) {
        paramInt = i + b.a.a.a.fj(2, this.uJm.aYq());
      }
      i = paramInt;
      if (this.uJn != null) {
        i = paramInt + b.a.a.a.fj(3, this.uJn.aYq());
      }
      paramInt = i;
      if (this.uJo != null) {
        paramInt = i + b.a.a.a.fj(4, this.uJo.aYq());
      }
      GMTrace.o(3630723760128L, 27051);
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
      if (this.udZ == null) {
        throw new b("Not all required fields were included: PkgId");
      }
      GMTrace.o(3630723760128L, 27051);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atu localatu = (atu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3630723760128L, 27051);
        return -1;
      case 1: 
        localatu.udZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3630723760128L, 27051);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localatu.uJm = ((btt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3630723760128L, 27051);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localatu.uJn = ((btv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3630723760128L, 27051);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((btp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localatu.uJo = ((btp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3630723760128L, 27051);
      return 0;
    }
    GMTrace.o(3630723760128L, 27051);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\atu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */