package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ze
  extends azh
{
  public String ID;
  public long jhw;
  public int jib;
  public int tOG;
  public azp tSB;
  public int tSN;
  public LinkedList<nu> tSO;
  public String tSP;
  public String tSQ;
  public String tSR;
  public int tSW;
  public String tSX;
  public String tSY;
  public String uqc;
  
  public ze()
  {
    GMTrace.i(4027337146368L, 30006);
    this.tSO = new LinkedList();
    GMTrace.o(4027337146368L, 30006);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4027471364096L, 30007);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.ID != null) {
        paramVarArgs.e(2, this.ID);
      }
      if (this.tSB != null)
      {
        paramVarArgs.fm(3, this.tSB.aYq());
        this.tSB.a(paramVarArgs);
      }
      if (this.tSX != null) {
        paramVarArgs.e(4, this.tSX);
      }
      if (this.tSY != null) {
        paramVarArgs.e(5, this.tSY);
      }
      paramVarArgs.fk(6, this.jib);
      paramVarArgs.fk(7, this.tSN);
      paramVarArgs.d(8, 8, this.tSO);
      if (this.uqc != null) {
        paramVarArgs.e(9, this.uqc);
      }
      if (this.tSP != null) {
        paramVarArgs.e(10, this.tSP);
      }
      if (this.tSQ != null) {
        paramVarArgs.e(11, this.tSQ);
      }
      paramVarArgs.fk(12, this.tSW);
      paramVarArgs.fk(13, this.tOG);
      paramVarArgs.T(14, this.jhw);
      if (this.tSR != null) {
        paramVarArgs.e(15, this.tSR);
      }
      GMTrace.o(4027471364096L, 30007);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ID);
      }
      i = paramInt;
      if (this.tSB != null) {
        i = paramInt + b.a.a.a.fj(3, this.tSB.aYq());
      }
      paramInt = i;
      if (this.tSX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tSX);
      }
      i = paramInt;
      if (this.tSY != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tSY);
      }
      i = i + b.a.a.a.fh(6, this.jib) + b.a.a.a.fh(7, this.tSN) + b.a.a.a.c(8, 8, this.tSO);
      paramInt = i;
      if (this.uqc != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uqc);
      }
      i = paramInt;
      if (this.tSP != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.tSP);
      }
      paramInt = i;
      if (this.tSQ != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tSQ);
      }
      i = paramInt + b.a.a.a.fh(12, this.tSW) + b.a.a.a.fh(13, this.tOG) + b.a.a.a.S(14, this.jhw);
      paramInt = i;
      if (this.tSR != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tSR);
      }
      GMTrace.o(4027471364096L, 30007);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      GMTrace.o(4027471364096L, 30007);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ze localze = (ze)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4027471364096L, 30007);
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
          localze.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 2: 
        localze.ID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localze.tSB = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 4: 
        localze.tSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 5: 
        localze.tSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 6: 
        localze.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 7: 
        localze.tSN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localze.tSO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 9: 
        localze.uqc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 10: 
        localze.tSP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 11: 
        localze.tSQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 12: 
        localze.tSW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 13: 
        localze.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      case 14: 
        localze.jhw = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4027471364096L, 30007);
        return 0;
      }
      localze.tSR = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4027471364096L, 30007);
      return 0;
    }
    GMTrace.o(4027471364096L, 30007);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */