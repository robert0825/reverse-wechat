package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class rm
  extends azh
{
  public LinkedList<bir> tPE;
  public int tSN;
  public LinkedList<biq> tSO;
  public int uhU;
  public long uhV;
  public int uhW;
  public int uhX;
  public int uhY;
  
  public rm()
  {
    GMTrace.i(3879026556928L, 28901);
    this.tPE = new LinkedList();
    this.tSO = new LinkedList();
    GMTrace.o(3879026556928L, 28901);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3879160774656L, 28902);
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
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.uhW);
      paramVarArgs.fk(5, this.uhX);
      paramVarArgs.d(6, 8, this.tPE);
      paramVarArgs.fk(7, this.uhY);
      paramVarArgs.fk(8, this.tSN);
      paramVarArgs.d(9, 8, this.tSO);
      GMTrace.o(3879160774656L, 28902);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uhU);
      int j = b.a.a.a.S(3, this.uhV);
      int k = b.a.a.a.fh(4, this.uhW);
      int m = b.a.a.a.fh(5, this.uhX);
      int n = b.a.a.a.c(6, 8, this.tPE);
      int i1 = b.a.a.a.fh(7, this.uhY);
      int i2 = b.a.a.a.fh(8, this.tSN);
      int i3 = b.a.a.a.c(9, 8, this.tSO);
      GMTrace.o(3879160774656L, 28902);
      return paramInt + i + j + k + m + n + i1 + i2 + i3;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPE.clear();
      this.tSO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3879160774656L, 28902);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rm localrm = (rm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3879160774656L, 28902);
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
          localrm.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 2: 
        localrm.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 3: 
        localrm.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 4: 
        localrm.uhW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 5: 
        localrm.uhX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bir();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bir)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localrm.tPE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 7: 
        localrm.uhY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3879160774656L, 28902);
        return 0;
      case 8: 
        localrm.tSN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3879160774656L, 28902);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new biq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((biq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localrm.tSO.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3879160774656L, 28902);
      return 0;
    }
    GMTrace.o(3879160774656L, 28902);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */