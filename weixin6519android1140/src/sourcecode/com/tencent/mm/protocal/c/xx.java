package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xx
  extends azh
{
  public int jhc;
  public int jia;
  public int tXv;
  public LinkedList<apb> upp;
  
  public xx()
  {
    GMTrace.i(4009217753088L, 29871);
    this.upp = new LinkedList();
    GMTrace.o(4009217753088L, 29871);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4009351970816L, 29872);
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
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(5, 8, this.upp);
      paramVarArgs.fk(6, this.jia);
      paramVarArgs.fk(7, this.tXv);
      GMTrace.o(4009351970816L, 29872);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jhc);
      int j = b.a.a.a.c(5, 8, this.upp);
      int k = b.a.a.a.fh(6, this.jia);
      int m = b.a.a.a.fh(7, this.tXv);
      GMTrace.o(4009351970816L, 29872);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.upp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4009351970816L, 29872);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xx localxx = (xx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 3: 
      case 4: 
      default: 
        GMTrace.o(4009351970816L, 29872);
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
          localxx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4009351970816L, 29872);
        return 0;
      case 2: 
        localxx.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009351970816L, 29872);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxx.upp.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4009351970816L, 29872);
        return 0;
      case 6: 
        localxx.jia = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4009351970816L, 29872);
        return 0;
      }
      localxx.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4009351970816L, 29872);
      return 0;
    }
    GMTrace.o(4009351970816L, 29872);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\xx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */