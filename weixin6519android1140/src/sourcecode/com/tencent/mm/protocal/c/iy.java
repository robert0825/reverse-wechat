package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class iy
  extends com.tencent.mm.bm.a
{
  public int kAW;
  public int tYe;
  public int tYf;
  public int tYg;
  public int tYh;
  public LinkedList<azq> tYi;
  public String tYj;
  public azp tYk;
  public int tYl;
  public int tYm;
  public LinkedList<azq> tYn;
  public LinkedList<iz> tYo;
  public LinkedList<iz> tYp;
  public int tYq;
  public int tYr;
  
  public iy()
  {
    GMTrace.i(13580015501312L, 101179);
    this.tYi = new LinkedList();
    this.tYn = new LinkedList();
    this.tYo = new LinkedList();
    this.tYp = new LinkedList();
    GMTrace.o(13580015501312L, 101179);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13580149719040L, 101180);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tYk == null) {
        throw new b("Not all required fields were included: AuthKey");
      }
      paramVarArgs.fk(1, this.tYe);
      paramVarArgs.fk(2, this.kAW);
      paramVarArgs.fk(3, this.tYf);
      paramVarArgs.fk(4, this.tYg);
      paramVarArgs.fk(5, this.tYh);
      paramVarArgs.d(6, 8, this.tYi);
      if (this.tYj != null) {
        paramVarArgs.e(7, this.tYj);
      }
      if (this.tYk != null)
      {
        paramVarArgs.fm(8, this.tYk.aYq());
        this.tYk.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.tYl);
      paramVarArgs.fk(10, this.tYm);
      paramVarArgs.d(11, 8, this.tYn);
      paramVarArgs.d(12, 8, this.tYo);
      paramVarArgs.d(13, 8, this.tYp);
      paramVarArgs.fk(14, this.tYq);
      paramVarArgs.fk(15, this.tYr);
      GMTrace.o(13580149719040L, 101180);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tYe) + 0 + b.a.a.a.fh(2, this.kAW) + b.a.a.a.fh(3, this.tYf) + b.a.a.a.fh(4, this.tYg) + b.a.a.a.fh(5, this.tYh) + b.a.a.a.c(6, 8, this.tYi);
      paramInt = i;
      if (this.tYj != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tYj);
      }
      i = paramInt;
      if (this.tYk != null) {
        i = paramInt + b.a.a.a.fj(8, this.tYk.aYq());
      }
      paramInt = b.a.a.a.fh(9, this.tYl);
      int j = b.a.a.a.fh(10, this.tYm);
      int k = b.a.a.a.c(11, 8, this.tYn);
      int m = b.a.a.a.c(12, 8, this.tYo);
      int n = b.a.a.a.c(13, 8, this.tYp);
      int i1 = b.a.a.a.fh(14, this.tYq);
      int i2 = b.a.a.a.fh(15, this.tYr);
      GMTrace.o(13580149719040L, 101180);
      return i + paramInt + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tYi.clear();
      this.tYn.clear();
      this.tYo.clear();
      this.tYp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tYk == null) {
        throw new b("Not all required fields were included: AuthKey");
      }
      GMTrace.o(13580149719040L, 101180);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      iy localiy = (iy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13580149719040L, 101180);
        return -1;
      case 1: 
        localiy.tYe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 2: 
        localiy.kAW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 3: 
        localiy.tYf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 4: 
        localiy.tYg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 5: 
        localiy.tYh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localiy.tYi.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 7: 
        localiy.tYj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localiy.tYk = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 9: 
        localiy.tYl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 10: 
        localiy.tYm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localiy.tYn.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localiy.tYo.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localiy.tYp.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580149719040L, 101180);
        return 0;
      case 14: 
        localiy.tYq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580149719040L, 101180);
        return 0;
      }
      localiy.tYr = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13580149719040L, 101180);
      return 0;
    }
    GMTrace.o(13580149719040L, 101180);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\iy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */