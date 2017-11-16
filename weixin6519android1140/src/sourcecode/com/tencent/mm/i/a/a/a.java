package com.tencent.mm.i.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  public int eNO;
  public int eQl;
  public LinkedList<b> fMv;
  public int fMw;
  public String fMx;
  public int fMy;
  public int status;
  public int type;
  
  public a()
  {
    GMTrace.i(1592895995904L, 11868);
    this.fMv = new LinkedList();
    GMTrace.o(1592895995904L, 11868);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(1593030213632L, 11869);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.fMv);
      paramVarArgs.fk(2, this.eQl);
      paramVarArgs.fk(3, this.type);
      paramVarArgs.fk(4, this.status);
      paramVarArgs.fk(5, this.fMw);
      if (this.fMx != null) {
        paramVarArgs.e(6, this.fMx);
      }
      paramVarArgs.fk(7, this.eNO);
      paramVarArgs.fk(8, this.fMy);
      GMTrace.o(1593030213632L, 11869);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.fMv) + 0 + b.a.a.a.fh(2, this.eQl) + b.a.a.a.fh(3, this.type) + b.a.a.a.fh(4, this.status) + b.a.a.a.fh(5, this.fMw);
      paramInt = i;
      if (this.fMx != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.fMx);
      }
      i = b.a.a.a.fh(7, this.eNO);
      int j = b.a.a.a.fh(8, this.fMy);
      GMTrace.o(1593030213632L, 11869);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.fMv.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(1593030213632L, 11869);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(1593030213632L, 11869);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((b)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locala.fMv.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(1593030213632L, 11869);
        return 0;
      case 2: 
        locala.eQl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(1593030213632L, 11869);
        return 0;
      case 3: 
        locala.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(1593030213632L, 11869);
        return 0;
      case 4: 
        locala.status = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(1593030213632L, 11869);
        return 0;
      case 5: 
        locala.fMw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(1593030213632L, 11869);
        return 0;
      case 6: 
        locala.fMx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(1593030213632L, 11869);
        return 0;
      case 7: 
        locala.eNO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(1593030213632L, 11869);
        return 0;
      }
      locala.fMy = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(1593030213632L, 11869);
      return 0;
    }
    GMTrace.o(1593030213632L, 11869);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\i\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */