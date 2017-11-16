package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kx
  extends ayx
{
  public String desc;
  public boolean ubA;
  public boolean ubB;
  public LinkedList<Integer> ubb;
  
  public kx()
  {
    GMTrace.i(19141058625536L, 142612);
    this.ubb = new LinkedList();
    GMTrace.o(19141058625536L, 142612);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19141192843264L, 142613);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 2, this.ubb);
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      paramVarArgs.ah(4, this.ubA);
      paramVarArgs.ah(5, this.ubB);
      GMTrace.o(19141192843264L, 142613);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 2, this.ubb);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.desc);
      }
      i = b.a.a.b.b.a.cK(4);
      int j = b.a.a.b.b.a.cK(5);
      GMTrace.o(19141192843264L, 142613);
      return paramInt + (i + 1) + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ubb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19141192843264L, 142613);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kx localkx = (kx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19141192843264L, 142613);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localkx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19141192843264L, 142613);
        return 0;
      case 2: 
        localkx.ubb.add(Integer.valueOf(((b.a.a.a.a)localObject1).yqV.nj()));
        GMTrace.o(19141192843264L, 142613);
        return 0;
      case 3: 
        localkx.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19141192843264L, 142613);
        return 0;
      case 4: 
        localkx.ubA = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(19141192843264L, 142613);
        return 0;
      }
      localkx.ubB = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(19141192843264L, 142613);
      return 0;
    }
    GMTrace.o(19141192843264L, 142613);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */