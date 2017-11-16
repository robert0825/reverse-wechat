package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqd
  extends ayx
{
  public azp tZA;
  public int tZz;
  public String uKB;
  public long uXW;
  public int uhU;
  public long uhV;
  public bpb vam;
  
  public bqd()
  {
    GMTrace.i(3718502154240L, 27705);
    GMTrace.o(3718502154240L, 27705);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3718636371968L, 27706);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.vam == null) {
        throw new b("Not all required fields were included: OpLog");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKB != null) {
        paramVarArgs.e(2, this.uKB);
      }
      paramVarArgs.fk(3, this.uhU);
      if (this.tZA != null)
      {
        paramVarArgs.fm(4, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      if (this.vam != null)
      {
        paramVarArgs.fm(5, this.vam.aYq());
        this.vam.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.uhV);
      paramVarArgs.fk(7, this.tZz);
      paramVarArgs.T(8, this.uXW);
      GMTrace.o(3718636371968L, 27706);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uKB != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uKB);
      }
      i += b.a.a.a.fh(3, this.uhU);
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(4, this.tZA.aYq());
      }
      i = paramInt;
      if (this.vam != null) {
        i = paramInt + b.a.a.a.fj(5, this.vam.aYq());
      }
      paramInt = b.a.a.a.S(6, this.uhV);
      int j = b.a.a.a.fh(7, this.tZz);
      int k = b.a.a.a.S(8, this.uXW);
      GMTrace.o(3718636371968L, 27706);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.vam == null) {
        throw new b("Not all required fields were included: OpLog");
      }
      GMTrace.o(3718636371968L, 27706);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqd localbqd = (bqd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3718636371968L, 27706);
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
          localbqd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3718636371968L, 27706);
        return 0;
      case 2: 
        localbqd.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3718636371968L, 27706);
        return 0;
      case 3: 
        localbqd.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3718636371968L, 27706);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbqd.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3718636371968L, 27706);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbqd.vam = ((bpb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3718636371968L, 27706);
        return 0;
      case 6: 
        localbqd.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3718636371968L, 27706);
        return 0;
      case 7: 
        localbqd.tZz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3718636371968L, 27706);
        return 0;
      }
      localbqd.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3718636371968L, 27706);
      return 0;
    }
    GMTrace.o(3718636371968L, 27706);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */