package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.anu;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public anu eUs;
  public int gGY;
  public String pyW;
  public int pyX;
  
  public b()
  {
    GMTrace.i(8866423111680L, 66060);
    GMTrace.o(8866423111680L, 66060);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8866557329408L, 66061);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eUs != null)
      {
        paramVarArgs.fm(1, this.eUs.aYq());
        this.eUs.a(paramVarArgs);
      }
      if (this.pyW != null) {
        paramVarArgs.e(2, this.pyW);
      }
      paramVarArgs.fk(3, this.gGY);
      paramVarArgs.fk(4, this.pyX);
      GMTrace.o(8866557329408L, 66061);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.eUs != null) {
        paramInt = b.a.a.a.fj(1, this.eUs.aYq()) + 0;
      }
      i = paramInt;
      if (this.pyW != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.pyW);
      }
      paramInt = b.a.a.a.fh(3, this.gGY);
      int j = b.a.a.a.fh(4, this.pyX);
      GMTrace.o(8866557329408L, 66061);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(8866557329408L, 66061);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(8866557329408L, 66061);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((anu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localb.eUs = ((anu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(8866557329408L, 66061);
        return 0;
      case 2: 
        localb.pyW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(8866557329408L, 66061);
        return 0;
      case 3: 
        localb.gGY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(8866557329408L, 66061);
        return 0;
      }
      localb.pyX = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(8866557329408L, 66061);
      return 0;
    }
    GMTrace.o(8866557329408L, 66061);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */