package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdf
  extends azh
{
  public int jhc;
  public String nIo;
  public int tST;
  public LinkedList<bdd> uPk;
  public int uPl;
  
  public bdf()
  {
    GMTrace.i(4023042179072L, 29974);
    this.uPk = new LinkedList();
    GMTrace.o(4023042179072L, 29974);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4023176396800L, 29975);
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
      paramVarArgs.d(3, 8, this.uPk);
      if (this.nIo != null) {
        paramVarArgs.e(4, this.nIo);
      }
      paramVarArgs.fk(5, this.uPl);
      paramVarArgs.fk(6, this.tST);
      GMTrace.o(4023176396800L, 29975);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhc) + b.a.a.a.c(3, 8, this.uPk);
      paramInt = i;
      if (this.nIo != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nIo);
      }
      i = b.a.a.a.fh(5, this.uPl);
      int j = b.a.a.a.fh(6, this.tST);
      GMTrace.o(4023176396800L, 29975);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uPk.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4023176396800L, 29975);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdf localbdf = (bdf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4023176396800L, 29975);
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
          localbdf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4023176396800L, 29975);
        return 0;
      case 2: 
        localbdf.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4023176396800L, 29975);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdf.uPk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4023176396800L, 29975);
        return 0;
      case 4: 
        localbdf.nIo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4023176396800L, 29975);
        return 0;
      case 5: 
        localbdf.uPl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4023176396800L, 29975);
        return 0;
      }
      localbdf.tST = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4023176396800L, 29975);
      return 0;
    }
    GMTrace.o(4023176396800L, 29975);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */