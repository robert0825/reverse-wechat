package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdi
  extends ayx
{
  public int tMX;
  public float tYy;
  public float tYz;
  public azp uAI;
  public int uPy;
  public int uPz;
  public int ujb;
  public String ujc;
  public String ujd;
  public int uje;
  
  public bdi()
  {
    GMTrace.i(3998480334848L, 29791);
    GMTrace.o(3998480334848L, 29791);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3998614552576L, 29792);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      paramVarArgs.n(3, this.tYy);
      paramVarArgs.n(4, this.tYz);
      paramVarArgs.fk(5, this.ujb);
      if (this.ujc != null) {
        paramVarArgs.e(6, this.ujc);
      }
      if (this.ujd != null) {
        paramVarArgs.e(7, this.ujd);
      }
      paramVarArgs.fk(8, this.uPy);
      paramVarArgs.fk(9, this.uPz);
      paramVarArgs.fk(10, this.uje);
      if (this.uAI != null)
      {
        paramVarArgs.fm(11, this.uAI.aYq());
        this.uAI.a(paramVarArgs);
      }
      GMTrace.o(3998614552576L, 29792);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX) + (b.a.a.b.b.a.cK(3) + 4) + (b.a.a.b.b.a.cK(4) + 4) + b.a.a.a.fh(5, this.ujb);
      paramInt = i;
      if (this.ujc != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ujc);
      }
      i = paramInt;
      if (this.ujd != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ujd);
      }
      i = i + b.a.a.a.fh(8, this.uPy) + b.a.a.a.fh(9, this.uPz) + b.a.a.a.fh(10, this.uje);
      paramInt = i;
      if (this.uAI != null) {
        paramInt = i + b.a.a.a.fj(11, this.uAI.aYq());
      }
      GMTrace.o(3998614552576L, 29792);
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
      GMTrace.o(3998614552576L, 29792);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdi localbdi = (bdi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3998614552576L, 29792);
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
          localbdi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 2: 
        localbdi.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 3: 
        localbdi.tYy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 4: 
        localbdi.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 5: 
        localbdi.ujb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 6: 
        localbdi.ujc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 7: 
        localbdi.ujd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 8: 
        localbdi.uPy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 9: 
        localbdi.uPz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      case 10: 
        localbdi.uje = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998614552576L, 29792);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbdi.uAI = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3998614552576L, 29792);
      return 0;
    }
    GMTrace.o(3998614552576L, 29792);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */