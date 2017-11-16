package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class bnl
  extends ayx
{
  public int tSK;
  public azp uAI;
  public int uXu;
  public LinkedList<bnk> uXv;
  public int uXw;
  public LinkedList<Integer> uXx;
  public String utG;
  
  public bnl()
  {
    GMTrace.i(3679579013120L, 27415);
    this.uXv = new LinkedList();
    this.uXx = new LinkedList();
    GMTrace.o(3679579013120L, 27415);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3679713230848L, 27416);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tSK);
      paramVarArgs.fk(3, this.uXu);
      paramVarArgs.d(4, 8, this.uXv);
      if (this.utG != null) {
        paramVarArgs.e(5, this.utG);
      }
      paramVarArgs.fk(6, this.uXw);
      paramVarArgs.c(7, this.uXx);
      if (this.uAI != null)
      {
        paramVarArgs.fm(8, this.uAI.aYq());
        this.uAI.a(paramVarArgs);
      }
      GMTrace.o(3679713230848L, 27416);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tSK) + b.a.a.a.fh(3, this.uXu) + b.a.a.a.c(4, 8, this.uXv);
      paramInt = i;
      if (this.utG != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.utG);
      }
      i = paramInt + b.a.a.a.fh(6, this.uXw) + b.a.a.a.b(7, this.uXx);
      paramInt = i;
      if (this.uAI != null) {
        paramInt = i + b.a.a.a.fj(8, this.uAI.aYq());
      }
      GMTrace.o(3679713230848L, 27416);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uXv.clear();
      this.uXx.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3679713230848L, 27416);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnl localbnl = (bnl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3679713230848L, 27416);
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
          localbnl.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3679713230848L, 27416);
        return 0;
      case 2: 
        localbnl.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679713230848L, 27416);
        return 0;
      case 3: 
        localbnl.uXu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679713230848L, 27416);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnl.uXv.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3679713230848L, 27416);
        return 0;
      case 5: 
        localbnl.utG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3679713230848L, 27416);
        return 0;
      case 6: 
        localbnl.uXw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679713230848L, 27416);
        return 0;
      case 7: 
        localbnl.uXx = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(3679713230848L, 27416);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbnl.uAI = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3679713230848L, 27416);
      return 0;
    }
    GMTrace.o(3679713230848L, 27416);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */