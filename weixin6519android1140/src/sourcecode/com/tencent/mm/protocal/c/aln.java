package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aln
  extends azh
{
  public int psR;
  public int uAJ;
  public int uAK;
  public int uAL;
  public int uqk;
  public LinkedList<ali> uql;
  
  public aln()
  {
    GMTrace.i(4004922785792L, 29839);
    this.uql = new LinkedList();
    GMTrace.o(4004922785792L, 29839);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4005057003520L, 29840);
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
      paramVarArgs.fk(2, this.uqk);
      paramVarArgs.d(3, 8, this.uql);
      paramVarArgs.fk(4, this.psR);
      paramVarArgs.fk(5, this.uAJ);
      paramVarArgs.fk(6, this.uAK);
      paramVarArgs.fk(7, this.uAL);
      GMTrace.o(4005057003520L, 29840);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uqk);
      int j = b.a.a.a.c(3, 8, this.uql);
      int k = b.a.a.a.fh(4, this.psR);
      int m = b.a.a.a.fh(5, this.uAJ);
      int n = b.a.a.a.fh(6, this.uAK);
      int i1 = b.a.a.a.fh(7, this.uAL);
      GMTrace.o(4005057003520L, 29840);
      return paramInt + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uql.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4005057003520L, 29840);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aln localaln = (aln)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4005057003520L, 29840);
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
          localaln.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4005057003520L, 29840);
        return 0;
      case 2: 
        localaln.uqk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005057003520L, 29840);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ali();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ali)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaln.uql.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4005057003520L, 29840);
        return 0;
      case 4: 
        localaln.psR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005057003520L, 29840);
        return 0;
      case 5: 
        localaln.uAJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005057003520L, 29840);
        return 0;
      case 6: 
        localaln.uAK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005057003520L, 29840);
        return 0;
      }
      localaln.uAL = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4005057003520L, 29840);
      return 0;
    }
    GMTrace.o(4005057003520L, 29840);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */