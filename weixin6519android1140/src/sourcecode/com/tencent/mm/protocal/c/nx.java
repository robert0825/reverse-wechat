package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nx
  extends com.tencent.mm.bm.a
{
  public String gCC;
  public int gCx;
  public String jhi;
  public String jio;
  public String lTj;
  public azp tQa;
  public String ueD;
  public String ueE;
  public int ueF;
  public int ueG;
  public String ueH;
  public int ueI;
  public String ueJ;
  public String ueK;
  public int ueL;
  public int ueM;
  public LinkedList<azo> ueN;
  public String ueO;
  public int ueP;
  public int ueQ;
  public int ueR;
  public int ueS;
  
  public nx()
  {
    GMTrace.i(3977139716096L, 29632);
    this.ueN = new LinkedList();
    GMTrace.o(3977139716096L, 29632);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977273933824L, 29633);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.ueD != null) {
        paramVarArgs.e(3, this.ueD);
      }
      if (this.ueE != null) {
        paramVarArgs.e(4, this.ueE);
      }
      paramVarArgs.fk(5, this.gCx);
      if (this.tQa != null)
      {
        paramVarArgs.fm(6, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.ueF);
      paramVarArgs.fk(8, this.ueG);
      if (this.ueH != null) {
        paramVarArgs.e(9, this.ueH);
      }
      paramVarArgs.fk(10, this.ueI);
      if (this.ueJ != null) {
        paramVarArgs.e(11, this.ueJ);
      }
      if (this.ueK != null) {
        paramVarArgs.e(12, this.ueK);
      }
      paramVarArgs.fk(13, this.ueL);
      paramVarArgs.fk(14, this.ueM);
      paramVarArgs.d(15, 8, this.ueN);
      if (this.ueO != null) {
        paramVarArgs.e(16, this.ueO);
      }
      paramVarArgs.fk(17, this.ueP);
      paramVarArgs.fk(18, this.ueQ);
      if (this.lTj != null) {
        paramVarArgs.e(19, this.lTj);
      }
      paramVarArgs.fk(20, this.ueR);
      paramVarArgs.fk(21, this.ueS);
      if (this.gCC != null) {
        paramVarArgs.e(22, this.gCC);
      }
      GMTrace.o(3977273933824L, 29633);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.jhi != null) {
        i = b.a.a.b.b.a.f(1, this.jhi) + 0;
      }
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.ueD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ueD);
      }
      paramInt = i;
      if (this.ueE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ueE);
      }
      i = paramInt + b.a.a.a.fh(5, this.gCx);
      paramInt = i;
      if (this.tQa != null) {
        paramInt = i + b.a.a.a.fj(6, this.tQa.aYq());
      }
      i = paramInt + b.a.a.a.fh(7, this.ueF) + b.a.a.a.fh(8, this.ueG);
      paramInt = i;
      if (this.ueH != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.ueH);
      }
      i = paramInt + b.a.a.a.fh(10, this.ueI);
      paramInt = i;
      if (this.ueJ != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.ueJ);
      }
      i = paramInt;
      if (this.ueK != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.ueK);
      }
      i = i + b.a.a.a.fh(13, this.ueL) + b.a.a.a.fh(14, this.ueM) + b.a.a.a.c(15, 8, this.ueN);
      paramInt = i;
      if (this.ueO != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.ueO);
      }
      i = paramInt + b.a.a.a.fh(17, this.ueP) + b.a.a.a.fh(18, this.ueQ);
      paramInt = i;
      if (this.lTj != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.lTj);
      }
      i = paramInt + b.a.a.a.fh(20, this.ueR) + b.a.a.a.fh(21, this.ueS);
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.gCC);
      }
      GMTrace.o(3977273933824L, 29633);
      return paramInt;
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
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(3977273933824L, 29633);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nx localnx = (nx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977273933824L, 29633);
        return -1;
      case 1: 
        localnx.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 2: 
        localnx.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 3: 
        localnx.ueD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 4: 
        localnx.ueE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 5: 
        localnx.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
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
          localnx.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 7: 
        localnx.ueF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 8: 
        localnx.ueG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 9: 
        localnx.ueH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 10: 
        localnx.ueI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 11: 
        localnx.ueJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 12: 
        localnx.ueK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 13: 
        localnx.ueL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 14: 
        localnx.ueM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
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
          localnx.ueN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 16: 
        localnx.ueO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 17: 
        localnx.ueP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 18: 
        localnx.ueQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 19: 
        localnx.lTj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 20: 
        localnx.ueR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 21: 
        localnx.ueS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      }
      localnx.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3977273933824L, 29633);
      return 0;
    }
    GMTrace.o(3977273933824L, 29633);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */