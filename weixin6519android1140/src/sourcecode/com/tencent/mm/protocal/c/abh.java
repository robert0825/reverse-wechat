package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abh
  extends ayx
{
  public float eMl;
  public float eNR;
  
  public abh()
  {
    GMTrace.i(3889629757440L, 28980);
    GMTrace.o(3889629757440L, 28980);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3889763975168L, 28981);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.n(2, this.eNR);
      paramVarArgs.n(3, this.eMl);
      GMTrace.o(3889763975168L, 28981);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(3889763975168L, 28981);
      return paramInt + (i + 4) + (j + 4);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3889763975168L, 28981);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abh localabh = (abh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3889763975168L, 28981);
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
          localabh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3889763975168L, 28981);
        return 0;
      case 2: 
        localabh.eNR = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3889763975168L, 28981);
        return 0;
      }
      localabh.eMl = ((b.a.a.a.a)localObject1).yqV.readFloat();
      GMTrace.o(3889763975168L, 28981);
      return 0;
    }
    GMTrace.o(3889763975168L, 28981);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\abh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */