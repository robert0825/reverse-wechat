package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfa
  extends ayx
{
  public int jib;
  public int tRC;
  public int tRD;
  public String uQI;
  public int uQJ;
  
  public bfa()
  {
    GMTrace.i(3907614932992L, 29114);
    GMTrace.o(3907614932992L, 29114);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3907749150720L, 29115);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.uQI != null) {
        paramVarArgs.e(4, this.uQI);
      }
      paramVarArgs.fk(5, this.jib);
      paramVarArgs.fk(6, this.uQJ);
      GMTrace.o(3907749150720L, 29115);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.uQI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uQI);
      }
      i = b.a.a.a.fh(5, this.jib);
      int j = b.a.a.a.fh(6, this.uQJ);
      GMTrace.o(3907749150720L, 29115);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3907749150720L, 29115);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfa localbfa = (bfa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3907749150720L, 29115);
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
          localbfa.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3907749150720L, 29115);
        return 0;
      case 2: 
        localbfa.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3907749150720L, 29115);
        return 0;
      case 3: 
        localbfa.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3907749150720L, 29115);
        return 0;
      case 4: 
        localbfa.uQI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3907749150720L, 29115);
        return 0;
      case 5: 
        localbfa.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3907749150720L, 29115);
        return 0;
      }
      localbfa.uQJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3907749150720L, 29115);
      return 0;
    }
    GMTrace.o(3907749150720L, 29115);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */