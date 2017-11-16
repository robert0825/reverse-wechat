package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abw
  extends ayx
{
  public int tMX;
  public int tOG;
  public double tWm;
  public double tWn;
  public String unf;
  public azp urP;
  public int urR;
  public double uss;
  public double ust;
  
  public abw()
  {
    GMTrace.i(3715280928768L, 27681);
    GMTrace.o(3715280928768L, 27681);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3715415146496L, 27682);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urP == null) {
        throw new b("Not all required fields were included: Buff");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tOG);
      paramVarArgs.fk(3, this.tMX);
      if (this.unf != null) {
        paramVarArgs.e(4, this.unf);
      }
      if (this.urP != null)
      {
        paramVarArgs.fm(5, this.urP.aYq());
        this.urP.a(paramVarArgs);
      }
      paramVarArgs.a(6, this.tWm);
      paramVarArgs.a(7, this.tWn);
      paramVarArgs.a(8, this.uss);
      paramVarArgs.a(9, this.ust);
      paramVarArgs.fk(10, this.urR);
      GMTrace.o(3715415146496L, 27682);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tOG) + b.a.a.a.fh(3, this.tMX);
      paramInt = i;
      if (this.unf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.unf);
      }
      i = paramInt;
      if (this.urP != null) {
        i = paramInt + b.a.a.a.fj(5, this.urP.aYq());
      }
      paramInt = b.a.a.b.b.a.cK(6);
      int j = b.a.a.b.b.a.cK(7);
      int k = b.a.a.b.b.a.cK(8);
      int m = b.a.a.b.b.a.cK(9);
      int n = b.a.a.a.fh(10, this.urR);
      GMTrace.o(3715415146496L, 27682);
      return i + (paramInt + 8) + (j + 8) + (k + 8) + (m + 8) + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.urP == null) {
        throw new b("Not all required fields were included: Buff");
      }
      GMTrace.o(3715415146496L, 27682);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abw localabw = (abw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3715415146496L, 27682);
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
          localabw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 2: 
        localabw.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 3: 
        localabw.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 4: 
        localabw.unf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabw.urP = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 6: 
        localabw.tWm = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 7: 
        localabw.tWn = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 8: 
        localabw.uss = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      case 9: 
        localabw.ust = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3715415146496L, 27682);
        return 0;
      }
      localabw.urR = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3715415146496L, 27682);
      return 0;
    }
    GMTrace.o(3715415146496L, 27682);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */