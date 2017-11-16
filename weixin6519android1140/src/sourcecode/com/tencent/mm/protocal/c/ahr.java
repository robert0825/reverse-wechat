package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ahr
  extends com.tencent.mm.bm.a
{
  public int uxe;
  public ahu uxf;
  public aht uxg;
  public ahs uxh;
  public ahq uxi;
  public ahv uxj;
  public ahw uxk;
  
  public ahr()
  {
    GMTrace.i(3640521654272L, 27124);
    GMTrace.o(3640521654272L, 27124);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3640655872000L, 27125);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uxe);
      if (this.uxf != null)
      {
        paramVarArgs.fm(2, this.uxf.aYq());
        this.uxf.a(paramVarArgs);
      }
      if (this.uxg != null)
      {
        paramVarArgs.fm(3, this.uxg.aYq());
        this.uxg.a(paramVarArgs);
      }
      if (this.uxh != null)
      {
        paramVarArgs.fm(4, this.uxh.aYq());
        this.uxh.a(paramVarArgs);
      }
      if (this.uxi != null)
      {
        paramVarArgs.fm(5, this.uxi.aYq());
        this.uxi.a(paramVarArgs);
      }
      if (this.uxj != null)
      {
        paramVarArgs.fm(6, this.uxj.aYq());
        this.uxj.a(paramVarArgs);
      }
      if (this.uxk != null)
      {
        paramVarArgs.fm(7, this.uxk.aYq());
        this.uxk.a(paramVarArgs);
      }
      GMTrace.o(3640655872000L, 27125);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uxe) + 0;
      paramInt = i;
      if (this.uxf != null) {
        paramInt = i + b.a.a.a.fj(2, this.uxf.aYq());
      }
      i = paramInt;
      if (this.uxg != null) {
        i = paramInt + b.a.a.a.fj(3, this.uxg.aYq());
      }
      paramInt = i;
      if (this.uxh != null) {
        paramInt = i + b.a.a.a.fj(4, this.uxh.aYq());
      }
      i = paramInt;
      if (this.uxi != null) {
        i = paramInt + b.a.a.a.fj(5, this.uxi.aYq());
      }
      paramInt = i;
      if (this.uxj != null) {
        paramInt = i + b.a.a.a.fj(6, this.uxj.aYq());
      }
      i = paramInt;
      if (this.uxk != null) {
        i = paramInt + b.a.a.a.fj(7, this.uxk.aYq());
      }
      GMTrace.o(3640655872000L, 27125);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3640655872000L, 27125);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ahr localahr = (ahr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3640655872000L, 27125);
        return -1;
      case 1: 
        localahr.uxe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3640655872000L, 27125);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahr.uxf = ((ahu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3640655872000L, 27125);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aht();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aht)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahr.uxg = ((aht)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3640655872000L, 27125);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahr.uxh = ((ahs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3640655872000L, 27125);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahr.uxi = ((ahq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3640655872000L, 27125);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahr.uxj = ((ahv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3640655872000L, 27125);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ahw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ahw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localahr.uxk = ((ahw)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3640655872000L, 27125);
      return 0;
    }
    GMTrace.o(3640655872000L, 27125);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */