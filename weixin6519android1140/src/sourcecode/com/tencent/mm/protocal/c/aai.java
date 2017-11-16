package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aai
  extends azh
{
  public awq tWa;
  public LinkedList<String> uqZ;
  
  public aai()
  {
    GMTrace.i(3761183391744L, 28023);
    this.uqZ = new LinkedList();
    GMTrace.o(3761183391744L, 28023);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3761317609472L, 28024);
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
      paramVarArgs.d(3, 1, this.uqZ);
      GMTrace.o(3761317609472L, 28024);
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
      paramInt = b.a.a.a.c(3, 1, this.uqZ);
      GMTrace.o(3761317609472L, 28024);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uqZ.clear();
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
      GMTrace.o(3761317609472L, 28024);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aai localaai = (aai)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3761317609472L, 28024);
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
          localaai.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3761317609472L, 28024);
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
          localaai.tWa = ((awq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3761317609472L, 28024);
        return 0;
      }
      localaai.uqZ.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3761317609472L, 28024);
      return 0;
    }
    GMTrace.o(3761317609472L, 28024);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */