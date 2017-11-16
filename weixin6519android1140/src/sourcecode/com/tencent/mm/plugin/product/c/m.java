package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class m
  extends com.tencent.mm.bm.a
{
  public String nIO;
  public String nIP;
  public LinkedList<h> nIQ;
  
  public m()
  {
    GMTrace.i(6041005719552L, 45009);
    this.nIQ = new LinkedList();
    GMTrace.o(6041005719552L, 45009);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6041139937280L, 45010);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nIO != null) {
        paramVarArgs.e(1, this.nIO);
      }
      if (this.nIP != null) {
        paramVarArgs.e(2, this.nIP);
      }
      paramVarArgs.d(3, 8, this.nIQ);
      GMTrace.o(6041139937280L, 45010);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nIO != null) {
        paramInt = b.a.a.b.b.a.f(1, this.nIO) + 0;
      }
      i = paramInt;
      if (this.nIP != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nIP);
      }
      paramInt = b.a.a.a.c(3, 8, this.nIQ);
      GMTrace.o(6041139937280L, 45010);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nIQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(6041139937280L, 45010);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(6041139937280L, 45010);
        return -1;
      case 1: 
        localm.nIO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6041139937280L, 45010);
        return 0;
      case 2: 
        localm.nIP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6041139937280L, 45010);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new h();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localm.nIQ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(6041139937280L, 45010);
      return 0;
    }
    GMTrace.o(6041139937280L, 45010);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */