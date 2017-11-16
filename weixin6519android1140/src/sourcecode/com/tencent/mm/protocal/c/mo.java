package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mo
  extends com.tencent.mm.bm.a
{
  public String udp;
  public String udq;
  public LinkedList<bjb> udr;
  
  public mo()
  {
    GMTrace.i(15351823728640L, 114380);
    this.udr = new LinkedList();
    GMTrace.o(15351823728640L, 114380);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15351957946368L, 114381);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.udp == null) {
        throw new b("Not all required fields were included: baseid");
      }
      if (this.udp != null) {
        paramVarArgs.e(1, this.udp);
      }
      if (this.udq != null) {
        paramVarArgs.e(2, this.udq);
      }
      paramVarArgs.d(3, 8, this.udr);
      GMTrace.o(15351957946368L, 114381);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.udp != null) {
        paramInt = b.a.a.b.b.a.f(1, this.udp) + 0;
      }
      i = paramInt;
      if (this.udq != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.udq);
      }
      paramInt = b.a.a.a.c(3, 8, this.udr);
      GMTrace.o(15351957946368L, 114381);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.udr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.udp == null) {
        throw new b("Not all required fields were included: baseid");
      }
      GMTrace.o(15351957946368L, 114381);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mo localmo = (mo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15351957946368L, 114381);
        return -1;
      case 1: 
        localmo.udp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15351957946368L, 114381);
        return 0;
      case 2: 
        localmo.udq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15351957946368L, 114381);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bjb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bjb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localmo.udr.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(15351957946368L, 114381);
      return 0;
    }
    GMTrace.o(15351957946368L, 114381);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */