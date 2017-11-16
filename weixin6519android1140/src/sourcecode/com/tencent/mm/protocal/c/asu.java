package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asu
  extends azh
{
  public int kBk;
  public String kBl;
  public asv uIE;
  public ask uIF;
  
  public asu()
  {
    GMTrace.i(3772726116352L, 28109);
    GMTrace.o(3772726116352L, 28109);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3772860334080L, 28110);
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
      paramVarArgs.fk(2, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(3, this.kBl);
      }
      if (this.uIE != null)
      {
        paramVarArgs.fm(4, this.uIE.aYq());
        this.uIE.a(paramVarArgs);
      }
      if (this.uIF != null)
      {
        paramVarArgs.fm(5, this.uIF.aYq());
        this.uIF.a(paramVarArgs);
      }
      GMTrace.o(3772860334080L, 28110);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.kBk);
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kBl);
      }
      i = paramInt;
      if (this.uIE != null) {
        i = paramInt + b.a.a.a.fj(4, this.uIE.aYq());
      }
      paramInt = i;
      if (this.uIF != null) {
        paramInt = i + b.a.a.a.fj(5, this.uIF.aYq());
      }
      GMTrace.o(3772860334080L, 28110);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3772860334080L, 28110);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asu localasu = (asu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3772860334080L, 28110);
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
          localasu.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3772860334080L, 28110);
        return 0;
      case 2: 
        localasu.kBk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3772860334080L, 28110);
        return 0;
      case 3: 
        localasu.kBl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3772860334080L, 28110);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new asv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((asv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localasu.uIE = ((asv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3772860334080L, 28110);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ask();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ask)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localasu.uIF = ((ask)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3772860334080L, 28110);
      return 0;
    }
    GMTrace.o(3772860334080L, 28110);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\asu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */