package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class arx
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public LinkedList<aru> uHR;
  public LinkedList<Integer> uqm;
  
  public arx()
  {
    GMTrace.i(13337349849088L, 99371);
    this.uqm = new LinkedList();
    this.uHR = new LinkedList();
    GMTrace.o(13337349849088L, 99371);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13337484066816L, 99372);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jhc);
      paramVarArgs.c(2, this.uqm);
      paramVarArgs.d(3, 8, this.uHR);
      GMTrace.o(13337484066816L, 99372);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.jhc);
      i = b.a.a.a.b(2, this.uqm);
      int j = b.a.a.a.c(3, 8, this.uHR);
      GMTrace.o(13337484066816L, 99372);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uqm.clear();
      this.uHR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13337484066816L, 99372);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arx localarx = (arx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13337484066816L, 99372);
        return -1;
      case 1: 
        localarx.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13337484066816L, 99372);
        return 0;
      case 2: 
        localarx.uqm = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(13337484066816L, 99372);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aru();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((aru)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localarx.uHR.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13337484066816L, 99372);
      return 0;
    }
    GMTrace.o(13337484066816L, 99372);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\arx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */