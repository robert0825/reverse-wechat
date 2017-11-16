package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blf
  extends azh
{
  public String jhi;
  public String lQa;
  public int nFd;
  public int tRC;
  public int tRD;
  public int tRE;
  public String uVp;
  public String ugf;
  
  public blf()
  {
    GMTrace.i(3990695706624L, 29733);
    GMTrace.o(3990695706624L, 29733);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3990829924352L, 29734);
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
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.ugf != null) {
        paramVarArgs.e(3, this.ugf);
      }
      if (this.uVp != null) {
        paramVarArgs.e(4, this.uVp);
      }
      if (this.jhi != null) {
        paramVarArgs.e(5, this.jhi);
      }
      paramVarArgs.fk(6, this.tRC);
      paramVarArgs.fk(7, this.tRD);
      paramVarArgs.fk(8, this.tRE);
      paramVarArgs.fk(9, this.nFd);
      GMTrace.o(3990829924352L, 29734);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.ugf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugf);
      }
      paramInt = i;
      if (this.uVp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uVp);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhi);
      }
      paramInt = b.a.a.a.fh(6, this.tRC);
      int j = b.a.a.a.fh(7, this.tRD);
      int k = b.a.a.a.fh(8, this.tRE);
      int m = b.a.a.a.fh(9, this.nFd);
      GMTrace.o(3990829924352L, 29734);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3990829924352L, 29734);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blf localblf = (blf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3990829924352L, 29734);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localblf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 2: 
        localblf.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 3: 
        localblf.ugf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 4: 
        localblf.uVp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 5: 
        localblf.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 6: 
        localblf.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 7: 
        localblf.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      case 8: 
        localblf.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3990829924352L, 29734);
        return 0;
      }
      localblf.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3990829924352L, 29734);
      return 0;
    }
    GMTrace.o(3990829924352L, 29734);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */