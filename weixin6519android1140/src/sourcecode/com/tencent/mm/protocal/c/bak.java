package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bak
  extends azh
{
  public String gCA;
  public int gCB;
  public String gCC;
  public int gCD;
  public int gCE;
  public String gCF;
  public String gCG;
  public String gCH;
  public int gCx;
  public String gCy;
  public String gCz;
  public azp tQa;
  public bgm uAB;
  public oo uAC;
  public int uAv;
  public String uAw;
  public String uAx;
  public String uAy;
  public int uAz;
  public azp uOg;
  public String uOh;
  public int uOi;
  public String ubV;
  public String ubW;
  public azq ufo;
  public azq ufp;
  public azq ufy;
  public String uoe;
  public int uqk;
  public LinkedList<bai> uql;
  public azq uxT;
  
  public bak()
  {
    GMTrace.i(3966133862400L, 29550);
    this.uql = new LinkedList();
    GMTrace.o(3966133862400L, 29550);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3966268080128L, 29551);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.ufo == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ufp == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(2, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      if (this.uxT != null)
      {
        paramVarArgs.fm(3, this.uxT.aYq());
        this.uxT.a(paramVarArgs);
      }
      if (this.ufo != null)
      {
        paramVarArgs.fm(4, this.ufo.aYq());
        this.ufo.a(paramVarArgs);
      }
      if (this.ufp != null)
      {
        paramVarArgs.fm(5, this.ufp.aYq());
        this.ufp.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.gCx);
      if (this.tQa != null)
      {
        paramVarArgs.fm(7, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      if (this.gCy != null) {
        paramVarArgs.e(8, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(9, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(10, this.gCA);
      }
      paramVarArgs.fk(11, this.gCB);
      paramVarArgs.fk(12, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(13, this.uAw);
      }
      if (this.uAx != null) {
        paramVarArgs.e(14, this.uAx);
      }
      if (this.gCC != null) {
        paramVarArgs.e(15, this.gCC);
      }
      if (this.uAy != null) {
        paramVarArgs.e(16, this.uAy);
      }
      paramVarArgs.fk(17, this.uAz);
      paramVarArgs.fk(18, this.gCE);
      paramVarArgs.fk(19, this.gCD);
      if (this.gCF != null) {
        paramVarArgs.e(20, this.gCF);
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(21, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(22, this.gCG);
      }
      if (this.gCH != null) {
        paramVarArgs.e(23, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(24, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      paramVarArgs.fk(25, this.uqk);
      paramVarArgs.d(26, 8, this.uql);
      if (this.ubV != null) {
        paramVarArgs.e(27, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(28, this.ubW);
      }
      if (this.uOg != null)
      {
        paramVarArgs.fm(29, this.uOg.aYq());
        this.uOg.a(paramVarArgs);
      }
      if (this.uoe != null) {
        paramVarArgs.e(30, this.uoe);
      }
      if (this.uOh != null) {
        paramVarArgs.e(31, this.uOh);
      }
      paramVarArgs.fk(32, this.uOi);
      GMTrace.o(3966268080128L, 29551);
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
      if (this.ufy != null) {
        paramInt = i + b.a.a.a.fj(2, this.ufy.aYq());
      }
      i = paramInt;
      if (this.uxT != null) {
        i = paramInt + b.a.a.a.fj(3, this.uxT.aYq());
      }
      paramInt = i;
      if (this.ufo != null) {
        paramInt = i + b.a.a.a.fj(4, this.ufo.aYq());
      }
      i = paramInt;
      if (this.ufp != null) {
        i = paramInt + b.a.a.a.fj(5, this.ufp.aYq());
      }
      i += b.a.a.a.fh(6, this.gCx);
      paramInt = i;
      if (this.tQa != null) {
        paramInt = i + b.a.a.a.fj(7, this.tQa.aYq());
      }
      i = paramInt;
      if (this.gCy != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.gCy);
      }
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gCz);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.gCA);
      }
      i = i + b.a.a.a.fh(11, this.gCB) + b.a.a.a.fh(12, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uAw);
      }
      i = paramInt;
      if (this.uAx != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.uAx);
      }
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.gCC);
      }
      i = paramInt;
      if (this.uAy != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.uAy);
      }
      i = i + b.a.a.a.fh(17, this.uAz) + b.a.a.a.fh(18, this.gCE) + b.a.a.a.fh(19, this.gCD);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.gCF);
      }
      i = paramInt;
      if (this.uAB != null) {
        i = paramInt + b.a.a.a.fj(21, this.uAB.aYq());
      }
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.gCG);
      }
      i = paramInt;
      if (this.gCH != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.gCH);
      }
      paramInt = i;
      if (this.uAC != null) {
        paramInt = i + b.a.a.a.fj(24, this.uAC.aYq());
      }
      i = paramInt + b.a.a.a.fh(25, this.uqk) + b.a.a.a.c(26, 8, this.uql);
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(27, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(28, this.ubW);
      }
      paramInt = i;
      if (this.uOg != null) {
        paramInt = i + b.a.a.a.fj(29, this.uOg.aYq());
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(30, this.uoe);
      }
      paramInt = i;
      if (this.uOh != null) {
        paramInt = i + b.a.a.b.b.a.f(31, this.uOh);
      }
      i = b.a.a.a.fh(32, this.uOi);
      GMTrace.o(3966268080128L, 29551);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uql.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.ufo == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ufp == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(3966268080128L, 29551);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bak localbak = (bak)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3966268080128L, 29551);
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
          localbak.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.ufo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.ufp = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 6: 
        localbak.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 8: 
        localbak.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 9: 
        localbak.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 10: 
        localbak.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 11: 
        localbak.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 12: 
        localbak.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 13: 
        localbak.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 14: 
        localbak.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 15: 
        localbak.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 16: 
        localbak.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 17: 
        localbak.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 18: 
        localbak.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 19: 
        localbak.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 20: 
        localbak.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 21: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 22: 
        localbak.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 23: 
        localbak.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 24: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 25: 
        localbak.uqk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 26: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bai();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bai)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.uql.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 27: 
        localbak.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 28: 
        localbak.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 29: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbak.uOg = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 30: 
        localbak.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      case 31: 
        localbak.uOh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3966268080128L, 29551);
        return 0;
      }
      localbak.uOi = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3966268080128L, 29551);
      return 0;
    }
    GMTrace.o(3966268080128L, 29551);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */