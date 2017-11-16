package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aer
  extends ayx
{
  public String gjb;
  public String kJb;
  public boolean uuw;
  public String uux;
  
  public aer()
  {
    GMTrace.i(4008412446720L, 29865);
    GMTrace.o(4008412446720L, 29865);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4008546664448L, 29866);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kJb == null) {
        throw new b("Not all required fields were included: appusername");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.ah(2, this.uuw);
      if (this.gjb != null) {
        paramVarArgs.e(3, this.gjb);
      }
      if (this.kJb != null) {
        paramVarArgs.e(4, this.kJb);
      }
      if (this.uux != null) {
        paramVarArgs.e(5, this.uux);
      }
      GMTrace.o(4008546664448L, 29866);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.gjb != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.gjb);
      }
      i = paramInt;
      if (this.kJb != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.kJb);
      }
      paramInt = i;
      if (this.uux != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uux);
      }
      GMTrace.o(4008546664448L, 29866);
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
      if (this.kJb == null) {
        throw new b("Not all required fields were included: appusername");
      }
      GMTrace.o(4008546664448L, 29866);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aer localaer = (aer)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4008546664448L, 29866);
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
          localaer.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4008546664448L, 29866);
        return 0;
      case 2: 
        localaer.uuw = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(4008546664448L, 29866);
        return 0;
      case 3: 
        localaer.gjb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4008546664448L, 29866);
        return 0;
      case 4: 
        localaer.kJb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4008546664448L, 29866);
        return 0;
      }
      localaer.uux = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4008546664448L, 29866);
      return 0;
    }
    GMTrace.o(4008546664448L, 29866);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */