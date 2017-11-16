package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bma
  extends ayx
{
  public int lQc;
  public azq tPW;
  public azq tPX;
  public String tQb;
  public int tRC;
  public int tRD;
  public int tRE;
  public String tYF;
  public int tYG;
  public int tYH;
  public int tYI;
  public int uOI;
  public int uSf;
  public azq uVR;
  public String uVS;
  public String uVT;
  public int uVU;
  public int uVV;
  public String uVW;
  public int uVX;
  public int uVY;
  public int uVZ;
  public int udE;
  public azp ues;
  public int ugP;
  public String ugf;
  public String ugy;
  public int usj;
  public String uxt;
  
  public bma()
  {
    GMTrace.i(3686021464064L, 27463);
    GMTrace.o(3686021464064L, 27463);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3686155681792L, 27464);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uVR == null) {
        throw new b("Not all required fields were included: ClientImgId");
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uVR != null)
      {
        paramVarArgs.fm(2, this.uVR.aYq());
        this.uVR.a(paramVarArgs);
      }
      if (this.tPW != null)
      {
        paramVarArgs.fm(3, this.tPW.aYq());
        this.tPW.a(paramVarArgs);
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(4, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tRC);
      paramVarArgs.fk(6, this.tRD);
      paramVarArgs.fk(7, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(8, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.lQc);
      if (this.tQb != null) {
        paramVarArgs.e(10, this.tQb);
      }
      paramVarArgs.fk(11, this.usj);
      paramVarArgs.fk(12, this.udE);
      paramVarArgs.fk(13, this.uSf);
      if (this.ugf != null) {
        paramVarArgs.e(14, this.ugf);
      }
      if (this.uVS != null) {
        paramVarArgs.e(15, this.uVS);
      }
      if (this.uVT != null) {
        paramVarArgs.e(16, this.uVT);
      }
      if (this.tYF != null) {
        paramVarArgs.e(17, this.tYF);
      }
      paramVarArgs.fk(18, this.tYG);
      paramVarArgs.fk(19, this.uVU);
      paramVarArgs.fk(20, this.uVV);
      if (this.uVW != null) {
        paramVarArgs.e(21, this.uVW);
      }
      paramVarArgs.fk(22, this.uVX);
      paramVarArgs.fk(23, this.uVY);
      paramVarArgs.fk(24, this.uVZ);
      if (this.uxt != null) {
        paramVarArgs.e(25, this.uxt);
      }
      paramVarArgs.fk(26, this.ugP);
      if (this.ugy != null) {
        paramVarArgs.e(27, this.ugy);
      }
      paramVarArgs.fk(28, this.tYH);
      paramVarArgs.fk(29, this.tYI);
      paramVarArgs.fk(30, this.uOI);
      GMTrace.o(3686155681792L, 27464);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uVR != null) {
        paramInt = i + b.a.a.a.fj(2, this.uVR.aYq());
      }
      i = paramInt;
      if (this.tPW != null) {
        i = paramInt + b.a.a.a.fj(3, this.tPW.aYq());
      }
      paramInt = i;
      if (this.tPX != null) {
        paramInt = i + b.a.a.a.fj(4, this.tPX.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.tRC) + b.a.a.a.fh(6, this.tRD) + b.a.a.a.fh(7, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(8, this.ues.aYq());
      }
      i = paramInt + b.a.a.a.fh(9, this.lQc);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tQb);
      }
      i = paramInt + b.a.a.a.fh(11, this.usj) + b.a.a.a.fh(12, this.udE) + b.a.a.a.fh(13, this.uSf);
      paramInt = i;
      if (this.ugf != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.ugf);
      }
      i = paramInt;
      if (this.uVS != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uVS);
      }
      paramInt = i;
      if (this.uVT != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.uVT);
      }
      i = paramInt;
      if (this.tYF != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.tYF);
      }
      i = i + b.a.a.a.fh(18, this.tYG) + b.a.a.a.fh(19, this.uVU) + b.a.a.a.fh(20, this.uVV);
      paramInt = i;
      if (this.uVW != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.uVW);
      }
      i = paramInt + b.a.a.a.fh(22, this.uVX) + b.a.a.a.fh(23, this.uVY) + b.a.a.a.fh(24, this.uVZ);
      paramInt = i;
      if (this.uxt != null) {
        paramInt = i + b.a.a.b.b.a.f(25, this.uxt);
      }
      i = paramInt + b.a.a.a.fh(26, this.ugP);
      paramInt = i;
      if (this.ugy != null) {
        paramInt = i + b.a.a.b.b.a.f(27, this.ugy);
      }
      i = b.a.a.a.fh(28, this.tYH);
      int j = b.a.a.a.fh(29, this.tYI);
      int k = b.a.a.a.fh(30, this.uOI);
      GMTrace.o(3686155681792L, 27464);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uVR == null) {
        throw new b("Not all required fields were included: ClientImgId");
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3686155681792L, 27464);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bma localbma = (bma)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3686155681792L, 27464);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbma.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3686155681792L, 27464);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbma.uVR = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3686155681792L, 27464);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbma.tPW = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3686155681792L, 27464);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbma.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 5: 
        localbma.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 6: 
        localbma.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 7: 
        localbma.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbma.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 9: 
        localbma.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 10: 
        localbma.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 11: 
        localbma.usj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 12: 
        localbma.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 13: 
        localbma.uSf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 14: 
        localbma.ugf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 15: 
        localbma.uVS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 16: 
        localbma.uVT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 17: 
        localbma.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 18: 
        localbma.tYG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 19: 
        localbma.uVU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 20: 
        localbma.uVV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 21: 
        localbma.uVW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 22: 
        localbma.uVX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 23: 
        localbma.uVY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 24: 
        localbma.uVZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 25: 
        localbma.uxt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 26: 
        localbma.ugP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 27: 
        localbma.ugy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 28: 
        localbma.tYH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      case 29: 
        localbma.tYI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3686155681792L, 27464);
        return 0;
      }
      localbma.uOI = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3686155681792L, 27464);
      return 0;
    }
    GMTrace.o(3686155681792L, 27464);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */