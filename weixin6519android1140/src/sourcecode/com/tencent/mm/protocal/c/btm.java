package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btm
  extends com.tencent.mm.bm.a
{
  public bil gRv;
  public String kBh;
  public int tOG;
  public int tWu;
  public long tXu;
  public String tXx;
  public all uBS;
  public int uMX;
  public LinkedList<bms> uOk;
  public String unf;
  public int vaT;
  public int vaU;
  public String vaX;
  public int vca;
  public LinkedList<nq> vcb;
  public String vcg;
  public String vch;
  public int vci;
  public LinkedList<String> vcj;
  public LinkedList<aqm> vck;
  public com.tencent.mm.bm.b vcl;
  public com.tencent.mm.bm.b vcm;
  public bez vcn;
  
  public btm()
  {
    GMTrace.i(3618778382336L, 26962);
    this.uOk = new LinkedList();
    this.vcj = new LinkedList();
    this.vaU = 2;
    this.vcb = new LinkedList();
    this.vck = new LinkedList();
    GMTrace.o(3618778382336L, 26962);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3618912600064L, 26963);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.unf == null) {
        throw new b.a.a.b("Not all required fields were included: Keyword");
      }
      paramVarArgs.fk(1, this.uMX);
      if (this.unf != null) {
        paramVarArgs.e(2, this.unf);
      }
      paramVarArgs.fk(3, this.tWu);
      paramVarArgs.T(4, this.tXu);
      paramVarArgs.fk(5, this.vaT);
      if (this.uBS != null)
      {
        paramVarArgs.fm(6, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      paramVarArgs.d(7, 8, this.uOk);
      paramVarArgs.fk(8, this.tOG);
      if (this.tXx != null) {
        paramVarArgs.e(9, this.tXx);
      }
      paramVarArgs.fk(10, this.vca);
      if (this.vcg != null) {
        paramVarArgs.e(11, this.vcg);
      }
      if (this.vch != null) {
        paramVarArgs.e(12, this.vch);
      }
      paramVarArgs.fk(13, this.vci);
      paramVarArgs.d(14, 1, this.vcj);
      paramVarArgs.fk(15, this.vaU);
      if (this.gRv != null)
      {
        paramVarArgs.fm(16, this.gRv.aYq());
        this.gRv.a(paramVarArgs);
      }
      paramVarArgs.d(17, 8, this.vcb);
      paramVarArgs.d(18, 8, this.vck);
      if (this.kBh != null) {
        paramVarArgs.e(19, this.kBh);
      }
      if (this.vcl != null) {
        paramVarArgs.b(20, this.vcl);
      }
      if (this.vaX != null) {
        paramVarArgs.e(21, this.vaX);
      }
      if (this.vcm != null) {
        paramVarArgs.b(22, this.vcm);
      }
      if (this.vcn != null)
      {
        paramVarArgs.fm(23, this.vcn.aYq());
        this.vcn.a(paramVarArgs);
      }
      GMTrace.o(3618912600064L, 26963);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uMX) + 0;
      paramInt = i;
      if (this.unf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.unf);
      }
      i = paramInt + b.a.a.a.fh(3, this.tWu) + b.a.a.a.S(4, this.tXu) + b.a.a.a.fh(5, this.vaT);
      paramInt = i;
      if (this.uBS != null) {
        paramInt = i + b.a.a.a.fj(6, this.uBS.aYq());
      }
      i = paramInt + b.a.a.a.c(7, 8, this.uOk) + b.a.a.a.fh(8, this.tOG);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tXx);
      }
      i = paramInt + b.a.a.a.fh(10, this.vca);
      paramInt = i;
      if (this.vcg != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.vcg);
      }
      i = paramInt;
      if (this.vch != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.vch);
      }
      i = i + b.a.a.a.fh(13, this.vci) + b.a.a.a.c(14, 1, this.vcj) + b.a.a.a.fh(15, this.vaU);
      paramInt = i;
      if (this.gRv != null) {
        paramInt = i + b.a.a.a.fj(16, this.gRv.aYq());
      }
      i = paramInt + b.a.a.a.c(17, 8, this.vcb) + b.a.a.a.c(18, 8, this.vck);
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.kBh);
      }
      i = paramInt;
      if (this.vcl != null) {
        i = paramInt + b.a.a.a.a(20, this.vcl);
      }
      paramInt = i;
      if (this.vaX != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.vaX);
      }
      i = paramInt;
      if (this.vcm != null) {
        i = paramInt + b.a.a.a.a(22, this.vcm);
      }
      paramInt = i;
      if (this.vcn != null) {
        paramInt = i + b.a.a.a.fj(23, this.vcn.aYq());
      }
      GMTrace.o(3618912600064L, 26963);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uOk.clear();
      this.vcj.clear();
      this.vcb.clear();
      this.vck.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.unf == null) {
        throw new b.a.a.b("Not all required fields were included: Keyword");
      }
      GMTrace.o(3618912600064L, 26963);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btm localbtm = (btm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3618912600064L, 26963);
        return -1;
      case 1: 
        localbtm.uMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 2: 
        localbtm.unf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 3: 
        localbtm.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 4: 
        localbtm.tXu = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 5: 
        localbtm.vaT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new all();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtm.uBS = ((all)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bms();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bms)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtm.uOk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 8: 
        localbtm.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 9: 
        localbtm.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 10: 
        localbtm.vca = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 11: 
        localbtm.vcg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 12: 
        localbtm.vch = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 13: 
        localbtm.vci = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 14: 
        localbtm.vcj.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 15: 
        localbtm.vaU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bil();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bil)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtm.gRv = ((bil)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtm.vcb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtm.vck.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 19: 
        localbtm.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 20: 
        localbtm.vcl = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 21: 
        localbtm.vaX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      case 22: 
        localbtm.vcm = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3618912600064L, 26963);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bez();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bez)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbtm.vcn = ((bez)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3618912600064L, 26963);
      return 0;
    }
    GMTrace.o(3618912600064L, 26963);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */