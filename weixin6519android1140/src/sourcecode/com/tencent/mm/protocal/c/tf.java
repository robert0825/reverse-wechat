package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tf
  extends com.tencent.mm.bm.a
{
  public long ujg;
  public long ujh;
  public LinkedList<bja> uji;
  
  public tf()
  {
    GMTrace.i(3711522832384L, 27653);
    this.uji = new LinkedList();
    GMTrace.o(3711522832384L, 27653);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3711657050112L, 27654);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.ujg);
      paramVarArgs.T(2, this.ujh);
      paramVarArgs.d(3, 8, this.uji);
      GMTrace.o(3711657050112L, 27654);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.ujg);
      i = b.a.a.a.S(2, this.ujh);
      int j = b.a.a.a.c(3, 8, this.uji);
      GMTrace.o(3711657050112L, 27654);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uji.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3711657050112L, 27654);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tf localtf = (tf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3711657050112L, 27654);
        return -1;
      case 1: 
        localtf.ujg = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3711657050112L, 27654);
        return 0;
      case 2: 
        localtf.ujh = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3711657050112L, 27654);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bja();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bja)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localtf.uji.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3711657050112L, 27654);
      return 0;
    }
    GMTrace.o(3711657050112L, 27654);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */