package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nm
  extends com.tencent.mm.bm.a
{
  public String uek;
  public String uel;
  public LinkedList<aof> uem;
  
  public nm()
  {
    GMTrace.i(18664719908864L, 139063);
    this.uem = new LinkedList();
    GMTrace.o(18664719908864L, 139063);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18664854126592L, 139064);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uek != null) {
        paramVarArgs.e(1, this.uek);
      }
      if (this.uel != null) {
        paramVarArgs.e(2, this.uel);
      }
      paramVarArgs.d(3, 8, this.uem);
      GMTrace.o(18664854126592L, 139064);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uek != null) {
        paramInt = b.a.a.b.b.a.f(1, this.uek) + 0;
      }
      i = paramInt;
      if (this.uel != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uel);
      }
      paramInt = b.a.a.a.c(3, 8, this.uem);
      GMTrace.o(18664854126592L, 139064);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uem.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18664854126592L, 139064);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nm localnm = (nm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(18664854126592L, 139064);
        return -1;
      case 1: 
        localnm.uek = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(18664854126592L, 139064);
        return 0;
      case 2: 
        localnm.uel = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(18664854126592L, 139064);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aof();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((aof)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localnm.uem.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(18664854126592L, 139064);
      return 0;
    }
    GMTrace.o(18664854126592L, 139064);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */