package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bph
  extends azh
{
  public int jNj;
  public int nFd;
  public int uYQ;
  public String uYY;
  public LinkedList<bqc> uYZ;
  public int uhU;
  public long uhV;
  
  public bph()
  {
    GMTrace.i(3905467449344L, 29098);
    this.uYZ = new LinkedList();
    GMTrace.o(3905467449344L, 29098);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3905601667072L, 29099);
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
      paramVarArgs.fk(4, this.nFd);
      paramVarArgs.fk(6, this.jNj);
      paramVarArgs.d(7, 8, this.uYZ);
      if (this.uYY != null) {
        paramVarArgs.e(8, this.uYY);
      }
      paramVarArgs.fk(9, this.uYQ);
      GMTrace.o(3905601667072L, 29099);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV) + b.a.a.a.fh(4, this.nFd) + b.a.a.a.fh(6, this.jNj) + b.a.a.a.c(7, 8, this.uYZ);
      paramInt = i;
      if (this.uYY != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uYY);
      }
      i = b.a.a.a.fh(9, this.uYQ);
      GMTrace.o(3905601667072L, 29099);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uYZ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3905601667072L, 29099);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bph localbph = (bph)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 5: 
      default: 
        GMTrace.o(3905601667072L, 29099);
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
          localbph.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905601667072L, 29099);
        return 0;
      case 2: 
        localbph.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3905601667072L, 29099);
        return 0;
      case 3: 
        localbph.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3905601667072L, 29099);
        return 0;
      case 4: 
        localbph.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3905601667072L, 29099);
        return 0;
      case 6: 
        localbph.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3905601667072L, 29099);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbph.uYZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905601667072L, 29099);
        return 0;
      case 8: 
        localbph.uYY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3905601667072L, 29099);
        return 0;
      }
      localbph.uYQ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3905601667072L, 29099);
      return 0;
    }
    GMTrace.o(3905601667072L, 29099);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */