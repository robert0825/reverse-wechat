package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aon
  extends com.tencent.mm.bm.a
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
  public azq uDR;
  public azq uDS;
  public azq uDT;
  public int uEk;
  public String ubV;
  public String ubW;
  public int ueL;
  public azq ufo;
  public azq ufp;
  public azq ufy;
  public String utG;
  public azq uxT;
  
  public aon()
  {
    GMTrace.i(3843593076736L, 28637);
    GMTrace.o(3843593076736L, 28637);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3843727294464L, 28638);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
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
      if (this.uDR == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.uDS == null) {
        throw new b("Not all required fields were included: RemarkPYInitial");
      }
      if (this.uDT == null) {
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(1, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      if (this.uxT != null)
      {
        paramVarArgs.fm(2, this.uxT.aYq());
        this.uxT.a(paramVarArgs);
      }
      if (this.ufo != null)
      {
        paramVarArgs.fm(3, this.ufo.aYq());
        this.ufo.a(paramVarArgs);
      }
      if (this.ufp != null)
      {
        paramVarArgs.fm(4, this.ufp.aYq());
        this.ufp.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.gCx);
      if (this.tQa != null)
      {
        paramVarArgs.fm(6, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.uEk);
      if (this.uDR != null)
      {
        paramVarArgs.fm(8, this.uDR.aYq());
        this.uDR.a(paramVarArgs);
      }
      if (this.uDS != null)
      {
        paramVarArgs.fm(9, this.uDS.aYq());
        this.uDS.a(paramVarArgs);
      }
      if (this.uDT != null)
      {
        paramVarArgs.fm(10, this.uDT.aYq());
        this.uDT.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.ueL);
      if (this.gCy != null) {
        paramVarArgs.e(12, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(13, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(14, this.gCA);
      }
      paramVarArgs.fk(15, this.gCB);
      paramVarArgs.fk(16, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(17, this.uAw);
      }
      if (this.uAx != null) {
        paramVarArgs.e(18, this.uAx);
      }
      if (this.utG != null) {
        paramVarArgs.e(19, this.utG);
      }
      if (this.uAy != null) {
        paramVarArgs.e(20, this.uAy);
      }
      paramVarArgs.fk(21, this.uAz);
      paramVarArgs.fk(22, this.gCE);
      paramVarArgs.fk(23, this.gCD);
      if (this.gCF != null) {
        paramVarArgs.e(24, this.gCF);
      }
      if (this.gCC != null) {
        paramVarArgs.e(25, this.gCC);
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(26, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(27, this.gCG);
      }
      if (this.ubV != null) {
        paramVarArgs.e(28, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(29, this.ubW);
      }
      if (this.gCH != null) {
        paramVarArgs.e(30, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(31, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      GMTrace.o(3843727294464L, 28638);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.ufy != null) {
        i = b.a.a.a.fj(1, this.ufy.aYq()) + 0;
      }
      paramInt = i;
      if (this.uxT != null) {
        paramInt = i + b.a.a.a.fj(2, this.uxT.aYq());
      }
      i = paramInt;
      if (this.ufo != null) {
        i = paramInt + b.a.a.a.fj(3, this.ufo.aYq());
      }
      paramInt = i;
      if (this.ufp != null) {
        paramInt = i + b.a.a.a.fj(4, this.ufp.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.gCx);
      paramInt = i;
      if (this.tQa != null) {
        paramInt = i + b.a.a.a.fj(6, this.tQa.aYq());
      }
      i = paramInt + b.a.a.a.fh(7, this.uEk);
      paramInt = i;
      if (this.uDR != null) {
        paramInt = i + b.a.a.a.fj(8, this.uDR.aYq());
      }
      i = paramInt;
      if (this.uDS != null) {
        i = paramInt + b.a.a.a.fj(9, this.uDS.aYq());
      }
      paramInt = i;
      if (this.uDT != null) {
        paramInt = i + b.a.a.a.fj(10, this.uDT.aYq());
      }
      i = paramInt + b.a.a.a.fh(11, this.ueL);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(15, this.gCB) + b.a.a.a.fh(16, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.uAw);
      }
      i = paramInt;
      if (this.uAx != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.uAx);
      }
      paramInt = i;
      if (this.utG != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.utG);
      }
      i = paramInt;
      if (this.uAy != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.uAy);
      }
      i = i + b.a.a.a.fh(21, this.uAz) + b.a.a.a.fh(22, this.gCE) + b.a.a.a.fh(23, this.gCD);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(24, this.gCF);
      }
      i = paramInt;
      if (this.gCC != null) {
        i = paramInt + b.a.a.b.b.a.f(25, this.gCC);
      }
      paramInt = i;
      if (this.uAB != null) {
        paramInt = i + b.a.a.a.fj(26, this.uAB.aYq());
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(27, this.gCG);
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(28, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(29, this.ubW);
      }
      paramInt = i;
      if (this.gCH != null) {
        paramInt = i + b.a.a.b.b.a.f(30, this.gCH);
      }
      i = paramInt;
      if (this.uAC != null) {
        i = paramInt + b.a.a.a.fj(31, this.uAC.aYq());
      }
      GMTrace.o(3843727294464L, 28638);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
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
      if (this.uDR == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.uDS == null) {
        throw new b("Not all required fields were included: RemarkPYInitial");
      }
      if (this.uDT == null) {
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      GMTrace.o(3843727294464L, 28638);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aon localaon = (aon)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3843727294464L, 28638);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
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
          localaon.ufo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
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
          localaon.ufp = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 5: 
        localaon.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 7: 
        localaon.uEk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.uDR = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.uDS = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.uDT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 11: 
        localaon.ueL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 12: 
        localaon.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 13: 
        localaon.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 14: 
        localaon.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 15: 
        localaon.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 16: 
        localaon.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 17: 
        localaon.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 18: 
        localaon.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 19: 
        localaon.utG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 20: 
        localaon.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 21: 
        localaon.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 22: 
        localaon.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 23: 
        localaon.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 24: 
        localaon.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 25: 
        localaon.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 26: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaon.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 27: 
        localaon.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 28: 
        localaon.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 29: 
        localaon.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      case 30: 
        localaon.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3843727294464L, 28638);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new oo();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaon.uAC = ((oo)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3843727294464L, 28638);
      return 0;
    }
    GMTrace.o(3843727294464L, 28638);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */