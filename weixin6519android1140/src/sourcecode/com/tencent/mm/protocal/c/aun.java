package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aun
  extends azh
{
  public String uJO;
  public String uJP;
  public String uJQ;
  public String uJR;
  
  public aun()
  {
    GMTrace.i(3903051530240L, 29080);
    GMTrace.o(3903051530240L, 29080);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3903185747968L, 29081);
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
      if (this.uJO != null) {
        paramVarArgs.e(2, this.uJO);
      }
      if (this.uJP != null) {
        paramVarArgs.e(3, this.uJP);
      }
      if (this.uJQ != null) {
        paramVarArgs.e(4, this.uJQ);
      }
      if (this.uJR != null) {
        paramVarArgs.e(5, this.uJR);
      }
      GMTrace.o(3903185747968L, 29081);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uJO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uJO);
      }
      i = paramInt;
      if (this.uJP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uJP);
      }
      paramInt = i;
      if (this.uJQ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uJQ);
      }
      i = paramInt;
      if (this.uJR != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uJR);
      }
      GMTrace.o(3903185747968L, 29081);
      return i;
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
      GMTrace.o(3903185747968L, 29081);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aun localaun = (aun)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3903185747968L, 29081);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaun.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3903185747968L, 29081);
        return 0;
      case 2: 
        localaun.uJO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3903185747968L, 29081);
        return 0;
      case 3: 
        localaun.uJP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3903185747968L, 29081);
        return 0;
      case 4: 
        localaun.uJQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3903185747968L, 29081);
        return 0;
      }
      localaun.uJR = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3903185747968L, 29081);
      return 0;
    }
    GMTrace.o(3903185747968L, 29081);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */