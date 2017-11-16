package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ady
  extends azh
{
  public LinkedList<agh> lRK;
  public LinkedList<aw> lSl;
  public int utL;
  public LinkedList<axa> utM;
  public int utN;
  public int utO;
  public int utP;
  public agg utQ;
  
  public ady()
  {
    GMTrace.i(3909762416640L, 29130);
    this.utM = new LinkedList();
    this.lSl = new LinkedList();
    this.lRK = new LinkedList();
    GMTrace.o(3909762416640L, 29130);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3909896634368L, 29131);
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
      paramVarArgs.fk(2, this.utL);
      paramVarArgs.d(3, 8, this.utM);
      paramVarArgs.fk(4, this.utN);
      paramVarArgs.fk(5, this.utO);
      paramVarArgs.d(6, 8, this.lSl);
      paramVarArgs.fk(7, this.utP);
      paramVarArgs.d(8, 8, this.lRK);
      if (this.utQ != null)
      {
        paramVarArgs.fm(9, this.utQ.aYq());
        this.utQ.a(paramVarArgs);
      }
      GMTrace.o(3909896634368L, 29131);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.utL) + b.a.a.a.c(3, 8, this.utM) + b.a.a.a.fh(4, this.utN) + b.a.a.a.fh(5, this.utO) + b.a.a.a.c(6, 8, this.lSl) + b.a.a.a.fh(7, this.utP) + b.a.a.a.c(8, 8, this.lRK);
      paramInt = i;
      if (this.utQ != null) {
        paramInt = i + b.a.a.a.fj(9, this.utQ.aYq());
      }
      GMTrace.o(3909896634368L, 29131);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.utM.clear();
      this.lSl.clear();
      this.lRK.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3909896634368L, 29131);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ady localady = (ady)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3909896634368L, 29131);
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
          localady.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 2: 
        localady.utL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localady.utM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 4: 
        localady.utN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 5: 
        localady.utO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localady.lSl.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 7: 
        localady.utP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909896634368L, 29131);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localady.lRK.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3909896634368L, 29131);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new agg();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((agg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localady.utQ = ((agg)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3909896634368L, 29131);
      return 0;
    }
    GMTrace.o(3909896634368L, 29131);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ady.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */