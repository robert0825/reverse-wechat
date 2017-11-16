package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auz
  extends azh
{
  public int mjL;
  public String mjM;
  public int mjQ;
  public int mjW;
  public int mjX;
  public int mjY;
  public com.tencent.mm.bm.b mjZ;
  public int mkb;
  public int mke;
  public LinkedList<aur> tSO;
  public long uKh;
  public int uKq;
  public int uKr;
  public LinkedList<aur> uKs;
  public String uKt;
  public com.tencent.mm.bm.b uKu;
  public int uKv;
  public int uhU;
  public long uhV;
  
  public auz()
  {
    GMTrace.i(3687363641344L, 27473);
    this.tSO = new LinkedList();
    this.uKs = new LinkedList();
    GMTrace.o(3687363641344L, 27473);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3687497859072L, 27474);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.uKq);
      paramVarArgs.d(5, 8, this.tSO);
      paramVarArgs.fk(6, this.uKr);
      paramVarArgs.fk(7, this.mjW);
      paramVarArgs.fk(8, this.mjX);
      paramVarArgs.T(9, this.uKh);
      paramVarArgs.fk(10, this.mjY);
      if (this.mjZ != null) {
        paramVarArgs.b(11, this.mjZ);
      }
      paramVarArgs.fk(12, this.mjQ);
      paramVarArgs.fk(13, this.mjL);
      if (this.mjM != null) {
        paramVarArgs.e(14, this.mjM);
      }
      paramVarArgs.fk(15, this.mkb);
      paramVarArgs.d(16, 8, this.uKs);
      paramVarArgs.fk(17, this.mke);
      if (this.uKt != null) {
        paramVarArgs.e(18, this.uKt);
      }
      if (this.uKu != null) {
        paramVarArgs.b(19, this.uKu);
      }
      paramVarArgs.fk(20, this.uKv);
      GMTrace.o(3687497859072L, 27474);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV) + b.a.a.a.fh(4, this.uKq) + b.a.a.a.c(5, 8, this.tSO) + b.a.a.a.fh(6, this.uKr) + b.a.a.a.fh(7, this.mjW) + b.a.a.a.fh(8, this.mjX) + b.a.a.a.S(9, this.uKh) + b.a.a.a.fh(10, this.mjY);
      paramInt = i;
      if (this.mjZ != null) {
        paramInt = i + b.a.a.a.a(11, this.mjZ);
      }
      i = paramInt + b.a.a.a.fh(12, this.mjQ) + b.a.a.a.fh(13, this.mjL);
      paramInt = i;
      if (this.mjM != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.mjM);
      }
      i = paramInt + b.a.a.a.fh(15, this.mkb) + b.a.a.a.c(16, 8, this.uKs) + b.a.a.a.fh(17, this.mke);
      paramInt = i;
      if (this.uKt != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uKt);
      }
      i = paramInt;
      if (this.uKu != null) {
        i = paramInt + b.a.a.a.a(19, this.uKu);
      }
      paramInt = b.a.a.a.fh(20, this.uKv);
      GMTrace.o(3687497859072L, 27474);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSO.clear();
      this.uKs.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3687497859072L, 27474);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auz localauz = (auz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3687497859072L, 27474);
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
          localauz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 2: 
        localauz.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 3: 
        localauz.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 4: 
        localauz.uKq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aur();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aur)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localauz.tSO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 6: 
        localauz.uKr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 7: 
        localauz.mjW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 8: 
        localauz.mjX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 9: 
        localauz.uKh = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 10: 
        localauz.mjY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 11: 
        localauz.mjZ = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 12: 
        localauz.mjQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 13: 
        localauz.mjL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 14: 
        localauz.mjM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 15: 
        localauz.mkb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aur();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aur)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localauz.uKs.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 17: 
        localauz.mke = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 18: 
        localauz.uKt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 19: 
        localauz.uKu = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      }
      localauz.uKv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3687497859072L, 27474);
      return 0;
    }
    GMTrace.o(3687497859072L, 27474);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\auz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */