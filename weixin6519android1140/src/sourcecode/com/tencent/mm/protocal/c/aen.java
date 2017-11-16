package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aen
  extends ayx
{
  public String lPg;
  public int tOG;
  public LinkedList<azq> tTO;
  public int uqd;
  
  public aen()
  {
    GMTrace.i(4018076123136L, 29937);
    this.tTO = new LinkedList();
    GMTrace.o(4018076123136L, 29937);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4018210340864L, 29938);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPg != null) {
        paramVarArgs.e(2, this.lPg);
      }
      paramVarArgs.fk(3, this.uqd);
      paramVarArgs.d(4, 8, this.tTO);
      paramVarArgs.fk(5, this.tOG);
      GMTrace.o(4018210340864L, 29938);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.lPg != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPg);
      }
      paramInt = b.a.a.a.fh(3, this.uqd);
      int j = b.a.a.a.c(4, 8, this.tTO);
      int k = b.a.a.a.fh(5, this.tOG);
      GMTrace.o(4018210340864L, 29938);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4018210340864L, 29938);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aen localaen = (aen)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4018210340864L, 29938);
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
          localaen.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4018210340864L, 29938);
        return 0;
      case 2: 
        localaen.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4018210340864L, 29938);
        return 0;
      case 3: 
        localaen.uqd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4018210340864L, 29938);
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
          localaen.tTO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4018210340864L, 29938);
        return 0;
      }
      localaen.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4018210340864L, 29938);
      return 0;
    }
    GMTrace.o(4018210340864L, 29938);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */