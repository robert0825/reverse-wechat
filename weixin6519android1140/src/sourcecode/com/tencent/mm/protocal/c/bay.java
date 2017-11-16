package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bay
  extends azh
{
  public String tXx;
  public ayh uOs;
  
  public bay()
  {
    GMTrace.i(19140521754624L, 142608);
    GMTrace.o(19140521754624L, 142608);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19140655972352L, 142609);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uOs != null)
      {
        paramVarArgs.fm(2, this.uOs.aYq());
        this.uOs.a(paramVarArgs);
      }
      if (this.tXx != null) {
        paramVarArgs.e(3, this.tXx);
      }
      GMTrace.o(19140655972352L, 142609);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uOs != null) {
        paramInt = i + b.a.a.a.fj(2, this.uOs.aYq());
      }
      i = paramInt;
      if (this.tXx != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXx);
      }
      GMTrace.o(19140655972352L, 142609);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19140655972352L, 142609);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bay localbay = (bay)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(19140655972352L, 142609);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbay.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19140655972352L, 142609);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ayh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ayh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbay.uOs = ((ayh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19140655972352L, 142609);
        return 0;
      }
      localbay.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19140655972352L, 142609);
      return 0;
    }
    GMTrace.o(19140655972352L, 142609);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */