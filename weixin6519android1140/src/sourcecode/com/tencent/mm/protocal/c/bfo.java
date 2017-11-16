package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfo
  extends azh
{
  public int uRl;
  public LinkedList<Integer> uRn;
  
  public bfo()
  {
    GMTrace.i(3761720262656L, 28027);
    this.uRn = new LinkedList();
    GMTrace.o(3761720262656L, 28027);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3761854480384L, 28028);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uRl);
      paramVarArgs.c(3, this.uRn);
      GMTrace.o(3761854480384L, 28028);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uRl);
      int j = b.a.a.a.b(3, this.uRn);
      GMTrace.o(3761854480384L, 28028);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uRn.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3761854480384L, 28028);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfo localbfo = (bfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3761854480384L, 28028);
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
          localbfo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3761854480384L, 28028);
        return 0;
      case 2: 
        localbfo.uRl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3761854480384L, 28028);
        return 0;
      }
      localbfo.uRn = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
      GMTrace.o(3761854480384L, 28028);
      return 0;
    }
    GMTrace.o(3761854480384L, 28028);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */