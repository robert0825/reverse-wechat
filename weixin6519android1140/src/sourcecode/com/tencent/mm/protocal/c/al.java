package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class al
  extends ayx
{
  public int tNN;
  public String tNO;
  public String tNP;
  public boolean tNQ;
  
  public al()
  {
    GMTrace.i(3705348816896L, 27607);
    GMTrace.o(3705348816896L, 27607);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3705483034624L, 27608);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tNN);
      if (this.tNO != null) {
        paramVarArgs.e(3, this.tNO);
      }
      if (this.tNP != null) {
        paramVarArgs.e(4, this.tNP);
      }
      paramVarArgs.ah(5, this.tNQ);
      GMTrace.o(3705483034624L, 27608);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tNN);
      paramInt = i;
      if (this.tNO != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tNO);
      }
      i = paramInt;
      if (this.tNP != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tNP);
      }
      paramInt = b.a.a.b.b.a.cK(5);
      GMTrace.o(3705483034624L, 27608);
      return i + (paramInt + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3705483034624L, 27608);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      al localal = (al)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3705483034624L, 27608);
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
          localal.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3705483034624L, 27608);
        return 0;
      case 2: 
        localal.tNN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3705483034624L, 27608);
        return 0;
      case 3: 
        localal.tNO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3705483034624L, 27608);
        return 0;
      case 4: 
        localal.tNP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3705483034624L, 27608);
        return 0;
      }
      localal.tNQ = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3705483034624L, 27608);
      return 0;
    }
    GMTrace.o(3705483034624L, 27608);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */