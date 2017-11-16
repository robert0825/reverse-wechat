package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class boc
  extends ayx
{
  public String uKB;
  public int uXR;
  public bpr uXS;
  public bpr uXT;
  public String uXU;
  public int uXV;
  public long uXW;
  public int udE;
  public int uhU;
  public long uhV;
  
  public boc()
  {
    GMTrace.i(3645890363392L, 27164);
    GMTrace.o(3645890363392L, 27164);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3646024581120L, 27165);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      if (this.uKB != null) {
        paramVarArgs.e(4, this.uKB);
      }
      paramVarArgs.fk(5, this.uXR);
      if (this.uXS != null)
      {
        paramVarArgs.fm(6, this.uXS.aYq());
        this.uXS.a(paramVarArgs);
      }
      if (this.uXT != null)
      {
        paramVarArgs.fm(7, this.uXT.aYq());
        this.uXT.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.udE);
      if (this.uXU != null) {
        paramVarArgs.e(9, this.uXU);
      }
      paramVarArgs.fk(10, this.uXV);
      paramVarArgs.T(11, this.uXW);
      GMTrace.o(3646024581120L, 27165);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV);
      paramInt = i;
      if (this.uKB != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uKB);
      }
      i = paramInt + b.a.a.a.fh(5, this.uXR);
      paramInt = i;
      if (this.uXS != null) {
        paramInt = i + b.a.a.a.fj(6, this.uXS.aYq());
      }
      i = paramInt;
      if (this.uXT != null) {
        i = paramInt + b.a.a.a.fj(7, this.uXT.aYq());
      }
      i += b.a.a.a.fh(8, this.udE);
      paramInt = i;
      if (this.uXU != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uXU);
      }
      i = b.a.a.a.fh(10, this.uXV);
      int j = b.a.a.a.S(11, this.uXW);
      GMTrace.o(3646024581120L, 27165);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3646024581120L, 27165);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      boc localboc = (boc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3646024581120L, 27165);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localboc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 2: 
        localboc.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 3: 
        localboc.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 4: 
        localboc.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 5: 
        localboc.uXR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localboc.uXS = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localboc.uXT = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 8: 
        localboc.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 9: 
        localboc.uXU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      case 10: 
        localboc.uXV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3646024581120L, 27165);
        return 0;
      }
      localboc.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3646024581120L, 27165);
      return 0;
    }
    GMTrace.o(3646024581120L, 27165);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */