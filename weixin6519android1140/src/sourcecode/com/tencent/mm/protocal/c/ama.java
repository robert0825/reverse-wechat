package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ama
  extends azh
{
  public int uAQ;
  public int uAS;
  public LinkedList<aly> uAU;
  public LinkedList<aly> uAV;
  public String ugx;
  
  public ama()
  {
    GMTrace.i(3992306319360L, 29745);
    this.uAU = new LinkedList();
    this.uAV = new LinkedList();
    GMTrace.o(3992306319360L, 29745);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3992440537088L, 29746);
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
      if (this.ugx != null) {
        paramVarArgs.e(2, this.ugx);
      }
      paramVarArgs.fk(3, this.uAQ);
      paramVarArgs.d(4, 8, this.uAU);
      paramVarArgs.fk(5, this.uAS);
      paramVarArgs.d(6, 8, this.uAV);
      GMTrace.o(3992440537088L, 29746);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.ugx != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ugx);
      }
      paramInt = b.a.a.a.fh(3, this.uAQ);
      int j = b.a.a.a.c(4, 8, this.uAU);
      int k = b.a.a.a.fh(5, this.uAS);
      int m = b.a.a.a.c(6, 8, this.uAV);
      GMTrace.o(3992440537088L, 29746);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uAU.clear();
      this.uAV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3992440537088L, 29746);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ama localama = (ama)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3992440537088L, 29746);
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
          localama.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3992440537088L, 29746);
        return 0;
      case 2: 
        localama.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3992440537088L, 29746);
        return 0;
      case 3: 
        localama.uAQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3992440537088L, 29746);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aly();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aly)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localama.uAU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3992440537088L, 29746);
        return 0;
      case 5: 
        localama.uAS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3992440537088L, 29746);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aly();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((aly)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localama.uAV.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3992440537088L, 29746);
      return 0;
    }
    GMTrace.o(3992440537088L, 29746);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ama.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */