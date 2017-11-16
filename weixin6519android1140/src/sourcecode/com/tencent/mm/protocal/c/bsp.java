package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bsp
  extends com.tencent.mm.bm.a
{
  public LinkedList<bsi> utS;
  public boolean vbm;
  
  public bsp()
  {
    GMTrace.i(3831379263488L, 28546);
    this.utS = new LinkedList();
    GMTrace.o(3831379263488L, 28546);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3831513481216L, 28547);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.ah(1, this.vbm);
      paramVarArgs.d(2, 8, this.utS);
      GMTrace.o(3831513481216L, 28547);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      i = b.a.a.a.c(2, 8, this.utS);
      GMTrace.o(3831513481216L, 28547);
      return paramInt + 1 + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.utS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3831513481216L, 28547);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bsp localbsp = (bsp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3831513481216L, 28547);
        return -1;
      case 1: 
        localbsp.vbm = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3831513481216L, 28547);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bsi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bsi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbsp.utS.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3831513481216L, 28547);
      return 0;
    }
    GMTrace.o(3831513481216L, 28547);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */