package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gc
  extends azh
{
  public int jzH;
  public String jzI;
  public atz tUn;
  public arq tUo;
  
  public gc()
  {
    GMTrace.i(19143206109184L, 142628);
    GMTrace.o(19143206109184L, 142628);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19143340326912L, 142629);
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
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      if (this.tUn != null)
      {
        paramVarArgs.fm(6, this.tUn.aYq());
        this.tUn.a(paramVarArgs);
      }
      if (this.tUo != null)
      {
        paramVarArgs.fm(7, this.tUo.aYq());
        this.tUo.a(paramVarArgs);
      }
      GMTrace.o(19143340326912L, 142629);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt;
      if (this.tUn != null) {
        i = paramInt + b.a.a.a.fj(6, this.tUn.aYq());
      }
      paramInt = i;
      if (this.tUo != null) {
        paramInt = i + b.a.a.a.fj(7, this.tUo.aYq());
      }
      GMTrace.o(19143340326912L, 142629);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19143340326912L, 142629);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gc localgc = (gc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 4: 
      case 5: 
      default: 
        GMTrace.o(19143340326912L, 142629);
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
          localgc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19143340326912L, 142629);
        return 0;
      case 2: 
        localgc.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19143340326912L, 142629);
        return 0;
      case 3: 
        localgc.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19143340326912L, 142629);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgc.tUn = ((atz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19143340326912L, 142629);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new arq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((arq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localgc.tUo = ((arq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(19143340326912L, 142629);
      return 0;
    }
    GMTrace.o(19143340326912L, 142629);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */