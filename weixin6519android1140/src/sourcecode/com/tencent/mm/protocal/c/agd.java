package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class agd
  extends azh
{
  public int status;
  public bue ucB;
  public LinkedList<bup> uvR;
  public LinkedList<bup> uvS;
  
  public agd()
  {
    GMTrace.i(3774068293632L, 28119);
    this.uvR = new LinkedList();
    this.uvS = new LinkedList();
    GMTrace.o(3774068293632L, 28119);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3774202511360L, 28120);
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
      if (this.ucB != null)
      {
        paramVarArgs.fm(2, this.ucB.aYq());
        this.ucB.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.uvR);
      paramVarArgs.d(4, 8, this.uvS);
      paramVarArgs.fk(5, this.status);
      GMTrace.o(3774202511360L, 28120);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.ucB != null) {
        i = paramInt + b.a.a.a.fj(2, this.ucB.aYq());
      }
      paramInt = b.a.a.a.c(3, 8, this.uvR);
      int j = b.a.a.a.c(4, 8, this.uvS);
      int k = b.a.a.a.fh(5, this.status);
      GMTrace.o(3774202511360L, 28120);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uvR.clear();
      this.uvS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3774202511360L, 28120);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      agd localagd = (agd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3774202511360L, 28120);
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
          localagd.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3774202511360L, 28120);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bue();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bue)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localagd.ucB = ((bue)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3774202511360L, 28120);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bup();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bup)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localagd.uvR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3774202511360L, 28120);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bup();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bup)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localagd.uvS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3774202511360L, 28120);
        return 0;
      }
      localagd.status = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3774202511360L, 28120);
      return 0;
    }
    GMTrace.o(3774202511360L, 28120);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\agd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */