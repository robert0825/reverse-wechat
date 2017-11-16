package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class br
  extends azh
{
  public int tPL;
  public int tPO;
  public long tPT;
  
  public br()
  {
    GMTrace.i(3886408531968L, 28956);
    GMTrace.o(3886408531968L, 28956);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3886542749696L, 28957);
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
      paramVarArgs.fk(2, this.tPL);
      paramVarArgs.fk(3, this.tPO);
      paramVarArgs.T(4, this.tPT);
      GMTrace.o(3886542749696L, 28957);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tPL);
      int j = b.a.a.a.fh(3, this.tPO);
      int k = b.a.a.a.S(4, this.tPT);
      GMTrace.o(3886542749696L, 28957);
      return paramInt + i + j + k;
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
      GMTrace.o(3886542749696L, 28957);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      br localbr = (br)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3886542749696L, 28957);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3886542749696L, 28957);
        return 0;
      case 2: 
        localbr.tPL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3886542749696L, 28957);
        return 0;
      case 3: 
        localbr.tPO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3886542749696L, 28957);
        return 0;
      }
      localbr.tPT = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3886542749696L, 28957);
      return 0;
    }
    GMTrace.o(3886542749696L, 28957);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */