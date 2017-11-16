package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class he
  extends azh
{
  public awq tWa;
  public LinkedList<hc> tWb;
  public boolean tWc;
  
  public he()
  {
    GMTrace.i(3648037847040L, 27180);
    this.tWb = new LinkedList();
    GMTrace.o(3648037847040L, 27180);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3648172064768L, 27181);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tWa == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tWa != null)
      {
        paramVarArgs.fm(2, this.tWa.aYq());
        this.tWa.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.tWb);
      paramVarArgs.ah(4, this.tWc);
      GMTrace.o(3648172064768L, 27181);
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
      if (this.tWa != null) {
        i = paramInt + b.a.a.a.fj(2, this.tWa.aYq());
      }
      paramInt = b.a.a.a.c(3, 8, this.tWb);
      int j = b.a.a.b.b.a.cK(4);
      GMTrace.o(3648172064768L, 27181);
      return i + paramInt + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tWb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tWa == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      GMTrace.o(3648172064768L, 27181);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      he localhe = (he)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3648172064768L, 27181);
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
          localhe.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648172064768L, 27181);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localhe.tWa = ((awq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648172064768L, 27181);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localhe.tWb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648172064768L, 27181);
        return 0;
      }
      localhe.tWc = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3648172064768L, 27181);
      return 0;
    }
    GMTrace.o(3648172064768L, 27181);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */