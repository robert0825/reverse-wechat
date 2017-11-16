package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awl
  extends azh
{
  public int jWs;
  public String jWt;
  public String tRJ;
  public LinkedList<bjt> uLE;
  public LinkedList<bjt> uLF;
  
  public awl()
  {
    GMTrace.i(20861461463040L, 155430);
    this.uLE = new LinkedList();
    this.uLF = new LinkedList();
    GMTrace.o(20861461463040L, 155430);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20861595680768L, 155431);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      paramVarArgs.d(4, 8, this.uLE);
      paramVarArgs.d(5, 8, this.uLF);
      if (this.tRJ != null) {
        paramVarArgs.e(6, this.tRJ);
      }
      GMTrace.o(20861595680768L, 155431);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt + b.a.a.a.c(4, 8, this.uLE) + b.a.a.a.c(5, 8, this.uLF);
      paramInt = i;
      if (this.tRJ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tRJ);
      }
      GMTrace.o(20861595680768L, 155431);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uLE.clear();
      this.uLF.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(20861595680768L, 155431);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awl localawl = (awl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(20861595680768L, 155431);
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
          localawl.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20861595680768L, 155431);
        return 0;
      case 2: 
        localawl.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20861595680768L, 155431);
        return 0;
      case 3: 
        localawl.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861595680768L, 155431);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bjt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localawl.uLE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20861595680768L, 155431);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bjt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localawl.uLF.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20861595680768L, 155431);
        return 0;
      }
      localawl.tRJ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20861595680768L, 155431);
      return 0;
    }
    GMTrace.o(20861595680768L, 155431);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */