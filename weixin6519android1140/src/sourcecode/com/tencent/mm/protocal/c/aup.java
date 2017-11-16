package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aup
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public int jib;
  public String lPi;
  public String nFH;
  public int tOG;
  public int uJT;
  public LinkedList<akq> uJU;
  public int uJV;
  public String uJW;
  public String uJX;
  public int uJY;
  public String uJZ;
  public int uKa;
  public LinkedList<px> uKb;
  public String uhq;
  public String usG;
  
  public aup()
  {
    GMTrace.i(4020760477696L, 29957);
    this.uJU = new LinkedList();
    this.uKb = new LinkedList();
    GMTrace.o(4020760477696L, 29957);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4020894695424L, 29958);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uJT);
      paramVarArgs.d(2, 8, this.uJU);
      paramVarArgs.fk(3, this.jhc);
      paramVarArgs.fk(4, this.uJV);
      if (this.uhq != null) {
        paramVarArgs.e(5, this.uhq);
      }
      if (this.usG != null) {
        paramVarArgs.e(6, this.usG);
      }
      if (this.uJW != null) {
        paramVarArgs.e(7, this.uJW);
      }
      if (this.uJX != null) {
        paramVarArgs.e(8, this.uJX);
      }
      paramVarArgs.fk(9, this.jib);
      if (this.lPi != null) {
        paramVarArgs.e(10, this.lPi);
      }
      if (this.nFH != null) {
        paramVarArgs.e(11, this.nFH);
      }
      paramVarArgs.fk(12, this.uJY);
      paramVarArgs.fk(13, this.tOG);
      if (this.uJZ != null) {
        paramVarArgs.e(14, this.uJZ);
      }
      paramVarArgs.fk(15, this.uKa);
      paramVarArgs.d(16, 8, this.uKb);
      GMTrace.o(4020894695424L, 29958);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uJT) + 0 + b.a.a.a.c(2, 8, this.uJU) + b.a.a.a.fh(3, this.jhc) + b.a.a.a.fh(4, this.uJV);
      paramInt = i;
      if (this.uhq != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uhq);
      }
      i = paramInt;
      if (this.usG != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.usG);
      }
      paramInt = i;
      if (this.uJW != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uJW);
      }
      i = paramInt;
      if (this.uJX != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uJX);
      }
      i += b.a.a.a.fh(9, this.jib);
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.lPi);
      }
      i = paramInt;
      if (this.nFH != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.nFH);
      }
      i = i + b.a.a.a.fh(12, this.uJY) + b.a.a.a.fh(13, this.tOG);
      paramInt = i;
      if (this.uJZ != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.uJZ);
      }
      i = b.a.a.a.fh(15, this.uKa);
      int j = b.a.a.a.c(16, 8, this.uKb);
      GMTrace.o(4020894695424L, 29958);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uJU.clear();
      this.uKb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4020894695424L, 29958);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aup localaup = (aup)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4020894695424L, 29958);
        return -1;
      case 1: 
        localaup.uJT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new akq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((akq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaup.uJU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 3: 
        localaup.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 4: 
        localaup.uJV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 5: 
        localaup.uhq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 6: 
        localaup.usG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 7: 
        localaup.uJW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 8: 
        localaup.uJX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 9: 
        localaup.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 10: 
        localaup.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 11: 
        localaup.nFH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 12: 
        localaup.uJY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 13: 
        localaup.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 14: 
        localaup.uJZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      case 15: 
        localaup.uKa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4020894695424L, 29958);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new px();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((px)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaup.uKb.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4020894695424L, 29958);
      return 0;
    }
    GMTrace.o(4020894695424L, 29958);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */