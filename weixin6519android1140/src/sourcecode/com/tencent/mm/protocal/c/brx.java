package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class brx
  extends com.tencent.mm.bm.a
{
  public int tWu;
  public LinkedList<brq> uql;
  public boolean vbm;
  
  public brx()
  {
    GMTrace.i(3987206045696L, 29707);
    this.uql = new LinkedList();
    GMTrace.o(3987206045696L, 29707);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3987340263424L, 29708);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.uql);
      paramVarArgs.fk(2, this.tWu);
      paramVarArgs.ah(3, this.vbm);
      GMTrace.o(3987340263424L, 29708);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.uql);
      i = b.a.a.a.fh(2, this.tWu);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(3987340263424L, 29708);
      return paramInt + 0 + i + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uql.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3987340263424L, 29708);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      brx localbrx = (brx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3987340263424L, 29708);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((brq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbrx.uql.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3987340263424L, 29708);
        return 0;
      case 2: 
        localbrx.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3987340263424L, 29708);
        return 0;
      }
      localbrx.vbm = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3987340263424L, 29708);
      return 0;
    }
    GMTrace.o(3987340263424L, 29708);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */