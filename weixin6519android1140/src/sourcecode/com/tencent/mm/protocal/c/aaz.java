package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aaz
  extends ayx
{
  public String lqh;
  public String lqi;
  public String lqj;
  public String tNa;
  public pw tNr;
  
  public aaz()
  {
    GMTrace.i(3962375766016L, 29522);
    GMTrace.o(3962375766016L, 29522);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3962509983744L, 29523);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lqh != null) {
        paramVarArgs.e(2, this.lqh);
      }
      if (this.lqi != null) {
        paramVarArgs.e(3, this.lqi);
      }
      if (this.lqj != null) {
        paramVarArgs.e(4, this.lqj);
      }
      if (this.tNa != null) {
        paramVarArgs.e(5, this.tNa);
      }
      if (this.tNr != null)
      {
        paramVarArgs.fm(6, this.tNr.aYq());
        this.tNr.a(paramVarArgs);
      }
      GMTrace.o(3962509983744L, 29523);
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
      if (this.lqh != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lqh);
      }
      i = paramInt;
      if (this.lqi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lqi);
      }
      paramInt = i;
      if (this.lqj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lqj);
      }
      i = paramInt;
      if (this.tNa != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tNa);
      }
      paramInt = i;
      if (this.tNr != null) {
        paramInt = i + b.a.a.a.fj(6, this.tNr.aYq());
      }
      GMTrace.o(3962509983744L, 29523);
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
      GMTrace.o(3962509983744L, 29523);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aaz localaaz = (aaz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3962509983744L, 29523);
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
          localaaz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 2: 
        localaaz.lqh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 3: 
        localaaz.lqi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 4: 
        localaaz.lqj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 5: 
        localaaz.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new pw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((pw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localaaz.tNr = ((pw)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3962509983744L, 29523);
      return 0;
    }
    GMTrace.o(3962509983744L, 29523);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */