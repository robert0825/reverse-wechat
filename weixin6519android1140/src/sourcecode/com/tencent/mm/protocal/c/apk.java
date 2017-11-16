package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apk
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public int gCB;
  public String gCC;
  public int gCD;
  public int gCE;
  public String gCF;
  public String gCG;
  public int gCx;
  public String gCy;
  public String gCz;
  public int jhA;
  public int tOs;
  public int tOv;
  public int uAv;
  public String uAw;
  public String uAx;
  public String uAy;
  public int uAz;
  public py uEK;
  public int uEW;
  public int uEX;
  public com.tencent.mm.bm.b uEY;
  public int uEq;
  public int uFa;
  public azq uFb;
  public azq uFc;
  public int uFd;
  public int uFe;
  public int uFf;
  public int uFg;
  public int uFh;
  public agk uFi;
  public int uFj;
  public String uFk;
  public azq ufy;
  public long uiO;
  public String uiP;
  public azq uxT;
  
  public apk()
  {
    GMTrace.i(13335202365440L, 99355);
    GMTrace.o(13335202365440L, 99355);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13335336583168L, 99356);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.uxT == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.uFb == null) {
        throw new b.a.a.b("Not all required fields were included: BindEmail");
      }
      if (this.uFc == null) {
        throw new b.a.a.b("Not all required fields were included: BindMobile");
      }
      paramVarArgs.fk(1, this.uFa);
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
      paramVarArgs.fk(4, this.tOs);
      if (this.uFb != null)
      {
        paramVarArgs.fm(5, this.uFb.aYq());
        this.uFb.a(paramVarArgs);
      }
      if (this.uFc != null)
      {
        paramVarArgs.fm(6, this.uFc.aYq());
        this.uFc.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.jhA);
      paramVarArgs.fk(8, this.uEX);
      if (this.uEY != null) {
        paramVarArgs.b(9, this.uEY);
      }
      paramVarArgs.fk(10, this.gCx);
      if (this.gCy != null) {
        paramVarArgs.e(11, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(12, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(13, this.gCA);
      }
      paramVarArgs.fk(14, this.gCB);
      if (this.uEK != null)
      {
        paramVarArgs.fm(15, this.uEK.aYq());
        this.uEK.a(paramVarArgs);
      }
      paramVarArgs.fk(16, this.tOv);
      paramVarArgs.fk(17, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(18, this.uAw);
      }
      paramVarArgs.fk(19, this.uFd);
      paramVarArgs.fk(20, this.uFe);
      paramVarArgs.fk(21, this.uEq);
      paramVarArgs.fk(22, this.uFf);
      paramVarArgs.fk(23, this.uFg);
      if (this.uAx != null) {
        paramVarArgs.e(24, this.uAx);
      }
      paramVarArgs.fk(25, this.uFh);
      if (this.uFi != null)
      {
        paramVarArgs.fm(26, this.uFi.aYq());
        this.uFi.a(paramVarArgs);
      }
      if (this.gCC != null) {
        paramVarArgs.e(27, this.gCC);
      }
      if (this.uAy != null) {
        paramVarArgs.e(28, this.uAy);
      }
      paramVarArgs.fk(29, this.uAz);
      paramVarArgs.fk(30, this.uFj);
      paramVarArgs.T(31, this.uiO);
      if (this.uiP != null) {
        paramVarArgs.e(32, this.uiP);
      }
      paramVarArgs.fk(33, this.gCE);
      paramVarArgs.fk(34, this.gCD);
      if (this.gCF != null) {
        paramVarArgs.e(35, this.gCF);
      }
      paramVarArgs.fk(36, this.uEW);
      if (this.uFk != null) {
        paramVarArgs.e(37, this.uFk);
      }
      if (this.gCG != null) {
        paramVarArgs.e(38, this.gCG);
      }
      GMTrace.o(13335336583168L, 99356);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uFa) + 0;
      paramInt = i;
      if (this.ufy != null) {
        paramInt = i + b.a.a.a.fj(2, this.ufy.aYq());
      }
      i = paramInt;
      if (this.uxT != null) {
        i = paramInt + b.a.a.a.fj(3, this.uxT.aYq());
      }
      i += b.a.a.a.fh(4, this.tOs);
      paramInt = i;
      if (this.uFb != null) {
        paramInt = i + b.a.a.a.fj(5, this.uFb.aYq());
      }
      i = paramInt;
      if (this.uFc != null) {
        i = paramInt + b.a.a.a.fj(6, this.uFc.aYq());
      }
      i = i + b.a.a.a.fh(7, this.jhA) + b.a.a.a.fh(8, this.uEX);
      paramInt = i;
      if (this.uEY != null) {
        paramInt = i + b.a.a.a.a(9, this.uEY);
      }
      i = paramInt + b.a.a.a.fh(10, this.gCx);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(14, this.gCB);
      paramInt = i;
      if (this.uEK != null) {
        paramInt = i + b.a.a.a.fj(15, this.uEK.aYq());
      }
      i = paramInt + b.a.a.a.fh(16, this.tOv) + b.a.a.a.fh(17, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uAw);
      }
      i = paramInt + b.a.a.a.fh(19, this.uFd) + b.a.a.a.fh(20, this.uFe) + b.a.a.a.fh(21, this.uEq) + b.a.a.a.fh(22, this.uFf) + b.a.a.a.fh(23, this.uFg);
      paramInt = i;
      if (this.uAx != null) {
        paramInt = i + b.a.a.b.b.a.f(24, this.uAx);
      }
      i = paramInt + b.a.a.a.fh(25, this.uFh);
      paramInt = i;
      if (this.uFi != null) {
        paramInt = i + b.a.a.a.fj(26, this.uFi.aYq());
      }
      i = paramInt;
      if (this.gCC != null) {
        i = paramInt + b.a.a.b.b.a.f(27, this.gCC);
      }
      paramInt = i;
      if (this.uAy != null) {
        paramInt = i + b.a.a.b.b.a.f(28, this.uAy);
      }
      i = paramInt + b.a.a.a.fh(29, this.uAz) + b.a.a.a.fh(30, this.uFj) + b.a.a.a.S(31, this.uiO);
      paramInt = i;
      if (this.uiP != null) {
        paramInt = i + b.a.a.b.b.a.f(32, this.uiP);
      }
      i = paramInt + b.a.a.a.fh(33, this.gCE) + b.a.a.a.fh(34, this.gCD);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(35, this.gCF);
      }
      i = paramInt + b.a.a.a.fh(36, this.uEW);
      paramInt = i;
      if (this.uFk != null) {
        paramInt = i + b.a.a.b.b.a.f(37, this.uFk);
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(38, this.gCG);
      }
      GMTrace.o(13335336583168L, 99356);
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
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.uxT == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.uFb == null) {
        throw new b.a.a.b("Not all required fields were included: BindEmail");
      }
      if (this.uFc == null) {
        throw new b.a.a.b("Not all required fields were included: BindMobile");
      }
      GMTrace.o(13335336583168L, 99356);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apk localapk = (apk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13335336583168L, 99356);
        return -1;
      case 1: 
        localapk.uFa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
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
          localapk.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13335336583168L, 99356);
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
          localapk.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 4: 
        localapk.tOs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
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
          localapk.uFb = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13335336583168L, 99356);
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
          localapk.uFc = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 7: 
        localapk.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 8: 
        localapk.uEX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 9: 
        localapk.uEY = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 10: 
        localapk.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 11: 
        localapk.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 12: 
        localapk.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 13: 
        localapk.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 14: 
        localapk.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new py();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((py)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localapk.uEK = ((py)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 16: 
        localapk.tOv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 17: 
        localapk.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 18: 
        localapk.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 19: 
        localapk.uFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 20: 
        localapk.uFe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 21: 
        localapk.uEq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 22: 
        localapk.uFf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 23: 
        localapk.uFg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 24: 
        localapk.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 25: 
        localapk.uFh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 26: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localapk.uFi = ((agk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 27: 
        localapk.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 28: 
        localapk.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 29: 
        localapk.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 30: 
        localapk.uFj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 31: 
        localapk.uiO = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 32: 
        localapk.uiP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 33: 
        localapk.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 34: 
        localapk.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 35: 
        localapk.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 36: 
        localapk.uEW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      case 37: 
        localapk.uFk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13335336583168L, 99356);
        return 0;
      }
      localapk.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13335336583168L, 99356);
      return 0;
    }
    GMTrace.o(13335336583168L, 99356);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */