package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class v
  extends azh
{
  public int jWs;
  public String jWt;
  public int state;
  public String tLZ;
  public int tMA;
  public long tMB;
  public int tMC;
  public int tMD;
  public int tME;
  public int tMF;
  public long tMG;
  public long tMH;
  public long tMI;
  public int tMJ;
  public String tMK;
  public int tML;
  public long tMM;
  public LinkedList<t> tMe;
  public int tMk;
  public String tMu;
  public String tMy;
  public long tMz;
  public String title;
  public int type;
  
  public v()
  {
    GMTrace.i(3696087793664L, 27538);
    this.jWs = 268513600;
    this.jWt = "请求不成功，请稍候再试";
    this.tMe = new LinkedList();
    GMTrace.o(3696087793664L, 27538);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3696222011392L, 27539);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.tLZ != null) {
        paramVarArgs.e(4, this.tLZ);
      }
      if (this.title != null) {
        paramVarArgs.e(5, this.title);
      }
      paramVarArgs.fk(6, this.type);
      if (this.tMy != null) {
        paramVarArgs.e(7, this.tMy);
      }
      paramVarArgs.T(8, this.tMz);
      paramVarArgs.fk(9, this.tMA);
      paramVarArgs.T(10, this.tMB);
      paramVarArgs.fk(11, this.tMC);
      paramVarArgs.fk(12, this.state);
      paramVarArgs.fk(13, this.tMD);
      paramVarArgs.fk(14, this.tME);
      paramVarArgs.fk(15, this.tMk);
      paramVarArgs.fk(16, this.tMF);
      paramVarArgs.T(17, this.tMG);
      paramVarArgs.T(18, this.tMH);
      paramVarArgs.T(19, this.tMI);
      paramVarArgs.fk(20, this.tMJ);
      if (this.tMu != null) {
        paramVarArgs.e(21, this.tMu);
      }
      paramVarArgs.d(22, 8, this.tMe);
      if (this.tMK != null) {
        paramVarArgs.e(23, this.tMK);
      }
      paramVarArgs.fk(24, this.tML);
      paramVarArgs.T(25, this.tMM);
      GMTrace.o(3696222011392L, 27539);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.tLZ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tLZ);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.title);
      }
      i = paramInt + b.a.a.a.fh(6, this.type);
      paramInt = i;
      if (this.tMy != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tMy);
      }
      i = paramInt + b.a.a.a.S(8, this.tMz) + b.a.a.a.fh(9, this.tMA) + b.a.a.a.S(10, this.tMB) + b.a.a.a.fh(11, this.tMC) + b.a.a.a.fh(12, this.state) + b.a.a.a.fh(13, this.tMD) + b.a.a.a.fh(14, this.tME) + b.a.a.a.fh(15, this.tMk) + b.a.a.a.fh(16, this.tMF) + b.a.a.a.S(17, this.tMG) + b.a.a.a.S(18, this.tMH) + b.a.a.a.S(19, this.tMI) + b.a.a.a.fh(20, this.tMJ);
      paramInt = i;
      if (this.tMu != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.tMu);
      }
      i = paramInt + b.a.a.a.c(22, 8, this.tMe);
      paramInt = i;
      if (this.tMK != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.tMK);
      }
      i = b.a.a.a.fh(24, this.tML);
      int j = b.a.a.a.S(25, this.tMM);
      GMTrace.o(3696222011392L, 27539);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tMe.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3696222011392L, 27539);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      v localv = (v)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3696222011392L, 27539);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localv.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 2: 
        localv.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 3: 
        localv.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 4: 
        localv.tLZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 5: 
        localv.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 6: 
        localv.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 7: 
        localv.tMy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 8: 
        localv.tMz = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 9: 
        localv.tMA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 10: 
        localv.tMB = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 11: 
        localv.tMC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 12: 
        localv.state = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 13: 
        localv.tMD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 14: 
        localv.tME = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 15: 
        localv.tMk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 16: 
        localv.tMF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 17: 
        localv.tMG = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 18: 
        localv.tMH = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 19: 
        localv.tMI = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 20: 
        localv.tMJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 21: 
        localv.tMu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new t();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((t)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localv.tMe.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 23: 
        localv.tMK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 24: 
        localv.tML = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      }
      localv.tMM = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3696222011392L, 27539);
      return 0;
    }
    GMTrace.o(3696222011392L, 27539);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */