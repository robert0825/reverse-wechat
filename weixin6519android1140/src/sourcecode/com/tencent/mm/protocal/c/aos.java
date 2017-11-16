package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aos
  extends com.tencent.mm.bm.a
{
  public String fjy;
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
  public String lTj;
  public int tQP;
  public azp tQa;
  public String tRP;
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
  public int uEA;
  public int uEB;
  public int uEC;
  public int uED;
  public String uEE;
  public atq uEF;
  public int uEG;
  public int uEH;
  public int uEI;
  public int uEk;
  public azq uEo;
  public int uEp;
  public int uEq;
  public String uEr;
  public String uEs;
  public String uEt;
  public String uEu;
  public String uEv;
  public String uEw;
  public String uEx;
  public String uEy;
  public by uEz;
  public String ubV;
  public String ubW;
  public int ueF;
  public int ueG;
  public int ueL;
  public int ueM;
  public LinkedList<azo> ueN;
  public int ueP;
  public int ueQ;
  public int ufA;
  public String ufB;
  public azq ufo;
  public azq ufp;
  public azq ufy;
  public lf upV;
  public String utG;
  public azq uxT;
  
  public aos()
  {
    GMTrace.i(13341913251840L, 99405);
    this.ueN = new LinkedList();
    GMTrace.o(13341913251840L, 99405);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13342047469568L, 99406);
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
      paramVarArgs.fk(7, this.ueF);
      paramVarArgs.fk(8, this.ueG);
      paramVarArgs.fk(9, this.uEk);
      if (this.uDR != null)
      {
        paramVarArgs.fm(10, this.uDR.aYq());
        this.uDR.a(paramVarArgs);
      }
      if (this.uDS != null)
      {
        paramVarArgs.fm(11, this.uDS.aYq());
        this.uDS.a(paramVarArgs);
      }
      if (this.uDT != null)
      {
        paramVarArgs.fm(12, this.uDT.aYq());
        this.uDT.a(paramVarArgs);
      }
      paramVarArgs.fk(13, this.ueL);
      paramVarArgs.fk(14, this.ueM);
      paramVarArgs.d(15, 8, this.ueN);
      if (this.uEo != null)
      {
        paramVarArgs.fm(16, this.uEo.aYq());
        this.uEo.a(paramVarArgs);
      }
      paramVarArgs.fk(17, this.ueP);
      paramVarArgs.fk(18, this.ueQ);
      if (this.gCy != null) {
        paramVarArgs.e(19, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(20, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(21, this.gCA);
      }
      paramVarArgs.fk(22, this.gCB);
      paramVarArgs.fk(23, this.uEp);
      paramVarArgs.fk(24, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(25, this.uAw);
      }
      paramVarArgs.fk(26, this.uEq);
      paramVarArgs.fk(27, this.tQP);
      if (this.uAx != null) {
        paramVarArgs.e(28, this.uAx);
      }
      if (this.utG != null) {
        paramVarArgs.e(29, this.utG);
      }
      if (this.gCC != null) {
        paramVarArgs.e(30, this.gCC);
      }
      if (this.uEr != null) {
        paramVarArgs.e(31, this.uEr);
      }
      if (this.uAy != null) {
        paramVarArgs.e(32, this.uAy);
      }
      paramVarArgs.fk(33, this.uAz);
      paramVarArgs.fk(34, this.gCE);
      paramVarArgs.fk(35, this.gCD);
      if (this.gCF != null) {
        paramVarArgs.e(36, this.gCF);
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(37, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(38, this.gCG);
      }
      if (this.ubV != null) {
        paramVarArgs.e(39, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(40, this.ubW);
      }
      if (this.gCH != null) {
        paramVarArgs.e(41, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(42, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      if (this.uEs != null) {
        paramVarArgs.e(43, this.uEs);
      }
      if (this.uEt != null) {
        paramVarArgs.e(44, this.uEt);
      }
      if (this.uEu != null) {
        paramVarArgs.e(45, this.uEu);
      }
      if (this.uEv != null) {
        paramVarArgs.e(46, this.uEv);
      }
      if (this.uEw != null) {
        paramVarArgs.e(47, this.uEw);
      }
      if (this.uEx != null) {
        paramVarArgs.e(48, this.uEx);
      }
      if (this.uEy != null) {
        paramVarArgs.e(49, this.uEy);
      }
      if (this.uEz != null)
      {
        paramVarArgs.fm(50, this.uEz.aYq());
        this.uEz.a(paramVarArgs);
      }
      paramVarArgs.fk(53, this.uEA);
      if (this.lTj != null) {
        paramVarArgs.e(54, this.lTj);
      }
      paramVarArgs.fk(55, this.uEB);
      paramVarArgs.fk(56, this.uEC);
      if (this.upV != null)
      {
        paramVarArgs.fm(57, this.upV.aYq());
        this.upV.a(paramVarArgs);
      }
      paramVarArgs.fk(58, this.uED);
      if (this.tRP != null) {
        paramVarArgs.e(59, this.tRP);
      }
      if (this.uEE != null) {
        paramVarArgs.e(60, this.uEE);
      }
      if (this.ufB != null) {
        paramVarArgs.e(61, this.ufB);
      }
      if (this.uEF != null)
      {
        paramVarArgs.fm(62, this.uEF.aYq());
        this.uEF.a(paramVarArgs);
      }
      if (this.fjy != null) {
        paramVarArgs.e(63, this.fjy);
      }
      paramVarArgs.fk(64, this.uEG);
      paramVarArgs.fk(65, this.ufA);
      paramVarArgs.fk(66, this.uEH);
      paramVarArgs.fk(67, this.uEI);
      GMTrace.o(13342047469568L, 99406);
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
      i = paramInt + b.a.a.a.fh(7, this.ueF) + b.a.a.a.fh(8, this.ueG) + b.a.a.a.fh(9, this.uEk);
      paramInt = i;
      if (this.uDR != null) {
        paramInt = i + b.a.a.a.fj(10, this.uDR.aYq());
      }
      i = paramInt;
      if (this.uDS != null) {
        i = paramInt + b.a.a.a.fj(11, this.uDS.aYq());
      }
      paramInt = i;
      if (this.uDT != null) {
        paramInt = i + b.a.a.a.fj(12, this.uDT.aYq());
      }
      i = paramInt + b.a.a.a.fh(13, this.ueL) + b.a.a.a.fh(14, this.ueM) + b.a.a.a.c(15, 8, this.ueN);
      paramInt = i;
      if (this.uEo != null) {
        paramInt = i + b.a.a.a.fj(16, this.uEo.aYq());
      }
      i = paramInt + b.a.a.a.fh(17, this.ueP) + b.a.a.a.fh(18, this.ueQ);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(22, this.gCB) + b.a.a.a.fh(23, this.uEp) + b.a.a.a.fh(24, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(25, this.uAw);
      }
      i = paramInt + b.a.a.a.fh(26, this.uEq) + b.a.a.a.fh(27, this.tQP);
      paramInt = i;
      if (this.uAx != null) {
        paramInt = i + b.a.a.b.b.a.f(28, this.uAx);
      }
      i = paramInt;
      if (this.utG != null) {
        i = paramInt + b.a.a.b.b.a.f(29, this.utG);
      }
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(30, this.gCC);
      }
      i = paramInt;
      if (this.uEr != null) {
        i = paramInt + b.a.a.b.b.a.f(31, this.uEr);
      }
      paramInt = i;
      if (this.uAy != null) {
        paramInt = i + b.a.a.b.b.a.f(32, this.uAy);
      }
      i = paramInt + b.a.a.a.fh(33, this.uAz) + b.a.a.a.fh(34, this.gCE) + b.a.a.a.fh(35, this.gCD);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(36, this.gCF);
      }
      i = paramInt;
      if (this.uAB != null) {
        i = paramInt + b.a.a.a.fj(37, this.uAB.aYq());
      }
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(38, this.gCG);
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(39, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(40, this.ubW);
      }
      i = paramInt;
      if (this.gCH != null) {
        i = paramInt + b.a.a.b.b.a.f(41, this.gCH);
      }
      paramInt = i;
      if (this.uAC != null) {
        paramInt = i + b.a.a.a.fj(42, this.uAC.aYq());
      }
      i = paramInt;
      if (this.uEs != null) {
        i = paramInt + b.a.a.b.b.a.f(43, this.uEs);
      }
      paramInt = i;
      if (this.uEt != null) {
        paramInt = i + b.a.a.b.b.a.f(44, this.uEt);
      }
      i = paramInt;
      if (this.uEu != null) {
        i = paramInt + b.a.a.b.b.a.f(45, this.uEu);
      }
      paramInt = i;
      if (this.uEv != null) {
        paramInt = i + b.a.a.b.b.a.f(46, this.uEv);
      }
      i = paramInt;
      if (this.uEw != null) {
        i = paramInt + b.a.a.b.b.a.f(47, this.uEw);
      }
      paramInt = i;
      if (this.uEx != null) {
        paramInt = i + b.a.a.b.b.a.f(48, this.uEx);
      }
      i = paramInt;
      if (this.uEy != null) {
        i = paramInt + b.a.a.b.b.a.f(49, this.uEy);
      }
      paramInt = i;
      if (this.uEz != null) {
        paramInt = i + b.a.a.a.fj(50, this.uEz.aYq());
      }
      i = paramInt + b.a.a.a.fh(53, this.uEA);
      paramInt = i;
      if (this.lTj != null) {
        paramInt = i + b.a.a.b.b.a.f(54, this.lTj);
      }
      i = paramInt + b.a.a.a.fh(55, this.uEB) + b.a.a.a.fh(56, this.uEC);
      paramInt = i;
      if (this.upV != null) {
        paramInt = i + b.a.a.a.fj(57, this.upV.aYq());
      }
      i = paramInt + b.a.a.a.fh(58, this.uED);
      paramInt = i;
      if (this.tRP != null) {
        paramInt = i + b.a.a.b.b.a.f(59, this.tRP);
      }
      i = paramInt;
      if (this.uEE != null) {
        i = paramInt + b.a.a.b.b.a.f(60, this.uEE);
      }
      paramInt = i;
      if (this.ufB != null) {
        paramInt = i + b.a.a.b.b.a.f(61, this.ufB);
      }
      i = paramInt;
      if (this.uEF != null) {
        i = paramInt + b.a.a.a.fj(62, this.uEF.aYq());
      }
      paramInt = i;
      if (this.fjy != null) {
        paramInt = i + b.a.a.b.b.a.f(63, this.fjy);
      }
      i = b.a.a.a.fh(64, this.uEG);
      int j = b.a.a.a.fh(65, this.ufA);
      int k = b.a.a.a.fh(66, this.uEH);
      int m = b.a.a.a.fh(67, this.uEI);
      GMTrace.o(13342047469568L, 99406);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ueN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
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
      GMTrace.o(13342047469568L, 99406);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aos localaos = (aos)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 51: 
      case 52: 
      default: 
        GMTrace.o(13342047469568L, 99406);
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
          localaos.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
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
          localaos.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
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
          localaos.ufo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
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
          localaos.ufp = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 5: 
        localaos.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
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
          localaos.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 7: 
        localaos.ueF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 8: 
        localaos.ueG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 9: 
        localaos.uEk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
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
          localaos.uDR = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
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
          localaos.uDS = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.uDT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 13: 
        localaos.ueL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 14: 
        localaos.ueM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.ueN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.uEo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 17: 
        localaos.ueP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 18: 
        localaos.ueQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 19: 
        localaos.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 20: 
        localaos.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 21: 
        localaos.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 22: 
        localaos.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 23: 
        localaos.uEp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 24: 
        localaos.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 25: 
        localaos.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 26: 
        localaos.uEq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 27: 
        localaos.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 28: 
        localaos.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 29: 
        localaos.utG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 30: 
        localaos.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 31: 
        localaos.uEr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 32: 
        localaos.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 33: 
        localaos.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 34: 
        localaos.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 35: 
        localaos.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 36: 
        localaos.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 37: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 38: 
        localaos.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 39: 
        localaos.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 40: 
        localaos.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 41: 
        localaos.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 42: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 43: 
        localaos.uEs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 44: 
        localaos.uEt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 45: 
        localaos.uEu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 46: 
        localaos.uEv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 47: 
        localaos.uEw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 48: 
        localaos.uEx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 49: 
        localaos.uEy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 50: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new by();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((by)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.uEz = ((by)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 53: 
        localaos.uEA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 54: 
        localaos.lTj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 55: 
        localaos.uEB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 56: 
        localaos.uEC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 57: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new lf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((lf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.upV = ((lf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 58: 
        localaos.uED = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 59: 
        localaos.tRP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 60: 
        localaos.uEE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 61: 
        localaos.ufB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 62: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaos.uEF = ((atq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 63: 
        localaos.fjy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 64: 
        localaos.uEG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 65: 
        localaos.ufA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      case 66: 
        localaos.uEH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13342047469568L, 99406);
        return 0;
      }
      localaos.uEI = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13342047469568L, 99406);
      return 0;
    }
    GMTrace.o(13342047469568L, 99406);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */