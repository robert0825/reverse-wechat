package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class alj
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int jib;
  public String nuO;
  public float nuP;
  public int nuQ;
  public LinkedList<Integer> nuR;
  public int nuS;
  public LinkedList<azq> nuT;
  public float nuU;
  public String nuV;
  public azp nuW;
  public String uAD;
  public azp uAE;
  public int uAF;
  public int uAG;
  
  public alj()
  {
    GMTrace.i(3939021881344L, 29348);
    this.nuR = new LinkedList();
    this.nuT = new LinkedList();
    GMTrace.o(3939021881344L, 29348);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3939156099072L, 29349);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nuO != null) {
        paramVarArgs.e(1, this.nuO);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      paramVarArgs.n(3, this.nuP);
      paramVarArgs.fk(4, this.nuQ);
      paramVarArgs.c(5, this.nuR);
      paramVarArgs.fk(6, this.nuS);
      paramVarArgs.d(7, 8, this.nuT);
      paramVarArgs.n(8, this.nuU);
      if (this.nuV != null) {
        paramVarArgs.e(9, this.nuV);
      }
      paramVarArgs.fk(10, this.jib);
      if (this.nuW != null)
      {
        paramVarArgs.fm(11, this.nuW.aYq());
        this.nuW.a(paramVarArgs);
      }
      if (this.uAD != null) {
        paramVarArgs.e(12, this.uAD);
      }
      if (this.uAE != null)
      {
        paramVarArgs.fm(13, this.uAE.aYq());
        this.uAE.a(paramVarArgs);
      }
      paramVarArgs.fk(14, this.uAF);
      paramVarArgs.fk(15, this.uAG);
      GMTrace.o(3939156099072L, 29349);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nuO != null) {
        paramInt = b.a.a.b.b.a.f(1, this.nuO) + 0;
      }
      i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = i + (b.a.a.b.b.a.cK(3) + 4) + b.a.a.a.fh(4, this.nuQ) + b.a.a.a.b(5, this.nuR) + b.a.a.a.fh(6, this.nuS) + b.a.a.a.c(7, 8, this.nuT) + (b.a.a.b.b.a.cK(8) + 4);
      paramInt = i;
      if (this.nuV != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.nuV);
      }
      i = paramInt + b.a.a.a.fh(10, this.jib);
      paramInt = i;
      if (this.nuW != null) {
        paramInt = i + b.a.a.a.fj(11, this.nuW.aYq());
      }
      i = paramInt;
      if (this.uAD != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uAD);
      }
      paramInt = i;
      if (this.uAE != null) {
        paramInt = i + b.a.a.a.fj(13, this.uAE.aYq());
      }
      i = b.a.a.a.fh(14, this.uAF);
      int j = b.a.a.a.fh(15, this.uAG);
      GMTrace.o(3939156099072L, 29349);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nuR.clear();
      this.nuT.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3939156099072L, 29349);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      alj localalj = (alj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3939156099072L, 29349);
        return -1;
      case 1: 
        localalj.nuO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 2: 
        localalj.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 3: 
        localalj.nuP = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 4: 
        localalj.nuQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 5: 
        localalj.nuR = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 6: 
        localalj.nuS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localalj.nuT.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 8: 
        localalj.nuU = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 9: 
        localalj.nuV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 10: 
        localalj.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localalj.nuW = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 12: 
        localalj.uAD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localalj.uAE = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3939156099072L, 29349);
        return 0;
      case 14: 
        localalj.uAF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3939156099072L, 29349);
        return 0;
      }
      localalj.uAG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3939156099072L, 29349);
      return 0;
    }
    GMTrace.o(3939156099072L, 29349);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\alj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */