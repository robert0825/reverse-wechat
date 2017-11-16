package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anv
  extends com.tencent.mm.bm.a
{
  public String eDA;
  public String eTu;
  public int eYn;
  public int gsq;
  public String tPP;
  public String token;
  public int uCQ;
  public long uDA;
  public String uDB;
  public boolean uDC;
  public bes uDD;
  public int uDk;
  public int uDl;
  public LinkedList<amb> uDm;
  public LinkedList<bgp> uDn;
  public int uDo;
  public long uDp;
  public int uDq;
  public LinkedList<Long> uDr;
  public int uDs;
  public int uDt;
  public String uDu;
  public int uDv;
  public LinkedList<azq> uDw;
  public bfr uDx;
  public LinkedList<bfx> uDy;
  public String uDz;
  public String ugx;
  
  public anv()
  {
    GMTrace.i(3699443236864L, 27563);
    this.uDm = new LinkedList();
    this.uDn = new LinkedList();
    this.uDr = new LinkedList();
    this.uDw = new LinkedList();
    this.uDy = new LinkedList();
    GMTrace.o(3699443236864L, 27563);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3699577454592L, 27564);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uDk);
      paramVarArgs.fk(2, this.uDl);
      paramVarArgs.fk(3, this.uCQ);
      if (this.tPP != null) {
        paramVarArgs.e(4, this.tPP);
      }
      paramVarArgs.d(5, 8, this.uDm);
      paramVarArgs.d(6, 8, this.uDn);
      paramVarArgs.fk(7, this.uDo);
      paramVarArgs.fk(8, this.gsq);
      paramVarArgs.T(9, this.uDp);
      paramVarArgs.fk(10, this.uDq);
      paramVarArgs.d(11, 3, this.uDr);
      paramVarArgs.fk(12, this.uDs);
      paramVarArgs.fk(13, this.uDt);
      if (this.token != null) {
        paramVarArgs.e(14, this.token);
      }
      if (this.uDu != null) {
        paramVarArgs.e(15, this.uDu);
      }
      paramVarArgs.fk(16, this.uDv);
      paramVarArgs.d(17, 8, this.uDw);
      if (this.uDx != null)
      {
        paramVarArgs.fm(18, this.uDx.aYq());
        this.uDx.a(paramVarArgs);
      }
      if (this.eTu != null) {
        paramVarArgs.e(19, this.eTu);
      }
      paramVarArgs.d(20, 8, this.uDy);
      if (this.eDA != null) {
        paramVarArgs.e(21, this.eDA);
      }
      if (this.uDz != null) {
        paramVarArgs.e(22, this.uDz);
      }
      if (this.ugx != null) {
        paramVarArgs.e(23, this.ugx);
      }
      paramVarArgs.fk(24, this.eYn);
      paramVarArgs.T(25, this.uDA);
      if (this.uDB != null) {
        paramVarArgs.e(26, this.uDB);
      }
      paramVarArgs.ah(27, this.uDC);
      if (this.uDD != null)
      {
        paramVarArgs.fm(28, this.uDD.aYq());
        this.uDD.a(paramVarArgs);
      }
      GMTrace.o(3699577454592L, 27564);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uDk) + 0 + b.a.a.a.fh(2, this.uDl) + b.a.a.a.fh(3, this.uCQ);
      paramInt = i;
      if (this.tPP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tPP);
      }
      i = paramInt + b.a.a.a.c(5, 8, this.uDm) + b.a.a.a.c(6, 8, this.uDn) + b.a.a.a.fh(7, this.uDo) + b.a.a.a.fh(8, this.gsq) + b.a.a.a.S(9, this.uDp) + b.a.a.a.fh(10, this.uDq) + b.a.a.a.c(11, 3, this.uDr) + b.a.a.a.fh(12, this.uDs) + b.a.a.a.fh(13, this.uDt);
      paramInt = i;
      if (this.token != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.token);
      }
      i = paramInt;
      if (this.uDu != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uDu);
      }
      i = i + b.a.a.a.fh(16, this.uDv) + b.a.a.a.c(17, 8, this.uDw);
      paramInt = i;
      if (this.uDx != null) {
        paramInt = i + b.a.a.a.fj(18, this.uDx.aYq());
      }
      i = paramInt;
      if (this.eTu != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.eTu);
      }
      i += b.a.a.a.c(20, 8, this.uDy);
      paramInt = i;
      if (this.eDA != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.eDA);
      }
      i = paramInt;
      if (this.uDz != null) {
        i = paramInt + b.a.a.b.b.a.f(22, this.uDz);
      }
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.ugx);
      }
      i = paramInt + b.a.a.a.fh(24, this.eYn) + b.a.a.a.S(25, this.uDA);
      paramInt = i;
      if (this.uDB != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.uDB);
      }
      i = paramInt + (b.a.a.b.b.a.cK(27) + 1);
      paramInt = i;
      if (this.uDD != null) {
        paramInt = i + b.a.a.a.fj(28, this.uDD.aYq());
      }
      GMTrace.o(3699577454592L, 27564);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uDm.clear();
      this.uDn.clear();
      this.uDr.clear();
      this.uDw.clear();
      this.uDy.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3699577454592L, 27564);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anv localanv = (anv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3699577454592L, 27564);
        return -1;
      case 1: 
        localanv.uDk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 2: 
        localanv.uDl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 3: 
        localanv.uCQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 4: 
        localanv.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanv.uDm.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanv.uDn.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 7: 
        localanv.uDo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 8: 
        localanv.gsq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 9: 
        localanv.uDp = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 10: 
        localanv.uDq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 11: 
        localanv.uDr.add(Long.valueOf(((b.a.a.a.a)localObject1).yqV.nk()));
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 12: 
        localanv.uDs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 13: 
        localanv.uDt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 14: 
        localanv.token = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 15: 
        localanv.uDu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 16: 
        localanv.uDv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanv.uDw.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanv.uDx = ((bfr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 19: 
        localanv.eTu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanv.uDy.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 21: 
        localanv.eDA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 22: 
        localanv.uDz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 23: 
        localanv.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 24: 
        localanv.eYn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 25: 
        localanv.uDA = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 26: 
        localanv.uDB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      case 27: 
        localanv.uDC = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3699577454592L, 27564);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bes();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bes)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localanv.uDD = ((bes)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3699577454592L, 27564);
      return 0;
    }
    GMTrace.o(3699577454592L, 27564);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\anv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */