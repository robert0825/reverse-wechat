package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfh
  extends com.tencent.mm.bm.a
{
  public int nFd;
  public LinkedList<bfc> tQs;
  public String tRz;
  public long tXT;
  public String uBf;
  public LinkedList<azq> uDw;
  public int uED;
  public int uEI;
  public int uFY;
  public azp uQM;
  public int uQN;
  public int uQO;
  public int uQP;
  public LinkedList<bew> uQQ;
  public int uQR;
  public int uQS;
  public LinkedList<bew> uQT;
  public int uQU;
  public int uQV;
  public LinkedList<bew> uQW;
  public int uQX;
  public String uQY;
  public long uQZ;
  public int uQn;
  public int uRa;
  public LinkedList<azq> uRb;
  public int uRc;
  public azp uRd;
  public bfw uRe;
  public aug uRf;
  public bes uRg;
  
  public bfh()
  {
    GMTrace.i(3789234896896L, 28232);
    this.uQQ = new LinkedList();
    this.uQT = new LinkedList();
    this.uQW = new LinkedList();
    this.tQs = new LinkedList();
    this.uRb = new LinkedList();
    this.uDw = new LinkedList();
    GMTrace.o(3789234896896L, 28232);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3789369114624L, 28233);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQM == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      paramVarArgs.T(1, this.tXT);
      if (this.tRz != null) {
        paramVarArgs.e(2, this.tRz);
      }
      if (this.uBf != null) {
        paramVarArgs.e(3, this.uBf);
      }
      paramVarArgs.fk(4, this.nFd);
      if (this.uQM != null)
      {
        paramVarArgs.fm(5, this.uQM.aYq());
        this.uQM.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.uQN);
      paramVarArgs.fk(7, this.uQO);
      paramVarArgs.fk(8, this.uQP);
      paramVarArgs.d(9, 8, this.uQQ);
      paramVarArgs.fk(10, this.uQR);
      paramVarArgs.fk(11, this.uQS);
      paramVarArgs.d(12, 8, this.uQT);
      paramVarArgs.fk(13, this.uQU);
      paramVarArgs.fk(14, this.uQV);
      paramVarArgs.d(15, 8, this.uQW);
      paramVarArgs.fk(16, this.uEI);
      paramVarArgs.fk(17, this.uQX);
      paramVarArgs.fk(18, this.uFY);
      paramVarArgs.d(19, 8, this.tQs);
      paramVarArgs.fk(20, this.uQn);
      if (this.uQY != null) {
        paramVarArgs.e(21, this.uQY);
      }
      paramVarArgs.T(22, this.uQZ);
      paramVarArgs.fk(23, this.uRa);
      paramVarArgs.d(24, 8, this.uRb);
      paramVarArgs.fk(25, this.uED);
      paramVarArgs.fk(26, this.uRc);
      paramVarArgs.d(27, 8, this.uDw);
      if (this.uRd != null)
      {
        paramVarArgs.fm(28, this.uRd.aYq());
        this.uRd.a(paramVarArgs);
      }
      if (this.uRe != null)
      {
        paramVarArgs.fm(29, this.uRe.aYq());
        this.uRe.a(paramVarArgs);
      }
      if (this.uRf != null)
      {
        paramVarArgs.fm(30, this.uRf.aYq());
        this.uRf.a(paramVarArgs);
      }
      if (this.uRg != null)
      {
        paramVarArgs.fm(31, this.uRg.aYq());
        this.uRg.a(paramVarArgs);
      }
      GMTrace.o(3789369114624L, 28233);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.tXT) + 0;
      paramInt = i;
      if (this.tRz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tRz);
      }
      i = paramInt;
      if (this.uBf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uBf);
      }
      i += b.a.a.a.fh(4, this.nFd);
      paramInt = i;
      if (this.uQM != null) {
        paramInt = i + b.a.a.a.fj(5, this.uQM.aYq());
      }
      i = paramInt + b.a.a.a.fh(6, this.uQN) + b.a.a.a.fh(7, this.uQO) + b.a.a.a.fh(8, this.uQP) + b.a.a.a.c(9, 8, this.uQQ) + b.a.a.a.fh(10, this.uQR) + b.a.a.a.fh(11, this.uQS) + b.a.a.a.c(12, 8, this.uQT) + b.a.a.a.fh(13, this.uQU) + b.a.a.a.fh(14, this.uQV) + b.a.a.a.c(15, 8, this.uQW) + b.a.a.a.fh(16, this.uEI) + b.a.a.a.fh(17, this.uQX) + b.a.a.a.fh(18, this.uFY) + b.a.a.a.c(19, 8, this.tQs) + b.a.a.a.fh(20, this.uQn);
      paramInt = i;
      if (this.uQY != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.uQY);
      }
      i = paramInt + b.a.a.a.S(22, this.uQZ) + b.a.a.a.fh(23, this.uRa) + b.a.a.a.c(24, 8, this.uRb) + b.a.a.a.fh(25, this.uED) + b.a.a.a.fh(26, this.uRc) + b.a.a.a.c(27, 8, this.uDw);
      paramInt = i;
      if (this.uRd != null) {
        paramInt = i + b.a.a.a.fj(28, this.uRd.aYq());
      }
      i = paramInt;
      if (this.uRe != null) {
        i = paramInt + b.a.a.a.fj(29, this.uRe.aYq());
      }
      paramInt = i;
      if (this.uRf != null) {
        paramInt = i + b.a.a.a.fj(30, this.uRf.aYq());
      }
      i = paramInt;
      if (this.uRg != null) {
        i = paramInt + b.a.a.a.fj(31, this.uRg.aYq());
      }
      GMTrace.o(3789369114624L, 28233);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uQQ.clear();
      this.uQT.clear();
      this.uQW.clear();
      this.tQs.clear();
      this.uRb.clear();
      this.uDw.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uQM == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      GMTrace.o(3789369114624L, 28233);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfh localbfh = (bfh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3789369114624L, 28233);
        return -1;
      case 1: 
        localbfh.tXT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 2: 
        localbfh.tRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 3: 
        localbfh.uBf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 4: 
        localbfh.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uQM = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 6: 
        localbfh.uQN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 7: 
        localbfh.uQO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 8: 
        localbfh.uQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bew();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bew)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uQQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 10: 
        localbfh.uQR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 11: 
        localbfh.uQS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bew();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bew)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uQT.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 13: 
        localbfh.uQU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 14: 
        localbfh.uQV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bew();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bew)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uQW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 16: 
        localbfh.uEI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 17: 
        localbfh.uQX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 18: 
        localbfh.uFY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.tQs.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 20: 
        localbfh.uQn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 21: 
        localbfh.uQY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 22: 
        localbfh.uQZ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 23: 
        localbfh.uRa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 24: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uRb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 25: 
        localbfh.uED = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 26: 
        localbfh.uRc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 27: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uDw.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 28: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uRd = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 29: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uRe = ((bfw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      case 30: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aug();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aug)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfh.uRf = ((aug)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789369114624L, 28233);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bes();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bes)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbfh.uRg = ((bes)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3789369114624L, 28233);
      return 0;
    }
    GMTrace.o(3789369114624L, 28233);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */