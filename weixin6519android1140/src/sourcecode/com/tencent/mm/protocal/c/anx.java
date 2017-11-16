package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anx
  extends com.tencent.mm.bm.a
{
  public String eDW;
  public int eGH;
  public String eSd;
  public int gsq;
  public int iZe;
  public String lPj;
  public String token;
  public int uCQ;
  public anr uDH;
  public int uDI;
  public LinkedList<anr> uDJ;
  public int uDK;
  public String uDL;
  public String uDM;
  public String uDN;
  public anf uDO;
  public int uDP;
  public String uDj;
  public int uDk;
  public int uDl;
  public int uDt;
  public String uDu;
  public String videoPath;
  
  public anx()
  {
    GMTrace.i(3974186926080L, 29610);
    this.uDJ = new LinkedList();
    GMTrace.o(3974186926080L, 29610);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3974321143808L, 29611);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uDk);
      paramVarArgs.fk(2, this.uDl);
      paramVarArgs.fk(3, this.uCQ);
      if (this.uDH != null)
      {
        paramVarArgs.fm(4, this.uDH.aYq());
        this.uDH.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uDI);
      paramVarArgs.d(6, 8, this.uDJ);
      paramVarArgs.fk(7, this.gsq);
      paramVarArgs.fk(8, this.uDK);
      if (this.lPj != null) {
        paramVarArgs.e(9, this.lPj);
      }
      if (this.uDL != null) {
        paramVarArgs.e(10, this.uDL);
      }
      if (this.token != null) {
        paramVarArgs.e(11, this.token);
      }
      if (this.uDu != null) {
        paramVarArgs.e(12, this.uDu);
      }
      paramVarArgs.fk(13, this.uDt);
      if (this.videoPath != null) {
        paramVarArgs.e(14, this.videoPath);
      }
      if (this.uDM != null) {
        paramVarArgs.e(15, this.uDM);
      }
      if (this.uDN != null) {
        paramVarArgs.e(16, this.uDN);
      }
      if (this.eDW != null) {
        paramVarArgs.e(17, this.eDW);
      }
      if (this.eSd != null) {
        paramVarArgs.e(18, this.eSd);
      }
      paramVarArgs.fk(19, this.iZe);
      paramVarArgs.fk(20, this.eGH);
      if (this.uDj != null) {
        paramVarArgs.e(21, this.uDj);
      }
      if (this.uDO != null)
      {
        paramVarArgs.fm(22, this.uDO.aYq());
        this.uDO.a(paramVarArgs);
      }
      paramVarArgs.fk(23, this.uDP);
      GMTrace.o(3974321143808L, 29611);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uDk) + 0 + b.a.a.a.fh(2, this.uDl) + b.a.a.a.fh(3, this.uCQ);
      paramInt = i;
      if (this.uDH != null) {
        paramInt = i + b.a.a.a.fj(4, this.uDH.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.uDI) + b.a.a.a.c(6, 8, this.uDJ) + b.a.a.a.fh(7, this.gsq) + b.a.a.a.fh(8, this.uDK);
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.lPj);
      }
      i = paramInt;
      if (this.uDL != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uDL);
      }
      paramInt = i;
      if (this.token != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.token);
      }
      i = paramInt;
      if (this.uDu != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uDu);
      }
      i += b.a.a.a.fh(13, this.uDt);
      paramInt = i;
      if (this.videoPath != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.videoPath);
      }
      i = paramInt;
      if (this.uDM != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uDM);
      }
      paramInt = i;
      if (this.uDN != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.uDN);
      }
      i = paramInt;
      if (this.eDW != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.eDW);
      }
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.eSd);
      }
      i = paramInt + b.a.a.a.fh(19, this.iZe) + b.a.a.a.fh(20, this.eGH);
      paramInt = i;
      if (this.uDj != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.uDj);
      }
      i = paramInt;
      if (this.uDO != null) {
        i = paramInt + b.a.a.a.fj(22, this.uDO.aYq());
      }
      paramInt = b.a.a.a.fh(23, this.uDP);
      GMTrace.o(3974321143808L, 29611);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uDJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3974321143808L, 29611);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anx localanx = (anx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3974321143808L, 29611);
        return -1;
      case 1: 
        localanx.uDk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 2: 
        localanx.uDl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 3: 
        localanx.uCQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((anr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanx.uDH = ((anr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 5: 
        localanx.uDI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((anr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanx.uDJ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 7: 
        localanx.gsq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 8: 
        localanx.uDK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 9: 
        localanx.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 10: 
        localanx.uDL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 11: 
        localanx.token = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 12: 
        localanx.uDu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 13: 
        localanx.uDt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 14: 
        localanx.videoPath = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 15: 
        localanx.uDM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 16: 
        localanx.uDN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 17: 
        localanx.eDW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 18: 
        localanx.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 19: 
        localanx.iZe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 20: 
        localanx.eGH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 21: 
        localanx.uDj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((anf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanx.uDO = ((anf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3974321143808L, 29611);
        return 0;
      }
      localanx.uDP = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3974321143808L, 29611);
      return 0;
    }
    GMTrace.o(3974321143808L, 29611);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\anx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */