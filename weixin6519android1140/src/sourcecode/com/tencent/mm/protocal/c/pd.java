package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class pd
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public LinkedList<Integer> ufF;
  public azq ufy;
  
  public pd()
  {
    GMTrace.i(13336544542720L, 99365);
    this.ufF = new LinkedList();
    GMTrace.o(13336544542720L, 99365);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13336678760448L, 99366);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(1, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.c(3, this.ufF);
      GMTrace.o(13336678760448L, 99366);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ufy != null) {
        paramInt = b.a.a.a.fj(1, this.ufy.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jhc);
      int j = b.a.a.a.b(3, this.ufF);
      GMTrace.o(13336678760448L, 99366);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ufF.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufy == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      GMTrace.o(13336678760448L, 99366);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      pd localpd = (pd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13336678760448L, 99366);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localpd.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13336678760448L, 99366);
        return 0;
      case 2: 
        localpd.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13336678760448L, 99366);
        return 0;
      }
      localpd.ufF = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
      GMTrace.o(13336678760448L, 99366);
      return 0;
    }
    GMTrace.o(13336678760448L, 99366);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */