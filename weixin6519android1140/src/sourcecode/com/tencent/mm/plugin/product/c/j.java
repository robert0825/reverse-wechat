package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.bm.a
{
  public int eQl;
  public g nIJ;
  public String nIK;
  
  public j()
  {
    GMTrace.i(6039931977728L, 45001);
    GMTrace.o(6039931977728L, 45001);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6040066195456L, 45002);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.eQl);
      if (this.nIJ != null)
      {
        paramVarArgs.fm(2, this.nIJ.aYq());
        this.nIJ.a(paramVarArgs);
      }
      if (this.nIK != null) {
        paramVarArgs.e(3, this.nIK);
      }
      GMTrace.o(6040066195456L, 45002);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.eQl) + 0;
      paramInt = i;
      if (this.nIJ != null) {
        paramInt = i + b.a.a.a.fj(2, this.nIJ.aYq());
      }
      i = paramInt;
      if (this.nIK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nIK);
      }
      GMTrace.o(6040066195456L, 45002);
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
      GMTrace.o(6040066195456L, 45002);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      j localj = (j)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(6040066195456L, 45002);
        return -1;
      case 1: 
        localj.eQl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6040066195456L, 45002);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new g();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localj.nIJ = ((g)localObject1);
          paramInt += 1;
        }
        GMTrace.o(6040066195456L, 45002);
        return 0;
      }
      localj.nIK = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(6040066195456L, 45002);
      return 0;
    }
    GMTrace.o(6040066195456L, 45002);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */