package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atl
  extends ayx
{
  public azp uJc;
  public int uwU;
  public int uwV;
  public azp uwW;
  
  public atl()
  {
    GMTrace.i(3822520893440L, 28480);
    GMTrace.o(3822520893440L, 28480);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3822655111168L, 28481);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uwW == null) {
        throw new b("Not all required fields were included: ReqText");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uwU);
      paramVarArgs.fk(3, this.uwV);
      if (this.uwW != null)
      {
        paramVarArgs.fm(4, this.uwW.aYq());
        this.uwW.a(paramVarArgs);
      }
      if (this.uJc != null)
      {
        paramVarArgs.fm(5, this.uJc.aYq());
        this.uJc.a(paramVarArgs);
      }
      GMTrace.o(3822655111168L, 28481);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uwU) + b.a.a.a.fh(3, this.uwV);
      paramInt = i;
      if (this.uwW != null) {
        paramInt = i + b.a.a.a.fj(4, this.uwW.aYq());
      }
      i = paramInt;
      if (this.uJc != null) {
        i = paramInt + b.a.a.a.fj(5, this.uJc.aYq());
      }
      GMTrace.o(3822655111168L, 28481);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uwW == null) {
        throw new b("Not all required fields were included: ReqText");
      }
      GMTrace.o(3822655111168L, 28481);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atl localatl = (atl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3822655111168L, 28481);
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
          localatl.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3822655111168L, 28481);
        return 0;
      case 2: 
        localatl.uwU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822655111168L, 28481);
        return 0;
      case 3: 
        localatl.uwV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3822655111168L, 28481);
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
          localatl.uwW = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3822655111168L, 28481);
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
        localatl.uJc = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3822655111168L, 28481);
      return 0;
    }
    GMTrace.o(3822655111168L, 28481);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\atl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */