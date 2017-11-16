package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqh
  extends azh
{
  public int jhA;
  public String jhi;
  public int kAW;
  public String kAY;
  public String tNa;
  public String tOA;
  public int tOB;
  public String tOC;
  public String tOt;
  public int tOw;
  public String tOz;
  public String tSi;
  public bdz tSl;
  public int tSq;
  public aho tUS;
  public hz tUT;
  public apx tUU;
  public String uGp;
  public int uGq;
  public String uGr;
  public int uGs;
  public aty uGt;
  public int uGu;
  public String uGv;
  public String uGw;
  public bbf uGx;
  public iy uaA;
  public iy uaB;
  public iy uaC;
  public String utF;
  public azp utI;
  
  public aqh()
  {
    GMTrace.i(13581626114048L, 101191);
    GMTrace.o(13581626114048L, 101191);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13581760331776L, 101192);
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
      paramVarArgs.fk(2, this.kAW);
      if (this.tNa != null) {
        paramVarArgs.e(3, this.tNa);
      }
      if (this.tOz != null) {
        paramVarArgs.e(4, this.tOz);
      }
      if (this.tOA != null) {
        paramVarArgs.e(5, this.tOA);
      }
      if (this.uGp != null) {
        paramVarArgs.e(6, this.uGp);
      }
      if (this.tOt != null) {
        paramVarArgs.e(7, this.tOt);
      }
      paramVarArgs.fk(8, this.tOB);
      paramVarArgs.fk(9, this.uGq);
      if (this.uGr != null) {
        paramVarArgs.e(10, this.uGr);
      }
      if (this.tUT != null)
      {
        paramVarArgs.fm(14, this.tUT.aYq());
        this.tUT.a(paramVarArgs);
      }
      if (this.tOC != null) {
        paramVarArgs.e(15, this.tOC);
      }
      if (this.jhi != null) {
        paramVarArgs.e(16, this.jhi);
      }
      paramVarArgs.fk(17, this.jhA);
      if (this.tUU != null)
      {
        paramVarArgs.fm(18, this.tUU.aYq());
        this.tUU.a(paramVarArgs);
      }
      paramVarArgs.fk(19, this.uGs);
      paramVarArgs.fk(20, this.tOw);
      if (this.tSi != null) {
        paramVarArgs.e(21, this.tSi);
      }
      if (this.uGt != null)
      {
        paramVarArgs.fm(22, this.uGt.aYq());
        this.uGt.a(paramVarArgs);
      }
      if (this.kAY != null) {
        paramVarArgs.e(23, this.kAY);
      }
      paramVarArgs.fk(24, this.uGu);
      if (this.tUS != null)
      {
        paramVarArgs.fm(25, this.tUS.aYq());
        this.tUS.a(paramVarArgs);
      }
      if (this.uGv != null) {
        paramVarArgs.e(26, this.uGv);
      }
      if (this.uaA != null)
      {
        paramVarArgs.fm(27, this.uaA.aYq());
        this.uaA.a(paramVarArgs);
      }
      if (this.uGw != null) {
        paramVarArgs.e(28, this.uGw);
      }
      if (this.utF != null) {
        paramVarArgs.e(29, this.utF);
      }
      if (this.utI != null)
      {
        paramVarArgs.fm(30, this.utI.aYq());
        this.utI.a(paramVarArgs);
      }
      if (this.tSl != null)
      {
        paramVarArgs.fm(31, this.tSl.aYq());
        this.tSl.a(paramVarArgs);
      }
      if (this.uaB != null)
      {
        paramVarArgs.fm(32, this.uaB.aYq());
        this.uaB.a(paramVarArgs);
      }
      if (this.uaC != null)
      {
        paramVarArgs.fm(33, this.uaC.aYq());
        this.uaC.a(paramVarArgs);
      }
      if (this.uGx != null)
      {
        paramVarArgs.fm(34, this.uGx.aYq());
        this.uGx.a(paramVarArgs);
      }
      paramVarArgs.fk(35, this.tSq);
      GMTrace.o(13581760331776L, 101192);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.kAW);
      paramInt = i;
      if (this.tNa != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tNa);
      }
      i = paramInt;
      if (this.tOz != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tOz);
      }
      paramInt = i;
      if (this.tOA != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tOA);
      }
      i = paramInt;
      if (this.uGp != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uGp);
      }
      paramInt = i;
      if (this.tOt != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tOt);
      }
      i = paramInt + b.a.a.a.fh(8, this.tOB) + b.a.a.a.fh(9, this.uGq);
      paramInt = i;
      if (this.uGr != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uGr);
      }
      i = paramInt;
      if (this.tUT != null) {
        i = paramInt + b.a.a.a.fj(14, this.tUT.aYq());
      }
      paramInt = i;
      if (this.tOC != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tOC);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.jhi);
      }
      i += b.a.a.a.fh(17, this.jhA);
      paramInt = i;
      if (this.tUU != null) {
        paramInt = i + b.a.a.a.fj(18, this.tUU.aYq());
      }
      i = paramInt + b.a.a.a.fh(19, this.uGs) + b.a.a.a.fh(20, this.tOw);
      paramInt = i;
      if (this.tSi != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.tSi);
      }
      i = paramInt;
      if (this.uGt != null) {
        i = paramInt + b.a.a.a.fj(22, this.uGt.aYq());
      }
      paramInt = i;
      if (this.kAY != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.kAY);
      }
      i = paramInt + b.a.a.a.fh(24, this.uGu);
      paramInt = i;
      if (this.tUS != null) {
        paramInt = i + b.a.a.a.fj(25, this.tUS.aYq());
      }
      i = paramInt;
      if (this.uGv != null) {
        i = paramInt + b.a.a.b.b.a.f(26, this.uGv);
      }
      paramInt = i;
      if (this.uaA != null) {
        paramInt = i + b.a.a.a.fj(27, this.uaA.aYq());
      }
      i = paramInt;
      if (this.uGw != null) {
        i = paramInt + b.a.a.b.b.a.f(28, this.uGw);
      }
      paramInt = i;
      if (this.utF != null) {
        paramInt = i + b.a.a.b.b.a.f(29, this.utF);
      }
      i = paramInt;
      if (this.utI != null) {
        i = paramInt + b.a.a.a.fj(30, this.utI.aYq());
      }
      paramInt = i;
      if (this.tSl != null) {
        paramInt = i + b.a.a.a.fj(31, this.tSl.aYq());
      }
      i = paramInt;
      if (this.uaB != null) {
        i = paramInt + b.a.a.a.fj(32, this.uaB.aYq());
      }
      paramInt = i;
      if (this.uaC != null) {
        paramInt = i + b.a.a.a.fj(33, this.uaC.aYq());
      }
      i = paramInt;
      if (this.uGx != null) {
        i = paramInt + b.a.a.a.fj(34, this.uGx.aYq());
      }
      paramInt = b.a.a.a.fh(35, this.tSq);
      GMTrace.o(13581760331776L, 101192);
      return i + paramInt;
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
      GMTrace.o(13581760331776L, 101192);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqh localaqh = (aqh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 11: 
      case 12: 
      case 13: 
      default: 
        GMTrace.o(13581760331776L, 101192);
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
          localaqh.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 2: 
        localaqh.kAW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 3: 
        localaqh.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 4: 
        localaqh.tOz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 5: 
        localaqh.tOA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 6: 
        localaqh.uGp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 7: 
        localaqh.tOt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 8: 
        localaqh.tOB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 9: 
        localaqh.uGq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 10: 
        localaqh.uGr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.tUT = ((hz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 15: 
        localaqh.tOC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 16: 
        localaqh.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 17: 
        localaqh.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.tUU = ((apx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 19: 
        localaqh.uGs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 20: 
        localaqh.tOw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 21: 
        localaqh.tSi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aty();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aty)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.uGt = ((aty)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 23: 
        localaqh.kAY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 24: 
        localaqh.uGu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 25: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aho();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aho)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.tUS = ((aho)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 26: 
        localaqh.uGv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 27: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.uaA = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 28: 
        localaqh.uGw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 29: 
        localaqh.utF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 30: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.utI = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 31: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.tSl = ((bdz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 32: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.uaB = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 33: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.uaC = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      case 34: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqh.uGx = ((bbf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581760331776L, 101192);
        return 0;
      }
      localaqh.tSq = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13581760331776L, 101192);
      return 0;
    }
    GMTrace.o(13581760331776L, 101192);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */