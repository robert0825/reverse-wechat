package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adw
  extends azh
{
  public int jhc;
  public LinkedList<azq> jhd;
  public String utF;
  public azp utI;
  public int utJ;
  
  public adw()
  {
    GMTrace.i(4001164689408L, 29811);
    this.jhd = new LinkedList();
    GMTrace.o(4001164689408L, 29811);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4001298907136L, 29812);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.jhd);
      if (this.utF != null) {
        paramVarArgs.e(4, this.utF);
      }
      if (this.utI != null)
      {
        paramVarArgs.fm(5, this.utI.aYq());
        this.utI.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.utJ);
      GMTrace.o(4001298907136L, 29812);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhc) + b.a.a.a.c(3, 8, this.jhd);
      paramInt = i;
      if (this.utF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.utF);
      }
      i = paramInt;
      if (this.utI != null) {
        i = paramInt + b.a.a.a.fj(5, this.utI.aYq());
      }
      paramInt = b.a.a.a.fh(6, this.utJ);
      GMTrace.o(4001298907136L, 29812);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4001298907136L, 29812);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adw localadw = (adw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4001298907136L, 29812);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localadw.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4001298907136L, 29812);
        return 0;
      case 2: 
        localadw.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4001298907136L, 29812);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localadw.jhd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4001298907136L, 29812);
        return 0;
      case 4: 
        localadw.utF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4001298907136L, 29812);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localadw.utI = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4001298907136L, 29812);
        return 0;
      }
      localadw.utJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4001298907136L, 29812);
      return 0;
    }
    GMTrace.o(4001298907136L, 29812);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\adw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */