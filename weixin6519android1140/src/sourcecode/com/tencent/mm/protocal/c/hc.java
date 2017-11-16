package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hc
  extends com.tencent.mm.bm.a
{
  public hf tVX;
  public String tVY;
  public String tVZ;
  
  public hc()
  {
    GMTrace.i(3847082737664L, 28663);
    GMTrace.o(3847082737664L, 28663);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3847216955392L, 28664);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVX != null)
      {
        paramVarArgs.fm(1, this.tVX.aYq());
        this.tVX.a(paramVarArgs);
      }
      if (this.tVY != null) {
        paramVarArgs.e(2, this.tVY);
      }
      if (this.tVZ != null) {
        paramVarArgs.e(3, this.tVZ);
      }
      GMTrace.o(3847216955392L, 28664);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tVX != null) {
        i = b.a.a.a.fj(1, this.tVX.aYq()) + 0;
      }
      paramInt = i;
      if (this.tVY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVY);
      }
      i = paramInt;
      if (this.tVZ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tVZ);
      }
      GMTrace.o(3847216955392L, 28664);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3847216955392L, 28664);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hc localhc = (hc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3847216955392L, 28664);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((hf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localhc.tVX = ((hf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3847216955392L, 28664);
        return 0;
      case 2: 
        localhc.tVY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3847216955392L, 28664);
        return 0;
      }
      localhc.tVZ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3847216955392L, 28664);
      return 0;
    }
    GMTrace.o(3847216955392L, 28664);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */