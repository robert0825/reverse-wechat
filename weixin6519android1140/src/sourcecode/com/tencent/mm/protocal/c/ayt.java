package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayt
  extends ayx
{
  public int uNb;
  public LinkedList<azq> uNc;
  public azq uNd;
  public azq uNe;
  
  public ayt()
  {
    GMTrace.i(3980360941568L, 29656);
    this.uNc = new LinkedList();
    GMTrace.o(3980360941568L, 29656);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3980495159296L, 29657);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uNb);
      paramVarArgs.d(3, 8, this.uNc);
      if (this.uNd != null)
      {
        paramVarArgs.fm(4, this.uNd.aYq());
        this.uNd.a(paramVarArgs);
      }
      if (this.uNe != null)
      {
        paramVarArgs.fm(5, this.uNe.aYq());
        this.uNe.a(paramVarArgs);
      }
      GMTrace.o(3980495159296L, 29657);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uNb) + b.a.a.a.c(3, 8, this.uNc);
      paramInt = i;
      if (this.uNd != null) {
        paramInt = i + b.a.a.a.fj(4, this.uNd.aYq());
      }
      i = paramInt;
      if (this.uNe != null) {
        i = paramInt + b.a.a.a.fj(5, this.uNe.aYq());
      }
      GMTrace.o(3980495159296L, 29657);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uNc.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3980495159296L, 29657);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayt localayt = (ayt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3980495159296L, 29657);
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
          localayt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980495159296L, 29657);
        return 0;
      case 2: 
        localayt.uNb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3980495159296L, 29657);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayt.uNc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980495159296L, 29657);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayt.uNd = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980495159296L, 29657);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localayt.uNe = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3980495159296L, 29657);
      return 0;
    }
    GMTrace.o(3980495159296L, 29657);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ayt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */