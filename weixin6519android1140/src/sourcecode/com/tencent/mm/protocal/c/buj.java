package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class buj
  extends ayx
{
  public String eSd;
  public LinkedList<String> vcL;
  
  public buj()
  {
    GMTrace.i(14305730756608L, 106586);
    this.vcL = new LinkedList();
    GMTrace.o(14305730756608L, 106586);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14305864974336L, 106587);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      paramVarArgs.d(3, 1, this.vcL);
      GMTrace.o(14305864974336L, 106587);
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
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eSd);
      }
      paramInt = b.a.a.a.c(3, 1, this.vcL);
      GMTrace.o(14305864974336L, 106587);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vcL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14305864974336L, 106587);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      buj localbuj = (buj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14305864974336L, 106587);
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
          localbuj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14305864974336L, 106587);
        return 0;
      case 2: 
        localbuj.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14305864974336L, 106587);
        return 0;
      }
      localbuj.vcL.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(14305864974336L, 106587);
      return 0;
    }
    GMTrace.o(14305864974336L, 106587);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */