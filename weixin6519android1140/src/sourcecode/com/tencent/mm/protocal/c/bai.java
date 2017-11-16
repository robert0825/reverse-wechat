package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bai
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
  public String ubV;
  public String ubW;
  public azq ufo;
  public azq ufp;
  public azq ufy;
  public String uoe;
  public azq uxT;
  
  public bai()
  {
    GMTrace.i(3708838477824L, 27633);
    GMTrace.o(3708838477824L, 27633);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3708972695552L, 27634);
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
      if (this.gCy != null) {
        paramVarArgs.e(7, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(8, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(9, this.gCA);
      }
      paramVarArgs.fk(10, this.gCB);
      paramVarArgs.fk(11, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(12, this.uAw);
      }
      if (this.uAx != null) {
        paramVarArgs.e(13, this.uAx);
      }
      if (this.gCC != null) {
        paramVarArgs.e(14, this.gCC);
      }
      if (this.uAy != null) {
        paramVarArgs.e(15, this.uAy);
      }
      paramVarArgs.fk(16, this.uAz);
      paramVarArgs.fk(17, this.gCE);
      paramVarArgs.fk(18, this.gCD);
      if (this.gCF != null) {
        paramVarArgs.e(19, this.gCF);
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(20, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(21, this.gCG);
      }
      if (this.gCH != null) {
        paramVarArgs.e(22, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(23, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      if (this.ubV != null) {
        paramVarArgs.e(24, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(25, this.ubW);
      }
      if (this.uoe != null) {
        paramVarArgs.e(26, this.uoe);
      }
      GMTrace.o(3708972695552L, 27634);
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
      i = paramInt;
      if (this.gCy != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.gCy);
      }
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.gCz);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.gCA);
      }
      i = i + b.a.a.a.fh(10, this.gCB) + b.a.a.a.fh(11, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uAw);
      }
      i = paramInt;
      if (this.uAx != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uAx);
      }
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.gCC);
      }
      i = paramInt;
      if (this.uAy != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uAy);
      }
      i = i + b.a.a.a.fh(16, this.uAz) + b.a.a.a.fh(17, this.gCE) + b.a.a.a.fh(18, this.gCD);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.gCF);
      }
      i = paramInt;
      if (this.uAB != null) {
        i = paramInt + b.a.a.a.fj(20, this.uAB.aYq());
      }
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.gCG);
      }
      i = paramInt;
      if (this.gCH != null) {
        i = paramInt + b.a.a.b.b.a.f(22, this.gCH);
      }
      paramInt = i;
      if (this.uAC != null) {
        paramInt = i + b.a.a.a.fj(23, this.uAC.aYq());
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(24, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(25, this.ubW);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(26, this.uoe);
      }
      GMTrace.o(3708972695552L, 27634);
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
      GMTrace.o(3708972695552L, 27634);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bai localbai = (bai)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3708972695552L, 27634);
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
          localbai.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
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
          localbai.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
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
          localbai.ufo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
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
          localbai.ufp = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 5: 
        localbai.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708972695552L, 27634);
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
          localbai.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 7: 
        localbai.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 8: 
        localbai.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 9: 
        localbai.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 10: 
        localbai.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 11: 
        localbai.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 12: 
        localbai.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 13: 
        localbai.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 14: 
        localbai.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 15: 
        localbai.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 16: 
        localbai.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 17: 
        localbai.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 18: 
        localbai.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 19: 
        localbai.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbai.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 21: 
        localbai.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 22: 
        localbai.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbai.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 24: 
        localbai.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      case 25: 
        localbai.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3708972695552L, 27634);
        return 0;
      }
      localbai.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3708972695552L, 27634);
      return 0;
    }
    GMTrace.o(3708972695552L, 27634);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */