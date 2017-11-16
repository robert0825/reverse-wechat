package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbj
  extends ayx
{
  public String jhi;
  public String nIp;
  public int uGq;
  public String uOJ;
  public int usX;
  
  public bbj()
  {
    GMTrace.i(4000090947584L, 29803);
    GMTrace.o(4000090947584L, 29803);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4000225165312L, 29804);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.nIp != null) {
        paramVarArgs.e(3, this.nIp);
      }
      paramVarArgs.fk(4, this.uGq);
      paramVarArgs.fk(5, this.usX);
      if (this.uOJ != null) {
        paramVarArgs.e(6, this.uOJ);
      }
      GMTrace.o(4000225165312L, 29804);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.nIp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nIp);
      }
      i = i + b.a.a.a.fh(4, this.uGq) + b.a.a.a.fh(5, this.usX);
      paramInt = i;
      if (this.uOJ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uOJ);
      }
      GMTrace.o(4000225165312L, 29804);
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
      GMTrace.o(4000225165312L, 29804);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbj localbbj = (bbj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4000225165312L, 29804);
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
          localbbj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4000225165312L, 29804);
        return 0;
      case 2: 
        localbbj.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4000225165312L, 29804);
        return 0;
      case 3: 
        localbbj.nIp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4000225165312L, 29804);
        return 0;
      case 4: 
        localbbj.uGq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4000225165312L, 29804);
        return 0;
      case 5: 
        localbbj.usX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4000225165312L, 29804);
        return 0;
      }
      localbbj.uOJ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4000225165312L, 29804);
      return 0;
    }
    GMTrace.o(4000225165312L, 29804);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */