package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmq
  extends com.tencent.mm.bm.a
{
  public String fjy;
  public String gCH;
  public int tOy;
  public alv tQk;
  public azt tUX;
  public String tUq;
  public bgm uAB;
  public String uEv;
  public String uEw;
  public String uWC;
  public String uWD;
  public int uWE;
  public int uWF;
  public int uWG;
  public String uWH;
  public int uWI;
  public azq uWJ;
  public int uWK;
  public String uWL;
  public String uWM;
  public String uWN;
  public String uWO;
  public String uWP;
  public asd uWQ;
  public String uWR;
  public int uWS;
  public long uWT;
  public String uWU;
  public String ubV;
  public String ubW;
  public int unV;
  
  public bmq()
  {
    GMTrace.i(13169040818176L, 98117);
    GMTrace.o(13169040818176L, 98117);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13169175035904L, 98118);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uAB == null) {
        throw new b("Not all required fields were included: SnsUserInfo");
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(1, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCH != null) {
        paramVarArgs.e(2, this.gCH);
      }
      if (this.uWC != null) {
        paramVarArgs.e(3, this.uWC);
      }
      if (this.uWD != null) {
        paramVarArgs.e(4, this.uWD);
      }
      paramVarArgs.fk(5, this.uWE);
      paramVarArgs.fk(6, this.uWF);
      paramVarArgs.fk(7, this.uWG);
      if (this.uWH != null) {
        paramVarArgs.e(8, this.uWH);
      }
      if (this.ubV != null) {
        paramVarArgs.e(9, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(10, this.ubW);
      }
      paramVarArgs.fk(11, this.uWI);
      if (this.uWJ != null)
      {
        paramVarArgs.fm(12, this.uWJ.aYq());
        this.uWJ.a(paramVarArgs);
      }
      if (this.tUX != null)
      {
        paramVarArgs.fm(13, this.tUX.aYq());
        this.tUX.a(paramVarArgs);
      }
      paramVarArgs.fk(14, this.tOy);
      paramVarArgs.fk(15, this.uWK);
      if (this.tUq != null) {
        paramVarArgs.e(16, this.tUq);
      }
      if (this.uEv != null) {
        paramVarArgs.e(17, this.uEv);
      }
      if (this.uEw != null) {
        paramVarArgs.e(18, this.uEw);
      }
      if (this.uWL != null) {
        paramVarArgs.e(19, this.uWL);
      }
      if (this.uWM != null) {
        paramVarArgs.e(20, this.uWM);
      }
      if (this.uWN != null) {
        paramVarArgs.e(21, this.uWN);
      }
      if (this.uWO != null) {
        paramVarArgs.e(22, this.uWO);
      }
      if (this.tQk != null)
      {
        paramVarArgs.fm(23, this.tQk.aYq());
        this.tQk.a(paramVarArgs);
      }
      if (this.uWP != null) {
        paramVarArgs.e(24, this.uWP);
      }
      if (this.uWQ != null)
      {
        paramVarArgs.fm(25, this.uWQ.aYq());
        this.uWQ.a(paramVarArgs);
      }
      if (this.uWR != null) {
        paramVarArgs.e(26, this.uWR);
      }
      paramVarArgs.fk(27, this.uWS);
      if (this.fjy != null) {
        paramVarArgs.e(28, this.fjy);
      }
      paramVarArgs.fk(29, this.unV);
      paramVarArgs.T(30, this.uWT);
      if (this.uWU != null) {
        paramVarArgs.e(31, this.uWU);
      }
      GMTrace.o(13169175035904L, 98118);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uAB != null) {
        i = b.a.a.a.fj(1, this.uAB.aYq()) + 0;
      }
      paramInt = i;
      if (this.gCH != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.gCH);
      }
      i = paramInt;
      if (this.uWC != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uWC);
      }
      paramInt = i;
      if (this.uWD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uWD);
      }
      i = paramInt + b.a.a.a.fh(5, this.uWE) + b.a.a.a.fh(6, this.uWF) + b.a.a.a.fh(7, this.uWG);
      paramInt = i;
      if (this.uWH != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uWH);
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ubW);
      }
      i = paramInt + b.a.a.a.fh(11, this.uWI);
      paramInt = i;
      if (this.uWJ != null) {
        paramInt = i + b.a.a.a.fj(12, this.uWJ.aYq());
      }
      i = paramInt;
      if (this.tUX != null) {
        i = paramInt + b.a.a.a.fj(13, this.tUX.aYq());
      }
      i = i + b.a.a.a.fh(14, this.tOy) + b.a.a.a.fh(15, this.uWK);
      paramInt = i;
      if (this.tUq != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tUq);
      }
      i = paramInt;
      if (this.uEv != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.uEv);
      }
      paramInt = i;
      if (this.uEw != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uEw);
      }
      i = paramInt;
      if (this.uWL != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.uWL);
      }
      paramInt = i;
      if (this.uWM != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.uWM);
      }
      i = paramInt;
      if (this.uWN != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.uWN);
      }
      paramInt = i;
      if (this.uWO != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.uWO);
      }
      i = paramInt;
      if (this.tQk != null) {
        i = paramInt + b.a.a.a.fj(23, this.tQk.aYq());
      }
      paramInt = i;
      if (this.uWP != null) {
        paramInt = i + b.a.a.b.b.a.f(24, this.uWP);
      }
      i = paramInt;
      if (this.uWQ != null) {
        i = paramInt + b.a.a.a.fj(25, this.uWQ.aYq());
      }
      paramInt = i;
      if (this.uWR != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.uWR);
      }
      i = paramInt + b.a.a.a.fh(27, this.uWS);
      paramInt = i;
      if (this.fjy != null) {
        paramInt = i + b.a.a.b.b.a.f(28, this.fjy);
      }
      i = paramInt + b.a.a.a.fh(29, this.unV) + b.a.a.a.S(30, this.uWT);
      paramInt = i;
      if (this.uWU != null) {
        paramInt = i + b.a.a.b.b.a.f(31, this.uWU);
      }
      GMTrace.o(13169175035904L, 98118);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uAB == null) {
        throw new b("Not all required fields were included: SnsUserInfo");
      }
      GMTrace.o(13169175035904L, 98118);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmq localbmq = (bmq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13169175035904L, 98118);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmq.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 2: 
        localbmq.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 3: 
        localbmq.uWC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 4: 
        localbmq.uWD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 5: 
        localbmq.uWE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 6: 
        localbmq.uWF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 7: 
        localbmq.uWG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 8: 
        localbmq.uWH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 9: 
        localbmq.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 10: 
        localbmq.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 11: 
        localbmq.uWI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmq.uWJ = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmq.tUX = ((azt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 14: 
        localbmq.tOy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 15: 
        localbmq.uWK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 16: 
        localbmq.tUq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 17: 
        localbmq.uEv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 18: 
        localbmq.uEw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 19: 
        localbmq.uWL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 20: 
        localbmq.uWM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 21: 
        localbmq.uWN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 22: 
        localbmq.uWO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmq.tQk = ((alv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 24: 
        localbmq.uWP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 25: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new asd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((asd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmq.uWQ = ((asd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 26: 
        localbmq.uWR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 27: 
        localbmq.uWS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 28: 
        localbmq.fjy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 29: 
        localbmq.unV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      case 30: 
        localbmq.uWT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(13169175035904L, 98118);
        return 0;
      }
      localbmq.uWU = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13169175035904L, 98118);
      return 0;
    }
    GMTrace.o(13169175035904L, 98118);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */