package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhi
  extends ayx
{
  public String lSX;
  public String lSY;
  public String tQN;
  public int uTi;
  public int uTj;
  public LinkedList<bhk> uTk;
  public bhh uTl;
  public int uTm;
  public LinkedList<bhh> uTn;
  
  public bhi()
  {
    GMTrace.i(3936337526784L, 29328);
    this.uTk = new LinkedList();
    this.uTn = new LinkedList();
    GMTrace.o(3936337526784L, 29328);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3936471744512L, 29329);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uTi);
      if (this.lSY != null) {
        paramVarArgs.e(3, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(4, this.lSX);
      }
      if (this.tQN != null) {
        paramVarArgs.e(5, this.tQN);
      }
      paramVarArgs.fk(6, this.uTj);
      paramVarArgs.d(7, 8, this.uTk);
      if (this.uTl != null)
      {
        paramVarArgs.fm(8, this.uTl.aYq());
        this.uTl.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.uTm);
      paramVarArgs.d(10, 8, this.uTn);
      GMTrace.o(3936471744512L, 29329);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uTi);
      paramInt = i;
      if (this.lSY != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lSY);
      }
      i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lSX);
      }
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tQN);
      }
      i = paramInt + b.a.a.a.fh(6, this.uTj) + b.a.a.a.c(7, 8, this.uTk);
      paramInt = i;
      if (this.uTl != null) {
        paramInt = i + b.a.a.a.fj(8, this.uTl.aYq());
      }
      i = b.a.a.a.fh(9, this.uTm);
      int j = b.a.a.a.c(10, 8, this.uTn);
      GMTrace.o(3936471744512L, 29329);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uTk.clear();
      this.uTn.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3936471744512L, 29329);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhi localbhi = (bhi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3936471744512L, 29329);
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
          localbhi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 2: 
        localbhi.uTi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 3: 
        localbhi.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 4: 
        localbhi.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 5: 
        localbhi.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 6: 
        localbhi.uTj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbhi.uTk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbhi.uTl = ((bhh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3936471744512L, 29329);
        return 0;
      case 9: 
        localbhi.uTm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3936471744512L, 29329);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhh();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbhi.uTn.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3936471744512L, 29329);
      return 0;
    }
    GMTrace.o(3936471744512L, 29329);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */