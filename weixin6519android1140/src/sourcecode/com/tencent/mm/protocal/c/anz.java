package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anz
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public int gCB;
  public String gCG;
  public int gCx;
  public String gCy;
  public String gCz;
  public int uAv;
  public String uAw;
  public int uDQ;
  public azq uDR;
  public azq uDS;
  public azq uDT;
  public int ueL;
  public azq ufE;
  public azq ufo;
  public azq ufp;
  public azq uxT;
  
  public anz()
  {
    GMTrace.i(3827084296192L, 28514);
    GMTrace.o(3827084296192L, 28514);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3827218513920L, 28515);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufE == null) {
        throw new b("Not all required fields were included: MemberName");
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
      if (this.uDR == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.uDS == null) {
        throw new b("Not all required fields were included: RemarkPYInitial");
      }
      if (this.uDT == null) {
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      if (this.ufE != null)
      {
        paramVarArgs.fm(1, this.ufE.aYq());
        this.ufE.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uDQ);
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
      if (this.uDR != null)
      {
        paramVarArgs.fm(9, this.uDR.aYq());
        this.uDR.a(paramVarArgs);
      }
      if (this.uDS != null)
      {
        paramVarArgs.fm(10, this.uDS.aYq());
        this.uDS.a(paramVarArgs);
      }
      if (this.uDT != null)
      {
        paramVarArgs.fm(11, this.uDT.aYq());
        this.uDT.a(paramVarArgs);
      }
      paramVarArgs.fk(12, this.ueL);
      if (this.gCy != null) {
        paramVarArgs.e(13, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(14, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(15, this.gCA);
      }
      paramVarArgs.fk(16, this.gCB);
      paramVarArgs.fk(17, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(18, this.uAw);
      }
      if (this.gCG != null) {
        paramVarArgs.e(19, this.gCG);
      }
      GMTrace.o(3827218513920L, 28515);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ufE != null) {
        paramInt = b.a.a.a.fj(1, this.ufE.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uDQ);
      paramInt = i;
      if (this.uxT != null) {
        paramInt = i + b.a.a.a.fj(3, this.uxT.aYq());
      }
      i = paramInt;
      if (this.ufo != null) {
        i = paramInt + b.a.a.a.fj(4, this.ufo.aYq());
      }
      paramInt = i;
      if (this.ufp != null) {
        paramInt = i + b.a.a.a.fj(5, this.ufp.aYq());
      }
      i = paramInt + b.a.a.a.fh(6, this.gCx);
      paramInt = i;
      if (this.uDR != null) {
        paramInt = i + b.a.a.a.fj(9, this.uDR.aYq());
      }
      i = paramInt;
      if (this.uDS != null) {
        i = paramInt + b.a.a.a.fj(10, this.uDS.aYq());
      }
      paramInt = i;
      if (this.uDT != null) {
        paramInt = i + b.a.a.a.fj(11, this.uDT.aYq());
      }
      i = paramInt + b.a.a.a.fh(12, this.ueL);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(16, this.gCB) + b.a.a.a.fh(17, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uAw);
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.gCG);
      }
      GMTrace.o(3827218513920L, 28515);
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
      if (this.ufE == null) {
        throw new b("Not all required fields were included: MemberName");
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
      if (this.uDR == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.uDS == null) {
        throw new b("Not all required fields were included: RemarkPYInitial");
      }
      if (this.uDT == null) {
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      GMTrace.o(3827218513920L, 28515);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anz localanz = (anz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 7: 
      case 8: 
      default: 
        GMTrace.o(3827218513920L, 28515);
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
          localanz.ufE = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 2: 
        localanz.uDQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3827218513920L, 28515);
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
          localanz.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
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
          localanz.ufo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
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
          localanz.ufp = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 6: 
        localanz.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3827218513920L, 28515);
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
          localanz.uDR = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
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
          localanz.uDS = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
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
          localanz.uDT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 12: 
        localanz.ueL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 13: 
        localanz.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 14: 
        localanz.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 15: 
        localanz.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 16: 
        localanz.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 17: 
        localanz.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      case 18: 
        localanz.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3827218513920L, 28515);
        return 0;
      }
      localanz.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3827218513920L, 28515);
      return 0;
    }
    GMTrace.o(3827218513920L, 28515);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */