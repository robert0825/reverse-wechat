package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btu
  extends com.tencent.mm.bm.a
{
  public LinkedList<bts> vcx;
  public boolean vcy;
  
  public btu()
  {
    GMTrace.i(14998831104000L, 111750);
    this.vcx = new LinkedList();
    GMTrace.o(14998831104000L, 111750);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14998965321728L, 111751);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.vcx);
      paramVarArgs.ah(2, this.vcy);
      GMTrace.o(14998965321728L, 111751);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.vcx);
      i = b.a.a.b.b.a.cK(2);
      GMTrace.o(14998965321728L, 111751);
      return paramInt + 0 + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vcx.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14998965321728L, 111751);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btu localbtu = (btu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14998965321728L, 111751);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bts();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bts)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtu.vcx.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(14998965321728L, 111751);
        return 0;
      }
      localbtu.vcy = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(14998965321728L, 111751);
      return 0;
    }
    GMTrace.o(14998965321728L, 111751);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */