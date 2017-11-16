package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ek
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int tPV;
  public azq tPW;
  public azq tPX;
  public azq tPY;
  public String tQN;
  public String tQb;
  public long tQd;
  public int tSZ;
  public int tTa;
  public int tTb;
  public LinkedList<azq> tTc;
  public LinkedList<azr> tTd;
  public azp tTe;
  public int tTf;
  public int tTg;
  public int tTh;
  public long tTi;
  public int tTj;
  
  public ek()
  {
    GMTrace.i(3841177157632L, 28619);
    this.tTc = new LinkedList();
    this.tTd = new LinkedList();
    GMTrace.o(3841177157632L, 28619);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3841311375360L, 28620);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tPY == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fk(1, this.jib);
      if (this.tQN != null) {
        paramVarArgs.e(2, this.tQN);
      }
      if (this.tPW != null)
      {
        paramVarArgs.fm(3, this.tPW.aYq());
        this.tPW.a(paramVarArgs);
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(4, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      if (this.tPY != null)
      {
        paramVarArgs.fm(5, this.tPY.aYq());
        this.tPY.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.tSZ);
      paramVarArgs.fk(7, this.tTa);
      if (this.tQb != null) {
        paramVarArgs.e(8, this.tQb);
      }
      paramVarArgs.fk(9, this.tPV);
      paramVarArgs.fk(10, this.tTb);
      paramVarArgs.d(11, 8, this.tTc);
      paramVarArgs.d(12, 8, this.tTd);
      if (this.tTe != null)
      {
        paramVarArgs.fm(13, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      paramVarArgs.fk(14, this.tTf);
      paramVarArgs.fk(15, this.tTg);
      paramVarArgs.T(16, this.tQd);
      paramVarArgs.fk(17, this.tTh);
      paramVarArgs.T(18, this.tTi);
      paramVarArgs.fk(19, this.tTj);
      GMTrace.o(3841311375360L, 28620);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tQN);
      }
      i = paramInt;
      if (this.tPW != null) {
        i = paramInt + b.a.a.a.fj(3, this.tPW.aYq());
      }
      paramInt = i;
      if (this.tPX != null) {
        paramInt = i + b.a.a.a.fj(4, this.tPX.aYq());
      }
      i = paramInt;
      if (this.tPY != null) {
        i = paramInt + b.a.a.a.fj(5, this.tPY.aYq());
      }
      i = i + b.a.a.a.fh(6, this.tSZ) + b.a.a.a.fh(7, this.tTa);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tQb);
      }
      i = paramInt + b.a.a.a.fh(9, this.tPV) + b.a.a.a.fh(10, this.tTb) + b.a.a.a.c(11, 8, this.tTc) + b.a.a.a.c(12, 8, this.tTd);
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(13, this.tTe.aYq());
      }
      i = b.a.a.a.fh(14, this.tTf);
      int j = b.a.a.a.fh(15, this.tTg);
      int k = b.a.a.a.S(16, this.tQd);
      int m = b.a.a.a.fh(17, this.tTh);
      int n = b.a.a.a.S(18, this.tTi);
      int i1 = b.a.a.a.fh(19, this.tTj);
      GMTrace.o(3841311375360L, 28620);
      return paramInt + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTc.clear();
      this.tTd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tPY == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3841311375360L, 28620);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ek localek = (ek)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3841311375360L, 28620);
        return -1;
      case 1: 
        localek.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 2: 
        localek.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localek.tPW = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localek.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localek.tPY = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 6: 
        localek.tSZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 7: 
        localek.tTa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 8: 
        localek.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 9: 
        localek.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 10: 
        localek.tTb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
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
          localek.tTc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localek.tTd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localek.tTe = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 14: 
        localek.tTf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 15: 
        localek.tTg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 16: 
        localek.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 17: 
        localek.tTh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      case 18: 
        localek.tTi = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3841311375360L, 28620);
        return 0;
      }
      localek.tTj = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3841311375360L, 28620);
      return 0;
    }
    GMTrace.o(3841311375360L, 28620);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */