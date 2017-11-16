package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abd
  extends ayx
{
  public String tXF;
  public String tYP;
  public bz urB;
  
  public abd()
  {
    GMTrace.i(4021431566336L, 29962);
    GMTrace.o(4021431566336L, 29962);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4021565784064L, 29963);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urB == null) {
        throw new b("Not all required fields were included: Address");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tXF != null) {
        paramVarArgs.e(2, this.tXF);
      }
      if (this.tYP != null) {
        paramVarArgs.e(3, this.tYP);
      }
      if (this.urB != null)
      {
        paramVarArgs.fm(4, this.urB.aYq());
        this.urB.a(paramVarArgs);
      }
      GMTrace.o(4021565784064L, 29963);
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
      if (this.tXF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tXF);
      }
      i = paramInt;
      if (this.tYP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tYP);
      }
      paramInt = i;
      if (this.urB != null) {
        paramInt = i + b.a.a.a.fj(4, this.urB.aYq());
      }
      GMTrace.o(4021565784064L, 29963);
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
      if (this.urB == null) {
        throw new b("Not all required fields were included: Address");
      }
      GMTrace.o(4021565784064L, 29963);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abd localabd = (abd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4021565784064L, 29963);
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
          localabd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4021565784064L, 29963);
        return 0;
      case 2: 
        localabd.tXF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021565784064L, 29963);
        return 0;
      case 3: 
        localabd.tYP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4021565784064L, 29963);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localabd.urB = ((bz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4021565784064L, 29963);
      return 0;
    }
    GMTrace.o(4021565784064L, 29963);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */