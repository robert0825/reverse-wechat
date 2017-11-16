package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjf
  extends com.tencent.mm.bm.a
{
  public int state;
  public LinkedList<bje> uUs;
  public int uUt;
  public int uUu;
  public azd uUv;
  public int uUw;
  public LinkedList<bjd> uUx;
  public String udq;
  
  public bjf()
  {
    GMTrace.i(15352092164096L, 114382);
    this.uUs = new LinkedList();
    this.uUx = new LinkedList();
    GMTrace.o(15352092164096L, 114382);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15352226381824L, 114383);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.udq == null) {
        throw new b("Not all required fields were included: patchid");
      }
      if (this.udq != null) {
        paramVarArgs.e(1, this.udq);
      }
      paramVarArgs.fk(2, this.state);
      paramVarArgs.d(3, 8, this.uUs);
      paramVarArgs.fk(4, this.uUt);
      paramVarArgs.fk(5, this.uUu);
      if (this.uUv != null)
      {
        paramVarArgs.fm(6, this.uUv.aYq());
        this.uUv.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.uUw);
      paramVarArgs.d(8, 8, this.uUx);
      GMTrace.o(15352226381824L, 114383);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.udq != null) {
        paramInt = b.a.a.b.b.a.f(1, this.udq) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.state) + b.a.a.a.c(3, 8, this.uUs) + b.a.a.a.fh(4, this.uUt) + b.a.a.a.fh(5, this.uUu);
      paramInt = i;
      if (this.uUv != null) {
        paramInt = i + b.a.a.a.fj(6, this.uUv.aYq());
      }
      i = b.a.a.a.fh(7, this.uUw);
      int j = b.a.a.a.c(8, 8, this.uUx);
      GMTrace.o(15352226381824L, 114383);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uUs.clear();
      this.uUx.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.udq == null) {
        throw new b("Not all required fields were included: patchid");
      }
      GMTrace.o(15352226381824L, 114383);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjf localbjf = (bjf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15352226381824L, 114383);
        return -1;
      case 1: 
        localbjf.udq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15352226381824L, 114383);
        return 0;
      case 2: 
        localbjf.state = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15352226381824L, 114383);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bje();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bje)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbjf.uUs.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(15352226381824L, 114383);
        return 0;
      case 4: 
        localbjf.uUt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15352226381824L, 114383);
        return 0;
      case 5: 
        localbjf.uUu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15352226381824L, 114383);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbjf.uUv = ((azd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15352226381824L, 114383);
        return 0;
      case 7: 
        localbjf.uUw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15352226381824L, 114383);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bjd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bjd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbjf.uUx.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(15352226381824L, 114383);
      return 0;
    }
    GMTrace.o(15352226381824L, 114383);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */